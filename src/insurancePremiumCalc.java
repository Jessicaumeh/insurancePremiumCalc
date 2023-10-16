import java.util.Scanner;

public class insurancePremiumCalc {
    /*
     * calculate premium
     *  if under 25 * 0.2
     * add answer to premium
     * if type is sc * 0.15
     * add answer to premium
     * if type is truck * 0.1
     * minus answer from premium
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //user input
        System.out.println("Input car type");
        String type = scanner.nextLine();

        System.out.println("Input age");
        int age = scanner.nextInt();
        scanner.close(); //close scanner

        System.out.println("Your age: " + age +" Your car type: " + type);
        double finalPremium = calPrem(age, type);
        System.out.println("Premium: $" +finalPremium);
    }

    private static double calPrem(int age,String type){
    double prem = 500;

        if (age < 25){
            prem +=prem * 0.2; // increase by 20%
        }

        if (type.equals("sports")){ //.equals comparison
            prem += prem * 0.15; // increase by 15%
        } else if (type.equals("truck")) {
            prem -= prem * 0.1; // decrease by 10%
        }
            return prem;
    }
}