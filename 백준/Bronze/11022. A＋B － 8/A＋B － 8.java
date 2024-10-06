import java.io.*;
import java.util.StringTokenizer;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int a = 0;
        int b = 0;
        int ab = 0;
        int count = 0;
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            count++; 
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            ab = a+b;
            bw.write("Case #"+count+": "+a+" + "+b+" = "+ab+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}