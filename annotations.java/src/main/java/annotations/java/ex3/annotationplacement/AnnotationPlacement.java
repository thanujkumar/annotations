package annotations.java.ex3.annotationplacement;

import java.util.ArrayList;
import java.util.List;

@ClassLevel
public class AnnotationPlacement {

	@FieldLevel
	protected String name;
	
	@GetterLevel
	public String getName() {
		return name;
	}
	
	public void setName(@ParamLevel String name) {
		this.name = name;
	}
	
	
	public List<String> addNameToList(List<String> names) {

        @LocalVariableLevel
        List<String> localNames = names;

        if(localNames == null) {
            localNames = new ArrayList<>();
        }
        localNames.add(getName());

        return localNames;
    }
}
