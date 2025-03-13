import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import siat.study.stream.ProductVO;

public class StreamProdAppMain {
    public static void main(String[] args) {
        // 요구사항 명세서
        // 1. 더미데이터 넣어서 ProductVO 10개의 객체를 생성하고(Builder)
        // 2. Stream 복사
        // 3. 2025년에 생산된 모든 제품을 찾아 출력(오름차순정렬-가격을 기준으로)
        // 4. 생산지역이 부산인곳을 찾아 출력
        // 5. 제품가격이 가장 높은 제품의 정보를 출력
        // 6. 제품이름을 출력하라.(오름차순 정렬)

        List<ProductVO> lst = new ArrayList<>();
        lst.add(ProductVO.builder()
                            .prodName("pencil1")
                            .location("seoul")
                            .prodYear(2025)
                            .prodPrice(1000)
                            .build());
        lst.add(ProductVO.builder()
                            .prodName("pencil2")
                            .location("seoul")
                            .prodYear(2025)
                            .prodPrice(1000)
                            .build());
        lst.add(ProductVO.builder()
                            .prodName("pencil3")
                            .location("seoul")
                            .prodYear(2025)
                            .prodPrice(1000)
                            .build());
        lst.add(ProductVO.builder()
                            .prodName("pencil4")
                            .location("seoul")
                            .prodYear(2025)
                            .prodPrice(1000)
                            .build());
        lst.add(ProductVO.builder()
                            .prodName("pencil5")
                            .location("seoul")
                            .prodYear(2025)
                            .prodPrice(1000)
                            .build());
        lst.add(ProductVO.builder()
                            .prodName("pencil6")
                            .location("seoul")
                            .prodYear(2025)
                            .prodPrice(1000)
                            .build());
        lst.add(ProductVO.builder()
                            .prodName("pencil7")
                            .location("seoul")
                            .prodYear(2025)
                            .prodPrice(1000)
                            .build());
        lst.add(ProductVO.builder()
                            .prodName("pencil8")
                            .location("seoul")
                            .prodYear(2025)
                            .prodPrice(1000)
                            .build());
        lst.add(ProductVO.builder()
                            .prodName("pencil9")
                            .location("seoul")
                            .prodYear(2025)
                            .prodPrice(1000)
                            .build());
        lst.add(ProductVO.builder()
                            .prodName("pencil10")
                            .location("seoul")
                            .prodYear(2025)
                            .prodPrice(1000)
                            .build());

        System.out.println(">>> 디버그"+lst);
        
        System.out.println("2025년 생산 제품 (가격 오름차순):");
        lst.stream()
            .filter(prodYear ->  == 2025)
            .sorted()
            .forEach(System.out::println);



        // ProductVO prd = ProductVO.builder().build();
        // Stream abc = prd.stream();
    }
}
