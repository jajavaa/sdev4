
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

object addProject extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[play.data.Form[models.Project],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: play.data.Form[models.Project], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.65*/("""

"""),_display_(/*3.2*/main("Add/Change project", user)/*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""

""")))}))
      }
    }
  }

  def render(form:play.data.Form[models.Project],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(form,user)

  def f:((play.data.Form[models.Project],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (form,user) => apply(form,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 08 21:25:13 GMT 2018
                  SOURCE: /home/konrad/Documents/sdev4/project/app/views/addProject.scala.html
                  HASH: 0b89cb8c4909a2298fe215ffeb6f3cfe96b2873c
                  MATRIX: 995->1|1153->64|1181->67|1221->99|1260->101
                  LINES: 28->1|33->1|35->3|35->3|35->3
                  -- GENERATED --
              */
          