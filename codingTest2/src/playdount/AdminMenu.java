package playdount;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AdminMenu implements Menu {
    Scanner scanner = new Scanner(System.in);
    private Machine machine;
    private List<Item> items;
    private Map<Item, Integer> stocks;
    private Report report;

    public AdminMenu(Machine machine) {
        this.machine = machine;
        items = machine.getItems();
        stocks = machine.getStocks();
        report = machine.getReport();
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print(item);
            System.out.println(stocks.get(item) + "개");
        }
    }

    public void showMenus() {
        System.out.println("========= 관리자 메뉴  =======");
        System.out.println("1. 사용자의 구매 이력 보기");
        System.out.print("메뉴 번호를 입력하세요 :) ");
    }

    public void doProcess(int menuNum) {
        switch (menuNum) {
            case 1:
                report.print();
                break;
            default:
                System.out.println("잘못된 입력..");
                break;

        }
    }


}