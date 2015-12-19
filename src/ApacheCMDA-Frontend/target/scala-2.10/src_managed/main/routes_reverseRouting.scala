// @SOURCE:/home/SOC-Fall-2015/Dev/SOC-Fall-2015-Team1/ApacheCMDA-Frontend/conf/routes
// @HASH:d9f2e5d56d6ca7d8da8aee60732beab17196bfe5
// @DATE:Thu Dec 17 21:24:34 UTC 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:75
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:53
// @LINE:52
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
package controllers {

// @LINE:75
class ReverseAssets {
    

// @LINE:75
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:29
// @LINE:28
class ReverseAboutusController {
    

// @LINE:29
def aboutProject(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "aboutProject")
}
                                                

// @LINE:28
def aboutUs(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "aboutus")
}
                                                
    
}
                          

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
class ReverseBugReportController {
    

// @LINE:21
def reports(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "bugs")
}
                                                

// @LINE:25
def solveReport(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "solve/report")
}
                                                

// @LINE:24
def deleteReport(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "delete/report")
}
                                                

// @LINE:23
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "bug/list")
}
                                                

// @LINE:22
def newReport(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "newReport")
}
                                                
    
}
                          

// @LINE:53
// @LINE:52
// @LINE:50
class ReverseUserController {
    

// @LINE:52
def mentionUsers(url:String = null, serviceNew:String = null, serviceId:String = null): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/mentionUsers" + queryString(List(if(url == null) None else Some(implicitly[QueryStringBindable[String]].unbind("url", url)), if(serviceNew == null) None else Some(implicitly[QueryStringBindable[String]].unbind("serviceNew", serviceNew)), if(serviceId == null) None else Some(implicitly[QueryStringBindable[String]].unbind("serviceId", serviceId)))))
}
                                                

// @LINE:50
def addRatingNew(url:String = null, serviceNew:String = null, serviceId:String = null, userName:String = null): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/oneServiceNew" + queryString(List(if(url == null) None else Some(implicitly[QueryStringBindable[String]].unbind("url", url)), if(serviceNew == null) None else Some(implicitly[QueryStringBindable[String]].unbind("serviceNew", serviceNew)), if(serviceId == null) None else Some(implicitly[QueryStringBindable[String]].unbind("serviceId", serviceId)), if(userName == null) None else Some(implicitly[QueryStringBindable[String]].unbind("userName", userName)))))
}
                                                

// @LINE:53
def mentionUsers2(url:String = null, serviceNew:String = null, serviceId:String = null): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/mentionUsers2" + queryString(List(if(url == null) None else Some(implicitly[QueryStringBindable[String]].unbind("url", url)), if(serviceNew == null) None else Some(implicitly[QueryStringBindable[String]].unbind("serviceNew", serviceNew)), if(serviceId == null) None else Some(implicitly[QueryStringBindable[String]].unbind("serviceId", serviceId)))))
}
                                                
    
}
                          

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseApplication {
    

// @LINE:14
def createNewUser(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "createNewUser")
}
                                                

// @LINE:15
def createSuccess(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "createSuccess")
}
                                                

// @LINE:16
def isEmailExisted(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "isEmailExisted")
}
                                                

// @LINE:13
def signup(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:11
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:12
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "authenticate")
}
                                                

// @LINE:10
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
class ReverseCommentController {
    

// @LINE:68
def addComment(commenter:String = null, serviceID:String = null): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "comment/addComment" + queryString(List(if(commenter == null) None else Some(implicitly[QueryStringBindable[String]].unbind("commenter", commenter)), if(serviceID == null) None else Some(implicitly[QueryStringBindable[String]].unbind("serviceID", serviceID)))))
}
                                                

// @LINE:69
def getComment(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "comment/getComment")
}
                                                

// @LINE:67
def comment(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "comment")
}
                                                

// @LINE:70
def getCommentByID(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "comment/getCommentByID")
}
                                                
    
}
                          

// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
class ReverseDatasetController {
    

// @LINE:61
// @LINE:60
def getSearchResult(): Call = {
   () match {
// @LINE:60
case () if true => Call("GET", _prefix + { _defaultPrefix } + "climate/getSearchResult")
                                                        
// @LINE:61
case () if true => Call("GET", _prefix + { _defaultPrefix } + "climate/getSearchResult")
                                                        
   }
}
                                                

// @LINE:59
def searchDataset(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/searchDataSet")
}
                                                

// @LINE:58
def datasetList(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/datasets")
}
                                                
    
}
                          

// @LINE:63
// @LINE:62
// @LINE:49
// @LINE:48
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseClimateServiceController {
    

// @LINE:43
def addClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/new/climateServices")
}
                                                

// @LINE:62
def searchService(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/searchService")
}
                                                

// @LINE:36
def mostRecentlyAddedClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/mostRecentlyAddedClimateServices")
}
                                                

// @LINE:42
def editClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/edit/climateServices")
}
                                                

// @LINE:49
def oneServiceNew(url:String = null, serviceNew:String = null, serviceId:String = null, email:String = null): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/oneServiceNew" + queryString(List(if(url == null) None else Some(implicitly[QueryStringBindable[String]].unbind("url", url)), if(serviceNew == null) None else Some(implicitly[QueryStringBindable[String]].unbind("serviceNew", serviceNew)), if(serviceId == null) None else Some(implicitly[QueryStringBindable[String]].unbind("serviceId", serviceId)), if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
}
                                                

// @LINE:38
def mostPopularClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/mostPopularClimateServices")
}
                                                

// @LINE:34
def tutorial(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/tutorial")
}
                                                

// @LINE:45
def checkLike(email:String = null, serviceID:String = null): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/checkLike" + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(serviceID == null) None else Some(implicitly[QueryStringBindable[String]].unbind("serviceID", serviceID)))))
}
                                                

// @LINE:44
def oneService(url:String = null): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/oneService" + queryString(List(if(url == null) None else Some(implicitly[QueryStringBindable[String]].unbind("url", url)))))
}
                                                

// @LINE:7
def newHome(email:String = null, vfile:String = null, dataset:String = null): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "newHome" + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
}
                                                

// @LINE:41
def downloadClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/download/climateServices")
}
                                                

// @LINE:33
def newAllServices(email:String = null, vfile:String = null, dataset:String = null): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "newAllServices" + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
}
                                                

// @LINE:48
def mentionServices(url:String = null, serviceNew:String = null, serviceId:String = null): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/mentionServices" + queryString(List(if(url == null) None else Some(implicitly[QueryStringBindable[String]].unbind("url", url)), if(serviceNew == null) None else Some(implicitly[QueryStringBindable[String]].unbind("serviceNew", serviceNew)), if(serviceId == null) None else Some(implicitly[QueryStringBindable[String]].unbind("serviceId", serviceId)))))
}
                                                

// @LINE:37
def mostRecentlyUsedClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/mostRecentlyUsedClimateServices")
}
                                                

// @LINE:35
def climateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/climateServices")
}
                                                

// @LINE:39
def newClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/new/climateServices")
}
                                                

// @LINE:32
// @LINE:9
// @LINE:8
def home(email:String = null, vfile:String = null, dataset:String = null): Call = {
   (email: @unchecked, vfile: @unchecked, dataset: @unchecked) match {
// @LINE:8
case (email, vfile, dataset) if true => Call("GET", _prefix + { _defaultPrefix } + "home" + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
                                                        
// @LINE:9
case (email, vfile, dataset) if true => Call("GET", _prefix + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
                                                        
// @LINE:32
case (email, vfile, dataset) if true => Call("GET", _prefix + { _defaultPrefix } + "climate" + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
                                                        
   }
}
                                                

// @LINE:40
def deleteClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/delete/climateServices")
}
                                                

// @LINE:63
def searchClimateServiceByKey(email:String = null, vfile:String = null, dataset:String = null): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/searchServiceResult" + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
}
                                                
    
}
                          
}
                  


