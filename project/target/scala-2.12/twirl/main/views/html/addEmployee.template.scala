
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

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[play.data.Form[models.users.Employee],models.Address,models.users.Employee,java.util.List[models.Department],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(employeeForm: play.data.Form[models.users.Employee], address: models.Address, employee: models.users.Employee, departments: java.util.List[models.Department], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.186*/("""

"""),_display_(/*4.2*/main("Add/Update Employee", user)/*4.35*/ {_display_(Seq[Any](format.raw/*4.37*/("""
    """),_display_(/*5.6*/form(action = routes.EmployeeController.form(), 'enctype -> "multipart/form-data")/*5.88*/ {_display_(Seq[Any](format.raw/*5.90*/("""
        """),_display_(/*6.10*/CSRF/*6.14*/.formField),format.raw/*6.24*/("""
        """),_display_(/*7.10*/if(employee == null)/*7.30*/ {_display_(Seq[Any](format.raw/*7.32*/("""
            """),format.raw/*8.13*/("""<h3>New employee details</h3>
        """)))}/*9.11*/else/*9.16*/{_display_(Seq[Any](format.raw/*9.17*/("""
            """),_display_(/*10.14*/if(employee.getEmail.equals(user.getEmail))/*10.57*/ {_display_(Seq[Any](format.raw/*10.59*/("""
                """),format.raw/*11.17*/("""<h3>Updating your details</h3>
            """)))}/*12.15*/else/*12.20*/{_display_(Seq[Any](format.raw/*12.21*/("""
                """),format.raw/*13.17*/("""<h3>Updating """),_display_(/*13.31*/employee/*13.39*/.getFirstName),format.raw/*13.52*/(""" """),_display_(/*13.54*/employee/*13.62*/.getLastName),format.raw/*13.74*/("""'s details</h3>
            """)))}),format.raw/*14.14*/("""
        """)))}),format.raw/*15.10*/("""
        """),format.raw/*16.9*/("""<div class="form-group">
            <label for="image">Picture</label>
            <input id="image" class="form-control" type="file" name="upload">
        </div>
        <div class="row">
            <div class="col-sm-12 col-md-6 col-lg-6">
                <div class="form-group">
                """),_display_(/*23.18*/inputText(employeeForm("firstName"), '_label -> "First Name", 'class -> "form-control", 'required -> "required")),format.raw/*23.130*/("""
                """),format.raw/*24.17*/("""</div>
            </div>
            <div class="col-sm-12 col-md-6 col-lg-6">
                <div class="form-group">
                """),_display_(/*28.18*/inputText(employeeForm("lastName"), '_label -> "Last Name", 'class -> "form-control", 'required -> "required")),format.raw/*28.128*/("""
                """),format.raw/*29.17*/("""</div>
            </div>
        </div>
        <div class="form-group">
        """),_display_(/*33.10*/inputPassword(employeeForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*33.98*/("""
        """),format.raw/*34.9*/("""</div>
        <div class="row">
            <div class="col-sm-12 col-md-6 col-lg-6">
                <div class="form-group">
                """),_display_(/*38.18*/inputText(employeeForm("email"), '_label -> "Email", 'class -> "form-control", 'required -> "required")),format.raw/*38.121*/("""
                """),format.raw/*39.17*/("""</div>
            </div>
            <div class="col-sm-12 col-md-6 col-lg-6">
                <div class="form-group">
                """),_display_(/*43.18*/inputText(employeeForm("phone"), '_label -> "Mobile Phone", 'class -> "form-control", 'required -> "required")),format.raw/*43.128*/("""
                """),format.raw/*44.17*/("""</div>
            </div>
        </div>
        <div class="form-group">
            <label for="department"></label>
            <select class="form-control" id="department" name="d">
            """),_display_(/*50.14*/if(employee == null)/*50.34*/ {_display_(Seq[Any](format.raw/*50.36*/("""
                """),format.raw/*51.17*/("""<option selected disabled>Select Department</option>
                """),_display_(/*52.18*/for(department <- departments) yield /*52.48*/ {_display_(Seq[Any](format.raw/*52.50*/("""
                    """),format.raw/*53.21*/("""<option value=""""),_display_(/*53.37*/department/*53.47*/.getId),format.raw/*53.53*/("""">"""),_display_(/*53.56*/department/*53.66*/.getTitle),format.raw/*53.75*/("""</option>
                """)))}),format.raw/*54.18*/("""
            """)))}/*55.15*/else/*55.20*/{_display_(Seq[Any](format.raw/*55.21*/("""
                """),_display_(/*56.18*/for(department <- departments) yield /*56.48*/ {_display_(Seq[Any](format.raw/*56.50*/("""
                    """),_display_(/*57.22*/if(department.getEmployees.contains(employee))/*57.68*/ {_display_(Seq[Any](format.raw/*57.70*/("""
                        """),format.raw/*58.25*/("""<option value=""""),_display_(/*58.41*/department/*58.51*/.getId),format.raw/*58.57*/("""" selected>"""),_display_(/*58.69*/department/*58.79*/.getTitle),format.raw/*58.88*/("""</option>
                    """)))}/*59.23*/else/*59.28*/{_display_(Seq[Any](format.raw/*59.29*/("""
                        """),format.raw/*60.25*/("""<option value=""""),_display_(/*60.41*/department/*60.51*/.getId),format.raw/*60.57*/("""">"""),_display_(/*60.60*/department/*60.70*/.getTitle),format.raw/*60.79*/("""</option>
                    """)))}),format.raw/*61.22*/("""
                """)))}),format.raw/*62.18*/("""
            """)))}),format.raw/*63.14*/("""
            """),format.raw/*64.13*/("""</select>
        </div>
        """),_display_(/*66.10*/if(employee == null)/*66.30*/ {_display_(Seq[Any](format.raw/*66.32*/("""
            """),format.raw/*67.13*/("""<input type="submit" class="btn btn-success" value="Add Employee">
        """)))}/*68.11*/else/*68.16*/{_display_(Seq[Any](format.raw/*68.17*/("""
            """),format.raw/*69.13*/("""<input type="submit" class="btn btn-primary" value="Update Employee">
        """)))}),format.raw/*70.10*/("""
        """),_display_(/*71.10*/if(address != null)/*71.29*/ {_display_(Seq[Any](format.raw/*71.31*/("""
            """),format.raw/*72.13*/("""<input type="text" id="address" name="a" value=""""),_display_(/*72.62*/address/*72.69*/.getId),format.raw/*72.75*/("""" readonly="readonly" hidden>
        """)))}),format.raw/*73.10*/("""
        """),_display_(/*74.10*/inputText(employeeForm("id"), '_label -> "", 'readonly -> "readonly", 'hidden -> "hidden")),format.raw/*74.100*/("""
    """)))}),format.raw/*75.6*/("""
""")))}))
      }
    }
  }

  def render(employeeForm:play.data.Form[models.users.Employee],address:models.Address,employee:models.users.Employee,departments:java.util.List[models.Department],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm,address,employee,departments,user)

  def f:((play.data.Form[models.users.Employee],models.Address,models.users.Employee,java.util.List[models.Department],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm,address,employee,departments,user) => apply(employeeForm,address,employee,departments,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 14:06:06 GMT 2018
                  SOURCE: /home/konrad/Documents/sdev4/project/app/views/addEmployee.scala.html
                  HASH: 98021f5f7546748d2b7fb87b1eb60814e5ac4f58
                  MATRIX: 651->1|1097->18|1377->202|1405->205|1446->238|1485->240|1516->246|1606->328|1645->330|1681->340|1693->344|1723->354|1759->364|1787->384|1826->386|1866->399|1923->439|1935->444|1973->445|2014->459|2066->502|2106->504|2151->521|2214->566|2227->571|2266->572|2311->589|2352->603|2369->611|2403->624|2432->626|2449->634|2482->646|2542->675|2583->685|2619->694|2949->997|3083->1109|3128->1126|3293->1264|3425->1374|3470->1391|3580->1474|3689->1562|3725->1571|3897->1716|4022->1819|4067->1836|4232->1974|4364->2084|4409->2101|4635->2300|4664->2320|4704->2322|4749->2339|4846->2409|4892->2439|4932->2441|4981->2462|5024->2478|5043->2488|5070->2494|5100->2497|5119->2507|5149->2516|5207->2543|5240->2558|5253->2563|5292->2564|5337->2582|5383->2612|5423->2614|5472->2636|5527->2682|5567->2684|5620->2709|5663->2725|5682->2735|5709->2741|5748->2753|5767->2763|5797->2772|5847->2804|5860->2809|5899->2810|5952->2835|5995->2851|6014->2861|6041->2867|6071->2870|6090->2880|6120->2889|6182->2920|6231->2938|6276->2952|6317->2965|6378->2999|6407->3019|6447->3021|6488->3034|6583->3111|6596->3116|6635->3117|6676->3130|6786->3209|6823->3219|6851->3238|6891->3240|6932->3253|7008->3302|7024->3309|7051->3315|7121->3354|7158->3364|7270->3454|7306->3460
                  LINES: 24->1|29->2|34->2|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|47->15|48->16|55->23|55->23|56->24|60->28|60->28|61->29|65->33|65->33|66->34|70->38|70->38|71->39|75->43|75->43|76->44|82->50|82->50|82->50|83->51|84->52|84->52|84->52|85->53|85->53|85->53|85->53|85->53|85->53|85->53|86->54|87->55|87->55|87->55|88->56|88->56|88->56|89->57|89->57|89->57|90->58|90->58|90->58|90->58|90->58|90->58|90->58|91->59|91->59|91->59|92->60|92->60|92->60|92->60|92->60|92->60|92->60|93->61|94->62|95->63|96->64|98->66|98->66|98->66|99->67|100->68|100->68|100->68|101->69|102->70|103->71|103->71|103->71|104->72|104->72|104->72|104->72|105->73|106->74|106->74|107->75
                  -- GENERATED --
              */
          