import siat.study.prime.PrimeApp;

public class PrimeAppMain {
    public static void main(String[] args) {
        
        PrimeApp app = PrimeApp.builder().build();
        String end = app.primeNumber();
        System.out.println(end);

    }
}
