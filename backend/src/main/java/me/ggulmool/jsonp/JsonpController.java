package me.ggulmool.jsonp;

import me.ggulmool.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonpController {
    @RequestMapping("/jsonp/user")
    public User user() {
        return new User("ggulmool", "kny");
    }
}
