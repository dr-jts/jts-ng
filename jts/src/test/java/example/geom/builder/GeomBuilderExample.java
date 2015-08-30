package example.geom.builder;

import jts.geom.MultiPolygon;
import jts.geom.Polygon;
import jts.geom.builder.GeometryBuilder;

public class GeomBuilderExample {

	public void testMultiPolygon() {
		MultiPolygon geom = (new GeometryBuilder()).multiPolygon()
				.polygon()
				.polygon()
				.hole()
				.build();
	}
	public void testPolygon() {
		Polygon poly = (new GeometryBuilder())
				.polygon()
				.build();
		Polygon poly2 = (new GeometryBuilder())
				.polygon()
				.hole()
				.hole()
				.build();
	}
}
