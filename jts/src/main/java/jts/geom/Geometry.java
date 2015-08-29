package jts.geom;

import jts.geom.struct.Envelope;
import jts.geom.util.CoordVisitor;
import jts.geom.util.GeometryVisitor;

public interface Geometry {
	
	// metadata methods
	GeometryFactory getFactory();
	Realm getRealm();
	
	// topological methods
	boolean isEmpty();
	boolean isClosed();
	int getDimension();
	int getBoundaryDimension();
	Geometry getBoundary();
	
	// metric methods
	double getArea();
	double getLength();
	Envelope getEnvelope();
	
	// structural methods
	int getNumGeometries();
	Geometry getGeometryN(int n);
	int getNumPoints();
	
	// client data
	Object getData();
	void setDate(Object data);
	
	void apply(CoordVisitor coordVisitor);
	void apply(GeometryVisitor geomVisitor);
	
	// standard Object methods
	String toString();
	boolean equals();
	int hashCode();
}
