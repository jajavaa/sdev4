
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
    """),_display_(/*2.6*/main("Employee View", user)/*2.33*/ {_display_(Seq[Any](format.raw/*2.35*/("""
        """),format.raw/*3.9*/("""<a class="btn btn-success new-button" href=""""),_display_(/*3.54*/routes/*3.60*/.EmployeeController.create),format.raw/*3.86*/("""">Create employee</a>
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">First Name</th>
                    <th scope="col">Last Name</th>
                    <th scope="col">Department</th>
                    <th scope="col" class="text-center">Update</th>
                    <th scope="col" class="text-center text-danger">Delete</th>
                </tr>
            </thead>
            <tbody>
            """),_display_(/*15.14*/for(employee <- employees) yield /*15.40*/ {_display_(Seq[Any](format.raw/*15.42*/("""
                """),format.raw/*16.17*/("""<tr>
                    <td scope="row">
                        <a href=""""),_display_(/*18.35*/routes/*18.41*/.EmployeeController.employee(employee.getId)),format.raw/*18.85*/("""">"""),_display_(/*18.88*/employee/*18.96*/.getFirstName),format.raw/*18.109*/("""</a></td>
                    <td>
                        <a href=""""),_display_(/*20.35*/routes/*20.41*/.EmployeeController.employee(employee.getId)),format.raw/*20.85*/("""">"""),_display_(/*20.88*/employee/*20.96*/.getLastName),format.raw/*20.108*/("""</a>
                    </td>
                    <td>"""),_display_(/*22.26*/employee/*22.34*/.getDepartment.getTitle),format.raw/*22.57*/("""</td>
                    <td class="text-center">
                        <a href=""""),_display_(/*24.35*/routes/*24.41*/.EmployeeController.update(employee.getId)),format.raw/*24.83*/(""""><span class="fa fa-pencil"></span></a>
                    </td>
                    <td class="text-center">
                        <a class="text-danger" href=""""),_display_(/*27.55*/routes/*27.61*/.EmployeeController.delete(employee.getId)),format.raw/*27.103*/("""" onclick="return confirm('Removing employee! Are you sure?');"><span class="fa fa-remove"></span></a>
                    </td>
                </tr>
            """)))}),format.raw/*30.14*/("""
            """),format.raw/*31.13*/("""</tbody>
        </table>
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
                  DATE: Sun Mar 11 13:01:32 GMT 2018
                  SOURCE: /home/konrad/Documents/sdev4/project/app/views/employees.scala.html
                  HASH: 5da5053ccc9891b192b63be65848947c5aba4382
                  MATRIX: 1001->1|1171->76|1202->82|1237->109|1276->111|1311->120|1382->165|1396->171|1442->197|1960->688|2002->714|2042->716|2087->733|2190->809|2205->815|2270->859|2300->862|2317->870|2352->883|2448->952|2463->958|2528->1002|2558->1005|2575->1013|2609->1025|2692->1081|2709->1089|2753->1112|2865->1197|2880->1203|2943->1245|3136->1411|3151->1417|3215->1459|3410->1623|3451->1636
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|35->3|35->3|35->3|47->15|47->15|47->15|48->16|50->18|50->18|50->18|50->18|50->18|50->18|52->20|52->20|52->20|52->20|52->20|52->20|54->22|54->22|54->22|56->24|56->24|56->24|59->27|59->27|59->27|62->30|63->31
                  -- GENERATED --
              */
          