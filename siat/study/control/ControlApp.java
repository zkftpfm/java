package siat.study.control;

public class ControlApp {
    // 조건식 A 또는 B를 기대할수있는것
    //  if(조건식){
    // } else {
    // }

    // switch(값) {
    //      case 값 :
    //          구현
    //          break ;
    //      default :
    //          구현
    // }


    // 매개변수 1~3
    // 1: 금도끼, 2: 은도끼, 3: 쇠도끼
    // 나무꾼이 1번 고르면 -> '거짓말 이구나'
    // 나무꾼이 2번 고르면 -> '거짓말 이구나'
    // 나무꾼이 3번 고르면 -> '정직하구나 너에게 모든 도끼를 주겠다.'
    public String woodMan2(int number) {
        String msg = null ;
        if(number >= 1 && number <= 3) {
            System.out.println("산신령 등장");
            
            switch (number) {
                case 1 :
                    msg = "거짓말 ㄴㄴ";
                    break;
                case 2 :
                    msg = "거짓말 ㄴㄴ";
                    break;
                case 3 :
                    msg = "정직하구나";
                    break;
                default:
                    break;
            }
        } else {
            msg = "다시고르렴" ;
        }

        return msg ;

    }


    public String woodMan(int number) {
        String msg = null ;
        if(number >= 1 && number <= 3) {
            System.out.println("산신령 등장");
            if(number == 1) {
                msg = "거짓말 ㄴㄴ";
            } else if(number == 2) {
                msg = "거짓말 ㄴㄴ";
            } else {
                msg = "정직하구나 도끼 다해라";
            }
        } else {
            msg = "다시고르렴" ;
        }

        return msg ;

    }


    // 퀴즈
    // 파라미터 국어 영어 수학
    // return type : 합격 불합격
    // 메서드명 passorNonpass
    // 세 과목의 점수가 각각 40점 이상
    //   평균 60점 이상 합격
    // 아니면 불합격
    

    public String passorNonpass(int kor, int eng, int math) {
        String result = null;
        double avg = (kor+eng+math) / 3 ;
        System.out.println("debug avg"+avg);
        if( kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
            result = "합격입니다.";
        } else {
            if (avg < 60) {
                result = "평균미달";
            }
            else if (kor < 40) {
                result = "국어미달";
            }
            else if (eng < 40) {
                result = "영어미달";
            }
            else if (math < 40) {
                result = "수학미달";
            }
        }
        
        return result ;
    }

    public double calc(int x, char oper, int y) {
        double result = 0.0 ;
        switch (oper) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
        }

        return result ;

    }

    }



