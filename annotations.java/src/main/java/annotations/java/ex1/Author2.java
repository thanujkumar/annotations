package annotations.java.ex1;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Author2 {

	//All method declarations cannot have parameters and are not allowed to have a thrown clause. The return
	//types are restricted to String, Class, enums, annotations and arrays of the types mentioned before.
	public String author() default "THANUJ";

	public String date();

}
