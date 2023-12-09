import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Number_12789 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] nums = br.readLine().split(" "); 
		Stack<Integer> road = new Stack<>(); // 한명씩만 설 수 있는 공간
		int order = 1; // 간식을 받을 번호
		for(int i = 0 ; i < N ; i++) {
			int num = Integer.parseInt(nums[i]);
			
			// 간식을 반을 번호 순서와 번호표가 일치하지 않으면 
			if(num != order) {
				// road에서 갈 수 있는지 확인
				if(road.isEmpty()) {
					road.add(num);
				}else {
					// road에서 제일 앞에 있는 번호표와 간식을 받을 번호가 일치하면 처리하고 아니면 스택에 추가
					if(order == road.peek()) {
						road.pop();
						order++;
						i--; // road에서 간식을 받았을 때 i--를 해서 다시 재검사
					}else {
						road.add(num);
					}
				}		
			}else { // 일치하면 간식을 받을 번호 순서 1 증가
				order++;
			}
		}
		
		boolean result = true;
		
		// road에 남은 번호표들 간식 배부
		while(!road.isEmpty()) {
			int num = road.pop();
			
			// 순서와 번호표 일치하지 않으면 간식배부 실패
			if(num != order) {
				result = false;
				break;
			}else {
				order++;
			}
		}
		
		if(result) {
			bw.write("Nice");
		}else {
			bw.write("Sad");
		}

		bw.flush();
		bw.close();
		br.close();
	}

}