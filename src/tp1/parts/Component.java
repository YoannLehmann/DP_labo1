package tp1.parts;

import java.io.Serializable;

public abstract class Component implements Serializable {
		
	private static final long serialVersionUID = 7009510682969464474L;
	protected Dimension3D dimensions;
	
	protected abstract Dimension3D getDimensions();
	protected abstract double getVolume();
	protected abstract double getWeight();

	public abstract String toString();
}
