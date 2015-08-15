package jts.api.geom.util;

import jts.api.geom.Coord;

public interface CoordVisitor {
	boolean visit(Coord coord);
}
