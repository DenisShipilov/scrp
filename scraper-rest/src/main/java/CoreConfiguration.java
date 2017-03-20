import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;

/**
 * Created by Dенис on 16.03.2017.
 */
public class CoreConfiguration {

    @Bean
    public PropertyPlaceholderConfigurer propertyPlaceholderConfigurer() {
        PropertyPlaceholderConfigurer  bean = new PropertyPlaceholderConfigurer();
        return null;
    }

}
