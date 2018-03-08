
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
/*1.2*/import models.users.Employee

object employee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Employee,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(employee: Employee, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.47*/("""

"""),_display_(/*4.2*/main(employee.getNames, user)/*4.31*/ {_display_(Seq[Any](format.raw/*4.33*/("""
    """),format.raw/*5.5*/("""<h1>"""),_display_(/*5.10*/employee/*5.18*/.getNames),format.raw/*5.27*/("""</h1>
    <table>
        <tr>
            <td>ID</td>
            <td>
                <a href=""""),_display_(/*10.27*/routes/*10.33*/.EmployeeController.employee(employee.getId)),format.raw/*10.77*/("""">"""),_display_(/*10.80*/employee/*10.88*/.getId),format.raw/*10.94*/("""</a>
            </td>
        </tr>
        <tr>
            <td>Name</td>
            <td>"""),_display_(/*15.18*/employee/*15.26*/.getLastName),format.raw/*15.38*/(""", """),_display_(/*15.41*/employee/*15.49*/.getFirstName),format.raw/*15.62*/("""</td>
        </tr>
        <tr>
            <td>Department</td>
            <td>"""),_display_(/*19.18*/employee/*19.26*/.getDepartment.getTitle),format.raw/*19.49*/("""</td>
        </tr>
        <tr>
            <td>Email</td>
            <td><a href="mailto:"""),_display_(/*23.34*/employee/*23.42*/.getEmail),format.raw/*23.51*/("""">"""),_display_(/*23.54*/employee/*23.62*/.getEmail),format.raw/*23.71*/("""</a></td>
        </tr>
        <tr>
            <td>Phone</td>
            <td><a href="tel:"""),_display_(/*27.31*/employee/*27.39*/.getPhone),format.raw/*27.48*/("""">"""),_display_(/*27.51*/employee/*27.59*/.getPhone),format.raw/*27.68*/("""</a></td>
        </tr>
        <tr>
            <td>Address</td>
            <td>"""),_display_(/*31.18*/employee/*31.26*/.getAddress.getLineOne),format.raw/*31.48*/(""",<br>
                """),_display_(/*32.18*/employee/*32.26*/.getAddress.getLineTwo),format.raw/*32.48*/(""",<br>
                """),_display_(/*33.18*/employee/*33.26*/.getAddress.getCity),format.raw/*33.45*/(""",<br>
                """),_display_(/*34.18*/employee/*34.26*/.getAddress.getCounty),format.raw/*34.47*/(""",<br>
                """),_display_(/*35.18*/employee/*35.26*/.getAddress.getCode),format.raw/*35.45*/(""",<br>
                """),_display_(/*36.18*/employee/*36.26*/.getAddress.getCountry),format.raw/*36.48*/("""
            """),format.raw/*37.13*/("""</td>
        </tr>
        <tr>
            <td>Projects</td>
            <td>
                <ul>
                """),_display_(/*43.18*/for(project <- employee.getProjects) yield /*43.54*/ {_display_(Seq[Any](format.raw/*43.56*/("""
                    """),format.raw/*44.21*/("""<li>
                        <a href=""""),_display_(/*45.35*/routes/*45.41*/.ProjectController.project(project.getId)),format.raw/*45.82*/("""">"""),_display_(/*45.85*/project/*45.92*/.getName),format.raw/*45.100*/("""</a>,
                    </li>
                """)))}),format.raw/*47.18*/("""
                """),format.raw/*48.17*/("""</ul>
            </td>
        </tr>
    </table>
""")))}))
      }
    }
  }

  def render(employee:Employee,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employee,user)

  def f:((Employee,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employee,user) => apply(employee,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 08 17:39:52 GMT 2018
                  SOURCE: /media/sf_E_DRIVE/sdev4/project/app/views/employee.scala.html
                  HASH: 898cf518d4625680fc7f0a5f5a4682ac99f220ab
                  MATRIX: 651->1|1007->31|1147->76|1175->79|1212->108|1251->110|1282->115|1313->120|1329->128|1358->137|1483->235|1498->241|1563->285|1593->288|1610->296|1637->302|1757->395|1774->403|1807->415|1837->418|1854->426|1888->439|1997->521|2014->529|2058->552|2178->645|2195->653|2225->662|2255->665|2272->673|2302->682|2423->776|2440->784|2470->793|2500->796|2517->804|2547->813|2657->896|2674->904|2717->926|2767->949|2784->957|2827->979|2877->1002|2894->1010|2934->1029|2984->1052|3001->1060|3043->1081|3093->1104|3110->1112|3150->1131|3200->1154|3217->1162|3260->1184|3301->1197|3446->1315|3498->1351|3538->1353|3587->1374|3653->1413|3668->1419|3730->1460|3760->1463|3776->1470|3806->1478|3886->1527|3931->1544
                  LINES: 24->1|29->2|34->2|36->4|36->4|36->4|37->5|37->5|37->5|37->5|42->10|42->10|42->10|42->10|42->10|42->10|47->15|47->15|47->15|47->15|47->15|47->15|51->19|51->19|51->19|55->23|55->23|55->23|55->23|55->23|55->23|59->27|59->27|59->27|59->27|59->27|59->27|63->31|63->31|63->31|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|69->37|75->43|75->43|75->43|76->44|77->45|77->45|77->45|77->45|77->45|77->45|79->47|80->48
                  -- GENERATED --
              */
          