import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        double num = 0d;
        num += (13 * Double.parseDouble(st.nextToken()));
        num += (7 * Double.parseDouble(st.nextToken()));
        num += (5 * Double.parseDouble(st.nextToken()));
        num += (3 * Double.parseDouble(st.nextToken()));
        num += (3 * Double.parseDouble(st.nextToken()));
        num += (2 * Double.parseDouble(st.nextToken()));
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        double num2 = 1.5d;
        num2 += (13 * Double.parseDouble(st2.nextToken()));
        num2 += (7 * Double.parseDouble(st2.nextToken()));
        num2 += (5 * Double.parseDouble(st2.nextToken()));
        num2 += (3 * Double.parseDouble(st2.nextToken()));
        num2 += (3 * Double.parseDouble(st2.nextToken()));
        num2 += (2 * Double.parseDouble(st2.nextToken()));
        if(num >= num2){
            bw.write("cocjr0208");
        }else{
            bw.write("ekwoo");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}