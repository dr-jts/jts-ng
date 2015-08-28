# jts-ng
Prototype for an improved JTS API

> "A designer knows he has achieved perfection not when there is nothing left to add, but when there is nothing left to take away." - Antoine de Saint-Exupery

## Goals

* Main goal is to provide efficient, robust geometric algorithms in as flexible a way as possible
* Keep API simple and easy-to-use 
* Accomodate planar and geodetic geometry space
  * but maybe not to extent of arbitrary CRS
* Regularize Operation patterns (using language features to formalize)
* Improve extensibility
  * Geometry interfaces 
* Improve modularity
  * separate out core from optional algorithms
* Memory efficiency 
* Execution efficiency
* Uniform operations
  * Operations apply to all geometries (return safe defaults where inapplicable)

## Principles

* Immutability whereever possible
* Use interfaces for Geometry hierarchy
* Code simplicity is more important than backwards compatibility
* Target is >= Java 1.5 
  * annotations, iterators, generics, varargs
  * but < Java 8 (no lambdas, streams) ? 
* Unchecked Exceptions
* Prefer dynamic to static structure, and provide structural metadata available as data
* Where possible allow tolerances for operations (e.g. spatial predicates)
* Tolerance is not precision - precision defines representation, whereas tolerance defines results

## Constraints

* Minimize effort to port existing library code
* Minimize effort to port client code to new API

## Assumptions

* No need to mix / auto-convert between geometry and geodetic (but explicit conversion is useful)
* SFS 1.1 support only

## Summary of Differences with JTS 1

### Geometry model

* Geometry types, GeometryFactory are interfaces
* Geometry types have accessor methods only.  (Operations are provided by other classes)  TENTATIVE
* Realm class provides metadata about manifold (planar or spheriodal), coordinate system (geodetic) and precision model

### Operations

* Operations are classes which implement functions involving at least one Geometry to a Geometry or scalar result
* May be multivalued (in particular, may return both a Geometry and a scalar value)
* Wherever possible operations return a Geometry representing the result or location of the operation
* All operations are under the op package
* Implement the Operation marker interface
* Explicitly separate computation phase from result provision phase, by returning a Result object from which one or more results can be read
* 
