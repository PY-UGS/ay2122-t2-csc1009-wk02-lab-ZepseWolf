import java.util.Scanner;

public class Average {
    public static void main(String[] args) {   
        double total = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter 3 number :");
        String s[] = input.nextLine().split(" ");
        System.out.print("The average of ");
        for(int i=0 ; i<s.length;i++){

            total += Double.parseDouble(s[i]);
            System.out.print(Double.parseDouble(s[i]));
            System.out.print(" ");
        }
        System.out.print("is ");
        System.out.print(total/s.length);
    }
}
