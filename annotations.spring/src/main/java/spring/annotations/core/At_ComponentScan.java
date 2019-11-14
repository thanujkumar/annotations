package spring.annotations.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ComponentScan This annotation is used with the @Configuration annotation to allow Spring to
 * know the packages to scan for annotated components. @ComponentScan is also used to specify
 * base packages using basePackageClasses or basePackage attributes to scan. If specific
 * packages are not defined, scanning will occur from the package of the class that declares
 * this annotation.
 */
@Configuration
@ComponentScan
public class At_ComponentScan {
}
