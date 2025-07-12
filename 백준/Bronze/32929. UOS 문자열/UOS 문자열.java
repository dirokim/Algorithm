import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        input = input % 3;
        if(input == 0){
            bw.write("S");
        }else if(input == 1){
            bw.write("U");
        }else if(input == 2){
            bw.write("O");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}