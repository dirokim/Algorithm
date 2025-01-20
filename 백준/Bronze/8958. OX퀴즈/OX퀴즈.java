import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = 0;
        int sum = 0;
        while((input = br.readLine()) != null){
            num = 0;
            sum = 0;
            for(int i=0;i<input.length();i++){
                if(input.charAt(i)=='O'){
                    num++;
                    sum +=num;
                }else{
                    num = 0;
                }
            }
            bw.write(""+sum+"\n");
        } 
        br.close();
        bw.flush();
        bw.close();
	} 
}