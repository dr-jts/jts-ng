package jts.geom.builder;

import jts.geom.builder.GeometryBuilder.IPolygonBuilder;
import jts.geom.builder.GeometryBuilder.PolygonBuilder;

public class GeomBuilder {
	public static IPolygonBuilder polygon() {
		return (new GeometryBuilder()).polygon();
	}
}
