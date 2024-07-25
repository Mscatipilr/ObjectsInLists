import java.util.ArrayList;
import java.util.Scanner;

public class BookList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<Book>();
        while (true) {
            System.out.println("Enter the title of the book: ");
            String title = in.nextLine();
            if (title.isEmpty()) {
                System.out.println("What is to be printed? (everything/title)");
                String toPrint = in.nextLine().toLowerCase();
                if (toPrint.equals("everything")){
                    for (Book book : books) {
                        System.out.println(book);

                    }
                } else if (toPrint.equals("title")){
                    for (Book book : books) {
                        System.out.println(book.getTitle());

                    }
                } else {
                    System.out.println("Invalid input");

                }
                break;
            }
            System.out.println("How many pages? ");
            int pages = in.nextInt();
            in.nextLine(); //catch new line char
            System.out.println("What year was it published? ");
            int year = in.nextInt();
            in.nextLine(); //catch new line char
            Book book = new Book(title, pages, year);
            books.add(book);
        }
    }
}
