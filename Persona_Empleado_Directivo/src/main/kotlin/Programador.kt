class Programador:Empleado {
    init {
        this.nombre = "nombre"
        this.apellidos = "apellido1 apellido2"
        this.dni = "123456789A"
        this.fechaContrato = "00/00/0000"
        this.sueldoBase = 0.0
        this.baseExtras = 0.0
        this.numHorasExtra = 0

    }

    constructor(
        nombre: String,
        apellidos: String,
        dni: String,
        fechacont: String,
        sueldobas: Double,
        baseExt: Double,
        totalExt: Int
    ) : super() {
        this.nombre = nombre
        this.apellidos = apellidos
        this.dni = dni
        this.fechaContrato = fechacont
        this.sueldoBase = sueldobas
        this.baseExtras = baseExt
        this.numHorasExtra = totalExt

    }
    constructor()
    fun pedirAumento(){
        println("El jefe de departamento está de vacaciones inténtelo de nuevo cuando vuelva")
    }
    fun pedirVacaciones(){
        println("Hay que llegar a la siguiente entrega como sea, hasta entonces nadie puede coger vacaciones")
    }
}