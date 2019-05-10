import java.awt.Dimension
import java.awt.EventQueue
import javax.swing.*
import javax.swing.SwingConstants.LEADING

class Ingresar(title: String) : JFrame() {

    init {
        createUI(title)
    }

    private fun createUI(title: String) {

        setTitle(title)

        var libros: ArrayList<Libro> = ArrayList()

        val closeBtn = JButton("Regresar")
        val guardarBtn = JButton("Guardar")

        val titulo = JLabel("Ingresar libro")
        val nombreLibro = JLabel("Nombre")
        val autorLibro = JLabel("Autor")
        val anioLibro = JLabel("Año de publicación")

        val nombreLibroT = JTextField()
        val autorLibroT = JTextField()
        val anioLibroT = JTextField()



        closeBtn.addActionListener {  val frame = Menu("Menu")
            frame.isVisible = true
            this.isVisible = false
        }

        guardarBtn.addActionListener{
            libros.add(Libro(nombreLibroT.text.toString(),autorLibroT.text.toString(),anioLibroT.text.toString()))
            nombreLibroT.text=""
            autorLibroT.text=""
            anioLibroT.text=""
            print("${libros.size}")

        }

        createLayout2(titulo,nombreLibro,nombreLibroT,autorLibro,autorLibroT,anioLibro,anioLibroT,guardarBtn,closeBtn)

        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        setSize(500, 300)
        setLocationRelativeTo(null)
    }



    private fun createLayout2(vararg arg: JComponent) {

        val gl = GroupLayout(contentPane)
        contentPane.layout = gl

        gl.autoCreateContainerGaps = true
        gl.autoCreateGaps = true

        gl.setHorizontalGroup(gl.createParallelGroup()
                .addComponent(arg[0])
                .addComponent(arg[1])
                .addComponent(arg[2])
                .addComponent(arg[3])
                .addComponent(arg[4])
                .addComponent(arg[5])
                .addComponent(arg[6])
                .addComponent(arg[7])
                .addComponent(arg[8])

        )

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
                .addComponent(arg[1])
                .addComponent(arg[2])
                .addComponent(arg[3])
                .addComponent(arg[4])
                .addComponent(arg[5])
                .addComponent(arg[6])
                .addComponent(arg[7])
                .addComponent(arg[8])
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