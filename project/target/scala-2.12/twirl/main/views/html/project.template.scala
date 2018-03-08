
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

object project extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.Project,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(project: models.Project, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.52*/("""

"""),_display_(/*3.2*/main(project.getName, user)/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    """),format.raw/*4.5*/("""<h1>"""),_display_(/*4.10*/project/*4.17*/.getName),format.raw/*4.25*/("""</h1>
    <table>
        <tr>
            <td>ID</td>
            <td>"""),_display_(/*8.18*/project/*8.25*/.getId),format.raw/*8.31*/("""</td>
        </tr>
        <tr>
            <td>Name</td>
            <td>"""),_display_(/*12.18*/project/*12.25*/.getName),format.raw/*12.33*/("""</td>
        </tr>
        <tr>
            <td>Start</td>
            <td>"""),_display_(/*16.18*/project/*16.25*/.getStart.toString),format.raw/*16.43*/("""</td>
        </tr>
        <tr>
            <td>End</td>
            <td>"""),_display_(/*20.18*/project/*20.25*/.getEnd.toString),format.raw/*20.41*/("""</td>
        </tr>
        <tr>
            <td>Employees</td>
            <td>
                <ul>
                    """),_display_(/*26.22*/for(employee <- project.getEmployees) yield /*26.59*/ {_display_(Seq[Any](format.raw/*26.61*/("""
                        """),format.raw/*27.25*/("""<li>
                            <a href=""""),_display_(/*28.39*/routes/*28.45*/.EmployeeController.employee(employee.getId)),format.raw/*28.89*/("""">"""),_display_(/*28.92*/employee/*28.100*/.getNames),format.raw/*28.109*/("""</a>
                        </li>
                    """)))}),format.raw/*30.22*/("""
                """),format.raw/*31.17*/("""</ul>
            </td>
        </tr>
    </table>
""")))}))
      }
    }
  }

  def render(project:models.Project,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(project,user)

  def f:((models.Project,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (project,user) => apply(project,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 08 18:59:41 GMT 2018
                  SOURCE: /home/konrad/Documents/sdev4/project/app/views/project.scala.html
                  HASH: 69d39f878773a87264274ac71a23a6424d99aae2
                  MATRIX: 976->1|1121->51|1149->54|1184->81|1223->83|1254->88|1285->93|1300->100|1328->108|1426->180|1441->187|1467->193|1570->269|1586->276|1615->284|1719->361|1735->368|1774->386|1876->461|1892->468|1929->484|2079->607|2132->644|2172->646|2225->671|2295->714|2310->720|2375->764|2405->767|2423->775|2454->784|2541->840|2586->857
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|36->4|40->8|40->8|40->8|44->12|44->12|44->12|48->16|48->16|48->16|52->20|52->20|52->20|58->26|58->26|58->26|59->27|60->28|60->28|60->28|60->28|60->28|60->28|62->30|63->31
                  -- GENERATED --
              */
          