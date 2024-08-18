import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_25501{
	
    static int result;
    
    public static void main(String[] args) throws IOException{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
    	int T = Integer.parseInt(br.readLine());
    	for(int i = 0; i < T; i++) {
    		result = 0;
    		bw.write(isPalindrome(br.readLine())+ " " + String.valueOf(result) + "\n");
    	}
    	
    	
		br.close();
		bw.flush();
		bw.close();
    }
    
    public static int recursion(String s, int l, int r){
    	result++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}
