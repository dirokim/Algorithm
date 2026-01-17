import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        int a = 300;
        int b = 60;
        int c = 10;
        int d = 0;
        int e = 0;
        int f = 0;
        String answer = "";
        if(input / a >= 1){
            d = input / a;
            input = input % a;
        }
        if(input / b >= 1){
            e = input / b;
            input = input % b;
        }
        if(input / c >= 1){
            f = input / c;
            input = input % c;
        }
        if(input != 0){
            answer = "-1";
        }else{
            answer = ""+d+" "+e+" "+f;
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}