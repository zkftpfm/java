package siat.study.loop;

import lombok.Builder;

// 반복구문(for, while, do ~ while)
// for 반복횟수가 정의되어있을때
// while, do ~ while 반복횟수가 정의되어있지 않을때
// while 반복되지 않을수 있고
// do ~ while 무조건 한번은 반복
// break, continue


// for(초기식; 조건식 ; 증감식){}
// 
// 초기식
// while(조건식){
//  증감식}
// 
// do ~ while
// 초기식
// do {
//  증감식 
// }while(조건식)


@Builder
public class LoopApp {
    public int sumOneToTen() {
        int sum = 0 ;
        // sum = 1+2+3+4+5+6+7+8+9+10;
        for(int idx=1 ; idx<= 10; idx++)
            sum = sum + idx;
        return sum ;
    }

    public int sumStartToEnd(int start, int end) {
        int sum = 0;
        for(int idx=start; idx<= end; idx++ )
            sum += idx;
        return sum;
    }


    // 퀴즈, sumstartend 메서드 두개 만들어서, while 하나 dowhile 하나

    public int sumStartToEnd2(int start, int end) {
        int sum = 0;
        int idx = start;
        while(idx <= end) {
            sum += idx;
            idx++;
        }
        return sum;
    }

    public int sumStartToEnd3(int start, int end) {
        int sum = 0;
        int idx = start;
        do{
            sum += idx;
            idx++;
        } while(idx <= end);

        return sum;
    }


    // 퀴즈
    // 매개변수로 입력받은 값을 1 ~ 차례로 누적하여 합을 구하다가
    // 입력받은 값을 넘으면 중단하고
    // 마지막으로 더해진 값과 그 때까지의 합을 출력
    public void loopBreak(int number) {
        int sum = 0;
        int idx = 0;
        for(idx = 1; idx <= number;idx++) {
            System.out.println("idx ="+idx);
            sum += idx ;
            System.out.println("sum ="+sum);
        }
    //     for(int idx = 1; ;idx++)
    //         if (sum > number){
    //             break;
    //         }
    //         sum += idx ;
    // }

    }

    // 1 ~ 100 사이의 난수를 발생시켜서 해당 난수까지의 합


    public void sumRandom() {
        int nan = (int)(Math.random()* 100) + 1;
        System.out.println(nan);
        int sum = 0;
        for (int idx = 1; idx <=nan; idx++) {
            sum += idx ;
        }
        System.out.println(sum);
    }

    // 매개변수로 문자열 입력받아서 문자 하나하나를 반복문을 이용해서 출력
    public void popStr(String str) {
        System.out.println("debug "+str);
        for(int idx=0; idx < str.length(); idx++) {
            System.out.println(str.charAt(idx)+"\t");
        }
    }

    // 메서드가 클래스내에 정의된 다른 메서드를 호출
    public void gugudanRow(){
        for(int dan = 2 ; dan <= 9 ; dan++){
            gugudanCol(dan);
        }
    }
    private void gugudanCol(int dan){
        for(int col = 1 ; col <= 9 ; col++){
            System.out.printf("%d * %d = %d\t", dan, col, (dan*col));
        }
        System.out.println();
    }


    public void gugudanTables(){
        for(int dan = 2 ; dan <= 9 ; dan++){
            for(int col = 1 ; col <= 9 ; col++){
                System.out.printf("%d * %d = %d\t", dan, col, (dan*col));
            }
            System.out.println();
        }
    }


    // 퀴즈
    // 이중 반복문을 이용해서 출력예시처럼 출력
    // 23456
    // 34567
    // 45678
    // 56789
    // 678910
    public void printIJ() {
        for(int idx = 1; idx < 6 ; idx++){
            for(int jdx = 1; jdx < 6; jdx++){
                System.out.print(idx+jdx);
            }
            System.out.println();
        }
    }
}