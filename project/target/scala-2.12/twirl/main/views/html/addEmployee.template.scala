
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

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[play.data.Form[models.users.Employee],play.data.Form[models.Address],models.users.Employee,java.util.List[models.Department],java.util.List[models.Project],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(employeeForm: play.data.Form[models.users.Employee], addressForm: play.data.Form[models.Address], employee: models.users.Employee, departments: java.util.List[models.Department], projects: java.util.List[models.Project], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.248*/("""

"""),_display_(/*4.2*/main("Add/Update Employee", user)/*4.35*/ {_display_(Seq[Any](format.raw/*4.37*/("""
    """),_display_(/*5.6*/form(action = routes.EmployeeController.form())/*5.53*/ {_display_(Seq[Any](format.raw/*5.55*/("""
        """),_display_(/*6.10*/CSRF/*6.14*/.formField),format.raw/*6.24*/("""
        """),_display_(/*7.10*/inputText(employeeForm("id"), 'label -> "Employee ID", 'readonly -> "readonly")),format.raw/*7.89*/("""
        """),_display_(/*8.10*/inputText(employeeForm("firstName"), 'label -> "First Name")),format.raw/*8.70*/("""
        """),_display_(/*9.10*/inputText(employeeForm("lastName"), 'label -> "Last Name")),format.raw/*9.68*/("""
        """),_display_(/*10.10*/inputPassword(employeeForm("password"), 'label -> "Password")),format.raw/*10.71*/("""
        """),_display_(/*11.10*/inputText(employeeForm("email"), 'label -> "Email")),format.raw/*11.61*/("""
        """),_display_(/*12.10*/inputText(employeeForm("phone"), 'label -> "Mobile Phone")),format.raw/*12.68*/("""
            """),_display_(/*13.14*/inputText(addressForm("lineOne"), 'label -> "First Line")),format.raw/*13.71*/("""
            """),_display_(/*14.14*/inputText(addressForm("lineTwo"), 'label -> "Second Line")),format.raw/*14.72*/("""
            """),_display_(/*15.14*/inputText(addressForm("city"), 'label -> "City")),format.raw/*15.62*/("""
            """),_display_(/*16.14*/inputText(addressForm("county"), 'label -> "County")),format.raw/*16.66*/("""
            """),_display_(/*17.14*/inputText(addressForm("code"), 'label -> "Eirecode")),format.raw/*17.66*/("""
            """),_display_(/*18.14*/inputText(addressForm("country"), 'label -> "Country")),format.raw/*18.68*/("""
        """),format.raw/*19.9*/("""<select name="department">
        """),_display_(/*20.10*/for(department <- departments) yield /*20.40*/ {_display_(Seq[Any](format.raw/*20.42*/("""
            """),format.raw/*21.13*/("""<option value=""""),_display_(/*21.29*/department/*21.39*/.getId),format.raw/*21.45*/("""">"""),_display_(/*21.48*/department/*21.58*/.getTitle),format.raw/*21.67*/("""</option>
        """)))}),format.raw/*22.10*/("""
        """),format.raw/*23.9*/("""</select>
        """),_display_(/*24.10*/if(employee == null)/*24.30*/ {_display_(Seq[Any](format.raw/*24.32*/("""
            """),_display_(/*25.14*/for(project <- projects) yield /*25.38*/ {_display_(Seq[Any](format.raw/*25.40*/("""
                """),format.raw/*26.17*/("""<input type="checkbox" id="employee" name=""""),_display_(/*26.61*/project/*26.68*/.getId),format.raw/*26.74*/("""">
                <label for="employee">"""),_display_(/*27.40*/project/*27.47*/.getName),format.raw/*27.55*/("""</label>
            """)))}),format.raw/*28.14*/("""
        """)))}/*29.11*/else/*29.16*/{_display_(Seq[Any](format.raw/*29.17*/("""
            """),_display_(/*30.14*/for(project <- projects) yield /*30.38*/ {_display_(Seq[Any](format.raw/*30.40*/("""
                """),_display_(/*31.18*/if(employee.getProjects.contains(project))/*31.60*/ {_display_(Seq[Any](format.raw/*31.62*/("""
                    """),format.raw/*32.21*/("""<input type="checkbox" id="employee" name=""""),_display_(/*32.65*/project/*32.72*/.getId),format.raw/*32.78*/("""" checked>
                """)))}/*33.19*/else/*33.24*/{_display_(Seq[Any](format.raw/*33.25*/("""
                    """),format.raw/*34.21*/("""<input type="checkbox" id="employee" name=""""),_display_(/*34.65*/project/*34.72*/.getId),format.raw/*34.78*/("""">
                """)))}),format.raw/*35.18*/("""
                """),format.raw/*36.17*/("""<label for="employee">"""),_display_(/*36.40*/project/*36.47*/.getId),format.raw/*36.53*/("""</label>
            """)))}),format.raw/*37.14*/("""
        """)))}),format.raw/*38.10*/("""
    """)))}),format.raw/*39.6*/("""
""")))}))
      }
    }
  }

  def render(employeeForm:play.data.Form[models.users.Employee],addressForm:play.data.Form[models.Address],employee:models.users.Employee,departments:java.util.List[models.Department],projects:java.util.List[models.Project],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm,addressForm,employee,departments,projects,user)

  def f:((play.data.Form[models.users.Employee],play.data.Form[models.Address],models.users.Employee,java.util.List[models.Department],java.util.List[models.Project],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm,addressForm,employee,departments,projects,user) => apply(employeeForm,addressForm,employee,departments,projects,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 09 18:11:15 GMT 2018
                  SOURCE: /media/sf_E_DRIVE/sdev4/project/app/views/addEmployee.scala.html
                  HASH: 463b9f7d74f006fdc7c6892eac6d794d7f6d8682
                  MATRIX: 651->1|1144->18|1486->264|1514->267|1555->300|1594->302|1625->308|1680->355|1719->357|1755->367|1767->371|1797->381|1833->391|1932->470|1968->480|2048->540|2084->550|2162->608|2199->618|2281->679|2318->689|2390->740|2427->750|2506->808|2547->822|2625->879|2666->893|2745->951|2786->965|2855->1013|2896->1027|2969->1079|3010->1093|3083->1145|3124->1159|3199->1213|3235->1222|3298->1258|3344->1288|3384->1290|3425->1303|3468->1319|3487->1329|3514->1335|3544->1338|3563->1348|3593->1357|3643->1376|3679->1385|3725->1404|3754->1424|3794->1426|3835->1440|3875->1464|3915->1466|3960->1483|4031->1527|4047->1534|4074->1540|4143->1582|4159->1589|4188->1597|4241->1619|4270->1630|4283->1635|4322->1636|4363->1650|4403->1674|4443->1676|4488->1694|4539->1736|4579->1738|4628->1759|4699->1803|4715->1810|4742->1816|4789->1845|4802->1850|4841->1851|4890->1872|4961->1916|4977->1923|5004->1929|5055->1949|5100->1966|5150->1989|5166->1996|5193->2002|5246->2024|5287->2034|5323->2040
                  LINES: 24->1|29->2|34->2|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|40->8|40->8|41->9|41->9|42->10|42->10|43->11|43->11|44->12|44->12|45->13|45->13|46->14|46->14|47->15|47->15|48->16|48->16|49->17|49->17|50->18|50->18|51->19|52->20|52->20|52->20|53->21|53->21|53->21|53->21|53->21|53->21|53->21|54->22|55->23|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|58->26|58->26|59->27|59->27|59->27|60->28|61->29|61->29|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|66->34|66->34|67->35|68->36|68->36|68->36|68->36|69->37|70->38|71->39
                  -- GENERATED --
              */
          