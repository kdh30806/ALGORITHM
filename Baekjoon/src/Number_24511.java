import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Number_24511 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> queue = new ArrayDeque<>();
		int[] arr = new int[N];
		String[] state = br.readLine().split(" ");
		for(int i = 0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(state[i]);
		}
		
        String[] init = br.readLine().split(" ");
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(init[i]);
            if (arr[i] == 0)
            	queue.addLast(num);
        }

        int M = Integer.parseInt(br.readLine());
        String[] init2 = br.readLine().split(" ");
        for(int i=0; i<M; i++) {
        	queue.addFirst(Integer.parseInt(init2[i]));
            bw.write(queue.pollLast()+" ");
        }
		
		br.close();
		bw.flush();
		bw.close();
	}

}
