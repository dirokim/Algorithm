import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int num = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num6 = 0;
        int num7 = 0;
        int num8 = 0;
        int num9 = 0;
        int num0 = 0;
        int sum = 0;
        while((input = br.readLine()) != null){
            sum = Integer.parseInt(input);
            if(sum == 0){
                num0++;
            }else if(sum == 1){
                num++;
            }else if(sum == 2){
                num2++;
            }else if(sum == 3){
                num3++;
            }else if(sum == 4){
                num4++;
            }else if(sum == 5){
                num5++;
            }else if(sum == 6){
                num6++;
            }else if(sum == 7){
                num7++;
            }else if(sum == 8){
                num8++;
            }else if(sum == 9){
                num9++;
            }
        }
        if(num % 2 == 1){
            bw.write("1");
        }else if(num2 % 2 == 1){
            bw.write("2");
        }else if(num3 % 2 == 1){
            bw.write("3");
        }else if(num4 % 2 == 1){
            bw.write("4");
        }else if(num5 % 2 == 1){
            bw.write("5");
        }else if(num6 % 2 == 1){
            bw.write("6");
        }else if(num7 % 2 == 1){
            bw.write("7");
        }else if(num8 % 2 == 1){
            bw.write("8");
        }else if(num9 % 2 == 1){
            bw.write("9");
        }else if(num0 % 2 == 1){
            bw.write("0");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}