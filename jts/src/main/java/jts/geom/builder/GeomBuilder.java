package jts.geom.builder;

import jts.geom.builder.GeometryBuilder.PolygonBuilder;

public class GeomBuilder {
	public static PolygonBuilder polygon() {
		return (new GeometryBuilder()).polygon();
	}
}
