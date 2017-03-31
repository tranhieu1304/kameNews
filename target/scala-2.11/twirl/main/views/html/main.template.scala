
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="jp">
<head>
<title>"""),_display_(/*6.9*/title),format.raw/*6.14*/("""</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
<link rel="stylesheet" media="screen" href=""""),_display_(/*13.46*/routes/*13.52*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.93*/("""">
<link rel="shortcut icon" type="image/png"
	href=""""),_display_(/*15.9*/routes/*15.15*/.Assets.versioned("images/favicon.png")),format.raw/*15.54*/("""">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<link rel="stylesheet"  href=""""),_display_(/*18.32*/routes/*18.38*/.Assets.versioned("stylesheets/post.css")),format.raw/*18.79*/("""">


	 <link rel="stylesheet" media="screen" href=""""),_display_(/*21.48*/routes/*21.54*/.Assets.versioned("stylesheets/demo_table_jui.css")),format.raw/*21.105*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*22.54*/routes/*22.60*/.Assets.versioned("stylesheets/ui-lightness/jquery-ui-1.8.21.custom.css")),format.raw/*22.133*/("""">
        <script src=""""),_display_(/*23.23*/routes/*23.29*/.Assets.versioned("javascripts/jquery.js")),format.raw/*23.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*24.23*/routes/*24.29*/.Assets.versioned("javascripts/jquery-ui.min.js")),format.raw/*24.78*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*25.23*/routes/*25.29*/.Assets.versioned("javascripts/jquery.dataTables.min.js")),format.raw/*25.86*/("""" type="text/javascript"></script>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*26.59*/routes/*26.65*/.Assets.versioned("images/favicon.png")),format.raw/*26.104*/("""">
	

</head>
<body>
	<div class="header">"""),_display_(/*31.23*/common/*31.29*/.header()),format.raw/*31.38*/("""</div>
	<br><br><br>
	<div class="container">"""),_display_(/*33.26*/content),format.raw/*33.33*/("""</div>
</body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Mar 31 15:30:56 JST 2017
                  SOURCE: /Users/mac_thieu/git/feedpicks/app/views/main.scala.html
                  HASH: d2915cfc9af9ac969f7e99e4d1369ca7f2b618e3
                  MATRIX: 748->1|873->31|901->33|974->81|999->86|1400->460|1415->466|1477->507|1557->561|1572->567|1632->606|1783->730|1798->736|1860->777|1939->829|1954->835|2027->886|2110->942|2125->948|2220->1021|2272->1046|2287->1052|2350->1094|2434->1151|2449->1157|2519->1206|2603->1263|2618->1269|2696->1326|2816->1419|2831->1425|2892->1464|2962->1507|2977->1513|3007->1522|3080->1568|3108->1575
                  LINES: 27->1|32->1|34->3|37->6|37->6|44->13|44->13|44->13|46->15|46->15|46->15|49->18|49->18|49->18|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|62->31|62->31|62->31|64->33|64->33
                  -- GENERATED --
              */
          