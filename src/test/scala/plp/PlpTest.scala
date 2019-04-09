package plp

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class PLPTest extends Simulation {

	val httpProtocol = http
		.baseUrl("https://perf.maurices.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.(t|o)tf""", """.*\.png"""), WhiteList())
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36")
  	.silentResources

	val headers_0 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"cache-control" -> "max-age=0",
		"upgrade-insecure-requests" -> "1")

	val headers_9 = Map("Origin" -> "https://perf.maurices.com")

	val headers_43 = Map(
		"accept" -> "application/json, text/javascript, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_44 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"upgrade-insecure-requests" -> "1")

    val uri1 = "https://fast.fonts.net/t/1.css"
    val uri2 = "https://hello.myfonts.net/count/331b18"
    val uri3 = "https://mauricesprodatg.scene7.com"
    val uri5 = "https://www.maurices.com"

	val scn = scenario("plp.PLPTest")
		.exec(http("HomePage")
			.get("/")
			.check(regex("<a href=\"(.*)\" class=\"asc-nav-category\">").findRandom.saveAs("PLPURL"))
			.headers(headers_0)
  			.check(status.in(200,201,202,304))
			.resources(http("request_1")
			.get(uri3 + "/is/image/mauricesProdATG/hp_070118_sale_d?wid=960&fmt=png8"),
            http("request_2")
			.get(uri3 + "/is/image/mauricesProdATG/hp_070218_summerChecklist01_d?wid=960&qlt=85&fmt=pjpg"),
            http("request_3")
			.get(uri3 + "/is/image/mauricesProdATG/hp_070218_summerChecklist02_d?wid=960&qlt=85&fmt=pjpg"),
            http("request_4")
			.get(uri3 + "/is/image/mauricesProdATG/hp_070218_shorts_d?wid=960&qlt=85&fmt=pjpg"),
            http("request_5")
			.get(uri3 + "/is/image/mauricesProdATG/hp_070218_tanks_d?wid=960&qlt=70&fmt=pjpg"),
            http("request_6")
			.get(uri3 + "/is/image/mauricesProdATG/olapic_hpHeader01_122816?scl=0.5&qlt=50&op_usm=1,1,10,0"),
            http("request_7")
			.get(uri3 + "/is/image/mauricesProdATG/olapic_hpHeader02_122816?scl=0.5&qlt=50&op_usm=1,1,10,0"),
            http("request_8")
			.get("/assets/styles/global_browse.min.css?ver=9d9480914dc34eceee00489a2aea9ff1a6fba506"),
            http("request_9")
			.get("/assets/fonts/helvetica/5a13f7d1-b615-418e-bc3a-525001b9a671.woff2")
			.headers(headers_9),
            http("request_10")
			.get("/assets/fonts/helvetica/b0868b4c-234e-47d3-bc59-41ab9de3c0db.woff2")
			.headers(headers_9),
            http("request_11")
			.get("/assets/fonts/helvetica/3600b37f-2bf1-45f3-be3a-03365f16d9cb.woff2")
			.headers(headers_9),
            http("request_12")
			.get("/assets/fonts/helvetica/e172a1c0-6e7f-4f0f-a2c9-c221c7b990bb.woff2")
			.headers(headers_9),
            http("request_13")
			.get("/assets/fonts/helvetica/3b303641-706e-4221-94c4-4fb491f4f8ef.woff2")
			.headers(headers_9),
            http("request_14")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Md.woff2")
			.headers(headers_9),
            http("request_15")
			.get("/assets/fonts/helvetica/462d508d-efc7-478f-b84e-288eeb69a160.woff2")
			.headers(headers_9),
            http("request_16")
			.get("/assets/fonts/icon/mar-icon-font.woff?-hqky2s")
			.headers(headers_9),
            http("request_17")
			.get("/assets/fonts/icon/mar-icon-font-2.ttf?8y3f2b")
			.headers(headers_9),
            http("request_18")
			.get(uri5 + "/is/image/mauricesProdATG/navSpot_shoes01_030118?qlt=80&fmt=pjpg"),
            http("request_19")
			.get(uri5 + "/is/image/mauricesProdATG/navSpot_shoes02_030118?qlt=80&fmt=pjpg"),
            http("request_20")
			.get(uri5 + "/is/image/mauricesProdATG/navSpot_shoes03_030118?qlt=80&fmt=pjpg"),
            http("request_21")
			.get(uri5 + "/is/image/mauricesProdATG/hp_070218_dresses01_d?wid=960&qlt=85&fmt=pjpg"),
            http("request_22")
			.get(uri5 + "/is/image/mauricesProdATG/hp_070218_bogo75_d?wid=960&qlt=85&fmt=png8"),
            http("request_23")
			.get(uri5 + "/is/image/mauricesProdATG/hp_070218_dresses02_d?wid=960&qlt=85&fmt=pjpg"),
            http("request_24")
			.get(uri5 + "/is/image/mauricesProdATG/hpVisNav_042518_spot01?qlt=80&fmt=pjpg"),
            http("request_25")
			.get(uri5 + "/is/image/mauricesProdATG/hp_070218_sandals_d?wid=960&qlt=85&fmt=pjpg"),
            http("request_26")
			.get(uri5 + "/is/image/mauricesProdATG/hp_070118_247tees_d?wid=960&qlt=85&fmt=pjpg"),
            http("request_27")
			.get(uri5 + "/is/image/mauricesProdATG/hpVisNav_042518_spot02?qlt=80&fmt=pjpg"),
            http("request_28")
			.get(uri5 + "/is/image/mauricesProdATG/hpVisNav_042518_spot03?qlt=80&fmt=pjpg"),
            http("request_29")
			.get(uri5 + "/is/image/mauricesProdATG/hpVisNav_042518_spot04?qlt=80&fmt=pjpg"),
            http("request_30")
			.get(uri5 + "/is/image/mauricesProdATG/hpVisNav_042518_spot05?qlt=80&fmt=pjpg"),
            http("request_31")
			.get(uri5 + "/is/image/mauricesProdATG/hpVisNav_042518_spot06?qlt=80&fmt=pjpg"),
            http("request_32")
			.get(uri5 + "/is/image/mauricesProdATG/EC1802_VIP_Footer_200x100"),
            http("request_33")
			.get(uri5 + "/is/image/mauricesProdATG/EC1802_VIP_Footer_copy?fmt=png-alpha"),
            http("request_34")
			.get(uri5 + "/is/image/mauricesProdATG/maurices-blog-logo"),
            http("request_35")
			.get(uri2 + ""),
            http("request_36")
			.get(uri5 + "/static-content/webFonts/maur_webfont_helloBeautiful/webfonts/331B18_0_0.woff2")
			.headers(headers_9),
            http("request_37")
			.get(uri1 + "?apiType=css&projectid=daef18a3-3be0-4413-a689-9b7111c44ec1"),
            http("request_38")
			.get(uri5 + "/static-content/webFonts/maur_webFont_theHand/Fonts/0e5707f8-ab3f-417a-b92a-87bce341bff7.woff2")
			.headers(headers_9)))
		.exec{
			session=>
				//println(session("BODY").as[String])
				println(session("PLPURL").as[String])
				session
		}
		.pause(1)
		.exec(http("request_39")
			.get(uri1 + "?apiType=css&projectid=b4084fd0-b891-4731-95db-39bd7116f8ca")
  			.silent
			.resources(http("request_40")
			.get(uri5 + "/static-content/webFonts/maurWebFont_HelveticaNeue75bold/Fonts/531c5a28-5575-4f58-96d4-a80f7b702d7b.woff2")
			.headers(headers_9),
            http("request_41")
			.get(uri5 + "/is/image/mauricesProdATG/EC1802_VIP_Footer_mBG2?qlt=65"),
            http("request_42")
			.get("/assets/scripts/pages/one-column-template.min.js?ver=9d9480914dc34eceee00489a2aea9ff1a6fba506"),
            http("SessionID")
			.get("/maurices/baseAjaxServlet?pageId=UserState&Action=Header.userState&userState_id=url%3D%2Fbrowse&fetchFavorites=true&_=1554463033895")
  				.check(regex("sessionConfirmationNumber\":\"(.*)\",\"status").find.saveAs("SessionID"))
  				//.check(bodyString.saveAs("BODY"))
			.headers(headers_43)
			.notSilent))
		.exec{
			session=>
				//println(session("BODY").as[String])
				println(session("SessionID").as[String])
				session
		}
		.pause(4)
		.exec(http("PLP")
			.get("${PLPURL}")
			.headers(headers_44)
			.resources(http("request_45")
			.get("/assets/fonts/helvetica/5a13f7d1-b615-418e-bc3a-525001b9a671.woff2")
			.headers(headers_9),
            http("request_46")
			.get("/assets/fonts/helvetica/b0868b4c-234e-47d3-bc59-41ab9de3c0db.woff2")
			.headers(headers_9),
            http("request_47")
			.get("/assets/fonts/helvetica/3600b37f-2bf1-45f3-be3a-03365f16d9cb.woff2")
			.headers(headers_9),
            http("request_48")
			.get("/assets/fonts/helvetica/e172a1c0-6e7f-4f0f-a2c9-c221c7b990bb.woff2")
			.headers(headers_9),
            http("request_49")
			.get("/assets/fonts/helvetica/3b303641-706e-4221-94c4-4fb491f4f8ef.woff2")
			.headers(headers_9),
            http("request_50")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Md.woff2")
			.headers(headers_9),
            http("request_51")
			.get("/assets/fonts/helvetica/462d508d-efc7-478f-b84e-288eeb69a160.woff2")
			.headers(headers_9),
            http("request_52")
			.get("/assets/fonts/icon/mar-icon-font.woff?-hqky2s")
			.headers(headers_9),
            http("request_53")
			.get("/assets/fonts/icon/mar-icon-font-2.ttf?8y3f2b")
			.headers(headers_9),
            http("request_54")
			.get(uri2 + ""),
            http("request_55")
			.get(uri5 + "/static-content/webFonts/maur_webfont_helloBeautiful/webfonts/331B18_0_0.woff2")
			.headers(headers_9),
            http("request_56")
			.get(uri1 + "?apiType=css&projectid=daef18a3-3be0-4413-a689-9b7111c44ec1"),
            http("request_57")
			.get(uri5 + "/static-content/webFonts/maur_webFont_theHand/Fonts/0e5707f8-ab3f-417a-b92a-87bce341bff7.woff2")
			.headers(headers_9),
            http("request_58")
			.get("/assets/scripts/pages/plp.min.js?ver=9d9480914dc34eceee00489a2aea9ff1a6fba506"),
            http("request_59")
			.get(uri5 + "/static-content/js/maur_leftRail_060517.js?_=1554463045616"),
            http("request_60")
			.get(uri3 + "/is/image/mauricesProdATG/1"),
            http("request_61")
			.get(uri3 + "/is/image/mauricesProdATG/2"),
            http("request_62")
			.get(uri3 + "/is/image/mauricesProdATG/3"),
            http("request_63")
			.get(uri3 + "/is/image/mauricesProdATG/4"),
            http("request_64")
			.get(uri3 + "/is/image/mauricesProdATG/16"),
            http("request_65")
			.get(uri3 + "/is/image/mauricesProdATG/5"),
            http("request_66")
			.get(uri3 + "/is/image/mauricesProdATG/6"),
            http("request_67")
			.get(uri3 + "/is/image/mauricesProdATG/7"),
            http("request_68")
			.get(uri3 + "/is/image/mauricesProdATG/8"),
            http("request_69")
			.get(uri3 + "/is/image/mauricesProdATG/14"),
            http("request_70")
			.get(uri3 + "/is/image/mauricesProdATG/11"),
            http("request_71")
			.get(uri3 + "/is/image/mauricesProdATG/9"),
            http("request_72")
			.get("/maurices/baseAjaxServlet?pageId=UserState&Action=Header.userState&userState_id=catId%3D3001%26nav%3D10530&fetchFavorites=true&_=1554463045617")
			.headers(headers_43),
            http("request_73")
			.get(uri3 + "/is/image/mauricesProdATG/12")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}