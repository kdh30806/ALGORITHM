import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_28279 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		CustomDeck deck = new CustomDeck();
		for(int i = 0 ; i < N ; i++) {
			String[] AB = br.readLine().split(" ");
			if(AB[0].equals("1")) {
				deck.frontAdd(Integer.parseInt(AB[1]));
			}else if(AB[0].equals("2")) {
				deck.endAdd(Integer.parseInt(AB[1]));
			}else if(AB[0].equals("3")) {
				bw.write(String.valueOf(deck.frontPoll()) + "\n");
			}else if(AB[0].equals("4")) {
				bw.write(String.valueOf(deck.endPoll()) + "\n");
			}else if(AB[0].equals("5")) {
				bw.write(String.valueOf(deck.size()) + "\n");
			}else if(AB[0].equals("6")) {
				bw.write(String.valueOf(deck.isEmpty()) + "\n");
			}else if(AB[0].equals("7")) {
				bw.write(String.valueOf(deck.frontPeek()) + "\n");
			}else if(AB[0].equals("8")) {
				bw.write(String.valueOf(deck.endPeek()) + "\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}

class CustomDeck{
	private int front;
	private int end;
	private int[] body;
	
	public CustomDeck() {
		this.front = 1000001;
		this.end = 1000000;
		this.body = new int[2000002];
	}
	
	void frontAdd(int a) {
		body[--front] = a;
	}
	
	void endAdd(int a) {
		body[++end] = a;
	}
	
	int frontPoll() {
		if(front > end) {
			return -1;
		}else {
			return body[front++];
		}
	}
	
	int endPoll() {
		if(front > end) {
			return -1;
		}else {
			return body[end--];
		}
	}
	
	int size() {
		if(front > end) {
			return 0;
		}else {
			return end-front + 1;
		}
	}
	
	int isEmpty() {
		if(front > end) {
			return 1;
		}else {
			return 0;
		}
	}
	
	int frontPeek() {
		if(front > end) {
			return -1;
		}else {
			return body[front];
		}
	}
	
	int endPeek() {
		if(front > end) {
			return -1;
		}else {
			return body[end];
		}
	}
}