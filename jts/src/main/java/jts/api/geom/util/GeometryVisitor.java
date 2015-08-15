package jts.api.geom.util;

import jts.api.geom.Geometry;

public interface GeometryVisitor {
	boolean visit(Geometry geom);
}
