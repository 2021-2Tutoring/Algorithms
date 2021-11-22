import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        int answer = 0;
        n-=lost.length;
        for(int i=0;i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                if(lost[i]==reserve[j]){
                    n++;
                    lost[i]=-1;
                    reserve[j]=-1;
                }
            }
        }
        for(int i=0;i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                if(lost[i]+1==reserve[j] || lost[i]-1==reserve[j]){
                    n++;
                    reserve[j]=-1;
                    break;
                }
            }
        }
        answer = n;
        return answer;
    }
}