
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
object addComment extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[Comment],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*19.2*/(commentForm: play.data.Form[Comment]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 


Seq[Any](format.raw/*19.40*/("""


"""),format.raw/*23.1*/("""
"""),_display_(Seq[Any](/*24.2*/main("adComment")/*24.19*/ {_display_(Seq[Any](format.raw/*24.21*/("""

<div class="jumbotron">
	<div class="row">

		<div class="col-lg-5">
			</br></br>
			<img src="/assets/images/main.jpg" height="480" width="330" />
		</div>
		<div class="col-lg-6">
		"""),_display_(Seq[Any](/*34.4*/form(routes.CommentController.addComment())/*34.47*/ {_display_(Seq[Any](format.raw/*34.49*/("""
		<h2>LOG IN</h2>
		<br>
		<div class = "form-group">
		"""),_display_(Seq[Any](/*38.4*/inputText(commentForm("commenter"), 'class -> "form-control", 'id -> "commenter", '_label -> Messages("commenter"), 'placeholder -> "commenter", 'size->30))),format.raw/*38.159*/(""" 
		</div>
		<div class = "form-group">
		"""),_display_(Seq[Any](/*41.4*/inputText(commentForm("content"), 'class -> "form-control", 'id -> "content", '_label -> Messages("content"), 'placeholder -> "content", 'size->30))),format.raw/*41.151*/("""
		</div>
		<div class = "form-group">
		"""),_display_(Seq[Any](/*44.4*/inputText(commentForm("serviceID"), 'class -> "form-control", 'id -> "serviceID", '_label -> Messages("serviceID"), 'placeholder -> "serviceID", 'size->30))),format.raw/*44.159*/("""  
		</div>
		<div align="center">
	    	<input class="btn" type="submit" value="Login">
	    </div>
		
		""")))})),format.raw/*50.4*/("""
		
			<!-- """),_display_(Seq[Any](/*52.10*/if(!session.get("username"))/*52.38*/{_display_(Seq[Any](format.raw/*52.39*/(""" -->
			
			<p>
				"""),_display_(Seq[Any](/*55.6*/if(false)/*55.15*/{_display_(Seq[Any](format.raw/*55.16*/(""" <a class="btn btn-primary" href="climate/register"
					role="button">Register &raquo;</a> """)))})),format.raw/*56.42*/("""
			</p>
			<!-- """)))})),format.raw/*58.10*/(""" -->
		</div>
	</div>
</div>

""")))})))}
    }
    
    def render(commentForm:play.data.Form[Comment]): play.api.templates.HtmlFormat.Appendable = apply(commentForm)
    
    def f:((play.data.Form[Comment]) => play.api.templates.HtmlFormat.Appendable) = (commentForm) => apply(commentForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 17 21:24:32 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015-Team1/ApacheCMDA-Frontend/app/views/climate/addComment.scala.html
                    HASH: 8624ca041d5f14b9f0cf0f538daa9a516822b562
                    MATRIX: 3229->1224|3380->1262|3413->1287|3451->1290|3477->1307|3517->1309|3750->1507|3802->1550|3842->1552|3939->1614|4117->1769|4198->1815|4368->1962|4448->2007|4626->2162|4770->2275|4821->2290|4858->2318|4897->2319|4956->2343|4974->2352|5013->2353|5139->2447|5191->2467
                    LINES: 56->19|60->19|63->23|64->24|64->24|64->24|74->34|74->34|74->34|78->38|78->38|81->41|81->41|84->44|84->44|90->50|92->52|92->52|92->52|95->55|95->55|95->55|96->56|98->58
                    -- GENERATED --
                */
            