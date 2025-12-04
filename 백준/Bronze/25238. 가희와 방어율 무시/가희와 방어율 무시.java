import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        double val = Double.parseDouble(st.nextToken());
        double val2 = Double.parseDouble(st.nextToken());
        val = val - (val * val2 / 100);
        if(val >= 100d){
            bw.write("0");
        }else{
            bw.write("1");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}