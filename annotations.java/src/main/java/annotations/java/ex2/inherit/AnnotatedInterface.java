package annotations.java.ex2.inherit;

/*
 * Note that this meta-annotation type has no effect if the annotated
 * type is used to annotate anything other than a class.  Note also
 * that this meta-annotation only causes annotations to be inherited
 * from superclasses; annotations on implemented interfaces have no
 * effect.
 */
@InheritableAnnotation(desc = "Annotated on interface and inherited by implementation class")
public interface AnnotatedInterface {

	public void oneMethod();

}
