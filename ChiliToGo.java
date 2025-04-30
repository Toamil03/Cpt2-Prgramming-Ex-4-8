import java.util.Scanner;

public class ChiliToGo {
    public static void main(String[] args) {
        final double ADULT_MEAL_PRICE = 7.00;
        final double CHILD_MEAL_PRICE = 4.00;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of adult meals ordered: ");
        int adultMeals = input.nextInt();

        System.out.print("Enter the number of child meals ordered: ");
        int childMeals = input.nextInt();

        double adultTotal = adultMeals * ADULT_MEAL_PRICE;
        double childTotal = childMeals * CHILD_MEAL_PRICE;
        double totalCollected = adultTotal + childTotal;

        System.out.printf("Total collected for adult meals: $%.2f%n", adultTotal);
        System.out.printf("Total collected for child meals: $%.2f%n", childTotal);
        System.out.printf("Total collected for all meals: $%.2f%n", totalCollected);
    }
}
