
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

object projects extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[java.util.List[models.Project],models.Project,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projects: java.util.List[models.Project], project: models.Project, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.94*/("""

"""),_display_(/*3.2*/main("Project View", user)/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""
    """),format.raw/*4.5*/("""<table>
        <tr>
            <th>#</th>
            <th>Name</th>
        </tr>
        """),_display_(/*9.10*/for(project <- projects) yield /*9.34*/ {_display_(Seq[Any](format.raw/*9.36*/("""
            """),format.raw/*10.13*/("""<tr>
                <td>
                    <a href="#">"""),_display_(/*12.34*/project/*12.41*/.getId),format.raw/*12.47*/("""</a>
                </td>
                <td>"""),_display_(/*14.22*/project/*14.29*/.getName),format.raw/*14.37*/("""</td>
            </tr>
        """)))}),format.raw/*16.10*/("""
    """),format.raw/*17.5*/("""</table>
    <h1>"""),_display_(/*18.10*/project/*18.17*/.getName),format.raw/*18.25*/("""</h1>
    <ul>
        <li>ID:</li>
        <li>"""),_display_(/*21.14*/project/*21.21*/.getId),format.raw/*21.27*/("""</li>
        <li>Name:</li>
        <li>"""),_display_(/*23.14*/project/*23.21*/.getName),format.raw/*23.29*/("""</li>
        <li>Start Date and Time:</li>
        <li>"""),_display_(/*25.14*/project/*25.21*/.getStart),format.raw/*25.30*/("""</li>
        <li>End Date and Time:</li>
        <li>"""),_display_(/*27.14*/project/*27.21*/.getEnd),format.raw/*27.28*/("""</li>
        <li>Employees Assigned:</li>
        <li>"""),_display_(/*29.14*/project/*29.21*/.getEmployees.size()),format.raw/*29.41*/("""</li>
        <li>
            <a href=""""),_display_(/*31.23*/routes/*31.29*/.ProjectController.delete(project.getId)),format.raw/*31.69*/("""">Delete</a>
        </li>
    </ul>
    <table>
        <tr>
            <th>#</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Address</th>
        </tr>
        """),_display_(/*43.10*/for(employee <- project.getEmployees) yield /*43.47*/ {_display_(Seq[Any](format.raw/*43.49*/("""
            """),format.raw/*44.13*/("""<tr>
                <td>
                    <a href=""""),_display_(/*46.31*/routes/*46.37*/.EmployeeController.employee(employee.getId)),format.raw/*46.81*/("""">"""),_display_(/*46.84*/employee/*46.92*/.getId),format.raw/*46.98*/("""</a>
                </td>
                <td>"""),_display_(/*48.22*/employee/*48.30*/.getFirstName),format.raw/*48.43*/("""</td>
                <td>"""),_display_(/*49.22*/employee/*49.30*/.getLastName),format.raw/*49.42*/("""</td>
                <td>
                    <a href="mailto:"""),_display_(/*51.38*/employee/*51.46*/.getEmail),format.raw/*51.55*/("""">"""),_display_(/*51.58*/employee/*51.66*/.getEmail),format.raw/*51.75*/("""</a>
                </td>
                <td>
                    <a href="tel:"""),_display_(/*54.35*/employee/*54.43*/.getPhone),format.raw/*54.52*/("""">"""),_display_(/*54.55*/employee/*54.63*/.getPhone),format.raw/*54.72*/("""</a>
                </td>
                <td>"""),_display_(/*56.22*/employee/*56.30*/.getAddress.toString),format.raw/*56.50*/("""</td>
            </tr>
        """)))}),format.raw/*58.10*/("""
    """),format.raw/*59.5*/("""</table>
""")))}))
      }
    }
  }

  def render(projects:java.util.List[models.Project],project:models.Project,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(projects,project,user)

  def f:((java.util.List[models.Project],models.Project,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (projects,project,user) => apply(projects,project,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 08 16:48:58 GMT 2018
                  SOURCE: /media/sf_E_DRIVE/sdev4/project/app/views/projects.scala.html
                  HASH: 9e945deda7fdd76b72b585cc022de4c163697501
                  MATRIX: 1008->1|1195->93|1223->96|1257->122|1296->124|1327->129|1446->222|1485->246|1524->248|1565->261|1651->320|1667->327|1694->333|1769->381|1785->388|1814->396|1878->429|1910->434|1955->452|1971->459|2000->467|2076->516|2092->523|2119->529|2188->571|2204->578|2233->586|2317->643|2333->650|2363->659|2445->714|2461->721|2489->728|2572->784|2588->791|2629->811|2697->852|2712->858|2773->898|3054->1152|3107->1189|3147->1191|3188->1204|3271->1260|3286->1266|3351->1310|3381->1313|3398->1321|3425->1327|3500->1375|3517->1383|3551->1396|3605->1423|3622->1431|3655->1443|3746->1507|3763->1515|3793->1524|3823->1527|3840->1535|3870->1544|3979->1626|3996->1634|4026->1643|4056->1646|4073->1654|4103->1663|4178->1711|4195->1719|4236->1739|4300->1772|4332->1777
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|41->9|41->9|41->9|42->10|44->12|44->12|44->12|46->14|46->14|46->14|48->16|49->17|50->18|50->18|50->18|53->21|53->21|53->21|55->23|55->23|55->23|57->25|57->25|57->25|59->27|59->27|59->27|61->29|61->29|61->29|63->31|63->31|63->31|75->43|75->43|75->43|76->44|78->46|78->46|78->46|78->46|78->46|78->46|80->48|80->48|80->48|81->49|81->49|81->49|83->51|83->51|83->51|83->51|83->51|83->51|86->54|86->54|86->54|86->54|86->54|86->54|88->56|88->56|88->56|90->58|91->59
                  -- GENERATED --
              */
          