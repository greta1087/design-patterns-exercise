package santaworkshop;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        boolean check;

        SantaClaus santaClaus = SantaClaus.getInstance();

        Toys toys = new Toys();
        Command deliverDoll = new DeliverDollCommand(toys);
        Command deliverBicycle = new DeliverBicycleCommand(toys);

        do {

            System.out.print("Santa needs: ");
            String magicWords = sc.nextLine();

            if (magicWords.equals("dolls")) {
                santaClaus.setCommand(deliverDoll);
                santaClaus.chooseToy();
                break;
            } else if (magicWords.equals("bicycles")) {
                santaClaus.setCommand(deliverBicycle);
                santaClaus.chooseToy();
                break;
            } else {
                System.out.println("Write \"dolls\" or \"bicycles\".");
            }

            check = !(magicWords.equals("dolls")) || !(magicWords.equals("bicycles"));

        } while (check);

    }
}
