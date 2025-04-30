import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        final double PRICE_PER_DOZEN = 3.25;
        final double PRICE_PER_EGG = 0.45;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of eggs you want to order: ");
        int eggsOrdered = input.nextInt();

        int dozens = eggsOrdered / 12;
        int looseEggs = eggsOrdered % 12;

        double totalCost = (dozens * PRICE_PER_DOZEN) + (looseEggs * PRICE_PER_EGG);

        System.out.printf("You ordered %d eggs.%n", eggsOrdered);
        System.out.printf("That's %d dozen at $%.2f per dozen and %d loose eggs at %.2f cents each.%n",
                          dozens, PRICE_PER_DOZEN, looseEggs, PRICE_PER_EGG);
        System.out.printf("Total cost: $%.2f%n", totalCost);
    }
}
