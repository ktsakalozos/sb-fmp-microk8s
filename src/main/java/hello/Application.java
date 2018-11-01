package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableConfigurationProperties(DummyConfig.class)
public class Application {

    @Autowired
    private DummyConfig dummyConfig;

    @GetMapping("/")
    public String home() {
        return dummyConfig.getMessage();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
