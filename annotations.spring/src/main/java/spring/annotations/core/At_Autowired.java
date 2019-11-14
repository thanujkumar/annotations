package spring.annotations.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Autowired This annotation is applied to fields, setter methods, and constructors.
 * The @Autowired annotation injects object dependency implicitly.
 * <p>
 * When you use @Autowired on fields and pass the values for the fields using the property name,
 * Spring will automatically assign the fields with the passed values.
 * <p>
 * You can even use @Autowired  on private properties, as shown below.
 * (This is a very poor practice though!)
 */
@Component
public class At_Autowired {

    @Autowired //This is bad practice
    private String name;

    /**
     * One thing to note here is that only one constructor of any bean class
     * can carry the @Autowired annotation.
     *
     * @param person
     */
    @Autowired //Good practice of constructor injection
    public At_Autowired(Person person) {
        System.out.println(person);
    }

    /**
     * NOTE: As of Spring 4.3, @Autowired became optional on classes with a single constructor.
     * In the above constructor, Spring would still inject an instance of the Person class
     * if you omitted the @Autowired annotation.
     *
     * @param person
     * @param name
     */
    // @Autowired //Error - only one constructor can have @Autowired
    public At_Autowired(Person person, String name) {
        System.out.println(person + "-" + name);
    }
}
