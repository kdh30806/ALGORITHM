import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Number_4673 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Boolean[] result = new Boolean[10001];
		Arrays.fill(result, false);
		
		for(int i = 1 ; i < 10001 ; i++) {		
			int constructor = makeConstructor(i);
			
			if(constructor <= 10000) {
				result[constructor] = true;
			}
			
		}
		
		for(int i = 1 ; i <= 10000 ; i++) {
			if(!result[i]) {
				bw.write(String.valueOf(i) + "\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

	public static int makeConstructor(int N) {
		int result = N;
		
		while(N != 0) {
			result = result + (N % 10); // 일의 자리 수
			N = N / 10; // 일의 자리가 되면 몫이 0이기 때문에 반복문 종료
		}
		
		return result;
	}

}
