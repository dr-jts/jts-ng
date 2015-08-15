# jts-ng
Prototype for an improved JTS API

## Goals

* Accomodate planar and geodetic geometry space
  * but maybe not to extent of arbitrary CRS
* Regularize Operation patterns (using language features to formalize)
* Improve extensibility
  * Geometry interfaces 
* Improve modularity
  * separate out core from optional algorithms
* Memory and execution efficiency

## Principles

* Immutability whereever possible
* Use interfaces for Geometry hierarchy
* Code simplicity is more important than backwards compatibility
* Target is >= Java 1.5 (annotations, iterators, generics)
  * but < Java 8 (lambdas, streams) ? 
* Unchecked Exceptions
* Prefer dynamic to static structure

## Constraints

* Minimize effort to port existing library code
* Minimize effort to port client code to new API

## Assumptions

* No need to mix / auto-convert between geometry and geodetic (but explicit conversion is useful)
* SFS 1.1 support only

