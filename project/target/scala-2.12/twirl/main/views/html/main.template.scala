
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>

        <meta charset="utf-8">
        <title>"""),_display_(/*9.17*/title),format.raw/*9.22*/("""</title>
        <link rel="stylesheet" href=""""),_display_(/*10.39*/routes/*10.45*/.Assets.at("stylesheets/main.css")),format.raw/*10.79*/("""">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src=""""),_display_(/*16.23*/routes/*16.29*/.Assets.at("javascripts/main.js")),format.raw/*16.62*/(""""></script>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Pulse HR Manager</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    """),_display_(/*26.22*/if(user.isInstanceOf[models.users.Admin])/*26.63*/ {_display_(Seq[Any](format.raw/*26.65*/("""
                        """),format.raw/*27.25*/("""<li class="nav-item">
                            <a class="nav-link" href=""""),_display_(/*28.56*/routes/*28.62*/.DepartmentController.departments),format.raw/*28.95*/("""">Department View</a>
                        </li>
                    """)))}),format.raw/*30.22*/("""
                    """),format.raw/*31.21*/("""<li class="nav-item">
                        <a class="nav-link" href=""""),_display_(/*32.52*/routes/*32.58*/.ProjectController.projects),format.raw/*32.85*/("""">Project View</a>
                    </li>
                    """),_display_(/*34.22*/if(user.isInstanceOf[models.users.Admin])/*34.63*/ {_display_(Seq[Any](format.raw/*34.65*/("""
                        """),format.raw/*35.25*/("""<li class="nav-item">
                            <a class="nav-link" href=""""),_display_(/*36.56*/routes/*36.62*/.EmployeeController.employees),format.raw/*36.91*/("""">Employee View</a>
                        </li>
                    """)))}),format.raw/*38.22*/("""
                    """),_display_(/*39.22*/if(user.isInstanceOf[models.users.Employee])/*39.66*/ {_display_(Seq[Any](format.raw/*39.68*/("""
                        """),format.raw/*40.25*/("""<li class="nav-item">
                            <a class="nav-link" href=""""),_display_(/*41.56*/routes/*41.62*/.EmployeeController.employee(user.getId)),format.raw/*41.102*/("""">Profile</a>
                        </li>
                    """)))}),format.raw/*43.22*/("""
                """),format.raw/*44.17*/("""</ul>
            </div>
            <div class="navbar-right">
                <ul class="nav navbar-nav">
                    """),_display_(/*48.22*/if(user != null)/*48.38*/ {_display_(Seq[Any](format.raw/*48.40*/("""
                        """),format.raw/*49.25*/("""<li class="nav-item">
                            <a class="nav-link" href="">Logged in as """),_display_(/*50.71*/user/*50.75*/.getClass.getSimpleName),format.raw/*50.98*/(""": """),_display_(/*50.101*/user/*50.105*/.getFirstName),format.raw/*50.118*/(""" """),_display_(/*50.120*/user/*50.124*/.getLastName),format.raw/*50.136*/("""</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href=""""),_display_(/*53.56*/routes/*53.62*/.LoginController.logout),format.raw/*53.85*/("""">Logout</a>
                        </li>
                    """)))}/*55.23*/else/*55.28*/{_display_(Seq[Any](format.raw/*55.29*/("""
                        """),format.raw/*56.25*/("""<li class="nav-item">
                            <a class="nav-link" href=""""),_display_(/*57.56*/routes/*57.62*/.LoginController.login),format.raw/*57.84*/("""">Login</a>
                        </li>
                    """)))}),format.raw/*59.22*/("""
                """),format.raw/*60.17*/("""</ul>
            </div>
        </nav>
        <div class="container">
        """),_display_(/*64.10*/content),format.raw/*64.17*/("""
        """),format.raw/*65.9*/("""</div>
    </body>
</html>"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 13:08:56 GMT 2018
                  SOURCE: /home/konrad/Documents/sdev4/project/app/views/main.scala.html
                  HASH: 447e8d9370a402be9c2b4ba40fa007b35ca5181d
                  MATRIX: 970->1|1120->56|1148->58|1267->151|1292->156|1366->203|1381->209|1436->243|2431->1211|2446->1217|2500->1250|3088->1811|3138->1852|3178->1854|3231->1879|3335->1956|3350->1962|3404->1995|3508->2068|3557->2089|3657->2162|3672->2168|3720->2195|3813->2261|3863->2302|3903->2304|3956->2329|4060->2406|4075->2412|4125->2441|4227->2512|4276->2534|4329->2578|4369->2580|4422->2605|4526->2682|4541->2688|4603->2728|4699->2793|4744->2810|4900->2939|4925->2955|4965->2957|5018->2982|5137->3074|5150->3078|5194->3101|5225->3104|5239->3108|5274->3121|5304->3123|5318->3127|5352->3139|5515->3275|5530->3281|5574->3304|5657->3369|5670->3374|5709->3375|5762->3400|5866->3477|5881->3483|5924->3505|6018->3568|6063->3585|6171->3666|6199->3673|6235->3682
                  LINES: 28->1|33->1|35->3|41->9|41->9|42->10|42->10|42->10|48->16|48->16|48->16|58->26|58->26|58->26|59->27|60->28|60->28|60->28|62->30|63->31|64->32|64->32|64->32|66->34|66->34|66->34|67->35|68->36|68->36|68->36|70->38|71->39|71->39|71->39|72->40|73->41|73->41|73->41|75->43|76->44|80->48|80->48|80->48|81->49|82->50|82->50|82->50|82->50|82->50|82->50|82->50|82->50|82->50|85->53|85->53|85->53|87->55|87->55|87->55|88->56|89->57|89->57|89->57|91->59|92->60|96->64|96->64|97->65
                  -- GENERATED --
              */
          