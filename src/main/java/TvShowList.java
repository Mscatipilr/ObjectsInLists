import java.util.ArrayList;
import java.util.Scanner;

public class TvShowList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<TvShow> shows = new ArrayList<TvShow>();
        while (true) {
            System.out.println("Name of the show: ");
            String name = in.nextLine();
            if (name.isEmpty()) {
                for (TvShow show : shows) {
                    System.out.println(show);
                }
                break;
            }
            System.out.println("How many episodes? ");
            int episodes = in.nextInt();
            in.nextLine(); //catch nextline character
            System.out.println("What is the genre? ");
            String genre = in.nextLine();
            shows.add(new TvShow(name, episodes, genre));
        }
    }
}
