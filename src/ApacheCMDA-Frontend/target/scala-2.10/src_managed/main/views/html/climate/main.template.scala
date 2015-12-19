
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Html,Html,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(title: String, moreScripts: Html = Html(""))(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*18.62*/(""" 

<!DOCTYPE html>

<html>
<head>

<title>"""),_display_(Seq[Any](/*25.9*/title)),format.raw/*25.14*/("""</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*31.9*/routes/*31.15*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*31.54*/("""'>
<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*33.9*/routes/*33.15*/.Assets.at("stylesheets/rating.css"))),format.raw/*33.51*/("""'>
<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*35.9*/routes/*35.15*/.Assets.at("stylesheets/navbar-fixed-top.css"))),format.raw/*35.61*/("""'>
<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*37.9*/routes/*37.15*/.Assets.at("stylesheets/custom.css"))),format.raw/*37.51*/("""'>
<link rel="stylesheet" media="screen"
	href='"""),_display_(Seq[Any](/*39.9*/routes/*39.15*/.Assets.at("stylesheets/main.css"))),format.raw/*39.49*/("""'>
<link rel="shortcut icon" type="image/png"
	href='"""),_display_(Seq[Any](/*41.9*/routes/*41.15*/.Assets.at("images/favicon.png"))),format.raw/*41.47*/("""'>
<link href='"""),_display_(Seq[Any](/*42.14*/routes/*42.20*/.Assets.at("stylesheets/bootstrap-editable.css"))),format.raw/*42.68*/("""'
	rel="stylesheet" />
<link href='"""),_display_(Seq[Any](/*44.14*/routes/*44.20*/.Assets.at("stylesheets/jquery.tablesorter.pager.css"))),format.raw/*44.74*/("""'
	rel="stylesheet" />
<link href='"""),_display_(Seq[Any](/*46.14*/routes/*46.20*/.Assets.at("stylesheets/style.css"))),format.raw/*46.55*/("""'
	rel="stylesheet" />
<link href='"""),_display_(Seq[Any](/*48.14*/routes/*48.20*/.Assets.at("stylesheets/input_comment/token-input.css"))),format.raw/*48.75*/("""'
	rel="stylesheet" />
<link href='"""),_display_(Seq[Any](/*50.14*/routes/*50.20*/.Assets.at("stylesheets/input_comment/token-input-facebook.css"))),format.raw/*50.84*/("""'
	rel="stylesheet" />
<link href='"""),_display_(Seq[Any](/*52.14*/routes/*52.20*/.Assets.at("stylesheets/at_css/jquery.atwho.css"))),format.raw/*52.69*/("""'
	rel="stylesheet" />
<link href='"""),_display_(Seq[Any](/*54.14*/routes/*54.20*/.Assets.at("stylesheets/at_css/jquery.atwho.min.css"))),format.raw/*54.73*/("""'
	rel="stylesheet" />
<!-- <link href='"""),_display_(Seq[Any](/*56.19*/routes/*56.25*/.Assets.at("stylesheets/input_comment/auto_styles.css"))),format.raw/*56.80*/("""'
	rel="stylesheet" /> -->
<link href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" rel="Stylesheet"></link>

<script type='text/javascript' src='"""),_display_(Seq[Any](/*60.38*/routes/*60.44*/.Assets.at("javascripts/jquery-2.1.4.min.js"))),format.raw/*60.89*/("""'></script>
<script type='text/javascript' src="http://ichord.github.io/Caret.js/src/jquery.caret.js"></script>
<script type='text/javascript' src='"""),_display_(Seq[Any](/*62.38*/routes/*62.44*/.Assets.at("javascripts/jquery.tokeninput.js"))),format.raw/*62.90*/("""'></script>
<script type='text/javascript' src='"""),_display_(Seq[Any](/*63.38*/routes/*63.44*/.Assets.at("javascripts/atJs/jquery.atwho.min.js"))),format.raw/*63.94*/("""'></script>
<script type='text/javascript' src='"""),_display_(Seq[Any](/*64.38*/routes/*64.44*/.Assets.at("javascripts/atJs/jquery.atwho.js"))),format.raw/*64.90*/("""'></script>

<script src="http://code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
	
<script src='"""),_display_(Seq[Any](/*68.15*/routes/*68.21*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*68.63*/("""'
	type="text/javascript"></script>
<script type='text/javascript' src='"""),_display_(Seq[Any](/*70.38*/routes/*70.44*/.Assets.at("javascripts/lastLoader.js"))),format.raw/*70.83*/("""'></script>
<script type='text/javascript' src='"""),_display_(Seq[Any](/*71.38*/routes/*71.44*/.Assets.at("javascripts/jquery.metadata.js"))),format.raw/*71.88*/("""'></script>	
<script type='text/javascript' src='"""),_display_(Seq[Any](/*72.38*/routes/*72.44*/.Assets.at("javascripts/jquery.tablesorter.js"))),format.raw/*72.91*/("""'></script>





<script type='text/javascript' src='"""),_display_(Seq[Any](/*78.38*/routes/*78.44*/.Assets.at("javascripts/jstree.js"))),format.raw/*78.79*/("""'></script>
<script type='text/javascript' src='"""),_display_(Seq[Any](/*79.38*/routes/*79.44*/.Assets.at("javascripts/keyword_tree.js"))),format.raw/*79.85*/("""'></script>

<script src='"""),_display_(Seq[Any](/*81.15*/routes/*81.21*/.Assets.at("javascripts/bootstrap-editable.min.js"))),format.raw/*81.72*/("""'></script>








"""),_display_(Seq[Any](/*90.2*/moreScripts)),format.raw/*90.13*/("""
</head>

<body>
	"""),_display_(Seq[Any](/*94.3*/header())),format.raw/*94.11*/("""
	


	<div class="container">

		"""),_display_(Seq[Any](/*100.4*/content)),format.raw/*100.11*/("""

	</div>
	
	<!-- Footer -->
		<div class="footer" >
			<div class="row">
				<div class="col-lg-6 col-lg-offset-3">
					<p class="text-muted" style="text-align: center; font-size: 14px;">&copy;
						Carnegie Mellon University - Silicon Valley ; NASA Jet Propulsion Laboratory 2015</p>
				</div>
			</div>
		</div>

</body>
</html>
"""))}
    }
    
    def render(title:String,moreScripts:Html,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,moreScripts)(content)
    
    def f:((String,Html) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,moreScripts) => (content) => apply(title,moreScripts)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 17 21:24:32 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015-Team1/ApacheCMDA-Frontend/app/views/climate/main.scala.html
                    HASH: 7bdeeb9527c03635955c47040900a539ebaddc60
                    MATRIX: 3186->1205|3341->1265|3419->1308|3446->1313|3670->1502|3685->1508|3746->1547|3815->1581|3830->1587|3888->1623|3957->1657|3972->1663|4040->1709|4109->1743|4124->1749|4182->1785|4266->1834|4281->1840|4337->1874|4426->1928|4441->1934|4495->1966|4547->1982|4562->1988|4632->2036|4704->2072|4719->2078|4795->2132|4867->2168|4882->2174|4939->2209|5011->2245|5026->2251|5103->2306|5175->2342|5190->2348|5276->2412|5348->2448|5363->2454|5434->2503|5506->2539|5521->2545|5596->2598|5673->2639|5688->2645|5765->2700|5969->2868|5984->2874|6051->2919|6236->3068|6251->3074|6319->3120|6404->3169|6419->3175|6491->3225|6576->3274|6591->3280|6659->3326|6794->3425|6809->3431|6873->3473|6982->3546|6997->3552|7058->3591|7143->3640|7158->3646|7224->3690|7310->3740|7325->3746|7394->3793|7484->3847|7499->3853|7556->3888|7641->3937|7656->3943|7719->3984|7782->4011|7797->4017|7870->4068|7926->4089|7959->4100|8013->4119|8043->4127|8113->4161|8143->4168
                    LINES: 56->18|59->18|66->25|66->25|72->31|72->31|72->31|74->33|74->33|74->33|76->35|76->35|76->35|78->37|78->37|78->37|80->39|80->39|80->39|82->41|82->41|82->41|83->42|83->42|83->42|85->44|85->44|85->44|87->46|87->46|87->46|89->48|89->48|89->48|91->50|91->50|91->50|93->52|93->52|93->52|95->54|95->54|95->54|97->56|97->56|97->56|101->60|101->60|101->60|103->62|103->62|103->62|104->63|104->63|104->63|105->64|105->64|105->64|109->68|109->68|109->68|111->70|111->70|111->70|112->71|112->71|112->71|113->72|113->72|113->72|119->78|119->78|119->78|120->79|120->79|120->79|122->81|122->81|122->81|131->90|131->90|135->94|135->94|141->100|141->100
                    -- GENERATED --
                */
            