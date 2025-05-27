import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String sum = "";
        int num = 0;
        int num2 = 0;
        while(st.hasMoreTokens()){
            sum = st.nextToken();
            if(sum.equals("1")){
                num++;
            }else if(sum.equals("2")){
                num2++;
            }
        }
        if(num >= num2){
            bw.write(""+1);
        }else{
            bw.write(""+2);
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}