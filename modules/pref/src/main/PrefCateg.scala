package lila.pref

sealed abstract class PrefCateg(val slug: String)

object PrefCateg {

  case object GameDisplay  extends PrefCateg("game-display")
  case object ChessClock   extends PrefCateg("chess-clock")
  case object GameBehavior extends PrefCateg("game-behavior")
  case object Site         extends PrefCateg("site")

  val all: List[PrefCateg] = List(GameDisplay, ChessClock, GameBehavior, Site)

  def apply(slug: String) = all.find(_.slug == slug)
}
