package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShop implements IShop {

  // 타입 : 객체(Integer, String, member)
  // List<타입> list new ArrayList<>();
  // ArrayList<타입> list = new ArrayList<>();

  // private Customer customers[] = new Customer[5];
  List<Customer> customers = new ArratList<>();
  // private Product products[] = new Product[5];
  List<products> rProducts = new ArrayList<>();

  private String title;
  private int customerNo;
  // 장바구니
  //   CellPhone cellPhone[] = new CellPhone[5];
  //   SmartTv smartTv[] = new SmartTv[5];
  private Product carts[] = new Product[5]; // Cellphone과 SmartTv를 둘다 담아야 하기 때문에

  Scanner sc = new Scanner(System.in);

  @Override
  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public void genUser() {
    // 고객 생성
    Customer customer = new Customer();
    customer.setName("홍길동");
    customer.setPayType(PayType.CARD);
    customers.add(customer);

    customer = new Customer();
    customer.setName("성춘향");
    customer.setPayType(PayType.CARD);
    customers.add(customer);

    customer = new Customer();
    customer.setName("이순신");
    customer.setPayType(PayType.CARD);
    customers.add(customer);

    customer = new Customer();
    customer.setName("정우성");
    customer.setPayType(PayType.CARD);
    customers.add(customer);

    customer = new Customer();
    customer.setName("이정재");
    customer.setPayType(PayType.CARD);
    customers.add(customer);
  }

  @Override
  public void genProduct() {
    // 제품 생성
    CellPhone phone = new CellPhone("갤럭시 노트", 500000, "U+");
  }

  @Override
  public void start() {
    System.out.println(title + "메인화면 - 계정선택");
    System.out.println("===========================================");

    for (int i = 0; i < customers.size(); i++) {}
    System.out.println("[X] 종료");

    // 사용자에게 고객 번호 입력받기
    System.out.println("고객번호 >> ");
    String cNo = sc.nextLine(); // 0 ~ 4, X
    System.out.println("### " + cNo + "고객 선택 ###");

    customerNo = Integer;

    if (cNo.equals("X")) {} else { // 0~4
      productList();
    }
  }

  public void productList() {
    // 상픔 목록 출력
    System.out.println(title + "상픔 목록 - 상품 선택");
    System.out.println("===========================================");

    for (int i = 0; i < customers.size(); i++) {
      System.out.printf("[%d]", i);
      products.get[i].printDetail();
    }
    System.out.println("[h] 메인화면");
    System.out.println("[c] 메인화면");

    System.out.println("상품번호");
    String menu = sc.nextLine();

    switch (menu) {
      case "h":
        start();
        break;
      case "c":
        checkOut();
        break;
      default: // 0~4 에 해당하는 제품을 장바구니에 추가
        carts.add(products.get[Integer.parseInt(menu)]);

        productList();
    }
  }

  public void checkOut() {
    System.out.println("\n");
    System.out.println(title + " : 체크아웃");
    System.out.println("=============================");

    int i = 0, total = 0;
    for (Product product : carts) {
      if (product != null) {
        System.out.printf(
          "[%d] %s %d\n",
          i,
          product.getPname(),
          product.getPrice()
        );
        total += product.getPrice();
      }
    }
    System.out.println("=============================");
    System.out.println("합계 : " + total);
    System.out.println("결제방법 : " + customers[customerNo].getPayType());
    System.out.println("[p] 이전");
    System.out.println("[q] 결제");
    String menu = sc.nextLine();
  }
}
