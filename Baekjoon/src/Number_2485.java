import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_2485 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] tree = new int[N];
		for(int i = 0 ; i < N ; i++) {
			tree[i] = Integer.parseInt(br.readLine());
		}
		
		int gcd = 0;
		for(int i = 0 ; i < N - 1 ; i++) {
			gcd = getGCD(gcd, tree[i + 1] - tree[i]);
		}
		
		int result = (tree[N - 1] - tree[0]) / gcd + 1;
		bw.write(String.valueOf(result - N));
		br.close();
		bw.flush();
		bw.close();
	}

	
	// 유클리드 호제법
	// 1. a % b = r
	// 2. b % r = r'
	// 3. r % r` = r``
	// 나머지가 0일때 나눈 수가 최대공약수
	public static int getGCD(int a, int b) {
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
