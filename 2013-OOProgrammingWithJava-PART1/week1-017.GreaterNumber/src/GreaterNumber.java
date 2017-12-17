import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("type the first number: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.print("type the second number: ");
        int b = Integer.parseInt(reader.nextLine());
        if(a > b){
            System.out.print("Greater numbert: " + a);
        }else if(a<b){
            System.out.print("Greater numbert: " + b);
        }else{
            System.out.print("The numbers are equal!");
        }
        
        
    }
}
