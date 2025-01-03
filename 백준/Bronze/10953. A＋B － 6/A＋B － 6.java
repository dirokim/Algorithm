import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine(); 
        int num  = 0;
        int num2 = 0;
        while((input = br.readLine()) != null){  
            StringTokenizer st = new StringTokenizer(input,",");
            num = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
            num += num2;
            bw.write(""+num+"\n");
        } 
        br.close();
        bw.flush();
        bw.close();
	} 
}