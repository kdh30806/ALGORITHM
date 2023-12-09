import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

public class Number_18870 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] array = br.readLine().split(" ");
		
		int[] numbers = new int[N];	
		for(int  i = 0 ; i < N ; i++) {
			numbers[i] = Integer.parseInt(array[i]);
		}
		
		Arrays.sort(numbers);
		
		// 좌표의 등수를 매김
		HashMap<Integer, Integer> ranks = new HashMap<>();
		int rank = 0;
		for(int  i = 0 ; i < N ; i++) {
			int target = numbers[i];
			// 새로운 좌표일때
			if(!ranks.containsKey(target)) {
				ranks.put(target, rank);
				rank++;
			}
		}
		
		for(int  i = 0 ; i < N ; i++) {
			bw.write(String.valueOf(ranks.get(Integer.parseInt(array[i]))) + " ");
		}	
		
		br.close();
		bw.flush();
		bw.close();
	}

}
