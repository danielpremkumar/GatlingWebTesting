package intellijrecording

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("https://perf.maurices.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.(t|o)tf""", """.*\.png"""), WhiteList())
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:60.0) Gecko/20100101 Firefox/60.0")

	val headers_0 = Map(
		"Accept-Encoding" -> "gzip, deflate",
		"Pragma" -> "no-cache")

	val headers_2 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_8 = Map(
		"Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "identity")

	val headers_13 = Map("Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8")

	val headers_19 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_39 = Map(
		"Accept" -> "text/javascript, application/javascript, application/ecmascript, application/x-ecmascript, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_43 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_59 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_68 = Map(
		"X-Requested-With" -> "XMLHttpRequest",
		"clientId" -> "asc_web")

	val headers_69 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest",
		"clientId" -> "asc_web")

	val headers_80 = Map(
		"Accept" -> "text/plain, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest",
		"clientId" -> "asc_web")

	val headers_89 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest",
		"checkoutState" -> "SHIPPING",
		"clientId" -> "asc_web")

	val headers_90 = Map(
		"Content-Type" -> "application/json; charset=UTF-8",
		"X-Requested-With" -> "XMLHttpRequest",
		"clientId" -> "asc_web")

	val headers_97 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest",
		"checkoutState" -> "PAYMENT",
		"clientId" -> "asc_web")

	val headers_107 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest",
		"checkoutState" -> "REVIEW",
		"clientId" -> "asc_web")

	val headers_108 = Map("Accept-Encoding" -> "gzip, deflate")

	val headers_115 = Map("Accept" -> "text/css,*/*;q=0.1")

    val uri1 = "https://maps.googleapis.com/maps/api/js"
    val uri2 = "https://assets.secure.checkout.visa.com/checkout-widget/resources/js/integration/v1/sdk.js"
    val uri3 = "http://detectportal.firefox.com/success.txt"
    val uri4 = "http://h.online-metrix.net/clear.png"
    val uri5 = "https://mauricesprodatg.scene7.com"
    val uri7 = "https://www.maurices.com"

	val scn = scenario("RecordedSimulation")

		// HomePage

		.exec(http("request_2")
			.get("/")
			.headers(headers_2)
			)
		.pause(15)
		// PLP
		.exec(http("request_20")
			.get("/p/clothing/tops/N-10530?nav=clothing:tops")
			.headers(headers_2)
			.resources(http("request_21")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_22")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_23")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_24")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_25")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_26")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_27")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_28")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_29")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_30")
			.get("/assets/scripts/pages/plp.min.js?ver=9d9480914dc34eceee00489a2aea9ff1a6fba506"),
            http("request_31")
			.get("/maurices/baseAjaxServlet?pageId=UserState&Action=Header.userState&userState_id=catId%3D3001%26nav%3D10530&fetchFavorites=true&_=1554644699074")
			.headers(headers_19),
            http("request_32")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_33")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_34")
			.get(uri3 + "")
			.headers(headers_0)))
		.pause(7)
		// QV
		.exec(http("request_35")
			.get(uri3 + "")
			.headers(headers_0))
		.pause(1)
		.exec(http("request_36")
			.get("/maurices/baseAjaxServlet?pageId=QV_GetInventory&Action=QuickView.getInventory&id=78790")
			.headers(headers_19)
			.resources(http("request_37")
			.get("/maurices/baseAjaxServlet?pageId=QV_GetProduct&Action=QuickView.getProduct&id=78790")
			.headers(headers_19),
            http("request_38")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_39")
			.get("/p/clothing/tops/N-10530?nav=clothing:tops&_=1554644699081")
			.headers(headers_39),
            http("request_40")
			.get("/assets/fonts/helvetica/462d508d-efc7-478f-b84e-288eeb69a160.woff2")
			.headers(headers_8),
            http("request_41")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_42")
			.get(uri3 + "")
			.headers(headers_0)))
		.pause(7)
		// ATB
		.exec(http("request_43")
			.post("/maurices/baseAjaxServlet?pageId=QV_AddToCart")
			.headers(headers_43)
			.formParam("Action", "QuickView.addToCart")
			.formParam("skuId", "23609282")
			.formParam("quantity", "1")
			.formParam("productId", "78790")
			.formParam("sessionConfirmationNumber", "-6650142896809372666")
			.resources(http("request_44")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Ex.woff2")
			.headers(headers_8),
            http("request_45")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Bd.woff2")
			.headers(headers_8),
            http("request_46")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_47")
			.get(uri3 + "")
			.headers(headers_0)))
		.pause(4)
		.exec(http("request_48")
			.get(uri3 + "")
			.headers(headers_0))
		.pause(3)
		// MiniCart
		.exec(http("request_49")
			.get(uri3 + "")
			.headers(headers_0)
			.resources(http("request_50")
			.post("/maurices/baseAjaxServlet?pageId=UpdateCart")
			.headers(headers_43)
			.formParam("Action", "Cart.fetchMiniCartValues")
			.formParam("sessionConfirmationNumber", "-6650142896809372666"),
            http("request_51")
			.get(uri3 + "")
			.headers(headers_0)))
		.pause(6)
		// Cart
		.exec(http("request_52")
			.get("/maurices/cart/cart.jsp")
			.headers(headers_2)
			.resources(http("request_53")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_54")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_55")
			.get("/assets/fonts/helvetica/466590fe-6258-47b0-bf9e-e6f71e9e70d0.woff2")
			.headers(headers_8),
            http("request_56")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_57")
			.get("/assets/scripts/pages/cart.min.js?ver=9d9480914dc34eceee00489a2aea9ff1a6fba506"),
            http("request_58")
			.get("/maurices/baseAjaxServlet?pageId=UserState&Action=Header.userState&userState_id=pageId%3Dcart&fetchFavorites=true&_=1554644741271")
			.headers(headers_19),
            http("request_59")
			.post("/maurices/baseAjaxServlet?pageId=MyFavorites")
			.headers(headers_59)
			.formParam("Action", "Cart.getFavorites")
			.formParam("isFavoritePage", "false")
			.formParam("dArgs", "")
			.formParam("sessionConfirmationNumber", ""),
            http("request_60")
			.post("/maurices/baseAjaxServlet?pageId=Rewards")
			.headers(headers_59)
			.formParam("Action", "Loyalty.getPointsAndCerts")
			.formParam("CHECKOUT", "true"),
            http("request_61")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_62")
			.get("/maurices/cart/cart.jsp?_=1554644741272")
			.headers(headers_39),
            http("request_63")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Roman.woff2")
			.headers(headers_8)))
		.pause(9)
		// Checkout
		.exec(http("request_64")
			.post("/maurices/common/templates/?_DARGS=/maurices/common/templates/cart-checkout-top-template.jsp")
			.headers(headers_2)
			.formParam("_dyncharset", "UTF-8")
			.formParam("_dynSessConf", "-6650142896809372666")
			.formParam("/atg/commerce/order/purchase/CartModifierFormHandler.checkout", "secure checkout")
			.formParam("_D:/atg/commerce/order/purchase/CartModifierFormHandler.checkout", " ")
			.formParam("/com/ascena/commerce/order/purchase/ASCCheckoutFormHandler.fromCart", "true")
			.formParam("_D:/com/ascena/commerce/order/purchase/ASCCheckoutFormHandler.fromCart", " ")
			.formParam("/com/ascena/commerce/order/purchase/ASCCheckoutFormHandler.fromCart", "true")
			.formParam("_D:/com/ascena/commerce/order/purchase/ASCCheckoutFormHandler.fromCart", " ")
			.formParam("_DARGS", "/maurices/common/templates/cart-checkout-top-template.jsp")
			.resources(http("request_65")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_66")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_67")
			.get("/assets/scripts/pages/spa-checkout.min.js?ver=9d9480914dc34eceee00489a2aea9ff1a6fba506"),
            http("request_68")
			.get("/api/v1/validation/rules?_=1554644757519")
			.headers(headers_68),
            http("request_69")
			.get("/api/v1/order/checkout/state?_=1554644757517")
			.headers(headers_69),
            http("request_70")
			.get("/api/v1/analytics/details?_=1554644757521")
			.headers(headers_19),
            http("request_71")
			.get("/api/v1/cart/items?_=1554644757520")
			.headers(headers_69),
            http("request_72")
			.get("/api/v1/cart/summary?_=1554644757522")
			.headers(headers_69),
            http("request_73")
			.get("/api/v1/content/creditcard/data?_=1554644757526")
			.headers(headers_69),
            http("request_74")
			.get("/api/v1/content/labels?_=1554644757518")
			.headers(headers_68),
            http("request_75")
			.get("/api/v1/giftcard/shipping?_=1554644757525")
			.headers(headers_69),
            http("request_76")
			.get("/api/v1/order/shipping?_=1554644757523")
			.headers(headers_69),
            http("request_77")
			.get("/api/v1/order/payment?_=1554644757524")
			.headers(headers_69),
            http("request_78")
			.get("/api/v1/address/states?_=1554644757527")
			.headers(headers_68),
            http("request_79")
			.get("/api/v1/features?_=1554644757528")
			.headers(headers_68),
            http("request_80")
			.get("/api/v1/content?contentCollection=/content/Shared/NeedHelpContent&_=1554644757531")
			.headers(headers_80),
            http("request_81")
			.get("/api/v1/content?contentCollection=/content/Shared/CheckoutHeader&_=1554644757529")
			.headers(headers_68),
            http("request_82")
			.get("/api/v1/content?contentCollection=/content/Shared/CheckoutContentSlot&_=1554644757532")
			.headers(headers_68),
            http("request_83")
			.get("/assets/fonts/AscenaIcons.ttf?y78ftm")
			.headers(headers_13),
            http("request_84")
			.get("/api/v1/content?contentCollection=/content/Shared/CheckoutFooter&_=1554644757530")
			.headers(headers_68),
            http("request_85")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Md.woff2")
			.headers(headers_8),
            http("request_86")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_87")
			.get("/api/v1/order/payment/vco/init?_=1554644757534")
			.headers(headers_68),
            http("request_88")
			.get("/api/v1/order/shipping/store?_=1554644757535")
			.headers(headers_19),
            http("request_89")
			.get("/api/v1/analytics/details?_=1554644757533")
			.headers(headers_89)))
		.pause(37)
		// SaveAndContinue
		.exec(http("request_90")
			.post("/api/v1/order/shipping/address")
			.headers(headers_90)
			.body(RawFileBody("RecordedSimulation_0090_request.txt"))
			.resources(http("request_91")
			.post("/api/v1/order/payment")
			.headers(headers_90)
			.body(RawFileBody("RecordedSimulation_0091_request.txt")),
            http("request_92")
			.get("/api/v1/cart/summary?_=1554644757537")
			.headers(headers_19),
            http("request_93")
			.get("/api/v1/giftcard/shipping?_=1554644757539")
			.headers(headers_19),
            http("request_94")
			.get("/api/v1/order/shipping?_=1554644757536")
			.headers(headers_19),
            http("request_95")
			.get("/api/v1/order/payment?_=1554644757538")
			.headers(headers_19),
            http("request_96")
			.get("/api/v1/analytics/details?_=1554644757540")
			.headers(headers_89),
            http("request_97")
			.get("/api/v1/analytics/details?_=1554644757541")
			.headers(headers_97),
            http("request_98")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_99")
			.get(uri3 + "")
			.headers(headers_0)))
		.pause(23)
		// Review
		.exec(http("request_100")
			.post("/api/v1/order/payment/creditcard")
			.headers(headers_90)
			.body(RawFileBody("RecordedSimulation_0100_request.txt"))
			.resources(http("request_101")
			.get("/api/v1/cart/items?_=1554644757546")
			.headers(headers_19),
            http("request_102")
			.get("/feature/cyberSourceFingerPrinting/includes/global/cyberSourceFingerPrinting.jsp?pageId=checkout-review&_=1554644757542")
			.headers(headers_68),
            http("request_103")
			.get("/api/v1/order/payment?_=1554644757543")
			.headers(headers_19),
            http("request_104")
			.get("/api/v1/order/shipping?_=1554644757544")
			.headers(headers_19),
            http("request_105")
			.get("/api/v1/cart/summary?_=1554644757545")
			.headers(headers_19),
            http("request_106")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_107")
			.get("/api/v1/analytics/details?_=1554644757548")
			.headers(headers_107),
            http("request_108")
			.get(uri4 + "?org_id=1snn5n9w&session_id=ascena_mauricesieb4CxzcTE-oOc0EHKJxwisgT_d7MNYgpqI2YtkZUDol8vMlQd1G!-1956254734!1554644671708&m=1")
			.headers(headers_108)
			.check(status.is(400)),
            http("request_109")
			.get(uri4 + "?org_id=1snn5n9w&session_id=ascena_mauricesieb4CxzcTE-oOc0EHKJxwisgT_d7MNYgpqI2YtkZUDol8vMlQd1G!-1956254734!1554644671708&m=2")
			.headers(headers_108)
			.check(status.is(400)),
            http("request_110")
			.get("/api/v1/analytics/details?_=1554644757549")
			.headers(headers_107),
            http("request_111")
			.get(uri3 + "")
			.headers(headers_0)))
		.pause(6)
		// Place
		.exec(http("request_112")
			.get("/api/v1/analytics/details?_=1554644757550")
			.headers(headers_69)
			.resources(http("request_113")
			.post("/api/v1/order/place")
			.headers(headers_90)
			.body(RawFileBody("RecordedSimulation_0113_request.txt")),
            http("request_114")
			.get("/checkout/checkout.jsp?fromPage=SPC&isSPC=true&checkoutState=CONFIRMATION")
			.headers(headers_2),
            http("request_115")
			.get("/assets/styles/global_checkout.min.css?ver=9d9480914dc34eceee00489a2aea9ff1a6fba506")
			.headers(headers_115),
            http("request_116")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_117")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_118")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_119")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_120")
			.get("/assets/scripts/pages/checkout-confirmation.min.js?ver=9d9480914dc34eceee00489a2aea9ff1a6fba506"),
            http("request_121")
			.get("/maurices/baseAjaxServlet?pageId=UserState&Action=Header.userState&fetchFavorites=false&_=1554644848681")
			.headers(headers_19),
            http("request_122")
			.post("/maurices/baseAjaxServlet?pageId=Rewards")
			.headers(headers_59)
			.formParam("Action", "Loyalty.getPointsAndCerts")
			.formParam("CHECKOUT", "true"),
            http("request_123")
			.post("/maurices/baseAjaxServlet?pageId=MyFavorites")
			.headers(headers_59)
			.formParam("Action", "Cart.getFavorites")
			.formParam("isFavoritePage", "false")
			.formParam("dArgs", "")
			.formParam("sessionConfirmationNumber", ""),
            http("request_124")
			.get(uri3 + "")
			.headers(headers_0),
            http("request_125")
			.get("/checkout/checkout.jsp?fromPage=SPC&isSPC=true&checkoutState=CONFIRMATION&_=1554644848682")
			.headers(headers_39)))
		.pause(4)
		// Confirm

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}