import java.util.Scanner;

public class amh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String code = scanner.next();       // 코드 종류 입력
        String find = scanner.next();       // 찾을 패턴 입력
        String[] c = code.split("");            // 입력된 코드를 배열에 넣기
        String[] f = find.split("");            // 입력된 패턴을 배열에 넣기

        int front = 0;                          // 원형 큐의 시작점
        int move = 0;                           // 움직임 횟수

        for (int i = 0 ; i < f.length; i++) {
            // 오른쪽으로 돌리기
            int countR = 0;
            int frontR;
            for (frontR = front; frontR < c.length; frontR++) {
                if (c[frontR].equals(f[i])) {
                    countR++;
                    break;
                }
                else {
                    countR++;
                    if (frontR == (c.length - 1)) {
                        frontR = -1;
                    }
                }
            }

            // 왼쪽으로 돌리기
            int countL = 0;
            int frontL;
            for (frontL = front; frontL < c.length; frontL--) {
                if (c[frontL].equals(f[i])) {
                    countL++;
                    break;
                }
                else {
                    countL++;
                    if (frontL == 0) {
                        frontL = c.length;
                    }
                }
            }

            if (countR > countL) {
                move += countL;
                front = frontL;
            }
            else {
                move += countR;
                front = frontR;
            }
        }
        System.out.println("총 움직인 횟수 : " + move);
        scanner.close();
    }
}
