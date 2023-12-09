import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Number_9012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < T ; i++) {
			Queue<String> queue = new LinkedList<>(); 
			String str = br.readLine();
			for(int i2 = 0 ; i2 < str.length() ; i2++) {
				queue.add(String.valueOf(str.charAt(i2)));
			}
			
			boolean isVPS = true;
			int leftCount = 0;
			
			while(!queue.isEmpty()) {
				if(queue.poll().equals("(")) {
					leftCount++;
				}else {
					leftCount--;
				}
				
				if(leftCount < 0) {
					isVPS = false;
					break;
				}		
			}
			
			if(leftCount != 0)  {
				isVPS = false;
			}
			
			if(isVPS) {
				bw.write("YES\n");
			}else {
				bw.write("NO\n");
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
	

}