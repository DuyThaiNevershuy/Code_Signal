import java.util.Stack;

public class reverseInParentheses {
    String solution(String inputString) {
        // int len = inputString.length();
        // Stack<Integer> s= new Stack<>();
        // StringBuffer sB = new StringBuffer();
        // String newStr = inputString;
        // sB.append(newStr);
        // for (int i = 0;i< len;i++){
        //     if(sB.charAt(i)=='('){
        //         s.push(i);
        //     }
        //     else if (sB.charAt(i) == ')' && !s.empty()){
        //         sB.reverse();  
        //     }   
        // }
        // for (int i=0;i<len;i++){
        //     if (sB.charAt(i) == '(' || sB.charAt(i)==')'){
        //         sB.delete(i, 1);
        //         i--;
        //         len--;       
        //     }
        // }
        // // for (int i =0;i<len;i++) {
        // //     if (sB.charAt(i) != '(' && sB.charAt(i) != ')') {
        // //         sb.append(c);
        // //     }
        // // }
        // return sB.toString();
        StringBuilder sB = new StringBuilder();
        Stack <String> stack = new Stack<>();
        for (char c : inputString.toCharArray()){
            if (c=='('){
                stack.push(sB.toString());
                sB=new StringBuilder();
            }
            //Neu gap ( thi lat vi tri cua ( ra
            else if (c==')'){
                String s = sB.toString();
                sB = new StringBuilder(stack.pop());
                sB.append(new StringBuilder(s).reverse().toString());
                 
            }
            else{
                 sB.append(c);
            }
        }
        return sB.toString();
    }    
}
