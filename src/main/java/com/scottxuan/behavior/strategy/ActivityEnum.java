package com.scottxuan.behavior.strategy;

/**
 * @author : zhaoxuan
 */
public enum ActivityEnum {
    FIRST_ORDER(1,FirstOrderActivity.class),
    DISCOUNT(2,DiscountActivity.class),
    ;

    private int type;
    private Class<? extends Activity> clazz;

    ActivityEnum(int type,Class<? extends Activity> clazz){
        this.type = type;
        this.clazz = clazz;
    }

    public static Class<? extends Activity> getClazz(int type) {
        for (ActivityEnum value : ActivityEnum.values()) {
            if (value.type == type){
                return value.clazz;
            }
        }
        throw new RuntimeException("未找到所参与的活动");
    }

    public int getType() {
        return type;
    }
}
