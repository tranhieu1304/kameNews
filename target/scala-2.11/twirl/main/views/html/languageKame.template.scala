
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object languageKame_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class languageKame extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Coffee],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(coffeeForm: Form[Coffee]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""

"""),_display_(/*3.2*/main(Language.message("ellou") + " - Play 2.0")/*3.49*/ {_display_(Seq[Any](format.raw/*3.51*/("""
    
"""),format.raw/*5.1*/("""<h1>"""),_display_(/*5.6*/Language/*5.14*/.message("ellou")),format.raw/*5.31*/("""</h1>
<div><b>"""),_display_(/*6.10*/Language/*6.18*/.message("language.select")),format.raw/*6.45*/(""" """),format.raw/*6.46*/("""...</b></div>


<!-- Object of the currently selected language -->
<div>
    """),_display_(/*11.6*/defining(Language.currentLanguageItem())/*11.46*/ {currentLang =>_display_(Seq[Any](format.raw/*11.62*/("""
        """),_display_(/*12.10*/Language/*12.18*/.message("language.current")),format.raw/*12.46*/(""":  """),_display_(/*12.50*/currentLang/*12.61*/.name),format.raw/*12.66*/("""  """),format.raw/*12.68*/("""("""),_display_(/*12.70*/currentLang/*12.81*/.code),format.raw/*12.86*/(""")
    """)))}),format.raw/*13.6*/("""
"""),format.raw/*14.1*/("""</div>

<!-- other languages (without current) -->
<div>
    """),_display_(/*18.6*/Language/*18.14*/.message("language.change")),format.raw/*18.41*/(""":
    """),_display_(/*19.6*/for(lang <- Language.otherLanguageItems()) yield /*19.48*/{_display_(Seq[Any](format.raw/*19.49*/("""
        """),format.raw/*20.9*/("""<a href=""""),_display_(/*20.19*/lang/*20.23*/.switchUrl),format.raw/*20.33*/("""">"""),_display_(/*20.36*/lang/*20.40*/.name),format.raw/*20.45*/("""</a>
    """)))}),format.raw/*21.6*/("""
"""),format.raw/*22.1*/("""</div>

<!-- Does it work with form's constraints? Yes, but... manually ...-->
<!-- There is a problem with errors, don't know why, if it's important to you can maintain it with flash scope from your controller -->

<div>
    """),_display_(/*28.6*/helper/*28.12*/.form(routes.Application.submit)/*28.44*/{_display_(Seq[Any](format.raw/*28.45*/("""
        """),_display_(/*29.10*/helper/*29.16*/.inputText(
            coffeeForm("name"),
            '_label -> Language.message("input.coffeeName"),
            '_help ->  { Language.message("constraint.required") + ", " + Language.message("constraint.minLength", "5") },
            '_showErrors -> false
        )),format.raw/*34.10*/("""
        """),format.raw/*35.9*/("""<input type="submit">
    """)))}),format.raw/*36.6*/("""

"""),format.raw/*38.1*/("""</div>





    
""")))}))
      }
    }
  }

  def render(coffeeForm:Form[Coffee]): play.twirl.api.HtmlFormat.Appendable = apply(coffeeForm)

  def f:((Form[Coffee]) => play.twirl.api.HtmlFormat.Appendable) = (coffeeForm) => apply(coffeeForm)

  def ref: this.type = this

}


}

/**/
object languageKame extends languageKame_Scope0.languageKame
              /*
                  -- GENERATED --
                  DATE: Fri Mar 31 15:30:56 JST 2017
                  SOURCE: /Users/mac_thieu/git/feedpicks/app/views/languageKame.scala.html
                  HASH: 5136d3f2e4b287fd7e3aa4fcae6df98fb05c3925
                  MATRIX: 765->1|886->27|914->30|969->77|1008->79|1040->85|1070->90|1086->98|1123->115|1164->130|1180->138|1227->165|1255->166|1359->244|1408->284|1462->300|1499->310|1516->318|1565->346|1596->350|1616->361|1642->366|1672->368|1701->370|1721->381|1747->386|1784->393|1812->394|1900->456|1917->464|1965->491|1998->498|2056->540|2095->541|2131->550|2168->560|2181->564|2212->574|2242->577|2255->581|2281->586|2321->596|2349->597|2602->824|2617->830|2658->862|2697->863|2734->873|2749->879|3041->1150|3077->1159|3134->1186|3163->1188
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|37->6|37->6|37->6|37->6|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|43->12|44->13|45->14|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|51->20|51->20|51->20|51->20|52->21|53->22|59->28|59->28|59->28|59->28|60->29|60->29|65->34|66->35|67->36|69->38
                  -- GENERATED --
              */
          