package orderplacement

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class CartToOrderPlace extends Simulation {

	val httpProtocol = http
		.baseUrl("https://perf.maurices.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.(t|o)tf""", """.*\.png"""), WhiteList())

	val headers_0 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"cache-control" -> "max-age=0",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36")

	val headers_1 = Map("User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36")

	val headers_2 = Map(
		"Origin" -> "https://perf.maurices.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36")

	val headers_3 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "https://perf.maurices.com",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36")

	val headers_29 = Map(
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36")

	val headers_30 = Map(
		"accept" -> "application/json, text/javascript, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"origin" -> "https://perf.maurices.com",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_32 = Map(
		"accept" -> "application/json, text/javascript, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_33 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36")

	val headers_36 = Map(
		"Content-Type" -> "application/csp-report",
		"Origin" -> "https://secure.checkout.visa.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36")

	val headers_39 = Map(
		"accept" -> "text/javascript, application/javascript, application/ecmascript, application/x-ecmascript, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_40 = Map(
		"Accept" -> "application/json",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Content-type" -> "application/json",
		"Origin" -> "https://secure.checkout.visa.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36",
		"X-CORRELATION-ID" -> "2_1554630381_189_622_l55p004_CHECKOUT-WIDGET",
		"X-VISIT-ID" -> "VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET")

	val headers_41 = Map(
		"API_KEY" -> "JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k",
		"Accept" -> "application/json",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Content-type" -> "application/json",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36",
		"X-CORRELATION-ID" -> "2_1554630381_189_622_l55p004_CHECKOUT-WIDGET",
		"X-MERCHANT-API-KEY" -> "JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k")

	val headers_42 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Content-Type" -> "application/csp-report",
		"Origin" -> "https://secure.checkout.visa.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36")

	val headers_54 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"cache-control" -> "max-age=0",
		"origin" -> "https://perf.maurices.com",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36")

	val headers_69 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"clientid" -> "asc_web",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_71 = Map(
		"accept" -> "application/json, text/javascript, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"clientid" -> "asc_web",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_85 = Map(
		"accept" -> "text/plain, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"clientid" -> "asc_web",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_88 = Map(
		"accept" -> "application/json, text/javascript, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"checkoutstate" -> "SHIPPING",
		"clientid" -> "asc_web",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_93 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"clientid" -> "asc_web",
		"content-type" -> "application/json; charset=UTF-8",
		"origin" -> "https://perf.maurices.com",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_100 = Map(
		"accept" -> "application/json, text/javascript, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"checkoutstate" -> "PAYMENT",
		"clientid" -> "asc_web",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_107 = Map(
		"Accept" -> "application/json",
		"Content-type" -> "application/json",
		"Origin" -> "https://secure.checkout.visa.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36",
		"X-CORRELATION-ID" -> "1_1554630467_001_622_l73p199_CHECKOUT-WIDGET",
		"X-VISIT-ID" -> "VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET")

	val headers_134 = Map(
		"accept" -> "application/json, text/javascript, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"checkoutstate" -> "REVIEW",
		"clientid" -> "asc_web",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_141 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36")

	val headers_143 = Map(
		"accept" -> "text/css,*/*;q=0.1",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36")

	val headers_162 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36")

    val uri01 = "https://secure.checkout.visa.com"
    val uri02 = "https://maps.googleapis.com/maps/api/js"
    val uri03 = "https://www.google-analytics.com/collect"
    val uri04 = "https://s7d2.scene7.com.x.5e2d70c80a1b20468b0b39d0ae87a9075da9.9270ea41.id.opendns.com/s/s7d2.scene7.com/is/image/mauricesUatATG/Generic_CC_Maurices"
    val uri05 = "https://assets.secure.checkout.visa.com/wallet-services-web/xo/button.png"
    val uri06 = "https://stats.g.doubleclick.net/r/collect"
    val uri07 = "https://fast.fonts.net/t/1.css"
    val uri08 = "https://hello.myfonts.net/count/331b18"
    val uri09 = "https://s7d2.scene7.com/is/image/mauricesUatATG"
    val uri10 = "https://www.googletagmanager.com/gtm.js"
    val uri11 = "http://h.online-metrix.net"
    val uri12 = "https://www.google.com/ads/ga-audiences"
    val uri13 = "https://mauricesprodatg.scene7.com/is/image/mauricesProdATG"
    val uri15 = "https://sandbox.secure.checkout.visa.com/wallet-services-web/xo/button.png"
    val uri16 = "https://www.maurices.com/is/image/mauricesProdATG"
    val uri17 = "https://ds-aksb-a.akamaihd.net/2/609384/b"

	val scn = scenario("CartToOrderPlace")
		.exec(http("request_0")
			.get("/maurices/cart/cart.jsp")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/assets/styles/global_browse.min.css?ver=9d9480914dc34eceee00489a2aea9ff1a6fba506")
			.headers(headers_1),
            http("request_2")
			.get("/assets/fonts/helvetica/5a13f7d1-b615-418e-bc3a-525001b9a671.woff2")
			.headers(headers_2),
            http("request_3")
			.get("/assets/fonts/helvetica/b0868b4c-234e-47d3-bc59-41ab9de3c0db.woff2")
			.headers(headers_3),
            http("request_4")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Ex.woff2")
			.headers(headers_3),
            http("request_5")
			.get("/assets/fonts/helvetica/3600b37f-2bf1-45f3-be3a-03365f16d9cb.woff2")
			.headers(headers_3),
            http("request_6")
			.get("/assets/fonts/helvetica/e172a1c0-6e7f-4f0f-a2c9-c221c7b990bb.woff2")
			.headers(headers_2),
            http("request_7")
			.get("/assets/fonts/helvetica/466590fe-6258-47b0-bf9e-e6f71e9e70d0.woff2")
			.headers(headers_2),
            http("request_8")
			.get("/assets/fonts/helvetica/3b303641-706e-4221-94c4-4fb491f4f8ef.woff2")
			.headers(headers_3),
            http("request_9")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Bd.woff2")
			.headers(headers_3),
            http("request_10")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Md.woff2")
			.headers(headers_3),
            http("request_11")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Roman.woff2")
			.headers(headers_3),
            http("request_12")
			.get("/assets/fonts/helvetica/462d508d-efc7-478f-b84e-288eeb69a160.woff2")
			.headers(headers_2),
            http("request_13")
			.get("/assets/fonts/icon/mar-icon-font.woff?-hqky2s")
			.headers(headers_2),
            http("request_14")
			.get("/assets/fonts/icon/mar-icon-font-2.ttf?8y3f2b")
			.headers(headers_2),
            http("request_15")
			.get(uri16 + "/navSpot_shoes01_030118?qlt=80&fmt=pjpg")
			.headers(headers_1),
            http("request_16")
			.get(uri16 + "/navSpot_shoes02_030118?qlt=80&fmt=pjpg")
			.headers(headers_1),
            http("request_17")
			.get(uri16 + "/navSpot_shoes03_030118?qlt=80&fmt=pjpg")
			.headers(headers_1),
            http("request_18")
			.get(uri16 + "/EC1802_VIP_Footer_200x100")
			.headers(headers_1),
            http("request_19")
			.get(uri16 + "/EC1802_VIP_Footer_copy?fmt=png-alpha")
			.headers(headers_1),
            http("request_20")
			.get(uri16 + "/maurices-blog-logo")
			.headers(headers_1),
            http("request_21")
			.get(uri16 + "/EC1802_Cart_640x200")
			.headers(headers_1),
            http("request_22")
			.get(uri08 + "")
			.headers(headers_1),
            http("request_23")
			.get(uri07 + "?apiType=css&projectid=daef18a3-3be0-4413-a689-9b7111c44ec1")
			.headers(headers_1),
            http("request_24")
			.get(uri16 + "/EC1802_VIP_Footer_mBG2?qlt=65")
			.headers(headers_1)))
		.pause(2)
		.exec(http("request_25")
			.get("/assets/scripts/pages/cart.min.js?ver=9d9480914dc34eceee00489a2aea9ff1a6fba506")
			.headers(headers_1)
			.resources(http("request_26")
			.get(uri13 + "/61844C2_C740_swatch")
			.headers(headers_1),
            http("request_27")
			.get(uri13 + "/61844C2_C740?$large$")
			.headers(headers_1),
            http("request_28")
			.get(uri05 + "?height=47&width=288&cobrand=false&animation=false")
			.headers(headers_1),
            http("request_29")
			.get(uri01 + "/checkout-widget/config?apikey=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&externalClientId=&externalProfileId=mauricesvisacheckout&parentUrl=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcart%2Fcart.jsp&locale=en_US&browserLocale=&countryCode=US&allowEXO=false&allowCXO=false&buttonPosition=&postmessage=true&allowRXO=true&collectShipping=true")
			.headers(headers_29)
			.check(status.is(0)),
            http("request_30")
			.post("/maurices/baseAjaxServlet?pageId=Rewards")
			.headers(headers_30)
			.formParam("Action", "Loyalty.getPointsAndCerts")
			.formParam("CHECKOUT", "true"),
            http("request_31")
			.post("/maurices/baseAjaxServlet?pageId=MyFavorites")
			.headers(headers_30)
			.formParam("Action", "Cart.getFavorites")
			.formParam("isFavoritePage", "false")
			.formParam("dArgs", "")
			.formParam("sessionConfirmationNumber", ""),
            http("request_32")
			.get("/maurices/baseAjaxServlet?pageId=UserState&Action=Header.userState&userState_id=pageId%3Dcart&fetchFavorites=true&_=1554630374915")
			.headers(headers_32),
            http("request_33")
			.get(uri01 + "/checkout-widget/gtm?apikey=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&externalClientId=&externalProfileId=mauricesvisacheckout&parentUrl=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcart%2Fcart.jsp&locale=en_US&browserLocale=&countryCode=US&allowEXO=false&allowCXO=false&buttonPosition=&postmessage=true&allowRXO=true&collectShipping=true")
			.headers(headers_33),
            http("request_34")
			.get(uri01 + "/public/8513538f317138acd8cc52af43f06")
			.headers(headers_1),
            http("request_35")
			.get(uri10 + "?id=GTM-KD2D59&l=vxo_data_layer")
			.headers(headers_1),
            http("request_36")
			.post(uri01 + "/logging/logCSPReport")
			.headers(headers_36)
			.body(RawFileBody("CartToOrderPlace_0036_request.txt")),
            http("request_37")
			.get(uri01 + "/checkout-widget/config?apikey=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&externalClientId=&externalProfileId=mauricesvisacheckout&parentUrl=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcart%2Fcart.jsp&locale=en_US&browserLocale=&countryCode=US&allowEXO=false&allowCXO=false&buttonPosition=&postmessage=true&allowRXO=true&collectShipping=true")
			.headers(headers_33),
            http("request_38")
			.get(uri01 + "/public/8513538f317138acd8cc52af43f06")
			.headers(headers_1),
            http("request_39")
			.get("/maurices/cart/cart.jsp?_=1554630374916")
			.headers(headers_39),
            http("request_40")
			.post(uri01 + "/logging/logEvent")
			.headers(headers_40)
			.body(RawFileBody("CartToOrderPlace_0040_request.txt")),
            http("request_41")
			.get(uri01 + "/wallet-services-web/merchant?profileOwner=&profileName=mauricesvisacheckout")
			.headers(headers_41),
            http("request_42")
			.post(uri01 + "/logging/logCSPReport")
			.headers(headers_42)
			.body(RawFileBody("CartToOrderPlace_0042_request.txt")),
            http("request_43")
			.get(uri05 + "?height=47&width=288&cobrand=false&animation=false&loading=true")
			.headers(headers_1),
            http("request_44")
			.get(uri05 + "?height=47&width=288&cobrand=false&animation=false&sliding=true")
			.headers(headers_1),
            http("request_45")
			.get(uri03 + "?v=1&_v=j73&aip=1&a=1073336084&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3DJSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k%26externalClientId%3D%26externalProfileId%3Dmauricesvisacheckout%26parentUrl%3Dhttps%253A%252F%252Fperf.maurices.com%252Fmaurices%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1280x720&vp=&je=0&ec=Merchant%20Site&ea=Visa%20Checkout%20Impression&el=Visa%20Checkout%20Button%20Impression&_u=YIAAAAAB~&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=1361967351.1554630382&gtm=2wg3r3KD2D59&cd3=undefined&cd4=Recognized-Username&cd5=2_1554630381_189_622_l55p004_CHECKOUT-WIDGET&cd15=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=4&cd32=undefined&cd36=undefined&cd39=true&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=mauricesvisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd135=undefined&cd136=Mozilla%2F5.0%20(Windows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F73.0.3683.86%20Safari%2F537.36&cd137=unknown&cd143=false&cd144=false&cd150=https&cd152=false&cd153=undefined&cd158=true&cd159=not%20exists&cd160=true&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd171=undefined&z=816434532")
			.headers(headers_1),
            http("request_46")
			.get(uri03 + "?v=1&_v=j73&aip=1&a=1073336084&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3DJSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k%26externalClientId%3D%26externalProfileId%3Dmauricesvisacheckout%26parentUrl%3Dhttps%253A%252F%252Fperf.maurices.com%252Fmaurices%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1280x720&vp=&je=0&ec=Merchant%20Site&ea=User%20type&el=Recognized%20-%20Username%20VISA&_u=YIAAAAAB~&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=378293322.1554630382&gtm=2wg3r3KD2D59&cd3=undefined&cd4=Recognized-Username&cd5=2_1554630381_189_622_l55p004_CHECKOUT-WIDGET&cd15=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=9&cd32=undefined&cd36=undefined&cd39=true&cd69=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=mauricesvisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd135=undefined&cd150=https&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd171=undefined&cd73=undefined&cd79=undefined&cd122=web&z=2007647746")
			.headers(headers_1),
            http("request_47")
			.get(uri03 + "?v=1&_v=j73&aip=1&a=1073336084&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3DJSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k%26externalClientId%3D%26externalProfileId%3Dmauricesvisacheckout%26parentUrl%3Dhttps%253A%252F%252Fperf.maurices.com%252Fmaurices%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1280x720&vp=&je=0&ec=Merchant%20Site&ea=Remember%20me&el=false%20VISA&_u=YIAAAAAB~&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=489804242.1554630382&gtm=2wg3r3KD2D59&cd3=undefined&cd4=Recognized-Username&cd5=2_1554630381_189_622_l55p004_CHECKOUT-WIDGET&cd15=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=11&cd32=undefined&cd36=undefined&cd39=true&cd69=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=mauricesvisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd135=undefined&cd150=https&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd171=undefined&cd73=undefined&cd79=undefined&cd122=web&z=1590311222")
			.headers(headers_1),
            http("request_48")
			.get(uri03 + "?v=1&_v=j73&aip=1&a=1073336084&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3DJSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k%26externalClientId%3D%26externalProfileId%3Dmauricesvisacheckout%26parentUrl%3Dhttps%253A%252F%252Fperf.maurices.com%252Fmaurices%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1280x720&vp=&je=0&ec=Merchant%20Site&ea=SSI%20Status&el=undefined%20VISA&_u=YIAAAAAB~&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=215166633.1554630382&gtm=2wg3r3KD2D59&cd3=undefined&cd4=Recognized-Username&cd5=2_1554630381_189_622_l55p004_CHECKOUT-WIDGET&cd15=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=13&cd32=undefined&cd36=undefined&cd39=true&cd69=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=mauricesvisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd135=undefined&cd150=https&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd171=undefined&cd73=undefined&cd79=undefined&cd122=web&z=712189842")
			.headers(headers_1),
            http("request_49")
			.get(uri03 + "?v=1&_v=j73&aip=1&a=1073336084&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3DJSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k%26externalClientId%3D%26externalProfileId%3Dmauricesvisacheckout%26parentUrl%3Dhttps%253A%252F%252Fperf.maurices.com%252Fmaurices%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1280x720&vp=&je=0&ec=Merchant%20Site&ea=Merchant%20Config%20Loaded&el=Merchant%20Config%20loaded%20Before%20Button%20Click&_u=aIAAAAAB~&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=2144633211.1554630382&gtm=2wg3r3KD2D59&cd3=undefined&cd5=2_1554630381_189_622_l55p004_CHECKOUT-WIDGET&cd15=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=15&cd32=undefined&cd36=undefined&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=mauricesvisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd135=undefined&cd136=Mozilla%2F5.0%20(Windows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F73.0.3683.86%20Safari%2F537.36&cd137=unknown&cd143=false&cd144=false&cd150=https&cd151=318&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd171=undefined&z=1314073440")
			.headers(headers_1),
            http("request_50")
			.get(uri03 + "?v=1&_v=j73&aip=1&a=1073336084&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3DJSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k%26externalClientId%3D%26externalProfileId%3Dmauricesvisacheckout%26parentUrl%3Dhttps%253A%252F%252Fperf.maurices.com%252Fmaurices%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1280x720&vp=&je=0&ec=Merchant%20Site&ea=Visa%20Checkout%20Button%20Attributes&el=Visa%20Checkout%20Button%20Attributes&_u=aIAAAAAB~&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=1824932760.1554630383&gtm=2wg3r3KD2D59&cd3=undefined&cd5=2_1554630381_189_622_l55p004_CHECKOUT-WIDGET&cd15=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=20&cd32=undefined&cd36=undefined&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=mauricesvisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd135=undefined&cd136=Mozilla%2F5.0%20(Windows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F73.0.3683.86%20Safari%2F537.36&cd137=unknown&cd143=false&cd144=false&cd150=https&cd151=318&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd171=undefined&cd145=https%3A%2F%2Fassets.secure.checkout.visa.com%2Fwallet-services-web%2Fxo%2Fbutton.png%3Fheight%3D47%26width%3D288%26cobrand%3Dfalse%26animation%3Dfalse&cd146=286&cd147=47&cd148=undefined&cd149=false&z=2144124828")
			.headers(headers_1),
            http("request_51")
			.get(uri03 + "?v=1&_v=j73&aip=1&a=1073336084&t=pageview&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3DJSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k%26externalClientId%3D%26externalProfileId%3Dmauricesvisacheckout%26parentUrl%3Dhttps%253A%252F%252Fperf.maurices.com%252Fmaurices%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1280x720&vp=&je=0&_u=aKAAgAAB~&jid=1185032669&gjid=589453663&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=1155410440.1554630383&gtm=2wg3r3KD2D59&cd3=undefined&cd5=2_1554630381_189_622_l55p004_CHECKOUT-WIDGET&cd15=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=20&cd32=undefined&cd36=undefined&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=mauricesvisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd171=undefined&z=42627221")
			.headers(headers_1),
            http("request_52")
			.get(uri06 + "?t=dc&aip=1&_r=3&v=1&_v=j73&tid=UA-61684798-2&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&jid=1185032669&gjid=589453663&_gid=1155410440.1554630383&_u=aKAAgAAB~&z=388375525")
			.headers(headers_1),
            http("request_53")
			.post(uri01 + "/logging/logCSPReport")
			.headers(headers_42)
			.body(RawFileBody("CartToOrderPlace_0053_request.txt"))))
		.pause(10)



		.exec(http("request_54")
			.post("/maurices/common/templates/?_DARGS=/maurices/common/templates/cart-checkout-top-template.jsp")
			.headers(headers_54)
			.formParam("_dyncharset", "UTF-8")
			.formParam("_dynSessConf", "5345969101167728229")
			.formParam("/atg/commerce/order/purchase/CartModifierFormHandler.checkout", "secure checkout")
			.formParam("_D:/atg/commerce/order/purchase/CartModifierFormHandler.checkout", " ")
			.formParam("/com/ascena/commerce/order/purchase/ASCCheckoutFormHandler.fromCart", "true")
			.formParam("_D:/com/ascena/commerce/order/purchase/ASCCheckoutFormHandler.fromCart", " ")
			.formParam("/com/ascena/commerce/order/purchase/ASCCheckoutFormHandler.fromCart", "true")
			.formParam("_D:/com/ascena/commerce/order/purchase/ASCCheckoutFormHandler.fromCart", " ")
			.formParam("_DARGS", "/maurices/common/templates/cart-checkout-top-template.jsp")
			.resources(http("request_55")
			.get(uri02 + "?client=GME-ANNTAYLORINC&v=3.24&libraries=places")
			.headers(headers_1),
            http("request_56")
			.get("/assets/styles/spa-checkout.min.css?ver=9d9480914dc34eceee00489a2aea9ff1a6fba506")
			.headers(headers_1),
            http("request_57")
			.get("/assets/fonts/helvetica/5a13f7d1-b615-418e-bc3a-525001b9a671.woff2")
			.headers(headers_2),
            http("request_58")
			.get("/assets/fonts/helvetica/b0868b4c-234e-47d3-bc59-41ab9de3c0db.woff2")
			.headers(headers_3),
            http("request_59")
			.get("/assets/fonts/helvetica/462d508d-efc7-478f-b84e-288eeb69a160.woff2")
			.headers(headers_2),
            http("request_60")
			.get("/assets/fonts/helvetica/3600b37f-2bf1-45f3-be3a-03365f16d9cb.woff2")
			.headers(headers_3),
            http("request_61")
			.get("/assets/fonts/helvetica/3b303641-706e-4221-94c4-4fb491f4f8ef.woff2")
			.headers(headers_3),
            http("request_62")
			.get("/assets/fonts/helvetica/e172a1c0-6e7f-4f0f-a2c9-c221c7b990bb.woff2")
			.headers(headers_2),
            http("request_63")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Ex.woff2")
			.headers(headers_3),
            http("request_64")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Roman.woff2")
			.headers(headers_3),
            http("request_65")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Md.woff2")
			.headers(headers_3),
            http("request_66")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Bd.woff2")
			.headers(headers_3),
            http("request_67")
			.get("/assets/fonts/icon/mar-icon-font.woff?-hqky2s")
			.headers(headers_2),
            http("request_68")
			.get("/assets/scripts/pages/spa-checkout.min.js?ver=9d9480914dc34eceee00489a2aea9ff1a6fba506")
			.headers(headers_1),
            http("request_69")
			.get("/api/v1/content/labels?_=1554630397934")
			.headers(headers_69),
            http("request_70")
			.get("/api/v1/validation/rules?_=1554630397935")
			.headers(headers_69),
            http("request_71")
			.get("/api/v1/order/checkout/state?_=1554630397933")
			.headers(headers_71),
            http("request_72")
			.get("/api/v1/content/creditcard/data?_=1554630397942")
			.headers(headers_71),
            http("request_73")
			.get("/api/v1/address/states?_=1554630397943")
			.headers(headers_69),
            http("request_74")
			.get("/api/v1/cart/items?_=1554630397936")
			.headers(headers_71),
            http("request_75")
			.get("/api/v1/analytics/details?_=1554630397937")
			.headers(headers_32),
            http("request_76")
			.get("/api/v1/cart/summary?_=1554630397938")
			.headers(headers_71),
            http("request_77")
			.get("/api/v1/order/payment?_=1554630397940")
			.headers(headers_71),
            http("request_78")
			.get("/api/v1/giftcard/shipping?_=1554630397941")
			.headers(headers_71),
            http("request_79")
			.get("/api/v1/order/shipping?_=1554630397939")
			.headers(headers_71),
            http("request_80")
			.get("/api/v1/features?_=1554630397944")
			.headers(headers_69),
            http("request_81")
			.get(uri13 + "/61844C2_C740_swatch")
			.headers(headers_1),
            http("request_82")
			.get("/assets/fonts/AscenaIcons.ttf?y78ftm")
			.headers(headers_2),
            http("request_83")
			.get("/api/v1/content?contentCollection=/content/Shared/CheckoutHeader&_=1554630397945")
			.headers(headers_69),
            http("request_84")
			.get("/api/v1/content?contentCollection=/content/Shared/CheckoutFooter&_=1554630397946")
			.headers(headers_69),
            http("request_85")
			.get("/api/v1/content?contentCollection=/content/Shared/NeedHelpContent&_=1554630397947")
			.headers(headers_85),
            http("request_86")
			.get("/api/v1/content?contentCollection=/content/Shared/CheckoutContentSlot&_=1554630397948")
			.headers(headers_69),
            http("request_87")
			.get(uri13 + "/61844C2_C740?$xsmall$")
			.headers(headers_1),
            http("request_88")
			.get("/api/v1/analytics/details?_=1554630397949")
			.headers(headers_88),
            http("request_89")
			.get("/api/v1/order/payment/vco/init?_=1554630397950")
			.headers(headers_69),
            http("request_90")
			.get("/api/v1/order/shipping/store?_=1554630397951")
			.headers(headers_32)))
		.pause(2)



		.exec(http("request_91")
			.get(uri02 + "/AuthenticationService.Authenticate?1shttps%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcheckout%3F_requestid%3D774%23&2sGME-ANNTAYLORINC&callback=_xdc_._tacjzl&client=GME-ANNTAYLORINC&token=55050")
			.headers(headers_1))
		.pause(20)
		.exec(http("request_92")
			.get(uri02 + "/GeocodeService.Search?4s02169&7sUS&9sen-US&callback=_xdc_._x6euxy&client=GME-ANNTAYLORINC&token=22455")
			.headers(headers_1))
		.pause(26)


		.exec(http("request_93")
			.post("/api/v1/order/shipping/address")
			.headers(headers_93)
			.body(RawFileBody("CartToOrderPlace_0093_request.txt"))
			.resources(http("request_94")
			.post("/api/v1/order/payment")
			.headers(headers_93)
			.body(RawFileBody("CartToOrderPlace_0094_request.txt")),
            http("request_95")
			.get("/api/v1/cart/summary?_=1554630397953")
			.headers(headers_32),
            http("request_96")
			.get("/api/v1/giftcard/shipping?_=1554630397955")
			.headers(headers_32),
            http("request_97")
			.get("/api/v1/order/payment?_=1554630397954")
			.headers(headers_32),
            http("request_98")
			.get("/api/v1/order/shipping?_=1554630397952")
			.headers(headers_32),
            http("request_99")
			.get("/api/v1/analytics/details?_=1554630397956")
			.headers(headers_88)))
		.pause(5)


		.exec(http("request_100")
			.get("/api/v1/analytics/details?_=1554630397957")
			.headers(headers_100))
		.pause(2)



		.exec(http("request_101")
			.get(uri01 + "/checkout-widget/gtm?apikey=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&externalClientId=&externalProfileId=mauricesvisacheckout&parentUrl=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcheckout&locale=en_US&browserLocale=&countryCode=US&allowEXO=false&allowCXO=false&buttonPosition=&postmessage=true&allowRXO=true")
			.headers(headers_33)
			.resources(http("request_102")
			.get(uri01 + "/checkout-widget/config?apikey=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&externalClientId=&externalProfileId=mauricesvisacheckout&parentUrl=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcheckout&locale=en_US&browserLocale=&countryCode=US&allowEXO=false&allowCXO=false&buttonPosition=&postmessage=true&allowRXO=true")
			.headers(headers_33),
            http("request_103")
			.get(uri09 + "/Generic_CC_Maurices?$CCThumb$")
			.headers(headers_1),
            http("request_104")
			.get(uri01 + "/public/8513538f317138acd8cc52af43f06")
			.headers(headers_1),
            http("request_105")
			.get(uri04 + "?X-OpenDNS-Session=_5e2d70c80a1b20468b0b39d0ae87a9075da99270ea41_MRqYDzf4_$CCThumb$")
			.headers(headers_1),
            http("request_106")
			.get(uri09 + "/Generic_CC_Maurices?X-OpenDNS-Session=_5e2d70c80a1b20468b0b39d0ae87a9075da99270ea41_MRqYDzf4_$CCThumb$")
			.headers(headers_1),
            http("request_107")
			.post(uri01 + "/logging/logEvent")
			.headers(headers_107)
			.body(RawFileBody("CartToOrderPlace_0107_request.txt")),
            http("request_108")
			.post(uri01 + "/logging/logCSPReport")
			.headers(headers_36)
			.body(RawFileBody("CartToOrderPlace_0108_request.txt")),
            http("request_109")
			.post(uri01 + "/logging/logCSPReport")
			.headers(headers_36)
			.body(RawFileBody("CartToOrderPlace_0109_request.txt")),
            http("request_110")
			.get(uri09 + "/Generic_CC_Visa?$CCThumb$")
			.headers(headers_1),
            http("request_111")
			.get(uri09 + "/Generic_CC_American%20Express?$CCThumb$")
			.headers(headers_1),
            http("request_112")
			.get(uri09 + "/Generic_CC_Discover?$CCThumb$")
			.headers(headers_1),
            http("request_113")
			.get(uri09 + "/Generic_CC_MasterCard?$CCThumb$")
			.headers(headers_1),
            http("request_114")
			.get(uri09 + "/Generic_CC_Maurices?$CCThumb$")
			.headers(headers_1),
            http("request_115")
			.get(uri15 + "?height=47&width=230&cobrand=false")
			.headers(headers_1),
            http("request_116")
			.get(uri15 + "?height=47&width=230&cobrand=false&loading=true")
			.headers(headers_1),
            http("request_117")
			.get(uri03 + "?v=1&_v=j73&aip=1&a=1794827933&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3DJSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k%26externalClientId%3D%26externalProfileId%3Dmauricesvisacheckout%26parentUrl%3Dhttps%253A%252F%252Fperf.maurices.com%252Fmaurices%252Fcheckout%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue&dr=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcheckout%3F_requestid%3D774&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1280x720&vp=&je=0&ec=Merchant%20Site&ea=SSI%20Status&el=undefined%20VISA&_u=YIAAAAAB~&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=14077296.1554630471&gtm=2wg3r3KD2D59&cd3=undefined&cd4=Recognized-Username&cd5=1_1554630467_001_622_l73p199_CHECKOUT-WIDGET&cd15=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=13&cd32=undefined&cd36=undefined&cd39=true&cd69=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=mauricesvisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd135=undefined&cd150=https&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd171=undefined&cd73=undefined&cd79=undefined&cd122=web&z=1963422991")
			.headers(headers_1),
            http("request_118")
			.get(uri03 + "?v=1&_v=j73&aip=1&a=1794827933&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3DJSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k%26externalClientId%3D%26externalProfileId%3Dmauricesvisacheckout%26parentUrl%3Dhttps%253A%252F%252Fperf.maurices.com%252Fmaurices%252Fcheckout%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue&dr=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcheckout%3F_requestid%3D774&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1280x720&vp=&je=0&ec=Merchant%20Site&ea=Visa%20Checkout%20Impression&el=Visa%20Checkout%20Button%20Impression&_u=YIAAAAAB~&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=713106564.1554630471&gtm=2wg3r3KD2D59&cd3=undefined&cd4=Recognized-Username&cd5=1_1554630467_001_622_l73p199_CHECKOUT-WIDGET&cd15=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=4&cd32=undefined&cd36=undefined&cd39=true&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=mauricesvisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd135=undefined&cd136=Mozilla%2F5.0%20(Windows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F73.0.3683.86%20Safari%2F537.36&cd137=unknown&cd143=false&cd144=false&cd150=https&cd152=false&cd153=undefined&cd158=true&cd159=not%20exists&cd160=true&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd171=undefined&z=657671705")
			.headers(headers_1),
            http("request_119")
			.get(uri03 + "?v=1&_v=j73&aip=1&a=1794827933&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3DJSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k%26externalClientId%3D%26externalProfileId%3Dmauricesvisacheckout%26parentUrl%3Dhttps%253A%252F%252Fperf.maurices.com%252Fmaurices%252Fcheckout%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue&dr=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcheckout%3F_requestid%3D774&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1280x720&vp=&je=0&ec=Merchant%20Site&ea=Remember%20me&el=false%20VISA&_u=YIAAAAAB~&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=270041012.1554630471&gtm=2wg3r3KD2D59&cd3=undefined&cd4=Recognized-Username&cd5=1_1554630467_001_622_l73p199_CHECKOUT-WIDGET&cd15=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=11&cd32=undefined&cd36=undefined&cd39=true&cd69=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=mauricesvisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd135=undefined&cd150=https&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd171=undefined&cd73=undefined&cd79=undefined&cd122=web&z=80825785")
			.headers(headers_1),
            http("request_120")
			.get(uri03 + "?v=1&_v=j73&aip=1&a=1794827933&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3DJSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k%26externalClientId%3D%26externalProfileId%3Dmauricesvisacheckout%26parentUrl%3Dhttps%253A%252F%252Fperf.maurices.com%252Fmaurices%252Fcheckout%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue&dr=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcheckout%3F_requestid%3D774&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1280x720&vp=&je=0&ec=Merchant%20Site&ea=Merchant%20Config%20Loaded&el=Merchant%20Config%20loaded%20Before%20Button%20Click&_u=YIAAAAAB~&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=1175460720.1554630471&gtm=2wg3r3KD2D59&cd3=undefined&cd5=1_1554630467_001_622_l73p199_CHECKOUT-WIDGET&cd15=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=15&cd32=undefined&cd36=undefined&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=mauricesvisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd135=undefined&cd136=Mozilla%2F5.0%20(Windows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F73.0.3683.86%20Safari%2F537.36&cd137=unknown&cd143=false&cd144=false&cd150=https&cd151=1492&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd171=undefined&z=1224011257")
			.headers(headers_1),
            http("request_121")
			.get(uri03 + "?v=1&_v=j73&aip=1&a=1794827933&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3DJSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k%26externalClientId%3D%26externalProfileId%3Dmauricesvisacheckout%26parentUrl%3Dhttps%253A%252F%252Fperf.maurices.com%252Fmaurices%252Fcheckout%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue&dr=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcheckout%3F_requestid%3D774&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1280x720&vp=&je=0&ec=Merchant%20Site&ea=User%20type&el=Recognized%20-%20Username%20VISA&_u=YIAAAAAB~&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=1182375110.1554630471&gtm=2wg3r3KD2D59&cd3=undefined&cd4=Recognized-Username&cd5=1_1554630467_001_622_l73p199_CHECKOUT-WIDGET&cd15=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=9&cd32=undefined&cd36=undefined&cd39=true&cd69=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=mauricesvisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd135=undefined&cd150=https&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd171=undefined&cd73=undefined&cd79=undefined&cd122=web&z=192424550")
			.headers(headers_1),
            http("request_122")
			.get(uri03 + "?v=1&_v=j73&aip=1&a=1794827933&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3DJSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k%26externalClientId%3D%26externalProfileId%3Dmauricesvisacheckout%26parentUrl%3Dhttps%253A%252F%252Fperf.maurices.com%252Fmaurices%252Fcheckout%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue&dr=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcheckout%3F_requestid%3D774&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1280x720&vp=&je=0&ec=Merchant%20Site&ea=Visa%20Checkout%20Button%20Attributes&el=Visa%20Checkout%20Button%20Attributes&_u=YIAAAAAB~&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=1776040320.1554630471&gtm=2wg3r3KD2D59&cd3=undefined&cd5=1_1554630467_001_622_l73p199_CHECKOUT-WIDGET&cd15=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=20&cd32=undefined&cd36=undefined&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=mauricesvisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd135=undefined&cd136=Mozilla%2F5.0%20(Windows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F73.0.3683.86%20Safari%2F537.36&cd137=unknown&cd143=false&cd144=false&cd150=https&cd151=1492&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd171=undefined&cd145=https%3A%2F%2Fsandbox.secure.checkout.visa.com%2Fwallet-services-web%2Fxo%2Fbutton.png%3Fheight%3D47%26width%3D230%26cobrand%3Dfalse&cd146=undefined&cd147=undefined&cd148=undefined&cd149=false&z=1882351629")
			.headers(headers_1),
            http("request_123")
			.get(uri03 + "?v=1&_v=j73&aip=1&a=1794827933&t=pageview&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3DJSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k%26externalClientId%3D%26externalProfileId%3Dmauricesvisacheckout%26parentUrl%3Dhttps%253A%252F%252Fperf.maurices.com%252Fmaurices%252Fcheckout%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue&dr=https%3A%2F%2Fperf.maurices.com%2Fmaurices%2Fcheckout%3F_requestid%3D774&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1280x720&vp=&je=0&_u=aKAAgAAB~&jid=604141835&gjid=2086556975&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=1213057810.1554630471&gtm=2wg3r3KD2D59&cd3=undefined&cd5=1_1554630467_001_622_l73p199_CHECKOUT-WIDGET&cd15=JSFVC07QMIRV4XPH0QXQ21udpFwVT-vtKCeRdNM_ymZNSdr7k&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=20&cd32=undefined&cd36=undefined&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=mauricesvisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd171=undefined&z=1038747328")
			.headers(headers_1),
            http("request_124")
			.get(uri06 + "?t=dc&aip=1&_r=3&v=1&_v=j73&tid=UA-61684798-2&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&jid=604141835&gjid=2086556975&_gid=1213057810.1554630471&_u=aKAAgAAB~&z=136467361")
			.headers(headers_1),
            http("request_125")
			.get(uri12 + "?v=1&aip=1&t=sr&_r=4&tid=UA-61684798-2&cid=VID_1_1554481861_073_513_l73p129_CHECKOUT-WIDGET&jid=604141835&_v=j73&z=136467361")
			.headers(headers_1),
            http("request_126")
			.post(uri01 + "/logging/logCSPReport")
			.headers(headers_36)
			.body(RawFileBody("CartToOrderPlace_0126_request.txt"))))
		.pause(21)



		.exec(http("request_127")
			.post("/api/v1/order/payment/creditcard")
			.headers(headers_93)
			.body(RawFileBody("CartToOrderPlace_0127_request.txt"))
			.resources(http("request_128")
			.get("/feature/cyberSourceFingerPrinting/includes/global/cyberSourceFingerPrinting.jsp?pageId=checkout-review&_=1554630397958")
			.headers(headers_69),
            http("request_129")
			.get(uri11 + "/check.js?org_id=1snn5n9w&session_id=ascena_mauricesETD3Lnl3J1MMg3e9K9HkNOW83WKypVfOwPjdrQacdgkBFBPOs_pJ!-1233909089!1554630211959&_=1554630397963")
			.check(status.is(0)),
            http("request_130")
			.get("/api/v1/cart/items?_=1554630397962")
			.headers(headers_32),
            http("request_131")
			.get("/api/v1/cart/summary?_=1554630397961")
			.headers(headers_32),
            http("request_132")
			.get("/api/v1/order/shipping?_=1554630397960")
			.headers(headers_32),
            http("request_133")
			.get("/api/v1/order/payment?_=1554630397959")
			.headers(headers_32),
            http("request_134")
			.get("/api/v1/analytics/details?_=1554630397964")
			.headers(headers_134),
            http("request_135")
			.get(uri11 + "/clear.png?org_id=1snn5n9w&session_id=ascena_mauricesETD3Lnl3J1MMg3e9K9HkNOW83WKypVfOwPjdrQacdgkBFBPOs_pJ!-1233909089!1554630211959&m=2")
			.headers(headers_1)
			.check(status.is(400)),
            http("request_136")
			.get(uri11 + "/clear.png?org_id=1snn5n9w&session_id=ascena_mauricesETD3Lnl3J1MMg3e9K9HkNOW83WKypVfOwPjdrQacdgkBFBPOs_pJ!-1233909089!1554630211959&m=1")
			.headers(headers_1)
			.check(status.is(400)),
            http("request_137")
			.get("/api/v1/analytics/details?_=1554630397965")
			.headers(headers_134),
            http("request_138")
			.get(uri09 + "/Generic_CC_Visa")
			.headers(headers_1)))
		.pause(8)




		.exec(http("request_139")
			.get("/api/v1/analytics/details?_=1554630397966")
			.headers(headers_71)
			.resources(http("request_140")
			.post("/api/v1/order/place")
			.headers(headers_93)
			.body(RawFileBody("CartToOrderPlace_0140_request.txt")),
            http("request_141")
			.get("/checkout/checkout.jsp?fromPage=SPC&isSPC=true&checkoutState=CONFIRMATION")
			.headers(headers_141),
            http("request_142")
			.get(uri09 + "/Generic_CC_Visa")
			.headers(headers_1),
            http("request_143")
			.get("/assets/styles/global_checkout.min.css?ver=9d9480914dc34eceee00489a2aea9ff1a6fba506")
			.headers(headers_143),
            http("request_144")
			.get("/assets/fonts/helvetica/5a13f7d1-b615-418e-bc3a-525001b9a671.woff2")
			.headers(headers_2),
            http("request_145")
			.get("/assets/fonts/helvetica/b0868b4c-234e-47d3-bc59-41ab9de3c0db.woff2")
			.headers(headers_3),
            http("request_146")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Ex.woff2")
			.headers(headers_3),
            http("request_147")
			.get("/assets/fonts/helvetica/3600b37f-2bf1-45f3-be3a-03365f16d9cb.woff2")
			.headers(headers_3),
            http("request_148")
			.get("/assets/fonts/helvetica/e172a1c0-6e7f-4f0f-a2c9-c221c7b990bb.woff2")
			.headers(headers_2),
            http("request_149")
			.get("/assets/fonts/helvetica/466590fe-6258-47b0-bf9e-e6f71e9e70d0.woff2")
			.headers(headers_2),
            http("request_150")
			.get("/assets/fonts/helvetica/3b303641-706e-4221-94c4-4fb491f4f8ef.woff2")
			.headers(headers_3),
            http("request_151")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Bd.woff2")
			.headers(headers_3),
            http("request_152")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Md.woff2")
			.headers(headers_3),
            http("request_153")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Roman.woff2")
			.headers(headers_3),
            http("request_154")
			.get("/assets/fonts/helvetica/462d508d-efc7-478f-b84e-288eeb69a160.woff2")
			.headers(headers_2),
            http("request_155")
			.get("/assets/fonts/icon/mar-icon-font.woff?-hqky2s")
			.headers(headers_2),
            http("request_156")
			.get("/assets/fonts/icon/mar-icon-font-2.ttf?8y3f2b")
			.headers(headers_2),
            http("request_157")
			.get(uri16 + "/EC1802_VIP_Footer_200x100")
			.headers(headers_1),
            http("request_158")
			.get(uri16 + "/mau_co-confirm_sp17_01-1?qlt=70")
			.headers(headers_1),
            http("request_159")
			.get(uri16 + "/EC1802_VIP_Footer_copy?fmt=png-alpha")
			.headers(headers_1),
            http("request_160")
			.get(uri16 + "/maurices-blog-logo")
			.headers(headers_1),
            http("request_161")
			.get(uri16 + "/EC1802_VIP_Footer_mBG2?qlt=65")
			.headers(headers_1)))
		.pause(1)





		.exec(http("request_162")
			.get("/assets/scripts/pages/checkout-confirmation.min.js?ver=9d9480914dc34eceee00489a2aea9ff1a6fba506")
			.headers(headers_162))
		.pause(1)
		.exec(http("request_163")
			.get(uri13 + "/61844C2_C740_swatch")
			.headers(headers_1)
			.resources(http("request_164")
			.get(uri13 + "/61844C2_C740?$large$")
			.headers(headers_1),
            http("request_165")
			.post("/maurices/baseAjaxServlet?pageId=MyFavorites")
			.headers(headers_30)
			.formParam("Action", "Cart.getFavorites")
			.formParam("isFavoritePage", "false")
			.formParam("dArgs", "")
			.formParam("sessionConfirmationNumber", ""),
            http("request_166")
			.post("/maurices/baseAjaxServlet?pageId=Rewards")
			.headers(headers_30)
			.formParam("Action", "Loyalty.getPointsAndCerts")
			.formParam("CHECKOUT", "true"),
            http("request_167")
			.get("/maurices/baseAjaxServlet?pageId=UserState&Action=Header.userState&fetchFavorites=false&_=1554630527422")
			.headers(headers_32),
            http("request_168")
			.get(uri17 + "?dE=0&cS=0&cE=0&rqS=34&rsS=19174&rsE=19180&sS=&dl=19192&di=20114&fp=19862&dlS=20114&dlE=22299&dc=24749&leS=24749&leE=24749&to=&ol=0&cr=299&mt=&mb=&b=133377&u=https%3A//perf.maurices.com/checkout/checkout.jsp&ua=Mozilla/5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit/537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome/73.0.3683.86%20Safari/537.36&pl=Win32&us=&gh=184.51.101.223&t=&rid=2816558e&r=19860&akM=&akN=ae&vc=14:17&bpcip=42e6fc00&akTX=1&akTI=2816558e&ai=402012&pmgn=&pmgi=&pmp=")
			.headers(headers_1),
            http("request_169")
			.get("/checkout/checkout.jsp?fromPage=SPC&isSPC=true&checkoutState=CONFIRMATION&_=1554630527423")
			.headers(headers_39)))




	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}