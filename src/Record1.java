import java.util.Scanner;

public class Record1 {
//        System.out.println("請輸入你想點的牛肉特餐份數 : ");
//        int beef = sc.nextInt();
//        System.out.println("請輸入你想點的雞肉特餐份數 : ");
//        int chicken = sc.nextInt();
//        System.out.println("請輸入你想點的豬肉特餐份數 : ");
//        int pork = sc.nextInt();
//
//        int beefTotalPrice = beef * beefPrice;
//        int chickenTotalPrice = chicken * chickenPrice;
//        int porkTotalPrice = pork * porkPrice;
//
//        System.out.println("您總共點了"
//                +"\n牛肉特餐: " + beef + "份" + " / 價格為 : " + beefTotalPrice
//                +"\n雞肉特餐: " + chicken + "份" + " / 價格為 : " + chickenTotalPrice
//                +"\n豬肉特餐: " + pork + "份" + " / 價格為 : " + porkTotalPrice
//        );
//        int total =  beefTotalPrice + chickenTotalPrice + porkTotalPrice;
//
//        if(total >= 5000){
//            double discount = total * 0.9;
//            System.out.println("總價達到5000元，替您打了9折，折價後價格為 : " + discount + "元");
//            System.out.println("未折扣總價格為 : " + total + "元");
//        }else {
//            System.out.println("總價格為 : " + total + "元");
//        }



//    @Override
//    public void orderMeals() {
//        Scanner sc = new Scanner(System.in);
//
//        int beefPrice = mealsObj.getMeals("牛肉特餐");
//        int chickenPrice = mealsObj.getMeals("雞肉特餐");
//        int porkPrice = mealsObj.getMeals("豬肉特餐");
//
//
//        System.out.println("目前有的餐點如下");
//        mealsObj.getMealsName();
//
//        while (true) {
//            System.out.println("請完整輸入你要的餐點名稱，若想完成點餐請輸入ok");
//
//            String orderMeal = sc.next();
//
//            if (orderMeal.equals("牛肉特餐")) {
//                System.out.println("請輸入你想點的牛肉特餐份數 : ");
//                int beefCount = sc.nextInt();
//                int beefTotalPrice = beefCount * beefPrice;
//                System.out.println("牛肉特餐總價為 : " + beefTotalPrice + "元");
//                orderMeals.put(orderMeal, beefCount);
//            } else if (orderMeal.equals("雞肉特餐")) {
//                System.out.println("請輸入你想點的雞肉特餐份數 : ");
//                int chickenCount = sc.nextInt();
//                int chickenTotalPrice = chickenCount * chickenPrice;
//                System.out.println("雞肉特餐總價為 : " + chickenTotalPrice + "元");
//                orderMeals.put(orderMeal, chickenCount);
//            } else if (orderMeal.equals("豬肉特餐")) {
//                System.out.println("請輸入你想點的豬肉特餐份數 : ");
//                int porkCount = sc.nextInt();
//                int porkTotalPrice = porkCount * porkPrice;
//                System.out.println("豬肉特餐總價為 : " + porkTotalPrice + "元");
//                orderMeals.put(orderMeal, porkCount);
//            } else if (orderMeal.equals("ok")) {
//
//                if (orderMeals.get("牛肉特餐") != null) {
//                    int beefCount = orderMeals.get("牛肉特餐");
//                    beefTotalPrice = beefCount * beefPrice;
//                    System.out.println("牛肉特餐 " + beefCount + "份 / 價格 : " + beefTotalPrice);
//                }
//                if (orderMeals.get("雞肉特餐") != null) {
//                    int chickenCount = orderMeals.get("雞肉特餐");
//                    chickenTotalPrice = chickenCount * chickenPrice;
//                    System.out.println("雞肉特餐 " + chickenCount + "份 / 價格 : " + chickenTotalPrice);
//                }
//                if (orderMeals.get("豬肉特餐") != null) {
//                    int porkCount = orderMeals.get("豬肉特餐");
//                    porkTotalPrice = porkCount * porkPrice;
//                    System.out.println("豬肉特餐 " + porkCount + "份 / 價格 : " + porkTotalPrice);
//                }
//
//                int total = beefTotalPrice + chickenTotalPrice + porkTotalPrice;
//                if (total >= 5000) {
//                    double discount = total * 0.9;
//                    System.out.println("總價達到5000元，替您打了9折，折價後價格為 : " + discount + "元");
//                    System.out.println("未折扣總價格為 : " + total + "元");
//                } else {
//                    System.out.println("總價格為 : " + total + "元");
//                }
//                break;
//
//            } else {
//                System.out.println("!!請重新輸入正確餐點全稱!!");
//            }
//
//           }
//
//
//    }
}
