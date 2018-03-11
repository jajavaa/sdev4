
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

object addDepartment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[play.data.Form[models.Department],models.Department,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(departmentForm: play.data.Form[models.Department], department: models.Department,  user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.110*/("""

"""),_display_(/*4.2*/main("Add/Update Department", user)/*4.37*/ {_display_(Seq[Any](format.raw/*4.39*/("""
    """),_display_(/*5.6*/form(action = routes.DepartmentController.form)/*5.53*/ {_display_(Seq[Any](format.raw/*5.55*/("""
        """),_display_(/*6.10*/CSRF/*6.14*/.formField),format.raw/*6.24*/("""
        """),_display_(/*7.10*/if(department == null)/*7.32*/ {_display_(Seq[Any](format.raw/*7.34*/("""
            """),format.raw/*8.13*/("""<h3>Creating new department</h3>
        """)))}/*9.11*/else/*9.16*/{_display_(Seq[Any](format.raw/*9.17*/("""
            """),format.raw/*10.13*/("""<h3>Updating """),_display_(/*10.27*/department/*10.37*/.getTitle),format.raw/*10.46*/(""" """),format.raw/*10.47*/("""Department</h3>
        """)))}),format.raw/*11.10*/("""
        """),format.raw/*12.9*/("""<div class="form-group">
            """),_display_(/*13.14*/inputText(departmentForm("title"), '_label -> "Title", 'class -> "form-control")),format.raw/*13.94*/("""
        """),format.raw/*14.9*/("""</div>

        <div class="form-group">
            """),_display_(/*17.14*/if(department == null)/*17.36*/ {_display_(Seq[Any](format.raw/*17.38*/("""
                """),format.raw/*18.17*/("""<input type="submit" value="Create Department" class="form-control btn btn-success">
            """)))}/*19.15*/else/*19.20*/{_display_(Seq[Any](format.raw/*19.21*/("""
                """),format.raw/*20.17*/("""<input type="submit" value="Update Department" class="form-control btn btn-primary">
            """)))}),format.raw/*21.14*/("""
        """),format.raw/*22.9*/("""</div>

        """),_display_(/*24.10*/inputText(departmentForm("id"), '_label -> "", 'readonly -> "readonly", 'hidden -> "hidden")),format.raw/*24.102*/("""
    """)))}),format.raw/*25.6*/("""
""")))}))
      }
    }
  }

  def render(departmentForm:play.data.Form[models.Department],department:models.Department,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(departmentForm,department,user)

  def f:((play.data.Form[models.Department],models.Department,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (departmentForm,department,user) => apply(departmentForm,department,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 14:10:42 GMT 2018
                  SOURCE: /home/konrad/Documents/sdev4/project/app/views/addDepartment.scala.html
                  HASH: 01e8bae013839d52420aaf26cc59b22ea6f100dd
                  MATRIX: 651->1|1042->18|1246->126|1274->129|1317->164|1356->166|1387->172|1442->219|1481->221|1517->231|1529->235|1559->245|1595->255|1625->277|1664->279|1704->292|1764->335|1776->340|1814->341|1855->354|1896->368|1915->378|1945->387|1974->388|2030->413|2066->422|2131->460|2232->540|2268->549|2349->603|2380->625|2420->627|2465->644|2582->743|2595->748|2634->749|2679->766|2808->864|2844->873|2888->890|3002->982|3038->988
                  LINES: 24->1|29->2|34->2|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|42->10|42->10|42->10|42->10|43->11|44->12|45->13|45->13|46->14|49->17|49->17|49->17|50->18|51->19|51->19|51->19|52->20|53->21|54->22|56->24|56->24|57->25
                  -- GENERATED --
              */
          