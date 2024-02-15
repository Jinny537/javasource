package shop;

import java.util.Scanner;

public class ShopEx {

  public static void main(String[] args) {
    IShop shop = new MyShop();
    shop.setTitle("MyShop");
    shop.genUser();
    shop.genProduct();
    shop.start();
  }
}
