import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int [] sum = new int[26];
        int num = 0;
        String answer = "";
        for(int i=0;i<input.length();i++){
            num = (int)input.charAt(i);
            for(int j=0;j<26;j++){
                if(num == j+97){
                    sum[j] = sum[j]+1;
                }
            }
        }
        for(int k=0;k<sum.length;k++){
            answer += ""+sum[k]+" ";
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}