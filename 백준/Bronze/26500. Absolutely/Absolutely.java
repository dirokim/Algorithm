import java.io.*; 
import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        double a = 0;
        double b = 0;
        double answer = 0;
        String result = "";
        StringTokenizer st = new StringTokenizer(input," ");
        while((input = br.readLine()) != null){
            st = new StringTokenizer(input," ");
            a = Double.parseDouble(st.nextToken());
            b = Double.parseDouble(st.nextToken());
            if(a >= 0){
                if(b >= 0){
                    if(a >= b){
                        answer = a - b;
                    }else{
                        answer = b - a;
                    }
                }else{
                    answer = a - b;
                }
            }else{
                if(b >= 0){
                    answer = b - a;
                }else{
                    if(a >= b){
                        answer = b - a;
                    }else{
                        answer = a - b;
                    }
                }
            }
            answer = Math.round(answer * 10) / 10.0;
            answer = Math.abs(answer);
            result = String.format("%.1f", answer);
            bw.write(result+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}