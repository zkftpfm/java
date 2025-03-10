import siat.study.oop.domain.builder.ManagerVO;
import siat.study.oop.domain.builder.StudentVO;

public class OopBuilderMain {
    
    public static void main(String[] args) {
        

    // 빌더, 슈퍼빌더(상속관계, 생성자에서 상속받은 필드에 대한 접근)

    StudentVO stu = StudentVO.builder()
                            .name("영석")
                            .addr("동탄")
                            .stuID("21")
                            .build();
                        
    System.out.println(stu.perInfo());
    System.out.println(stu.stuInfo());

    ManagerVO emp = ManagerVO.builder()
                            .name("영석")
                            .addr("동탄")
                            .dept("siat")
                            .build();
    System.out.println(emp.perInfo());
    System.out.println(emp.empInfo());
                            
    }
}
