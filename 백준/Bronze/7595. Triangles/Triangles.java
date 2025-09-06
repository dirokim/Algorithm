import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int num = 0;
        String sum = "";
        while((input = br.readLine()) != null){
            sum = "";
            num = Integer.parseInt(input);
            for(int i=0;i<num;i++){
                sum += "*";
                bw.write(sum+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}