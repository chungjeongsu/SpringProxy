package hello.proxy.app.v1;

public class OrderserviceV1impl implements OrderServiceV1{
    private final OrderRepositoryV1 orderRepositoryV1;

    public OrderserviceV1impl(OrderRepositoryV1 orderRepositoryV1) {
        this.orderRepositoryV1 = orderRepositoryV1;
    }

    @Override
    public void orderItem(String itemId) {
        orderRepositoryV1.save(itemId);
    }
}
