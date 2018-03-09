
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

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[play.data.Form[models.users.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(employeeForm: play.data.Form[models.users.Employee], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.80*/("""

"""),_display_(/*4.2*/main("Add/Update Employee", user)/*4.35*/ {_display_(Seq[Any](format.raw/*4.37*/("""
    """),_display_(/*5.6*/form(action = routes.EmployeeController.form())/*5.53*/ {_display_(Seq[Any](format.raw/*5.55*/("""

    """)))}),format.raw/*7.6*/("""
""")))}))
      }
    }
  }

  def render(employeeForm:play.data.Form[models.users.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm,user)

  def f:((play.data.Form[models.users.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm,user) => apply(employeeForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 09 14:33:51 GMT 2018
                  SOURCE: /media/sf_E_DRIVE/sdev4/project/app/views/addEmployee.scala.html
                  HASH: b2f43a880bae13a8b2eef41f8f512ba0cd7e8c06
                  MATRIX: 651->1|1026->18|1199->96|1227->99|1268->132|1307->134|1338->140|1393->187|1432->189|1468->196
                  LINES: 24->1|29->2|34->2|36->4|36->4|36->4|37->5|37->5|37->5|39->7
                  -- GENERATED --
              */
          