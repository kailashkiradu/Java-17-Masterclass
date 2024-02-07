import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("68in = " + convertToCentimeters(70) + "cm");
        System.out.println("5ft, 8in = " + convertToCentimeters(5,8 ) + "cm");
    }
    public static double convertToCentimeters(int height){
        return height * 2.54;
    }
    public static double convertToCentimeters(int feet,int inches){
         return ((feet * 12) + inches) * 2.54;
    }
}