package jts.geom.util;

import jts.geom.Coord;

public interface CoordVisitor {
	boolean visit(Coord coord);
}
