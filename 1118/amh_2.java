class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int s = lost.length;
        
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = 0;
                    reserve[j] = 0;
                    s--;
                }
            }
        }
        
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] != 0) {
                    if (lost[i]-1 == reserve[j]) {
                        lost[i] = 0;
                        reserve[j] = 0;
                        s--;
                        break;
                    }
                    else if (lost[i]+1 == reserve[j]) {
                        lost[i] = 0;
                        reserve[j] = 0;
                        s--;
                        break;
                    }
                }
            }
        }
        answer = n - s;
        
        return answer;
    }
}