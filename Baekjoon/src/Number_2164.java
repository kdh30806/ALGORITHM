import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Number_2164 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> deck = new LinkedList<>();
		for(int i = 1 ; i <= N ; i++) {
			deck.add(i);
		}
		
		while(deck.size() != 1) {
			deck.poll();
			if(deck.size() == 1) break;
			deck.add(deck.poll());
		}
		
		bw.write(String.valueOf(deck.peek()));
		
		br.close();
		bw.flush();
		bw.close();
	}

}
