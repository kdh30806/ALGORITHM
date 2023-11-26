import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_2581 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int min = N;
		int sum = 0;
		
		for(int num = M ; num <= N ; num++) {
			boolean isPrime = true;
			
			if(num <= 1) {
				isPrime = false;
			}else {
				for(int i = 2 ; i * i <= num; i++) {
					if(num % i == 0) {
						isPrime = false;
						break;
					}
				}
			}
			
			if(isPrime) {
				min = Math.min(min, num);
				sum += num;
			}
		}
		
		if(sum == 0) {
			bw.write(String.valueOf(-1));
		}else {
			bw.write(String.valueOf(sum) + "\n" + String.valueOf(min));
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
