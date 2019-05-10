import java.awt.EventQueue
import java.awt.event.ActionEvent
import java.awt.event.KeyEvent
import javax.swing.*


class Menu(title: String) : JFrame() {

    init {
        createUI(title)
    }

    private fun createUI(title: String) {

        setTitle(title)

        createMenuBar()

        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        setSize(500, 400)
        setLocationRelativeTo(null)
    }

    private fun createMenuBar() {

        val menubar = JMenuBar()
        val icon = ImageIcon("src/main/resources/exit.png")

        val file = JMenu("Menu")
        file.mnemonic = KeyEvent.VK_F

        val eMenuItem = JMenuItem("Salir", icon)
        val eMenuItem2 = JMenuItem("Ingresar")
        val eMenuItem3 = JMenuItem("Actualizar")
        val eMenuItem4 = JMenuItem("Eliminar")

        eMenuItem.mnemonic = KeyEvent.VK_E
        eMenuItem.toolTipText = "Exit application"
        eMenuItem.addActionListener { _: ActionEvent -> System.exit(0) }

        eMenuItem2.mnemonic = KeyEvent.VK_E
        eMenuItem2.toolTipText = "Exit application"
        eMenuItem2.addActionListener { _: ActionEvent ->  val frame = Ingresar("Ingresar")
            frame.isVisible = true
            this.isVisible = false
        }

        eMenuItem3.mnemonic = KeyEvent.VK_E
        eMenuItem3.toolTipText = "Exit application"
        eMenuItem3.addActionListener { _: ActionEvent -> val frame = Actualizar("Actualizar")
            frame.isVisible = true
            this.isVisible = false
        }

        eMenuItem4.mnemonic = KeyEvent.VK_E
        eMenuItem4.toolTipText = "Exit application"
        eMenuItem4.addActionListener { _: ActionEvent -> val frame = Eliminar("Eliminar")
            frame.isVisible = true
            this.isVisible = false
        }


        file.add(eMenuItem2)
        file.add(eMenuItem3)
        file.add(eMenuItem4)
        file.add(eMenuItem)

        menubar.add(file)

        jMenuBar = menubar
    }
}

private fun createAndShowGUI() {

    val frame = Menu("Simple menu")
    frame.isVisible = true
}

fun main(args: Array<String>) {
    EventQueue.invokeLater(::createAndShowGUI)
}