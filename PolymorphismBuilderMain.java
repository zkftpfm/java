import siat.study.oop.domain.builder.PersonVO;
import siat.study.oop.service.PolymorphismBuilderService;
import siat.study.oop.util.EnumOop;

public class PolymorphismBuilderMain {
    
    public static void main(String[] args) {
        PolymorphismBuilderService service = PolymorphismBuilderService.builder()
                                                                    .perAry(new PersonVO[10])
                                                                    .build() ;

                                                                    
        service.makePerson(EnumOop.TEA, "임정섭", "서울", "자바") ;
        service.makePerson(EnumOop.STU, "박신형", "서울", "2018") ;
        service.makePerson(EnumOop.EMP, "이진규", "서울", "교육운영팀") ;


        
        System.out.println(">>>> 전체출력");
        PersonVO [] ary = service.getPerson();
        for(int idx=0; idx < ary.length ; idx++) {
            PersonVO per = ary[idx] ;
            System.out.println(per.perInfo());

        System.out.println("퀴즈)");
        System.out.println("사용자 검색");
        PersonVO per = service.findPerson("박신형");
        if (per == null) {
            System.out.println("요청하신 사용자를 찾을 수 없습니다.");
        } else {
            System.out.println(per.perInfo());
        }

    }
}
}