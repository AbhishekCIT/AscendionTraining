package labEx5;

public class LabEx5_1 {

    public static void main(String[] args) {
        // 1
        System.out.println("Single try.. catch.. finally block:");
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block.");
        }

        // 2
        System.out.println("\nMultiple catch blocks:");
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
            int result = 10/0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        // 3
        System.out.println("\nNested try-catch blocks:");
        try {
            try {
                int result = 10 / 0;  // This will cause an ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            }
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);  // This will cause an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // 4
        System.out.println("\nUsage of throw and throws keywords:");
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught InvalidAgeException: " + e.getMessage());
        }

        // 3rd
        System.out.println("\nTesting custom runtime exception:");
        try {
            throw new WrongInputException("Invalid input provided");
        } catch (WrongInputException e) {
            System.out.println("Caught WrongInputException: " + e.getMessage());
        }
    }

//    2nd
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18");
        }
        System.out.println("Age is valid");
    }
}


