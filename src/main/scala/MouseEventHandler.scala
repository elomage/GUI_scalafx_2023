import MainGUI.rect1
import javafx.event.EventHandler
import javafx.scene.input.MouseEvent
import scalafx.event

class MouseEventHandler() extends EventHandler[MouseEvent] {
  override def handle(t: MouseEvent): Unit = {
    doit(t.getX, t.getY)
  }

  def doit(xx: Double, yy:Double): Unit = {
    rect1.x = xx
    rect1.y = yy
  }
}
