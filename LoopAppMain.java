import siat.study.loop.LoopApp;

public class LoopAppMain {
    public static void main(String[] args) {
        LoopApp app = LoopApp.builder()
                                .build() ;
        // int result = app.sumOneToTen() ;
        // System.out.println(result);

        int result = app.sumStartToEnd(1, 700) ;
        System.out.println(result);

        // int result = app.sumStartToEnd3(1, 10000) ;
        // System.out.println(result);
    
        // app.sumRandom();

        // app.popStr("jslim");

        // app.gugudanRow();
        // app.gugudanTables();

        app.printIJ();


    }
}
