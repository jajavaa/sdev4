
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

object employees extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[java.util.List[models.users.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: java.util.List[models.users.Employee], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.77*/("""

"""),_display_(/*3.2*/main("Employee view", user)/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    """),format.raw/*4.5*/("""<table>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Role</th>
            <th>Department</th>
            <th># of Projects</th>
        </tr>
        """),_display_(/*14.10*/for(employee <- employees) yield /*14.36*/ {_display_(Seq[Any](format.raw/*14.38*/("""
            """),format.raw/*15.13*/("""<tr>
                <td>
                    <a href=""""),_display_(/*17.31*/routes/*17.37*/.EmployeeController.employee(employee.getId)),format.raw/*17.81*/("""">"""),_display_(/*17.84*/employee/*17.92*/.getFirstName),format.raw/*17.105*/("""</a></td>
                <td>
                    <a href=""""),_display_(/*19.31*/routes/*19.37*/.EmployeeController.employee(employee.getId)),format.raw/*19.81*/("""">"""),_display_(/*19.84*/employee/*19.92*/.getLastName),format.raw/*19.104*/("""</a>
                </td>
                <td>
                    <a href="mailto:"""),_display_(/*22.38*/employee/*22.46*/.getEmail),format.raw/*22.55*/("""">"""),_display_(/*22.58*/employee/*22.66*/.getEmail),format.raw/*22.75*/("""</a>
                </td>
                <td>
                    <a href="tel:"""),_display_(/*25.35*/employee/*25.43*/.getPhone),format.raw/*25.52*/("""">"""),_display_(/*25.55*/employee/*25.63*/.getPhone),format.raw/*25.72*/("""</a>
                </td>
                <td>"""),_display_(/*27.22*/employee/*27.30*/.getRole),format.raw/*27.38*/("""</td>
                <td>"""),_display_(/*28.22*/employee/*28.30*/.getDepartment.getTitle),format.raw/*28.53*/("""</td>
                <td>"""),_display_(/*29.22*/employee/*29.30*/.getProjects.size),format.raw/*29.47*/("""</td>
            </tr>
        """)))}),format.raw/*31.10*/("""
    """),format.raw/*32.5*/("""</table>
""")))}))
      }
    }
  }

  def render(employees:java.util.List[models.users.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employees,user)

  def f:((java.util.List[models.users.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employees,user) => apply(employees,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 09 18:11:16 GMT 2018
                  SOURCE: /media/sf_E_DRIVE/sdev4/project/app/views/employees.scala.html
                  HASH: 0c9b16481226ce63eca171fa0b7939f5dfe07e4c
                  MATRIX: 1001->1|1171->76|1199->79|1234->106|1273->108|1304->113|1585->367|1627->393|1667->395|1708->408|1791->464|1806->470|1871->514|1901->517|1918->525|1953->538|2041->599|2056->605|2121->649|2151->652|2168->660|2202->672|2314->757|2331->765|2361->774|2391->777|2408->785|2438->794|2547->876|2564->884|2594->893|2624->896|2641->904|2671->913|2746->961|2763->969|2792->977|2846->1004|2863->1012|2907->1035|2961->1062|2978->1070|3016->1087|3080->1120|3112->1125
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|46->14|46->14|46->14|47->15|49->17|49->17|49->17|49->17|49->17|49->17|51->19|51->19|51->19|51->19|51->19|51->19|54->22|54->22|54->22|54->22|54->22|54->22|57->25|57->25|57->25|57->25|57->25|57->25|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|63->31|64->32
                  -- GENERATED --
              */
          