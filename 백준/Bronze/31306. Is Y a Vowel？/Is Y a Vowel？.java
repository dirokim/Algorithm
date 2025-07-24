import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int val = 0;
        int val2 = 0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)== 'a'){
                val++;
                val2++;
            }else if(input.charAt(i)=='e'){
                val++;
                val2++;
            }else if(input.charAt(i)=='i'){
                val++;
                val2++;
            }else if(input.charAt(i)=='o'){
                val++;
                val2++;
            }else if(input.charAt(i)=='u'){
                val++;
                val2++;
            }else if(input.charAt(i)=='y'){
                val2++;
            }
        }
        bw.write(""+val+" "+val2);
        br.close();
        bw.flush();
        bw.close();
	} 
}