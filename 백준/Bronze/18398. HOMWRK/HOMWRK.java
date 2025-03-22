import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        input = br.readLine();
        int a = 0;
        int b = 0;
        int sum = 0;
        Long sum2 = 0L;
        while((input = br.readLine()) != null){
            if(!input.contains(" "))continue;
            StringTokenizer st = new StringTokenizer(input," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sum = a+b;
            sum2 = a*b+0L;
            bw.write(""+sum+" "+sum2+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}