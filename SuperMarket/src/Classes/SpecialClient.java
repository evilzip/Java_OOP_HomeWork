package Classes;

/**
 * Класс создает особенных клиентов (VIP)
 */
public class SpecialClient extends Actor{
    private int idVip;
    public SpecialClient(String name, Integer id) {
        super(name+" (Особенный)");
        idVip = id;
    }

    @Override
    public String getName() {
        return super.name;
    }

    /**
     * @return Возращает занчение True если клиетн взял заказ
     */
    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }

    /**
     * @return
     */
    public boolean isMakeOrder() {
      return super.isMakeOrder;
    }

    /**
     * @param makeOder поле задается True если заказ был сделан
     */
    public void setMakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
    }

    /**
     * @param pikUpOrder поле задается True если заказ был взят
     */
    public void setTakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }

    /**
     * @return Проверяем хочет ли клиенту вернуть товар
     */
    @Override
    public boolean isReturnOrder() {return super.isReturnOrder; }

    /**
     * @param returnOrder задает значению полю: если True - клиент вернул заказ
     */
    @Override
    public void setReturnOrder(boolean returnOrder) {super.isReturnOrder = returnOrder;}


    /**
     * @return Проверяем вернул ли магазин деньги клиенту за возврат товара
     */
    @Override
    public boolean isGetMoneyBack() {return super.isGetMoneyBack; }

    /**
     * @param getMoneyBack Метод задает True если клиенту нужно вернуть деньги
     */
    @Override
    public void setMoneyBack(boolean getMoneyBack) {super.isGetMoneyBack = getMoneyBack;}

    public Actor getActor() {
      return this;
    }

}
