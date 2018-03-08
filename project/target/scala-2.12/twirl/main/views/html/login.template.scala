
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
    """),format.raw/*5.5*/("""<p class="lead">Product Catalogue</p>
    <div class="col-xs-5">
        <h3>Sign in</h3>
        """),_display_(/*8.10*/if(loginForm.hasGlobalErrors)/*8.39*/ {_display_(Seq[Any](format.raw/*8.41*/("""
            """),format.raw/*9.13*/("""<p class="alert alert-warning">
                """),_display_(/*10.18*/loginForm/*10.27*/.globalError.message),format.raw/*10.47*/(""";
            </p>
        """)))}),format.raw/*12.10*/("""
        """),_display_(/*13.10*/if(flash.containsKey("error"))/*13.40*/ {_display_(Seq[Any](format.raw/*13.42*/("""
            """),format.raw/*14.13*/("""<p class="alert alert-warning">
                """),_display_(/*15.18*/flash/*15.23*/.get("loginRequired")),format.raw/*15.44*/("""
            """),format.raw/*16.13*/("""</p>
        """)))}),format.raw/*17.10*/("""


        """),_display_(/*20.10*/helper/*20.16*/.form(action = controllers.routes.LoginController.loginSubmit())/*20.80*/ {_display_(Seq[Any](format.raw/*20.82*/("""
            """),_display_(/*21.14*/CSRF/*21.18*/.formField),format.raw/*21.28*/("""

            """),format.raw/*23.13*/("""<div class="form-group">
                """),_display_(/*24.18*/inputText(loginForm("email"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*25.76*/("""
            """),format.raw/*26.13*/("""</div>
            <div class="form-group">
                """),_display_(/*28.18*/inputPassword(loginForm("password"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*29.79*/("""
            """),format.raw/*30.13*/("""</div>
            <div class="form-group">
                <input type="submit" value="Sign In" class="btn btn-primary">
            </div>
        """)))}),format.raw/*34.10*/("""
    """),format.raw/*35.5*/("""</div>
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
                  DATE: Thu Mar 08 16:48:58 GMT 2018
                  SOURCE: /media/sf_E_DRIVE/sdev4/project/app/views/login.scala.html
                  HASH: c85f6c3ebda19e54c1b27b3bcf70bfe84be2ff67
                  MATRIX: 994->1|1139->75|1184->73|1211->91|1238->93|1265->112|1304->114|1335->119|1460->218|1497->247|1536->249|1576->262|1652->311|1670->320|1711->340|1770->368|1807->378|1846->408|1886->410|1927->423|2003->472|2017->477|2059->498|2100->511|2145->525|2184->537|2199->543|2272->607|2312->609|2353->623|2366->627|2397->637|2439->651|2508->693|2650->814|2691->827|2779->888|2931->1019|2972->1032|3153->1182|3185->1187
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|40->8|40->8|40->8|41->9|42->10|42->10|42->10|44->12|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|49->17|52->20|52->20|52->20|52->20|53->21|53->21|53->21|55->23|56->24|57->25|58->26|60->28|61->29|62->30|66->34|67->35
                  -- GENERATED --
              */
          