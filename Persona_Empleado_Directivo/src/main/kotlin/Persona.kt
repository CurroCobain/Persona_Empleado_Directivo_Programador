abstract class Persona (){
    protected var nombre:String ="nombre"
        get():String{
            return field
        }
        set(valor:String){
            if (valor.length<=20){
                field=valor
            }else{
                println("El nombre no puede tener más de 20 caracteres")
            }
        }
    protected var apellidos:String ="apellido1 apellido2"
        get():String{
            return field
        }
        set(valor:String){
            if (valor.length<=40){
                field=valor
            }else{
                println("El campo apellidos no puede tener más de 40 caracteres")
            }
        }
    protected var dni:String ="123456789A"
        get():String{
            return  field
        }
        set(valor:String){
            if (valor.length==10){
                field=valor
            }else{
                println("El dni debe contener 9 números y una letra")
            }
        }
    init {
        this.nombre="nombre"
        this.apellidos="apellido1 apellido2"
        this.dni="123456789A"
    }
    constructor(nombre:String, apellidos:String, dni:String):this(){
        this.nombre=nombre
        this.apellidos=apellidos
        this.dni=dni
    }
    abstract fun mostrarinfo()
}