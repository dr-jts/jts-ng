package jts.geom;

/**
 * An interface encapsulating the implementation of {@link Geometry}.
 * 
 * @author mdavis
 *
 */
public interface GeometryFactory {
	Realm getRealm();
	
	Point point(Coord coord);
	LineString lineString(CoordSeq seq);
	LinearRing linearRing(CoordSeq seq);
	Polygon polygon(LinearRing... rings);
	MultiPoint multiPoint(Point... points);
	MultiLineString multiLineString(LineString... lines);
	MultiPolygon multiPolygon(Polygon... polygons);
	GeometryCollection geometryCollection(Geometry... geoms);
}
