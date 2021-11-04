import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int meeting = number;

         
        // 타임 테이블 입력받기
        int[][] timeTable = new int[meeting][2];
        for (int i = 0; i < timeTable.length; i++) {
            timeTable[i][0] = scanner.nextInt();
            timeTable[i][1] = scanner.nextInt();
        }

        scanner.close();

        // 배열정렬 (종료 시점을 기준으로 오름차순)
        Arrays.sort(timeTable, new Comparator<int[]>() {
            @Override
            public int compare(int[] a1, int[] a2) {
                if(a1[1] == a2[1]) {
                    return a1[0] - a2[0];
                } else {
                    return a1[1] - a2[1];
                }
            }
        });

        int meetingCount = 0;
        int endTime = 0;

        for (int i = 0; i < timeTable.length; i++) {
            if (endTime <= timeTable[i][0]) {
                meetingCount++;
                endTime = timeTable[i][1];
            }
        }
        
        System.out.println(meetingCount);
    }
}