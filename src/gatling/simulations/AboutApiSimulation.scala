import io.gatling.http.Predef._
import io.gatling.core.Predef._
import scala.concurrent._
import scala.concurrent.duration._

class AboutApiSimulation extends Simulation {
  val httpConf = http.baseUrl("http://localhost:8080/")
  val scn = scenario("Basic Simulation")
    .exec(http("About API")
      .get("about")
      .check(status.is(200)))

  setUp(scn.inject(constantUsersPerSec(800) during (100 seconds))).protocols(httpConf)
//  setUp(scn.inject(constantUsersPerSec(800) during (60 seconds) randomized)).protocols(httpConf)
//  setUp(scn.inject(rampUsersPerSec(10) to 20 during (5 seconds))).protocols(httpConf)
//  setUp(scn.inject(rampUsers(100) during (5 seconds))).protocols(httpConf)

}