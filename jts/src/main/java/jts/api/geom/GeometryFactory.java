package jts.api.geom;

public interface GeometryFactory {
	Realm getRealm();
	Point createPoint(Coord coord);
	LineString createLineString(CoordSeq seq);
	Polygon createPolygon(LinearRing... rings);
	MultiPoint createMultiPoint(Point... points);
	MultiLineString createMultiLineString(LineString... geoms );
	MultiPolygon createMultiPolygon(Polygon... polygons);
	GeometryCollection createGeometryCollection(Geometry...geoms);
}
