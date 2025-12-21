import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int num = Integer.parseInt(st.nextToken());
        int val = Integer.parseInt(st.nextToken());
        int val2 = Integer.parseInt(st.nextToken());
        int fizzbuzz = 0;
        int fizz = 0;
        int buzz = 0;
        for(int i=1;i<=num;i++){
            if(i % val == 0 && i % val2 == 0){
                fizzbuzz++;
            }else if(i % val == 0){
                fizz++;
            }else if(i % val2 ==0){
                buzz++;
            }
        }
        bw.write(""+fizz+" "+buzz+" "+fizzbuzz);
        br.close();
        bw.flush();
        bw.close();
	} 
}