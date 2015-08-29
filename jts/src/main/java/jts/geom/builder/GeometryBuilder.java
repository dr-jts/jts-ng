package jts.geom.builder;

import jts.geom.Coord;
import jts.geom.MultiPolygon;
import jts.geom.Polygon;

public class GeometryBuilder {
	
	public IPolygonBuilder polygon(Coord... coord) {
		return new PolygonBuilder();
	}
	public IMultiPolygonBuilder multiPolygon()
	{
		return new MultiPolygonBuilder();
	}
	
	interface Build<T> {
		T build();
	}
	interface IPolygon<T> {
		T polygon(Coord ...coord);
	}
	interface IHole<T> {
		T hole(Coord ...coord);
	}
	
	interface IHoleBuilder extends IHole<IHoleBuilder>, Build<Polygon>
	{
		
	}
	class HoleBuilder implements IHoleBuilder {

	@Override
	public HoleBuilder hole(Coord... coord) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Polygon build() {
		// TODO Auto-generated method stub
		return null;
	}
	
	}

	interface IPolygonBuilder extends IHole<IHoleBuilder>, Build<Polygon> {
		
	}
	class PolygonBuilder 
	extends HoleBuilder
	implements IPolygonBuilder {

	public HoleBuilder polygon(Coord... coord)
	{
		return null;
	}

	@Override
	public Polygon build() {
		// TODO Auto-generated method stub
		return null;
	}
	
	}
	
	interface IMultiPolygonBuilder extends IPolygon<MultiPolygonPart>, Build<MultiPolygon>
	{
		
	}
	class MultiPolygonBuilder 
	implements IMultiPolygonBuilder {

	@Override
	public MultiPolygonPart polygon(Coord... coord) {
		// TODO Auto-generated method stub
		return new MultiPolygonPart(this);
	}

	@Override
	public MultiPolygon build() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
	interface IMultiPolygonPart extends IMultiPolygonBuilder, IHole<IMultiPolygonPart>
	{
		
	}
	class MultiPolygonPart extends MultiPolygonBuilder 
		implements IMultiPolygonPart {

		public MultiPolygonPart(MultiPolygonBuilder multiPolygonBuilder) {
			// TODO Auto-generated constructor stub
		}

		@Override
		public MultiPolygonPart hole(Coord... coord) {
			// TODO Auto-generated method stub
			return this;
		}
		
	}

}
