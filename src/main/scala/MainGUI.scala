
import scalafx.animation.AnimationTimer
import scalafx.application.JFXApp3
import scalafx.application.JFXApp3.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.control.{Button, TextField}
import scalafx.scene.layout.VBox
import scalafx.scene.paint.Color._
import scalafx.scene.shape.Rectangle
import javafx.scene.input.MouseEvent

object MainGUI extends JFXApp3 {
  val rect1: Rectangle = new Rectangle(){
    x = 40
    y = 240
    width = 100
    height = 100
    fill = Green
  }

  override def start(): Unit = {
    val stage: PrimaryStage = new PrimaryStage {

      val inText: TextField = new TextField(){
        style = "-fx-font: 18 ariel;"
      }

      val outText: TextField = new TextField() {
        style = "-fx-font: 18 ariel;"
        editable = false
      }

      val btn: Button = new Button() {
        text = "Do it!"
        style = "-fx-font: 26 ariel;"
        minWidth = 240
        minHeight = 60
        onAction = new BtnListener(inText, outText)
      }

      val vbox:VBox = new VBox() {
        children = List(inText, btn, outText)
      }

      title.value = "Converter F to C"
      width = 600
      height = 400
      scene = new Scene() {
        fill = LightBlue
        content = List(
          // GUI elements go here
          rect1,
          vbox
        )
        addEventHandler(MouseEvent.MOUSE_CLICKED, new MouseEventHandler())
      }
    }
    val update: Long => Unit = (time: Long) => {
      rect1.rotate.value += 0.5
    }
    AnimationTimer(update).start()
  }
}
