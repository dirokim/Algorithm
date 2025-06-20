import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int input = Integer.parseInt(st.nextToken());
        int input2 = Integer.parseInt(st.nextToken());
        int sum = input + input2;
        if(sum == 0){
                bw.write("Not a moose");
        }else{
            if(input == input2){
                bw.write("Even "+sum);
            }else if(input != input2){
                if(input >= input2){
                    input = input * 2;
                    bw.write("Odd "+input);
               }else{
                    input2 = input2 * 2;
                    bw.write("Odd "+input2);
                }
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}