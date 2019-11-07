package annotations.java.ex1;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Todo {
    enum Priority {LOW, MEDIUM, HIGH}

    enum Status {NOT_STARTED, STARTED}

    String author() default "THANUJ";

    Priority priority() default Priority.LOW;

    Status status() default Status.NOT_STARTED;
}
