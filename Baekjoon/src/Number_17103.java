import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Number_17103 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < T ; i++) {
			int N = Integer.parseInt(br.readLine());
			 boolean[] isPrime = new boolean[N + 1];
			 initEratosthenes(isPrime);
			 getEratosthenes(isPrime);
			 
			 int result = 0;
			 for(int i2 = 2; i2 <= isPrime.length / 2; i2++) {
				 if(isPrime[i2] && isPrime[N - i2]) result++;
			 }
			 
			 bw.write(String.valueOf(result) + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	// 에라토스테네스의 체 알고리즘 - 2의 배수, 3의 배수, 5의 배수, 7의 배수를 제외하면 남는 수는 소수이다.
	// 1. boolean 배열을 true로 모두 초기화(true일때 소수임)
	// 2. i를 2부터 시작하여 i * i 가 result의 크기보다 작을 때 까지 반복 - 배수를 제외하기 때문에 i * i 가 result보다 크면 의미 없음
	private static void getEratosthenes(boolean[] isPrime) {		
		for (int i = 2; i * i < isPrime.length; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < isPrime.length; j += i) {
                	isPrime[j] = false;
                }
            }
        }
	}
	
	private static void initEratosthenes(boolean[] isPrime) {
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
    }

}
