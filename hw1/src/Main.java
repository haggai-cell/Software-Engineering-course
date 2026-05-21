import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner; // Note: Do not change this line.

    public static void manageMovies()
    {
        System.out.println("Welcome to the Movies Management System!.");
        System.out.println("1. Display all movies ");
        System.out.println("2. Display movie rating ");
        System.out.println("3. Find the best director");
        System.out.println("4. Exit");
        System.out.println("Please enter your choice:");
        String choice = Input;
    }

    // function 1
    public static void AddnewMovies()
    {

    }

    // function 2
    public static void  DisplayAllMovies()
    {

    }

    // function 3
    public static void DisplayMovieRating()
    {

    }

    // function 4
    public static void FindTheBestDirector()

    {

    }

    // function 5
    public static void

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\hagay\\Downloads\\HW1\\HW1_input.txt";

        scanner = new Scanner(new File(path));
        int numberOfTests = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numberOfTests; i++) {
            System.out.println("Test number " + i + " starts.");
            try {
                manageMovies();
            } catch(Exception e){
                System.out.println("Exception " + e);
            }
            System.out.println("Test number " + i + " ended.");
            System.out.println("-----------------------------------------------");
        }
        System.out.println("All tests have ended.");
    }
}