package jts.geom.util;

import jts.geom.Geometry;

public interface GeometryVisitor {
	boolean visit(Geometry geom);
}
