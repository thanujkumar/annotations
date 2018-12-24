package annotations.java.ex2.inherit;

/*
 * This shows how inheritance works in relation with annotations and interfaces: it is just ignored. 
 * The implementing class do not inherit the annotation although it is an inherit annotation;
 */
public class ImplementsFromAnnotatedInterface implements AnnotatedInterface {

	@Override
	public void oneMethod() {
	}
}
