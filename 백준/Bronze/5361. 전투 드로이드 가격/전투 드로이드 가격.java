import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        double sum = 0d;
        String answer = "";
        while((input = br.readLine()) != null){
            sum = 0d;
            StringTokenizer st = new StringTokenizer(input," ");
            sum += (Double.parseDouble(st.nextToken()) * 350.34);
            sum += (Double.parseDouble(st.nextToken()) * 230.90);
            sum += (Double.parseDouble(st.nextToken()) * 190.55);
            sum += (Double.parseDouble(st.nextToken()) * 125.30);
            sum += (Double.parseDouble(st.nextToken()) * 180.90);
            answer = String.format("%.2f",sum);
            bw.write("$"+answer+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}