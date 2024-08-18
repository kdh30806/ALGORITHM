import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Number_11866 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] NK = br.readLine().split(" ");
		int N = Integer.parseInt(NK[0]);
		int K = Integer.parseInt(NK[1]);
		
		Queue<Integer> circle = new LinkedList<>();
		for(int i = 1 ; i <= N ; i++) {
			circle.add(i);
		}
		
		StringBuilder result = new StringBuilder();
		int index = 1;
		while(!circle.isEmpty()) {
			if(index == K) {
				result.append(circle.poll());
				if(circle.size() != 0) result.append(", ");
				index = 1;
			}else {
				circle.add(circle.poll());
				index++;
			}
		}
		
		bw.write("<" + result.toString() + ">");
		br.close();
		bw.flush();
		bw.close();
	}

}
