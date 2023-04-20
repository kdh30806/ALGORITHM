import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_2480 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] numArray = br.readLine().split(" ");
		int num_1 = Integer.parseInt(numArray[0]);
		int num_2 = Integer.parseInt(numArray[1]);
		int num_3 = Integer.parseInt(numArray[2]);
		
		if (num_1 == num_2 && num_1 == num_3 && num_2 == num_3) {
			bw.write(String.valueOf((10000 + (num_1 * 1000))));
		} else if (num_1 == num_2 || num_1 == num_3) {
			bw.write(String.valueOf(1000 + (num_1 * 100)));
		} else if (num_2 == num_3) {
			bw.write(String.valueOf(1000 + (num_2 * 100)));
		} else {
			bw.write(String.valueOf((Math.max(num_1, Math.max(num_2, num_3)) * 100)));
		}
		
		br.close();
		bw.flush();
		bw.close();
	}	
//  내가 한거
//	public static void main(String[] args) throws IOException {
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
////		1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
////		2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
////		3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
//		
//		String[] numArray = br.readLine().split(" ");
//		Boolean flag = false;
//		int same = 0;
//		int count = 0;
//		int max = 0;
//		
//		for(int i = 0 ; i < 2 ; i++) {
//			for(int i2 = i + 1 ; i2 < 3 ; i2++) {
//				int num_1 = Integer.parseInt(numArray[i]);
//				int num_2 = Integer.parseInt(numArray[i2]);
//				if(num_1 == num_2) {
//					same = num_1;
//					flag = true;
//				}	
//				if(flag) {
//					break;
//				}
//			}
//			
//			if(flag) {
//				break;
//			}
//		}
//		
//		for(int i = 0 ; i < numArray.length ; i++) {
//			int N = Integer.parseInt(numArray[i]);
//			if(same == N) {
//				count++;
//			}
//			
//			if(N > max) {
//				max = N;
//			}
//		}
//		
//		if(count == 3) {
//			bw.write(String.valueOf(10000 + same * 1000));
//		}else if(count == 2) {
//			bw.write(String.valueOf(1000 + same * 100));
//		}else {
//			bw.write(String.valueOf(max * 100));
//		}
//		
//		br.close();
//		bw.flush();
//		bw.close();
//	}
}
