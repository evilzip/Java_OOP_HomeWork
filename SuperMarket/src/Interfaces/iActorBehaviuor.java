package Interfaces;

import Classes.Actor;

/**
 * Интерфейс задает методы взимодействия объектов класса Actor с классом Market
 */
public interface iActorBehaviuor {

    /**
     * @return возвращает True если Actor взял заказ в Маркете
     */
    public boolean isTakeOrder() ;

    /**
     * @return возвращает True если Actor сделал заказ в Маркете
     */
    public boolean isMakeOrder() ;

    /**
     * @param takeOrder поле задается True если заказ был взят
     */
    public void setTakeOrder(boolean takeOrder) ;

    /**
     * @param makeOrder поле задается True если заказ был сделан
     */
    public void setMakeOrder(boolean makeOrder) ;
    Actor getActor();
    
}
