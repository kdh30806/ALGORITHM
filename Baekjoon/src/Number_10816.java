import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Number_10816 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> cardCount = new HashMap<>();
		String[] cards = br.readLine().split(" ");
		for(int i = 0 ; i < N ; i++) {
			int card = Integer.parseInt(cards[i]);
			cardCount.merge(card, 1, (oldValue, newValue) -> oldValue + newValue);
		}
		
//		for(int i = 0 ; i < N ; i++) {
//			int card = Integer.parseInt(cards[i]);
//			cardCount.merge(card, 1, Integer::sum);
//		}
		
		int M = Integer.parseInt(br.readLine());
		String[] check = br.readLine().split(" ");
		
		StringBuilder result = new StringBuilder();
		for(int i = 0 ; i < M ; i++) {
			int num = Integer.parseInt(check[i]);
			result.append(cardCount.getOrDefault(num, 0)).append(" ");
		}
		
		bw.write(result.toString());
		br.close();
		bw.flush();
		bw.close();
	}
}
