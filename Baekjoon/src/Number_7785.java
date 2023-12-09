import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Number_7785 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] cardArray = br.readLine().split(" ");
		HashMap<String, Integer> card = new HashMap<>();
		for(int i = 0 ; i < N ; i++) {
			card.put(cardArray[i], Integer.parseInt(cardArray[i]));
		}
		
		int M = Integer.parseInt(br.readLine());
		String[] checkArray = br.readLine().split(" ");
		for(int i = 0 ; i < M ; i++) {
			if(card.containsKey(checkArray[i])) {
				bw.write(String.valueOf(1) + " ");
			}else {
				bw.write(String.valueOf(0) + " ");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
