import java.awt.EventQueue
import javax.swing.*

class Actualizar(title: String) : JFrame() {

    init {
        createUI(title)
    }

    private fun createUI(title: String) {

        setTitle(title)
        var libros: ArrayList<Libro> = ArrayList()
        print("${libros} holaaa")
        var libro: ArrayList<Libro> = ArrayList()

        val closeBtn = JButton("Regresar")
        val guardarBtn = JButton("Guardar")
        val buscarBtn = JButton("Buscar")

        val titulo = JLabel("Actualizar libro")
        val buscar = JLabel("Buscar")
        val nombreLibro = JLabel("Nombre")
        val autorLibro = JLabel("Autor")
        val anioLibro = JLabel("Año de publicación")

        val buscarT = JTextField()
        val nombreLibroT = JTextField()
        val autorLibroT = JTextField()
        val anioLibroT = JTextField()

        closeBtn.addActionListener { val frame = Menu("Menu")
            frame.isVisible = true
            this.isVisible = false
        }
        buscarBtn.addActionListener{

            for (lib in libros){
                print("${lib.nombre}")
            }

        }

        createLayout(titulo,buscar,buscarT,buscarBtn,nombreLibro,nombreLibroT,autorLibro,autorLibroT,anioLibro,anioLibroT,guardarBtn,closeBtn)

        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        setSize(500, 400)
        setLocationRelativeTo(null)
    }


    private fun createLayout(vararg arg: JComponent) {

        val gl = GroupLayout(contentPane)
        contentPane.layout = gl

        gl.autoCreateContainerGaps = true

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
                .addComponent(arg[9])
                .addComponent(arg[10])
                .addComponent(arg[11])
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
                .addComponent(arg[9])
                .addComponent(arg[10])
                .addComponent(arg[11])
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