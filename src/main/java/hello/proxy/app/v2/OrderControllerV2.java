package hello.proxy.app.v2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping
@RestController
public class OrderControllerV2{
    private final OrderServiceV2 orderServiceV2;

    public OrderControllerV2(OrderServiceV2 orderService) {
        this.orderServiceV2 = orderService;
    }

    @GetMapping("/v2/request")
    public String request(String itemId) {
        orderServiceV2.orderItem(itemId);
        return "OK";
    }

    @GetMapping("/v2/no-log")
    public String noLog() {
        return "OK";
    }
}
