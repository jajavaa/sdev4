
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

object departments extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[java.util.List[models.Department],models.Department,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(departments: java.util.List[models.Department], department: models.Department, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.106*/("""

"""),_display_(/*3.2*/main("Department View", user)/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""
    """),format.raw/*4.5*/("""<table>
        <tr>
            <th>#</th>
            <th>Title</th>
        </tr>
        """),_display_(/*9.10*/for(department <- departments) yield /*9.40*/ {_display_(Seq[Any](format.raw/*9.42*/("""
            """),format.raw/*10.13*/("""<tr>
                <td>
                    <a href=""""),_display_(/*12.31*/routes/*12.37*/.DepartmentController.departments(department.getId)),format.raw/*12.88*/("""">"""),_display_(/*12.91*/department/*12.101*/.getId),format.raw/*12.107*/("""</a>
                </td>
                <td>"""),_display_(/*14.22*/department/*14.32*/.getTitle),format.raw/*14.41*/("""</td>
            </tr>
        """)))}),format.raw/*16.10*/("""
    """),format.raw/*17.5*/("""</table>
    <h1>"""),_display_(/*18.10*/department/*18.20*/.getTitle),format.raw/*18.29*/("""</h1>
    <ul>
        <li>ID:</li>
        <li>"""),_display_(/*21.14*/department/*21.24*/.getId),format.raw/*21.30*/("""</li>
        <li>Title:</li>
        <li>"""),_display_(/*23.14*/department/*23.24*/.getTitle),format.raw/*23.33*/("""</li>
        <li>Size: </li>
        <li>"""),_display_(/*25.14*/department/*25.24*/.getEmployees.size()),format.raw/*25.44*/("""</li>
        """),format.raw/*26.17*/("""
            """),format.raw/*27.91*/("""
        """),format.raw/*28.18*/("""
    """),format.raw/*29.5*/("""</ul>
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
        """),_display_(/*40.10*/for(employee <- department.getEmployees) yield /*40.50*/ {_display_(Seq[Any](format.raw/*40.52*/("""
            """),format.raw/*41.13*/("""<tr>
                <td>
                    <a href=""""),_display_(/*43.31*/routes/*43.37*/.EmployeeController.employee(employee.getId)),format.raw/*43.81*/("""">"""),_display_(/*43.84*/employee/*43.92*/.getId),format.raw/*43.98*/("""</a>
                </td>
                <td>"""),_display_(/*45.22*/employee/*45.30*/.getFirstName),format.raw/*45.43*/("""</td>
                <td>"""),_display_(/*46.22*/employee/*46.30*/.getLastName),format.raw/*46.42*/("""</td>
                <td>
                    <a href="mailto:"""),_display_(/*48.38*/employee/*48.46*/.getEmail),format.raw/*48.55*/("""">"""),_display_(/*48.58*/employee/*48.66*/.getEmail),format.raw/*48.75*/("""</a>
                </td>
                <td>
                    <a href="tel:"""),_display_(/*51.35*/employee/*51.43*/.getPhone),format.raw/*51.52*/("""">"""),_display_(/*51.55*/employee/*51.63*/.getPhone),format.raw/*51.72*/("""</a>
                </td>
                <td>"""),_display_(/*53.22*/employee/*53.30*/.getAddress.toString),format.raw/*53.50*/("""</td>
            </tr>
        """)))}),format.raw/*55.10*/("""
    """),format.raw/*56.5*/("""</table>
""")))}))
      }
    }
  }

  def render(departments:java.util.List[models.Department],department:models.Department,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(departments,department,user)

  def f:((java.util.List[models.Department],models.Department,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (departments,department,user) => apply(departments,department,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 08 18:59:41 GMT 2018
                  SOURCE: /home/konrad/Documents/sdev4/project/app/views/departments.scala.html
                  HASH: 7661db428ae5485ef4e19af6fc644f4fd7f38aba
                  MATRIX: 1017->1|1217->105|1245->108|1282->137|1321->139|1352->144|1472->238|1517->268|1556->270|1597->283|1680->339|1695->345|1767->396|1797->399|1817->409|1845->415|1920->463|1939->473|1969->482|2033->515|2065->520|2110->538|2129->548|2159->557|2235->606|2254->616|2281->622|2351->665|2370->675|2400->684|2470->727|2489->737|2530->757|2572->779|2613->870|2650->888|2682->893|2964->1148|3020->1188|3060->1190|3101->1203|3184->1259|3199->1265|3264->1309|3294->1312|3311->1320|3338->1326|3413->1374|3430->1382|3464->1395|3518->1422|3535->1430|3568->1442|3659->1506|3676->1514|3706->1523|3736->1526|3753->1534|3783->1543|3892->1625|3909->1633|3939->1642|3969->1645|3986->1653|4016->1662|4091->1710|4108->1718|4149->1738|4213->1771|4245->1776
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|41->9|41->9|41->9|42->10|44->12|44->12|44->12|44->12|44->12|44->12|46->14|46->14|46->14|48->16|49->17|50->18|50->18|50->18|53->21|53->21|53->21|55->23|55->23|55->23|57->25|57->25|57->25|58->26|59->27|60->28|61->29|72->40|72->40|72->40|73->41|75->43|75->43|75->43|75->43|75->43|75->43|77->45|77->45|77->45|78->46|78->46|78->46|80->48|80->48|80->48|80->48|80->48|80->48|83->51|83->51|83->51|83->51|83->51|83->51|85->53|85->53|85->53|87->55|88->56
                  -- GENERATED --
              */
          