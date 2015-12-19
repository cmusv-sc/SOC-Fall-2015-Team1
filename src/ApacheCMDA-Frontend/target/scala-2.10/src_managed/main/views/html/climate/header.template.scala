
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
/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one or more		   *
 * contributor license agreements.  See the NOTICE file distributed with	   *
 * this work for additional information regarding copyright ownership.         *
 * The ASF licenses this file to You under the Apache License, Version 2.0     *
 * (the "License"); you may not use this file except in compliance with        *
 * the License.  You may obtain a copy of the License at                       *
 *                                                                             *
 *    http://www.apache.org/licenses/LICENSE-2.0                               *
 *																			   *
 * Unless required by applicable law or agreed to in writing, software         *
 * distributed under the License is distributed on an "AS IS" BASIS,           *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
 * See the License for the specific language governing permissions and         *
 * limitations under the License.											   *
 *******************************************************************************/
object header extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one or more		   *
 * contributor license agreements.  See the NOTICE file distributed with	   *
 * this work for additional information regarding copyright ownership.         *
 * The ASF licenses this file to You under the Apache License, Version 2.0     *
 * (the "License"); you may not use this file except in compliance with        *
 * the License.  You may obtain a copy of the License at                       *
 *                                                                             *
 *    http://www.apache.org/licenses/LICENSE-2.0                               *
 *																			   *
 * Unless required by applicable law or agreed to in writing, software         *
 * distributed under the License is distributed on an "AS IS" BASIS,           *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
 * See the License for the specific language governing permissions and         *
 * limitations under the License.											   *
 *******************************************************************************/
    def apply/*18.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*18.4*/("""
	<div class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" style="padding-bottom: 0;" href="/climate"><img
					src='"""),_display_(Seq[Any](/*29.12*/routes/*29.18*/.Assets.at("images/NASA_JPL_logo.png"))),format.raw/*29.56*/("""' style="height: 40px; width: 220px;">&nbsp&nbsp<img
					src='"""),_display_(Seq[Any](/*30.12*/routes/*30.18*/.Assets.at("images/logo.png"))),format.raw/*30.47*/("""' style="height: 15px; width: 250px;"></a>
			</div>
			<div class="navbar-collapse collapse" style="height:">
				<ul class="nav navbar-nav navbar-right">
					
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Service<b
							class="caret"></b></a>
						<ul class="dropdown-menu">

						<!-- <li><a href=""""),_display_(Seq[Any](/*40.26*/routes/*40.32*/.ClimateServiceController.climateServices())),format.raw/*40.75*/("""">Service List</a></li> -->
						<li><a href=""""),_display_(Seq[Any](/*41.21*/routes/*41.27*/.ClimateServiceController.newAllServices())),format.raw/*41.69*/("""">Service List</a></li>
						<li><a href=""""),_display_(Seq[Any](/*42.21*/routes/*42.27*/.ClimateServiceController.searchService())),format.raw/*42.68*/("""">Search Service</a></li>
						
					
						</ul>
					
					</li>
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Dataset<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
						
						<li><a href=""""),_display_(Seq[Any](/*53.21*/routes/*53.27*/.DatasetController.datasetList())),format.raw/*53.59*/("""">Dataset List</a></li>
						<li><a href=""""),_display_(Seq[Any](/*54.21*/routes/*54.27*/.DatasetController.searchDataset())),format.raw/*54.61*/("""">Search dataset</a></li>
						</ul>
					</li>
					"""),format.raw/*57.42*/("""
						"""),format.raw/*58.67*/("""
							"""),format.raw/*59.34*/("""
						"""),format.raw/*60.37*/("""
							"""),format.raw/*61.101*/("""
							"""),format.raw/*62.106*/("""
						"""),format.raw/*63.16*/("""
					"""),format.raw/*64.15*/("""
					
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">About<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
						<li><a href=""""),_display_(Seq[Any](/*70.21*/routes/*70.27*/.ClimateServiceController.home())),format.raw/*70.59*/("""">Home</a></li>
						<li><a href=""""),_display_(Seq[Any](/*71.21*/routes/*71.27*/.AboutusController.aboutUs())),format.raw/*71.55*/("""">About Us</a></li>
						<li><a href=""""),_display_(Seq[Any](/*72.21*/routes/*72.27*/.AboutusController.aboutProject())),format.raw/*72.60*/("""">About project</a></li>
						</ul>
					</li>
					
					"""),_display_(Seq[Any](/*76.7*/if(!session.get("email"))/*76.32*/ {_display_(Seq[Any](format.raw/*76.34*/("""
						<form class="navbar-form navbar-right" action=""""),_display_(Seq[Any](/*77.55*/routes/*77.61*/.Application.login())),format.raw/*77.81*/("""">
							<button type="submit" class="btn btn-success">Log in</button>
						</form>
					""")))}/*80.8*/else/*80.13*/{_display_(Seq[Any](format.raw/*80.14*/("""
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">My Services<b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="#">My climate services</a></li>
								<li><a href="#">My datasets</a></li>
							</ul>
						</li>
						
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">"""),_display_(Seq[Any](/*90.68*/session/*90.75*/.get("email"))),format.raw/*90.88*/("""<b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href=""""),_display_(Seq[Any](/*92.23*/routes/*92.29*/.Application.logout())),format.raw/*92.50*/("""">Log out</a></li>
							</ul>
						</li>
					""")))})),format.raw/*95.7*/("""	
										
					"""),_display_(Seq[Any](/*97.7*/if(false)/*97.16*/ {_display_(Seq[Any](format.raw/*97.18*/("""
						<form class="navbar-form navbar-right" action="#">
							<button type="submit" class="btn btn-success">Admin Console</button>
						</form>
					""")))})),format.raw/*101.7*/("""
					
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 17 21:24:32 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015-Team1/ApacheCMDA-Frontend/app/views/climate/header.scala.html
                    HASH: dd3af913293d3d62f0c4b1fafa613ed4583aeb53
                    MATRIX: 3171->1205|3267->1207|3799->1703|3814->1709|3874->1747|3974->1811|3989->1817|4040->1846|4428->2198|4443->2204|4508->2247|4592->2295|4607->2301|4671->2343|4751->2387|4766->2393|4829->2434|5124->2693|5139->2699|5193->2731|5273->2775|5288->2781|5344->2815|5426->2905|5461->2972|5497->3006|5532->3043|5569->3144|5606->3250|5641->3266|5675->3281|5900->3470|5915->3476|5969->3508|6041->3544|6056->3550|6106->3578|6182->3618|6197->3624|6252->3657|6347->3717|6381->3742|6421->3744|6512->3799|6527->3805|6569->3825|6679->3918|6692->3923|6731->3924|7158->4315|7174->4322|7209->4335|7327->4417|7342->4423|7385->4444|7466->4494|7520->4513|7538->4522|7578->4524|7764->4678
                    LINES: 56->18|59->18|70->29|70->29|70->29|71->30|71->30|71->30|81->40|81->40|81->40|82->41|82->41|82->41|83->42|83->42|83->42|94->53|94->53|94->53|95->54|95->54|95->54|98->57|99->58|100->59|101->60|102->61|103->62|104->63|105->64|111->70|111->70|111->70|112->71|112->71|112->71|113->72|113->72|113->72|117->76|117->76|117->76|118->77|118->77|118->77|121->80|121->80|121->80|131->90|131->90|131->90|133->92|133->92|133->92|136->95|138->97|138->97|138->97|142->101
                    -- GENERATED --
                */
            