package univ.lecture;

/**
 * Created by tchi on 2017. 3. 19..
 */
public class Calculator {
    public int calculate(String exp) {
        return 2;
    }

    public int calculator(String postfix){}
    public String postfix(String infix){}
    public int precedence(char c){//return priority of operator
	swith(c){
		case '*' :
		case '/' :
			return 2;
		case '+' :
		case '-' ://kind of operator
			return 1;
		default:
			return 0;
    }
}
