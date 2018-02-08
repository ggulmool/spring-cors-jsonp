package me.ggulmool.cors;

import lombok.extern.java.Log;
import me.ggulmool.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class CorsController {

    //@CrossOrigin(origins = "http://localhost:63342")
    @RequestMapping("/cors/user")
    public String corsRequest(User user) {
        log.info("id : " + user.getId());
        log.info("name : " + user.getName());
        return "success";
    }
}