// @LINE:75
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:53
// @LINE:52
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
package controllers.javascript {

// @LINE:75
class ReverseAssets {
    

// @LINE:75
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:29
// @LINE:28
class ReverseAboutusController {
    

// @LINE:29
def aboutProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutusController.aboutProject",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutProject"})
      }
   """
)
                        

// @LINE:28
def aboutUs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutusController.aboutUs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutus"})
      }
   """
)
                        
    
}
              

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
class ReverseBugReportController {
    

// @LINE:21
def reports : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.reports",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugs"})
      }
   """
)
                        

// @LINE:25
def solveReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.solveReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "solve/report"})
      }
   """
)
                        

// @LINE:24
def deleteReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.deleteReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/report"})
      }
   """
)
                        

// @LINE:23
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bug/list"})
      }
   """
)
                        

// @LINE:22
def newReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.newReport",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newReport"})
      }
   """
)
                        
    
}
              

// @LINE:53
// @LINE:52
// @LINE:50
class ReverseUserController {
    

// @LINE:52
def mentionUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.mentionUsers",
   """
      function(url,serviceNew,serviceId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/mentionUsers" + _qS([(url == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("url", url)), (serviceNew == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("serviceNew", serviceNew)), (serviceId == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("serviceId", serviceId))])})
      }
   """
)
                        

// @LINE:50
def addRatingNew : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.addRatingNew",
   """
      function(url,serviceNew,serviceId,userName) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/oneServiceNew" + _qS([(url == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("url", url)), (serviceNew == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("serviceNew", serviceNew)), (serviceId == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("serviceId", serviceId)), (userName == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("userName", userName))])})
      }
   """
)
                        

// @LINE:53
def mentionUsers2 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.mentionUsers2",
   """
      function(url,serviceNew,serviceId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/mentionUsers2" + _qS([(url == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("url", url)), (serviceNew == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("serviceNew", serviceNew)), (serviceId == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("serviceId", serviceId))])})
      }
   """
)
                        
    
}
              

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseApplication {
    

// @LINE:14
def createNewUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createNewUser",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createNewUser"})
      }
   """
)
                        

// @LINE:15
def createSuccess : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createSuccess",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createSuccess"})
      }
   """
)
                        

// @LINE:16
def isEmailExisted : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.isEmailExisted",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "isEmailExisted"})
      }
   """
)
                        

// @LINE:13
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signup",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:11
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:12
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate"})
      }
   """
)
                        

// @LINE:10
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
class ReverseCommentController {
    

// @LINE:68
def addComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CommentController.addComment",
   """
      function(commenter,serviceID) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/addComment" + _qS([(commenter == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("commenter", commenter)), (serviceID == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("serviceID", serviceID))])})
      }
   """
)
                        

// @LINE:69
def getComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CommentController.getComment",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/getComment"})
      }
   """
)
                        

// @LINE:67
def comment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CommentController.comment",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comment"})
      }
   """
)
                        

// @LINE:70
def getCommentByID : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CommentController.getCommentByID",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/getCommentByID"})
      }
   """
)
                        
    
}
              

// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
class ReverseDatasetController {
    

// @LINE:61
// @LINE:60
def getSearchResult : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.getSearchResult",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/getSearchResult"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/getSearchResult"})
      }
      }
   """
)
                        

// @LINE:59
def searchDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.searchDataset",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/searchDataSet"})
      }
   """
)
                        

// @LINE:58
def datasetList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.datasetList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/datasets"})
      }
   """
)
                        
    
}
              

// @LINE:63
// @LINE:62
// @LINE:49
// @LINE:48
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseClimateServiceController {
    

// @LINE:43
def addClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.addClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/new/climateServices"})
      }
   """
)
                        

