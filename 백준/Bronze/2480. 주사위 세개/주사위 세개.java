import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int numA = Integer.parseInt(st.nextToken());
        int numB = Integer.parseInt(st.nextToken());
        int numC = Integer.parseInt(st.nextToken());
        int [] sum = new int[3];
        int answer = 0;
        if(numA != numB && numB != numC && numA != numC){
            sum[0]=numA;
            sum[1]=numB;
            sum[2]=numC;
            Arrays.sort(sum);
            answer = sum[2] * 100;
        }else if(numA == numB && numB == numC && numA == numC){
            answer = numA  * 1000 + 10000;
        }else if(numA == numB || numB == numC || numA == numC){
            if(numA == numB){
                answer = numA * 100 + 1000;
            }
            if(numB == numC){
                answer = numB * 100 + 1000;
            }
            if(numA == numC){
                answer = numA * 100 + 1000;
            }
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}