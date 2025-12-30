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
            sum = 0;
            for(int i=1;i<=num;i++){
                if(i % 2 == 1){
                    sum += i;
                }
            }
            bw.write(""+sum+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}