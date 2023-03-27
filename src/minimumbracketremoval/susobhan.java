package minimumbracketremoval;
import java.util.*;
public class susobhan{
	public static void main(String args[]) {
		String str ="{{{{}}";
		System.out.print(minBracketReversal(str));
	}
	

public static int minBracketReversal(String str) {
    int len = str.length();
    if (len % 2 != 0) { // odd length strings cannot be balanced
        return -1;
    }
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < len; i++) {
        char c = str.charAt(i);
        if (c == '{') {
            stack.push(c);
        } else if (c=='}' && !stack.isEmpty() && stack.peek() == '{') {
            stack.pop();
        } else {
            stack.push(c);
        }
    }
    int unbalanced = stack.size();
    int count  = 0;
    while (!stack.isEmpty() && stack.peek() == '{') {
        stack.pop();
        count ++;
    }
    return unbalanced/2 + count%2;
}
}



