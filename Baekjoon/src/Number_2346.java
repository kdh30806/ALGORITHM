import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Number_2346 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Deque<Integer[]> deck = new ArrayDeque<>();
		String[] number = br.readLine().split(" ");
		for(int i = 1 ; i <= N ; i++) {
			Integer[] temp = {i, Integer.parseInt(number[i - 1])};
			deck.add(temp);
		}
		
		StringBuilder result = new StringBuilder();
		int index = 1;
		while(!deck.isEmpty()) {
			if(index > 0) {
				for(int i = 1 ; i <= index ; i++) {
					if(i == index) {
						Integer[] temp = deck.pollFirst();
						result.append(temp[0]).append(" ");
						index = temp[1];
						break;
					}else {
						deck.addLast(deck.pollFirst());
					}
				}
			}else {
				for(int i = -1 ; i >= index ; i--) {
					if(i == index) {
						Integer[] temp = deck.pollLast();
						result.append(temp[0]).append(" ");
						index = temp[1];
						break;
					}else {
						deck.addFirst(deck.pollLast());
					}
				}
			}
		}
		
		bw.write(result.toString());
		br.close();
		bw.flush();
		bw.close();
	}

}
