import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        double num = 0d;
        double sum = 0d;
        String answer = "";
        String answer2 = "";
        while((input = br.readLine()) != null){
            if(input.equals("-1.0")) break;
            num = Double.parseDouble(input);
            sum = num * 0.167d;
            answer = String.format("%.2f", num);
            answer2 = String.format("%.2f", sum);
            bw.write("Objects weighing "+answer+" on Earth will weigh "+answer2+" on the moon.\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}