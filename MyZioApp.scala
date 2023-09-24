import zio._
import zio.Console._
import zio.http._
import zio.http.html._

object HelloWorld extends ZIOAppDefault {

  val app: App[Any] = 
    Http.collect[Request] {
      case Method.GET -> Root => Response.html("This is the home page")
    }

  override val run =
    Server.serve(app).provide(Server.default)
}

/*object MyZioApp extends ZIOAppDefault {

  def run = myAppLogic

  val myAppLogic =
    for {
      _    <- printLine("Hello! What is your name?")
      name <- readLine
      _    <- printLine(s"Hello, ${name}, welcome to ZIO!")
    } yield ()
}*/