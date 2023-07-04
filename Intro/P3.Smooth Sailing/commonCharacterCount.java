public class commonCharacterCount {
    int solution(String s1, String s2) {
        int count=0;
        int []t1 = new int[26];
        int []t2 = new int[26];
        for (int i =0; i< s1.length() ; i++){
            t1[s1.charAt(i)-'a']++;
        }
        for (int i=0;i<s2.length(); i++){
            t2[s2.charAt(i) -'a']++;
        }
        for (int i=0;i<26;i++){
            count = count +Math.min(t1[i], t2[i]);
        }
        return count;
    }
}
