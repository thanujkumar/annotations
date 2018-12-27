package annotations.java.ex3.annotationplacement;

import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(LOCAL_VARIABLE)
public @interface LocalVariableLevel {

}
