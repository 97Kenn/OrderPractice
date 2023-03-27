

public interface OrderService {
   //預設餐點到MAP集合中(先將餐點寫死在方法中)
   void setOrderMeals();
   //手動新增餐點到MAP集合中
   void setNewMeals();
   //將MAP集合中欲選購的餐點進行結帳 ( 印出 品項、份數、價格 最後計算所有商品總價)
   void orderMeals();

}
