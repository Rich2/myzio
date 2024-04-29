import zio._, Console._, http._

object HelloWorld extends ZIOAppDefault
{ val app: HttpApp[Any] =
    Routes(
      Method.GET / "index.html" -> handler(Response.html("This is the home page")),
      Method.GET / "text" -> handler(Response.html("This is the text page"))

  ).toHttpApp

  override val run =
    Server.serve(app).provide(Server.default)
}