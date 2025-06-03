import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        double num = Double.parseDouble(br.readLine());
        double num2 = Double.parseDouble(br.readLine());
        double bmi = num / (num2 * num2);
        if(bmi > 25){
            bw.write("Overweight");
        }else if(bmi >= 18.5 && bmi <= 25.0){
            bw.write("Normal weight");
        }else if(bmi < 18.5){
            bw.write("Underweight");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}