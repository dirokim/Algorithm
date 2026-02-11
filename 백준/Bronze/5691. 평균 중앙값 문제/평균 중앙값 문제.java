import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        Long a = 0L;
        Long b = 0L;
        Long c = 0L;
        while((input = br.readLine()) != null){
            if(input.equals("0 0")) break;
            StringTokenizer st = new StringTokenizer(input," ");
            a = Long.parseLong(st.nextToken());
            b = Long.parseLong(st.nextToken());
            c = a - b;
            c = a + c;
            bw.write(""+c+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}