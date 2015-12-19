
package views.html.climate

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[Application.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: play.data.Form[Application.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.43*/("""

"""),_display_(Seq[Any](/*3.2*/main("Login")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""  
    
    """),_display_(Seq[Any](/*5.6*/helper/*5.12*/.form(routes.Application.authenticate)/*5.50*/ {_display_(Seq[Any](format.raw/*5.52*/("""

		<div class="container" style="height:80vh; background-size: 100%;">
			<div class="col-sm-6 col-md-4 col-md-offset-4" style="background: rgba(255,255,255,0.7); border-radius:3px; top:25%;">
			<form class="form-signin">
				<h1 class="form-signin-heading" align="center">Sign in</h1>
				<div class="form-group">
					<label for="inputEmail" class="sr-only">Email address</label> 
					<input
						type="email" name="email" id="email" class="form-control"
						placeholder="Email address" required="" autofocus="" value='"""),_display_(Seq[Any](/*15.68*/form("email")/*15.81*/.value)),format.raw/*15.87*/("""'>
				</div>
				<div class="form-group">
					<label for="inputPassword" class="sr-only">Password</label> 
					<input
						type="password" name="password" id="password" class="form-control"
						placeholder="Password" required="">
				</div>
				<div class="form-group" style="color: red;">
				"""),_display_(Seq[Any](/*24.6*/if(form.hasGlobalErrors)/*24.30*/ {_display_(Seq[Any](format.raw/*24.32*/(""" 
            	<p class="error">
                	"""),_display_(Seq[Any](/*26.19*/form/*26.23*/.globalError.message)),format.raw/*26.43*/("""
            	</p>
        		""")))})),format.raw/*28.12*/("""
        		"""),_display_(Seq[Any](/*29.12*/if(flash.contains("success"))/*29.41*/ {_display_(Seq[Any](format.raw/*29.43*/("""
            	<p class="success">
                	"""),_display_(Seq[Any](/*31.19*/flash/*31.24*/.get("success"))),format.raw/*31.39*/("""
            	</p>
        		""")))})),format.raw/*33.12*/("""
				<button class="btn btn-primary btn-block" type="submit">Sign in</button>
				</div>
				<div class="form-group" align="center">
					<span >
					New User?
					<a href='"""),_display_(Seq[Any](/*39.16*/routes/*39.22*/.Application.signup())),format.raw/*39.43*/("""'>Sign up</a>
					</span>
				</div>
			</form>
			</div>
		</div>
""")))})),format.raw/*45.2*/("""
	
""")))})),format.raw/*47.2*/("""
    

"""))}
    }
    
    def render(form:play.data.Form[Application.Login]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((play.data.Form[Application.Login]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 17 21:24:32 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015-Team1/ApacheCMDA-Frontend/app/views/climate/login.scala.html
                    HASH: f3b3462da70bd506d341d1a1844456a0f139352a
                    MATRIX: 809->1|944->42|981->45|1002->58|1041->60|1088->73|1102->79|1148->117|1187->119|1751->647|1773->660|1801->666|2137->967|2170->991|2210->993|2297->1044|2310->1048|2352->1068|2414->1098|2462->1110|2500->1139|2540->1141|2628->1193|2642->1198|2679->1213|2741->1243|2953->1419|2968->1425|3011->1446|3111->1515|3146->1519
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|43->15|43->15|43->15|52->24|52->24|52->24|54->26|54->26|54->26|56->28|57->29|57->29|57->29|59->31|59->31|59->31|61->33|67->39|67->39|67->39|73->45|75->47
                    -- GENERATED --
                */
            