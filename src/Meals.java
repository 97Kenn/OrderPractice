import java.util.*;

public class Meals {
    //菜單MAP
    Map<String,Integer> meals = new HashMap<>();

    public Integer getMeals(String food) {
        return meals.get(food);
    }
    //印出所有meals集合中的餐點名稱
    public void getMealsName(){
        for (String key : meals.keySet()) {
            System.out.print(key);
            System.out.println(": "  + meals.get(key) + "元");
        }
    }

//    public List<String> getMealsKey(){
//        List<String> mealsKeys = new ArrayList<>(meals.keySet());
//        return mealsKeys;
//    }

    //新增餐點方法
    public void setMeals(String food, Integer price) {
        Integer oldValue = meals.putIfAbsent(food, price);
        if (oldValue != null) {
            // 餐點已經存在，可以選擇要覆蓋該 key-value 對或拋出一個異常。
            System.out.println("餐點: \"" + food + "\" 已經新增過了! 請新增新品項");
            System.out.println("若您要覆蓋此餐點請輸入yes，若不要則輸入no");
            Scanner sc = new Scanner(System.in);
            String change = sc.next();
            if(change.equals("yes")){
                System.out.println("餐點: \"" + food + "\" 價格已被更新為 " + price);
                meals.put(food, price);
            }
            else if (change.equals("no")){
                price = oldValue;
                System.out.println("餐點: \"" + food + "\" 價格沒有被更新，維持原價 " + oldValue);
            }else {
                System.out.println("餐點: \"" + food + "\" 價格沒有被更新，維持原價 " + oldValue);
            }
        } else {
            // 餐點不存在，可以加入新的 key-value 對。
            meals.put(food, price);
            System.out.println("餐點: \""+ food + "\" 新增完成 / " + "價格: " + price + "元");

        }
    }


}
