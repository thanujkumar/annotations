package annotations.java.basic;

import java.util.ArrayList;
import java.util.List;

@CanBeRepeated("Repeat 1")
@CanBeRepeated("Repeat 2")
public class HowToUseRepeated {

     //type	 
	 List<@CanBeRepeated(value = "2") String> values = new ArrayList<>();
}
