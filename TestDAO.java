public class TestDAO {
    
    private String [] ary ;

    // 객체생성시 호출되는 메서드로 멤버변수를 초기화하는 역활
    public TestDAO() {
        ary = new String[10] ;
    }

    public void test() {
        ary[0] = "siat";
        System.out.println(ary[0]);
    }

}
