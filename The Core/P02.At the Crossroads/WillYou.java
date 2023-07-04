public class WillYou {
    boolean solution(boolean young, boolean beautiful, boolean loved) {
        if(young && beautiful && !loved ) return true;
        else if((!young || !beautiful) && loved) return true;
        else return false;
    }    
}
