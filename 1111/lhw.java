import java.util.Scanner;

public class Number_1 {
    static int move(char[] orig, char before, char after){
        int index_before=-1, index_after=-1;
        int move = 0;

        for(int i=0;i<orig.length;i++){
            if(orig[i]==before){
                index_before = i;
            }
            if(orig[i]==after){
                index_after = i;
            }
        }
        move = index_after - index_before;

        if(move > orig.length/2){
            move = orig.length - move;
        }else if(move>0) {
            move = move;
        }else if(move > -1 * (orig.length/2)){
            move *= -1;
        }else{
            move = orig.length+move;
        }
        return move;
    }
    static int Solution(String original, String passwd){
        char[] char_orig = original.toCharArray();
        char[] ans_orig = passwd.toCharArray();
        int answer = 0;
        answer += move(char_orig, char_orig[0], ans_orig[0]);
        answer++;
        for(int i=0;i<ans_orig.length-1;i++){
            answer += move(char_orig, ans_orig[i], ans_orig[i+1]);
            answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String orig = sc.next();
        String passwd = sc.next();
        int answer = Solution(orig, passwd);
        System.out.println("Answer = "+answer);
    }
}
