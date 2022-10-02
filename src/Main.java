import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        double width = 0;
        double height = 0;
        double perimeter;
        double area;
        double hypothenuse;


        Scanner in = new Scanner(System.in);

        System.out.println("Please input the width of the rectangle: ");
        if (in.hasNextDouble())
        {
            width = in.nextDouble();
            in.nextLine();
        }
        else {
            System.out.println("Bad input");
            System.exit(0);
        }
        System.out.println("Please input the height of the rectangle: ");
        if (in.hasNextDouble())
        {
            height = in.nextDouble();
            in.nextLine();
        }
        else {
            System.out.println("Bad input");
            System.exit(0);
        }
        perimeter = height + height + width + width;
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        area = height * width;
        System.out.println("The area of the rectangle is : " + area);

        hypothenuse = Math.sqrt((height*height)+(width*width));

        double roundOff = Math.round( hypothenuse * 100) / 100;

        System.out.println("The length of the hypothenuse is " + roundOff);
    }
}