package org
package typelevel
package catalysts

import sbt._
import sbtcatalysts.CatalystsPlugin.autoImport._

object Dependencies {

  // Versions for libraries and packages
  // Package -> version
  val versions = Map[String, String](
   // "macro-compat"   -> "1.0.44"
    "discipline"     -> "0.7.2",
    "scalacheck"     -> "1.13.4",
    "scalatest"      -> "3.0.0",
    "specs2"         -> "3.8.6"
  )

  // library definitions and links to their versions
  // Note that one version may apply to more than one library.
  // Library name -> version key, org, library
  val libraries = Map[String, (String, String, String)](
    //"algebra"               -> ("algebra"         , "org.spire-math"               , "algebra"),
  )

  // compiler plugins definitions and links to their versions
  // Note that one version may apply to more than one plugin.
  // Library name -> version key, org, librar, crossVersion
  val scalacPlugins = Map[String, (String, String, String, CrossVersion)](
    //"kind-projector"    -> ("kind-projector"  , "org.spire-math"      , "kind-projector" , CrossVersion.binary),
  )

  // Some helper methods to combine libraries
  //def macroCompatSettings(v: Versions): Seq[Setting[_]] =
  //  addCompileLibs(v, "macro-compat") ++ addCompilerPlugins(v, "paradise") ++ scalaMacroDependencies(v)
}
