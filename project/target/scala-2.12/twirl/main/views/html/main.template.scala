
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
            <li><a href=""""),_display_(/*15.27*/routes/*15.33*/.HomeController.index()),format.raw/*15.56*/("""">Department View</a></li>
            <li><a href=""""),_display_(/*16.27*/routes/*16.33*/.ProjectController.projects()),format.raw/*16.62*/("""">Project View</a></li>
            """),_display_(/*17.14*/if(user != null)/*17.30*/ {_display_(Seq[Any](format.raw/*17.32*/("""
                """),format.raw/*18.17*/("""<li>Logged in as """),_display_(/*18.35*/user/*18.39*/.getClass.getSimpleName),format.raw/*18.62*/(""": <a href=""""),_display_(/*18.74*/routes/*18.80*/.EmployeeController.employee(user.getId)),format.raw/*18.120*/("""">"""),_display_(/*18.123*/user/*18.127*/.getFirstName),format.raw/*18.140*/(""" """),_display_(/*18.142*/user/*18.146*/.getLastName),format.raw/*18.158*/("""</a></li>
                <li><a href=""""),_display_(/*19.31*/routes/*19.37*/.LoginController.logout()),format.raw/*19.62*/("""">Logout</a></li>
            """)))}/*20.15*/else/*20.20*/{_display_(Seq[Any](format.raw/*20.21*/("""
                """),format.raw/*21.17*/("""<li><a href=""""),_display_(/*21.31*/routes/*21.37*/.LoginController.login()),format.raw/*21.61*/("""">Login</a></li>
            """)))}),format.raw/*22.14*/("""
        """),format.raw/*23.9*/("""</ul>
    </nav>
    """),_display_(/*25.6*/content),format.raw/*25.13*/("""
"""),format.raw/*26.1*/("""</body>

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
                  DATE: Fri Mar 09 13:29:47 GMT 2018
                  SOURCE: /media/sf_E_DRIVE/sdev4/project/app/views/main.scala.html
                  HASH: 758ab944302d10d3827ea8c8b90b0595929e17d9
                  MATRIX: 970->1|1120->56|1148->58|1255->139|1280->144|1381->218|1396->224|1440->247|1520->300|1535->306|1585->335|1649->372|1674->388|1714->390|1759->407|1804->425|1817->429|1861->452|1900->464|1915->470|1977->510|2008->513|2022->517|2057->530|2087->532|2101->536|2135->548|2202->588|2217->594|2263->619|2313->651|2326->656|2365->657|2410->674|2451->688|2466->694|2511->718|2572->748|2608->757|2656->779|2684->786|2712->787
                  LINES: 28->1|33->1|35->3|41->9|41->9|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|50->18|50->18|50->18|50->18|50->18|50->18|50->18|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|53->21|53->21|53->21|53->21|54->22|55->23|57->25|57->25|58->26
                  -- GENERATED --
              */
          