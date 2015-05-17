/**
 * Created by grs on 18/05/2015.
 */
public abstract class DistributionPoint implements PurchaseOrderRequest, DispatchOrder {
    public  int currentQuantity;
    public  int thresholdQuantity;
    PurchaseOrderRequest superStocky;
    DispatchOrder dispatchOrder;

    private void serveOrder(int quantity){
        currentQuantity-=quantity;
        if(currentQuantity < thresholdQuantity){
            superStocky.getPurchaseOrder(thresholdQuantity);
        }
    }

    @Override
    public void getPurchaseOrder(int quantity) {
        serveOrder(quantity);
        dispatchOrder.dispatchOrder(quantity);
    }

    @Override
    public void dispatchOrder(int quantity) {
        currentQuantity +=quantity;
    }
}
