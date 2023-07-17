package Interfaces;

import Classes.Actor;

/**
 * Интерефей задает методы для работы с очередью магазина
 */
public interface iQueueBehaviour {
    /**
     * метод удаляет клиентов из очереди
     */
    void releaseFromQueue();

    /**
     * метод принимает заказ
     */
    void takeOrder();

    /**
     * @param actor метод принимает клиента в очередь
     */
    void takeInQueue(Actor actor);

    void giveOrder();
}
