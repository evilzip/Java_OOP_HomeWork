package Interfaces;

import java.util.List;

import Classes.Actor;


/**
 * Интерфейс задает методы работы магазин
 */
public interface iMarketBehaviour {
    /**
     * @param actor принимает клиента в магазин
     */
    void acceptToMarket(Actor actor);

    /**
     * @param actor удаляет клиентов из магазина
     */
    void releaseFromMarket(List<Actor> actor);

    /**
     * метод запускает внутренние методы магазина
     */
    void update();
}
