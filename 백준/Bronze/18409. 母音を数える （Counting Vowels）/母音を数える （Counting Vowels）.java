import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = 0;
        char val = 'a';
        input = br.readLine();
        for(int i=0;i<input.length();i++){
            val = input.charAt(i);
            if(val == 'a'){
                num++;
            }else if(val == 'e'){
                num++;
            }else if(val == 'i'){
                num++;
            }else if(val == 'o'){
                num++;
            }else if(val == 'u'){
                num++;
            }
        }
        bw.write(""+num);
        br.close();
        bw.flush();
        bw.close();
	} 
}