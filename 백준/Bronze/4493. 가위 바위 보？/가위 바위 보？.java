import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine());
        int length2 = 0;
        String val = "";
        String val2 = "";
        int sum = 0;
        int sum2 = 0;
        for(int i=0;i<length;i++){
            length2 = Integer.parseInt(br.readLine());
            sum = 0;
            sum2 = 0;
            for(int j=0;j<length2;j++){
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                val = st.nextToken();
                val2 = st.nextToken();
                if(val.equals("R")){
                    if(val2.equals("S")){
                        sum++;
                    }else if(val2.equals("P")){
                        sum2++;
                    }
                }else if(val.equals("S")){
                    if(val2.equals("R")){
                        sum2++;
                    }else if(val2.equals("P")){
                        sum++;
                    }
                }else if(val.equals("P")){
                    if(val2.equals("S")){
                        sum2++;
                    }else if(val2.equals("R")){
                        sum++;
                    }
                }
            }
            if(sum == sum2){
                bw.write("TIE"+"\n");
            }else if(sum > sum2){
                bw.write("Player 1"+"\n");
            }else if(sum2 > sum){
                bw.write("Player 2"+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}