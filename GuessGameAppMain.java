import siat.study.guess.GuessGameApp;

public class GuessGameAppMain {
    public static void main(String[] args) {
        int answer = GuessGameApp.generatorNan() ;
        System.out.println("정답:"+answer);
        GuessGameApp game = GuessGameApp.builder().build();
        String abc = game.gameFor(answer);
        System.out.println(abc);
    }
}
