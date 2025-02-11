package haymon.collections;

public class array {
    public static void main(String[] args) {

        String[] arrayString = {"one", "two", "three", "four"};

        char[] arrayChar = {'a', 'b', 'c', 'd'};

        int[] arrayInt = {1, 2, 3, 4, 5};

        double[] arrayDouble = new double[4];

        arrayDouble[0] = 4.0;
        arrayDouble[1] = 3.0;
        arrayDouble[2] = 2.0;
        arrayDouble[3] = 1.0;

        for (Object n: arrayDouble) {
            System.out.println(n);
        }
    }
}
