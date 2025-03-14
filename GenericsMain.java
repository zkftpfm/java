
// 제너릭
// 컴파일 시점에 타입의 안정성
// 불필요한 캐스팅을 지양
// 여러 데이터 타입을 표준화한 클래스를 만들수 있다.
// T 타입, K 키, V 밸류, E 요소의 타입

import java.util.ArrayList;
import java.util.List;

import siat.study.generic.Golf;
import siat.study.generic.Skating;
import siat.study.generic.SortTrack;
import siat.study.generic.SpeedSkating;
import siat.study.generic.Sports;

public class GenericsMain {
    public static void main(String[] args) {
        String [] strAry = new String[]{"siat", "java", "python"};
        Integer [] intAry = new Integer[]{1,2,3,4,5};

        printAry(strAry);
        printAry(intAry);

        System.out.println(">>> 다형성");
        List<Sports> sportLst = new ArrayList<>() ;
        sportLst.add(new Golf());
        sportLst.add(new Skating());
        sportLst.add(new SortTrack());
        sportLst.add(new SpeedSkating());

        System.out.println(">>> 와일드 카드 : 하나 이상의 타입을 지정해야하는 경우");
        // <?> 모든변수, <? extends xxx> 매개변수 선언시, <? super xxx> 선언시.
        List<? super Sports> cardLst = new ArrayList<>() ;
        cardLst.add(new Golf());
        cardLst.add(new Skating());
        cardLst.add(new SortTrack());
        cardLst.add(new SpeedSkating());
    }

    // public static void printAry(String [] ary) {

    // }

    // public static void printAry(Integer [] ary) {

    // }

    public static<T> void printAry(T [] ary) {
        for(T e : ary) {
            System.out.println(e);
        }
    }


    
}
