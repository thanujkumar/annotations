package spring.annotations.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class Main_Autowired {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyAutowiredConfig.class);

        for(String bean : ctx.getBeanDefinitionNames()) {
             System.out.println("Loaded [Bean Name] : "+ bean);
        }

        System.out.println(ctx.getBean("getName"));
    }
}

@Configuration
@ComponentScan(useDefaultFilters = false,
        includeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = {At_Autowired.class, Person.class})
        })
class MyAutowiredConfig {

    @Bean
    public String getName() {
        return  "THANUJ KUMAR";
    }
}
