class Number_1 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count=0;
        int zeroCount = 0;
        int minNum=0, maxNum=0;
        for(int i=0;i<lottos.length;i++){
            if (lottos[i]==0)
                zeroCount++;
        }
        for(int i=0;i<win_nums.length;i++){
            for(int j=0;j<lottos.length;j++){
                if(win_nums[i]==lottos[j]){
                    count++;
                }
            }
        }
        minNum = 7-zeroCount-count;
        maxNum = 7-count;
        if(maxNum == 7){
            maxNum-=1;
        }
        if(minNum==7){
            minNum-=1;
        }
        answer[0] = minNum;
        answer[1] = maxNum;

        return answer;
    }

}