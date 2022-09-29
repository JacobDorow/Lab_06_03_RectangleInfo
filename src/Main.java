import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        double width = 0;
        double height = 0;
        double perimeter;
        double area;
        double hypothenuse = 0;


        Scanner in = new Scanner(System.in);

        System.out.println("Please input the width of the rectangle: ");
        if (in.hasNextDouble())
        {
            width = in.nextDouble();
            System.out.println(width);
        }
        System.out.println("Please input the height of the rectangle: ");
        if (in.hasNextDouble())
        {
            height = in.nextDouble();
            System.out.println(height);
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