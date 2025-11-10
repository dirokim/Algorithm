import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int sum = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int answer = 0;
        StringTokenizer st = new StringTokenizer(input," ");
        while((input = br.readLine()) != null){
            st = new StringTokenizer(input," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            if(a == b && b == c && a == c){
                sum = a * 1000 + 10000;
            }else if(a == b){
                sum = a * 100 + 1000;
            }else if(b == c){
                sum = b * 100 + 1000;
            }else if(a == c){
                sum = a * 100 + 1000;
            }else{
                if(a >= b){
                    if(a >= c){
                        sum = a * 100;
                    }else{
                        sum = c * 100;
                    }
                }else if(b >= a){
                    if(b >= c){
                        sum = b * 100;
                    }else{
                        sum = c * 100;
                    }
                }
            }
            if(sum >= answer){
                answer = sum;
            }
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}