package intellijrecording

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RegUserRecordedSession extends Simulation {

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

	val headers_1 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_6 = Map("Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8")

	val headers_10 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_11 = Map("X-Requested-With" -> "XMLHttpRequest")

	val headers_13 = Map(
		"Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "identity")

	val headers_14 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_16 = Map("Accept" -> "text/css,*/*;q=0.1")

	val headers_44 = Map(
		"Accept" -> "text/javascript, application/javascript, application/ecmascript, application/x-ecmascript, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_47 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_69 = Map(
		"X-Requested-With" -> "XMLHttpRequest",
		"clientId" -> "asc_web")

	val headers_70 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest",
		"clientId" -> "asc_web")

	val headers_85 = Map(
		"Accept" -> "text/plain, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest",
		"clientId" -> "asc_web")

	val headers_91 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest",
		"checkoutState" -> "SHIPPING",
		"clientId" -> "asc_web")

	val headers_95 = Map(
		"Content-Type" -> "application/json; charset=UTF-8",
		"X-Requested-With" -> "XMLHttpRequest",
		"clientId" -> "asc_web")

	val headers_101 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest",
		"checkoutState" -> "PAYMENT",
		"clientId" -> "asc_web")

	val headers_110 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest",
		"checkoutState" -> "REVIEW",
		"clientId" -> "asc_web")

	val headers_113 = Map("Accept-Encoding" -> "gzip, deflate")

    val uri1 = "https://assets.secure.checkout.visa.com/checkout-widget/resources/js/integration/v1/sdk.js"
    val uri2 = "http://detectportal.firefox.com/success.txt"
    val uri3 = "http://h.online-metrix.net/clear.png"
    val uri4 = "https://mauricesprodatg.scene7.com"
    val uri6 = "https://www.maurices.com"

	val scn = scenario("RegUserRecordedSession")
		// HomePage
		.exec(http("request_0")
			.get(uri2 + "")
			.headers(headers_0))
		.pause(8)
		.exec(http("request_1")
			.get("/")
			.headers(headers_1)
			.resources(http("request_2")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_3")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_4")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_5")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_6")
			.get("/assets/fonts/icon/mar-icon-font-2.ttf?8y3f2b")
			.headers(headers_6),
            http("request_7")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_8")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_9")
			.get("/assets/scripts/pages/one-column-template.min.js?ver=9d9480914dc34eceee00489a2aea9ff1a6fba506"),
            http("request_10")
			.get("/maurices/baseAjaxServlet?pageId=UserState&Action=Header.userState&userState_id=url%3D%2Fbrowse&fetchFavorites=true&_=1554742420657")
			.headers(headers_10)))
		.pause(12)
		// SignINButton
		.exec(http("request_11")
			.get("/global/global-sign-in.jsp?_=1554742420658")
			.headers(headers_11)
			.resources(http("request_12")
			.get(uri2 + "")
			.headers(headers_0)))
		.pause(38)
		// SignIN
		.exec(http("request_13")
			.get("/assets/fonts/helvetica/b0868b4c-234e-47d3-bc59-41ab9de3c0db.woff2")
			.headers(headers_13))
		.pause(4)
		.exec(http("request_14")
			.post("/maurices/baseAjaxServlet?pageId=SignInRequest")
			.headers(headers_14)
			.formParam("Action", "AM.signRequestFire")
			.formParam("userEmail", "perftest1539725054065@mauhrpt2018.com")
			.formParam("userPassword", "abc@123")
			.formParam("modalRefer", "true")
			.formParam("sessionConfirmationNumber", "-6650142896809372666")
			.resources(http("request_15")
			.get("/")
			.headers(headers_1),
            http("request_16")
			.get("/assets/styles/global_browse.min.css?ver=9d9480914dc34eceee00489a2aea9ff1a6fba506")
			.headers(headers_16),
            http("request_17")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_18")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_19")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_20")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_21")
			.get("/assets/scripts/pages/one-column-template.min.js?ver=9d9480914dc34eceee00489a2aea9ff1a6fba506"),
            http("request_22")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_23")
			.get("/maurices/baseAjaxServlet?pageId=UserState&Action=Header.userState&userState_id=url%3D%2Fbrowse&fetchFavorites=true&_=1554742490736")
			.headers(headers_10),
            http("request_24")
			.post("/maurices/baseAjaxServlet?pageId=Rewards")
			.headers(headers_14)
			.formParam("Action", "Loyalty.getPointsAndCerts")))
		.pause(8)
		// PLP
		.exec(http("request_25")
			.get("/p/clothing/tops/N-10530?nav=clothing:tops")
			.headers(headers_1)
			.resources(http("request_26")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_27")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_28")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_29")
			.get("/assets/fonts/helvetica/3b303641-706e-4221-94c4-4fb491f4f8ef.woff2")
			.headers(headers_13),
            http("request_30")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_31")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_32")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_33")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_34")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_35")
			.get("/maurices/baseAjaxServlet?pageId=UserState&Action=Header.userState&userState_id=catId%3D3001%26nav%3D10530&fetchFavorites=true&_=1554742503621")
			.headers(headers_10),
            http("request_36")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_37")
			.post("/maurices/baseAjaxServlet?pageId=Rewards")
			.headers(headers_14)
			.formParam("Action", "Loyalty.getPointsAndCerts"),
            http("request_38")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_39")
			.get(uri2 + "")
			.headers(headers_0)))
		.pause(7)
		// QV
		.exec(http("request_40")
			.get(uri2 + "")
			.headers(headers_0)
			.resources(http("request_41")
			.get("/maurices/baseAjaxServlet?pageId=QV_GetInventory&Action=QuickView.getInventory&id=78790")
			.headers(headers_10),
            http("request_42")
			.get("/maurices/baseAjaxServlet?pageId=QV_GetProduct&Action=QuickView.getProduct&id=78790")
			.headers(headers_10),
            http("request_43")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_44")
			.get("/p/clothing/tops/N-10530?nav=clothing:tops&_=1554742503628")
			.headers(headers_44),
            http("request_45")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_46")
			.get(uri2 + "")
			.headers(headers_0)))
		.pause(7)
		// ATB
		.exec(http("request_47")
			.post("/maurices/baseAjaxServlet?pageId=QV_AddToCart")
			.headers(headers_47)
			.formParam("Action", "QuickView.addToCart")
			.formParam("skuId", "23609282")
			.formParam("quantity", "1")
			.formParam("productId", "78790")
			.formParam("sessionConfirmationNumber", "-6650142896809372666")
			.resources(http("request_48")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Ex.woff2")
			.headers(headers_13),
            http("request_49")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Bd.woff2")
			.headers(headers_13),
            http("request_50")
			.get(uri2 + "")
			.headers(headers_0)))
		.pause(5)
		.exec(http("request_51")
			.get(uri2 + "")
			.headers(headers_0))
		.pause(2)
		// MiniCart
		.exec(http("request_52")
			.get(uri2 + "")
			.headers(headers_0))
		.pause(1)
		.exec(http("request_53")
			.post("/maurices/baseAjaxServlet?pageId=UpdateCart")
			.headers(headers_47)
			.formParam("Action", "Cart.fetchMiniCartValues")
			.formParam("sessionConfirmationNumber", "-6650142896809372666")
			.resources(http("request_54")
			.get(uri2 + "")
			.headers(headers_0)))
		.pause(4)
		// Cart
		.exec(http("request_55")
			.get("/maurices/cart/cart.jsp")
			.headers(headers_1)
			.resources(http("request_56")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_57")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_58")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_59")
			.get("/maurices/baseAjaxServlet?pageId=UserState&Action=Header.userState&userState_id=pageId%3Dcart&fetchFavorites=true&_=1554742541931")
			.headers(headers_10),
            http("request_60")
			.post("/maurices/baseAjaxServlet?pageId=Rewards")
			.headers(headers_14)
			.formParam("Action", "Loyalty.getPointsAndCerts")
			.formParam("CHECKOUT", "true"),
            http("request_61")
			.post("/maurices/baseAjaxServlet?pageId=MyFavorites")
			.headers(headers_14)
			.formParam("Action", "Cart.getFavorites")
			.formParam("isFavoritePage", "false")
			.formParam("dArgs", "")
			.formParam("sessionConfirmationNumber", ""),
            http("request_62")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_63")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Roman.woff2")
			.headers(headers_13),
            http("request_64")
			.get("/maurices/cart/cart.jsp?_=1554742541932")
			.headers(headers_44)))
		.pause(10)
		// SecureCheckout
		.exec(http("request_65")
			.get(uri2 + "")
			.headers(headers_0)
			.resources(http("request_66")
			.post("/maurices/common/templates/?_DARGS=/maurices/common/templates/cart-checkout-top-template.jsp")
			.headers(headers_1)
			.formParam("_dyncharset", "UTF-8")
			.formParam("_dynSessConf", "-6650142896809372666")
			.formParam("/atg/commerce/order/purchase/CartModifierFormHandler.checkout", "secure checkout")
			.formParam("_D:/atg/commerce/order/purchase/CartModifierFormHandler.checkout", " ")
			.formParam("/com/ascena/commerce/order/purchase/ASCCheckoutFormHandler.fromCart", "true")
			.formParam("_D:/com/ascena/commerce/order/purchase/ASCCheckoutFormHandler.fromCart", " ")
			.formParam("/com/ascena/commerce/order/purchase/ASCCheckoutFormHandler.fromCart", "true")
			.formParam("_D:/com/ascena/commerce/order/purchase/ASCCheckoutFormHandler.fromCart", " ")
			.formParam("_DARGS", "/maurices/common/templates/cart-checkout-top-template.jsp"),
            http("request_67")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_68")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_69")
			.get("/api/v1/content/labels?_=1554742556582")
			.headers(headers_69),
            http("request_70")
			.get("/api/v1/order/checkout/state?_=1554742556581")
			.headers(headers_70),
            http("request_71")
			.get("/api/v1/validation/rules?_=1554742556583")
			.headers(headers_69),
            http("request_72")
			.get("/api/v1/giftcard/shipping?_=1554742556589")
			.headers(headers_70),
            http("request_73")
			.get("/api/v1/order/shipping?_=1554742556587")
			.headers(headers_70),
            http("request_74")
			.get("/api/v1/order/payment?_=1554742556588")
			.headers(headers_70),
            http("request_75")
			.get("/api/v1/content/creditcard/data?_=1554742556590")
			.headers(headers_70),
            http("request_76")
			.get("/api/v1/address/states?_=1554742556591")
			.headers(headers_69),
            http("request_77")
			.get("/api/v1/order/promo/loyalty?_=1554742556592")
			.headers(headers_70),
            http("request_78")
			.get("/api/v1/analytics/details?_=1554742556585")
			.headers(headers_10),
            http("request_79")
			.get("/api/v1/cart/summary?_=1554742556586")
			.headers(headers_70),
            http("request_80")
			.get("/api/v1/cart/items?_=1554742556584")
			.headers(headers_70),
            http("request_81")
			.get("/api/v1/features?_=1554742556593")
			.headers(headers_69),
            http("request_82")
			.get("/api/v1/content?contentCollection=/content/Shared/CheckoutFooter&_=1554742556595")
			.headers(headers_69),
            http("request_83")
			.get("/api/v1/content?contentCollection=/content/Shared/CheckoutHeader&_=1554742556594")
			.headers(headers_69),
            http("request_84")
			.get("/api/v1/content?contentCollection=/content/Shared/CheckoutContentSlot&_=1554742556597")
			.headers(headers_69),
            http("request_85")
			.get("/api/v1/content?contentCollection=/content/Shared/NeedHelpContent&_=1554742556596")
			.headers(headers_85),
            http("request_86")
			.get("/assets/fonts/helvetica/e172a1c0-6e7f-4f0f-a2c9-c221c7b990bb.woff2")
			.headers(headers_13),
            http("request_87")
			.get("/assets/fonts/helvetica/HelveticaNeueLTPro-Md.woff2")
			.headers(headers_13),
            http("request_88")
			.get("/assets/fonts/helvetica/462d508d-efc7-478f-b84e-288eeb69a160.woff2")
			.headers(headers_13),
            http("request_89")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_90")
			.get("/api/v1/order/payment/vco/init?_=1554742556599")
			.headers(headers_69),
            http("request_91")
			.get("/api/v1/analytics/details?_=1554742556598")
			.headers(headers_91),
            http("request_92")
			.get("/api/v1/order/shipping/store?_=1554742556600")
			.headers(headers_10),
            http("request_93")
			.get("/assets/fonts/helvetica/5a13f7d1-b615-418e-bc3a-525001b9a671.woff2")
			.headers(headers_13),
            http("request_94")
			.get("/assets/fonts/helvetica/3600b37f-2bf1-45f3-be3a-03365f16d9cb.woff2")
			.headers(headers_13)))
		.pause(13)
		// SaveAndContinue
		.exec(http("request_95")
			.post("/api/v1/order/payment")
			.headers(headers_95)
			.body(RawFileBody("RegUserRecordedSession_0095_request.txt"))
			.resources(http("request_96")
			.get("/api/v1/cart/summary?_=1554742556602")
			.headers(headers_10),
            http("request_97")
			.get("/api/v1/giftcard/shipping?_=1554742556604")
			.headers(headers_10),
            http("request_98")
			.get("/api/v1/order/shipping?_=1554742556601")
			.headers(headers_10),
            http("request_99")
			.get("/api/v1/order/payment?_=1554742556603")
			.headers(headers_10),
            http("request_100")
			.get("/api/v1/analytics/details?_=1554742556605")
			.headers(headers_91),
            http("request_101")
			.get("/api/v1/analytics/details?_=1554742556606")
			.headers(headers_101),
            http("request_102")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_103")
			.get(uri2 + "")
			.headers(headers_0)))
		.pause(11)
		// ReviewOrder
		.exec(http("request_104")
			.post("/api/v1/order/payment/creditcard")
			.headers(headers_95)
			.body(RawFileBody("RegUserRecordedSession_0104_request.txt"))
			.resources(http("request_105")
			.get("/feature/cyberSourceFingerPrinting/includes/global/cyberSourceFingerPrinting.jsp?pageId=checkout-review&_=1554742556607")
			.headers(headers_69),
            http("request_106")
			.get("/api/v1/cart/summary?_=1554742556610")
			.headers(headers_10),
            http("request_107")
			.get("/api/v1/order/payment?_=1554742556608")
			.headers(headers_10),
            http("request_108")
			.get("/api/v1/cart/items?_=1554742556611")
			.headers(headers_10),
            http("request_109")
			.get("/api/v1/order/shipping?_=1554742556609")
			.headers(headers_10),
            http("request_110")
			.get("/api/v1/analytics/details?_=1554742556613")
			.headers(headers_110),
            http("request_111")
			.get("/api/v1/analytics/details?_=1554742556614")
			.headers(headers_110),
            http("request_112")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_113")
			.get(uri3 + "?org_id=1snn5n9w&session_id=ascena_mauricesq0r93pTQ2-oMHRIyJtVuClWZoIVjVtqEPqo2-qk20YFQvFCaVrfM!-1956254734!1554742416592&m=1")
			.headers(headers_113)
			.check(status.is(400)),
            http("request_114")
			.get(uri3 + "?org_id=1snn5n9w&session_id=ascena_mauricesq0r93pTQ2-oMHRIyJtVuClWZoIVjVtqEPqo2-qk20YFQvFCaVrfM!-1956254734!1554742416592&m=2")
			.headers(headers_113)
			.check(status.is(400))))
		.pause(7)
		// PlaceOrder
		.exec(http("request_115")
			.get("/api/v1/analytics/details?_=1554742556615")
			.headers(headers_70)
			.resources(http("request_116")
			.post("/api/v1/order/place")
			.headers(headers_95)
			.body(RawFileBody("RegUserRecordedSession_0116_request.txt")),
            http("request_117")
			.get("/checkout/checkout.jsp?fromPage=SPC&isSPC=true&checkoutState=CONFIRMATION")
			.headers(headers_1),
            http("request_118")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_119")
			.get("/assets/fonts/helvetica/466590fe-6258-47b0-bf9e-e6f71e9e70d0.woff2")
			.headers(headers_13),
            http("request_120")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_121")
			.get("/maurices/baseAjaxServlet?pageId=UserState&Action=Header.userState&fetchFavorites=false&_=1554742600014")
			.headers(headers_10),
            http("request_122")
			.post("/maurices/baseAjaxServlet?pageId=MyFavorites")
			.headers(headers_14)
			.formParam("Action", "Cart.getFavorites")
			.formParam("isFavoritePage", "false")
			.formParam("dArgs", "")
			.formParam("sessionConfirmationNumber", ""),
            http("request_123")
			.post("/maurices/baseAjaxServlet?pageId=Rewards")
			.headers(headers_14)
			.formParam("Action", "Loyalty.getPointsAndCerts")
			.formParam("CHECKOUT", "true"),
            http("request_124")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_125")
			.get("/checkout/checkout.jsp?fromPage=SPC&isSPC=true&checkoutState=CONFIRMATION&_=1554742600015")
			.headers(headers_44)))
		.pause(15)
		// Home
		.exec(http("request_126")
			.get("/")
			.headers(headers_1)
			.resources(http("request_127")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_128")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_129")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_130")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_131")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_132")
			.get("/maurices/baseAjaxServlet?pageId=UserState&Action=Header.userState&userState_id=url%3D%2Fbrowse&fetchFavorites=true&_=1554742618941")
			.headers(headers_10),
            http("request_133")
			.post("/maurices/baseAjaxServlet?pageId=Rewards")
			.headers(headers_14)
			.formParam("Action", "Loyalty.getPointsAndCerts")))
		.pause(8)
		// MyOrder
		.exec(http("request_134")
			.get("/account/my-orders.jsp")
			.headers(headers_1)
			.resources(http("request_135")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_136")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_137")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_138")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_139")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_140")
			.get("/assets/scripts/pages/account-my-orders.min.js?ver=9d9480914dc34eceee00489a2aea9ff1a6fba506"),
            http("request_141")
			.get("/maurices/baseAjaxServlet?pageId=UserState&Action=Header.userState&userState_id=pageId%3DMY_ORDERS&fetchFavorites=true&_=1554742638491")
			.headers(headers_10),
            http("request_142")
			.post("/maurices/baseAjaxServlet?pageId=Rewards")
			.headers(headers_14)
			.formParam("Action", "Loyalty.getPointsAndCerts")))
		.pause(10)
		// SignOut
		.exec(http("request_143")
			.get("/baseAjaxServlet?Action=Account.logout")
			.headers(headers_1)
			.resources(http("request_144")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_145")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_146")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_147")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_148")
			.get(uri2 + "")
			.headers(headers_0),
            http("request_149")
			.get("/maurices/baseAjaxServlet?pageId=UserState&Action=Header.userState&userState_id=url%3D%2Fbrowse&fetchFavorites=true&_=1554742654276")
			.headers(headers_10)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}