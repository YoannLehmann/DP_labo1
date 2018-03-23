package tp1.parts;


public class Part extends Component  {
	
	private static final long serialVersionUID = 1287575424155186191L;
	final private String name;
	final private Dimension3D dimensions;
	final private double weight;

	public Part(String name, Dimension3D dimensions, double weight) {
		this.name = name;
		this.dimensions = dimensions;
		this.weight = weight;
	}

	public String getName() {
		return this.name;
	}
	
	@Override
	public Dimension3D getDimensions() {
		return this.dimensions;
	}

	@Override
	public double getVolume() {
		return this.dimensions.x * this.dimensions.y * this.dimensions.z;
	}
	
	@Override
	public double getWeight() {
		return this.weight;
	}

	@Override
	public String toString() {
		return "Part[" + this.name + "," + this.dimensions + "," + this.weight + "]";
	}
}
