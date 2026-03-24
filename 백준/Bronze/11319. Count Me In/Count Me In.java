import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int a = 0;
        int b = 0;
        while((input = br.readLine()) != null){
            a = 0;
            b = 0;
            for(int i=0;i<input.length();i++){
                if(input.charAt(i)==' '){
                    
                }else if(input.charAt(i)=='A'){
                    a++;
                }else if(input.charAt(i)=='E'){
                    a++;
                }else if(input.charAt(i)=='I'){
                    a++;
                }else if(input.charAt(i)=='O'){
                    a++;
                }else if(input.charAt(i)=='U'){
                    a++;
                }else if(input.charAt(i)=='a'){
                    a++;
                }else if(input.charAt(i)=='e'){
                    a++;
                }else if(input.charAt(i)=='i'){
                    a++;
                }else if(input.charAt(i)=='o'){
                    a++;
                }else if(input.charAt(i)=='u'){
                    a++;
                }else{
                    b++;
                }
            }
            bw.write(""+b+" "+a+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}