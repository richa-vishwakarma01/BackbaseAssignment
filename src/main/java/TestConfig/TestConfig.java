package TestConfig;

import CommonUtils.RestManager;
import ExecutionReports.CustomLogger;
import io.restassured.response.Response;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.HashMap;

@PropertySource("classpath:qa-Config.properties")
@Configuration
public class TestConfig {


    @Bean
    public RestManager restManager(){
        return new RestManager();
    }

    @Bean
    public HashMap<String, Response> responseMap(){
        return new HashMap<String, Response>();
    }




    @Bean
    public CustomLogger customLogger(){
        return new CustomLogger();
    }
}
