package spring.annotations.core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * This annotation is used along with the @Autowired annotation. When you need more control of
 * the dependency injection process, @Qualifier can be used. @Qualifier can be specified on
 * individual constructor arguments or method parameters.
 * This annotation is used to avoid the confusion that occurs when you create more than
 * one bean of the same type and want to wire only one of them with a property.
 */
@Component
public class At_Qualifier {


    // As of Spring 4.3, @Autowired became optional on classes with a single constructor
    public At_Qualifier(@Qualifier("person") Person p) {
        System.out.println(p);
    }
}
