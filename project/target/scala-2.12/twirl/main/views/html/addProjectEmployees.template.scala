
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

object addProjectEmployees extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[play.data.Form[models.Project],models.Project,java.util.List[models.users.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(projectForm: play.data.Form[models.Project], project: models.Project, employees: java.util.List[models.users.Employee], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.147*/("""

"""),_display_(/*4.2*/main("Add/Remove employees", user)/*4.36*/ {_display_(Seq[Any](format.raw/*4.38*/("""
    """),format.raw/*5.5*/("""<div class="row">
    """),_display_(/*6.6*/form(action = routes.ProjectController.form)/*6.50*/ {_display_(Seq[Any](format.raw/*6.52*/("""
        """),_display_(/*7.10*/CSRF/*7.14*/.formField),format.raw/*7.24*/("""
        """),_display_(/*8.10*/if(project == null)/*8.29*/ {_display_(Seq[Any](format.raw/*8.31*/("""
            """),_display_(/*9.14*/for(employee <- employees) yield /*9.40*/ {_display_(Seq[Any](format.raw/*9.42*/("""
                """),format.raw/*10.17*/("""<div class="form-check">
                    <label class="form-check-label">
                        <input type="checkbox" class="form-check-input" value="" name=""""),_display_(/*12.89*/employee/*12.97*/.getId),format.raw/*12.103*/("""">"""),_display_(/*12.106*/employee/*12.114*/.getNames),format.raw/*12.123*/("""
                    """),format.raw/*13.21*/("""</label>
                </div>
            """)))}),format.raw/*15.14*/("""
        """)))}/*16.11*/else/*16.16*/{_display_(Seq[Any](format.raw/*16.17*/("""
            """),_display_(/*17.14*/for(employee <- employees) yield /*17.40*/ {_display_(Seq[Any](format.raw/*17.42*/("""
                """),_display_(/*18.18*/if(project.getEmployees.contains(employee))/*18.61*/ {_display_(Seq[Any](format.raw/*18.63*/("""
                    """),format.raw/*19.21*/("""<div class="form-check">
                        <label class="form-check-label">
                            <input type="checkbox" class="form-check-input" value="" name=""""),_display_(/*21.93*/employee/*21.101*/.getId),format.raw/*21.107*/("""" checked>"""),_display_(/*21.118*/employee/*21.126*/.getNames),format.raw/*21.135*/("""
                        """),format.raw/*22.25*/("""</label>
                    </div>
                """)))}/*24.19*/else/*24.24*/{_display_(Seq[Any](format.raw/*24.25*/("""
                    """),format.raw/*25.21*/("""<div class="form-check">
                        <label class="form-check-label">
                            <input type="checkbox" class="form-check-input" value="" name=""""),_display_(/*27.93*/employee/*27.101*/.getId),format.raw/*27.107*/("""">"""),_display_(/*27.110*/employee/*27.118*/.getNames),format.raw/*27.127*/("""
                        """),format.raw/*28.25*/("""</label>
                    </div>
                """)))}),format.raw/*30.18*/("""
            """)))}),format.raw/*31.14*/("""
        """)))}),format.raw/*32.10*/("""
        """),format.raw/*33.9*/("""<input type="submit" class="btn btn-primary" value="Amend Project">

            """),_display_(/*35.14*/inputDate(projectForm("start"), '_label -> "", 'hidden -> "hidden")),format.raw/*35.81*/("""
            """),_display_(/*36.14*/inputDate(projectForm("end"), '_label -> "", 'hidden -> "hidden")),format.raw/*36.79*/("""
            """),_display_(/*37.14*/inputText(projectForm("name"), '_label -> "", 'class -> "from-control", 'hidden -> "hidden")),format.raw/*37.106*/("""
            """),_display_(/*38.14*/inputText(projectForm("id"), '_label -> "", 'readonly -> "readonly", 'hidden -> "hidden")),format.raw/*38.103*/("""
    """),format.raw/*39.5*/("""</div>
""")))}),format.raw/*40.2*/("""
""")))}),format.raw/*41.2*/("""
"""))
      }
    }
  }

  def render(projectForm:play.data.Form[models.Project],project:models.Project,employees:java.util.List[models.users.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(projectForm,project,employees,user)

  def f:((play.data.Form[models.Project],models.Project,java.util.List[models.users.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (projectForm,project,employees,user) => apply(projectForm,project,employees,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 10:24:46 GMT 2018
                  SOURCE: /home/konrad/Documents/sdev4/project/app/views/addProjectEmployees.scala.html
                  HASH: 69b499ed61ca1bb20cb757c00c173db7fb3d3826
                  MATRIX: 651->1|1080->18|1321->163|1349->166|1391->200|1430->202|1461->207|1509->230|1561->274|1600->276|1636->286|1648->290|1678->300|1714->310|1741->329|1780->331|1820->345|1861->371|1900->373|1945->390|2138->556|2155->564|2183->570|2214->573|2232->581|2263->590|2312->611|2388->656|2417->667|2430->672|2469->673|2510->687|2552->713|2592->715|2637->733|2689->776|2729->778|2778->799|2979->973|2997->981|3025->987|3064->998|3082->1006|3113->1015|3166->1040|3238->1094|3251->1099|3290->1100|3339->1121|3540->1295|3558->1303|3586->1309|3617->1312|3635->1320|3666->1329|3719->1354|3803->1407|3848->1421|3889->1431|3925->1440|4034->1522|4122->1589|4163->1603|4249->1668|4290->1682|4404->1774|4445->1788|4556->1877|4588->1882|4626->1890|4658->1892
                  LINES: 24->1|29->2|34->2|36->4|36->4|36->4|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|44->12|44->12|44->12|44->12|44->12|44->12|45->13|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|51->19|53->21|53->21|53->21|53->21|53->21|53->21|54->22|56->24|56->24|56->24|57->25|59->27|59->27|59->27|59->27|59->27|59->27|60->28|62->30|63->31|64->32|65->33|67->35|67->35|68->36|68->36|69->37|69->37|70->38|70->38|71->39|72->40|73->41
                  -- GENERATED --
              */
          