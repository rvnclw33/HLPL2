package library;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Member implements Comparable<Member> {
    private final String name;
    private final String memberId;
    private int booksBorrowed;

    public Member(String name, String memberId, int booksBorrowed) {
        this.name = name;
        this.memberId = memberId;
        this.booksBorrowed = booksBorrowed;
    }

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.booksBorrowed = 0;
    }

    public Member(String line) {
        String[] tokens = line.split(";");
        name = tokens[0];
        memberId = tokens[1];
        booksBorrowed = Integer.parseInt(tokens[2]);
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public int getBooksBorrowed() {
        return booksBorrowed;
    }

    public void setBooksBorrowed(int booksBorrowed) {
        this.booksBorrowed = booksBorrowed;
    }

    @Override
    public String toString() {
        return name + ";" +  memberId + ";" + booksBorrowed;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass()) return false;

        // casting type (Member) to o
        Member member = (Member) o;
        return Objects.equals(name, member.name) && Objects.equals(memberId, member.memberId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, memberId);
    }

    @Override
    // compare to what? Member o
    public int compareTo(Member o) {
        if ( this.booksBorrowed != o.booksBorrowed) {
            return -Integer.compare(this.booksBorrowed, o.booksBorrowed);
        }

        if (!Objects.equals(this.name, o.name)) {
            return this.name.compareTo(o.name);
        }

        return this.memberId.compareTo(o.memberId);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //give the size of array to the Member[]
        Member[] members = new Member[125];
        int length = 0;
        while(true) {
            String line = scanner.nextLine();
            if (Objects.equals(line, "END")) break;

            // this is like saying, now I now have the line, let's add it to the members at index [...]
            members[length] = new Member(line);
            length++;
        }

        Arrays.sort(members, 0, length);

        for (int i = 0; i < length; i++) {
            System.out.println(members[i]);
        }
    }
}
