import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Number_5073 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			String[] araay = br.readLine().split(" ");
			int[] ABC = new int[3];
			ABC[0] = Integer.parseInt(araay[0]);
			ABC[1] = Integer.parseInt(araay[1]);
			ABC[2] = Integer.parseInt(araay[2]);
			Arrays.sort(ABC);
			int A = ABC[0];
			int B = ABC[1];
			int C = ABC[2];
			
			if(A == 0 && B == 0 && C == 0) break;
			
			if(C >= A + B) {
				bw.write("Invalid\n");
			}else if(A == B && B == C) {
				bw.write("Equilateral\n");
			}else if(A == B || B == C || A == C) {
				bw.write("Isosceles\n");
			}else {
				bw.write("Scalene\n");
			}
		}

		br.close();
		bw.flush();
		bw.close();
	}

}
