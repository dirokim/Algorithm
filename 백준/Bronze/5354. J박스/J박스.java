import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = 0;
        String answer = "";
        while((input = br.readLine()) != null){
            num = Integer.parseInt(input);
            for(int i=0;i<num;i++){
                answer = "";
                if(i== 0 || i==num-1){
                    for(int j=0;j<num;j++){
                        answer+= "#";
                    }
                    bw.write(answer+"\n");
                }else{
                    for(int k=0;k<num;k++){
                        if(k == 0 || k == num-1){
                            answer += "#";
                        }else{
                            answer += "J";
                        }
                    }
                    bw.write(answer+"\n");
                }
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}