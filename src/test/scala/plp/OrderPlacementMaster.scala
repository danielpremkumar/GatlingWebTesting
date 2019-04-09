package plp

import io.gatling.core.Predef.Simulation

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import java.util.{Calendar, Date}


class OrderPlacementMaster extends Simulation {

  val currDate = new Date()

  val timestamp = Calendar.getInstance.getTime

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

  val headers_1 = Map(
    "Content-Type" -> "application/json; charset=UTF-8",
    "X-Requested-With" -> "XMLHttpRequest",
    "clientId" -> "asc_web")

  val scn = scenario("plp.PLPTest")
      .exec(http("HomePage")
        .get("/")
        .check(regex("<a href=\"(.*)\" class=\"asc-nav-category\">").findRandom.saveAs("PLPURL"))
        .headers(headers_0)
        .check(status.in(200,201,202,304)))
      .exec{
        session=>
          //println(session("BODY").as[String])
          println(session("PLPURL").as[String])
          session
      }
      .pause(10)

      .exec(http("SessionID")
        .get("/maurices/baseAjaxServlet?pageId=UserState&Action=Header.userState&userState_id=url%3D%2Fbrowse&fetchFavorites=true&_=1554463033895")
        .check(regex("sessionConfirmationNumber\":\"(.*)\",\"status").find.saveAs("SessionID"))
        .check(status.in(200,201,202,304)))
      .exec{
        session=>
          println(session("SessionID").as[String])
          session
      }
      .pause(10)
      .exec(http("PLP")
        .get("${PLPURL}")
      .check(regex("data-id=\"([0-9]+)\" data-").findRandom.saveAs("PrdID"))
        .check(status.in(200,201,202,304)))

      .exec{
        session=>
          println("Product ID is:")
          println(session("PrdID").as[String])
          session
      }

      .exec(http("GetProductID")
        .get("/maurices/baseAjaxServlet?pageId=QV_GetProduct&Action=QuickView.getProduct&id=${PrdID}")
        .headers(headers_1)
        .check(status.in(200,201,202,304)))
        .exec(http("GetSKUID")
          .get("/maurices/baseAjaxServlet?pageId=QV_GetInventory&Action=QuickView.getInventory&id=${PrdID}")
          .headers(headers_1)
          .check(status.in(200,201,202,304))
          .check(regex("\"([0-9]+)\":\\{\"quantity").findRandom.saveAs("SKUID")))
      .exec{
        session=>
          println("SKU ID is:")
          println(session("SKUID").as[String])
          session
      }
      .pause(10)

      .exec(http("QVAddToCart")
        .post("/maurices/baseAjaxServlet?pageId=QV_AddToCart")
        .formParam("Action", "QuickView.addToCart")
        .formParam("skuId", "${SKUID}")
        .formParam("quantity", "1")
        .formParam("productId", "${PrdID}")
        .formParam("sessionConfirmationNumber", "${SessionID}")
        .check(status.in(200,201,202,304))
        .check(bodyString.saveAs("BODY")))

      .exec{
        session=>
          println(session("BODY").as[String])

          session
      }
      .pause(10)


      .exec(http("MiniCart")
        .post("/maurices/baseAjaxServlet?pageId=UpdateCart")
        .formParam("Action", "Cart.fetchMiniCartValues")
        .formParam("sessionConfirmationNumber", "${SessionID}")
        .check(status.in(200,201,202,304))
      .check(bodyString.saveAs("BODY")))

      .exec{
        session=>
          println(session("BODY").as[String])

          session
      }
      .pause(10)




        .exec(http("CartPage")
            .get("/maurices/cart/cart.jsp")
          .check(status.in(200,201,202,304)))
        //.check(bodyString.saveAs("BODY"))

      .pause(10)




