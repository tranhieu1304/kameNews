
package views.html.dataTable

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Welcome to Kame DataTables")/*3.36*/ {_display_(Seq[Any](format.raw/*3.38*/("""

"""),format.raw/*5.1*/("""<script type="text/javascript">
  $(document).ready(function() """),format.raw/*6.32*/("""{"""),format.raw/*6.33*/("""
    """),format.raw/*7.5*/("""$('#contacts').dataTable( """),format.raw/*7.31*/("""{"""),format.raw/*7.32*/("""
        """),format.raw/*8.9*/(""""processing": true,
        "serverSide": true,
        "bSort": true,
        "ajax": """"),_display_(/*11.19*/routes/*11.25*/.DataTableTemplate.list()),format.raw/*11.50*/("""",
        "aLengthMenu": [[5, 10, 17, -1], ["さん", "ご", "なな", "All"]],
        "iDisplayLength": 5,
        // That define Language
        "language": """),format.raw/*15.21*/("""{"""),format.raw/*15.22*/("""
            """),format.raw/*16.13*/(""""decimal":        "",
            "emptyTable":     "No data available in table",
            "info": "全て  _PAGE_  _PAGES_",
            "infoEmpty": "ゼロ",
            "infoFiltered": "(全て _MAX_ )",
            "infoPostFix":    "",
            "thousands":      ",",
            "lengthMenu": "表示 _MENU_ in Kame's Data",
            "loadingRecords": "Loading...",
            "processing":     "Processing...",
            "search":         "検索:",
            "zeroRecords": "Nothing found - sorry",
            "paginate": """),format.raw/*28.25*/("""{"""),format.raw/*28.26*/("""
            	"""),format.raw/*29.14*/(""""first":      "<",
                "last":       ">",
                "next":       "次",
                "previous":   "前"
            """),format.raw/*33.13*/("""}"""),format.raw/*33.14*/(""",
            "aria": """),format.raw/*34.21*/("""{"""),format.raw/*34.22*/("""
                """),format.raw/*35.17*/(""""sortAscending":  ": activate to sort column ascending",
                "sortDescending": ": activate to sort column descending"
            """),format.raw/*37.13*/("""}"""),format.raw/*37.14*/("""
        """),format.raw/*38.9*/("""}"""),format.raw/*38.10*/(""",

        "pagingType": "full_numbers",
        //
        "columns": [
            """),format.raw/*43.13*/("""{"""),format.raw/*43.14*/("""
            	"""),format.raw/*44.14*/(""""className":      'details-control',
                data:           "0",
                "defaultContent": ''
            """),format.raw/*47.13*/("""}"""),format.raw/*47.14*/(""",
            """),format.raw/*48.13*/("""{"""),format.raw/*48.14*/(""" 
            	"""),format.raw/*49.14*/("""data: "1" ,
            	"render": function ( data, type, full, meta ) """),format.raw/*50.60*/("""{"""),format.raw/*50.61*/("""
            		"""),format.raw/*51.15*/("""var tem = data;
            		if(data.indexOf('h') != -1 )"""),format.raw/*52.43*/("""{"""),format.raw/*52.44*/("""
            			"""),format.raw/*53.16*/("""return data;
            		"""),format.raw/*54.15*/("""}"""),format.raw/*54.16*/("""else
            	      return '<a href="'+data+'">Download</a>';
            	    """),format.raw/*56.18*/("""}"""),format.raw/*56.19*/("""
            """),format.raw/*57.13*/("""}"""),format.raw/*57.14*/(""",
            """),format.raw/*58.13*/("""{"""),format.raw/*58.14*/(""" 
            	"""),format.raw/*59.14*/("""data: "2"
            """),format.raw/*60.13*/("""}"""),format.raw/*60.14*/(""",
            """),format.raw/*61.13*/("""{"""),format.raw/*61.14*/(""" 
            	"""),format.raw/*62.14*/("""data: "3",
            	"orderable":      false
            """),format.raw/*64.13*/("""}"""),format.raw/*64.14*/("""
        """),format.raw/*65.9*/("""]
    """),format.raw/*66.5*/("""}"""),format.raw/*66.6*/(""" """),format.raw/*66.7*/(""");
"""),format.raw/*67.1*/("""}"""),format.raw/*67.2*/(""" """),format.raw/*67.3*/(""");
</script>

  <h2>Welcome to Kame DataTables</h2>

  <table id="contacts" class='data display'>
    <thead>
        <tr>
            <th>お名前 </th>
            <th>タイトル </th>
            <th>E-mail アドレス</th>
            <th>アクション </th>
        </tr>
    </thead>
</table>
""")))}))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Fri Mar 31 15:30:56 JST 2017
                  SOURCE: /Users/mac_thieu/git/feedpicks/app/views/dataTable/index.scala.html
                  HASH: 49f82124fbe421b35d6b38af01b8a8dab5b2bd7e
                  MATRIX: 755->1|867->18|895->21|937->55|976->57|1004->59|1094->122|1122->123|1153->128|1206->154|1234->155|1269->164|1385->253|1400->259|1446->284|1626->436|1655->437|1696->450|2250->976|2279->977|2321->991|2484->1126|2513->1127|2563->1149|2592->1150|2637->1167|2807->1309|2836->1310|2872->1319|2901->1320|3014->1405|3043->1406|3085->1420|3236->1543|3265->1544|3307->1558|3336->1559|3379->1574|3478->1645|3507->1646|3550->1661|3636->1719|3665->1720|3709->1736|3764->1763|3793->1764|3904->1847|3933->1848|3974->1861|4003->1862|4045->1876|4074->1877|4117->1892|4167->1914|4196->1915|4238->1929|4267->1930|4310->1945|4398->2005|4427->2006|4463->2015|4496->2021|4524->2022|4552->2023|4582->2026|4610->2027|4638->2028
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|37->6|37->6|38->7|38->7|38->7|39->8|42->11|42->11|42->11|46->15|46->15|47->16|59->28|59->28|60->29|64->33|64->33|65->34|65->34|66->35|68->37|68->37|69->38|69->38|74->43|74->43|75->44|78->47|78->47|79->48|79->48|80->49|81->50|81->50|82->51|83->52|83->52|84->53|85->54|85->54|87->56|87->56|88->57|88->57|89->58|89->58|90->59|91->60|91->60|92->61|92->61|93->62|95->64|95->64|96->65|97->66|97->66|97->66|98->67|98->67|98->67
                  -- GENERATED --
              */
          