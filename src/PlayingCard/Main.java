package PlayingCard;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author me
 */
public class Main {
    // welcome method starts

    public static void welcome() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= 6; i++) {
            System.out.printf("%100s%8s", "*", "*");
            Thread.sleep(100);
            System.out.println();
        }

        System.out.printf("%101s", "W");
        Thread.sleep(100);
        System.out.print("e");
        Thread.sleep(100);
        System.out.print("l");
        Thread.sleep(100);
        System.out.print("c");
        Thread.sleep(100);
        System.out.print("o");
        Thread.sleep(100);
        System.out.print("m");
        Thread.sleep(100);
        System.out.print("e");
        Thread.sleep(100);
        System.out.println();
        Thread.sleep(1000);
        System.out.printf("%120s", "!====The Playing Card Game====!");
        System.out.println("\n\n\n\n\n");

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t     |********"
                + "\ti********i");
        Thread.sleep(500);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t     |        *" + "\t    |");
        Thread.sleep(500);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t     |        *" + "\t    |");
        Thread.sleep(500);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t     |********" + "\t    |");
        Thread.sleep(500);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t     |Clash" + "\t    |Card");

        System.out.printf("\n\n\n\n%30s%160s\n", "Presented to:",
                "Presented by:");
        System.out.printf("%30s%160s\n", "Mark Buchner", "META4");
        System.out.printf("%30s%160s\n", "PROFESSOR",
                "SYST17796-2nd semester");
        System.out.printf("%30s%160s\n", "Sheridan College",
                "Sheridan College");

        System.out
                .println("\n\n\t\t\t\t\"All rights are reserved for this java game.No part of this program can be copied or stored in any of retriveanble system. Copyright © 2022.\"");
        System.out.println("\n\n\nPress enter key to play the game.");

        String process3 = input.nextLine();
        System.out.print("Loading");
        for (int i = 0; i <= 3; i++) {
            System.out.print(".");
            Thread.sleep(1000);

        }
        System.out.println("\n\n\n");
    }
    // welcome method ends here

    // loading pattern method
    public static void loadingdots() throws InterruptedException {

        for (int i = 0; i <= 3; i++) {
            System.out.print(".");
            Thread.sleep(1000);

        }

        System.out.println("\n\n\n");
    }
    // loading pattern ends here

    //executional parts starts here
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Press enter key to start");
        String process8 = input.nextLine();
        // calling the method of welcome
        welcome();

        // loop for again play the game 
        for (int agian = 0; agian < 2;) {
            boolean nonAuto = false, semiAuto = false, fullAuto = false;
            System.out.print("\t\t\t\t\t\t\t\tPlease Select from given  menu:\n\n\t\t\t\t\t\t\t\tPress \"N \"for Non-automatic playing mode.\n\t\t\t\t\t\t\t\tPress \"S \"for Semi-automatic playing mode.\n\t\t\t\t\t\t\t\tPress \"F \" for Full automatic playing mode.");
            System.out.print("\n\n\t\t\t\t\t\t\t\t\tYour desired mode:");
            String mode = input.next();
            // point for loop for again play

            // game mode option
            if (mode.equalsIgnoreCase("N")) {
                nonAuto = true;
            } else if (mode.equalsIgnoreCase("S")) {
                semiAuto = true;
            } else if (mode.equalsIgnoreCase("F")) {
                fullAuto = true;
            } else {
                System.out.println("\n\n\n\t\t\t\t\t\t\t\tYou can only select from given menu........!\n\n\n\n\n");

                continue;
            }

            // object for the class
            deckOfcard deck = new deckOfcard();
            // call the shuffle
            deck.shuffle();
            // arrays declear
            Card[] you = new Card[52];
            Card[] sys = new Card[52];
            Card[] table = new Card[2];
            Card[] waste = new Card[52];
            String yourName = null;
            int countCardOfyou = 0;
            int countCardOfsys = 0;

            // for initialize the arrays with dummy value
            for (int i = 0; i < you.length; i++) {
                you[i] = new Card("Null", "Null", -11, -1);
            }
            for (int i = 0; i < sys.length; i++) {
                sys[i] = new Card("Null", "Null", -11, -1);
            }

            for (int i = 0; i < waste.length; i++) {
                waste[i] = new Card("Null", "Null", -11, -1);
            }
            for (int i = 0; i < table.length; i++) {
                table[i] = new Card("Null", "Null", -11, -1);
            }
            // initializing ends here 

            // giving cards to you  
            for (int i = 0; i <= 25; i++) {
                Card c = deck.dealCard();
                you[i] = c;
            }

            // giving card to you and sys
            for (int i = 0; i <= 25; i++) {

                Card c = deck.dealCard();
                sys[i] = c;
            }

            // mode checker
            if (nonAuto == true) {
                System.out.print("_________________________________\n");
                System.out.print("-> Enter your good name here: ");
                yourName = input.next();
            } else {
                System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t_________________________________________________________________________________");
                System.out.println("\t\t\t\t\t\t\tSystem Player [1]\t\t\tvs\t\t\tSystem Player [2]");
                System.out.print("\t\t\t\t\t\t\t_________________________________________________________________________________");

            }
            System.out.print("\n\nYour Game is now loading ");

            for (int i = 0; i <= 30; i++) {
                System.out.print(".");
                Thread.sleep(100);
            }

            Random r = new Random();
            // game starts form here
            System.out.println("\n\n!--------------------------------Game Starts----------------------------------!");
            int I = 0;// for loop alternative
            int O = 1;// for nextline
            int cardId = 111;// for get card ID, 111 is dummy 
            int totalThullaCardYou = 0;// for count how many thulla get you/ customer
            int totalThullaCardSys = 0;// for count how many thulla  get system player

            // for running the game again and again untill the anyone win
            for (int k = 1; k <= 2;)//an infinite loop 
            {

                countCardOfyou = 0;
                countCardOfsys = 0;

                // for count cards in table and waste array
                int tableCard = 0;
                int wasteCard = 0;

                // count the card in you/customers array
                for (int i = 0; i < you.length; i++) {
                    if (you[i].suit.equalsIgnoreCase("Null"))
       ; else {
                        countCardOfyou++;
                    }
                }

                // count the cards in the system Player array
                for (int i = 0; i < sys.length; i++) {
                    if (sys[i].suit.equalsIgnoreCase("Null"))
       ; else {
                        countCardOfsys++;
                    }
                }

                // count cards on the table
                for (int i = 0; i < table.length; i++) {
                    if (table[i].suit.equalsIgnoreCase("Null"))
       ; else {
                        tableCard++;
                    }
                }

                // count how many card are in the waste array
                for (int i = 0; i < waste.length; i++) {
                    if (waste[i].suit.equalsIgnoreCase("Null"))
       ; else {
                        wasteCard++;
                    }
                }

                //mode checker
                if (nonAuto == true) {
                    System.out.printf("\n%-50s", yourName);
                } else {
                    System.out.printf("\n%-50s", "System Player [1]");
                }

                // display of cards of you/ customer
                System.out.printf("\n%-50s", "-------------------");
                System.out.printf("\n%s (%d)", "Total Cards: ", countCardOfyou);
                System.out.printf("\n%-50s", "-------------------");

                for (int i = 0; i < 52; i++) {
                    if (you[i].suit.equalsIgnoreCase("Null")) {
                        continue;
                    } else {
                        System.out.printf("\n%-25s %41s", you[i], "");
                    }

                }

                //manage line spacing.......
                System.out.println();

                // display table cards
                System.out.printf("\n\n\n%38s (%d)", "Table cards", tableCard);
                System.out.printf("\n%43s", "-----------------");
                System.out.println();

                for (int i = 0; i < table.length; i++) {

                    if (table[i].suit.equalsIgnoreCase("Null"))
        ; else {
                        System.out.printf("%24s%-23s\n", "", table[i]);
                    }
                }
                //  display waste cards
                System.out.printf("\n\n\n%s (%d)", "Wasted cards", wasteCard);
                System.out.printf("\n%s", "----------------");
                System.out.println();
                for (int i = 0; i < waste.length; i++) {

                    if (waste[i].suit.equalsIgnoreCase("Null")) {
                        continue;
                    } else {
                        // for manage the blocks of cards
                        if (i <= 6) {
                            System.out.printf("%s\t", waste[i]);
                            if (i == 6) {
                                System.out.println("");
                            }
                        } else if (i <= 13) {
                            System.out.printf("%s\t", waste[i]);
                            if (i == 13) {
                                System.out.println("");
                            }

                        } else if (i <= 20) {
                            System.out.printf("%s\t", waste[i]);
                            if (i == 20) {
                                System.out.println("");
                            }
                        } else if (i <= 27) {
                            System.out.printf("%s\t", waste[i]);
                            if (i == 27) {
                                System.out.println("");
                            }
                        } else if (i <= 34) {
                            System.out.printf("%s\t", waste[i]);
                            if (i == 34) {
                                System.out.println("");
                            }
                        } else if (i <= 41) {
                            System.out.printf("%s\t", waste[i]);
                            if (i == 41) {
                                System.out.println("");
                            }
                        } else if (i <= 48) {
                            System.out.printf("%s\t", waste[i]);
                            if (i == 48) {
                                System.out.println("");
                            }
                        } else if (i <= 55) {
                            System.out.printf("%s\t", waste[i]);
                            if (i == 55) {
                                System.out.println("");
                            }
                        }
                    }
                }

                // for non-auto mode
                if (nonAuto == true) {

                    System.out.println("\n\n______________________________________\n");
                    System.out.print("Please enter the Card Id here: ");
                    cardId = input.nextInt();
                } // logic for auto (semi and full) players
                else if (semiAuto == true) {
                    if (O < 2) // if for stop at first turn and after that It will not be executed
                    {
                        String process7 = input.nextLine();
                        O++;
                    }
                    System.out.println("\n\n______________________________________\n");
                    System.out.println("System Player [1] wait for your enter.");
                    String process = input.nextLine();

                    //artificial intelligence
                    for (int j = 0; j < you.length; j++) {
                        int rNo = r.nextInt(52);
                        if (you[rNo].suit.equalsIgnoreCase("Null")) {
                            continue;
                        } else {
                            // logic for auto throwing card
                            table[0] = you[rNo];
                            you[rNo] = new Card("Null", "Null", -11, -1);
                            break;
                        }
                    }
                } // logic for full auto
                else if (fullAuto == true) {
                    System.out.println("\n\n______________________________________\n");
                    System.out.print("System Player [1] analysis");
                    loadingdots();
                    for (int j = 0; j < you.length; j++) {

                        //artificial intelligence
                        int rNo = r.nextInt(52);
                        if (you[rNo].suit.equalsIgnoreCase("Null")) {
                            continue;
                        } else {
                            table[0] = you[rNo];
                            you[rNo] = new Card("Null", "Null", -11, -1);
                            break;
                        }
                    }
                }
                if (nonAuto == true) {
                    // for check weather the enter ID is valid or not
                    for (int j = 0; j < you.length; j++) {
                        if (cardId == you[j].cardId) {
                            table[0] = you[j];
                            you[j] = new Card("Null", "Null", -11, -1);
                            break;
                        }
                    }
                }
                // for manage if the same suit is not find
                boolean notMatchFind = true;

                // logic if same suit is find   
                //artificial intelligence
                for (int j1 = 0; j1 < sys.length; j1++) {
                    if (sys[j1].suit.equalsIgnoreCase(table[0].suit)) {
                        table[1] = sys[j1];
                        sys[j1] = new Card("Null", "Null", -11, -1);
                        notMatchFind = false;
                        break;
                    }
                }

                // logic if suits are not find then program decide intelligent
                if (notMatchFind == true) {

                    //artificial intelligence
                    for (int j1 = 0; j1 < sys.length; j1++) {
                        if (sys[j1].suit.equalsIgnoreCase("Null"))
         ; else {
                            table[1] = sys[j1];
                            sys[j1] = new Card("Null", "Null", -11, -1);
                            break;
                        }
                    }
                }

                // again table cards count
                for (int i = 0; i < table.length; i++) {
                    if (table[i].suit.equalsIgnoreCase("Null"))
        ; else {
                        tableCard++;
                    }
                }
                // mode checker
                if (nonAuto == true) {
                    System.out.printf("\n\n\n%s", "System player ");
                } else {
                    System.out.printf("\n\n\n%s", "System player [2] ");
                }
                // display of system player cards
                System.out.printf("\n%s", "-------------------");
                // -1 for balance the figures...in the iteration card is thrown later but count fist thats why this logic is applied.
                System.out.printf("\n%s (%d)", "Total Cards: ", (countCardOfsys - 1));
                System.out.printf("\n%s", "-------------------");

                for (int i = 0; i < sys.length; i++) {
                    if (sys[i].suit.equalsIgnoreCase("Null")) {
                        continue;
                    } else {
                        if (nonAuto == true) {
                            System.out.printf("\n%s", "*****************");
                        } else {
                            System.out.printf("\n%s", sys[i]);
                        }
                    }

                }
                // for manage the line spacing
                System.out.println();

                // again display the table cards
                System.out.printf("\n\n\n%38s (%d)", "Table cards", tableCard);
                System.out.printf("\n%43s", "-----------------");
                System.out.println();
                for (int i = 0; i < table.length; i++) {

                    if (table[i].suit.equalsIgnoreCase("Null"))
       ; else {
                        System.out.printf("%24s%-23s\n", "", table[i]);
                    }
                }

                System.out.printf("\n\n\n%s (%d)", "Wasted cards", wasteCard);
                System.out.printf("\n%s", "----------------");
                System.out.println();
                for (int i = 0; i < waste.length; i++) {

                    if (waste[i].suit.equalsIgnoreCase("Null")) {
                        continue;
                    } else {
                        if (i <= 6) {
                            System.out.printf("%s\t", waste[i]);
                            if (i == 6) {
                                System.out.println("");
                            }
                        } else if (i <= 13) {
                            System.out.printf("%s\t", waste[i]);
                            if (i == 13) {
                                System.out.println("");
                            }

                        } else if (i <= 20) {
                            System.out.printf("%s\t", waste[i]);
                            if (i == 20) {
                                System.out.println("");
                            }
                        } else if (i <= 27) {
                            System.out.printf("%s\t", waste[i]);
                            if (i == 27) {
                                System.out.println("");
                            }
                        } else if (i <= 34) {
                            System.out.printf("%s\t", waste[i]);
                            if (i == 34) {
                                System.out.println("");
                            }
                        } else if (i <= 41) {
                            System.out.printf("%s\t", waste[i]);
                            if (i == 41) {
                                System.out.println("");
                            }
                        } else if (i <= 48) {
                            System.out.printf("%s\t", waste[i]);
                            if (i == 48) {
                                System.out.println("");
                            }
                        } else if (i <= 55) {
                            System.out.printf("%s\t", waste[i]);
                            if (i == 55) {
                                System.out.println("");
                            }
                        }
                    }
                }

                System.out.println("\n");
                // if there is no thulla
                if (table[0].suit.equalsIgnoreCase(table[1].suit) || table[0].face.equalsIgnoreCase(table[1].face)) {
                    System.out.println("\n\n______________________________________\n");
                    System.out.print("Cards cancel");
                    loadingdots();

                    // cards are going to waste from table
                    //*
                    if (table[0].suit.equalsIgnoreCase("Null"))
        ; else {
                        waste[I] = table[0];
                    }
                    waste[I + 1] = table[1];

                    I = I + 2;; // for manage waste array ,loop_alternative
                } else {

                    //if there is thulla 
                    if (table[0].cardValue > table[1].cardValue) {  //logic is thulla goes to you/customer
                        if (nonAuto == true) // mode checker
                        {
                            System.out.println("\n\n______________________________________\n");
                            System.out.print("Thulla goes to " + yourName + "\n");
                            System.out.print("Cards transfer to " + yourName);
                            loadingdots();
                        } else {
                            //mode checker
                            System.out.println("\n\n______________________________________\n");
                            System.out.print("Thulla goes to System Player [1]\n");
                            System.out.print("Cards transfer to System Player[1]");
                            loadingdots();
                        }
                        // for count how many thulla goes to you/customer
                        totalThullaCardYou++;
                        for (int j = 0; j < you.length; j++) {
                            if (you[j].suit.equalsIgnoreCase("Null") && you[j + 1].suit.equalsIgnoreCase("Null")) {
                                //for store thulla cards in the you array
                                you[j] = table[0];
                                you[j + 1] = table[1];

                                break;
                            }
                        }
                    } else if (table[0].cardValue < table[1].cardValue) {
                        // if thulla goes to system player
                        if (nonAuto == true) {
                            // mode checker
                            System.out.println("\n\n______________________________________\n");
                            System.out.print("Thulla goes to System player\n");
                            System.out.print("Cards transfer to system Player");
                            loadingdots();
                        } else {
                            System.out.println("\n\n______________________________________\n");
                            System.out.print("Thulla goes to System player[2]\n");
                            System.out.print("Cards transfer to system Player[2]");
                            loadingdots();
                        }

                        // thullas counts for system player
                        totalThullaCardSys++;
                        for (int j = 0; j < sys.length; j++) {
                            if (sys[j].suit.equalsIgnoreCase("Null") && sys[j + 1].suit.equalsIgnoreCase("Null")) {
                                sys[j] = table[0];
                                sys[j + 1] = table[1];
                                break;
                            }
                        }
                    }
                }// of main else if

                // for do empty the table
                table[0] = new Card("Null", "Null", -11, -1);
                table[1] = new Card("Null", "Null", -11, -1);

                // for check the winer
                int youWin = 0;
                int sysWin = 0;

                // count the total  number of empty space in the array
                for (int j = 0; j < 52; j++) {
                    if (you[j].suit.equalsIgnoreCase("Null")) {
                        youWin++;
                    }
                    if (sys[j].suit.equalsIgnoreCase("Null")) {
                        sysWin++;
                    }
                }
                //check who has empty array first
                if (youWin == 52) {
                    //if you/customer wins
                    if (nonAuto == true) {// mode checker
                        System.out.println("\n\n" + yourName + " wins the game......!\n\n");
                        System.out.println("!......Game Summery........!");
                        System.out.println("____________________________\n");
                        System.out.printf("%s%11d\n", "Total number of thulla gose to you: ", totalThullaCardYou);
                        System.out.printf("%s%1d\n", "Total number of thulla gose to System player: ", totalThullaCardSys);
                        System.out.printf("%s%22d\n", "Remaining Card of you is:", countCardOfyou - 1);
                        System.out.printf("%s%12d\n\n", "Remaining Card of System player is:", countCardOfsys - 1);
                        System.out.println("-----------------------------------------------------------------------------------");

                    } else //else for mode checking
                    {
                        System.out.println("\n\nSystem Player [1] wins the game......!\n\n");
                        System.out.println("!......Game Summery........!");
                        System.out.println("____________________________\n");
                        System.out.printf("%s%-18d\n", "Total number of thulla gose to System Player[1]: ", totalThullaCardYou);
                        System.out.printf("%s%-8d\n", "Total number of thulla gose to System player[2]: ", totalThullaCardSys);
                        System.out.printf("%s%14d\n", "Remaining Card of System Player[1]: ", countCardOfyou - 1);
                        System.out.printf("%s%14d\n\n", "Remaining Card of System player[2]: ", countCardOfsys - 1);
                        System.out.println("-----------------------------------------------------------------------------------");
                    }

                    break;// game stop if you win
                } else if (sysWin == 52) {
                    // if system player wins
                    if (nonAuto == true) {
                        // mode checker
                        System.out.println("\n\n" + "System Player wins the game....!\n\n");
                        System.out.println("!......Game Summery........!");
                        System.out.println("____________________________\n");
                        System.out.printf("%s%11d\n", "Total number of thulla gose to you: ", totalThullaCardYou);
                        System.out.printf("%s%1d\n", "Total number of thulla gose to System player: ", totalThullaCardSys);
                        System.out.printf("%s%25d\n", "Remaining Card of you:", countCardOfyou - 1);
                        System.out.printf("%s%15d\n\n", "Remaining Card of System player:", countCardOfsys - 1);
                        System.out.println("-----------------------------------------------------------------------------------");

                    } else {
                        System.out.println("\n\n" + "System Player[2] wins the game....!\n\n");
                        System.out.println("!......Game Summery........!");
                        System.out.println("____________________________\n");
                        System.out.printf("%s%-18d\n", "Total number of thulla gose to System Player[1]: ", totalThullaCardYou);
                        System.out.printf("%s%-8d\n", "Total number of thulla gose to System player[2]: ", totalThullaCardSys);
                        System.out.printf("%s%14d\n", "Remaining Card of System Player[1]: ", countCardOfyou - 1);
                        System.out.printf("%s%14d\n\n", "Remaining Card of System player[2]: ", countCardOfsys - 1);
                        System.out.println("-----------------------------------------------------------------------------------");
                    }
                    break;// game stop if system wins
                }

            }// main loop for running the game

            // again play option
            System.out.print("Do you want to play again (Y/N):");
            String againPlay = input.next();
            if (againPlay.equalsIgnoreCase("Y")) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");// spacing for new game
                continue;
            } else {
                break;
            }
        }
        // input close here
        input.close();
        System.out.println("\n\n\t\tThank you...........!");
    }// main functions ends here

}