      .exec(http("SecureCheckout")
        .post("/maurices/common/templates/?_DARGS=/maurices/common/templates/cart-checkout-top-template.jsp")
        .formParam("_dyncharset", "UTF-8")
        .formParam("_dynSessConf", "${SessionID}")
        .formParam("/atg/commerce/order/purchase/CartModifierFormHandler.checkout", "secure checkout")
        .formParam("_D:/atg/commerce/order/purchase/CartModifierFormHandler.checkout", " ")
        .formParam("/com/ascena/commerce/order/purchase/ASCCheckoutFormHandler.fromCart", "true")
        .formParam("_D:/com/ascena/commerce/order/purchase/ASCCheckoutFormHandler.fromCart", " ")
        .formParam("/com/ascena/commerce/order/purchase/ASCCheckoutFormHandler.fromCart", "true")
        .formParam("_D:/com/ascena/commerce/order/purchase/ASCCheckoutFormHandler.fromCart", " ")
        .formParam("_DARGS", "/maurices/common/templates/cart-checkout-top-template.jsp")
        .check(status.in(200,201,202,304))
        .resources(http("request_55")

          .get("/api/v1/content/labels?_=" + currDate.getTime())
          .headers(headers_0),
          http("request_70")
            .get("/api/v1/validation/rules?_=" + currDate.getTime())
            .headers(headers_0),
          http("request_71")
            .get("/api/v1/order/checkout/state?_=" + currDate.getTime())
            .headers(headers_0),
          http("request_72")
            .get("/api/v1/content/creditcard/data?_=" + currDate.getTime())
            .headers(headers_0),
          http("request_73")
            .get("/api/v1/address/states?_=" + currDate.getTime())
            .headers(headers_0),
          http("request_74")
            .get("/api/v1/cart/items?_=" + currDate.getTime())
            .headers(headers_0),
          http("request_75")
            .get("/api/v1/analytics/details?_=" + currDate.getTime())
            .headers(headers_0),
          http("request_76")
            .get("/api/v1/cart/summary?_=" + currDate.getTime())
            .headers(headers_0),
          http("request_77")
            .get("/api/v1/order/payment?_=" + currDate.getTime())
            .headers(headers_0),
          http("request_78")
            .get("/api/v1/giftcard/shipping?_=" + currDate.getTime())
            .headers(headers_0),
          http("request_79")
            .get("/api/v1/order/shipping?_=" + currDate.getTime())
            .headers(headers_0),
          http("request_80")
            .get("/api/v1/features?_=" + currDate.getTime())
            .headers(headers_0),
          http("request_88")
            .get("/api/v1/analytics/details?_=" + currDate.getTime())
            .headers(headers_0),
          http("request_89")
            .get("/api/v1/order/payment/vco/init?_=" + currDate.getTime())
            .headers(headers_0),
          http("request_90")
            .get("/api/v1/order/shipping/store?_=" + currDate.getTime())
            .headers(headers_0)))

      .pause(10)



    .exec(http("ShippingAddress")
      .post("/api/v1/order/shipping/address")
      .headers(headers_1)
      .body(ElFileBody("GuestUser_ShippingAddress.txt"))
      .check(bodyString.saveAs("ShippingAdd"))
        .check(regex("\"selectedAddressId\":\"(.*)\",\"status\"").find.saveAs("AddressID"))
      .check(status.in(200,201,202,304))
      .resources(http("ResourcePayment")
        .post("/api/v1/order/payment")
        .headers(headers_1)
      .body(ElFileBody("GuestUser_Payment.txt"))
        .notSilent
      .check(bodyString.saveAs("BODY1"))
        .check(status.in(200,201,202,304))))
    .pause(10)

    .exec{
      session=>
        println(session("ShippingAdd").as[String])
        println(session("AddressID").as[String])
        println(session("BODY1").as[String])
        session
    }




    .exec(http("Payment")
      .post("/api/v1/order/payment/creditcard")
      .headers(headers_1)
      .body(ElFileBody("GuestUser_CreditCard.txt"))
      .check(status.in(200,201,202,304)))
    .pause(10)


    .exec(http("request_139")
      .get("/api/v1/analytics/details?_=1554630397966")
      .headers(headers_1)
        .silent
      .resources(http("PlaceOrder")
        .post("/api/v1/order/place")
        .headers(headers_1)
        .body(ElFileBody("GuestUser_PlaceOrder.txt"))
        .check(bodyString.saveAs("PlaceOrder"))
        .check(status.in(200,201,202,304))
          .notSilent,
        http("CheckoutConfirmation")
          .get("/checkout/checkout.jsp?fromPage=SPC&isSPC=true&checkoutState=CONFIRMATION")
          .headers(headers_0)
          .check(bodyString.saveAs("CheckoutConfirmation_Resource"))
          .check(status.in(200,201,202,304))
        .notSilent,
        ))
    .pause(10)

    .exec{
      session=>
        //println(session("PlaceOrder").as[String])
        //println(session("CheckoutConfirmation").as[String])
        //println("Place Order and Checkout Confirmation ^")

        session
    }


    .exec(http("ConfirmationPage")
          .get("/checkout/checkout.jsp?fromPage=SPC&isSPC=true&checkoutState=CONFIRMATION&_=" + currDate.getTime())
          .headers(headers_0)
      .check(bodyString.saveAs("CheckoutConfirmationTimestamp"))
        //.check(substring("OMAW").exists)
      .check(status.in(200,201,202,304)))

    .exec{
      session=>
        //println(session("PlaceOrder").as[String])
        //println(session("CheckoutConfirmationTimestamp").as[String])

        session
    }

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)

}
