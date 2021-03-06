package jts.geom.builder;

import jts.geom.Coord;
import jts.geom.MultiPolygon;
import jts.geom.Polygon;

public class GeometryBuilder {
	
	
	public PolygonPartBuilder multiPolygon() {
		return new PolygonPartBuilder();
	}
	public PolygonBuilder polygon(Coord... coord) {
		return new PolygonBuilder();
	}

	interface IPolygon<T> {
		T polygon(Coord ...coord);
	}
	interface IHole<T> {
		T hole(Coord ...coord);
	}

	public class PolygonBuilder implements IHole<PolygonBuilder>  {

		public PolygonBuilder hole(Coord... coord)
		{
			return this;
		}
	
		public Polygon build() {
			// TODO Auto-generated method stub
			return null;
		}
	}

	public class PolygonPartBuilder implements IPolygon<PolygonPartBuilder>  {

		public PolygonPartBuilder() {
		}

		public PolygonPartBuilder polygon(Coord... coord) {
			return this;
		}

		public PolygonPartBuilder hole() {
			return this;
		}

		public MultiPolygon build() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}


}
