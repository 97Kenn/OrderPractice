
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("工作人員新增商品請按　1 ，點餐系統，點餐請輸入數字 2 ，　退出此功能請按　9 ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        OrderService ordMeal1 = new OrderServiceImpl();


            switch (option){
                case 1:
                    System.out.println("~進入工作人員新增餐點介面~");
                    ordMeal1.setNewMeals();
                    System.out.println("工作人員新增商品請按　1 ，點餐系統，點餐請輸入數字 2 ，　退出此功能請按　9 ");
                    option = sc.nextInt();
                case 2:
                    System.out.println("~開始點餐~");
                    //預設餐點
                    ordMeal1.setOrderMeals();
                    ordMeal1.orderMeals();
                case 9:
                    System.out.println("~感謝您使用本次系統，即將退出~");
                    break;
            }

    }
}