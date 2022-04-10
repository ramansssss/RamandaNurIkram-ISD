import java.util.ArrayList;
import java.util.Collections;
public class Sorting {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie(8.1,"Insidious",2011));
        list.add(new Movie(8.3,"The conjuring",2013));
        list.add(new Movie(8.3,"Five feet apart",2019));
        list.add(new Movie(8.2,"Titanic",1997));
        list.add(new Movie(8.4,"The art of racing in the rain",2018));
        System.out.println("Movies before sorting : ");
        for (Movie movie: list)
        {
            System.out.println(movie.getName() + "-" +
                    movie.getRating() + "-" +
                    movie.getYear());
        }
        Collections.sort(list);
        System.out.println("\nMovies after sorting : ");
        for (Movie movie: list)
        {
            System.out.println(movie.getName() + "-" +
                    movie.getRating() + "-" +
                    movie.getYear());
        }
    }
}

