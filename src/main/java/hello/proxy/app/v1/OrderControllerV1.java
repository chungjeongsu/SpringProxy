package hello.proxy.app.v1;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/v1")//스프링은 @Controller 또는 @RequestMapping 이 있어야 스프링 컨트롤러로 인식
@RestController
public interface OrderControllerV1 {

    @GetMapping("/request")
    String request(@RequestParam("itemId") String itemId);

    @GetMapping("/no-log")
    String noLog();
}
