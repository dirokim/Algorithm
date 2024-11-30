import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine(); 
        int numA = 0;
        int numB = 0;
        int answer = 0;
        if(input.length()==2){ 
            numA = Integer.parseInt(input.substring(0,1));
            numB = Integer.parseInt(input.substring(1,2));
        }else if(input.length()==3){
            if(Integer.parseInt(input.substring(1,2)) == 1){
            numA = Integer.parseInt(input.substring(0,1));
            numB = Integer.parseInt(input.substring(1,3));
            }else{
            numA = Integer.parseInt(input.substring(0,2));
            numB = Integer.parseInt(input.substring(2,3));
            }
        }else if(input.length()==4){
            numA = Integer.parseInt(input.substring(0,2));
            numB = Integer.parseInt(input.substring(2,4));
        }
        answer = numA + numB;
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}