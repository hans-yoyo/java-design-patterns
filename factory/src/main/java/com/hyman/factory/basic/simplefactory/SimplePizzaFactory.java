package com.hyman.factory.basic.simplefactory;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/05/16 20:53
 * @version： 1.0.0
 */
public class SimplePizzaFactory {

    public static Pizza orderPizza(PizzaType type) {
        switch (type) {
            case ClamPizzaType:
                return new ClamPizza();
            case CheesePizzaType:
                return new CheesePizza();
            case PepperoniPizzaType:
                return new PepperoniPizza();
            default:
                return null;
        }
    }

}

enum PizzaType {
    CheesePizzaType,
    ClamPizzaType,
    PepperoniPizzaType
}
