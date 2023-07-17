package Interfaces;

import Classes.Actor;

/**
 * Интерфейс задает методы возврата товара в магазин клиентами
 */
public interface iReturnOrder {

    /**
     * @return Возвращает True если клиент хочет вернуть заказ
     */
    public boolean isReturnOrder();

    /**
     * @param returnOrder задает значению полю: если True - клиент вернул заказ
     */
    public void setReturnOrder(boolean returnOrder);

    /**
     * @return Метод возвращает значени True если клиетн получил деньги за возврат товара
     */
    public boolean isGetMoneyBack();

    /**
     * @param getMoneyBack Метод задает True если клиенту нужно вернуть деньги
     */
    public void setMoneyBack(boolean getMoneyBack);

    Actor getActor();
}
