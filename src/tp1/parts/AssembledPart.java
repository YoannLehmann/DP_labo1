package tp1.parts;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class AssembledPart extends Composite implements Serializable {

	private static final long serialVersionUID = -2805555670934919157L;
	
	public AssembledPart(Dimension3D dimensions) {
		super(dimensions);
	}
	
	public String toString() {
		return "Assembled[" + this.listOfComponent.toString() + ":" + this.dimensions + "]";
	}
}
