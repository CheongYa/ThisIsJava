//do-while문
package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        System.out.println("메세지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        String inputString;

        do{         //처음은 무조건 실행
            System.out.print(">");
            inputString = scanner.nextLine();
            System.out.println(inputString);
        } while(! inputString.equals("q"));     //입력된 내용이 q가 아니라면 계속 반복

        System.out.println();
        System.out.println("프로그램 종료");
    }
}
