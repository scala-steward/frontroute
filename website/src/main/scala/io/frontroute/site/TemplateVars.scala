package io.frontroute.site

object TemplateVars {

  val vars = Seq(
    "laminextVersion" -> "0.13.1"
  )

  def apply(s: String): String =
    vars.foldLeft(s) { case (acc, (varName, varValue)) =>
      acc.replace(s"{{${varName}}}", varValue)
    }

}
