
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

object projects extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[java.util.List[models.Project],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projects: java.util.List[models.Project], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.69*/("""

"""),_display_(/*3.2*/main("Project View", user)/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""
    """),format.raw/*4.5*/("""<a href=""""),_display_(/*4.15*/routes/*4.21*/.ProjectController.create()),format.raw/*4.48*/("""">Create new project</a>
    <table>
        <tr>
            <th>#</th>
            <th>Name</th>
            <th>Start</th>
            <th>End</th>
            """),_display_(/*11.14*/if(user.getRole.equals("admin"))/*11.46*/ {_display_(Seq[Any](format.raw/*11.48*/("""
                """),format.raw/*12.17*/("""<th>Number of Employees</th>
            """)))}),format.raw/*13.14*/("""
        """),format.raw/*14.9*/("""</tr>
        """),_display_(/*15.10*/for(project <- projects) yield /*15.34*/ {_display_(Seq[Any](format.raw/*15.36*/("""
            """),format.raw/*16.13*/("""<tr>
                <td>
                    <a href=""""),_display_(/*18.31*/routes/*18.37*/.ProjectController.project(project.getId)),format.raw/*18.78*/("""">"""),_display_(/*18.81*/project/*18.88*/.getId),format.raw/*18.94*/("""</a>
                </td>
                <td>"""),_display_(/*20.22*/project/*20.29*/.getName),format.raw/*20.37*/("""</td>
                <td>"""),_display_(/*21.22*/project/*21.29*/.getStart.toString("dd-MM-yy")),format.raw/*21.59*/("""</td>
                <td>"""),_display_(/*22.22*/project/*22.29*/.getEnd.toString("dd-MM-yy")),format.raw/*22.57*/("""</td>
                """),_display_(/*23.18*/if(user.getRole.equals("admin"))/*23.50*/ {_display_(Seq[Any](format.raw/*23.52*/("""
                    """),format.raw/*24.21*/("""<td>"""),_display_(/*24.26*/project/*24.33*/.getEmployees.size),format.raw/*24.51*/("""</td>
                    <td>
                        <a href=""""),_display_(/*26.35*/routes/*26.41*/.ProjectController.delete(project.getId)),format.raw/*26.81*/("""">Delete</a>
                    </td>
                    <td>
                        <a href=""""),_display_(/*29.35*/routes/*29.41*/.ProjectController.update(project.getId)),format.raw/*29.81*/("""">Update</a>
                    </td>
                """)))}),format.raw/*31.18*/("""
            """),format.raw/*32.13*/("""</tr>
        """)))}),format.raw/*33.10*/("""
    """),format.raw/*34.5*/("""</table>
""")))}))
      }
    }
  }

  def render(projects:java.util.List[models.Project],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(projects,user)

  def f:((java.util.List[models.Project],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (projects,user) => apply(projects,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 08 22:12:36 GMT 2018
                  SOURCE: /home/konrad/Documents/sdev4/project/app/views/projects.scala.html
                  HASH: affa30dba5e100a1eeae7abc40fde26b4ac3469f
                  MATRIX: 993->1|1155->68|1183->71|1217->97|1256->99|1287->104|1323->114|1337->120|1384->147|1575->311|1616->343|1656->345|1701->362|1774->404|1810->413|1852->428|1892->452|1932->454|1973->467|2056->523|2071->529|2133->570|2163->573|2179->580|2206->586|2281->634|2297->641|2326->649|2380->676|2396->683|2447->713|2501->740|2517->747|2566->775|2616->798|2657->830|2697->832|2746->853|2778->858|2794->865|2833->883|2925->948|2940->954|3001->994|3126->1092|3141->1098|3202->1138|3289->1194|3330->1207|3376->1222|3408->1227
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|36->4|43->11|43->11|43->11|44->12|45->13|46->14|47->15|47->15|47->15|48->16|50->18|50->18|50->18|50->18|50->18|50->18|52->20|52->20|52->20|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|56->24|56->24|56->24|56->24|58->26|58->26|58->26|61->29|61->29|61->29|63->31|64->32|65->33|66->34
                  -- GENERATED --
              */
          