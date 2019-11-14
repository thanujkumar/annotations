package spring.annotations.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class Main_Qualifier {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyQualifierConfig.class);

        for (String bean : ctx.getBeanDefinitionNames()) {
            System.out.println("Loaded [Bean Name] : " + bean);
        }
    }

}

@Configuration
@ComponentScan(useDefaultFilters = false,
        includeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = {At_Qualifier.class, Person.class})
        })
class MyQualifierConfig {

    //If @Qualifier is removed for Person constructor parameter, below bean would conflict
    //Note : Person object is used in At_Autowired example, don't change the "person" bean name
    @Bean
    public Person anotherDuplicatePerson() {
        return new Person();
    }
}