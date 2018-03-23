package tp1.parts;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite extends Component {
	
	protected List<Component> listOfComponent;
	protected Dimension3D dimensions;
	
	public Composite(Dimension3D dimensions) {
		this.listOfComponent = new ArrayList<>();
		this.dimensions = dimensions;
	}
	
	public void addElement(Component part) {
		this.listOfComponent.add(part);
	}

	int getNumberOfElements() {
		return this.listOfComponent.size();
	}

	public Dimension3D getDimensions() {
		return this.dimensions;
	}

	public double getVolume() {
		return this.dimensions.x * this.dimensions.y * this.dimensions.z;
	}

	public double getWeight() {
		double w = 0;
		for (Component p : listOfComponent)
			w += p.getWeight();
		return w;
	}

	public abstract String toString();
	
}
