import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int a = 0;
        int b = 0;
        int c = 0;
        int sum = 0;
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            if(a==3) a = 5;
            if(a==2) a = 3; 
            sum = (c-b)*a;
            if(sum < 0) sum = 0;
            bw.write(""+sum+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}