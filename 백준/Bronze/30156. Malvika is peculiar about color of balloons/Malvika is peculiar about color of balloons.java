import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int a = 0;
        int b = 0;
        while((input = br.readLine()) != null){
            a = 0;
            b = 0;
            for(int i=0;i<input.length();i++){
                if(input.charAt(i)=='a'){
                    a++;
                }else{
                    b++;
                }
            }
            if(a <= b){
                bw.write(""+a+"\n");
            }else{
                bw.write(""+b+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}