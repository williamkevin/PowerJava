public class TheaterSeats {
    public static void main(String [] args) {
        int n = 0;

        int [][] seats = {
            {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 1, 1, 0}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                n += seats[i][j];
            }
        }
        
        
    }
}
