package Classes;

/**
 * Класс создает клиентов по промо-акции.
 */
public class PromotionalClient extends Actor{
    private String promoName;
    private int promoClientID;
    /**
     * Максимальное количество промо-клиентов
     */
    public static int promoClientsMax=3;
    /**
     * Текущее количество промо-клинтов принятых магазином
     */
    public static int promoClientsCurrentCount=0;

    /**
     * @param name имя клиента
     * @param promoName название акции
     * @param promoClientID Индивидуальный номер акционного клиента
     */
    public PromotionalClient(String name, String promoName, int promoClientID) {
        super(name + " (Акционный)");
        this.promoName=promoName;
        this.promoClientID=promoClientID;
        //promoClientsCurrentCount++;
    }

    //public static int getPromoClientsCurrentCount(){return promoClientsCurrentCount;}


    /**
     * @return @param name Конструктор класса
     */
    public String getName() {return super.name;}

    /**
     * @return Возращает занчение True если клиетн сделал заказ
     */
    @Override
    public boolean isTakeOrder() {return super.isTakeOrder;}

    /**
     * @return Возращает занчение True если клиетн сделал заказ
     */
    @Override
    public boolean isMakeOrder() {return super.isMakeOrder;}

    /**
     * @param takeOrder поле задается True если заказ был взят
     */
    @Override
    public void setTakeOrder(boolean takeOrder) {super.isTakeOrder = takeOrder;}

    /**
     * @param makeOrder поле задается True если заказ был сделан
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {super.isMakeOrder = makeOrder;}

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


    @Override
    public Actor getActor() {return this;}
}
