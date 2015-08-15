# jts-ng
Prototype for an improved JTS API

## Goals

* Accomodate different CRSes, especially geodetic
* Regularize Operation patterns
* Support more extensibility

## Principles

* Use interfaces for Geometry hierarchy
* Code simplicity is more important than backwards compatibility
* Target is >= Java 1.5 (annotations, iterators, generics)

## Constraints

* Minimize effort to port existing library code
* Minimize effort to port client code to new API

## Assumptions

* No need to mix / auto-convert between geometry and geodetic (but explicit conversion is useful)
* SFS 1.1 support only

