package tp1.parts;


public class AssembledPart extends Composite {

	
	private static final long serialVersionUID = -4460873300445291904L;
	private Dimension3D dimensions;
	
	public AssembledPart(Dimension3D dimensions) {
		this.dimensions = dimensions;
	}
	
	public String toString() {
		return "Assembled[" + this.listOfComponent.toString() + ":" + this.dimensions + "]";
	}

	@Override
	public Dimension3D getDimensions() {
		return dimensions;
	}
}
