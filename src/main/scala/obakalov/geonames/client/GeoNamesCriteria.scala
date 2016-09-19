package obakalov.geonames.client

/**
  * Created by OBakalov on 19.09.2016.
  */
sealed trait GeoNamesCriteria {
  def value: String
}

case class Style private(value: String) extends GeoNamesCriteria

object Style {
  val SHORT = new Style("SHORT")
  val MEDIUM = new Style("MEDIUM")
  val LONG = new Style("LONG")
  val FULL = new Style("FULL")
}

case class FeatureClass private(value: String) extends GeoNamesCriteria

object FeatureClass {
  val A = new FeatureClass("A")
  val H = new FeatureClass("H")
  val L = new FeatureClass("L")
  val P = new FeatureClass("P")
  val R = new FeatureClass("R")
  val S = new FeatureClass("S")
  val T = new FeatureClass("T")
  val U = new FeatureClass("U")
  val V = new FeatureClass("V")

  val values = List(A, H, L, P, R, S, T, U, V)

  val AdministrativeBoundaryFeatures = A
  val HydrographicFeatures = H
  val AreaFeatures = L
  val PopulatedPlaceFeatures = P
  val RoadRailroadFeatures = R
  val SpotFeatures = S
  val HypsographicFeatures = T
  val UnderseaFeatures = U
  val VegetationFeatures = V
}