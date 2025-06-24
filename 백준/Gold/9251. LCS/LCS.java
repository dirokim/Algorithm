import java.io.*; 
import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String str = br.readLine();
        String str2 = br.readLine();
        String temp = "";
        int sum = 0;
        int sum2 = 0;
        if(str2.length() < str.length()){
            temp = str;
            str = str2;
            str2 = temp;
        }
        int [] dp = new int[str2.length()+1];
        for(int i=1;i<=str.length();i++){
            sum = 0;
            for(int j=1;j<=str2.length();j++){
                sum2 = dp[j];
                if(str.charAt(i-1) == str2.charAt(j-1)){
                    dp[j] = sum+1;
                }else{
                    dp[j] = Math.max(dp[j],dp[j-1]);
                }
                sum = sum2; 
            }
        }
        int answer = dp[str2.length()];
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}