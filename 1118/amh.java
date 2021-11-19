class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        answer = new int[2];
        int countZero = 0;
        int countWin = 0;
        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                countZero++;
            }
            else {
                for (int j = 0; j < 6; j++) {
                    if (lottos[i] == win_nums[j]) {
                        countWin++;
                    }
                }
            }
        }
        
        int[] ranking = new int[] {6, 6, 5, 4, 3, 2, 1};
        answer[0] = ranking[countWin + countZero];
        answer[1] = ranking[countWin];
        return answer;
    }
}