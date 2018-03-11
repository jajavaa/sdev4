
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[play.data.Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: play.data.Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.74*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login", user)/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
    """),format.raw/*5.5*/("""<div class="row">
        <div class="col-sm-12 col-md-4 col-lg-4 offset-4">
        """),_display_(/*7.10*/helper/*7.16*/.form(action = controllers.routes.LoginController.form)/*7.71*/ {_display_(Seq[Any](format.raw/*7.73*/("""
            """),_display_(/*8.14*/CSRF/*8.18*/.formField),format.raw/*8.28*/("""
            """),format.raw/*9.13*/("""<div class="form-group">
                """),_display_(/*10.18*/inputText(loginForm("email"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*10.122*/("""
            """),format.raw/*11.13*/("""</div>
            <div class="form-group">
                """),_display_(/*13.18*/inputPassword(loginForm("password"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*13.132*/("""
            """),format.raw/*14.13*/("""</div>
            <div class="form-group">
                <input type="submit" value="Sign In" class="form-control btn btn-success">
            </div>
        """)))}),format.raw/*18.10*/("""
        """),format.raw/*19.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(loginForm:play.data.Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((play.data.Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 10 20:12:57 GMT 2018
                  SOURCE: /home/konrad/Documents/sdev4/project/app/views/login.scala.html
                  HASH: a8aae7a6669e000c3d750b62ce660d54b64f6480
                  MATRIX: 994->1|1139->75|1184->73|1211->91|1238->93|1265->112|1304->114|1335->119|1447->205|1461->211|1524->266|1563->268|1603->282|1615->286|1645->296|1685->309|1754->351|1880->455|1921->468|2009->529|2145->643|2186->656|2380->819|2416->828
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|39->7|39->7|39->7|40->8|40->8|40->8|41->9|42->10|42->10|43->11|45->13|45->13|46->14|50->18|51->19
                  -- GENERATED --
              */
          