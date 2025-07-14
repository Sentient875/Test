public class myFizz {
    public static void main(String[] args) {
        // Declares the variable
        // Loop from 1 to 20
        for (int Number = 1; Number <= 100; Number++) {
            if (Number % 3 == 0 && Number % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (Number % 3 == 0) {
                System.out.println("Fizz");
            } else if (Number % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(Number);
            }
        }
    }
}
