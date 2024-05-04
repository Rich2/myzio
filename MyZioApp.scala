import zio._, Console._, http._, ostrat._, geom._

object HelloWorld extends ZIOAppDefault
{
  val handHome = handler(Response.html("This is the home page"))

  val routes: Routes[Any, Response] = Routes(
    Method.GET / "" -> handHome,
    Method.GET / "index.html" -> handHome,
    Method.GET / "index.htm" -> handHome,
    Method.GET / "index" -> handHome,
    Method.GET / "text" -> handler(Response.html("This is the text page"))
  )
  val app: HttpApp[Any] = routes.toHttpApp

  override val run = Server.serve(app).provide(Server.default)
}