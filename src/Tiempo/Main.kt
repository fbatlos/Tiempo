package Tiempo
fun pedirNumT(){

}
fun main(){
    var tiempo1 = tiempo()
    var pedirnum:String
    var cont = 1


        try {
            do {
                when (cont) {
                    1 -> {
                        print("horas => ")
                        pedirnum = readln()
                        if (pedirnum == "") {
                            tiempo1.hora = 0
                        } else tiempo1.hora = pedirnum.toInt()
                    }

                    2 -> {
                        print("minutos => ")
                        pedirnum = readln()
                        if (pedirnum == "") {
                            tiempo1.minuto = 0
                        } else tiempo1.minuto = pedirnum.toInt()
                    }

                    3 -> {
                        print("segundos => ")
                        pedirnum = readln()
                        if (pedirnum == "") {
                            tiempo1.segundo = 0
                        } else tiempo1.segundo = pedirnum.toInt()
                    }
                }
                cont++
            }while (cont!=4)
            tiempo1.comprobar()
            tiempo1.actualizarResultado()
            println(tiempo1.toString())
        } catch (_:NumberFormatException){
                println("Datos invalidos")
        }

    println("**********************************************************************\nIncrementar")
    val t =tiempo()

    print("Horas => ")
    pedirnum = readln()
    if (pedirnum ==""){
        t.hora=0
    }else t.hora = pedirnum.toInt()

    print("Minutos => ")
    pedirnum= readln()
    if (pedirnum == ""){
        t.minuto = 0
    }else t.minuto = pedirnum.toInt()

    print("Segundos => ")
    pedirnum = readln()
    if (pedirnum == ""){
        t.segundo = 0
    }else t.segundo = pedirnum.toInt()

    t.comprobar()
    tiempo1.incrementar(t)
    tiempo1.comprobar()
    tiempo1.actualizarResultado()
    println(tiempo1.toString())

    println("***************************************************************************\nDecreciente")


    print("Horas => ")
    pedirnum = readln()
    if (pedirnum ==""){
        t.hora=0
    }else t.hora = pedirnum.toInt()

    print("Minutos => ")
    pedirnum= readln()
    if (pedirnum == ""){
        t.minuto = 0
    }else t.minuto = pedirnum.toInt()

    print("Segundos => ")
    pedirnum = readln()
    if (pedirnum == ""){
        t.segundo = 0
    }else t.segundo = pedirnum.toInt()

    t.comprobar()
    tiempo1.decrementar(t)
    tiempo1.comprobar()
    tiempo1.actualizarResultado()
    println(tiempo1.toString())

    println("*******************************************************************************\nComparar")

    print("Horas => ")
    pedirnum = readln()
    if (pedirnum ==""){
        t.hora=0
    }else t.hora = pedirnum.toInt()

    print("Minutos => ")
    pedirnum= readln()
    if (pedirnum == ""){
        t.minuto = 0
    }else t.minuto = pedirnum.toInt()

    print("Segundos => ")
    pedirnum = readln()
    if (pedirnum == ""){
        t.segundo = 0
    }else t.segundo = pedirnum.toInt()

    t.comprobar()
    tiempo1.comparar(t)
    tiempo1.actualizarResultado()
    println(tiempo1.toString())
}
