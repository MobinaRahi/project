package mft;

public class Exercise4 {
    public static void main(String[] args) {
        int sum=0 , i , count=0 , result;


        for (i=100;i<1000;i++) {
            if(i%2!=0) {
                sum=sum+i;
                count++;
            }
        }
        result=sum/count;
        System.out.println("The average of the three-digit odd numbers is equal to "+result);
    }
}
