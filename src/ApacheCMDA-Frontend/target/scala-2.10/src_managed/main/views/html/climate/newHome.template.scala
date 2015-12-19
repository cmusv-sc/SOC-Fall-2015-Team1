
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
object newHome extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,String,List[metadata.ClimateService],play.api.templates.HtmlFormat.Appendable] {

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


"""),_display_(Seq[Any](/*24.2*/main("newHome")/*24.17*/ {_display_(Seq[Any](format.raw/*24.19*/("""

<div class="jumbotron">
	<div class="row">

		<div class="col-lg-5">
			</br></br>
			<img src='"""),_display_(Seq[Any](/*31.15*/routes/*31.21*/.Assets.at("images/newHomeBackground.jpg"))),format.raw/*31.63*/("""' height="480" width="400" />
		</div>
		<div class="col-lg-6">
			<h2>Team 1 18655 Project1</h2>
			<br>
			<p> Run Yang <p>
			<p> Jian Zhu <p>
			<p> Mujing Zhou<p>
			<p> Yibin Yan <p>
			<br>
			<p> This is the 18655 project of Team1
			</p>
			
			<!-- """),_display_(Seq[Any](/*44.10*/if(!session.get("username"))/*44.38*/{_display_(Seq[Any](format.raw/*44.39*/(""" -->
			
			<p>
				"""),_display_(Seq[Any](/*47.6*/if(false)/*47.15*/{_display_(Seq[Any](format.raw/*47.16*/(""" <a class="btn btn-primary" href="climate/register"
					role="button">Register &raquo;</a> """)))})),format.raw/*48.42*/("""
			</p>
			<!-- """)))})),format.raw/*50.10*/(""" -->
		</div>
	</div>
</div>
		
	""")))})),format.raw/*55.3*/("""
"""))}
    }
    
    def render(email:String,vfile:String,dataset:String,climateServices:List[metadata.ClimateService]): play.api.templates.HtmlFormat.Appendable = apply(email,vfile,dataset,climateServices)
    
    def f:((String,String,String,List[metadata.ClimateService]) => play.api.templates.HtmlFormat.Appendable) = (email,vfile,dataset,climateServices) => apply(email,vfile,dataset,climateServices)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 17 21:24:32 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015-Team1/ApacheCMDA-Frontend/app/views/climate/newHome.scala.html
                    HASH: dc9070f310c3b18f67c05537bc027cee371a6cd4
                    MATRIX: 3193->1190|3400->1285|3429->1305|3468->1309|3492->1324|3532->1326|3667->1425|3682->1431|3746->1473|4042->1733|4079->1761|4118->1762|4174->1783|4192->1792|4231->1793|4356->1886|4406->1904|4471->1938
                    LINES: 56->18|60->18|62->21|65->24|65->24|65->24|72->31|72->31|72->31|85->44|85->44|85->44|88->47|88->47|88->47|89->48|91->50|96->55
                    -- GENERATED --
                */
            