package siat.study.guess;

import java.util.Scanner;

import lombok.Builder;

@Builder
public class GuessGameApp {
    
    public static int generatorNan() {
        int answer =(int)(Math.random() * 100) + 1 ;
        return answer ;
    }


    // 매개변수로 정답을 전달받고
    // 반환값으로
    // 성공) xx번째 정답을 맞췄습니다.
    // 실패) 10번의 기회를 모두 사용하였습니다.

    public String gameFor(int answer) {
        String result = "오답입니다.";
        for (int idx = 1; idx < 11; idx++){
            Scanner scan = new Scanner(System.in);
            System.out.println("숫자를 입력하세요");
            int a = scan.nextInt() ;
                if (a == answer){
                    result = "정답입니다.";
                    break;
                } 
    }
        return result;
    }

    public String gameWhile(int answer) {
        return null;
    }

    
    public String gameDoWhile(int answer) {
        return null;
    }


}