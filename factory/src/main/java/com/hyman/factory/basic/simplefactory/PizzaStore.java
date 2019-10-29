package com.hyman.factory.basic.simplefactory;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/05/16 21:03
 * @version： 1.0.0
 */
public class PizzaStore {

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = SimplePizzaFactory.orderPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();
        Pizza pizza = store.orderPizza(PizzaType.CheesePizzaType);
    }

}
