public class TestMain {
    public static void main(String[] args) {
        TestDAO dao = new TestDAO();
        dao.test();
        // TestDAO dao = TestDAO.builder()  
        //                     .ary(new String[10])    
        //                     .build();
    }
}
