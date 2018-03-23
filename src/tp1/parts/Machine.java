package tp1.parts;


public class Machine extends Composite {
	
	private static final long serialVersionUID = 5522983654152313135L;

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
