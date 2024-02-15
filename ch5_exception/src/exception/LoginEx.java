package exception;

import java.util.Scanner;

public class LoginEx {
    public static void main(String[] args) {
        // 사용자로부터 아이디와 비밀번호 입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.println("input Id >> ");
        String id = sc.nextline
        // 아이디가 blue 와 일치하지 않으면 NotExisitIdException 발생

        // 비밀번호가 12345와 일치하지 않으면 WrongPasswaordException 발생

    }

    public static void login(String id, String pwd){
        if(!id.equals("blue")){
            throw new NotExisitIdException("아이디를 확인해 주세요.");
        } 
    }
}
