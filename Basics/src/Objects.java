import Classes.AudioBook;
import Classes.Book;
import Classes.EBook;
import Classes.User;

import java.time.LocalDate;

public class Objects {
    public static void main(String[] args) {

        User userA = new User();
        userA.setName("Adan");
        userA.setBirthDay(LocalDate.parse("2000-01-01"));

        System.out.println(userA);
        System.out.println(userA.getName() + " - " + userA.getBirthDay());
        System.out.println(userA.age());

        User userB = new User("Lili", "2006-06-06");
        System.out.println(userB.getName() + " - " + userB.getBirthDay());

        Book bookA = new Book("Bible", "Gutenberg", 1370);
        userB.borrow(bookA);
        System.out.println(userB.books);

        AudioBook bookB = new AudioBook("Dracula", "B. Stroker", 0, 6000);
        System.out.println(bookB);

        EBook bookC = new EBook("Game of Thrones", "G.R.R. Martin", 700, "PDF");
        System.out.println(bookC);
    }
}