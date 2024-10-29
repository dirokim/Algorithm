import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();        
        long num = 0L;
        long num2 = 0L;
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            num = Long.parseLong(st.nextToken());
            num2 = Long.parseLong(st.nextToken());
            bw.write(num+num2+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}