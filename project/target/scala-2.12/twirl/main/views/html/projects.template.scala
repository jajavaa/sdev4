
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
            <th>Name</th>
            <th>Start</th>
            <th>End</th>
            """),_display_(/*10.14*/if(user.getRole.equals("admin"))/*10.46*/ {_display_(Seq[Any](format.raw/*10.48*/("""
                """),format.raw/*11.17*/("""<th>Number of Employees</th>
            """)))}),format.raw/*12.14*/("""
        """),format.raw/*13.9*/("""</tr>
        """),_display_(/*14.10*/for(project <- projects) yield /*14.34*/ {_display_(Seq[Any](format.raw/*14.36*/("""
            """),format.raw/*15.13*/("""<tr>
                <td>
                    <a href=""""),_display_(/*17.31*/routes/*17.37*/.ProjectController.project(project.getId)),format.raw/*17.78*/("""">"""),_display_(/*17.81*/project/*17.88*/.getName),format.raw/*17.96*/("""</a></td>
                <td>"""),_display_(/*18.22*/project/*18.29*/.getStartString),format.raw/*18.44*/("""</td>
                <td>"""),_display_(/*19.22*/project/*19.29*/.getEndString),format.raw/*19.42*/("""</td>
                """),_display_(/*20.18*/if(user.getRole.equals("admin"))/*20.50*/ {_display_(Seq[Any](format.raw/*20.52*/("""
                    """),format.raw/*21.21*/("""<td>"""),_display_(/*21.26*/project/*21.33*/.getEmployees.size),format.raw/*21.51*/("""</td>
                    <td>
                        <a href=""""),_display_(/*23.35*/routes/*23.41*/.ProjectController.delete(project.getId)),format.raw/*23.81*/("""">Delete</a>
                    </td>
                    <td>
                        <a href=""""),_display_(/*26.35*/routes/*26.41*/.ProjectController.update(project.getId)),format.raw/*26.81*/("""">Update</a>
                    </td>
                """)))}),format.raw/*28.18*/("""
            """),format.raw/*29.13*/("""</tr>
        """)))}),format.raw/*30.10*/("""
    """),format.raw/*31.5*/("""</table>
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
                  DATE: Fri Mar 09 13:50:19 GMT 2018
                  SOURCE: /media/sf_E_DRIVE/sdev4/project/app/views/projects.scala.html
                  HASH: dfcf7d60052d58a410e439fac749b5c9071b5f21
                  MATRIX: 993->1|1155->68|1183->71|1217->97|1256->99|1287->104|1323->114|1337->120|1384->147|1552->288|1593->320|1633->322|1678->339|1751->381|1787->390|1829->405|1869->429|1909->431|1950->444|2033->500|2048->506|2110->547|2140->550|2156->557|2185->565|2243->596|2259->603|2295->618|2349->645|2365->652|2399->665|2449->688|2490->720|2530->722|2579->743|2611->748|2627->755|2666->773|2758->838|2773->844|2834->884|2959->982|2974->988|3035->1028|3122->1084|3163->1097|3209->1112|3241->1117
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|36->4|42->10|42->10|42->10|43->11|44->12|45->13|46->14|46->14|46->14|47->15|49->17|49->17|49->17|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|53->21|53->21|53->21|53->21|55->23|55->23|55->23|58->26|58->26|58->26|60->28|61->29|62->30|63->31
                  -- GENERATED --
              */
          