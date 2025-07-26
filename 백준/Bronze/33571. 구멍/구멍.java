import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int answer = 0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='@'){
                answer++;
            }else if(input.charAt(i)=='A'){
                answer++;
            }else if(input.charAt(i)=='a'){
                answer++;
            }else if(input.charAt(i)=='B'){
                answer++;
                answer++;
            }else if(input.charAt(i)=='b'){
                answer++;
            }else if(input.charAt(i)=='D'){
                answer++;
            }else if(input.charAt(i)=='d'){
                answer++;
            }else if(input.charAt(i)=='e'){
                answer++;
            }else if(input.charAt(i)=='g'){
                answer++;
            }else if(input.charAt(i)=='O'){
                answer++;
            }else if(input.charAt(i)=='o'){
                answer++;
            }else if(input.charAt(i)=='P'){
                answer++;
            }else if(input.charAt(i)=='p'){
                answer++;
            }else if(input.charAt(i)=='Q'){
                answer++;
            }else if(input.charAt(i)=='q'){
                answer++;
            }else if(input.charAt(i)=='R'){
                answer++;
            }
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}