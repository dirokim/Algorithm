import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int sum = 0;
        while((input = br.readLine()) != null){
            sum += Integer.parseInt(input);
        }
        sum += 300;
        if(sum <= 1800){
            bw.write("Yes");
        }else{
            bw.write("No");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}