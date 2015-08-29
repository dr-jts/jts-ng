package jts.geom.builder;

import jts.geom.MultiPolygon;
import jts.geom.Polygon;

public class GeomBuilderTest {

	public void testMultiPolygon() {
		MultiPolygon geom = (new GeometryBuilder()).multiPolygon()
				.polygon()
				.polygon()
				.hole()
				.build();
	}
	public void testMultiPolygon2() {
		MultiPolygon geom = (new GB2()).multiPolygon()
				.polygon()
				.polygon()
				.hole()
				.build();
	}
	public void testPolygon() {
		Polygon poly = GeomBuilder
				.polygon()
				.build();
		Polygon geom = GeomBuilder
				.polygon()
				.hole()
				.hole()
				.build();
	}
}
