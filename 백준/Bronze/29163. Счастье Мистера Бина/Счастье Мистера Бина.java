import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        input = br.readLine();
        int num = 0;
        int num2 = 0;
        StringTokenizer st = new StringTokenizer(input," ");
        while(st.hasMoreTokens()){
            if(Integer.parseInt(st.nextToken()) % 2 == 0){
                num++;
            }else{
                num2++;
            }
        }
        if(num > num2){
            bw.write("Happy");
        }else{
            bw.write("Sad");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}