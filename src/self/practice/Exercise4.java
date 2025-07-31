package self.practice;

public class Exercise4 {
    public static void main(String[] args) {
        // تعریف متغیر
        int i=1 , j;

        //تعریف حلقه ها
        // i برای ضرب عدد است
        while(i<=10){
            for(j=1;j<=10;j++){
                System.out.printf("%-5d ",j*i);
            }
            System.out.println("\n");
            i++;
        }
    }
}
