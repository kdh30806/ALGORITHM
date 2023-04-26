import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Number_1158 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] NK = br.readLine().split(" ");
		int N = Integer.parseInt(NK[0]);
		int K = Integer.parseInt(NK[1]);
		
		LinkedList<Object> numList = new LinkedList<>();
		for(int i = 1 ; i <= N ; i++) {
			numList.add(i);
		}

		bw.write("<");
		while (!numList.isEmpty()) {
			for(int i = 0 ; i < K ; i++) {
				if(i != K - 1) { // K번쨰가 아니면
					numList.add(numList.remove(0)); // 앞에서 제거 후 뒤에 다시 추가
				}else {
					if(numList.size() == 1) {
						bw.write(String.valueOf(numList.get(0)));
					}else {
						bw.write(String.valueOf(numList.get(0) + ", "));
					}
					numList.remove(0);
				}
			}
		}
		bw.write(">");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
