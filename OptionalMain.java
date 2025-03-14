import java.util.List;
import java.util.Optional;

import siat.study.oop.domain.constructor.PersonVO;
// Optional
// 어떤 메서드가 null을 반환할지 확신할수 없거나, null처리를 놓쳐서 발생하는 예외를 피할수 있는 것
// 예외처리를 더 쉽게 할수 있어 코드의 가독성이 높아지고, 유지보수 편함
// ver 8
// Spring JavaPersistanceAPI
// 주의사항
// 사용의도에 맞게 사용(null할당x)
// 메서드의 반환타입으로 사용(전역변수 타입 x, 매개변수 x)
// 기본타입(primitive type) -> Wrapper Class -> 원시타입 용도로 만들어진 클래스
public class OptionalMain {
    public static void main(String[] args) {
        // System.out.println("main start");

        OptionalApp app = new OptionalApp() ;
        Optional<PersonVO> result = app.findById(1L) ;
        if( result.isPresent()) {
            System.out.println(result.get().perInfo());
        }
        System.out.println(">>>");
        Optional<List<PersonVO>> list = app.getUsers();
        if(list.isPresent()) {
            list.get().stream().forEach(System.out::println);
        }
        // List<String> lst = app.getStr() ;
        // System.out.println(lst.size());
        
        // NPE: NullPointerException

        // System.out.println("main end");
        

        System.out.println(">>>> 생성방법");
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        Optional<String> opt = Optional.of("siat");
        System.out.println(opt);
        System.out.println(">>>");
        if(opt.isPresent()) {
            System.out.println(opt.get());
        }
        // opt.ifPresent(str -> System.out.println(str));
        opt.ifPresentOrElse(str -> System.out.println(str), () -> System.out.println("empty"));

        System.out.println(">>> orElse");
        String value = opt.orElse("Default Value");
        System.out.println(value);
        String value1 = empty.orElse("Default Value");
        System.out.println(value1);
        System.out.println(empty.orElseGet(() -> "Default Lambda Value"));
        // empty.orElseThrow( () -> new RuntimeException("because empty"));        
        System.out.println(">>>> end");


        System.out.println(">>>> filter");
        opt.filter(str -> str.length() >= 4)
            .ifPresent(str -> System.out.println("filter value "+str));

        System.out.println(">>> map");
        opt.map(String::toUpperCase)
            .ifPresent(str -> System.out.println(str));
        
        opt.flatMap(str -> Optional.of(str))
            .ifPresent(str -> System.out.println(str));

            
        opt.flatMap(str -> Optional.of(str)
                                    .map(String::toUpperCase))
            .ifPresent(str -> System.out.println(str));
        
        System.out.println(">>> 디버그");
        Optional<String> optNull = Optional.ofNullable(null);
        System.out.println(optNull);
        System.out.println(">>>> 메서드 사용");

        
    }
}
