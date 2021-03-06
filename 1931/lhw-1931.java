import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        for (int i = 0; i <n ; i++) {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        //Sort 메소드를 사용하여 정렬을 진행.
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] start, int[] end) {
                if(start[1] == end[1]){
                    // 종료 시간이 같을경우엔 시작시간으로 정렬함
                    return Integer.compare(start[0], end[0]);
                }

                return Integer.compare(start[1], end[1]);
            }
        });
        
        int count =0;
        int end = -1;
        for (int i = 0; i <n ; i++) {
            if(arr[i][0] >= end){
                end = arr[i][1];
                count++;
            }
        }

        System.out.println(count);
  