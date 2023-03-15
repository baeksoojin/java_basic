package jumptojava.chapter3;

import java.util.HashMap;

public class Question10 {

    public static int coffeePrice;

    public enum CoffeeType{
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };

    public static void setCoffeePrice(CoffeeType type) {
        HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeeType.AMERICANO, 3000);  // 1: 아메리카노
        priceMap.put(CoffeeType.ICE_AMERICANO, 4000);  // 2: 아이스 아메리카노
        priceMap.put(CoffeeType.CAFE_LATTE, 5000);  // 3: 카페라떼
        coffeePrice = priceMap.get(type);
    }

    public static int getCoffeePrice() {
        return coffeePrice;
    }
}
