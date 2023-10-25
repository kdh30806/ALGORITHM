import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_3052 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] flag = new boolean[42];
		
		for(int i = 0 ; i < 10 ; i++) {
			int num = Integer.parseInt(br.readLine());
			
			flag[num%42] = true;
		}
		
		int count = 0;
		
		for(int i = 0 ; i < flag.length ; i++) {
			if(flag[i]) {
				count++;
			}
		}
		
		bw.write(String.valueOf(count));
		
		br.close();
		bw.flush();
		bw.close();
	}

}
