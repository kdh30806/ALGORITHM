import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_1735 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] AB = br.readLine().split(" ");
		String[] CD = br.readLine().split(" ");
		
		int A = Integer.parseInt(AB[0]); // 분수 1 - 분자
		int B = Integer.parseInt(AB[1]); // 분수 1 - 분모
		int C = Integer.parseInt(CD[0]); // 분수 2 - 분자
		int D = Integer.parseInt(CD[1]); // 분수 2 - 분모
		
		int LCM = getLCM(B, D);
		int numerator = (A * (LCM / B)) + (C * (LCM / D));
		
		int GCD = getGCD(LCM, numerator);
		bw.write(String.valueOf(numerator / GCD) + " " + String.valueOf(LCM / GCD));
		
		br.close();
		bw.flush();
		bw.close();
	}
	
//	public static int getLCM(int A, int B) {
//		int multiple = A;
//		while(true) {
//			if(A % B == 0) {
//				return A;
//			}else {
//				A += multiple;
//			}
//		}
//	}
//	
//	public static int getGCD(int A, int B) {
//		int min = Math.min(A, B);
//		int max = Math.max(A, B);
//		int multiple = min;
//		while(true) {
//			if(max % multiple == 0 && min % multiple == 0) {
//				return multiple;
//			}else {
//				multiple--;
//			}
//		}
//	}
	
    // 최소공배수 계산 메서드
    public static int getLCM(int a, int b) {
        return a * b / getGCD(a, b);
    }

    // 최대공약수 계산 메서드 (유클리드 호제법)
    // 1. a % b = r
    // 2. b % r = r'
    // 3. r % r' = r''
    // 나머지가 0일때, b가 최대공약수(아래에서는 temp를 a에 저장하여 a를 리턴함)
    public static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
