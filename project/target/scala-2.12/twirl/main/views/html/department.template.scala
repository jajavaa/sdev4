
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

object department extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.Department,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(department: models.Department, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),_display_(/*3.2*/main(department.getTitle + " Staff Preview", user)/*3.52*/ {_display_(Seq[Any](format.raw/*3.54*/("""
    """),format.raw/*4.5*/("""<table class="table">
        <thead class="thead-dark">
            <tr>
                <th scope="col">First Name</th>
                <th scope="col" class="w-50">Last Name</th>
                <th scope="col">Email</th>
            </tr>
        </thead>
        <tbody>
            """),_display_(/*13.14*/for(employee <- department.getEmployees) yield /*13.54*/ {_display_(Seq[Any](format.raw/*13.56*/("""
                """),format.raw/*14.17*/("""<tr>
                    <td scope="row"><a href=""""),_display_(/*15.47*/routes/*15.53*/.EmployeeController.employee(employee.getId)),format.raw/*15.97*/("""">"""),_display_(/*15.100*/employee/*15.108*/.getFirstName),format.raw/*15.121*/("""</a></td>
                    <td><a href=""""),_display_(/*16.35*/routes/*16.41*/.EmployeeController.employee(employee.getId)),format.raw/*16.85*/("""">"""),_display_(/*16.88*/employee/*16.96*/.getLastName),format.raw/*16.108*/("""</a></td>
                    <td>
                        <a href="mailto:"""),_display_(/*18.42*/employee/*18.50*/.getEmail),format.raw/*18.59*/("""">"""),_display_(/*18.62*/employee/*18.70*/.getEmail),format.raw/*18.79*/("""</a>
                    </td>
                </tr>
            """)))}),format.raw/*21.14*/("""
        """),format.raw/*22.9*/("""</tbody>
    </table>
""")))}))
      }
    }
  }

  def render(department:models.Department,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(department,user)

  def f:((models.Department,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (department,user) => apply(department,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 10 22:49:33 GMT 2018
                  SOURCE: /home/konrad/Documents/sdev4/project/app/views/department.scala.html
                  HASH: c7ce674854095539c2563c7e8544666e8f9c6126
                  MATRIX: 982->1|1133->57|1161->60|1219->110|1258->112|1289->117|1605->406|1661->446|1701->448|1746->465|1824->516|1839->522|1904->566|1935->569|1953->577|1988->590|2059->634|2074->640|2139->684|2169->687|2186->695|2220->707|2323->783|2340->791|2370->800|2400->803|2417->811|2447->820|2544->886|2580->895
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|45->13|45->13|45->13|46->14|47->15|47->15|47->15|47->15|47->15|47->15|48->16|48->16|48->16|48->16|48->16|48->16|50->18|50->18|50->18|50->18|50->18|50->18|53->21|54->22
                  -- GENERATED --
              */
          