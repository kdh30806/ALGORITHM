import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Number_1966 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		ArrayList<String> document = new ArrayList<>();
		ArrayList<String> important = new ArrayList<>();
		
		for(int testIndex = 0 ; testIndex < T ; testIndex++) {
			String[] NM = br.readLine().split(" ");
			int N = Integer.parseInt(NM[0]);
			int M = Integer.parseInt(NM[1]);
			String[] temp = br.readLine().split(" ");
			
			for(int i2 = 0 ; i2 < N ; i2++) {
				if(i2 == M) {
					document.add("T");
				}else {
					document.add(temp[i2]);
				}
				important.add(temp[i2]);
			}
			
			boolean flag = true;
			int count = 0;
			
			while(flag){
				// 첫번째 문서의 종류와 중요도
				String firstDoc = document.get(0);
				String firstImp = important.get(0);
				
				// 남은 문서의 갯수가 1개 인 경우
				if(document.size() == 1) {
					count++;
					bw.write(String.valueOf(count) + "\n");
					// 초기화
					flag = false;
					document.clear();
					important.clear();	
				}else {
					// 첫번째 문서보다 중요도가 큰 문서가 있는지 검사
					for(int i = 1 ; i < document.size() ; i++) {
						// 중요도가 큰 문서가 있을 경우
						if(Integer.parseInt(firstImp) < Integer.parseInt(important.get(i))) {
							// 뒤로 재배치
							document.add(firstDoc);
							important.add(firstImp);
							
							document.remove(0);
							important.remove(0);
							
							break;
						}
						
						// 마지막까지 중요도가 큰 문서가 없을 경우
						if(i == document.size() - 1) {
							count++;
							// 타겟 문서일 경우
							if(firstDoc.equals("T")) {
								bw.write(String.valueOf(count) + "\n");
								flag = false;
								document.clear();
								important.clear();		
							}else {
								// 인쇄
								document.remove(0);
								important.remove(0);
							}	
						}
					}
				}
			}	
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
