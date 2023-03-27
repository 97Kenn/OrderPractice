import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderServiceImpl implements OrderService {

    //orderMeals用來存儲想訂購的商品
    Map<String, Integer> orderMeals = new HashMap<>();
    Meals mealsObj = new Meals();
    //Meals類別的餐點目錄Map ( 包含預設餐點與透過手動新增的 )
    Map mealPrices = mealsObj.meals;


    public void setOrderMeals() {
        mealsObj.setMeals("牛肉特餐", 300);
        mealsObj.setMeals("雞肉特餐", 200);
        mealsObj.setMeals("豬肉特餐", 100);
    }

    @Override
    public void setNewMeals() {

        while (true) {
            Scanner sc = new Scanner(System.in);
            Scanner scPrice = new Scanner(System.in);

            System.out.println("請輸入要新增的餐點，若要取消新增請輸入end");
            String food = sc.next();
            if (food.equals("end")) {
                break;
            }
            System.out.println("請輸入 \"" + food + "\" 要設定的價格");
            Integer price = scPrice.nextInt();
            mealsObj.setMeals(food, price);
        }

    }


    public void orderMeals() {

        Scanner sc = new Scanner(System.in);

        System.out.println("目前有的餐點如下");
        mealsObj.getMealsName();

        while (true) {
            System.out.println("請完整輸入你要的餐點名稱，若想完成點餐請輸入ok：");

            String orderMeal = sc.next();
            //如果輸入的餐點名稱與菜單中任一餐點相符就將該餐點放入orderMeals集合
            if (mealPrices.containsKey(orderMeal)) {
                System.out.println("請輸入你想點的" + orderMeal + "份數：");
                int mealCount = sc.nextInt();
                int mealPrice = (int) mealPrices.get(orderMeal);
                double mealTotalPrice = mealCount * mealPrice;
                System.out.println(orderMeal + "總價為：" + mealTotalPrice + "元");
                orderMeals.put(orderMeal, mealCount);
            }//輸入ok就進行結帳處理
            else if (orderMeal.equals("ok") || orderMeal.equals("OK")) {
                double total = 0.0;
                for (String mealName : orderMeals.keySet()) {
                    int mealCount = orderMeals.get(mealName);
                    int mealPrice = (int) mealPrices.get(mealName);
                    double mealTotalPrice = mealCount * mealPrice;
                    System.out.println(mealName + " " + mealCount + "份 / 價格：" + mealTotalPrice + "元");
                    total += mealTotalPrice;
                }
                if (total >= 5000) {
                    double discount = total * 0.9;
                    System.out.println("總價達到5000元，替您打了9折，折價後價格為：" + discount + "元");
                    System.out.println("未折扣總價格為：" + total + "元");
                } else {
                    System.out.println("總價格為：" + total + "元");
                }
                break;

            } else {
                System.out.println("請重新輸入正確的餐點名稱！");
            }

            }

        }
    }