// @LINE:62
def searchService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.searchService",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/searchService"})
      }
   """
)
                        

// @LINE:36
def mostRecentlyAddedClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostRecentlyAddedClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/mostRecentlyAddedClimateServices"})
      }
   """
)
                        

// @LINE:42
def editClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.editClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/edit/climateServices"})
      }
   """
)
                        

// @LINE:49
def oneServiceNew : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.oneServiceNew",
   """
      function(url,serviceNew,serviceId,email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/oneServiceNew" + _qS([(url == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("url", url)), (serviceNew == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("serviceNew", serviceNew)), (serviceId == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("serviceId", serviceId)), (email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email))])})
      }
   """
)
                        

// @LINE:38
def mostPopularClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostPopularClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/mostPopularClimateServices"})
      }
   """
)
                        

// @LINE:34
def tutorial : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.tutorial",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/tutorial"})
      }
   """
)
                        

// @LINE:45
def checkLike : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.checkLike",
   """
      function(email,serviceID) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/checkLike" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (serviceID == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("serviceID", serviceID))])})
      }
   """
)
                        

// @LINE:44
def oneService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.oneService",
   """
      function(url) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/oneService" + _qS([(url == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("url", url))])})
      }
   """
)
                        

// @LINE:7
def newHome : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.newHome",
   """
      function(email,vfile,dataset) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newHome" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
   """
)
                        

// @LINE:41
def downloadClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.downloadClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/download/climateServices"})
      }
   """
)
                        

// @LINE:33
def newAllServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.newAllServices",
   """
      function(email,vfile,dataset) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newAllServices" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
   """
)
                        

// @LINE:48
def mentionServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mentionServices",
   """
      function(url,serviceNew,serviceId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/mentionServices" + _qS([(url == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("url", url)), (serviceNew == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("serviceNew", serviceNew)), (serviceId == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("serviceId", serviceId))])})
      }
   """
)
                        

// @LINE:37
def mostRecentlyUsedClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostRecentlyUsedClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/mostRecentlyUsedClimateServices"})
      }
   """
)
                        

// @LINE:35
def climateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.climateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/climateServices"})
      }
   """
)
                        

// @LINE:39
def newClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.newClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/new/climateServices"})
      }
   """
)
                        

// @LINE:32
// @LINE:9
// @LINE:8
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.home",
   """
      function(email, vfile, dataset) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
      }
   """
)
                        

// @LINE:40
def deleteClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.deleteClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/delete/climateServices"})
      }
   """
)
                        

// @LINE:63
def searchClimateServiceByKey : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.searchClimateServiceByKey",
   """
      function(email,vfile,dataset) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/searchServiceResult" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
   """
)
                        
    
}
              
}
        


// @LINE:75
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:53
// @LINE:52
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
package controllers.ref {


// @LINE:75
class ReverseAssets {
    

// @LINE:75
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:29
// @LINE:28
class ReverseAboutusController {
    

// @LINE:29
def aboutProject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutusController.aboutProject(), HandlerDef(this, "controllers.AboutusController", "aboutProject", Seq(), "GET", """""", _prefix + """aboutProject""")
)
                      

// @LINE:28
def aboutUs(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutusController.aboutUs(), HandlerDef(this, "controllers.AboutusController", "aboutUs", Seq(), "GET", """ About Us""", _prefix + """aboutus""")
)
                      
    
}
                          

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
class ReverseBugReportController {
    

// @LINE:21
def reports(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.reports(), HandlerDef(this, "controllers.BugReportController", "reports", Seq(), "GET", """ BugReporting""", _prefix + """bugs""")
)
                      

// @LINE:25
def solveReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.solveReport(), HandlerDef(this, "controllers.BugReportController", "solveReport", Seq(), "POST", """""", _prefix + """solve/report""")
)
                      

// @LINE:24
def deleteReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.deleteReport(), HandlerDef(this, "controllers.BugReportController", "deleteReport", Seq(), "POST", """""", _prefix + """delete/report""")
)
                      

