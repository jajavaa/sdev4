
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
/*1.2*/import helper._

object addProject extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[play.data.Form[models.Project],models.Project,java.util.List[models.users.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(projectForm: play.data.Form[models.Project], project: models.Project, employees: java.util.List[models.users.Employee], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.147*/("""


"""),_display_(/*5.2*/main("Add/Change project", user)/*5.34*/ {_display_(Seq[Any](format.raw/*5.36*/("""
    """),_display_(/*6.6*/form(action = routes.ProjectController.form)/*6.50*/ {_display_(Seq[Any](format.raw/*6.52*/("""
        """),_display_(/*7.10*/CSRF/*7.14*/.formField),format.raw/*7.24*/("""
        """),_display_(/*8.10*/if(project == null)/*8.29*/ {_display_(Seq[Any](format.raw/*8.31*/("""
            """),format.raw/*9.13*/("""<h3>New Project Information</h3>
        """)))}/*10.11*/else/*10.16*/{_display_(Seq[Any](format.raw/*10.17*/("""
            """),format.raw/*11.13*/("""<h3>"""),_display_(/*11.18*/project/*11.25*/.getName),format.raw/*11.33*/(""" """),format.raw/*11.34*/("""Information</h3>
        """)))}),format.raw/*12.10*/("""

        """),format.raw/*14.9*/("""<div class="form-inline">
            <div class="form-group">
                """),_display_(/*16.18*/inputText(projectForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*16.93*/("""
            """),format.raw/*17.13*/("""</div>
            <div class="form-group">
                """),_display_(/*19.18*/inputDate(projectForm("start"), '_label -> "Start Time", 'class -> "form-control")),format.raw/*19.100*/("""
            """),format.raw/*20.13*/("""</div>
            <div class="form-group">
                """),_display_(/*22.18*/inputDate(projectForm("end"), '_label -> "End Time", 'class -> "form-control")),format.raw/*22.96*/("""
            """),format.raw/*23.13*/("""</div>
            <div class="form-group">
            """),_display_(/*25.14*/if(project == null)/*25.33*/ {_display_(Seq[Any](format.raw/*25.35*/("""
                """),format.raw/*26.17*/("""<input type="submit" class="form-control btn btn-success" value="Add Project">
            """)))}/*27.15*/else/*27.20*/{_display_(Seq[Any](format.raw/*27.21*/("""
                """),format.raw/*28.17*/("""<input type="submit" class="form-control btn btn-primary" value="Update Project">
                """)))}),format.raw/*29.18*/("""
            """),format.raw/*30.13*/("""</div>
        </div>
        <h3>Choose project team</h3>
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th scope="col" class="text-center">Selected</th>
                    <th scope="col">First Name</th>
                    <th scope="col">Last Name</th>
                    <th scope="col">Department</th>
                </tr>
            </thead>
            <tbody>
            """),_display_(/*43.14*/if(project == null)/*43.33*/ {_display_(Seq[Any](format.raw/*43.35*/("""
                """),_display_(/*44.18*/for(employee <- employees) yield /*44.44*/ {_display_(Seq[Any](format.raw/*44.46*/("""
                    """),format.raw/*45.21*/("""<tr>
                        <td class="text-center"><input class="form-check-input" type="checkbox" id="employee" name=""""),_display_(/*46.118*/employee/*46.126*/.getId),format.raw/*46.132*/(""""></td>
                        <td>
                            <a href=""""),_display_(/*48.39*/routes/*48.45*/.EmployeeController.employee(employee.getId)),format.raw/*48.89*/("""">"""),_display_(/*48.92*/employee/*48.100*/.getFirstName),format.raw/*48.113*/("""</a>
                        </td>
                        <td>
                            <a href=""""),_display_(/*51.39*/routes/*51.45*/.EmployeeController.employee(employee.getId)),format.raw/*51.89*/("""">"""),_display_(/*51.92*/employee/*51.100*/.getLastName),format.raw/*51.112*/("""</a>
                        </td>
                        <td>"""),_display_(/*53.30*/employee/*53.38*/.getDepartment.getTitle),format.raw/*53.61*/("""</td>
                    </tr>
                """)))}),format.raw/*55.18*/("""
            """)))}/*56.15*/else/*56.20*/{_display_(Seq[Any](format.raw/*56.21*/("""
                """),_display_(/*57.18*/for(employee <- employees) yield /*57.44*/ {_display_(Seq[Any](format.raw/*57.46*/("""
                    """),format.raw/*58.21*/("""<tr>
                        <td class="text-center">
                        """),_display_(/*60.26*/if(project.getEmployees.contains(employee))/*60.69*/ {_display_(Seq[Any](format.raw/*60.71*/("""
                            """),format.raw/*61.29*/("""<input class="form-check-input" type="checkbox" id="employee" name=""""),_display_(/*61.98*/employee/*61.106*/.getId),format.raw/*61.112*/("""" checked>
                        """)))}/*62.27*/else/*62.32*/{_display_(Seq[Any](format.raw/*62.33*/("""
                            """),format.raw/*63.29*/("""<input class="form-check-input" type="checkbox" id="employee" name=""""),_display_(/*63.98*/employee/*63.106*/.getId),format.raw/*63.112*/("""">
                            """)))}),format.raw/*64.30*/("""
                        """),format.raw/*65.25*/("""</td>
                        <td>
                            <a href=""""),_display_(/*67.39*/routes/*67.45*/.EmployeeController.employee(employee.getId)),format.raw/*67.89*/("""">"""),_display_(/*67.92*/employee/*67.100*/.getFirstName),format.raw/*67.113*/("""</a>
                        </td>
                        <td>
                            <a href=""""),_display_(/*70.39*/routes/*70.45*/.EmployeeController.employee(employee.getId)),format.raw/*70.89*/("""">"""),_display_(/*70.92*/employee/*70.100*/.getLastName),format.raw/*70.112*/("""</a>
                        </td>
                        <td>"""),_display_(/*72.30*/employee/*72.38*/.getDepartment.getTitle),format.raw/*72.61*/("""</td>
                    </tr>
                """)))}),format.raw/*74.18*/("""
            """)))}),format.raw/*75.14*/("""
            """),format.raw/*76.13*/("""</tbody>
        </table>
        """),_display_(/*78.10*/inputText(projectForm("id"), '_label -> "", 'readonly -> "readonly", 'hidden -> "hidden")),format.raw/*78.99*/("""
        """),format.raw/*79.9*/("""</div>
    """)))}),format.raw/*80.6*/("""
    """),format.raw/*81.5*/("""</div>
""")))}))
      }
    }
  }

  def render(projectForm:play.data.Form[models.Project],project:models.Project,employees:java.util.List[models.users.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(projectForm,project,employees,user)

  def f:((play.data.Form[models.Project],models.Project,java.util.List[models.users.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (projectForm,project,employees,user) => apply(projectForm,project,employees,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 14:08:23 GMT 2018
                  SOURCE: /home/konrad/Documents/sdev4/project/app/views/addProject.scala.html
                  HASH: fa4c5cb81617778d2801f962f29e5b4784d70dc9
                  MATRIX: 651->1|1071->18|1312->163|1341->167|1381->199|1420->201|1451->207|1503->251|1542->253|1578->263|1590->267|1620->277|1656->287|1683->306|1722->308|1762->321|1823->364|1836->369|1875->370|1916->383|1948->388|1964->395|1993->403|2022->404|2079->430|2116->440|2223->520|2319->595|2360->608|2448->669|2552->751|2593->764|2681->825|2780->903|2821->916|2905->973|2933->992|2973->994|3018->1011|3129->1104|3142->1109|3181->1110|3226->1127|3356->1226|3397->1239|3874->1689|3902->1708|3942->1710|3987->1728|4029->1754|4069->1756|4118->1777|4268->1899|4286->1907|4314->1913|4416->1988|4431->1994|4496->2038|4526->2041|4544->2049|4579->2062|4708->2164|4723->2170|4788->2214|4818->2217|4836->2225|4870->2237|4961->2301|4978->2309|5022->2332|5102->2381|5135->2396|5148->2401|5187->2402|5232->2420|5274->2446|5314->2448|5363->2469|5469->2548|5521->2591|5561->2593|5618->2622|5714->2691|5732->2699|5760->2705|5815->2742|5828->2747|5867->2748|5924->2777|6020->2846|6038->2854|6066->2860|6129->2892|6182->2917|6282->2990|6297->2996|6362->3040|6392->3043|6410->3051|6445->3064|6574->3166|6589->3172|6654->3216|6684->3219|6702->3227|6736->3239|6827->3303|6844->3311|6888->3334|6968->3383|7013->3397|7054->3410|7116->3445|7226->3534|7262->3543|7304->3555|7336->3560
                  LINES: 24->1|29->2|34->2|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|42->10|42->10|42->10|43->11|43->11|43->11|43->11|43->11|44->12|46->14|48->16|48->16|49->17|51->19|51->19|52->20|54->22|54->22|55->23|57->25|57->25|57->25|58->26|59->27|59->27|59->27|60->28|61->29|62->30|75->43|75->43|75->43|76->44|76->44|76->44|77->45|78->46|78->46|78->46|80->48|80->48|80->48|80->48|80->48|80->48|83->51|83->51|83->51|83->51|83->51|83->51|85->53|85->53|85->53|87->55|88->56|88->56|88->56|89->57|89->57|89->57|90->58|92->60|92->60|92->60|93->61|93->61|93->61|93->61|94->62|94->62|94->62|95->63|95->63|95->63|95->63|96->64|97->65|99->67|99->67|99->67|99->67|99->67|99->67|102->70|102->70|102->70|102->70|102->70|102->70|104->72|104->72|104->72|106->74|107->75|108->76|110->78|110->78|111->79|112->80|113->81
                  -- GENERATED --
              */
          