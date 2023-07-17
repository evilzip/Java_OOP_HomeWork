package Classes;

import java.util.List;
import java.util.ArrayList;

//import Interfaces.Actor;

import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

/**
 * Класс магазина реализующий методы работы магазина
 */
public class Market implements iMarketBehaviour,iQueueBehaviour{

    private List<Actor> queue;

    /**
     * Конструктор класса который создает экз. класса маркет и список будущих клиентов (очередь)
     */
    public Market() {
        this.queue = new ArrayList<Actor>();
    }


    /**
     * @param actor принимает клиента в магазин
     */
    @Override
    public void acceptToMarket(Actor actor) {

        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
    }

    /**
     * @param actor метод принимает клиента в очередь
     */
    @Override
    public void takeInQueue(Actor actor) {
        if(actor instanceof PromotionalClient){//проверка является ли клиетн промо-клиентом
           PromotionalClient.promoClientsCurrentCount++;//считем сколько промо клиетов пришли в магазин
           if(PromotionalClient.promoClientsCurrentCount<=PromotionalClient.promoClientsMax){//условие превышения кол-ва промо клиентов
               this.queue.add(actor);
               System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
           }
           else{
               System.out.println(actor.getActor().getName()+
                       " Клиенту отказано в осблуживании по акции - превышен предел акционных клиентов ");
           }
        }
        else{
            this.queue.add(actor);
            System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
        }

    }

    /**
     * @param actors удаляет клиентов из магазина
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors){
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }
    }

    /**
     * метод запускает внутренние методы магазина
     */
    @Override
    public void update() {
       takeOrder();
       giveOrder();
       releaseFromQueue();
    }

    /**
     * Выдача товара
     */
    @Override
    public void giveOrder() {
        for(Actor actor: queue){
            if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }
    }


    /**
     * Удаление из очереди
     */
    @Override
    public void releaseFromQueue() {
       List<Actor> releaseActors = new ArrayList<>();
       for(Actor actor:queue){
           if(actor.isTakeOrder() || actor.isGetMoneyBack()){
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
            }
       }
    releaseFromMarket(releaseActors);
    }

    /**
     * Метод подтверждения заказа
     */
    @Override
    public void takeOrder() {
        for(Actor actor:queue){
            if(!actor.isMakeOrder()){
                if(actor.isReturnOrder()){
                    actor.setMakeOrder(false);
                    System.out.println(actor.getActor().getName()+" клиент вернул заказ ");
                    actor.setMoneyBack(true);
                    if(actor.isGetMoneyBack){
                        System.out.println(actor.getActor().getName()+" клиенту вернули деньги за возвращенный товар");
                    }
                    return;
                }
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");
            }
        }
    }

}
