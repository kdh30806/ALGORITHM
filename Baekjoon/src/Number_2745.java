import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_2745 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] NB = br.readLine().split(" ");
		String N = NB[0];
		char[] N_char = N.toCharArray();
		int B = Integer.parseInt(NB[1]);
		int sum = 0;
		int idx = 0;
		for(int i = N_char.length - 1 ; i >= 0 ; i--) {
			char c = N_char[i];
			int num = 0;
			if('0' <= c && '9' >= c) {
				num = c - '0';
			}else {
				num = c - 55;
			}
			
			sum += num * Math.pow(B, idx++);
		}
		
		bw.write(String.valueOf(sum));
		
		br.close();
		bw.flush();
		bw.close();
	}

}
