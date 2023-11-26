import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_9506 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = "";
		while(!(str = br.readLine()).equals("-1")) {
			int N = Integer.parseInt(str);			
			boolean[] divisor = new boolean[N/2 + 1];
			for(int i = 1 ; i <= N/2 ; i++) {
				if(N % i == 0) {
					divisor[i] = true;
				}
			}
			
			int sum = 0;
			for(int i = 0 ; i < divisor.length ; i++) {
				if(divisor[i]) {
					sum += i;
				}
			}
			
			if(sum == N) {
				bw.write(String.valueOf(N) + " = ");
				for(int i = 0 ; i < divisor.length ; i++) {
					if(divisor[i]) {
						bw.write(String.valueOf(i));
						
						if(i != divisor.length - 1) {
							bw.write(" + ");
						}
					}
				}
			}else {
				bw.write(String.valueOf(N) + " is NOT perfect.");
			}
			
			bw.write("\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
