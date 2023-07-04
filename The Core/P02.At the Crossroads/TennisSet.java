public class TennisSet {
    boolean solution(int score1, int score2) {
        if(score1 == 8 || score2 == 8) return false;
        // if((score1 == 7 && score2 <=5) ||(score2 == 7 && score1 <=5)) return true;
        if((score1 == 7 && score1 - score2 ==2) ||(score2 == 7 && score2 - score1 ==2 )) return true; //TH thắng 7-5
        if((score1 == 6 && score2 <=4) ||(score2 == 6 && score1 <=4)) return true; //TH thắng với điểm số 6
        // if((score1 == 7 && score2 <5) ||(score2 == 7 && score1 <5)) return false;
        if((score1 == 7 && (score2 == 6) ) ||(score2 == 7 && (score1==6))) return true; //TH thắng với tỉ số 7-6
        else return false;
    }    
}
