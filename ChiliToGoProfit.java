import java.util.Scanner;

public class ChiliToGoProfit {
    public static void main(String[] args) {
        final double ADULT_MEAL_PRICE = 7.00;
        final double CHILD_MEAL_PRICE = 4.00;
        final double ADULT_MEAL_COST = 4.35;
        final double CHILD_MEAL_COST = 3.10;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of adult meals ordered: ");
        int adultMeals = input.nextInt();

        System.out.print("Enter the number of child meals ordered: ");
        int childMeals = input.nextInt();

        double adultRevenue = adultMeals * ADULT_MEAL_PRICE;
        double childRevenue = childMeals * CHILD_MEAL_PRICE;

        double adultProfit = adultMeals * (ADULT_MEAL_PRICE - ADULT_MEAL_COST);
        double childProfit = childMeals * (CHILD_MEAL_PRICE - CHILD_MEAL_COST);
        double totalProfit = adultProfit + childProfit;

        System.out.printf("Profit from adult meals: $%.2f%n", adultProfit);
        System.out.printf("Profit from child meals: $%.2f%n", childProfit);
        System.out.printf("Total profit from all meals: $%.2f%n", totalProfit);
    }
}

