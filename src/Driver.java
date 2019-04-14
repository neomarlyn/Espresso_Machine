import java.util.Scanner;
public class Driver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String in;
        Boolean again = true;
        int menuChoice = 0;
        double maxCapacity = 0.0;
        double currentLevel = 0.0;

        do {
            System.out.print("Enter the max capacity (in ounces): ");
            in = input.nextLine();
            try {
                maxCapacity = Double.parseDouble(in);
            } catch (Exception e) {
                maxCapacity = 0.0;
            }
        } while (maxCapacity <= 0.0);

        do {
            System.out.print("Enter grounds current level (in ounces): ");
            in = input.nextLine();
            try {
                currentLevel = Double.parseDouble(in);
            } catch (Exception e) {
                currentLevel = 0.0;
            }
        } while (currentLevel <= 0.0);

        EspressoMachine es = new EspressoMachine(maxCapacity, currentLevel);

        do {
            System.out.println(es.toString());

            do {
                System.out.print("Enter option (1) Order cup (2) Add grounds (3) Quit: ");
                in = input.nextLine();
                try {
                    menuChoice = Integer.parseInt(in);
                } catch (Exception e) {
                    menuChoice = 0;
                }
            } while (menuChoice < 1 || menuChoice > 3);

            if (menuChoice == 1){
                System.out.println(es.orderCupOfEspresso());
            }else if (menuChoice == 2){
                do {
                    System.out.print("Enter the # of ounces to add: ");
                    in = input.nextLine();
                    try {
                        currentLevel = Double.parseDouble(in);
                    } catch (Exception e) {
                        currentLevel = 0.0;
                    }
                } while (currentLevel <= 0.0);
            es.addGrounds(currentLevel);
            }
            else if (menuChoice == 3){
                again = false;
            }




        } while(again);
        input.close();
    }
}
