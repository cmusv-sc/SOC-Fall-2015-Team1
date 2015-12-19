
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
object newAllServices extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,String,List[metadata.ClimateService],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(email: String, vfile: String, dataset: String, climateServices: List[metadata.ClimateService]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 


Seq[Any](format.raw/*18.97*/("""

"""),format.raw/*21.1*/("""


"""),_display_(Seq[Any](/*24.2*/main("newAllServices")/*24.24*/ {_display_(Seq[Any](format.raw/*24.26*/("""

<!-- Mention Friend  <input type="text" name="mentionFriends" id="mentionFriends_id"/></br>
	Meantion Service  <input type="text" name="mentionServices" id="mentionServices_id"/> -->

	<!-- <div class="jumbotron">
		<div class="row">
			<div class="col-lg-10"> -->
				<h1>"""),_display_(Seq[Any](/*32.10*/climateServices/*32.25*/.size())),format.raw/*32.32*/(""" Climate Services</h1>
				<table class="table table-striped table-bordered table-condensed ex2 tablesorter" id = "csTable">
					<thead>
						<tr>

							<th class="col-md-2">Climate Service Name</td>
							<th class="col-md-4">Purpose</td>
							<th class="col-md-4">URL</td>
							<th class="col-md-2">Average Rating</td>
							<th class="col-md-2"># of Votes</td>

							</tr>
										</thead>

					<!-- """),_display_(Seq[Any](/*46.12*/for(climateService <- climateServices) yield /*46.50*/{_display_(Seq[Any](format.raw/*46.51*/("""
					<tr>

						<td><a href = """"),_display_(Seq[Any](/*49.23*/{routes.ClimateServiceController.oneServiceNew(climateService.getUrl(),climateService.getClimateServiceName(),climateService.getId())})),format.raw/*49.157*/(""""><font size="3">"""),_display_(Seq[Any](/*49.175*/climateService/*49.189*/.getClimateServiceName())),format.raw/*49.213*/("""</a></font></td><td style="color:red"><font size="3">"""),_display_(Seq[Any](/*49.267*/climateService/*49.281*/.getAvgScore())),format.raw/*49.295*/("""<font size="3"></td><td><font size="3">"""),_display_(Seq[Any](/*49.335*/climateService/*49.349*/.getVoteCount())),format.raw/*49.364*/("""<font size="3"></td>
						<td><span class=""""),_display_(Seq[Any](/*50.25*/climateService/*50.39*/.getClimateServiceName())),format.raw/*50.63*/(""" editable"  data-name='purpose'><font size="3">
							"""),_display_(Seq[Any](/*51.9*/climateService/*51.23*/.getPurpose())),format.raw/*51.36*/(""" </font></span></td>
							<td class = "text-center" ><span class=""""),_display_(Seq[Any](/*52.49*/climateService/*52.63*/.getClimateServiceName())),format.raw/*52.87*/(""" editable" id = "url" data-name='url'>
								<a href = """"),_display_(Seq[Any](/*53.21*/{routes.ClimateServiceController.oneService(climateService.getUrl())})),format.raw/*53.90*/(""""><img src='"""),_display_(Seq[Any](/*53.103*/climateService/*53.117*/.getPhoto())),format.raw/*53.128*/("""' style="height: 150px; width: 150px" ></a> </span></td>

							</tr>
						""")))})),format.raw/*56.8*/(""" -->

						"""),_display_(Seq[Any](/*58.8*/for(climateService <- climateServices) yield /*58.46*/{_display_(Seq[Any](format.raw/*58.47*/("""
						<tr>
							<td><a href = """"),_display_(Seq[Any](/*60.24*/{routes.ClimateServiceController.oneServiceNew(climateService.getUrl(),climateService.getClimateServiceName(),climateService.getId(),session.get("email"))})),format.raw/*60.179*/(""""><font size="3">"""),_display_(Seq[Any](/*60.197*/climateService/*60.211*/.getClimateServiceName())),format.raw/*60.235*/("""</a></font></td>

							<td><span class=""""),_display_(Seq[Any](/*62.26*/climateService/*62.40*/.getClimateServiceName())),format.raw/*62.64*/(""" editable"  data-name='purpose'><font size="3">
								"""),_display_(Seq[Any](/*63.10*/climateService/*63.24*/.getPurpose())),format.raw/*63.37*/(""" </font></span></td>
								<td class = "text-center" ><span class=""""),_display_(Seq[Any](/*64.50*/climateService/*64.64*/.getClimateServiceName())),format.raw/*64.88*/(""" editable" id = "url" data-name='url'>
									<a href = """"),_display_(Seq[Any](/*65.22*/{routes.ClimateServiceController.oneService(climateService.getUrl())})),format.raw/*65.91*/(""""><img src='"""),_display_(Seq[Any](/*65.104*/climateService/*65.118*/.getPhoto())),format.raw/*65.129*/("""' style="height: 150px; width: 150px" ></a> </span></td>
									<td style="color:red"><font size="3">"""),_display_(Seq[Any](/*66.48*/climateService/*66.62*/.getAvgScore())),format.raw/*66.76*/("""<font size="3"></td><td><font size="3">"""),_display_(Seq[Any](/*66.116*/climateService/*66.130*/.getVoteCount())),format.raw/*66.145*/("""<font size="3"></td>	
								</tr>
							""")))})),format.raw/*68.9*/("""

						</table>
			<!-- 	</div>
			</div>
		</div> -->

	""")))})),format.raw/*75.3*/("""
"""))}
    }
    
    def render(email:String,vfile:String,dataset:String,climateServices:List[metadata.ClimateService]): play.api.templates.HtmlFormat.Appendable = apply(email,vfile,dataset,climateServices)
    
    def f:((String,String,String,List[metadata.ClimateService]) => play.api.templates.HtmlFormat.Appendable) = (email,vfile,dataset,climateServices) => apply(email,vfile,dataset,climateServices)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 17 21:24:32 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015-Team1/ApacheCMDA-Frontend/app/views/climate/newAllServices.scala.html
                    HASH: 9805ab040759f5a494145bd227deda622d52ec01
                    MATRIX: 3200->1190|3407->1285|3436->1305|3475->1309|3506->1331|3546->1333|3858->1609|3882->1624|3911->1631|4366->2050|4420->2088|4459->2089|4529->2123|4686->2257|4741->2275|4765->2289|4812->2313|4903->2367|4927->2381|4964->2395|5041->2435|5065->2449|5103->2464|5184->2509|5207->2523|5253->2547|5344->2603|5367->2617|5402->2630|5507->2699|5530->2713|5576->2737|5671->2796|5762->2865|5812->2878|5836->2892|5870->2903|5979->2981|6027->2994|6081->3032|6120->3033|6191->3068|6369->3223|6424->3241|6448->3255|6495->3279|6574->3322|6597->3336|6643->3360|6736->3417|6759->3431|6794->3444|6900->3514|6923->3528|6969->3552|7065->3612|7156->3681|7206->3694|7230->3708|7264->3719|7404->3823|7427->3837|7463->3851|7540->3891|7564->3905|7602->3920|7677->3964|7767->4023
                    LINES: 56->18|60->18|62->21|65->24|65->24|65->24|73->32|73->32|73->32|87->46|87->46|87->46|90->49|90->49|90->49|90->49|90->49|90->49|90->49|90->49|90->49|90->49|90->49|91->50|91->50|91->50|92->51|92->51|92->51|93->52|93->52|93->52|94->53|94->53|94->53|94->53|94->53|97->56|99->58|99->58|99->58|101->60|101->60|101->60|101->60|101->60|103->62|103->62|103->62|104->63|104->63|104->63|105->64|105->64|105->64|106->65|106->65|106->65|106->65|106->65|107->66|107->66|107->66|107->66|107->66|107->66|109->68|116->75
                    -- GENERATED --
                */
            