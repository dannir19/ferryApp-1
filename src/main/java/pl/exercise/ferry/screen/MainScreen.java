package pl.exercise.ferry.screen;

import java.util.Scanner;

public class MainScreen implements Screen {

  private final Scanner in = new Scanner(System.in);
  private final TicketScreen ticketScreen = new TicketScreen();

  public int interact() {// ScreenName to wtedy ENUM
    System.out.println("Witaj w systemie zakupu biletów promowych");
    System.out.println("1. Chcę kupić bilet");
    System.out.println("2. Odczyt zapisanych danych rejsu");
    String s = in.nextLine();                    // int s = nextInt();
    if (s.equalsIgnoreCase("TAK")) { //s==1
      return 1;  // return ScreenName.ticketscreen;
    }
    return 0; // return ScreenName.exit;
  }
}
//    int answerUser = in.nextInt();
//    if (answerUser == 1) {
//      return ScreenName.TicketScreen;
//    }
//    return ScreenName.MainScreen;
//  }
//
//      }
//
//      public int interact();
//return 0;




