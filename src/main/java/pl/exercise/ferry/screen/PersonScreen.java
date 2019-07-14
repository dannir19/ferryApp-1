package pl.exercise.ferry.screen;

import java.util.Scanner;

public class PersonScreen implements Screen {

    @Override
    public int interact() {
        Scanner personScanner = new Scanner(System.in);
        System.out.println("Podaj imie:");
        String name = personScanner.nextLine();
        System.out.println("Podaj nazwisko:");
        String surname = personScanner.nextLine();
        System.out.println("Podaj wiek:");
        personScanner.nextInt();
        int age = personScanner.nextInt();
        return 3 ;
    }
}
