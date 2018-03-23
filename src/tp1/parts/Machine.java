package tp1.parts;

import java.io.Serializable;

public class Machine extends Composite implements Serializable {
	
	private static final long serialVersionUID = -4131418366537245416L;
	
	public Machine(Dimension3D dimensions) {
		super(dimensions);
	}
	


	@Override
	public Dimension3D getDimensions() {
		Dimension3D total = new Dimension3D(0,0,0);

		for (Component p : listOfComponent) {
			Dimension3D pd = p.getDimensions();
			double x = total.x + pd.x;
			double y = Math.max(total.y, pd.y);
			double z = Math.max(total.z, pd.z);
			total = new Dimension3D(x, y, z);
		}
		
		return total;
	}

	@Override
	public String toString() {
		return "Machine{\n " +
				this.listOfComponent.toString() + "\n " +
				"dimensions=" + getDimensions() + "\n " +
				"weight=" + getWeight() + "\n}";
	}

}
