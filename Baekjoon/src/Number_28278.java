import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_28278 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		MakeStack stack = new MakeStack();
		
		for(int i = 0 ; i < T ; i++) {
			String[] NX = br.readLine().split(" ");
			if(NX[0].equals("1")) {
				stack.insert(Integer.parseInt(NX[1]));
			}else if(NX[0].equals("2")) {
				bw.write(String.valueOf(stack.pop()) + "\n");
			}else if(NX[0].equals("3")) {
				bw.write(String.valueOf(stack.getSize()) + "\n");
			}else if(NX[0].equals("4")) {
				bw.write(String.valueOf(stack.isEmpty()) + "\n");
			}else if(NX[0].equals("5")) {
				bw.write(String.valueOf(stack.getTop()) + "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
	

}

class MakeStack {
	int front;
	int size;
	int[] customStack;
	
	public MakeStack() {
		this.front = 0;
		this.size = 0;
		this.customStack = new int[1000001];
	}
	
	void insert(int a) {
		size++;
		customStack[++front] = a;
	}
	
	int pop() {
		if(size == 0) {
			return -1;
		}else {
			size--;
			int pop = customStack[front];
			customStack[front--] = 0;
			return pop;
		}
	}
	
	int getSize() {
		return size;
	}
	
	int isEmpty() {
		if(size == 0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	int getTop() {
		if(size == 0) {
			return -1;
		}else {
			return customStack[front];
		}
	}
}