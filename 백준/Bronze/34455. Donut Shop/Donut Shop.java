import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int sum = Integer.parseInt(br.readLine());
        String input = br.readLine();
        while((input = br.readLine()) != null){
            if(input.equals("+")){
                sum += Integer.parseInt(br.readLine());
            }else{
                sum -= Integer.parseInt(br.readLine());
            }
        }
        bw.write(""+sum);
        br.close();
        bw.flush();
        bw.close();
	} 
}