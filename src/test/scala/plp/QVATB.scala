package plp

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class QVATB extends Simulation {

	val httpProtocol = http
		.baseUrl("https://perf.maurices.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.(t|o)tf""", """.*\.png"""), WhiteList())
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36")

	val headers_0 = Map(
		"accept" -> "application/json, text/javascript, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_2 = Map("Upgrade-Insecure-Requests" -> "1")

	val headers_3 = Map(
		"accept" -> "text/javascript, application/javascript, application/ecmascript, application/x-ecmascript, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_4 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"upgrade-insecure-requests" -> "1")

	val headers_13 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"origin" -> "https://perf.maurices.com",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_14 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "https://perf.maurices.com")

	val headers_26 = Map("Origin" -> "https://perf.maurices.com")

	val headers_43 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9")

	val headers_47 = Map(
		"accept" -> "application/json, text/javascript, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"origin" -> "https://perf.maurices.com",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_53 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_55 = Map(
		"Content-Type" -> "application/csp-report",
		"Origin" -> "https://secure.checkout.visa.com")

	val headers_58 = Map(
		"Accept" -> "application/json",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Content-type" -> "application/json",
		"Origin" -> "https://secure.checkout.visa.com",
		"X-CORRELATION-ID" -> "1_1554481861_073_513_l73p129_CHECKOUT-WIDGET",
		"X-VISIT-ID" -> "VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET")

	val headers_60 = Map(
		"API_KEY" -> "JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k",
		"Accept" -> "application/json",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Content-type" -> "application/json",
		"X-CORRELATION-ID" -> "1_1554481861_073_513_l73p129_CHECKOUT-WIDGET",
		"X-MERCHANT-API-KEY" -> "JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k")

	val headers_63 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Content-Type" -> "application/csp-report",
		"Origin" -> "https://secure.checkout.visa.com")

    val uri01 = "https://secure.checkout.visa.com"
    val uri02 = "https://www.google-analytics.com/collect"
    val uri03 = "https://www.facebook.com/v2.3/plugins/like.php"
    val uri04 = "https://assets.secure.checkout.visa.com/wallet-services-web/xo/button.png"
    val uri05 = "https://stats.g.doubleclick.net/r/collect"
    val uri06 = "https://fast.fonts.net/t/1.css"
    val uri07 = "https://hello.myfonts.net/count/331b18"
    val uri08 = "https://syndication.twitter.com/i/jot"
    val uri09 = "https://www.googletagmanager.com/gtm.js"
    val uri10 = "https://mauricesprodatg.scene7.com/is/image/mauricesProdATG"
    val uri12 = "https://www.maurices.com"
    val uri13 = "https://platform.twitter.com/widgets/tweet_button.2e9f365dae390394eb8d923cba8c5b11.en.html"

	val scn = scenario("QVATB")
		.exec(http("request_0")
			.get("/maurices/baseAjaxServlet?pageId=QV_GetProduct&Action=QuickView.getProduct&id=78790")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/maurices/baseAjaxServlet?pageId=QV_GetInventory&Action=QuickView.getInventory&id=78790")
			.headers(headers_0)))
		.pause(1)
		.exec(http("request_2")
			.get(uri13 + "")
			.headers(headers_2)
			.resources(http("request_3")
			.get("/p/clothing/tops/N-10530?nav=clothing:tops&_=1554481170532")
			.headers(headers_3),
            http("request_4")
			.get(uri03 + "?action=like&app_id=720220641420143&channel=https%3A%2F%2Fstaticxx.facebook.com%2Fconnect%2Fxd_arbiter%2Fr%2Fd_vbiawPdxB.js%3Fversion%3D44%23cb%3Df1bcde7b53020f4%26domain%3Dperf.maurices.com%26origin%3Dhttps%253A%252F%252Fperf.maurices.com%252Ff2d157f3de480e4%26relation%3Dparent.parent&container_width=0&href=http%3A%2F%2Fperf.maurices.com%2Fproduct%2F24-7-solid-v-neck-tank%2F78790&layout=button_count&locale=en_US&sdk=joey&share=false&show_faces=false")
			.headers(headers_4),
            http("request_5")
			.get(uri10 + "/78790_C6215_ms?req=set,json&id=C6215&true=jQuery111109694448763235461_1554481170516&_=1554481170522"),
            http("request_6")
			.get(uri10 + "/78790_C6215_ms?req=set,json&id=C6215&true=jQuery111109694448763235461_1554481170528&_=1554481170529"),
            http("request_7")
			.get(uri10 + "/78790_C6215_ms?req=set,json&id=C6215&true=jQuery111109694448763235461_1554481170514&_=1554481170523"),
            http("request_8")
			.get(uri10 + "/78790_C6215_ms?req=set,json&id=C6215&true=jQuery111109694448763235461_1554481170530&_=1554481170531"),
            http("request_9")
			.get(uri10 + "/78790_C6215_ms?req=set,json&id=C6215&true=jQuery111109694448763235461_1554481170526&_=1554481170527"),
            http("request_10")
			.get(uri10 + "/78790_C6215_ms?req=set,json&id=C6215&true=jQuery111109694448763235461_1554481170524&_=1554481170525"),
            http("request_11")
			.get(uri10 + "/78790_C6215_ms?req=set,json&id=C6215&true=jQuery111109694448763235461_1554481170518&_=1554481170521"),
            http("request_12")
			.get(uri08 + "?l=%7B%22widget_origin%22%3A%22https%3A%2F%2Fperf.maurices.com%2Fp%2Fclothing%2Ftops%2FN-10530%22%2C%22widget_frame%22%3Afalse%2C%22language%22%3A%22en%22%2C%22message%22%3A%22m%3Anocount%3A%22%2C%22_category_%22%3A%22tfw_client_event%22%2C%22triggered_on%22%3A1554481798238%2C%22dnt%22%3Afalse%2C%22client_version%22%3A%22c1f189f%3A1551939852453%22%2C%22format_version%22%3A1%2C%22event_namespace%22%3A%7B%22client%22%3A%22tfw%22%2C%22page%22%3A%22button%22%2C%22section%22%3A%22share%22%2C%22action%22%3A%22impression%22%7D%7D")))
		.pause(8)
		.exec(http("request_13")
			.post("/maurices/baseAjaxServlet?pageId=QV_AddToCart")
			.headers(headers_13)
			.formParam("Action", "QuickView.addToCart")
			.formParam("skuId", "23609282")
			.formParam("quantity", "1")
			.formParam("productId", "78790")
			.formParam("sessionConfirmationNumber", "8007868216017718079")
			.resources(http("request_14")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Ex.woff2")
			.headers(headers_14),
            http("request_15")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Bd.woff2")
			.headers(headers_14),
            http("request_16")
			.get(uri10 + "/78790_C6215?$xsmall$")))
		.pause(3)
		.exec(http("request_17")
			.post("/maurices/baseAjaxServlet?pageId=UpdateCart")
			.headers(headers_13)
			.formParam("Action", "Cart.fetchMiniCartValues")
			.formParam("sessionConfirmationNumber", "8007868216017718079")
			.resources(http("request_18")
			.get(uri10 + "/78790_C6215_swatch")))
		.pause(27)
		.exec(http("request_19")
			.get(uri12 + "/is/image/mauricesProdATG/navSpot_shoes01_030118?qlt=80&fmt=pjpg")
			.resources(http("request_20")
			.get(uri12 + "/is/image/mauricesProdATG/navSpot_shoes02_030118?qlt=80&fmt=pjpg"),
            http("request_21")
			.get(uri12 + "/is/image/mauricesProdATG/navSpot_shoes03_030118?qlt=80&fmt=pjpg"),
            http("request_22")
			.get(uri12 + "/is/image/mauricesProdATG/EC1802_VIP_Footer_200x100"),
            http("request_23")
			.get(uri12 + "/is/image/mauricesProdATG/EC1802_VIP_Footer_copy?fmt=png-alpha"),
            http("request_24")
			.get(uri12 + "/is/image/mauricesProdATG/maurices-blog-logo"),
            http("request_25")
			.get("/assets/styles/global_browse.min.css?ver=9d9480914dc34eceee00489a2aea9ff1a6fba506"),
            http("request_26")
			.get("/assets/fonts/helvetica/5a13f7d1-b615-418e-bc3a-525001b9a671.woff2")
			.headers(headers_26),
            http("request_27")
			.get("/assets/fonts/helvetica/b0868b4c-234e-47d3-bc59-41ab9de3c0db.woff2")
			.headers(headers_14),
            http("request_28")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Ex.woff2")
			.headers(headers_14),
            http("request_29")
			.get("/assets/fonts/helvetica/3600b37f-2bf1-45f3-be3a-03365f16d9cb.woff2")
			.headers(headers_14),
            http("request_30")
			.get("/assets/fonts/helvetica/e172a1c0-6e7f-4f0f-a2c9-c221c7b990bb.woff2")
			.headers(headers_26),
            http("request_31")
			.get("/assets/fonts/helvetica/3b303641-706e-4221-94c4-4fb491f4f8ef.woff2")
			.headers(headers_14),
            http("request_32")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Bd.woff2")
			.headers(headers_14),
            http("request_33")
			.get("/assets/fonts/helvetica/462d508d-efc7-478f-b84e-288eeb69a160.woff2")
			.headers(headers_26),
            http("request_34")
			.get("/assets/fonts/icon/mar-icon-font.woff?-hqky2s")
			.headers(headers_26),
            http("request_35")
			.get("/assets/fonts/icon/mar-icon-font-2.ttf?8y3f2b")
			.headers(headers_26),
            http("request_36")
			.get(uri07 + ""),
            http("request_37")
			.get(uri06 + "?apiType=css&projectid=daef18a3-3be0-4413-a689-9b7111c44ec1"),
            http("request_38")
			.get(uri12 + "/static-content/webFonts/maur_webFont_theHand/Fonts/0e5707f8-ab3f-417a-b92a-87bce341bff7.woff2")
			.headers(headers_26),
            http("request_39")
			.get(uri12 + "/is/image/mauricesProdATG/EC1802_VIP_Footer_mBG2?qlt=65"),
            http("request_40")
			.get(uri12 + "/is/image/mauricesProdATG/EC1802_Cart_640x200"),
            http("request_41")
			.get("/assets/fonts/helvetica/466590fe-6258-47b0-bf9e-e6f71e9e70d0.woff2")
			.headers(headers_14),
            http("request_42")
			.get("/maurices/cart/cart.jsp")
			.headers(headers_4)))
		.pause(1)



		.exec(http("request_43")
			.get("/assets/scripts/pages/cart.min.js?ver=9d9480914dc34eceee00489a2aea9ff1a6fba506")
			.headers(headers_43)
			.resources(http("request_44")
			.get(uri10 + "/78790_C6215?$large$"),
            http("request_45")
			.get(uri01 + "/checkout-widget/config?apikey=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&externalClientId=&externalProfileId=mauricesvisacheckout&parentUrl=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcart%2Fcart.jsp&locale=en_US&browserLocale=&countryCode=US&allowEXO=false&allowCXO=false&buttonPosition=&postmessage=true&allowRXO=true&collectShipping=true")
			.headers(headers_2)
			.check(status.is(0)),
            http("request_46")
			.get(uri10 + "/78790_C6215_swatch"),
            http("request_47")
			.post("/maurices/baseAjaxServlet?pageId=MyFavorites")
			.headers(headers_47)
			.formParam("Action", "Cart.getFavorites")
			.formParam("isFavoritePage", "false")
			.formParam("dArgs", "")
			.formParam("sessionConfirmationNumber", ""),
            http("request_48")
			.get("/maurices/baseAjaxServlet?pageId=UserState&Action=Header.userState&userState_id=pageId%3Dcart&fetchFavorites=true&_=1554481856474")
			.headers(headers_0),
            http("request_49")
			.get(uri04 + "?height=47&width=288&cobrand=false&animation=false"),
            http("request_50")
			.post("/maurices/baseAjaxServlet?pageId=Rewards")
			.headers(headers_47)
			.formParam("Action", "Loyalty.getPointsAndCerts")
			.formParam("CHECKOUT", "true"),
            http("request_51")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Roman.woff2")
			.headers(headers_14),
            http("request_52")
			.get("/maurices/cart/cart.jsp?_=1554481856475")
			.headers(headers_3),
            http("request_53")
			.get(uri01 + "/checkout-widget/gtm?apikey=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&externalClientId=&externalProfileId=mauricesvisacheckout&parentUrl=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcart%2Fcart.jsp&locale=en_US&browserLocale=&countryCode=US&allowEXO=false&allowCXO=false&buttonPosition=&postmessage=true&allowRXO=true&collectShipping=true")
			.headers(headers_53),
            http("request_54")
			.get(uri01 + "/checkout-widget/config?apikey=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&externalClientId=&externalProfileId=mauricesvisacheckout&parentUrl=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcart%2Fcart.jsp&locale=en_US&browserLocale=&countryCode=US&allowEXO=false&allowCXO=false&buttonPosition=&postmessage=true&allowRXO=true&collectShipping=true")
			.headers(headers_53),
            http("request_55")
			.post(uri01 + "/logging/logCSPReport")
			.headers(headers_55)
			.body(RawFileBody("QVATB_0055_request.txt")),
            http("request_56")
			.get(uri01 + "/public/8513538f317138acd8cc52af43f06"),
            http("request_57")
			.get(uri01 + "/public/8513538f317138acd8cc52af43f06"),
            http("request_58")
			.post(uri01 + "/logging/logEvent")
			.headers(headers_58)
			.body(RawFileBody("QVATB_0058_request.txt")),
            http("request_59")
			.get(uri09 + "?id=GTM-KD2D59&l=vxo_data_layer"),
            http("request_60")
			.get(uri01 + "/wallet-services-web/merchant?profileOwner=&profileName=mauricesvisacheckout")
			.headers(headers_60),
            http("request_61")
			.get(uri04 + "?height=47&width=288&cobrand=false&animation=false&sliding=true"),
            http("request_62")
			.get(uri04 + "?height=47&width=288&cobrand=false&animation=false&loading=true"),
            http("request_63")
			.post(uri01 + "/logging/logCSPReport")
			.headers(headers_63)
			.body(RawFileBody("QVATB_0063_request.txt")),
            http("request_64")
			.get(uri02 + "?v=1&_v=j73&aip=1&a=290138767&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3DJSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k%26externalClientId%3D%26externalProfileId%3Dmauricesvisacheckout%26parentUrl%3Dhttps%253A%252F%252Fperf.maurices.com%252Fmaurices%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1280x720&vp=&je=0&ec=Merchant%20Site&ea=Visa%20Checkout%20Impression&el=Visa%20Checkout%20Button%20Impression&_u=YIAAAAAB~&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=1169376487.1554481864&gtm=2wg3r3KD2D59&cd3=undefined&cd4=Recognized-Username&cd5=1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd15=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=4&cd32=undefined&cd36=undefined&cd39=true&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=mauricesvisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd135=undefined&cd136=Mozilla%2F5.0%20(Windows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F73.0.3683.86%20Safari%2F537.36&cd137=unknown&cd143=false&cd144=false&cd150=https&cd152=false&cd153=undefined&cd158=true&cd159=not%20exists&cd160=true&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd171=undefined&z=1078515977"),
            http("request_65")
			.get(uri02 + "?v=1&_v=j73&aip=1&a=290138767&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3DJSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k%26externalClientId%3D%26externalProfileId%3Dmauricesvisacheckout%26parentUrl%3Dhttps%253A%252F%252Fperf.maurices.com%252Fmaurices%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1280x720&vp=&je=0&ec=Merchant%20Site&ea=Merchant%20Config%20Loaded&el=Merchant%20Config%20loaded%20Before%20Button%20Click&_u=YIAAAAAB~&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=1460943171.1554481864&gtm=2wg3r3KD2D59&cd3=undefined&cd5=1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd15=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=15&cd32=undefined&cd36=undefined&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=mauricesvisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd135=undefined&cd136=Mozilla%2F5.0%20(Windows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F73.0.3683.86%20Safari%2F537.36&cd137=unknown&cd143=false&cd144=false&cd150=https&cd151=780&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd171=undefined&z=477466761"),
            http("request_66")
			.get(uri02 + "?v=1&_v=j73&aip=1&a=290138767&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3DJSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k%26externalClientId%3D%26externalProfileId%3Dmauricesvisacheckout%26parentUrl%3Dhttps%253A%252F%252Fperf.maurices.com%252Fmaurices%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1280x720&vp=&je=0&ec=Merchant%20Site&ea=SSI%20Status&el=undefined%20VISA&_u=YIAAAAAB~&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=2086274072.1554481864&gtm=2wg3r3KD2D59&cd3=undefined&cd4=Recognized-Username&cd5=1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd15=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=13&cd32=undefined&cd36=undefined&cd39=true&cd69=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=mauricesvisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd135=undefined&cd150=https&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd171=undefined&cd73=undefined&cd79=undefined&cd122=web&z=157716528"),
            http("request_67")
			.get(uri02 + "?v=1&_v=j73&aip=1&a=290138767&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3DJSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k%26externalClientId%3D%26externalProfileId%3Dmauricesvisacheckout%26parentUrl%3Dhttps%253A%252F%252Fperf.maurices.com%252Fmaurices%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1280x720&vp=&je=0&ec=Merchant%20Site&ea=Remember%20me&el=false%20VISA&_u=YIAAAAAB~&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=462600924.1554481864&gtm=2wg3r3KD2D59&cd3=undefined&cd4=Recognized-Username&cd5=1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd15=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=11&cd32=undefined&cd36=undefined&cd39=true&cd69=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=mauricesvisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd135=undefined&cd150=https&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd171=undefined&cd73=undefined&cd79=undefined&cd122=web&z=1980170687"),
            http("request_68")
			.get(uri02 + "?v=1&_v=j73&aip=1&a=290138767&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3DJSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k%26externalClientId%3D%26externalProfileId%3Dmauricesvisacheckout%26parentUrl%3Dhttps%253A%252F%252Fperf.maurices.com%252Fmaurices%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1280x720&vp=&je=0&ec=Merchant%20Site&ea=User%20type&el=Recognized%20-%20Username%20VISA&_u=YIAAAAAB~&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=2050123875.1554481864&gtm=2wg3r3KD2D59&cd3=undefined&cd4=Recognized-Username&cd5=1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd15=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=9&cd32=undefined&cd36=undefined&cd39=true&cd69=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=mauricesvisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd135=undefined&cd150=https&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd171=undefined&cd73=undefined&cd79=undefined&cd122=web&z=161104293"),
            http("request_69")
			.get(uri02 + "?v=1&_v=j73&aip=1&a=290138767&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3DJSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k%26externalClientId%3D%26externalProfileId%3Dmauricesvisacheckout%26parentUrl%3Dhttps%253A%252F%252Fperf.maurices.com%252Fmaurices%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1280x720&vp=&je=0&ec=Merchant%20Site&ea=Visa%20Checkout%20Button%20Attributes&el=Visa%20Checkout%20Button%20Attributes&_u=YIAAAAAB~&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=1903758742.1554481864&gtm=2wg3r3KD2D59&cd3=undefined&cd5=1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd15=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=20&cd32=undefined&cd36=undefined&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=mauricesvisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd135=undefined&cd136=Mozilla%2F5.0%20(Windows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F73.0.3683.86%20Safari%2F537.36&cd137=unknown&cd143=false&cd144=false&cd150=https&cd151=780&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd171=undefined&cd145=https%3A%2F%2Fassets.secure.checkout.visa.com%2Fwallet-services-web%2Fxo%2Fbutton.png%3Fheight%3D47%26width%3D288%26cobrand%3Dfalse%26animation%3Dfalse&cd146=286&cd147=47&cd148=undefined&cd149=false&z=267954170"),
            http("request_70")
			.get(uri02 + "?v=1&_v=j73&aip=1&a=290138767&t=pageview&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3DJSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k%26externalClientId%3D%26externalProfileId%3Dmauricesvisacheckout%26parentUrl%3Dhttps%253A%252F%252Fperf.maurices.com%252Fmaurices%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1280x720&vp=&je=0&_u=aKAAgAAB~&jid=1114027519&gjid=1696821707&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=1287963383.1554481864&gtm=2wg3r3KD2D59&cd3=undefined&cd5=1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd15=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=20&cd32=undefined&cd36=undefined&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=mauricesvisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd171=undefined&z=1443315791"),
            http("request_71")
			.get(uri05 + "?t=dc&aip=1&_r=3&v=1&_v=j73&tid=UA-61684798-2&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&jid=1114027519&gjid=1696821707&_gid=1287963383.1554481864&_u=aKAAgAAB~&z=1756079519"),
            http("request_72")
			.post(uri01 + "/logging/logCSPReport")
			.headers(headers_63)
			.body(RawFileBody("QVATB_0072_request.txt"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}