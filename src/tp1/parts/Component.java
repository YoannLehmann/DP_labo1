package tp1.parts;

public abstract class Component {
	
	protected Dimension3D dimensions;
	protected abstract Dimension3D getDimensions();

	protected abstract double getVolume();

	protected abstract double getWeight();

	public abstract String toString();
}
