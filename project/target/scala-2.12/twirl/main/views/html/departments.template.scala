
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

object departments extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[java.util.List[models.Department],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(departments: java.util.List[models.Department], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.75*/("""

"""),_display_(/*3.2*/main("Department View", user)/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""
    """),format.raw/*4.5*/("""<table>
        <tr>
            <th>#</th>
            <th>Title</th>
        </tr>
        """),_display_(/*9.10*/if(user.isInstanceOf[models.users.Employee])/*9.54*/ {_display_(Seq[Any](format.raw/*9.56*/("""
           """),_display_(/*10.13*/defining(user.asInstanceOf[models.users.Employee])/*10.63*/ { emp =>_display_(Seq[Any](format.raw/*10.72*/("""
                """),format.raw/*11.17*/("""<tr>
                    <td><a href=""""),_display_(/*12.35*/routes/*12.41*/.DepartmentController.department(emp.getDepartment.getId)),format.raw/*12.98*/("""">"""),_display_(/*12.101*/emp/*12.104*/.getDepartment.getId),format.raw/*12.124*/("""</a></td>
                    <td>"""),_display_(/*13.26*/emp/*13.29*/.getDepartment.getTitle),format.raw/*13.52*/("""</td>
                </tr>
           """)))}),format.raw/*15.13*/("""
        """)))}/*16.11*/else/*16.16*/{_display_(Seq[Any](format.raw/*16.17*/("""
            """),_display_(/*17.14*/if(user.isInstanceOf[models.users.Admin])/*17.55*/ {_display_(Seq[Any](format.raw/*17.57*/("""
                """),_display_(/*18.18*/for(department <- departments) yield /*18.48*/ {_display_(Seq[Any](format.raw/*18.50*/("""
                    """),format.raw/*19.21*/("""<tr>
                        <td>
                            <a href=""""),_display_(/*21.39*/routes/*21.45*/.DepartmentController.department(department.getId)),format.raw/*21.95*/("""">"""),_display_(/*21.98*/department/*21.108*/.getId),format.raw/*21.114*/("""</a>
                        </td>
                        <td>"""),_display_(/*23.30*/department/*23.40*/.getTitle),format.raw/*23.49*/("""</td>
                    </tr>
                """)))}),format.raw/*25.18*/("""
            """)))}),format.raw/*26.14*/("""
        """)))}),format.raw/*27.10*/("""
    """),format.raw/*28.5*/("""</table>
""")))}))
      }
    }
  }

  def render(departments:java.util.List[models.Department],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(departments,user)

  def f:((java.util.List[models.Department],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (departments,user) => apply(departments,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 09 13:29:47 GMT 2018
                  SOURCE: /media/sf_E_DRIVE/sdev4/project/app/views/departments.scala.html
                  HASH: 2d234759c54e8cf2b3a1f0d070df85642a934586
                  MATRIX: 999->1|1167->74|1195->77|1232->106|1271->108|1302->113|1422->207|1474->251|1513->253|1553->266|1612->316|1659->325|1704->342|1770->381|1785->387|1863->444|1894->447|1907->450|1949->470|2011->505|2023->508|2067->531|2138->571|2167->582|2180->587|2219->588|2260->602|2310->643|2350->645|2395->663|2441->693|2481->695|2530->716|2629->788|2644->794|2715->844|2745->847|2765->857|2793->863|2884->927|2903->937|2933->946|3013->995|3058->1009|3099->1019|3131->1024
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|41->9|41->9|41->9|42->10|42->10|42->10|43->11|44->12|44->12|44->12|44->12|44->12|44->12|45->13|45->13|45->13|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|51->19|53->21|53->21|53->21|53->21|53->21|53->21|55->23|55->23|55->23|57->25|58->26|59->27|60->28
                  -- GENERATED --
              */
          