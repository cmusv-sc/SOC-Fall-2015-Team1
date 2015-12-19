
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
object getComment extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[Comment],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(commentForm: play.data.Form[Comment]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 


Seq[Any](format.raw/*18.40*/("""
"""),format.raw/*20.1*/("""
"""),_display_(Seq[Any](/*21.2*/main("getComment")/*21.20*/ {_display_(Seq[Any](format.raw/*21.22*/("""

<!-- <div class="jumbotron">
	<div class="row">
	<div class="col-md-5">
	</div>
	<div class="col-md-6">
		<h2>Sign Up Page</h2>
		<div class="form-group" >
			<input type="text" class="form-control" placeholder="UserName" name="username" style="margin-bottom: 4px">
			<input type="text" class="form-control" placeholder="First Name" name="firstname" style="margin-bottom: 4px">
			<input type="text" class="form-control" placeholder="Last Name" name="lastname" style="margin-bottom: 4px">
			<input type="password" class="form-control" placeholder="Password" name="password1" style="margin-bottom: 4px">
			<input type="password" class="form-control" placeholder="Confirm Password" name="password2" style="margin-bottom: 4px">
		</div>
		<input type="submit" value="Register" style="width:100px;margin-right:10px;background:#1489FF;color:white;" />
		<input type="submit" value="Clear" style="width:100px;margin-right:10px;background:#1489FF;color:white;" />
		<input type="submit" value="Back" style="width:100px;margin-right:10px;background:#1489FF;color:white;" />			
	</div>
</div>
</div> -->
	<!-- """),_display_(Seq[Any](/*42.8*/flash_message())),format.raw/*42.23*/("""    
     """),_display_(Seq[Any](/*43.7*/if(true)/*43.15*/{_display_(Seq[Any](format.raw/*43.16*/(""" -->
	    <h1>Get Comment</h1>
	    """),_display_(Seq[Any](/*45.7*/form(routes.CommentController.getCommentByID())/*45.54*/ {_display_(Seq[Any](format.raw/*45.56*/("""
	    	"""),_display_(Seq[Any](/*46.8*/inputText(
	        	commentForm("serviceID"),
	        	'_label -> "serviceID"
	        ))),format.raw/*49.11*/("""
	           
	        
	        <input class="btn" type="submit" value="Submit">
	        <a href=""""),_display_(Seq[Any](/*53.20*/routes/*53.26*/.ClimateServiceController.climateServices())),format.raw/*53.69*/("""" class="btn">Cancel</a>
	    """)))})),format.raw/*54.7*/("""
	
		<br>
		    
	    <!-- """),_display_(Seq[Any](/*58.12*/form(routes.ClimateServiceController.downloadClimateService(), 'class -> "form-horizontal", 'role -> "form")/*58.120*/ {_display_(Seq[Any](format.raw/*58.122*/("""
	
	        <button type="submit" name="action" value="download">Download</button>
	    """)))})),format.raw/*61.7*/(""" -->
    <!-- """)))})),format.raw/*62.11*/(""" -->
""")))})),format.raw/*63.2*/("""
"""))}
    }
    
    def render(commentForm:play.data.Form[Comment]): play.api.templates.HtmlFormat.Appendable = apply(commentForm)
    
    def f:((play.data.Form[Comment]) => play.api.templates.HtmlFormat.Appendable) = (commentForm) => apply(commentForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 17 21:24:32 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015-Team1/ApacheCMDA-Frontend/app/views/climate/getComment.scala.html
                    HASH: f440012c95083436d81fc20f32fe67863a3b8d6e
                    MATRIX: 3199->1207|3350->1245|3379->1266|3417->1269|3444->1287|3484->1289|4647->2417|4684->2432|4731->2444|4748->2452|4787->2453|4861->2492|4917->2539|4957->2541|5001->2550|5116->2643|5257->2748|5272->2754|5337->2797|5400->2829|5468->2861|5586->2969|5627->2971|5750->3063|5798->3079|5836->3086
                    LINES: 56->18|60->18|61->20|62->21|62->21|62->21|83->42|83->42|84->43|84->43|84->43|86->45|86->45|86->45|87->46|90->49|94->53|94->53|94->53|95->54|99->58|99->58|99->58|102->61|103->62|104->63
                    -- GENERATED --
                */
            