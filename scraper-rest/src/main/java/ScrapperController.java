/**
 * Created by Dенис on 11.03.2017.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@RequestMapping("/")
@Import(CoreConfiguration.class)
public class ScrapperController {

private static final String GRADLE_PROPERTIES = "gradle.properties";

    @Value("${version}")
    private String version;

    @RequestMapping("/info")
    @ResponseBody
    public String getInfo() {
        return "Current version: " + version;
    }

    public static void main(String... args) throws Exception {
        SpringApplication.run(ScrapperController.class);
    }
}
