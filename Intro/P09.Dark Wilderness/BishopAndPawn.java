public class BishopAndPawn {
    boolean solution(String bishop, String pawn) {
        //Vidu a1 va c3 tao co a1 = (a,1)hay la` (1,1) con c3 la: (3,3) --> 3-1 = 3-1;
        return Math.abs(bishop.charAt(0) - pawn.charAt(0)) == Math.abs(bishop.charAt(1) - pawn.charAt(1));
    }    
}
