package spring.annotations.core;


import org.springframework.beans.factory.annotation.Required;

/**
 * @Required This annotation is applied to bean setter methods. Consider a scenario where you need to enforce a required property.
 * The @Required annotation indicates that the affected bean must be populated at configuration time with the required property.
 * Otherwise, an exception of type BeanInitializationException is thrown.
 * @deprecated as of 5.1, in favor of using constructor injection for required settings
 */
@Deprecated
public class At_Required {


    private String name;


    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }


}
