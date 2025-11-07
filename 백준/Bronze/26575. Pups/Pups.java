import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        double a = 0d;
        double b = 0d;
        double c = 0d;
        double sum = 0d;
        String answer = "";
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input," ");
            a = Double.parseDouble(st.nextToken());
            b = Double.parseDouble(st.nextToken());
            c = Double.parseDouble(st.nextToken());
            sum = (b * c) * a;
            answer = String.format("%.2f", sum);
            bw.write("$"+answer+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}