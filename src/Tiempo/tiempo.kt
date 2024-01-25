package Tiempo

class tiempo() {
    var hora = 0
    fun  setHora() {
        do {
            try {
                if(hora <= 24 ){
                    this.hora
                }else{ error("")}

            }catch (_:Exception){
                println("Las horas no pueden ser mayores que 24")
                print("intentelo otra vez =>")
                this.hora = readln().toInt()
                if (this.hora <= 24){break}
            }
        }while (true)
    }
    var minuto = 0
    var segundo = 0
    var result = ""


    fun comprobar(){//comprobaremos si en los diversos parametros llegan al 60
        if (segundo>59){
            minuto += segundo/60
            segundo %= 60
        }
        if (minuto > 59){
            hora += minuto/60
            if (hora>24){
                error("")
            }

            minuto %= 60
        }
    }
    fun incrementar(t:tiempo):Boolean{
        do {
            try {
                val totalSegActual = hora * 3600 + minuto * 60 + segundo
                val totalSegAñadir = t.hora * 3600 + t.minuto * 60 + t.segundo
                if (totalSegActual + totalSegAñadir > 23 * 3600 + 59 * 60 + 60) {
                    return false
                }

                hora = (totalSegAñadir + totalSegActual) / 3600
                minuto = ((totalSegAñadir + totalSegActual) % 3600) / 60
                segundo = (totalSegAñadir + totalSegActual) % 60

                return true

            } catch (_: NumberFormatException) {
                println("Dato no valido")
            }
        }while (true)
    }

    fun actualizarResultado(){//Actualizara el string resultado dependiendo si hemos rellenado o no los diferentes parametros
        result=""
        if ((hora ?: 0) == 0){ result = "00 h"}
        if ((minuto ?: 0) == 0){result += " 00 m"}
        if ((segundo ?: 0) == 0){result += " 00 s"}
    }

    override fun toString():String {//retorna segun lo que tenga escrito en el resultado.
        when{
            result == "00 h 00 m 00 s" ->{ return result}
            result == "00 h 00 m" -> {return "$result $segundo s"}
            result == "00 h" -> {return "$result $minuto m  $segundo s"}
            result == " 00 m" -> {return "$hora h$result $segundo s"}
            result == " 00 m 00 s" -> {return "$hora h$result"}
            result == " 00 s" ->{return "$hora h $minuto m$result"}
            result == "" ->{return "$hora h $minuto m $segundo s"}
            result == "00 h 00 s" -> {return "00 h $minuto m 00 s"}
            else -> ""
        }
        return TODO("Provide the return value") // lo dejo así pues nunca llegará
    }
}
