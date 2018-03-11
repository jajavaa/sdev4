
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
    """),format.raw/*4.5*/("""<h1>Project: """),_display_(/*4.19*/project/*4.26*/.getName),format.raw/*4.34*/("""</h1>
    <ul class="list-inline">
        <li class="list-inline-item"><h3>Start Date: """),_display_(/*6.55*/project/*6.62*/.getStartString),format.raw/*6.77*/("""</h3></li>
        <li class="list-inline-item"><h3>|</h3></li>
        <li class="list-inline-item"><h3>End Date: """),_display_(/*8.53*/project/*8.60*/.getEndString),format.raw/*8.73*/("""</h3></li>
        <li class="list-inline-item"><h3>|</h3></li>
        <li class="list-inline-item">
            <h3>
                Project end in:
                """),_display_(/*13.18*/if(project.getDays <= 10)/*13.43*/ {_display_(Seq[Any](format.raw/*13.45*/("""
                    """),format.raw/*14.21*/("""<span class="text-danger">"""),_display_(/*14.48*/project/*14.55*/.getDays),format.raw/*14.63*/(""" """),format.raw/*14.64*/("""days</span>
                """)))}/*15.19*/else/*15.24*/{_display_(Seq[Any](format.raw/*15.25*/("""
                    """),_display_(/*16.22*/if(project.getDays <= 20)/*16.47*/ {_display_(Seq[Any](format.raw/*16.49*/("""
                        """),format.raw/*17.25*/("""<span class="text-warning">"""),_display_(/*17.53*/project/*17.60*/.getDays),format.raw/*17.68*/(""" """),format.raw/*17.69*/("""days</span>
                    """)))}/*18.23*/else/*18.28*/{_display_(Seq[Any](format.raw/*18.29*/("""
                        """),format.raw/*19.25*/("""<span class="text-success">"""),_display_(/*19.53*/project/*19.60*/.getDays),format.raw/*19.68*/(""" """),format.raw/*19.69*/("""days</span>
                    """)))}),format.raw/*20.22*/("""
                """)))}),format.raw/*21.18*/("""
            """),format.raw/*22.13*/("""</h3>
        </li>
    </ul>
    <h3>Project Team</h3>
    <table class="table">
        <thead class="thead-dark">
            <tr>
                <th scope="col">#</th>
                <th scope="col">First Name</th>
                <th scope="col">Last Name</th>
                <th scope="col">Email</th>
                <th scope="col">Mobile Phone</th>
            </tr>
        </thead>
        <tbody>
        """),_display_(/*37.10*/for(employee <- project.getEmployees) yield /*37.47*/ {_display_(Seq[Any](format.raw/*37.49*/("""
            """),format.raw/*38.13*/("""<tr>
                <td>
                """),_display_(/*40.18*/defining(project.getEmployees.indexOf(employee) + 1)/*40.70*/ { index =>_display_(Seq[Any](format.raw/*40.81*/("""
                    """),_display_(/*41.22*/index),format.raw/*41.27*/("""
                """)))}),format.raw/*42.18*/("""
                """),format.raw/*43.17*/("""</td>
                <td>
                    <a href=""""),_display_(/*45.31*/routes/*45.37*/.EmployeeController.employee(employee.getId)),format.raw/*45.81*/("""">"""),_display_(/*45.84*/employee/*45.92*/.getFirstName),format.raw/*45.105*/("""</a>
                </td>
                <td>
                    <a href=""""),_display_(/*48.31*/routes/*48.37*/.EmployeeController.employee(employee.getId)),format.raw/*48.81*/("""">"""),_display_(/*48.84*/employee/*48.92*/.getLastName),format.raw/*48.104*/("""</a>
                </td>
                <td>
                    <a href="mailto:"""),_display_(/*51.38*/employee/*51.46*/.getEmail),format.raw/*51.55*/("""">"""),_display_(/*51.58*/employee/*51.66*/.getEmail),format.raw/*51.75*/("""</a>
                </td>
                <td>"""),_display_(/*53.22*/employee/*53.30*/.getPhone),format.raw/*53.39*/("""</td>
            </tr>
        """)))}),format.raw/*55.10*/("""
        """),format.raw/*56.9*/("""</tbody>
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
                  DATE: Sun Mar 11 10:59:39 GMT 2018
                  SOURCE: /home/konrad/Documents/sdev4/project/app/views/project.scala.html
                  HASH: 49ae261c0af8779bb263048acf19e16a776c0c4e
                  MATRIX: 976->1|1121->51|1149->54|1184->81|1223->83|1254->88|1294->102|1309->109|1337->117|1452->206|1467->213|1502->228|1644->344|1659->351|1692->364|1887->532|1921->557|1961->559|2010->580|2064->607|2080->614|2109->622|2138->623|2186->653|2199->658|2238->659|2287->681|2321->706|2361->708|2414->733|2469->761|2485->768|2514->776|2543->777|2595->811|2608->816|2647->817|2700->842|2755->870|2771->877|2800->885|2829->886|2893->919|2942->937|2983->950|3431->1371|3484->1408|3524->1410|3565->1423|3635->1466|3696->1518|3745->1529|3794->1551|3820->1556|3869->1574|3914->1591|3998->1648|4013->1654|4078->1698|4108->1701|4125->1709|4160->1722|4265->1800|4280->1806|4345->1850|4375->1853|4392->1861|4426->1873|4538->1958|4555->1966|4585->1975|4615->1978|4632->1986|4662->1995|4737->2043|4754->2051|4784->2060|4848->2093|4884->2102
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|36->4|38->6|38->6|38->6|40->8|40->8|40->8|45->13|45->13|45->13|46->14|46->14|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|51->19|51->19|52->20|53->21|54->22|69->37|69->37|69->37|70->38|72->40|72->40|72->40|73->41|73->41|74->42|75->43|77->45|77->45|77->45|77->45|77->45|77->45|80->48|80->48|80->48|80->48|80->48|80->48|83->51|83->51|83->51|83->51|83->51|83->51|85->53|85->53|85->53|87->55|88->56
                  -- GENERATED --
              */
          