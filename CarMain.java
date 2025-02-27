public class CarMain {
    public static void main(String[] args) {
       Car aa = new Car();
       aa.maker = "BMW";
       aa.model = "asd.123";
       aa.price = 70000;
       System.out.println("당신의 차는"+aa.maker+aa.model);
       System.out.println("차의 가격은 :"+aa.price);
       
       aa.drive();
       String result = aa.repaire();
       System.out.println("반환값 출력: "+result);

    
       aa.performence("고급휘발유");
       result = aa.speed(200);
       System.out.println("반환값 출력 :"+result);

    }
}
