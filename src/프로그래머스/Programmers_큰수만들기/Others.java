package 프로그래머스.Programmers_큰수만들기;

public class Others {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder(number);
        for (int i = 0; i+1 < sb.length() && k>0; i++) {
            if(sb.charAt(i) < sb.charAt(i+1)) {
                sb.deleteCharAt(i);
                i=-1;
                k--;
            }
        }
        if(k!=0)
            sb.delete(sb.length()-k, sb.length());
        return sb.toString();
    }
}
