import java.awt.EventQueue
import javax.swing.*

class Eliminar(title: String) : JFrame() {

    init {
        createUI(title)
    }

    private fun createUI(title: String) {

        setTitle(title)

        val closeBtn = JButton("Regresar")

        closeBtn.addActionListener { val frame = Menu("Menu")
            frame.isVisible = true
            this.isVisible = false
        }

        createLayout(closeBtn)

        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        setSize(500, 400)
        setLocationRelativeTo(null)
    }


    private fun createLayout(vararg arg: JComponent) {

        val gl = GroupLayout(contentPane)
        contentPane.layout = gl

        gl.autoCreateContainerGaps = true

        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
        )

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
        )

        pack()
    }
}

private fun createAndShowGUI() {

    val frame = Eliminar("Close button")
    frame.isVisible = true
}

fun main(args: Array<String>) {
    EventQueue.invokeLater(::createAndShowGUI)
}