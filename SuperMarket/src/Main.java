import Classes.*;
import Interfaces.iActorBehaviuor;

import static Classes.PromotionalClient.promoClientsCurrentCount;


public class Main {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();
        Actor client1 = new OrdinaryClient("Boris");
        Actor client5 = new OrdinaryClient("mr. Smith");
        //iActorBehaviuor client2 = new SpecialClient("prezident",1001);
        //iActorBehaviuor p = new PensionerClient("Sergey Nikolay",1111);
        // iActorBehaviuor tax = new TaxService();
        Actor promoClient1 = new PromotionalClient("Mr. Garrison1", "Summer's days", 1);
        Actor promoClient2 = new PromotionalClient("Mr. Garrison2", "Summer's days", 2);
        Actor promoClient3 = new PromotionalClient("Mr. Garrison3", "Summer's days", 3);
        Actor promoClient4 = new PromotionalClient("Mr. Garrison4", "Summer's days", 4);
        client5.setReturnOrder(true);//возврат товара client5

        magnit.acceptToMarket(client1);
        //magnit.acceptToMarket(client2);
        //magnit.acceptToMarket(p);
        //magnit.acceptToMarket(tax);
        magnit.acceptToMarket(promoClient1);
        magnit.acceptToMarket(promoClient2);
        magnit.acceptToMarket(promoClient3);
        magnit.acceptToMarket(promoClient4);
        magnit.acceptToMarket(client5);


       magnit.update();
    }
}