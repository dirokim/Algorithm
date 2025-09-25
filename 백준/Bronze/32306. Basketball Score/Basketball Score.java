import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        int num =  Integer.parseInt(st.nextToken());
        num += Integer.parseInt(st.nextToken()) * 2;
        num += Integer.parseInt(st.nextToken()) * 3;
        int num2 =  Integer.parseInt(st2.nextToken());
        num2 +=  Integer.parseInt(st2.nextToken()) * 2;
        num2 +=  Integer.parseInt(st2.nextToken()) * 3;
        if(num == num2){
            bw.write("0");
        }else if(num > num2){
            bw.write("1");
        }else if(num2 > num){
            bw.write("2");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}