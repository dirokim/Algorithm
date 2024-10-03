import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int sum = sc.nextInt();
        if(sum >= 90 && sum < 101){
            System.out.println("A");   
        }else if(sum >=80 && sum < 90){
            System.out.println("B");   
        }else if(sum >=70 && sum < 80){
            System.out.println("C");   
        }else if(sum >=60 && sum < 70){
            System.out.println("D");   
        }else{
            System.out.println("F");
        }
        
    }
}