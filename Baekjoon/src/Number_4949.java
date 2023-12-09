import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Number_4949 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = "";
		while(!(str = br.readLine()).equals(".")) {
			Stack<String> stack = new Stack<>();
			boolean result = true;
			for(int i = 0 ; i < str.length() ; i++) {
				String subStr = String.valueOf(str.charAt(i));
				if(subStr.equals("(") || subStr.equals("[")) {
					stack.add(subStr);
				}
				
				if(subStr.equals(")")) {
					if(stack.isEmpty()) {
						result = false;
					}else {
						String top = stack.pop();
						if(!top.equals("(")) {
							result = false;
						}
					}
				}
				
				if(subStr.equals("]")) {
					if(stack.isEmpty()) {
						result = false;
					}else {
						String top = stack.pop();
						if(!top.equals("[")) {
							result = false;
						}
					}
				}
				
				if(!result) {
					break;
				}
			}
			
			if(stack.isEmpty() && result) {
				bw.write("yes\n");
			}else {
				bw.write("no\n");
			}
		}
			

		bw.flush();
		bw.close();
		br.close();
	}
	

}