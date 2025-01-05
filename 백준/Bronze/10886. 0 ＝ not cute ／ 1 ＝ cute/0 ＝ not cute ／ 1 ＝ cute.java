import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine(); 
        int num =  0;   //cute
        int num2 = 0;   //not cute
        while((input = br.readLine()) != null){
            if(input.equals("0")) num++;
            else if(input.equals("1")) num2++;
        }
        if(num > num2){
            bw.write("Junhee is not cute!");
        }else{
            bw.write("Junhee is cute!");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}