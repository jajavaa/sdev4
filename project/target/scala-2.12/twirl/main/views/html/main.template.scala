
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User )(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="utf-8">
    <title>"""),_display_(/*9.13*/title),format.raw/*9.18*/("""</title>
</head>

<body>
    <nav>
        <li><a href=""""),_display_(/*14.23*/routes/*14.29*/.HomeController.index()),format.raw/*14.52*/("""">Department View</a></li>
        <li><a href=""""),_display_(/*15.23*/routes/*15.29*/.ProjectController.projects()),format.raw/*15.58*/("""">Project View</a></li>
        <li><a href=""></a></li>
    </nav>
    """),_display_(/*18.6*/content),format.raw/*18.13*/("""
"""),format.raw/*19.1*/("""</body>

</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 08 16:48:58 GMT 2018
                  SOURCE: /media/sf_E_DRIVE/sdev4/project/app/views/main.scala.html
                  HASH: 521623f7780ecd5f79e601cd2378a275b11be916
                  MATRIX: 970->1|1121->57|1149->59|1256->140|1281->145|1365->202|1380->208|1424->231|1500->280|1515->286|1565->315|1664->388|1692->395|1720->396
                  LINES: 28->1|33->1|35->3|41->9|41->9|46->14|46->14|46->14|47->15|47->15|47->15|50->18|50->18|51->19
                  -- GENERATED --
              */
          