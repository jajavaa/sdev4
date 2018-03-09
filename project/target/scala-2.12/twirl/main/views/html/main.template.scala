
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
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="utf-8">
    <title>"""),_display_(/*9.13*/title),format.raw/*9.18*/("""</title>
</head>

<body>
    <nav>
        <ul>
            <li>
                <a href=""""),_display_(/*16.27*/routes/*16.33*/.HomeController.index()),format.raw/*16.56*/("""">Department View</a>
            </li>
            <li>
                <a href=""""),_display_(/*19.27*/routes/*19.33*/.ProjectController.projects()),format.raw/*19.62*/("""">Project View</a>
            </li>
            <li>
                <a href=""""),_display_(/*22.27*/routes/*22.33*/.EmployeeController.employees),format.raw/*22.62*/("""">Employee View</a>
            </li>
            """),_display_(/*24.14*/if(user != null)/*24.30*/ {_display_(Seq[Any](format.raw/*24.32*/("""
                """),format.raw/*25.17*/("""<li>Logged in as """),_display_(/*25.35*/user/*25.39*/.getClass.getSimpleName),format.raw/*25.62*/(""": <a href=""""),_display_(/*25.74*/routes/*25.80*/.EmployeeController.employee(user.getId)),format.raw/*25.120*/("""">"""),_display_(/*25.123*/user/*25.127*/.getFirstName),format.raw/*25.140*/(""" """),_display_(/*25.142*/user/*25.146*/.getLastName),format.raw/*25.158*/("""</a></li>
                <li><a href=""""),_display_(/*26.31*/routes/*26.37*/.LoginController.logout()),format.raw/*26.62*/("""">Logout</a></li>
            """)))}/*27.15*/else/*27.20*/{_display_(Seq[Any](format.raw/*27.21*/("""
                """),format.raw/*28.17*/("""<li><a href=""""),_display_(/*28.31*/routes/*28.37*/.LoginController.login()),format.raw/*28.61*/("""">Login</a></li>
            """)))}),format.raw/*29.14*/("""
        """),format.raw/*30.9*/("""</ul>
    </nav>
    """),_display_(/*32.6*/content),format.raw/*32.13*/("""
"""),format.raw/*33.1*/("""</body>

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
                  DATE: Fri Mar 09 18:11:16 GMT 2018
                  SOURCE: /media/sf_E_DRIVE/sdev4/project/app/views/main.scala.html
                  HASH: 269bcb04c84df779a70e07d0562df936afc7fd34
                  MATRIX: 970->1|1120->56|1148->58|1255->139|1280->144|1398->235|1413->241|1457->264|1567->347|1582->353|1632->382|1739->462|1754->468|1804->497|1882->548|1907->564|1947->566|1992->583|2037->601|2050->605|2094->628|2133->640|2148->646|2210->686|2241->689|2255->693|2290->706|2320->708|2334->712|2368->724|2435->764|2450->770|2496->795|2546->827|2559->832|2598->833|2643->850|2684->864|2699->870|2744->894|2805->924|2841->933|2889->955|2917->962|2945->963
                  LINES: 28->1|33->1|35->3|41->9|41->9|48->16|48->16|48->16|51->19|51->19|51->19|54->22|54->22|54->22|56->24|56->24|56->24|57->25|57->25|57->25|57->25|57->25|57->25|57->25|57->25|57->25|57->25|57->25|57->25|57->25|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|60->28|61->29|62->30|64->32|64->32|65->33
                  -- GENERATED --
              */
          