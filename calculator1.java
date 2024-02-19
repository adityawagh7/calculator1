import java.util.Scanner;

public class calculator1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("enter number 1");
        Float num1=20;
        System.out.println("enter number 2");
        Float num2=30;
        System.out.println("choose one");
        System.out.println("1.addition");
        System.out.println("2.substraction");
        System.out.println("3.mulit");
        System.out.println("4.div");

        char c=scanner.next().charAt(0);
        switch(c) {
            case '1' : 
            System.out.println("addition :"+(num1+num2));
            break;
            case '2' : 
            System.out.println("sub :"+(num1-num2));
            break;
            case'3' : 
            System.out.println("multi :"+(num1*num2));
            break;
            case '4' : 
            System.out.println("4.div :"+(num1/num2));
            break;

            default:
            System.out.println("invalid");



        }

    }

}
