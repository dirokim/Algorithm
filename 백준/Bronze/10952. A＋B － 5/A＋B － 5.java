import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int a  = 0;
        int b  = 0;
        int ab = 0;
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            ab = a+b;
            if(ab==0)break;
            bw.write(ab+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}