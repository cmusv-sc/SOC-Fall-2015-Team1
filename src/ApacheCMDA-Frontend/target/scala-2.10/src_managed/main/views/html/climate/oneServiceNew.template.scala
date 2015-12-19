
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
object oneServiceNew extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template10[String,String,String,play.data.Form[Rating],play.data.Form[Comment],List[Comment],List[metadata.ClimateService],List[metadata.ClimateService],String,List[metadata.ClimateService],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(url: String, serviceName:String, serviceId: String, ratingForm: play.data.Form[Rating], commentForm: play.data.Form[Comment], comments: List[Comment], climateServices: List[metadata.ClimateService], AllClimateServices: List[metadata.ClimateService], myLike: String, recommendServices: List[metadata.ClimateService]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

def /*22.2*/scripts/*22.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
<script type="text/javascript">


var services = [];
var newList = [];
var names = [];
like = String("""),_display_(Seq[Any](/*29.16*/myLike)),format.raw/*29.22*/(""");
var names = [];
$(document).ready(function()"""),format.raw/*31.29*/("""{"""),format.raw/*31.30*/("""
	var obj = document.getElementById("iframe");
	resizeIframe(obj);
	var curCursorPos;
	var newService;
    setLikeInitial();
	// getData();
	function getFields(input, field, index) """),format.raw/*38.42*/("""{"""),format.raw/*38.43*/("""
    	var output = (input[index][field]);
    	return output;
	"""),format.raw/*41.2*/("""}"""),format.raw/*41.3*/("""


	function setLikeInitial()"""),format.raw/*44.27*/("""{"""),format.raw/*44.28*/("""
		if (like === 'true') """),format.raw/*45.24*/("""{"""),format.raw/*45.25*/("""
			$("likeButton").html("<strong> Unlike! </strong>");
			var tmp10 = document.getElementById("inputLikeVar");
            tmp10.value = like;
            console.log(tmp10.value);
		"""),format.raw/*50.3*/("""}"""),format.raw/*50.4*/(""" else if (like === 'false') """),format.raw/*50.32*/("""{"""),format.raw/*50.33*/(""" 
            $("likeButton").html("<strong> Like! </strong>");
            var tmp10 = document.getElementById("inputLikeVar");
            tmp10.value = like;
            console.log(tmp10.value);
		"""),format.raw/*55.3*/("""}"""),format.raw/*55.4*/(""" 
	"""),format.raw/*56.2*/("""}"""),format.raw/*56.3*/("""

	$("#like_button").click(function()"""),format.raw/*58.36*/("""{"""),format.raw/*58.37*/("""
		if (like === 'false') """),format.raw/*59.25*/("""{"""),format.raw/*59.26*/("""
			like = 'true';
			$("likeButton").html("<strong> Unlike! </strong>");
			var tmp10 = document.getElementById("inputLikeVar");
            tmp10.value = like;
            console.log(tmp10.value);
		"""),format.raw/*65.3*/("""}"""),format.raw/*65.4*/(""" else if (like === 'true') """),format.raw/*65.31*/("""{"""),format.raw/*65.32*/("""
			like = 'false';
            $("likeButton").html("<strong> Like! </strong>");
            var tmp10 = document.getElementById("inputLikeVar");
            tmp10.value = like;
            console.log(tmp10.value);
		"""),format.raw/*71.3*/("""}"""),format.raw/*71.4*/(""" else """),format.raw/*71.10*/("""{"""),format.raw/*71.11*/("""
			$("likeButton").html("<strong>My Like --> invalid</strong>");
		"""),format.raw/*73.3*/("""}"""),format.raw/*73.4*/("""
    	
    """),format.raw/*75.5*/("""}"""),format.raw/*75.6*/(""")


	$('.rating_star').change(function()"""),format.raw/*78.37*/("""{"""),format.raw/*78.38*/(""" 
		var tmp1 = document.getElementById("rating_hidden");
		tmp1.value = this.value;   
		$('.choice').text( this.value + ' stars' );  
	"""),format.raw/*82.2*/("""}"""),format.raw/*82.3*/(""")
	
	
	$('#auto_services').change(function()"""),format.raw/*85.39*/("""{"""),format.raw/*85.40*/(""" 
		console.log("inside service")
		var tmp1 = document.getElementById("hidden_tags");
		var arr = this.value.split(",");
		var tagEntered = [];
		for (i=0;i<arr.length;i++) """),format.raw/*90.30*/("""{"""),format.raw/*90.31*/("""
			// console.log(arr[i]);
			// console.log("before");
			var result = getFields(newList, "name",arr[i]);
			tagEntered.push(result);
			// console.log(result);
			// console.log(newList)
		"""),format.raw/*97.3*/("""}"""),format.raw/*97.4*/("""
		tmp1.value = tagEntered.toString();
		console.log("--------")
		 console.log(this.value)
	"""),format.raw/*101.2*/("""}"""),format.raw/*101.3*/(""")


	


	var friends = [
	'friends1','friends2'
	];


		// console.log(services);
		$('#mentionServices_id').autocomplete("""),format.raw/*113.41*/("""{"""),format.raw/*113.42*/("""
			source: services
		"""),format.raw/*115.3*/("""}"""),format.raw/*115.4*/(""");

		// $('#comment_autocomplete').autocomplete("""),format.raw/*117.46*/("""{"""),format.raw/*117.47*/("""
		// 	source: services
		// """),format.raw/*119.6*/("""}"""),format.raw/*119.7*/(""");


// $('#comment_autocomplete').keydown(function(e)"""),format.raw/*122.50*/("""{"""),format.raw/*122.51*/("""
// 	commentBox = document.getElementById("comment_autocomplete");
// 	if (e.keyCode==50&&e.shiftKey) """),format.raw/*124.36*/("""{"""),format.raw/*124.37*/("""
// 				// var dropdownList1 = document.createElement("select");
// 				// for (i=0;i<services.length;i++)"""),format.raw/*126.42*/("""{"""),format.raw/*126.43*/("""
// 				// 	var op = new Option();
// 				// 	op.value = i;
// 				// 	op.text = services[i];
// 				// 	dropdownList1.options.add(op);
// 				// """),format.raw/*131.11*/("""}"""),format.raw/*131.12*/("""
// 				// commentBox.appendChild(dropdownList1);
// 				$(this).autocomplete("""),format.raw/*133.29*/("""{"""),format.raw/*133.30*/("""
// 					source: services
// 				"""),format.raw/*135.8*/("""}"""),format.raw/*135.9*/(""");
// 				// document.addChild(dropdownList1);
// 			"""),format.raw/*137.7*/("""}"""),format.raw/*137.8*/("""
// 		"""),format.raw/*138.6*/("""}"""),format.raw/*138.7*/(""");

// $("#comment_autocomplete").bind("keydown keypress", function() """),format.raw/*140.67*/("""{"""),format.raw/*140.68*/("""
// 	curCursorPos = $(this).caret();
// """),format.raw/*142.4*/("""}"""),format.raw/*142.5*/(""");


$('#mentionFriends_id').autocomplete("""),format.raw/*145.38*/("""{"""),format.raw/*145.39*/("""
	source: friends
"""),format.raw/*147.1*/("""}"""),format.raw/*147.2*/(""");


$(function()"""),format.raw/*150.13*/("""{"""),format.raw/*150.14*/("""
	getData();
	getAllUser();
	// console.log(services);
	tagsList = ["funny service","boring service","2-D","3-D","heat service","map service"];
		for (i=0;i<tagsList.length;i++)"""),format.raw/*155.34*/("""{"""),format.raw/*155.35*/("""
		if (tagsList[i])"""),format.raw/*156.19*/("""{"""),format.raw/*156.20*/("""
			newList.push("""),format.raw/*157.17*/("""{"""),format.raw/*157.18*/("""
				id: i,
				name: tagsList[i]
			"""),format.raw/*160.4*/("""}"""),format.raw/*160.5*/(""");
		"""),format.raw/*161.3*/("""}"""),format.raw/*161.4*/("""
"""),format.raw/*162.1*/("""}"""),format.raw/*162.2*/("""
$('#auto_services').tokenInput(newList,"""),format.raw/*163.40*/("""{"""),format.raw/*163.41*/(""" 

	theme: "facebook",
	noResultsText: "Nothin' found.",
	preventDuplicates: true
"""),format.raw/*168.1*/("""}"""),format.raw/*168.2*/("""); 


$(function()"""),format.raw/*171.13*/("""{"""),format.raw/*171.14*/("""
	$.fn.atwho.debug = true
	var emojis = [
	"smile", "iphone", "girl", "smiley", "heart", "kiss", "copyright", "coffee",
	"a", "ab", "airplane", "alien", "ambulance", "angel", "anger", "angry",
	"arrow_forward", "arrow_left", "arrow_lower_left", "arrow_lower_right",
	"arrow_right", "arrow_up", "arrow_upper_left", "arrow_upper_right",
	"art", "astonished", "atm", "b", "baby", "baby_chick", "baby_symbol",
	"balloon", "bamboo", "bank", "barber", "baseball", "basketball", "bath",
	"bear", "beer", "beers", "beginner", "bell", "bento", "bike", "bikini",
	"bird", "birthday", "black_square", "blue_car", "blue_heart", "blush",
	"boar", "boat", "bomb", "book", "boot", "bouquet", "bow", "bowtie",
	"boy", "bread", "briefcase", "broken_heart", "bug", "bulb",
	"person_with_blond_hair", "phone", "pig", "pill", "pisces", "plus1",
	"point_down", "point_left", "point_right", "point_up", "point_up_2",
	"police_car", "poop", "post_office", "postbox", "pray", "princess",
	"punch", "purple_heart", "question", "rabbit", "racehorse", "radio",
	"up", "us", "v", "vhs", "vibration_mode", "virgo", "vs", "walking",
	"warning", "watermelon", "wave", "wc", "wedding", "whale", "wheelchair",
	"white_square", "wind_chime", "wink", "wink2", "wolf", "woman",
	"womans_hat", "womens", "x", "yellow_heart", "zap", "zzz", "+1",
	"-1"
	]
    // var jeremy = decodeURI("J%C3%A9r%C3%A9my") // Jérémy
    // var names = ["name1","name2"];

    names = $.map(names,function(value,i) """),format.raw/*197.43*/("""{"""),format.raw/*197.44*/("""
    	return """),format.raw/*198.13*/("""{"""),format.raw/*198.14*/("""'id':i,'name':value,'email':value+"@gmail.com""""),format.raw/*198.61*/("""}"""),format.raw/*198.62*/(""";
    """),format.raw/*199.5*/("""}"""),format.raw/*199.6*/(""");


    // var services = ["services1", "service2"];
    services = $.map(services,function(value,i) """),format.raw/*203.49*/("""{"""),format.raw/*203.50*/("""
    	return """),format.raw/*204.13*/("""{"""),format.raw/*204.14*/("""'name':value,'url':value+"...url""""),format.raw/*204.47*/("""}"""),format.raw/*204.48*/(""";
    """),format.raw/*205.5*/("""}"""),format.raw/*205.6*/(""");

    var emojis = $.map(emojis, function(value, i) """),format.raw/*207.51*/("""{"""),format.raw/*207.52*/("""return """),format.raw/*207.59*/("""{"""),format.raw/*207.60*/("""key: value, name:value"""),format.raw/*207.82*/("""}"""),format.raw/*207.83*/("""}"""),format.raw/*207.84*/(""");

    var at_config = """),format.raw/*209.21*/("""{"""),format.raw/*209.22*/("""
    	at: "@",
    	data: names,
    	insertTpl: "@$"""),format.raw/*212.21*/("""{"""),format.raw/*212.22*/("""name"""),format.raw/*212.26*/("""}"""),format.raw/*212.27*/("""",
    	displayTpl: "<li>$"""),format.raw/*213.24*/("""{"""),format.raw/*213.25*/("""name"""),format.raw/*213.29*/("""}"""),format.raw/*213.30*/(""" <small>$"""),format.raw/*213.39*/("""{"""),format.raw/*213.40*/("""email"""),format.raw/*213.45*/("""}"""),format.raw/*213.46*/("""</small></li>",
    	limit: 200
    """),format.raw/*215.5*/("""}"""),format.raw/*215.6*/("""

    var hash_config = """),format.raw/*217.23*/("""{"""),format.raw/*217.24*/("""
    	at: "#",
    	data: services,
    	insertTpl: "#$"""),format.raw/*220.20*/("""{"""),format.raw/*220.21*/("""name"""),format.raw/*220.25*/("""}"""),format.raw/*220.26*/("""",
    	displayTpl: "<li>$"""),format.raw/*221.24*/("""{"""),format.raw/*221.25*/("""name"""),format.raw/*221.29*/("""}"""),format.raw/*221.30*/(""" <small>$"""),format.raw/*221.39*/("""{"""),format.raw/*221.40*/("""url"""),format.raw/*221.43*/("""}"""),format.raw/*221.44*/("""</small></li>",
    	limit: 300
    """),format.raw/*223.5*/("""}"""),format.raw/*223.6*/("""

    var emoji_config = """),format.raw/*225.24*/("""{"""),format.raw/*225.25*/("""
    	at: ":",
    	data: emojis,
    	displayTpl: "<li>$"""),format.raw/*228.24*/("""{"""),format.raw/*228.25*/("""name"""),format.raw/*228.29*/("""}"""),format.raw/*228.30*/(""" <img src='https://assets-cdn.github.com/images/icons/emoji/$"""),format.raw/*228.91*/("""{"""),format.raw/*228.92*/("""key"""),format.raw/*228.95*/("""}"""),format.raw/*228.96*/(""".png'  height='20' width='20' /></li>",
    	insertTpl: ':$"""),format.raw/*229.20*/("""{"""),format.raw/*229.21*/("""key"""),format.raw/*229.24*/("""}"""),format.raw/*229.25*/(""":',
    	delay: 400
    """),format.raw/*231.5*/("""}"""),format.raw/*231.6*/("""
    $inputor = $('#comment_autocomplete').atwho(at_config).atwho(hash_config).atwho(emoji_config);
    $inputor.caret('pos', 100);
    $inputor.focus().atwho('run');

    emoji_config.insertTpl = "<img src='https://assets-cdn.github.com/images/icons/emoji/$"""),format.raw/*236.91*/("""{"""),format.raw/*236.92*/("""name"""),format.raw/*236.96*/("""}"""),format.raw/*236.97*/(""".png'  height='20' width='20' />"
    $('#editable').atwho(at_config).atwho(emoji_config);

  //   ifr = $('#iframe1')[0]
  //   doc = ifr.contentDocument || iframe.contentWindow.document
  //   if ((ifrBody = doc.body) == null) """),format.raw/*241.42*/("""{"""),format.raw/*241.43*/("""
  //     // For IE
  //     doc.write("<body></body>")
  //     ifrBody = doc.body
  // """),format.raw/*245.6*/("""}"""),format.raw/*245.7*/("""
  // ifrBody.contentEditable = true
  // ifrBody.id = 'ifrBody'
  // ifrBody.innerHTML = 'For <strong>WYSIWYG</strong> which using <strong>iframe</strong> such as <strong>ckeditor</strong>'
  // $(ifrBody).atwho('setIframe', ifr).atwho(at_config)
"""),format.raw/*250.1*/("""}"""),format.raw/*250.2*/(""");




"""),format.raw/*255.1*/("""}"""),format.raw/*255.2*/(""");




"""),format.raw/*260.1*/("""}"""),format.raw/*260.2*/(""");

function getData() """),format.raw/*262.20*/("""{"""),format.raw/*262.21*/("""
	$.ajax("""),format.raw/*263.9*/("""{"""),format.raw/*263.10*/("""
		type: 'Get',
		dataType: 'text',
		url: '/climate/mentionServices',
		async: false,
		success: function(data)"""),format.raw/*268.26*/("""{"""),format.raw/*268.27*/("""
						// alert("return from ajax"+data+"lol");
						// console.log(typeof data);
						console.log("inside get data" + services);
						handleData(data);
					"""),format.raw/*273.6*/("""}"""),format.raw/*273.7*/("""
				"""),format.raw/*274.5*/("""}"""),format.raw/*274.6*/(""")
"""),format.raw/*275.1*/("""}"""),format.raw/*275.2*/("""





function getAllUser() """),format.raw/*281.23*/("""{"""),format.raw/*281.24*/("""
	$.ajax("""),format.raw/*282.9*/("""{"""),format.raw/*282.10*/("""
		type: 'Get',
		dataType: 'text',
		url: '/climate/mentionUsers',
		async: false,
		success: function(data)"""),format.raw/*287.26*/("""{"""),format.raw/*287.27*/("""
						// alert("return from ajax"+data+"lol");
						// console.log(typeof data);
						console.log("inside get all user" + data);
						handleAllUser(data);
					"""),format.raw/*292.6*/("""}"""),format.raw/*292.7*/("""
				"""),format.raw/*293.5*/("""}"""),format.raw/*293.6*/(""")
"""),format.raw/*294.1*/("""}"""),format.raw/*294.2*/("""


function handleData(data)"""),format.raw/*297.26*/("""{"""),format.raw/*297.27*/("""
		// console.log("handle data "+ data);
		newService = data;
		var arr = data.split("+");

		for (i=0;i<arr.length;i++)"""),format.raw/*302.29*/("""{"""),format.raw/*302.30*/("""
			if (arr[i])"""),format.raw/*303.15*/("""{"""),format.raw/*303.16*/("""
				services.push(arr[i]);
			"""),format.raw/*305.4*/("""}"""),format.raw/*305.5*/("""
		"""),format.raw/*306.3*/("""}"""),format.raw/*306.4*/("""
"""),format.raw/*307.1*/("""}"""),format.raw/*307.2*/("""




function handleAllUser(data)"""),format.raw/*312.29*/("""{"""),format.raw/*312.30*/("""
		
		newUser = data;
		var arr = data.split("+");

		for (i=0;i<arr.length;i++)"""),format.raw/*317.29*/("""{"""),format.raw/*317.30*/("""
			if (arr[i])"""),format.raw/*318.15*/("""{"""),format.raw/*318.16*/("""
				names.push(arr[i]);
			"""),format.raw/*320.4*/("""}"""),format.raw/*320.5*/("""
		"""),format.raw/*321.3*/("""}"""),format.raw/*321.4*/("""
	"""),format.raw/*322.2*/("""}"""),format.raw/*322.3*/("""


	function resizeIframe(obj) """),format.raw/*325.29*/("""{"""),format.raw/*325.30*/("""
		obj.style.height = obj.contentWindow.document.body.scrollHeight + 'px';
	"""),format.raw/*327.2*/("""}"""),format.raw/*327.3*/("""


// 	$(function()"""),format.raw/*330.17*/("""{"""),format.raw/*330.18*/("""
// 		getData();
// 		console.log(services);

// 		var newList = [];
// 		for (i=0;i<services.length;i++)"""),format.raw/*335.37*/("""{"""),format.raw/*335.38*/("""
// 			newList.push("""),format.raw/*336.20*/("""{"""),format.raw/*336.21*/("""
// 				id: i,
// 				name: services[i]
// 			"""),format.raw/*339.7*/("""}"""),format.raw/*339.8*/(""");
// 		"""),format.raw/*340.6*/("""}"""),format.raw/*340.7*/("""
//   $('#auto_services').tokenInput(newList,"""),format.raw/*341.45*/("""{"""),format.raw/*341.46*/(""" 

//       theme: "facebook",
//       noResultsText: "Nothin' found.",
//       preventDuplicates: true
//   """),format.raw/*346.6*/("""}"""),format.raw/*346.7*/("""); 

// """),format.raw/*348.4*/("""}"""),format.raw/*348.5*/(""");







</script>
""")))};
Seq[Any](format.raw/*18.318*/(""" 

"""),format.raw/*21.1*/("""
"""),format.raw/*357.2*/("""

<style type="text/css">
	html, body """),format.raw/*360.13*/("""{"""),format.raw/*360.14*/("""
		background:#F9F9F9;
		padding: 0;
		margin: 0;
		font: 14px/1.6 "Lucida Grande", "Helvetica", sans-serif;
		color: #333;
	"""),format.raw/*366.2*/("""}"""),format.raw/*366.3*/("""


	h1,h2,h3,h4 """),format.raw/*369.14*/("""{"""),format.raw/*369.15*/("""
		font-family: 'PT Sans', sans-serif;
		line-height: 40px;
		color: inherit;
		font-weight: bold;
		margin: 10px 0;
		text-rendering: optimizelegibility;
	"""),format.raw/*376.2*/("""}"""),format.raw/*376.3*/("""
	h2,h3 """),format.raw/*377.8*/("""{"""),format.raw/*377.9*/("""
		color: gray;
	"""),format.raw/*379.2*/("""}"""),format.raw/*379.3*/("""
	strong """),format.raw/*380.9*/("""{"""),format.raw/*380.10*/("""
		color: #424242;
	"""),format.raw/*382.2*/("""}"""),format.raw/*382.3*/("""

	a """),format.raw/*384.4*/("""{"""),format.raw/*384.5*/("""
		color: #4183C4;
		text-decoration: none;
	"""),format.raw/*387.2*/("""}"""),format.raw/*387.3*/("""
	a:hover """),format.raw/*388.10*/("""{"""),format.raw/*388.11*/("""
		text-decoration: underline;
	"""),format.raw/*390.2*/("""}"""),format.raw/*390.3*/("""
	.wrapper """),format.raw/*391.11*/("""{"""),format.raw/*391.12*/("""
		width: 750px;
		padding: 20px;
		margin: 0 auto;
	"""),format.raw/*395.2*/("""}"""),format.raw/*395.3*/("""
	header """),format.raw/*396.9*/("""{"""),format.raw/*396.10*/("""
		margin-top:70px;
		margin-bottom: 50px;
	"""),format.raw/*399.2*/("""}"""),format.raw/*399.3*/("""
	header h1 """),format.raw/*400.12*/("""{"""),format.raw/*400.13*/("""
		text-align: center;
		font-size: 75px;
	"""),format.raw/*403.2*/("""}"""),format.raw/*403.3*/("""
	h1 i """),format.raw/*404.7*/("""{"""),format.raw/*404.8*/("""
		color: rgb(182, 180, 180);
		font-style: normal;
		font-weight: normal;
	"""),format.raw/*408.2*/("""}"""),format.raw/*408.3*/("""

	.inputor """),format.raw/*410.11*/("""{"""),format.raw/*410.12*/("""
		height: 160px;
		width: 90%;
		border: 1px solid #dadada;
		border-radius: 4px;
		padding: 5px 8px;
		outline: 0 none;
		margin: 10px 0;
		background: white;
		font-size: inherit;
		overflow-y: scroll;
	"""),format.raw/*421.2*/("""}"""),format.raw/*421.3*/("""
	.inputor:focus """),format.raw/*422.17*/("""{"""),format.raw/*422.18*/("""
		border: 1px solid rgb(6, 150, 247);
	"""),format.raw/*424.2*/("""}"""),format.raw/*424.3*/("""

	ul.doc """),format.raw/*426.9*/("""{"""),format.raw/*426.10*/("""
		list-style:none;
	"""),format.raw/*428.2*/("""}"""),format.raw/*428.3*/("""
	ul.doc li """),format.raw/*429.12*/("""{"""),format.raw/*429.13*/("""
		display:inline-block;
		margin: 0 10px;
	"""),format.raw/*432.2*/("""}"""),format.raw/*432.3*/("""

	footer """),format.raw/*434.9*/("""{"""),format.raw/*434.10*/("""
		margin: 30px 0;
	"""),format.raw/*436.2*/("""}"""),format.raw/*436.3*/("""

	.github """),format.raw/*438.10*/("""{"""),format.raw/*438.11*/("""
		text-align: center;
	"""),format.raw/*440.2*/("""}"""),format.raw/*440.3*/("""

</style>

<input style="margin-top:200px" type="hidden" value="hidden_value">
<!-- Mention Friend  <input type="text" name="mentionFriends" id="mentionFriends_id"/></br>
Meantion Service  <input type="text" name="mentionServices" id="mentionServices_id"/>
 -->

<!-- """),_display_(Seq[Any](/*449.7*/for(climateService <- AllClimateServices) yield /*449.48*/{_display_(Seq[Any](format.raw/*449.49*/("""
<p><font size="3">"""),_display_(Seq[Any](/*450.20*/climateService/*450.34*/.getClimateServiceName())),format.raw/*450.58*/("""</font></p>
""")))})),format.raw/*451.2*/(""" -->

"""),_display_(Seq[Any](/*453.2*/main("Service", scripts)/*453.26*/ {_display_(Seq[Any](format.raw/*453.28*/("""

<table class="table table-striped table-bordered table-condensed ex2 tablesorter" id = "csTable">
	<thead>
		<tr>
			<th class="col-md-4">Url</td>
				<th class="col-md-2">Version Number</td>
				</tr>
			</thead>
			"""),_display_(Seq[Any](/*462.5*/for(climateService <- climateServices) yield /*462.43*/{_display_(Seq[Any](format.raw/*462.44*/("""
			<tr>
				<td><a href = """"),_display_(Seq[Any](/*464.21*/{routes.ClimateServiceController.oneService(climateService.getUrl())})),format.raw/*464.90*/(""""><font size="2">"""),_display_(Seq[Any](/*464.108*/climateService/*464.122*/.getUrl())),format.raw/*464.131*/("""</a></font></td>
				<td><font size="2">"""),_display_(Seq[Any](/*465.25*/climateService/*465.39*/.getVersion())),format.raw/*465.52*/("""</font></td>
			</tr>
		""")))})),format.raw/*467.4*/("""
	</table>

	<iframe id="iframe" width="100%" height="800px" src=""""),_display_(Seq[Any](/*470.56*/url)),format.raw/*470.59*/("""" frameborder="0" >
	</iframe>

	
	

	





	<table class="table table-striped table-bordered table-condensed ex2 tablesorter" id = "cmTable">
		<thead>
			<tr>
				<th class="col-md-4">Comment</td>
					<th class="col-md-2">User</td>
						<th class="col-md-2">Date</td>	
						<th class="col-md-2">Tags</td>	
						</tr>
					</thead>
					"""),_display_(Seq[Any](/*491.7*/for(comment <- comments) yield /*491.31*/{_display_(Seq[Any](format.raw/*491.32*/("""
					<tr>
						<td><font size="3">"""),_display_(Seq[Any](/*493.27*/comment/*493.34*/.getContent())),format.raw/*493.47*/("""</font></td>
						<td><font size="3">"""),_display_(Seq[Any](/*494.27*/comment/*494.34*/.getCommenter())),format.raw/*494.49*/("""</font></td>
						<td><font size="3">"""),_display_(Seq[Any](/*495.27*/comment/*495.34*/.getTime())),format.raw/*495.44*/("""</font></td>
						<td><font size="3">"""),_display_(Seq[Any](/*496.27*/comment/*496.34*/.getTagList())),format.raw/*496.47*/("""</font></td>
					</tr>
				""")))})),format.raw/*498.6*/("""
			</table>


			"""),_display_(Seq[Any](/*502.5*/form(routes.CommentController.addComment(session.get("email"),serviceId))/*502.78*/ {_display_(Seq[Any](format.raw/*502.80*/("""
			<table width="400">
				<h2>Add a comment</h2>
				<br>
				<div class = "form-group">
					"""),_display_(Seq[Any](/*507.7*/textarea(field = commentForm("Content"), args = 'rows -> 5, 'cols -> 40, 'class -> "form-control", 'placeholder -> "Please type in your comment",'id -> "comment_autocomplete"))),format.raw/*507.182*/("""
				    """),_display_(Seq[Any](/*508.10*/inputText(
								commentForm("hidden_tags"),
								'id -> "hidden_tags",
								'placeholder-> "hidden tag here",
								'_label -> "",
								'type -> "hidden"
								))),format.raw/*514.10*/("""
				</div>

				<div id="searchbar">
					<h4>Adding tags</h4>
					<input type="text" id="auto_services" name="auto_services">
				</div>

				<!-- <div id="searchbar">
					<p>Include friends</p>
					<input type="text" id="auto_friends" name="auto_friends">
				</div> -->
				<div align="center" style="margin-top:50px">
					<input class="btn" type="submit" value="Submit">
				</div>

				<!-- <div class="inputor" style="overflow: hidden">
					<iframe src="" id="iframe1" style="width: 100%; height: 100%; border: 0px;"></iframe>
				</div> -->

			</table>
		""")))})),format.raw/*535.4*/("""



		

        


		"""),_display_(Seq[Any](/*544.4*/form(routes.UserController.addRatingNew(url,serviceName,serviceId,session.get("email")))/*544.92*/{_display_(Seq[Any](format.raw/*544.93*/("""
		<h2 style="margin-top:100px">Add a Rating  &  Like Our Service</h2>
		<div class="container-fluid">
			<div class="row">  
				<div class="col-md-4">
				</div>
				<div class="col-md-4">
					<table>
						<tr>
							<span class="star-rating">
								<input class="rating_star" type="radio" name="rating" value="1"><i></i>
								<input class="rating_star" type="radio" name="rating" value="2"><i></i>
								<input class="rating_star" type="radio" name="rating" value="3"><i></i>
								<input class="rating_star" type="radio" name="rating" value="4"><i></i>
								<input class="rating_star" type="radio" name="rating" value="5"><i></i>
								<!-- <input type="hidden" name="user_rating" id="rating_hidden"> -->
								"""),_display_(Seq[Any](/*560.10*/inputText(
								ratingForm("ratingNum"),
								'id -> "rating_hidden",
								'placeholder-> "rating here",
								'_label -> "Rating"
								))),format.raw/*565.10*/("""
								"""),_display_(Seq[Any](/*566.10*/inputText(
								ratingForm("inputLike"),
								'id -> "inputLikeVar",
								'placeholder-> "like here",
								'_label -> "like"
								))),format.raw/*571.10*/("""


							</span>

						</tr>
					</table>
				</div>
				<div class="col-md-4">
					<button id="like_button" type="button" style="border:none;background-color: Transparent">
						<img src='"""),_display_(Seq[Any](/*581.18*/routes/*581.24*/.Assets.at("images/like.png"))),format.raw/*581.53*/("""'/>
					</button><likeButton></likeButton> 
				</div>
			</div>
			<div align="center" style="margin-top:50px">
				<input class="btn" type="submit" value="Rate">
			</div>
		""")))})),format.raw/*588.4*/("""


		<div class="container" style="height:100vh; background-size: 100%;">
            <br>
            <h2>User Like This Service Also Like:</h2>
            <br>
            <table class="table table-striped table-bordered table-condensed ex2 tablesorter" id = "cmTable">
            <thead>
                <tr>
                    <th class="col-md-2">Climate Service Name</td>
					<th class="col-md-4">Purpose</td>					
					<th class="col-md-2">Average Rating</td>
					<th class="col-md-2"># of Votes</td>
                </tr>
            </thead>
                <!-- """),_display_(Seq[Any](/*604.23*/for(service <- recommendServices) yield /*604.56*/{_display_(Seq[Any](format.raw/*604.57*/("""
                    <tr>
                    <td><a href = """"),_display_(Seq[Any](/*606.37*/{routes.ClimateServiceController.oneService(service.getUrl())})),format.raw/*606.99*/(""""><font size="2">"""),_display_(Seq[Any](/*606.117*/service/*606.124*/.getUrl())),format.raw/*606.133*/("""</a></font></td>
                    </tr>
                """)))})),format.raw/*608.18*/(""" -->


                """),_display_(Seq[Any](/*611.18*/for(service <- recommendServices) yield /*611.51*/{_display_(Seq[Any](format.raw/*611.52*/("""
						<tr>
							<td><a href = """"),_display_(Seq[Any](/*613.24*/{routes.ClimateServiceController.oneServiceNew(service.getUrl(),service.getClimateServiceName(),service.getId())})),format.raw/*613.137*/(""""><font size="3">"""),_display_(Seq[Any](/*613.155*/service/*613.162*/.getClimateServiceName())),format.raw/*613.186*/("""</a></font></td>

							<td><span class=""""),_display_(Seq[Any](/*615.26*/service/*615.33*/.getClimateServiceName())),format.raw/*615.57*/(""" editable"  data-name='purpose'><font size="3">
								"""),_display_(Seq[Any](/*616.10*/service/*616.17*/.getPurpose())),format.raw/*616.30*/(""" </font></span></td>
									<td style="color:red"><font size="3">"""),_display_(Seq[Any](/*617.48*/service/*617.55*/.getAvgScore())),format.raw/*617.69*/("""<font size="3"></td><td><font size="3">"""),_display_(Seq[Any](/*617.109*/service/*617.116*/.getVoteCount())),format.raw/*617.131*/("""<font size="3"></td>	
								</tr>
							""")))})),format.raw/*619.9*/("""
           </table>
    </div>




		
	""")))})),format.raw/*627.3*/("""
"""))}
    }
    
    def render(url:String,serviceName:String,serviceId:String,ratingForm:play.data.Form[Rating],commentForm:play.data.Form[Comment],comments:List[Comment],climateServices:List[metadata.ClimateService],AllClimateServices:List[metadata.ClimateService],myLike:String,recommendServices:List[metadata.ClimateService]): play.api.templates.HtmlFormat.Appendable = apply(url,serviceName,serviceId,ratingForm,commentForm,comments,climateServices,AllClimateServices,myLike,recommendServices)
    
    def f:((String,String,String,play.data.Form[Rating],play.data.Form[Comment],List[Comment],List[metadata.ClimateService],List[metadata.ClimateService],String,List[metadata.ClimateService]) => play.api.templates.HtmlFormat.Appendable) = (url,serviceName,serviceId,ratingForm,commentForm,comments,climateServices,AllClimateServices,myLike,recommendServices) => apply(url,serviceName,serviceId,ratingForm,commentForm,comments,climateServices,AllClimateServices,myLike,recommendServices)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 17 21:24:33 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015-Team1/ApacheCMDA-Frontend/app/views/climate/oneServiceNew.scala.html
                    HASH: bbb7bfe5fbf14a9279e19ccb39d288eb67a4d559
                    MATRIX: 3328->1190|3739->1529|3754->1536|3839->1540|3978->1643|4006->1649|4081->1696|4110->1697|4319->1878|4348->1879|4438->1942|4466->1943|4523->1972|4552->1973|4604->1997|4633->1998|4844->2182|4872->2183|4928->2211|4957->2212|5185->2413|5213->2414|5243->2417|5271->2418|5336->2455|5365->2456|5418->2481|5447->2482|5676->2684|5704->2685|5759->2712|5788->2713|6034->2932|6062->2933|6096->2939|6125->2940|6220->3008|6248->3009|6286->3020|6314->3021|6382->3061|6411->3062|6574->3198|6602->3199|6674->3243|6703->3244|6905->3418|6934->3419|7153->3611|7181->3612|7302->3705|7331->3706|7482->3828|7512->3829|7563->3852|7592->3853|7670->3902|7700->3903|7757->3932|7786->3933|7869->3987|7899->3988|8030->4090|8060->4091|8195->4197|8225->4198|8400->4344|8430->4345|8537->4423|8567->4424|8628->4457|8657->4458|8738->4511|8767->4512|8801->4518|8830->4519|8929->4589|8959->4590|9027->4630|9056->4631|9127->4673|9157->4674|9203->4692|9232->4693|9278->4710|9308->4711|9514->4888|9544->4889|9592->4908|9622->4909|9668->4926|9698->4927|9763->4964|9792->4965|9825->4970|9854->4971|9883->4972|9912->4973|9981->5013|10011->5014|10121->5096|10150->5097|10197->5115|10227->5116|11714->6574|11744->6575|11786->6588|11816->6589|11891->6636|11921->6637|11955->6643|11984->6644|12115->6746|12145->6747|12187->6760|12217->6761|12279->6794|12309->6795|12343->6801|12372->6802|12455->6856|12485->6857|12521->6864|12551->6865|12602->6887|12632->6888|12662->6889|12715->6913|12745->6914|12826->6968|12856->6969|12889->6973|12919->6974|12974->7000|13004->7001|13037->7005|13067->7006|13105->7015|13135->7016|13169->7021|13199->7022|13263->7058|13292->7059|13345->7083|13375->7084|13459->7139|13489->7140|13522->7144|13552->7145|13607->7171|13637->7172|13670->7176|13700->7177|13738->7186|13768->7187|13800->7190|13830->7191|13894->7227|13923->7228|13977->7253|14007->7254|14093->7311|14123->7312|14156->7316|14186->7317|14276->7378|14306->7379|14338->7382|14368->7383|14456->7442|14486->7443|14518->7446|14548->7447|14600->7471|14629->7472|14916->7730|14946->7731|14979->7735|15009->7736|15267->7965|15297->7966|15414->8055|15443->8056|15719->8304|15748->8305|15783->8312|15812->8313|15847->8320|15876->8321|15928->8344|15958->8345|15995->8354|16025->8355|16166->8467|16196->8468|16385->8629|16414->8630|16447->8635|16476->8636|16506->8638|16535->8639|16592->8667|16622->8668|16659->8677|16689->8678|16827->8787|16857->8788|17049->8952|17078->8953|17111->8958|17140->8959|17170->8961|17199->8962|17256->8990|17286->8991|17435->9111|17465->9112|17509->9127|17539->9128|17598->9159|17627->9160|17658->9163|17687->9164|17716->9165|17745->9166|17807->9199|17837->9200|17946->9280|17976->9281|18020->9296|18050->9297|18106->9325|18135->9326|18166->9329|18195->9330|18225->9332|18254->9333|18314->9364|18344->9365|18448->9441|18477->9442|18525->9461|18555->9462|18689->9567|18719->9568|18768->9588|18798->9589|18872->9635|18901->9636|18937->9644|18966->9645|19040->9690|19070->9691|19209->9802|19238->9803|19274->9811|19303->9812|19365->1506|19395->1527|19424->9833|19491->9871|19521->9872|19674->9997|19703->9998|19748->10014|19778->10015|19962->10171|19991->10172|20027->10180|20056->10181|20101->10198|20130->10199|20167->10208|20197->10209|20245->10229|20274->10230|20307->10235|20336->10236|20409->10281|20438->10282|20477->10292|20507->10293|20567->10325|20596->10326|20636->10337|20666->10338|20747->10391|20776->10392|20813->10401|20843->10402|20915->10446|20944->10447|20985->10459|21015->10460|21086->10503|21115->10504|21150->10511|21179->10512|21283->10588|21312->10589|21353->10601|21383->10602|21617->10808|21646->10809|21692->10826|21722->10827|21790->10867|21819->10868|21857->10878|21887->10879|21936->10900|21965->10901|22006->10913|22036->10914|22108->10958|22137->10959|22175->10969|22205->10970|22253->10990|22282->10991|22322->11002|22352->11003|22404->11027|22433->11028|22739->11298|22797->11339|22837->11340|22894->11360|22918->11374|22965->11398|23010->11411|23053->11418|23087->11442|23128->11444|23384->11664|23439->11702|23479->11703|23545->11732|23637->11801|23693->11819|23718->11833|23751->11842|23829->11883|23853->11897|23889->11910|23946->11935|24050->12002|24076->12005|24455->12348|24496->12372|24536->12373|24610->12410|24627->12417|24663->12430|24739->12469|24756->12476|24794->12491|24870->12530|24887->12537|24920->12547|24996->12586|25013->12593|25049->12606|25110->12635|25165->12654|25248->12727|25289->12729|25422->12826|25621->13001|25668->13011|25868->13188|26470->13758|26528->13780|26626->13868|26666->13869|27438->14604|27612->14755|27659->14765|27828->14911|28060->15106|28076->15112|28128->15141|28338->15319|28953->15897|29003->15930|29043->15931|29142->15993|29227->16055|29283->16073|29301->16080|29334->16089|29427->16149|29488->16173|29538->16206|29578->16207|29650->16242|29787->16355|29843->16373|29861->16380|29909->16404|29989->16447|30006->16454|30053->16478|30147->16535|30164->16542|30200->16555|30305->16623|30322->16630|30359->16644|30437->16684|30455->16691|30494->16706|30570->16750|30643->16791
                    LINES: 56->18|59->22|59->22|61->22|68->29|68->29|70->31|70->31|77->38|77->38|80->41|80->41|83->44|83->44|84->45|84->45|89->50|89->50|89->50|89->50|94->55|94->55|95->56|95->56|97->58|97->58|98->59|98->59|104->65|104->65|104->65|104->65|110->71|110->71|110->71|110->71|112->73|112->73|114->75|114->75|117->78|117->78|121->82|121->82|124->85|124->85|129->90|129->90|136->97|136->97|140->101|140->101|152->113|152->113|154->115|154->115|156->117|156->117|158->119|158->119|161->122|161->122|163->124|163->124|165->126|165->126|170->131|170->131|172->133|172->133|174->135|174->135|176->137|176->137|177->138|177->138|179->140|179->140|181->142|181->142|184->145|184->145|186->147|186->147|189->150|189->150|194->155|194->155|195->156|195->156|196->157|196->157|199->160|199->160|200->161|200->161|201->162|201->162|202->163|202->163|207->168|207->168|210->171|210->171|236->197|236->197|237->198|237->198|237->198|237->198|238->199|238->199|242->203|242->203|243->204|243->204|243->204|243->204|244->205|244->205|246->207|246->207|246->207|246->207|246->207|246->207|246->207|248->209|248->209|251->212|251->212|251->212|251->212|252->213|252->213|252->213|252->213|252->213|252->213|252->213|252->213|254->215|254->215|256->217|256->217|259->220|259->220|259->220|259->220|260->221|260->221|260->221|260->221|260->221|260->221|260->221|260->221|262->223|262->223|264->225|264->225|267->228|267->228|267->228|267->228|267->228|267->228|267->228|267->228|268->229|268->229|268->229|268->229|270->231|270->231|275->236|275->236|275->236|275->236|280->241|280->241|284->245|284->245|289->250|289->250|294->255|294->255|299->260|299->260|301->262|301->262|302->263|302->263|307->268|307->268|312->273|312->273|313->274|313->274|314->275|314->275|320->281|320->281|321->282|321->282|326->287|326->287|331->292|331->292|332->293|332->293|333->294|333->294|336->297|336->297|341->302|341->302|342->303|342->303|344->305|344->305|345->306|345->306|346->307|346->307|351->312|351->312|356->317|356->317|357->318|357->318|359->320|359->320|360->321|360->321|361->322|361->322|364->325|364->325|366->327|366->327|369->330|369->330|374->335|374->335|375->336|375->336|378->339|378->339|379->340|379->340|380->341|380->341|385->346|385->346|387->348|387->348|397->18|399->21|400->357|403->360|403->360|409->366|409->366|412->369|412->369|419->376|419->376|420->377|420->377|422->379|422->379|423->380|423->380|425->382|425->382|427->384|427->384|430->387|430->387|431->388|431->388|433->390|433->390|434->391|434->391|438->395|438->395|439->396|439->396|442->399|442->399|443->400|443->400|446->403|446->403|447->404|447->404|451->408|451->408|453->410|453->410|464->421|464->421|465->422|465->422|467->424|467->424|469->426|469->426|471->428|471->428|472->429|472->429|475->432|475->432|477->434|477->434|479->436|479->436|481->438|481->438|483->440|483->440|492->449|492->449|492->449|493->450|493->450|493->450|494->451|496->453|496->453|496->453|505->462|505->462|505->462|507->464|507->464|507->464|507->464|507->464|508->465|508->465|508->465|510->467|513->470|513->470|534->491|534->491|534->491|536->493|536->493|536->493|537->494|537->494|537->494|538->495|538->495|538->495|539->496|539->496|539->496|541->498|545->502|545->502|545->502|550->507|550->507|551->508|557->514|578->535|587->544|587->544|587->544|603->560|608->565|609->566|614->571|624->581|624->581|624->581|631->588|647->604|647->604|647->604|649->606|649->606|649->606|649->606|649->606|651->608|654->611|654->611|654->611|656->613|656->613|656->613|656->613|656->613|658->615|658->615|658->615|659->616|659->616|659->616|660->617|660->617|660->617|660->617|660->617|660->617|662->619|670->627
                    -- GENERATED --
                */
            