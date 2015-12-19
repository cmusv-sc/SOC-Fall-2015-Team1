
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
object searchService extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[metadata.ClimateService],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(climateServiceForm: play.data.Form[metadata.ClimateService]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 


Seq[Any](format.raw/*18.63*/("""

"""),format.raw/*21.1*/("""
"""),_display_(Seq[Any](/*22.2*/main("searchService")/*22.23*/ {_display_(Seq[Any](format.raw/*22.25*/("""  
    

		<div class="container" style="height:80vh; background-size: 100%;">
			<div class="col-sm-6 col-md-4 col-md-offset-4" style="background: rgba(255,255,255,0.7); border-radius:3px; top:25%;">
			"""),_display_(Seq[Any](/*27.5*/form(routes.ClimateServiceController.searchClimateServiceByKey())/*27.70*/ {_display_(Seq[Any](format.raw/*27.72*/("""
				<h1 class="form-keyword-heading" align="center">Search A Service</h1>
				<div class="form-group">
				    <br>
					"""),_display_(Seq[Any](/*31.7*/inputText(climateServiceForm("keyword"), 'class -> "form-control", 'id -> "keyword", '_label -> Messages("Type in your Keyword"), 'placeholder -> "Keyword", 'size->20))),format.raw/*31.174*/("""
				</div>
				<div class="form-group" style="color: red;">

				<button class="btn btn-primary btn-block" type="submit">Search</button>
				</div>
			""")))})),format.raw/*37.5*/("""
			</div>
		</div>

	
""")))})),format.raw/*42.2*/("""
    

"""))}
    }
    
    def render(climateServiceForm:play.data.Form[metadata.ClimateService]): play.api.templates.HtmlFormat.Appendable = apply(climateServiceForm)
    
    def f:((play.data.Form[metadata.ClimateService]) => play.api.templates.HtmlFormat.Appendable) = (climateServiceForm) => apply(climateServiceForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 17 21:24:33 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015-Team1/ApacheCMDA-Frontend/app/views/climate/searchService.scala.html
                    HASH: 5437814cc7cc4fb7365e575385cf1944e139c7ed
                    MATRIX: 3248->1222|3422->1283|3453->1306|3491->1309|3521->1330|3561->1332|3806->1542|3880->1607|3920->1609|4082->1736|4272->1903|4462->2062|4522->2091
                    LINES: 56->18|60->18|62->21|63->22|63->22|63->22|68->27|68->27|68->27|72->31|72->31|78->37|83->42
                    -- GENERATED --
                */
            