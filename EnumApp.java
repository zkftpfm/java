//  자바의 상수의 집합타입 : enum

public enum EnumApp {
    STU("학생"),
    EMP("매니저"),
    TEA("강사");
    
    private final String division;
    private EnumApp(String division) {
        this.division = division ;
    }
    public String getDivision() {
        return this.division ;
    }
}
