public class InchesToFeet {
    public static void main(String[] args) {
        final int INCHES_IN_FOOT = 12;
        
        int inches = 86; // You can change this value
        int feet = inches / INCHES_IN_FOOT;
        int remainingInches = inches % INCHES_IN_FOOT;

        System.out.println(inches + " inches is equal to " +
                           feet + " feet and " + remainingInches + " inches.");
    }
}

