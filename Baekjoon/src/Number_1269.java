import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;

public class Number_1269 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		
		String[] numbers_A = br.readLine().split(" ");
		String[] numbers_B = br.readLine().split(" ");

		TreeSet<String> A = new TreeSet<>();
		TreeSet<String> B = new TreeSet<>();
		
		for(int i = 0 ; i < N ; i++) {
			A.add(numbers_A[i]);
		}
		
		for(int i = 0 ; i < M ; i++) {
			B.add(numbers_B[i]);
		}
		
		int result = difCounnt(A, B) + difCounnt(B, A);
		
		bw.write(String.valueOf(result));
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static int difCounnt(TreeSet<String> main, TreeSet<String> comp){
		TreeSet<String> result = (TreeSet<String>) main.clone();
		
		comp.forEach((str) -> {
			if(result.contains(str)) {
				result.remove(str);
			}
		});
		
		return result.size();
	}
}
