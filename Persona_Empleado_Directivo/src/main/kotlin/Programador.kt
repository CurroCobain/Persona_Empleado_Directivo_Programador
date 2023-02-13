class Programador:Empleado {
    constructor(nombre: String, apellidos: String, dni: String, fechacont: String, sueldobas: Double, baseExt: Double, totalExt: Int): super(){
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