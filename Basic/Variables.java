import java.util.*;
public class Variables{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        float a = sc.nextFloat();
        System.out.println("Enter b");
        float b = sc.nextFloat();
        System.out.println("Enter c");
        float c = sc.nextFloat();
        // average of three number
        float average = (a+b+c)/3;
        System.out.println("Average = "+ average);

        // area of square
        float area = (a*a);
        System.out.println("Area of square = "+ area);

        // cost 
        float total = (a+b+c);
        float totalWithTax = total + (total*0.18f);
        System.out.println("total cost with tax = "+ totalWithTax);
    }
}