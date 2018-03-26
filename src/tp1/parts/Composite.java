package tp1.parts;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite extends Component {
	
	
	private static final long serialVersionUID = -1821360688922886237L;
	protected List<Component> listOfComponent;
	
	public Composite() {
		this.listOfComponent = new ArrayList<>();
	}

	public abstract String toString();
	public abstract Dimension3D getDimensions();
	
	public void addElement(Component part) {
		this.listOfComponent.add(part);
	}

	public int getNumberOfElements() {
		return this.listOfComponent.size();
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

	
}
