public class OperatorMain {
    public static void main(String[] args) {
       OperatorApp abc = new OperatorApp();
       abc.example01();

    String returnMsg = abc.example02("red", "green");
    System.out.println("result = "+returnMsg);

    String answer = abc.example03(70);
    System.out.println(answer);

    boolean mama = abc.example04(70);
    System.out.println(mama);
    }


}
