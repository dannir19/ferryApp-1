package pl.exercise.ferry.screen;

import pl.exercise.ferry.ticket.VehicleTicket;

public class ScreenManager { // zarzadza na naszych wszystkich klasach

    private final MainScreen mainScreen = new MainScreen();
    private final TicketScreen ticketScreen = new TicketScreen();
    private final ExitScreen exitScreen = new ExitScreen();
    private final PersonScreen personScreen = new PersonScreen();

//    public ScreenManager(){};

    int chosenScreen; //stan ktory wybieramy

    public void manage() {
        chosenScreen = 0;
        while (true) {
            chosenScreen = chooseScreen(chosenScreen);
        }
    }

    private int chooseScreen(int chosenScreen) {

        if (chosenScreen == 0) {
            return mainScreen.interact();
        }
        if (chosenScreen == 1) {
            return ticketScreen.interact();
        }
        if (chosenScreen == 2) {
            return exitScreen.interact(); }

        if (chosenScreen == 5) {
                return personScreen.interact();
            }
            return mainScreen.interact();
        }
    }




//    private final TicketScreen ticketScreen = new TicketScreen();
//    private final MainScreen mainScreen = new MainScreen();
//
//    ScreenName chosenScreen;
//
//
//    public void manage(){
//        chosenScreen = ScreenName.MainScreen;
//        while(true) {
//            chosenScreen =  chooseScreen(chosenScreen);
//        }
//    }
//
//    private ScreenName chooseScreen(ScreenName choosenScreen) {
//        if (choosenScreen == ScreenName.MainScreen)
//            return mainScreen.interact();
//        if (choosenScreen == ScreenName.TicketScreen)
//            return ticketScreen.interact();
//        return ScreenName.MainScreen;
//    }
//}
