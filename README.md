# jts-ng
Prototype for an improved JTS API

## Goals

* Accomodate different CRSes, especially geodetic
* Regularize Operation patterns
* Support more extensibility

## Principles

* Use interfaces for Geometry hierarchy
* Code simplicity is more important than backwards compatibility
* Target is Java 1.5 at least (but < Java 8)

## Constraints

* Minimize effort to port existing library code
* Minimize effort to port client code to new API

## Assumptions

* No need to mix / auto-convert between geometry and geodetic
* SFS 1.1 support only
