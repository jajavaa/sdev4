
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

"""),_display_(/*3.2*/main(department.getTitle, user)/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
    """),format.raw/*4.5*/("""<table>
        <tr>
            <th>#</th>
            <th>Title</th>
        </tr>
        <tr>
            <td>"""),_display_(/*10.18*/department/*10.28*/.getId),format.raw/*10.34*/("""</td>
            <td>"""),_display_(/*11.18*/department/*11.28*/.getTitle),format.raw/*11.37*/("""</td>
        </tr>
    </table>
    <table>
        <tr>
            <th>#</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Department</th>
            <th>Address</th>
        </tr>
        """),_display_(/*24.10*/for(employee <- department.getEmployees) yield /*24.50*/ {_display_(Seq[Any](format.raw/*24.52*/("""
            """),format.raw/*25.13*/("""<tr>
                <td>
                    <a href=""""),_display_(/*27.31*/routes/*27.37*/.EmployeeController.employee(employee.getId)),format.raw/*27.81*/("""">"""),_display_(/*27.84*/employee/*27.92*/.getId),format.raw/*27.98*/("""</a>
                </td>
                <td>"""),_display_(/*29.22*/employee/*29.30*/.getFirstName),format.raw/*29.43*/("""</td>
                <td>"""),_display_(/*30.22*/employee/*30.30*/.getLastName),format.raw/*30.42*/("""</td>
                <td>
                    <a href="mailto:"""),_display_(/*32.38*/employee/*32.46*/.getEmail),format.raw/*32.55*/("""">"""),_display_(/*32.58*/employee/*32.66*/.getEmail),format.raw/*32.75*/("""</a>
                </td>
                <td>
                    <a href="tel:"""),_display_(/*35.35*/employee/*35.43*/.getPhone),format.raw/*35.52*/("""">"""),_display_(/*35.55*/employee/*35.63*/.getPhone),format.raw/*35.72*/("""</a>
                </td>
                <td>"""),_display_(/*37.22*/employee/*37.30*/.getAddress.toString),format.raw/*37.50*/("""</td>
            </tr>
        """)))}),format.raw/*39.10*/("""
    """),format.raw/*40.5*/("""</table>
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
                  DATE: Fri Mar 09 13:29:47 GMT 2018
                  SOURCE: /media/sf_E_DRIVE/sdev4/project/app/views/department.scala.html
                  HASH: 1736158d9a9e56dd0931221914432c60efe1a1ea
                  MATRIX: 982->1|1133->57|1161->60|1200->91|1239->93|1270->98|1412->213|1431->223|1458->229|1508->252|1527->262|1557->271|1866->553|1922->593|1962->595|2003->608|2086->664|2101->670|2166->714|2196->717|2213->725|2240->731|2315->779|2332->787|2366->800|2420->827|2437->835|2470->847|2561->911|2578->919|2608->928|2638->931|2655->939|2685->948|2794->1030|2811->1038|2841->1047|2871->1050|2888->1058|2918->1067|2993->1115|3010->1123|3051->1143|3115->1176|3147->1181
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|42->10|42->10|42->10|43->11|43->11|43->11|56->24|56->24|56->24|57->25|59->27|59->27|59->27|59->27|59->27|59->27|61->29|61->29|61->29|62->30|62->30|62->30|64->32|64->32|64->32|64->32|64->32|64->32|67->35|67->35|67->35|67->35|67->35|67->35|69->37|69->37|69->37|71->39|72->40
                  -- GENERATED --
              */
          