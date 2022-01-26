import java.util.Scanner;

public class Area {
    public static void main(String[] args) {   
        double PI = 3.141592;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a byte value :");
        byte byteValue = input.nextByte();
        System.out.print(byteValue);

        System.out.print("Enter a short value :");
        short shortValue = input.nextShort();

        System.out.print("Enter a int value :");
        int intValue = input.nextInt();

        System.out.print("Enter a long value :");
        long longValue = input.nextLong();

        System.out.print("Enter a float value :");
        float floatValue = input.nextFloat();

        System.out.print("Enter a radius value :");
        float radius = input.nextFloat();

        double area  = PI*radius*radius;
        System.out.print("The area of the circle is :");
        System.out.print(area);
    }
}
