import javafx.event.{ActionEvent, EventHandler}
import scalafx.scene.control.TextField

class BtnListener(inText: TextField, outText: TextField) extends EventHandler[ActionEvent]{
  override def handle(t: ActionEvent): Unit = {
    val f: Double = inText.text.value.toDouble
    val c: Double = (f - 32) * 5.0 / 9.0
    outText.text = f"$c%4.2f in F"
  }
}
