import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int num  = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());
        if(num+num2+num3 >= 100){
            bw.write("OK");
        }else{
            if(num < num2 && num < num3){
                bw.write("Soongsil");
            }else if(num2 < num && num2 < num3){
                bw.write("Korea");
            }else if(num3 < num && num3 < num2){
                bw.write("Hanyang");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}