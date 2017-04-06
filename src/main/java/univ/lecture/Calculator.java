package univ.lecture;

/**
 * Created by tchi on 2017. 3. 19..
 */
public class Calculator {
    public int calculate(String exp) {
        return 2;
    }

    public int calculator(String postfix){}
    public String postfix(String infix){
    	//change to rear calculus
    
    	boolean endON = false;
        String postfix = new String();
        Stack stack = new Stack();
        
        for (int i = 0; i < infix.length(); i++) {
            switch (infix.charAt(i)) { 
	            case '0':
	            case '1':
	            case '2':
	            case '3':
	            case '4':
	            case '5':
	            case '6':
	            case '7':
	            case '8':
	            case '9':
	            	
	            case '.':
	                postfix = postfix.concat(infix.charAt(i) + "");
	                endON = true;
	                break;
	                
	            case '(':
	            	//if '(' come out add ' ' and push to stack
	                if (endON == true) {
	                   postfix = postfix.concat(" ");
	                   endON = false;
	                }
	                stack.push('(');
	                break;
	                
	            case ')': 
	            	// when ')' come out add ' ' and pop until '(' come out
	                if (endON == true) {
	                   postfix = postfix.concat(" ");
	                   endON = false;
	                }

	                while (((Character) stack.peek()).charValue() != '(') {
	                   postfix = postfix.concat(((Character) stack.pop()).toString());
	                   postfix = postfix.concat(" "); // add ' ' when pop once
	                }
	                Object o = stack.pop(); // pop '(' and throw away
	                break;
	            case '+':
	            case '-':
	            case '*':
            }
    }
    public int precedence(char c){}
}
