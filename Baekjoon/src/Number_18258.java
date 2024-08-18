import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_18258 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		CustomQueue queue = new CustomQueue();
		for (int i = 0; i < N; i++) {
			String[] ab = br.readLine().split(" ");
			if (ab[0].equals("push")) {
				queue.push(Integer.parseInt(ab[1]));
			} else if (ab[0].equals("pop")) {
				bw.write(String.valueOf(queue.pop()) + "\n");
			} else if (ab[0].equals("size")) {
				bw.write(String.valueOf(queue.size()) + "\n");
			} else if (ab[0].equals("empty")) {
				bw.write(String.valueOf(queue.isEmpty()) + "\n");
			} else if (ab[0].equals("front")) {
				bw.write(String.valueOf(queue.front()) + "\n");
			} else if (ab[0].equals("back")) {
				bw.write(String.valueOf(queue.back()) + "\n");
			}
		}

		br.close();
		bw.flush();
		bw.close();
	}

}

class CustomQueue {
	private int front;
	private int end;
	private int[] body;

	public CustomQueue() {
		this.front = 0;
		this.end = -1;
		this.body = new int[2000001];
	}

	void push(int a) {
		body[++end] = a;
	}

	int pop() {
		if (end < front) {
			return -1;
		} else {
			return body[front++];
		}
	}

	int size() {
		return end - front + 1;
	}

	int isEmpty() {
		if (end < front) {
			return 1;
		} else {
			return 0;
		}
	}

	int front() {
		if (end < front) {
			return -1;
		} else {
			return body[front];
		}
	}

	int back() {
		if (end < front) {
			return -1;
		} else {
			return body[end];
		}
	}
}
