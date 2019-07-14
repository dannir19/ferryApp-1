package pl.exercise.ferry.screen;

import java.util.Date;
import java.util.Scanner;

public class VoyageScreen implements Screen {

    public final Scanner in = new Scanner(System.in);


    @Override
    public int interact() {
        System.out.println("Utworzenie nowego rejsu:");
        System.out.println("1. Dodanie osoby do rejsu");
        System.out.println("2. Dodanie pojazdu do rejsu ");
        System.out.println("3. Data rejsu");
        System.out.println("4. Powrót do głownego menu");
        int typBiletu = in.nextInt();
        switch (typBiletu) {
            case 1: {
                addPasseger();
                break;
            }
            case 2: {
                addVecicle();
                break;
            }
            case 3: {
                addDate();
                break;
            }
            case 4:
                return 0;
        }

        return 0;
    }

    private Date addDate() {
        return null;
    }

    private Vehicle addVecicle() {
        return null;
    }

    private ScreenName addPasseger() {
        System.out.println("Podaj imię uczestnika rejsu:");
        String name = in.nextLine();
        System.out.println("Podaj nazwisko uczestnika rejsu:");
        String surname = in.nextLine();
        System.out.println("Podaj wiek uczestnika rejsu:");
        int age = in.nextInt();
        System.out.println("");
        return ScreenName.MainScreen;
    }
}
