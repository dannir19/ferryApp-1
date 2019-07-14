package pl.exercise.ferry.screen;

import java.util.Scanner;

public class TicketScreen implements Screen {

    private final Scanner in = new Scanner(System.in);

    public int ticket() {
        System.out.println(" Wybierz typ biletu:");
        System.out.println(" 1. Dla osoby");
        System.out.println(" 2. Opłata za transport");
        System.out.println(" 3. Opłata za bagaż");
        System.out.println(" 4. Powrót do głównego menu ");
        int typBiletu = in.nextInt();
        switch (typBiletu) {
            case 1: {
                personTicket();
                break; }
            case 2: {
                System.out.println("Do opłaty" + transportTicket() + " PLN");
                break; }
            case 3: {
                System.out.println("Do opłaty" + baggageTicket() + "PLN");
                break; }
            case 4:
                return 0;
        }
        return 1;
    }

    @Override
    public int interact() { // ScreenName
        ticket();
        int age = in.nextInt();
        int cena = chooseTicket(age);
        return 1; //ScreenName.mainscreen
    }
    private int personTicket() {
        System.out.println("Ile Masz lat?");
        int age = in.nextInt();
        int cena = chooseTicket(age);
        System.out.println("Cena biletu wynosi: " + cena + " PLN");
        return 1;
    }

    private double baggageTicket() {
        System.out.println("Podaj wagę bagażu");
        double baggage = in.nextDouble();
        double baggagePrice =  baggage * 2 ;
        return baggagePrice;
    }

    private int transportTicket() {

        System.out.println("Wybierz typ transportu");
        System.out.println("1. Osobowy");
        System.out.println("2. Motor");
        System.out.println("3. Ciężarówka");
        System.out.println("4. Autobus");

        int typeTransport = in.nextInt();
        switch(typeTransport) {
            case 1:
                return 20;
            case 2:
                return 10;
            case 3: {
                System.out.println("Podaj ilość ton");
                int amountTons = in.nextInt();
                return amountTons*10; }
            case 4: {
                System.out.println("Podaj długość autobusu");
                int lengthOfBus = in.nextInt();
                return lengthOfBus*10; }

        }
        return 0;
    }

    private int chooseTicket(int age) {
        int przedzial = obliczxPrzedzial(age);
        switch (przedzial) {
            case 4:
                System.out.println("Cena biletu wynosi 0 pln, płyniesz za darmo");
                return 0;
            case 5:
                System.out.println("Cena biletu wynosi 10 pln");
                return 10;
            case 6:
                System.out.println("Cena biletu wynosi 25 pln");
                return 25;
            case 7:
                System.out.println("Cena biletu wynosi 15 pln");
                return 15;
        }
        return przedzial;
    }
    private int obliczxPrzedzial(int age) {
        if (age < 3) {
            return 4;
        }
        if (age > 3 && age < 18) {
            return 5;
        }
        if (age > 18 && age < 70) {
            return 6;
        }
        if (age > 70) {
            return 7;
        }
        return age;
    }

}
