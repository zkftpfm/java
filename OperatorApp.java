public class OperatorApp {
    // 객체생성시 전역변수의 초기화를 도움
    public OperatorApp() {

    }   
    
    public void example01() {
        System.out.println(">>> 산술연산자 +, -, *, /, %");
        int x = 100 , y = 100 , result = 0;
        System.out.println("+"+(x+y));
        System.out.println("-"+(x-y));
        System.out.println("*"+(x*y));
        System.out.println("/"+(x/y));
        System.out.println("%"+(x%y));

        System.out.println(">>> 증감연산자 ++, --");
        System.out.println("++"+(++x));

        int number = 20;
        result = ++number + 3;
        System.out.println("result = "+result);
        System.out.println(">>> 삼항연산자");
        String strMsg = (number > 0) ? "양수" : (number == 0 ) ? "0" : "음수" ;
        System.out.println("result = "+strMsg);
        System.out.println("논리연산자 &, |, !, &&, ||");
        System.out.println("관계연산자 >, >=, <, <=, ==, !=");
    }
    
    public String example02(String A, String B) {
        return A + "\t" +B ;
    }

    public String example03(int C) {
        String D = (C % 2 == 0) ? "짝수" : "홀수";
        return D;
    }

    public boolean example04(int h) {
        boolean isFlag = false;
        isFlag = (h > 0) & (h <= 100) ? true : false;
        return isFlag;
    }

}
