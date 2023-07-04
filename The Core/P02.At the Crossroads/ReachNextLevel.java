public class ReachNextLevel {
    boolean solution(int experience, int threshold, int reward) {
        if(experience + reward < threshold) return false;
        else return true;
    }    
}
