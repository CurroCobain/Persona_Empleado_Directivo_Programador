class Directivo:Empleado{
    var plus_direccion_dietas: Double=0.0
    var cargo:String="Directivo"
    init{
        this.nombre="nombre"
        this.apellidos="apellido1 apellido2"
        this.dni="123456789A"
        this.fechaContrato="00/00/0000"
        this.sueldoBase=0.0
        this.baseExtras=0.0
        this.numHorasExtra=0
        this.plus_direccion_dietas=0.0
        this.cargo="Directivo"
    }

    constructor(nombre:String,apellidos:String,dni:String,fechacont:String,sueldobas:Double, baseExt:Double, totalExt:Int,plus:Double,cargo:String): super(){
        this.nombre=nombre
        this.apellidos=apellidos
        this.dni=dni
        this.fechaContrato=fechacont
        this.sueldoBase=sueldobas
        this.baseExtras=baseExt
        this.numHorasExtra=totalExt
        this.plus_direccion_dietas=plus
        this.cargo=cargo
    }

    override fun calcularSueldo(): Double {
        return super.calcularSueldo()+plus_direccion_dietas
    }
    open fun imprimirNomina(){
        println("""
            Datos del empleado:
            Nombre--> ${this.nombre}
            Apellidos-->${this.apellidos}
            DNI-->${this.dni}
            Cargo-->${this.cargo}
            Horas extra trabajadas-->${this.numHorasExtra}
            Abono por hora extraordinaria-->${this.baseExtras}
            Plus por cargo y dietas del mes-->${this.plus_direccion_dietas}
            Sueldo total-->${calcularSueldo()}
            -------------------------------------------------
        """.trimIndent())
    }

    override fun mostrarinfo() {
        super.mostrarinfo()
        println("""
            Cargo-->${this.cargo}
        """.trimIndent())
    }
}