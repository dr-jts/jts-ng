# jts-ng
Prototype for an improved JTS API

> "A designer knows he has achieved perfection not when there is nothing left to add, but when there is nothing left to take away." - Antoine de Saint-Exupery

## Goals

* Provide efficient, robust geometric algorithms in as flexible a way as possible
* Simple and easy-to-use API
* Accomodate planar and geodetic geometry space
  * but not to extent of arbitrary CRS - this must be provided externally
* Regularize Operation patterns (using language features to formalize)
* Improve extensibility
  * `Geometry` interfaces 
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

* `Geometry` types and `GeometryFactory` are interfaces
* Geometry types have accessor methods only.  
* Operations are provided by `Operation` classes (TENTATIVE)
* `Realm` class provides metadata about manifold (planar or spheriodal), coordinate system (geodetic) and precision model

### Operations

* `Operation`s are classes which implement functions involving at least one `Geometry`, returning a geometric or scaler result
* May be multivalued (in particular, may return both a `Geometry` and a scalar value)
* Where possible operations return a `Geometry` representing the result or location of the operation
* All operations are under the `op` package
* Implement the `Operation` marker interface
* Explicitly separates computation phases: setup, execution, and result extraction.
* Result extraction is done from a `Result` object.  `Result` subclasses allow one or more values to be returned.
* Various kinds of results: `GeometryResult`, `ValueResult`, `GeometryValue` supports both geometry and value.  For more complex/numerous results operation provides custom subclass.
* 
