open class Empleado:Persona{
    protected var fechaContrato: String = "00/00/0000"
        get():String {
            return field
        }
        set(valor: String) {
            if (valor.length <= 10) {
                field = valor
            }
        }
    protected var sueldoBase: Double = 0.0
        get():Double {
            return field
        }
        set(valor: Double) {
            if (valor > 0) {
                field = valor
            }
        }
    protected var baseExtras: Double = 0.0
        get():Double {
            return field
        }
        set(valor: Double) {
            if (valor > 0) {
                field = valor
            }
        }
    protected var numHorasExtra: Int = 0
        get():Int {
            return field
        }
        set(valor: Int) {
            if (valor > 0) {
                field = valor
            }
        }
    init{
        this.nombre="nombre"
        this.apellidos="apellido1 apellido2"
        this.dni="123456789A"
        this.fechaContrato="00/00/0000"
        this.sueldoBase=0.0
        this.baseExtras=0.0
        this.numHorasExtra=0

    }
    constructor(nombre:String,apellidos:String,dni:String,fechacont:String,sueldobas:Double, baseExt:Double, totalExt:Int):this(){
        this.nombre=nombre
        this.apellidos=apellidos
        this.dni=dni
        this.fechaContrato=fechacont
        this.sueldoBase=sueldobas
        this.baseExtras=baseExt
        this.numHorasExtra=totalExt
    }
    constructor()

    open fun calcularSueldo(): Double {
        return sueldoBase + (baseExtras * numHorasExtra)
    }

    override fun mostrarinfo() {
        println(
            """
            Datos del empleado:
            Nombre--> ${this.nombre}
            Apellidos-->${this.apellidos}
            DNI-->${this.dni}
            Sueldo total-->${calcularSueldo()}
            ----------------------------------------
        """.trimIndent()
        )
    }
}
