
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

object addAddress extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[play.data.Form[models.Address],models.Address,models.users.Employee,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(addressForm: play.data.Form[models.Address], address: models.Address, employee: models.users.Employee, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.130*/("""

"""),_display_(/*4.2*/main("Add/Change address", user)/*4.34*/ {_display_(Seq[Any](format.raw/*4.36*/("""
    """),_display_(/*5.6*/form(action = routes.AddressController.form)/*5.50*/ {_display_(Seq[Any](format.raw/*5.52*/("""
        """),_display_(/*6.10*/CSRF/*6.14*/.formField),format.raw/*6.24*/("""
        """),format.raw/*7.9*/("""<div class="row">
            <div class="col-sm-12 col-md-6 col-lg-6 offset-md-3">
                <div class="row">
                    <div class="col-sm-12 col-md-6 col-lg-6">
                        <div class="form-group">
                        """),_display_(/*12.26*/inputText(addressForm("lineOne"), '_label -> "First Line", 'class -> "form-control")),format.raw/*12.110*/("""
                        """),format.raw/*13.25*/("""</div>
                    </div>
                    <div class="col-sm-12 col-md-6 col-lg-6">
                        <div class="form-group">
                        """),_display_(/*17.26*/inputText(addressForm("lineTwo"), '_label -> "Second Line", 'class -> "form-control")),format.raw/*17.111*/("""
                        """),format.raw/*18.25*/("""</div>
                    </div>

                </div>
                <div class="row">
                    <div class="col-sm-12 col-md-4 col-lg-4">
                        <div class="form-group">
                        """),_display_(/*25.26*/inputText(addressForm("city"), '_label -> "City", 'class -> "form-control")),format.raw/*25.101*/("""
                        """),format.raw/*26.25*/("""</div>
                    </div>
                    <div class="col-sm-12 col-md-4 col-lg-4">
                        <div class="form-group">
                        """),_display_(/*30.26*/inputText(addressForm("county"), '_label -> "County", 'class -> "form-control")),format.raw/*30.105*/("""
                        """),format.raw/*31.25*/("""</div>
                    </div>
                    <div class="col-sm-12 col-md-4 col-lg-4">
                        <div class="form-group">
                        """),_display_(/*35.26*/inputText(addressForm("code"), '_label -> "Eirecode", 'class -> "form-control")),format.raw/*35.105*/("""
                        """),format.raw/*36.25*/("""</div>
                    </div>
                </div>
                """),_display_(/*39.18*/inputText(addressForm("country"), '_label -> "Country", 'class -> "form-control")),format.raw/*39.99*/("""
                """),_display_(/*40.18*/if(address == null)/*40.37*/ {_display_(Seq[Any](format.raw/*40.39*/("""
                    """),format.raw/*41.21*/("""<input class="btn btn-success form-control" type="submit" value="Create Address">
                """)))}/*42.19*/else/*42.24*/{_display_(Seq[Any](format.raw/*42.25*/("""
                    """),format.raw/*43.21*/("""<input class="btn btn-primary form-control" type="submit" value="Change Address">
                """)))}),format.raw/*44.18*/("""

            """),format.raw/*46.13*/("""</div>
        </div>
        <input type="text" value=""""),_display_(/*48.36*/employee/*48.44*/.getId),format.raw/*48.50*/("""" name="employee" readonly hidden>
        """),_display_(/*49.10*/inputText(addressForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*49.74*/("""
    """)))}),format.raw/*50.6*/("""
""")))}))
      }
    }
  }

  def render(addressForm:play.data.Form[models.Address],address:models.Address,employee:models.users.Employee,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addressForm,address,employee,user)

  def f:((play.data.Form[models.Address],models.Address,models.users.Employee,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addressForm,address,employee,user) => apply(addressForm,address,employee,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 14:19:22 GMT 2018
                  SOURCE: /home/konrad/Documents/sdev4/project/app/views/addAddress.scala.html
                  HASH: 4f0827c4f3b61cabd3708f75baf16c8a96ceda2a
                  MATRIX: 651->1|1055->18|1279->146|1307->149|1347->181|1386->183|1417->189|1469->233|1508->235|1544->245|1556->249|1586->259|1621->268|1902->522|2008->606|2061->631|2258->801|2365->886|2418->911|2673->1139|2770->1214|2823->1239|3020->1409|3121->1488|3174->1513|3371->1683|3472->1762|3525->1787|3626->1861|3728->1942|3773->1960|3801->1979|3841->1981|3890->2002|4008->2102|4021->2107|4060->2108|4109->2129|4239->2228|4281->2242|4365->2299|4382->2307|4409->2313|4480->2357|4565->2421|4601->2427
                  LINES: 24->1|29->2|34->2|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|44->12|44->12|45->13|49->17|49->17|50->18|57->25|57->25|58->26|62->30|62->30|63->31|67->35|67->35|68->36|71->39|71->39|72->40|72->40|72->40|73->41|74->42|74->42|74->42|75->43|76->44|78->46|80->48|80->48|80->48|81->49|81->49|82->50
                  -- GENERATED --
              */
          