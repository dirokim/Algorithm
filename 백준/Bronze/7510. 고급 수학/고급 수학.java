import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int a = 0;
        int b = 0;
        int c = 0;
        int sum = 0;
        int num = 0;
        while((input = br.readLine()) != null){
            num++;
            StringTokenizer st = new StringTokenizer(input," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            if(a > b){
                if(c < a){
                    sum = c;
                    c = a;
                    a = sum;
                }
            }else{
                if(c < b){
                    sum = c;
                    c = b;
                    b = sum;
                }
            }
            sum = (a * a) + (b * b);
            c = c * c;
            if(sum == c){
                bw.write("Scenario #"+num+":\n"+"yes\n"+"\n");
            }else{
                bw.write("Scenario #"+num+":\n"+"no\n"+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}