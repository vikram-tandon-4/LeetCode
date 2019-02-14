/*
 Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true
 */
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		System.out.println(isValid("{{()}}"));
	}
	
	 public static boolean isValid(String s) {
	        
	        if(s.length() == 0){
	            return true;
	        }
	        
	        Stack<String> st = new Stack<String>();
	        
	        for(int i =0; i< s.length();i++){
	            
	            String element = s.substring(i,i+1);
	            
	            if(element.equals("{") || element.equals("(") || element.equals("[")){
	                st.push(element);
	            }else if(element.equals("}")){
	                if(!st.empty() && st.peek().equals("{")){
	                    st.pop();
	                }else{
	                    return false;
	                }
	            }else if(!st.empty() && element.equals("]")){
	                if(st.peek().equals("[")){
	                    st.pop();
	                }else{
	                    return false;
	                }
	            }else if(!st.empty() && element.equals(")")){
	                if(st.peek().equals("(")){
	                    st.pop();
	                }else{
	                    return false;
	                }
	            }else{
	                return false;
	            }
	        }
	        
	        if(st.empty()){
	          return true;   
	        }
	       return false;
	    }

}
