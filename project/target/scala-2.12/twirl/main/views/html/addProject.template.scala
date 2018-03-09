
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

object addProject extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[play.data.Form[models.Project],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(projectForm: play.data.Form[models.Project], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.72*/("""


"""),_display_(/*5.2*/main("Add/Change project", user)/*5.34*/ {_display_(Seq[Any](format.raw/*5.36*/("""
    """),_display_(/*6.6*/form(action = routes.ProjectController.form)/*6.50*/ {_display_(Seq[Any](format.raw/*6.52*/("""
        """),_display_(/*7.10*/CSRF/*7.14*/.formField),format.raw/*7.24*/("""
        """),_display_(/*8.10*/inputText(projectForm("id"), '_label -> "ID")),format.raw/*8.55*/("""
        """),_display_(/*9.10*/inputText(projectForm("name"), '_label -> "Name")),format.raw/*9.59*/("""
        """),_display_(/*10.10*/inputDate(projectForm("start"), '_label -> "Start Time")),format.raw/*10.66*/("""
        """),_display_(/*11.10*/inputDate(projectForm("end"), '_label -> "End Time")),format.raw/*11.62*/("""
        """),format.raw/*12.9*/("""<input type="submit" value="Add/Update Project">
    """)))}),format.raw/*13.6*/("""
""")))}))
      }
    }
  }

  def render(projectForm:play.data.Form[models.Project],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(projectForm,user)

  def f:((play.data.Form[models.Project],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (projectForm,user) => apply(projectForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 09 13:29:47 GMT 2018
                  SOURCE: /media/sf_E_DRIVE/sdev4/project/app/views/addProject.scala.html
                  HASH: be3daf1eaa0119f93cff4b2321550c9f48919081
                  MATRIX: 651->1|1018->18|1183->88|1212->92|1252->124|1291->126|1322->132|1374->176|1413->178|1449->188|1461->192|1491->202|1527->212|1592->257|1628->267|1697->316|1734->326|1811->382|1848->392|1921->444|1957->453|2041->507
                  LINES: 24->1|29->2|34->2|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|41->9|41->9|42->10|42->10|43->11|43->11|44->12|45->13
                  -- GENERATED --
              */
          