class Movie {
    private String title, director;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public String getTitle() { return title; }

    public String getDirector() { return director; }
}

public class MovieArrayTest {
    public static void main(String [] args) {
        Movie [] arr = new Movie[2];

        arr[0] = new Movie("a", "n");
        arr[1] = new Movie("s", "w");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getTitle());
            System.out.println(arr[i].getDirector());
        }
    }
}
