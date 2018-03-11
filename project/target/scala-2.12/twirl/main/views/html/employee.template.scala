
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

object employee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.users.Employee,play.api.Environment,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employee: models.users.Employee, env: play.api.Environment, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.87*/("""

    """),_display_(/*3.6*/main(employee.getNames, user)/*3.35*/ {_display_(Seq[Any](format.raw/*3.37*/("""
        """),format.raw/*4.9*/("""<div class="jumbotron text-center">
            """),_display_(/*5.14*/if(env.resource("public/images/employees/thumbs/" + employee.getId + ".jpg").isDefined)/*5.101*/ {_display_(Seq[Any](format.raw/*5.103*/("""
                """),format.raw/*6.17*/("""<a href=""""),_display_(/*6.27*/routes/*6.33*/.Assets.at("images/employees/" + employee.getId + ".jpg")),format.raw/*6.90*/("""">
                    <img id="employee-image" src=""""),_display_(/*7.52*/routes/*7.58*/.Assets.at("images/employees/thumbs/" + employee.getId + ".jpg")),format.raw/*7.122*/("""" alt="Unknown image error">
                </a>
            """)))}),format.raw/*9.14*/("""
            """),format.raw/*10.13*/("""<h1>"""),_display_(/*10.18*/employee/*10.26*/.getNames),format.raw/*10.35*/("""</h1>
        </div>
        <div class="row">
            <div class="col-sm-12 col-md-6 col-lg-6">
                <ul class="list-inline">
                    <li class="list-inline-item">
                        <h3>Personal Details</h3>
                    </li>
                    <li class="list-inline-item">
                        <a class="btn btn-primary" href=""""),_display_(/*19.59*/routes/*19.65*/.EmployeeController.update(employee.getId)),format.raw/*19.107*/("""">Update</a>
                    </li>
                </ul>
                <div class="jumbotron">
                    <ul id="employee-details">
                        <li>
                            <span class="font-weight-bold">Department </span>
                            <a href=""""),_display_(/*26.39*/routes/*26.45*/.DepartmentController.department(employee.getDepartment.getId)),format.raw/*26.107*/("""">"""),_display_(/*26.110*/employee/*26.118*/.getDepartment.getTitle),format.raw/*26.141*/("""</a>
                        </li>
                        <li>
                            <span class="font-weight-bold">Email </span>
                            <a href="mailto:"""),_display_(/*30.46*/employee/*30.54*/.getEmail),format.raw/*30.63*/("""">"""),_display_(/*30.66*/employee/*30.74*/.getEmail),format.raw/*30.83*/("""</a>
                        </li>
                        <li>
                            <span class="font-weight-bold">Phone </span>
                            """),_display_(/*34.30*/employee/*34.38*/.getPhone),format.raw/*34.47*/("""
                        """),format.raw/*35.25*/("""</li>
                        <li>
                            <span class="font-weight-bold">Address</span><br>
                            """),_display_(/*38.30*/if(employee.getAddress == null)/*38.61*/ {_display_(Seq[Any](format.raw/*38.63*/("""
                                """),format.raw/*39.33*/("""<span class="font-italic">Address not recorded</span><br>
                                <a class="btn btn-success" href=""""),_display_(/*40.67*/routes/*40.73*/.AddressController.create(employee.getId)),format.raw/*40.114*/("""">Create Address</a>
                            """)))}/*41.31*/else/*41.36*/{_display_(Seq[Any](format.raw/*41.37*/("""
                                """),_display_(/*42.34*/employee/*42.42*/.getAddress.getLineOne),format.raw/*42.64*/(""", """),_display_(/*42.67*/employee/*42.75*/.getAddress.getLineTwo),format.raw/*42.97*/(""",<br>
                                """),_display_(/*43.34*/employee/*43.42*/.getAddress.getCity),format.raw/*43.61*/(""", """),_display_(/*43.64*/employee/*43.72*/.getAddress.getCounty),format.raw/*43.93*/(""",<br>
                                """),_display_(/*44.34*/employee/*44.42*/.getAddress.getCode),format.raw/*44.61*/(""", """),_display_(/*44.64*/employee/*44.72*/.getAddress.getCountry),format.raw/*44.94*/("""<br>
                                <a class="btn btn-primary" href=""""),_display_(/*45.67*/routes/*45.73*/.AddressController.update(employee.getAddress.getId, employee.getId)),format.raw/*45.141*/("""">Change</a>
                                &nbsp;
                                <a class="btn btn-danger" href=""""),_display_(/*47.66*/routes/*47.72*/.AddressController.delete(employee.getAddress.getId, employee.getId)),format.raw/*47.140*/("""">Delete</a>
                            """)))}),format.raw/*48.30*/("""

                        """),format.raw/*50.25*/("""</li>
                    </ul>
                </div>
            </div>
            <div class="col-sm-12 col-md-6 col-lg-6">
                <h3>Assigned Projects</h3>
                <table class="table">
                    <thead class="thead-dark">
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">Name</th>
                            <th scope="col">Days Left</th>
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*65.22*/for(project <- employee.getProjects) yield /*65.58*/ {_display_(Seq[Any](format.raw/*65.60*/("""
                        """),format.raw/*66.25*/("""<tr>
                            <td scope="row">
                            """),_display_(/*68.30*/defining(employee.getProjects.indexOf(project) + 1)/*68.81*/ { index =>_display_(Seq[Any](format.raw/*68.92*/("""
                                """),_display_(/*69.34*/index),format.raw/*69.39*/("""
                            """)))}),format.raw/*70.30*/("""
                            """),format.raw/*71.29*/("""</td>
                            <td>
                                <a href=""""),_display_(/*73.43*/routes/*73.49*/.ProjectController.project(project.getId)),format.raw/*73.90*/("""">"""),_display_(/*73.93*/project/*73.100*/.getName),format.raw/*73.108*/("""</a>
                            </td>
                            <td>
                            """),_display_(/*76.30*/if(project.getDays <= 10)/*76.55*/ {_display_(Seq[Any](format.raw/*76.57*/("""
                                """),format.raw/*77.33*/("""<span class="text-danger">"""),_display_(/*77.60*/project/*77.67*/.getDays),format.raw/*77.75*/(""" """),format.raw/*77.76*/("""days</span>
                            """)))}/*78.31*/else/*78.36*/{_display_(Seq[Any](format.raw/*78.37*/("""
                                """),_display_(/*79.34*/if(project.getDays <= 20)/*79.59*/ {_display_(Seq[Any](format.raw/*79.61*/("""
                                    """),format.raw/*80.37*/("""<span class="text-warning">"""),_display_(/*80.65*/project/*80.72*/.getDays),format.raw/*80.80*/(""" """),format.raw/*80.81*/("""days</span>
                                """)))}/*81.35*/else/*81.40*/{_display_(Seq[Any](format.raw/*81.41*/("""
                                    """),format.raw/*82.37*/("""<span class="text-success">"""),_display_(/*82.65*/project/*82.72*/.getDays),format.raw/*82.80*/(""" """),format.raw/*82.81*/("""days</span>
                                """)))}),format.raw/*83.34*/("""
                            """)))}),format.raw/*84.30*/("""
                            """),format.raw/*85.29*/("""</td>
                        </tr>
                    """)))}),format.raw/*87.22*/("""
                    """),format.raw/*88.21*/("""</tbody>
                </table>
            </div>
        </div>

    """)))}))
      }
    }
  }

  def render(employee:models.users.Employee,env:play.api.Environment,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employee,env,user)

  def f:((models.users.Employee,play.api.Environment,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employee,env,user) => apply(employee,env,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 14:23:43 GMT 2018
                  SOURCE: /home/konrad/Documents/sdev4/project/app/views/employee.scala.html
                  HASH: cd6422e3b7b1d13496bef30cd965902df3eedf5c
                  MATRIX: 1005->1|1185->86|1217->93|1254->122|1293->124|1328->133|1403->182|1499->269|1539->271|1583->288|1619->298|1633->304|1710->361|1790->415|1804->421|1889->485|1982->548|2023->561|2055->566|2072->574|2102->583|2505->959|2520->965|2584->1007|2904->1300|2919->1306|3003->1368|3034->1371|3052->1379|3097->1402|3306->1584|3323->1592|3353->1601|3383->1604|3400->1612|3430->1621|3623->1787|3640->1795|3670->1804|3723->1829|3892->1971|3932->2002|3972->2004|4033->2037|4184->2161|4199->2167|4262->2208|4331->2259|4344->2264|4383->2265|4444->2299|4461->2307|4504->2329|4534->2332|4551->2340|4594->2362|4660->2401|4677->2409|4717->2428|4747->2431|4764->2439|4806->2460|4872->2499|4889->2507|4929->2526|4959->2529|4976->2537|5019->2559|5117->2630|5132->2636|5222->2704|5366->2821|5381->2827|5471->2895|5544->2937|5598->2963|6182->3520|6234->3556|6274->3558|6327->3583|6433->3662|6493->3713|6542->3724|6603->3758|6629->3763|6690->3793|6747->3822|6855->3903|6870->3909|6932->3950|6962->3953|6979->3960|7009->3968|7137->4069|7171->4094|7211->4096|7272->4129|7326->4156|7342->4163|7371->4171|7400->4172|7460->4214|7473->4219|7512->4220|7573->4254|7607->4279|7647->4281|7712->4318|7767->4346|7783->4353|7812->4361|7841->4362|7905->4408|7918->4413|7957->4414|8022->4451|8077->4479|8093->4486|8122->4494|8151->4495|8227->4540|8288->4570|8345->4599|8433->4656|8482->4677
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|38->6|38->6|38->6|39->7|39->7|39->7|41->9|42->10|42->10|42->10|42->10|51->19|51->19|51->19|58->26|58->26|58->26|58->26|58->26|58->26|62->30|62->30|62->30|62->30|62->30|62->30|66->34|66->34|66->34|67->35|70->38|70->38|70->38|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|74->42|74->42|74->42|75->43|75->43|75->43|75->43|75->43|75->43|76->44|76->44|76->44|76->44|76->44|76->44|77->45|77->45|77->45|79->47|79->47|79->47|80->48|82->50|97->65|97->65|97->65|98->66|100->68|100->68|100->68|101->69|101->69|102->70|103->71|105->73|105->73|105->73|105->73|105->73|105->73|108->76|108->76|108->76|109->77|109->77|109->77|109->77|109->77|110->78|110->78|110->78|111->79|111->79|111->79|112->80|112->80|112->80|112->80|112->80|113->81|113->81|113->81|114->82|114->82|114->82|114->82|114->82|115->83|116->84|117->85|119->87|120->88
                  -- GENERATED --
              */
          