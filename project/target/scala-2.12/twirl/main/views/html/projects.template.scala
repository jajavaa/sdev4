
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
    """),_display_(/*4.6*/if(user.isInstanceOf[models.users.Admin])/*4.47*/ {_display_(Seq[Any](format.raw/*4.49*/("""
        """),format.raw/*5.9*/("""<a class="btn btn-success new-button" href=""""),_display_(/*5.54*/routes/*5.60*/.ProjectController.create()),format.raw/*5.87*/("""">Create project</a>
    """)))}),format.raw/*6.6*/("""
    """),format.raw/*7.5*/("""<table class="table">
        <thead class="thead-dark">
            <tr>
                <th scope="col">Name</th>
                <th scope="col">Start Date</th>
                <th scope="col">End Date</th>
                <th scope="col">Days Left</th>
                """),_display_(/*14.18*/if(user.isInstanceOf[models.users.Admin])/*14.59*/ {_display_(Seq[Any](format.raw/*14.61*/("""
                    """),format.raw/*15.21*/("""<th scope="col">Employees Assigned</th>
                    <th scope="col" class="text-center">Update</th>
                    <th scope="col" class="text-center text-danger">Delete</th>
                """)))}),format.raw/*18.18*/("""
            """),format.raw/*19.13*/("""</tr>
        </thead>
        """),_display_(/*21.10*/for(project <- projects) yield /*21.34*/ {_display_(Seq[Any](format.raw/*21.36*/("""
            """),format.raw/*22.13*/("""<tr>
                <td scope="row">
                    <a href=""""),_display_(/*24.31*/routes/*24.37*/.ProjectController.project(project.getId)),format.raw/*24.78*/("""">"""),_display_(/*24.81*/project/*24.88*/.getName),format.raw/*24.96*/("""</a></td>
                <td>"""),_display_(/*25.22*/project/*25.29*/.getStartString),format.raw/*25.44*/("""</td>
                <td>"""),_display_(/*26.22*/project/*26.29*/.getEndString),format.raw/*26.42*/("""</td>
                <td>
                    """),_display_(/*28.22*/if(project.getDays <= 10)/*28.47*/ {_display_(Seq[Any](format.raw/*28.49*/("""
                        """),format.raw/*29.25*/("""<span class="text-danger">"""),_display_(/*29.52*/project/*29.59*/.getDays),format.raw/*29.67*/(""" """),format.raw/*29.68*/("""days</span>
                    """)))}/*30.23*/else/*30.28*/{_display_(Seq[Any](format.raw/*30.29*/("""
                        """),_display_(/*31.26*/if(project.getDays <= 20)/*31.51*/ {_display_(Seq[Any](format.raw/*31.53*/("""
                            """),format.raw/*32.29*/("""<span class="text-warning">"""),_display_(/*32.57*/project/*32.64*/.getDays),format.raw/*32.72*/(""" """),format.raw/*32.73*/("""days</span>
                        """)))}/*33.27*/else/*33.32*/{_display_(Seq[Any](format.raw/*33.33*/("""
                            """),format.raw/*34.29*/("""<span class="text-success">"""),_display_(/*34.57*/project/*34.64*/.getDays),format.raw/*34.72*/(""" """),format.raw/*34.73*/("""days</span>
                        """)))}),format.raw/*35.26*/("""
                    """)))}),format.raw/*36.22*/("""
                """),format.raw/*37.17*/("""</td>
                """),_display_(/*38.18*/if(user.isInstanceOf[models.users.Admin])/*38.59*/ {_display_(Seq[Any](format.raw/*38.61*/("""
                    """),_display_(/*39.22*/if(project.getEmployees.size == 0)/*39.56*/ {_display_(Seq[Any](format.raw/*39.58*/("""
                        """),format.raw/*40.25*/("""<td class="text-danger">"""),_display_(/*40.50*/project/*40.57*/.getEmployees.size),format.raw/*40.75*/("""</td>
                    """)))}/*41.23*/else/*41.28*/{_display_(Seq[Any](format.raw/*41.29*/("""
                        """),format.raw/*42.25*/("""<td>"""),_display_(/*42.30*/project/*42.37*/.getEmployees.size),format.raw/*42.55*/("""</td>
                    """)))}),format.raw/*43.22*/("""
                    """),format.raw/*44.21*/("""<td class="text-center">
                        <a href=""""),_display_(/*45.35*/routes/*45.41*/.ProjectController.update(project.getId)),format.raw/*45.81*/(""""><span class="fa fa-pencil"></span></a>
                    </td>
                    <td class="text-center">
                        <a class="text-danger" href=""""),_display_(/*48.55*/routes/*48.61*/.ProjectController.delete(project.getId)),format.raw/*48.101*/("""" onclick="return confirm('Removing project! Are you sure?')"><span class="fa fa-remove"></span></a>
                    </td>
                """)))}),format.raw/*50.18*/("""
            """),format.raw/*51.13*/("""</tr>
        """)))}),format.raw/*52.10*/("""
    """),format.raw/*53.5*/("""</table>
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
                  DATE: Sun Mar 11 13:29:34 GMT 2018
                  SOURCE: /home/konrad/Documents/sdev4/project/app/views/projects.scala.html
                  HASH: 03ef1a8ca09f16e3aef6cc352b9a6115b72d71ed
                  MATRIX: 993->1|1155->68|1183->71|1217->97|1256->99|1287->105|1336->146|1375->148|1410->157|1481->202|1495->208|1542->235|1597->261|1628->266|1929->540|1979->581|2019->583|2068->604|2304->809|2345->822|2404->854|2444->878|2484->880|2525->893|2620->961|2635->967|2697->1008|2727->1011|2743->1018|2772->1026|2830->1057|2846->1064|2882->1079|2936->1106|2952->1113|2986->1126|3061->1174|3095->1199|3135->1201|3188->1226|3242->1253|3258->1260|3287->1268|3316->1269|3368->1303|3381->1308|3420->1309|3473->1335|3507->1360|3547->1362|3604->1391|3659->1419|3675->1426|3704->1434|3733->1435|3789->1473|3802->1478|3841->1479|3898->1508|3953->1536|3969->1543|3998->1551|4027->1552|4095->1589|4148->1611|4193->1628|4243->1651|4293->1692|4333->1694|4382->1716|4425->1750|4465->1752|4518->1777|4570->1802|4586->1809|4625->1827|4671->1855|4684->1860|4723->1861|4776->1886|4808->1891|4824->1898|4863->1916|4921->1943|4970->1964|5056->2023|5071->2029|5132->2069|5325->2235|5340->2241|5402->2281|5577->2425|5618->2438|5664->2453|5696->2458
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|37->5|37->5|37->5|37->5|38->6|39->7|46->14|46->14|46->14|47->15|50->18|51->19|53->21|53->21|53->21|54->22|56->24|56->24|56->24|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|58->26|60->28|60->28|60->28|61->29|61->29|61->29|61->29|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|66->34|66->34|66->34|67->35|68->36|69->37|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|74->42|75->43|76->44|77->45|77->45|77->45|80->48|80->48|80->48|82->50|83->51|84->52|85->53
                  -- GENERATED --
              */
          