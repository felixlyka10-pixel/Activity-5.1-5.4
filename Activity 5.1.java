public class DemoArray2 {
    public static void main(String[] args) {
        // Initialize the array of doubles using shorthand notation
        double[] salary = {6.25, 6.55, 10.25, 16.85};

        // Display the values using a for loop
        System.out.println("Salaries one by one are:");
        for (int i = 0; i < salary.length; i++) {
            System.out.println(salary[i]);
        }
    }
}
