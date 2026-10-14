import java.util.Scanner;

static String player1move;
static String player2move;

public class Game {
    public static void main() {
        Scanner scan = new Scanner(System.in);

        Boolean donePlaying = false;
        Boolean moveP1 = false;
        Boolean moveP2 = false;
        Boolean testing = false;

        //do whiles of if want to play more, if tie. Would be easier with functions instead of nesting
        do {
            Game.players();
            if (player1move.equalsIgnoreCase(player2move)) {
                System.out.println("Tie. Try Again.");
                Game.players();
            } else if (player1move.equalsIgnoreCase("R")) {
                if (player2move.equalsIgnoreCase("P")) {
                    System.out.println("Player 2 wins with paper");
                    do {
                        System.out.println("Contuie Playing?");
                        if (scan.hasNextBoolean()) {
                            donePlaying = scan.nextBoolean();
                            testing = true;
                        } else {
                            System.out.println("Try again. enter true or false");
                            scan.nextLine();
                        }
                    } while (!testing);
                } else {
                    System.out.println("Player 1 wins with rock");
                    do {
                        System.out.println("Contuie Playing?");
                        if (scan.hasNextBoolean()) {
                            donePlaying = scan.nextBoolean();
                            testing = true;
                        } else {
                            System.out.println("Try again. enter true or false");
                            scan.nextLine();
                        }
                    } while (!testing);
                }
            } else if (player1move.equalsIgnoreCase("P")) {
                if (player2move.equalsIgnoreCase("S")) {
                    System.out.println("player 2 wins with scizzors");
                    do {
                        System.out.println("Contuie Playing?");
                        if (scan.hasNextBoolean()) {
                            donePlaying = scan.nextBoolean();
                            testing = true;
                        } else {
                            System.out.println("Try again. enter true or false");
                            scan.nextLine();
                        }
                    } while (!testing);
                } else {
                    System.out.println("Player 1 wins with paper!");
                    do {
                        System.out.println("Contuie Playing?");
                        if (scan.hasNextBoolean()) {
                            donePlaying = scan.nextBoolean();
                            testing = true;
                        } else {
                            System.out.println("Try again. enter true or false");
                            scan.nextLine();
                        }
                    } while (!testing);
                }
            } else {
                if (player2move.equalsIgnoreCase("R")) {
                    System.out.println("player 2 wins with rock");
                    do {
                        System.out.println("Contuie Playing?");
                        if (scan.hasNextBoolean()) {
                            donePlaying = scan.nextBoolean();
                            testing = true;
                        } else {
                            System.out.println("Try again. enter true or false");
                            scan.nextLine();
                        }
                    } while (!testing);
                } else {
                    System.out.println("Player 1 wins with scissors");
                    do {
                        System.out.println("Contuie Playing?");
                        if (scan.hasNextBoolean()) {
                            donePlaying = scan.nextBoolean();
                            testing = true;
                        } else {
                            System.out.println("Try again. enter true or false");
                            scan.nextLine();
                        }
                    } while (!testing);
                }
            }
        } while (!donePlaying);
    }


    /*
do{
    System.out.println("Contuie Playing?");
    if(scan.hasNextBoolean()){
        donePlaying=scan.nextBoolean();
        testing=true;
    }else{
        System.out.println("Try again. enter true or false");
        scan.nextLine();
    }
}while(!testing);*/

    public static void players() {
        Scanner scan = new Scanner(System.in);

        Boolean done = false;
        Boolean moveP1 = false;

        do {
            System.out.println("Player one enter r(rock), p(paper), s(scissors)");
            do {

                if (player1move.equalsIgnoreCase("R")) {
                    moveP1 = true;
                    done = true;
                    player1move = scan.nextLine();
                } else if (player1move.equalsIgnoreCase("P")) {
                    moveP1 = true;
                    done = true;
                    player1move = scan.nextLine();
                } else if (player1move.equalsIgnoreCase("S")) {
                    moveP1 = true;
                    done = true;
                    player1move = scan.nextLine();
                } else {
                    System.out.println("Invaild. Please enter R,P,S player 1");
                }
            } while (!moveP1);
            //                System.out.println("Player one enter r(rock), p(paper), s(scissors)");
        } while (!done);

        Boolean doneHere = false;
        Boolean moveP2 = false;
        //player 2's
        do {
            System.out.println("Player two enter r(rock), p(paper), s(scissors)");
            do {
                if (player2move.equalsIgnoreCase("R")) {
                    moveP2 = true;
                    doneHere = true;
                    player2move = scan.nextLine();
                } else if (player2move.equalsIgnoreCase("P")) {
                    moveP2 = true;
                    doneHere = true;
                    player2move = scan.nextLine();
                } else if (player2move.equalsIgnoreCase("S")) {
                    moveP2 = true;
                    doneHere = true;
                    player2move = scan.nextLine();
                } else {
                    System.out.println("Invaild. Please enter R,P,S player 2");
                }
            } while (!moveP2);
            //                System.out.println("Player one enter r(rock), p(paper), s(scissors)");
        } while (!doneHere);
    }
}

void main() {
}
