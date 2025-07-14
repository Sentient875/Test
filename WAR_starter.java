import java.util.Random;

public class WAR_starter {
    public static void main(String[] args){

        // Generation of 2 random cards (1-52)
        Random rand = new Random();
        int computerCARD = rand.nextInt(52);
        int userCARD = rand.nextInt(52); 
        if(computerCARD == 0){
            computerCARD += 1;
        }
        if(userCARD == 0){
            userCARD += 1;
        }

        //YOUR CODE GOES HERE
        char suitComp = '.';
        if(computerCARD <= 13){
            suitComp = 'C';
        } else if(computerCARD <=26){
            suitComp = 'D';
        } else if(computerCARD <=39){
            suitComp = 'H';
        } else if(computerCARD <=52){
            suitComp = 'S';
        }
        //System.out.println(suitComp);
        //System.out.println(computerCARD);

         char suitUser = '.';
        if(userCARD <= 13){
            suitUser = 'C';
        } else if(userCARD <=26){
            suitUser = 'D';
        } else if(userCARD <=39){
            suitUser = 'H';
        } else if(userCARD <=52){
            suitUser = 'S';
        }
        //System.out.println(suitUser);
        //System.out.println(userCARD);
        
        int ValueUser = 0;
        if(userCARD <= 13){
            ValueUser = userCARD;
        } else if(userCARD <= 26){
            ValueUser = userCARD-13;
        } else if(userCARD <= 39){
            ValueUser = userCARD-26;
        } else if(userCARD <= 52){
            ValueUser = userCARD-39;
        }
        //System.out.println(ValueUser);
        
        int Valuecomputer = 0;
        if(computerCARD <= 13){
            Valuecomputer = computerCARD;
        } else if(computerCARD <= 26){
            Valuecomputer = computerCARD-13;
        } else if(computerCARD <= 39){
            Valuecomputer = computerCARD-26;
        } else if(computerCARD <= 52){
            Valuecomputer = computerCARD-39;
        }
        //System.out.println(Valuecomputer);

        String userCardFinal = Character.toString(suitUser) + Integer.toString(ValueUser);
        System.out.println(userCardFinal);

        String userComputerFinal = Character.toString(suitComp) + Integer.toString(Valuecomputer);
        System.out.println(userComputerFinal);

        //

        //Final send of 2 cards value (suit + value) to be outputted as ASCII cards
        printAsciiEval(userComputerFinal, userCardFinal);

        if(computerCARD > userCARD){
            System.out.println("COMPUTER WON");
        } else if(userCARD > computerCARD){
            System.out.println("USER WON");
        }

    }
    public static void printAsciiEval(String computerCard, String userCard) {

        if(computerCard.length() == 2){
            printAscii_2Char_card(computerCard);
        }else {
            printAscii_3Char_card(computerCard);
        }

        System.out.println("------------");
        System.out.println("--COMPUTER--");
        System.out.println("------------");
        System.out.println("-----VS-----");
        System.out.println("------------");
        System.out.println("----USER----");
        System.out.println("------------");

        if(userCard.length() == 2){
            printAscii_2Char_card(userCard);
        }else {
            printAscii_3Char_card(userCard);
        }
    }

    public static void printAscii_2Char_card(String card){
        // Top of the computer card
        System.out.println("┌─────────┐");
        // Upper part of the card with the character
        System.out.println("│" + card + "       │"); // top-left corner of the card
        System.out.println("│         │");
        System.out.println("│         │");
        System.out.println("│    " + card + "   │"); // middle of the card
        System.out.println("│         │");
        System.out.println("│         │");
        // Bottom part of the card with the character mirrored
        System.out.println("│       " + card + "│"); // bottom-right corner of the card
        // Bottom of the card
        System.out.println("└─────────┘");
    }

    public static void printAscii_3Char_card(String card){
        // Top of the computer card
        System.out.println("┌──────────┐");
        // Upper part of the card with the character
        System.out.println("│" + card + "       │"); // top-left corner of the card
        System.out.println("│          │");
        System.out.println("│          │");
        System.out.println("│    " + card + "   │"); // middle of the card
        System.out.println("│          │");
        System.out.println("│          │");
        // Bottom part of the card with the character mirrored
        System.out.println("│       " + card + "│"); // bottom-right corner of the card
        // Bottom of the card
        System.out.println("└──────────┘");
    }
}
