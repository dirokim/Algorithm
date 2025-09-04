import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int one = Integer.parseInt(st.nextToken());
        int two = Integer.parseInt(st.nextToken());
        int three = Integer.parseInt(st.nextToken());
        int sum = 0;
        if(one >= two){
            sum = one;
            one = two;
            two = sum;
        }
        if(two >= three){
            sum = two;
            two = three;
            three = sum;
        }
        if(one >= two){
            sum = one;
            one = two;
            two = sum;
        }
        bw.write(""+two);
        br.close();
        bw.flush();
        bw.close();
	} 
}