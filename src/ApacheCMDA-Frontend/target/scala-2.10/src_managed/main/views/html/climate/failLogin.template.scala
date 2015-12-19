
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
object failLogin extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[User],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(userForm: play.data.Form[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 


Seq[Any](format.raw/*18.34*/("""

"""),format.raw/*21.1*/("""
"""),_display_(Seq[Any](/*22.2*/main("Home")/*22.14*/ {_display_(Seq[Any](format.raw/*22.16*/("""

<div class="jumbotron">
	<div class="row">

		<div class="col-lg-5">
			</br></br>
			<img src="/assets/images/main.jpg" height="480" width="330" />
		</div>
		<div class="col-lg-6">
			<br>
			<h1>FAIL TO LOG IN !!!</h1>
			<br>
			<!-- """),_display_(Seq[Any](/*35.10*/if(!session.get("username"))/*35.38*/{_display_(Seq[Any](format.raw/*35.39*/(""" -->
			
			<p>
				"""),_display_(Seq[Any](/*38.6*/if(false)/*38.15*/{_display_(Seq[Any](format.raw/*38.16*/(""" <a class="btn btn-primary" href="climate/register"
					role="button">Register &raquo;</a> """)))})),format.raw/*39.42*/("""
			</p>
			<!-- """)))})),format.raw/*41.10*/(""" -->
		</div>
	</div>
</div>

""")))})),format.raw/*46.2*/("""
"""))}
    }
    
    def render(userForm:play.data.Form[User]): play.api.templates.HtmlFormat.Appendable = apply(userForm)
    
    def f:((play.data.Form[User]) => play.api.templates.HtmlFormat.Appendable) = (userForm) => apply(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 17 21:24:32 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015-Team1/ApacheCMDA-Frontend/app/views/climate/failLogin.scala.html
                    HASH: c4c76f80792f0a6683e06302487cab6d9f535136
                    MATRIX: 3225->1222|3370->1254|3401->1277|3439->1280|3460->1292|3500->1294|3790->1548|3827->1576|3866->1577|3925->1601|3943->1610|3982->1611|4108->1705|4160->1725|4227->1761
                    LINES: 56->18|60->18|62->21|63->22|63->22|63->22|76->35|76->35|76->35|79->38|79->38|79->38|80->39|82->41|87->46
                    -- GENERATED --
                */
            