
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
        """),_display_(/*8.10*/inputText(projectForm("id"), '_label -> "ID", 'readonly -> "readonly")),format.raw/*8.80*/("""
        """),_display_(/*9.10*/inputText(projectForm("name"), '_label -> "Name")),format.raw/*9.59*/("""
        """),_display_(/*10.10*/if(project == null)/*10.29*/ {_display_(Seq[Any](format.raw/*10.31*/("""
            """),_display_(/*11.14*/for(employee <- employees) yield /*11.40*/ {_display_(Seq[Any](format.raw/*11.42*/("""
                """),format.raw/*12.17*/("""<input type="checkbox" id="employee" name=""""),_display_(/*12.61*/employee/*12.69*/.getId),format.raw/*12.75*/("""">
                <label for="employee">"""),_display_(/*13.40*/employee/*13.48*/.getNames),format.raw/*13.57*/(""" """),format.raw/*13.58*/("""("""),_display_(/*13.60*/employee/*13.68*/.getDepartment.getTitle),format.raw/*13.91*/(""")</label>
            """)))}),format.raw/*14.14*/("""
        """)))}/*15.11*/else/*15.16*/{_display_(Seq[Any](format.raw/*15.17*/("""
            """),_display_(/*16.14*/for(employee <- employees) yield /*16.40*/ {_display_(Seq[Any](format.raw/*16.42*/("""
                """),_display_(/*17.18*/if(project.getEmployees.contains(employee))/*17.61*/ {_display_(Seq[Any](format.raw/*17.63*/("""
                    """),format.raw/*18.21*/("""<input type="checkbox" id="employee" name=""""),_display_(/*18.65*/employee/*18.73*/.getId),format.raw/*18.79*/("""" checked>
                """)))}/*19.19*/else/*19.24*/{_display_(Seq[Any](format.raw/*19.25*/("""
                    """),format.raw/*20.21*/("""<input type="checkbox" id="employee" name=""""),_display_(/*20.65*/employee/*20.73*/.getId),format.raw/*20.79*/("""">
                """)))}),format.raw/*21.18*/("""
                """),format.raw/*22.17*/("""<label for="employee">"""),_display_(/*22.40*/employee/*22.48*/.getNames),format.raw/*22.57*/(""" """),format.raw/*22.58*/("""("""),_display_(/*22.60*/employee/*22.68*/.getDepartment.getTitle),format.raw/*22.91*/(""")</label>
            """)))}),format.raw/*23.14*/("""
        """)))}),format.raw/*24.10*/("""
        """),_display_(/*25.10*/inputDate(projectForm("start"), '_label -> "Start Time")),format.raw/*25.66*/("""
        """),_display_(/*26.10*/inputDate(projectForm("end"), '_label -> "End Time")),format.raw/*26.62*/("""
        """),format.raw/*27.9*/("""<input type="submit" value="Add/Update Project">
    """)))}),format.raw/*28.6*/("""
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
                  DATE: Fri Mar 09 18:11:15 GMT 2018
                  SOURCE: /media/sf_E_DRIVE/sdev4/project/app/views/addProject.scala.html
                  HASH: eed1f17d85a9493b70bfcb0181f097e26db26229
                  MATRIX: 651->1|1071->18|1312->163|1341->167|1381->199|1420->201|1451->207|1503->251|1542->253|1578->263|1590->267|1620->277|1656->287|1746->357|1782->367|1851->416|1888->426|1916->445|1956->447|1997->461|2039->487|2079->489|2124->506|2195->550|2212->558|2239->564|2308->606|2325->614|2355->623|2384->624|2413->626|2430->634|2474->657|2528->680|2557->691|2570->696|2609->697|2650->711|2692->737|2732->739|2777->757|2829->800|2869->802|2918->823|2989->867|3006->875|3033->881|3080->910|3093->915|3132->916|3181->937|3252->981|3269->989|3296->995|3347->1015|3392->1032|3442->1055|3459->1063|3489->1072|3518->1073|3547->1075|3564->1083|3608->1106|3662->1129|3703->1139|3740->1149|3817->1205|3854->1215|3927->1267|3963->1276|4047->1330
                  LINES: 24->1|29->2|34->2|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|52->20|53->21|54->22|54->22|54->22|54->22|54->22|54->22|54->22|54->22|55->23|56->24|57->25|57->25|58->26|58->26|59->27|60->28
                  -- GENERATED --
              */
          