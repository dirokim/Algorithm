import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String sum = "";
        int num = 0;
        for(int i=2;i<=9;i++){
            num = 1*i;
            sum += " " + num;
            num = 2*i;
            sum += " " + num;
            num = 3*i;
            sum += " " + num;
            num = 4*i;
            sum += " " + num;
            num = 5*i;
            sum += " " + num;
            num = 6*i;
            sum += " " + num;
            num = 7*i;
            sum += " " + num;
            num = 8*i;
            sum += " " + num;
            num = 9*i;
            sum += " " + num;
        }
        if(sum.contains(input)){
            bw.write("1");
        }else{
            bw.write("0");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}