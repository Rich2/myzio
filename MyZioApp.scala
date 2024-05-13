package tweb
import zio._, Console._, http._, ostrat._, geom._, prid.phex._

object HelloWorld extends ZIOAppDefault
{
  val handHome = handler(Response.html("This is the home page"))
  val pt = ostrat.geom.Pt2(4, 5)
  val hex1 = HCen(4, 4)

  val routes: Routes[Any, Response] = Routes(
    Method.GET / "" -> handHome,
    Method.GET / "index.html" -> handHome,
    Method.GET / "index.htm" -> handHome,
    Method.GET / "index" -> handHome,
    Method.GET / "geom.html" -> handler(Response.html(s"This is a pt: $pt"))
  )
  val app: HttpApp[Any] = routes.toHttpApp

  override val run = Server.serve(app).provide(Server.default)
}