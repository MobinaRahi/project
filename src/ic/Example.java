package ic;

public class Example {
    public static void main(String[] args) {

        int[]numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
            System.out.printf("%2d  : %-2d \n",i,numbers[i]);
        }


    }

}
