import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_2501 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] NK = br.readLine().split(" ");
		int N = Integer.parseInt(NK[0]);
		int K = Integer.parseInt(NK[1]);
		int count = 0;
		for(int i = 1 ; i <= N ; i++) {
			if(N % i == 0) {
				count++;
			}
			
			if(count == K) {
				bw.write(String.valueOf(i));
				break;
			}else if(i == N && count < K) {
				bw.write(String.valueOf(0));
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
