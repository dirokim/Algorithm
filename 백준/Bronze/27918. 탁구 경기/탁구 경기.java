import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int a = 0;
        int b = 0;
        int sum = 0;
        while((input = br.readLine()) != null){
            if(input.equals("D")){
                a++;
            }else if(input.equals("P")){
                b++;
            }
            if(a >= b){
                sum =  a - b;
            }else{
                sum = b - a;
            }
            if(sum >= 2){
                break;
            }
        }
        bw.write(""+a+":"+b);
        br.close();
        bw.flush();
        bw.close();
	} 
}