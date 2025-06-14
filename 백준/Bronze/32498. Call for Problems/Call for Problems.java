import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = 0;
        int sum = 0;
        while((input = br.readLine()) != null){
            num = Integer.parseInt(input);
            if(num % 2 == 1){
                sum++;
            }
        }
        bw.write(""+sum);
        br.close();
        bw.flush();
        bw.close();
	} 
}