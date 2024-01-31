package ch1;

// 자동 형(타입)변환 : promotion
// 정수형/문자형/살수형/논리형
// 타입 변환 가능함 : 작은 타입 => 큰 타입
// 연산시 타입변환이 일어남 : 작은 타입 => 큰타입 
public class PromotionEx1 {

    public static void main(String[] args) {
        byte v1 = 10;
        int intValue = v1;
        System.out.println("intValue = " + intValue);

        short s1 = 15;
        intValue = s1;
        System.out.println("intValue = " + intValue);

        char ch1 ='a';
        intValue = ch1;
        System.out.println("intValue = " + intValue);

        // int(4byte) => fioat(4byte)
        float floatValue = intValue;
        System.out.println("floatValue = " = floatValue);

        // 8byte
        long longValue = intValue;
        System.out.println("longtValue = " + longValue);

        double doubleValue = intValue;
        System.out.println("doubleValue = " + doubleValue);

        // int + double
        intValue =55;
        doubleValue = 98.25d;

        //int result = intValue + doubleValue;
        double result = intValue + doubleValue;
        System.out.println("int + double double 타입으로 변환됨");
        System.out.println(result);

        byte v2 =15;
        // byte byteValue = v1 + v2; => 정수를 변수에 담는다면 int 사용
        int byteValue = v1 + v2;
        System.out.println();
    }

}
