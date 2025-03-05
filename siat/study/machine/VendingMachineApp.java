package siat.study.machine;

import java.util.Scanner;

import lombok.Builder;

@Builder
public class VendingMachineApp {
    
    // 콜라, 물, 비타민음료 변수정의
    public static final int COLA = 800 ;
    public static final int WATER = 500 ;
    public static final int VITAMIN = 1500 ;

    int returnM = 0 ;
    // type = if, switch
    public void init(String type) {
        switch(type) {
            case "if" :
                menuIf();
                break;
            case "switch" :
                menuSwitch();
                break;
            default :
            System.out.println("정확한 타입을 입력하세요.. 프로그램을 종료합니다.");
            System.exit(0);
        }
    }
    public void menuIf() {
        System.out.println(">>>> IF Ver Vending Menu <<<<");
        System.out.println("메뉴를 고르세요");
        System.out.println("1. 콜라(800) 2. 생수(500) 3. 비타민워터(1500)");
        

        Scanner scan = new Scanner(System.in);
        System.out.print("원하시는 음료를 선택하세요 :");
        int choiceNum = scan.nextInt() ;
        System.out.print("투입구에 돈을 넣어주세요 :");
        int inputMoney = scan.nextInt() ;
        // 조건판단 및 잔액반환을 생각
        // 선택한 메뉴와 금액을 판단하여 조건처리
        // 잔액은 천원, 오백원, 백원으로 나누어서 생각
        // 반환금액 출력
        if (choiceNum == 1 && inputMoney >= COLA) {
        returnM = inputMoney - 800 ;
        System.out.printf("콜라와 잔액 %d이 나옵니다.", returnM);
        System.out.printf("천원 : %d, 오백원 : %d, 백원 %d", (returnM/1000), (returnM%1000)/500, ((returnM%1000)%500)/100);
        } else if (choiceNum == 2 && inputMoney >= WATER) {
        returnM = inputMoney - 500 ;
        System.out.printf("생수와 잔액 %d이 나옵니다.", returnM);
        System.out.printf("천원 : %d, 오백원 : %d, 백원 %d", (returnM/1000), (returnM%1000)/500, ((returnM%1000)%500)/100);
        } else if (choiceNum == 3 && inputMoney >= VITAMIN) {
        returnM = inputMoney - 1500 ;
        System.out.printf("비타민음료와 잔액 %d이 나옵니다.", returnM);
        System.out.printf("천원 : %d, 오백원 : %d, 백원 %d", (returnM/1000), (returnM%1000)/500, ((returnM%1000)%500)/100);
        } else {
        System.out.println("바른 번호와 금액을 넣어주세요");

    }   
}



    public void menuSwitch() {
        System.out.println(">>>> SWITCH Ver Vending Menu <<<<");
        System.out.println("메뉴를 고르세요");
        System.out.println("1. 콜라(800) 2. 생수(500) 3. 비타민워터(1500)");

        Scanner scan = new Scanner(System.in);
        System.out.print("원하시는 음료를 선택하세요 :");
        int choiceNum = scan.nextInt() ;
        System.out.print("투입구에 돈을 넣어주세요 :");
        int inputMoney = scan.nextInt() ;


        switch(choiceNum) {
            case 1:
                returnM = inputMoney - COLA ;
                System.out.printf("콜라와 잔액 %d이 나옵니다.", returnM);
                System.out.printf("천원 : %d, 오백원 : %d, 백원 %d", (returnM/1000), (returnM%1000)/500, ((returnM%1000)%500)/100);
                break;
            case 2:
                returnM = inputMoney - WATER ;
                System.out.printf("생수와 잔액 %d이 나옵니다.", returnM);
                System.out.printf("천원 : %d, 오백원 : %d, 백원 %d", (returnM/1000), (returnM%1000)/500, ((returnM%1000)%500)/100);
                break;
            case 3:
                returnM = inputMoney - VITAMIN ;
                System.out.printf("비타민음료와 잔액 %d이 나옵니다.", returnM);
                System.out.printf("천원 : %d, 오백원 : %d, 백원 %d", (returnM/1000), (returnM%1000)/500, ((returnM%1000)%500)/100);
                break;

            default :
                System.out.println("바른 번호와 금액을 넣어주세요");
                break;
        }
    }

    // 스위치 케이스에서 각 케이스에 대해 상수값을 '가격'에 할당 받고
    // 다음 이프문에서 "가격"값이 입력값보다 적고 많고로 구문작성

    // 메뉴만들기
    // System.out.println("메뉴를 고르세요");
    //     System.out.println("1. 콜라(800) 2. 생수(500) 3. 비타민워터(1500)");

    //     Scanner scan = new Scanner(System.in);
    //     System.out.print("원하시는 음료를 선택하세요 :");
    //     int choiceNum = scan.nextInt() ;
    //     System.out.print("투입구에 돈을 넣어주세요 :");
    //     int inputMoney = scan.nextInt() ;

}