// @LINE:23
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.list(), HandlerDef(this, "controllers.BugReportController", "list", Seq(), "GET", """""", _prefix + """bug/list""")
)
                      

// @LINE:22
def newReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.newReport(), HandlerDef(this, "controllers.BugReportController", "newReport", Seq(), "GET", """""", _prefix + """newReport""")
)
                      
    
}
                          

// @LINE:53
// @LINE:52
// @LINE:50
class ReverseUserController {
    

// @LINE:52
def mentionUsers(url:String, serviceNew:String, serviceId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.mentionUsers(url, serviceNew, serviceId), HandlerDef(this, "controllers.UserController", "mentionUsers", Seq(classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """climate/mentionUsers""")
)
                      

// @LINE:50
def addRatingNew(url:String, serviceNew:String, serviceId:String, userName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.addRatingNew(url, serviceNew, serviceId, userName), HandlerDef(this, "controllers.UserController", "addRatingNew", Seq(classOf[String], classOf[String], classOf[String], classOf[String]), "POST", """""", _prefix + """climate/oneServiceNew""")
)
                      

// @LINE:53
def mentionUsers2(url:String, serviceNew:String, serviceId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.mentionUsers2(url, serviceNew, serviceId), HandlerDef(this, "controllers.UserController", "mentionUsers2", Seq(classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """climate/mentionUsers2""")
)
                      
    
}
                          

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseApplication {
    

// @LINE:14
def createNewUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createNewUser(), HandlerDef(this, "controllers.Application", "createNewUser", Seq(), "GET", """""", _prefix + """createNewUser""")
)
                      

// @LINE:15
def createSuccess(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createSuccess(), HandlerDef(this, "controllers.Application", "createSuccess", Seq(), "GET", """""", _prefix + """createSuccess""")
)
                      

// @LINE:16
def isEmailExisted(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.isEmailExisted(), HandlerDef(this, "controllers.Application", "isEmailExisted", Seq(), "POST", """""", _prefix + """isEmailExisted""")
)
                      

// @LINE:13
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signup(), HandlerDef(this, "controllers.Application", "signup", Seq(), "GET", """""", _prefix + """signup""")
)
                      

// @LINE:11
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:12
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """authenticate""")
)
                      

// @LINE:10
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
class ReverseCommentController {
    

// @LINE:68
def addComment(commenter:String, serviceID:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CommentController.addComment(commenter, serviceID), HandlerDef(this, "controllers.CommentController", "addComment", Seq(classOf[String], classOf[String]), "POST", """""", _prefix + """comment/addComment""")
)
                      

// @LINE:69
def getComment(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CommentController.getComment(), HandlerDef(this, "controllers.CommentController", "getComment", Seq(), "GET", """""", _prefix + """comment/getComment""")
)
                      

// @LINE:67
def comment(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CommentController.comment(), HandlerDef(this, "controllers.CommentController", "comment", Seq(), "GET", """Comment""", _prefix + """comment""")
)
                      

// @LINE:70
def getCommentByID(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CommentController.getCommentByID(), HandlerDef(this, "controllers.CommentController", "getCommentByID", Seq(), "GET", """""", _prefix + """comment/getCommentByID""")
)
                      
    
}
                          

// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
class ReverseDatasetController {
    

// @LINE:60
def getSearchResult(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.getSearchResult(), HandlerDef(this, "controllers.DatasetController", "getSearchResult", Seq(), "GET", """""", _prefix + """climate/getSearchResult""")
)
                      

// @LINE:59
def searchDataset(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.searchDataset(), HandlerDef(this, "controllers.DatasetController", "searchDataset", Seq(), "GET", """""", _prefix + """climate/searchDataSet""")
)
                      

// @LINE:58
def datasetList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.datasetList(), HandlerDef(this, "controllers.DatasetController", "datasetList", Seq(), "GET", """Keyword search""", _prefix + """climate/datasets""")
)
                      
    
}
                          

