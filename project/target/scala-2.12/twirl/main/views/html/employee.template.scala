
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

object employee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.Employee,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employee: models.users.Employee, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.60*/("""

"""),_display_(/*3.2*/main(employee.getNames, user)/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""
    """),format.raw/*4.5*/("""<h1>"""),_display_(/*4.10*/employee/*4.18*/.getNames),format.raw/*4.27*/("""</h1>
    <table>
        <tr>
            <td>ID</td>
            <td>
                <a href=""""),_display_(/*9.27*/routes/*9.33*/.EmployeeController.employee(employee.getId)),format.raw/*9.77*/("""">"""),_display_(/*9.80*/employee/*9.88*/.getId),format.raw/*9.94*/("""</a>
            </td>
        </tr>
        <tr>
            <td>Name</td>
            <td>"""),_display_(/*14.18*/employee/*14.26*/.getLastName),format.raw/*14.38*/(""", """),_display_(/*14.41*/employee/*14.49*/.getFirstName),format.raw/*14.62*/("""</td>
        </tr>
        <tr>
            <td>Department</td>
            <td>"""),_display_(/*18.18*/employee/*18.26*/.getDepartment.getTitle),format.raw/*18.49*/("""</td>
        </tr>
        <tr>
            <td>Email</td>
            <td><a href="mailto:"""),_display_(/*22.34*/employee/*22.42*/.getEmail),format.raw/*22.51*/("""">"""),_display_(/*22.54*/employee/*22.62*/.getEmail),format.raw/*22.71*/("""</a></td>
        </tr>
        <tr>
            <td>Phone</td>
            <td><a href="tel:"""),_display_(/*26.31*/employee/*26.39*/.getPhone),format.raw/*26.48*/("""">"""),_display_(/*26.51*/employee/*26.59*/.getPhone),format.raw/*26.68*/("""</a></td>
        </tr>
        <tr>
            <td>Address</td>
            <td>"""),_display_(/*30.18*/employee/*30.26*/.getAddress.getLineOne),format.raw/*30.48*/(""",<br>
                """),_display_(/*31.18*/employee/*31.26*/.getAddress.getLineTwo),format.raw/*31.48*/(""",<br>
                """),_display_(/*32.18*/employee/*32.26*/.getAddress.getCity),format.raw/*32.45*/(""",<br>
                """),_display_(/*33.18*/employee/*33.26*/.getAddress.getCounty),format.raw/*33.47*/(""",<br>
                """),_display_(/*34.18*/employee/*34.26*/.getAddress.getCode),format.raw/*34.45*/(""",<br>
                """),_display_(/*35.18*/employee/*35.26*/.getAddress.getCountry),format.raw/*35.48*/("""
            """),format.raw/*36.13*/("""</td>
        </tr>
        <tr>
            <td>Projects</td>
            <td>
                <ul>
                """),_display_(/*42.18*/for(project <- employee.getProjects) yield /*42.54*/ {_display_(Seq[Any](format.raw/*42.56*/("""
                    """),format.raw/*43.21*/("""<li>
                        <a href=""""),_display_(/*44.35*/routes/*44.41*/.ProjectController.project(project.getId)),format.raw/*44.82*/("""">"""),_display_(/*44.85*/project/*44.92*/.getName),format.raw/*44.100*/("""</a>,
                    </li>
                """)))}),format.raw/*46.18*/("""
                """),format.raw/*47.17*/("""</ul>
            </td>
        </tr>
    </table>
""")))}))
      }
    }
  }

  def render(employee:models.users.Employee,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employee,user)

  def f:((models.users.Employee,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employee,user) => apply(employee,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 09 13:29:47 GMT 2018
                  SOURCE: /media/sf_E_DRIVE/sdev4/project/app/views/employee.scala.html
                  HASH: d575894c8ac8726cad79580fc1d59b4778011b51
                  MATRIX: 984->1|1137->59|1165->62|1202->91|1241->93|1272->98|1303->103|1319->111|1348->120|1472->218|1486->224|1550->268|1579->271|1595->279|1621->285|1741->378|1758->386|1791->398|1821->401|1838->409|1872->422|1981->504|1998->512|2042->535|2162->628|2179->636|2209->645|2239->648|2256->656|2286->665|2407->759|2424->767|2454->776|2484->779|2501->787|2531->796|2641->879|2658->887|2701->909|2751->932|2768->940|2811->962|2861->985|2878->993|2918->1012|2968->1035|2985->1043|3027->1064|3077->1087|3094->1095|3134->1114|3184->1137|3201->1145|3244->1167|3285->1180|3430->1298|3482->1334|3522->1336|3571->1357|3637->1396|3652->1402|3714->1443|3744->1446|3760->1453|3790->1461|3870->1510|3915->1527
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|36->4|41->9|41->9|41->9|41->9|41->9|41->9|46->14|46->14|46->14|46->14|46->14|46->14|50->18|50->18|50->18|54->22|54->22|54->22|54->22|54->22|54->22|58->26|58->26|58->26|58->26|58->26|58->26|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|68->36|74->42|74->42|74->42|75->43|76->44|76->44|76->44|76->44|76->44|76->44|78->46|79->47
                  -- GENERATED --
              */
          