package Classes;

/**
 * Класс создает клинта-пенсионера. Наследуется от Actor
 */
public class PensionerClient extends Actor {
    private int pensID;

    public PensionerClient(String name, int pensID) {
        super(name+" (пенсионер)");
        this.pensID = pensID;
    }

    @Override
    public String getName() {return super.name;}

    public boolean isTakeOrder() {return super.isTakeOrder;}

    public boolean isMakeOrder() {return super.isMakeOrder;}

    public void setMakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
    }

    public void setTakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }

    @Override
    public boolean isReturnOrder() {return super.isReturnOrder; }

    @Override
    public void setReturnOrder(boolean returnOrder) {super.isReturnOrder = returnOrder;}


    @Override
    public boolean isGetMoneyBack() {return super.isGetMoneyBack; }

    @Override
    public void setMoneyBack(boolean getMoneyBack) {super.isGetMoneyBack = getMoneyBack;}

    public Actor getActor() {
      return this;
    }
    
}
