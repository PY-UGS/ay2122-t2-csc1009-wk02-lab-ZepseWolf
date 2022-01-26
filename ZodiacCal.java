import java.util.Scanner;

public class ZodiacCal {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year : ");
        int year = input.nextInt(); 
        year %= 12; 
        switch(year) {
            case 1:
              // code block
              System.out.print("Rooster");
              break;
            case 2:
              // code block
              System.out.print("Dog");
              break;
            case 3:
              // code block
              System.out.print("Pig");
              break;
            case 4:
              // code block
              System.out.print("Rat");
              break;
            case 5:
              // code block
              System.out.print("Ox");
              break;
            case 6:
              // code block
              System.out.print("Tiger");
              break;
            case 7:
            System.out.print("Rabbit");
              // code block
              break;
            case 8:
            System.out.print("Dragon");
              // code block
              break;
            case 9:
            System.out.print("Snake");
              // code block
              break;
            case 10:
            System.out.print("Horse");
              // code block
              break;
            case 11:
            System.out.print("Sheep");
              // code block
              break;
            case 0:
              // code block
              System.out.print("Monkey");
              break;

            default:
              // code block
          }
    }
}
