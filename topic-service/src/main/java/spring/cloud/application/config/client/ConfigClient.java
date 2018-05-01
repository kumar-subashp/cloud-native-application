package spring.cloud.application.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by subashparida on 29/04/18.
 */
@RestController
@RefreshScope
public class ConfigClient {

    @Value("${greeting:Staging}")
    private String message;


    @RequestMapping("/env")
    public String getMessage(){
        return message;
    }
}
