public class DataTypes {
    // TODO TASK 1: fix this code so that it passes the test in DataTypesTest.java
    public static void main(String[] args) {
    }

    public static long sum(int[] numbers) {
        int s = 0; // variable to accumulate the sum in!
        // below is a "foreach" loop which iterates through numbers
        for (int i = 0; i <= numbers.length; i++) {
            s += i;
        }
        return s;
    }
}
