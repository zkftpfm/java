package siat.study.prime;

import java.util.Scanner;

import lombok.Builder;

@Builder
public class PrimeApp {
    // 소수란 1과 자기자신으로만 나누어지는 수
    // 판단로직(for, if)
    // 0과 1은 소수가 아니다.
    // 어떤숫자가 소수인지 판단하려면 2 ~ 입력된숫자까지 차례대로 나누고
    // 나머지가 0인경우가 한번도 없으면 소수
    // N보다 작은 자연수들로 나누어지는 방식


    public String primeNumber() {
        String answer = "";
        System.out.println("소수 판별을 위해서 숫자를 입력하세요 :");
        Scanner scan = new Scanner(System.in) ;
        int number = scan.nextInt() ;
        // 소수란 1과 자기자신으로만 나누어지는 수
        // 판단로직(for, if)
        // 0과 1은 소수가 아니다.
        // 어떤숫자가 소수인지 판단하려면 2 ~ 입력된숫자까지 차례대로 나누고
        // 나머지가 0인경우가 한번도 없으면 소수
        // N보다 작은 자연수들로 나누어지는 방식
        for (int idx = 2; idx < number; idx++) {
            if ((number % idx ) == 0) {
                answer = "소수 아님";
                break;
            } else {
                answer = "소수";
                break;
            }
        }
        
        return answer ;
    }
}
