
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

object departments extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[java.util.List[models.Department],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(departments: java.util.List[models.Department], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.75*/("""

"""),_display_(/*3.2*/main("Department View", user)/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""
    """),_display_(/*4.6*/if(user.isInstanceOf[models.users.Admin])/*4.47*/ {_display_(Seq[Any](format.raw/*4.49*/("""
        """),format.raw/*5.9*/("""<a class="btn btn-success new-button" href=""""),_display_(/*5.54*/routes/*5.60*/.DepartmentController.create()),format.raw/*5.90*/("""">Create department</a>
    """)))}),format.raw/*6.6*/("""
    """),format.raw/*7.5*/("""<table class="table">
        <thead class="thead-dark">
            <tr>
                <th scope="col" class="w-75">Title</th>
                <th scope="col" class="text-center w-25">Change</th>
                <th scope="col" class="text-center w-25 text-danger">Remove</th>
            </tr>
        </thead>
        <tbody>
        """),_display_(/*16.10*/if(user.isInstanceOf[models.users.Employee])/*16.54*/ {_display_(Seq[Any](format.raw/*16.56*/("""
            """),_display_(/*17.14*/defining(user.asInstanceOf[models.users.Employee])/*17.64*/ { emp =>_display_(Seq[Any](format.raw/*17.73*/("""
                """),format.raw/*18.17*/("""<tr>
                    <td scope="row"><a href=""""),_display_(/*19.47*/routes/*19.53*/.DepartmentController.department(emp.getDepartment.getId)),format.raw/*19.110*/("""">"""),_display_(/*19.113*/emp/*19.116*/.getDepartment.getId),format.raw/*19.136*/("""</a></td>
                    <td>"""),_display_(/*20.26*/emp/*20.29*/.getDepartment.getTitle),format.raw/*20.52*/("""</td>
                </tr>
            """)))}),format.raw/*22.14*/("""
        """)))}/*23.11*/else/*23.16*/{_display_(Seq[Any](format.raw/*23.17*/("""
            """),_display_(/*24.14*/if(user.isInstanceOf[models.users.Admin])/*24.55*/ {_display_(Seq[Any](format.raw/*24.57*/("""
                """),_display_(/*25.18*/for(department <- departments) yield /*25.48*/ {_display_(Seq[Any](format.raw/*25.50*/("""
                    """),format.raw/*26.21*/("""<tr>
                        <td scope="row">
                            <a href=""""),_display_(/*28.39*/routes/*28.45*/.DepartmentController.department(department.getId)),format.raw/*28.95*/("""">"""),_display_(/*28.98*/department/*28.108*/.getTitle),format.raw/*28.117*/("""</a></td>
                        <td class="text-center">
                            <a href=""""),_display_(/*30.39*/routes/*30.45*/.DepartmentController.update(department.getId)),format.raw/*30.91*/(""""><span class="fa fa-pencil"></span></a>
                        </td>
                        <td class="text-center">
                            <a class="text-danger" href=""""),_display_(/*33.59*/routes/*33.65*/.DepartmentController.delete(department.getId)),format.raw/*33.111*/("""" onclick="return confirm('Deleting department! Are you sure?')"><span class="fa fa-remove"></span></a>
                        </td>
                    </tr>
                """)))}),format.raw/*36.18*/("""
            """)))}),format.raw/*37.14*/("""
        """)))}),format.raw/*38.10*/("""
        """),format.raw/*39.9*/("""</tbody>
    </table>
""")))}))
      }
    }
  }

  def render(departments:java.util.List[models.Department],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(departments,user)

  def f:((java.util.List[models.Department],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (departments,user) => apply(departments,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 13:08:35 GMT 2018
                  SOURCE: /home/konrad/Documents/sdev4/project/app/views/departments.scala.html
                  HASH: 1d630ca66de9c1b745cec2e8685889404666a31d
                  MATRIX: 999->1|1167->74|1195->77|1232->106|1271->108|1302->114|1351->155|1390->157|1425->166|1496->211|1510->217|1560->247|1618->276|1649->281|2016->621|2069->665|2109->667|2150->681|2209->731|2256->740|2301->757|2379->808|2394->814|2473->871|2504->874|2517->877|2559->897|2621->932|2633->935|2677->958|2749->999|2778->1010|2791->1015|2830->1016|2871->1030|2921->1071|2961->1073|3006->1091|3052->1121|3092->1123|3141->1144|3252->1228|3267->1234|3338->1284|3368->1287|3388->1297|3419->1306|3543->1403|3558->1409|3625->1455|3830->1633|3845->1639|3913->1685|4121->1862|4166->1876|4207->1886|4243->1895
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|37->5|37->5|37->5|37->5|38->6|39->7|48->16|48->16|48->16|49->17|49->17|49->17|50->18|51->19|51->19|51->19|51->19|51->19|51->19|52->20|52->20|52->20|54->22|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|58->26|60->28|60->28|60->28|60->28|60->28|60->28|62->30|62->30|62->30|65->33|65->33|65->33|68->36|69->37|70->38|71->39
                  -- GENERATED --
              */
          