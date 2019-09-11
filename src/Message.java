/*
    David Persson
    2019-09-11
    Message hanterings system
 */

public class Message {
    public static void main(String[] args) {
        String author;
        String message;
        Date createdAt;
        Date updatedAt;


        if  (args.length == 0) //Om inga argument anges så printar programmet bara menyn
            System.out.println(" Show message 1 \n" +
                    " Add message 2 \n" +
                    " Update message 3 \n" +
                    " Save message to file 4 \n" +
                    " Upload message from file 5 \n" +
                    " Exit 6");
        for (int i = 0 ; i < args.length ; i++)
            if (args.length == 1) { //Om argument 1 anges
                System.out.println(" Existing messages ");
        }
        if (args.length == 2) { //Om argument 2 anges
            System.out.println(" Add message ");
        }
        if (args.length == 3) { //Om argument 3 anges
            System.out.println(" Update message ");
        }
        if (args.length == 4) { //Om argument 4 anges
            System.out.println(" Save message as file ");
        }
        if (args.length == 5) { //Om argument 5 anges
            System.out.println(" Open message as file ");
        }
        if (args.length == 6) { //Om argument 6 anges
            System.out.println(" Exiting ");
        }

    }
}