// @LINE:63
// @LINE:62
// @LINE:49
// @LINE:48
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseClimateServiceController {
    

// @LINE:43
def addClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.addClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "addClimateServices", Seq(), "GET", """""", _prefix + """climate/new/climateServices""")
)
                      

// @LINE:62
def searchService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.searchService(), HandlerDef(this, "controllers.ClimateServiceController", "searchService", Seq(), "GET", """""", _prefix + """climate/searchService""")
)
                      

// @LINE:36
def mostRecentlyAddedClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostRecentlyAddedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyAddedClimateServices", Seq(), "GET", """""", _prefix + """climate/mostRecentlyAddedClimateServices""")
)
                      

// @LINE:42
def editClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.editClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "editClimateService", Seq(), "POST", """""", _prefix + """climate/edit/climateServices""")
)
                      

// @LINE:49
def oneServiceNew(url:String, serviceNew:String, serviceId:String, email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.oneServiceNew(url, serviceNew, serviceId, email), HandlerDef(this, "controllers.ClimateServiceController", "oneServiceNew", Seq(classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """climate/oneServiceNew""")
)
                      

// @LINE:38
def mostPopularClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostPopularClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostPopularClimateServices", Seq(), "GET", """""", _prefix + """climate/mostPopularClimateServices""")
)
                      

// @LINE:34
def tutorial(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.tutorial(), HandlerDef(this, "controllers.ClimateServiceController", "tutorial", Seq(), "GET", """""", _prefix + """climate/tutorial""")
)
                      

// @LINE:45
def checkLike(email:String, serviceID:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.checkLike(email, serviceID), HandlerDef(this, "controllers.ClimateServiceController", "checkLike", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """climate/checkLike""")
)
                      

// @LINE:44
def oneService(url:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.oneService(url), HandlerDef(this, "controllers.ClimateServiceController", "oneService", Seq(classOf[String]), "GET", """""", _prefix + """climate/oneService""")
)
                      

// @LINE:7
def newHome(email:String, vfile:String, dataset:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.newHome(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "newHome", Seq(classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """newHome""")
)
                      

// @LINE:41
def downloadClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.downloadClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "downloadClimateService", Seq(), "POST", """""", _prefix + """climate/download/climateServices""")
)
                      

// @LINE:33
def newAllServices(email:String, vfile:String, dataset:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.newAllServices(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "newAllServices", Seq(classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """newAllServices""")
)
                      

// @LINE:48
def mentionServices(url:String, serviceNew:String, serviceId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mentionServices(url, serviceNew, serviceId), HandlerDef(this, "controllers.ClimateServiceController", "mentionServices", Seq(classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """climate/mentionServices""")
)
                      

// @LINE:37
def mostRecentlyUsedClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostRecentlyUsedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyUsedClimateServices", Seq(), "GET", """""", _prefix + """climate/mostRecentlyUsedClimateServices""")
)
                      

// @LINE:35
def climateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.climateServices(), HandlerDef(this, "controllers.ClimateServiceController", "climateServices", Seq(), "GET", """""", _prefix + """climate/climateServices""")
)
                      

// @LINE:39
def newClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.newClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "newClimateService", Seq(), "POST", """""", _prefix + """climate/new/climateServices""")
)
                      

// @LINE:8
def home(email:String, vfile:String, dataset:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """home""")
)
                      

// @LINE:40
def deleteClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.deleteClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "deleteClimateService", Seq(), "POST", """""", _prefix + """climate/delete/climateServices""")
)
                      

// @LINE:63
def searchClimateServiceByKey(email:String, vfile:String, dataset:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.searchClimateServiceByKey(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "searchClimateServiceByKey", Seq(classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """climate/searchServiceResult""")
)
                      
    
}
                          
}
        
    