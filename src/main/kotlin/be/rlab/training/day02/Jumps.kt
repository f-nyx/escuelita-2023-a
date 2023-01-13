package be.rlab.training.day02

import be.rlab.cpu.entryPoint

/** Métodos de direccionamiento de memoria.
 *
 * 1. registro <--- memoria RAM
 * 2. memoria RAM <---- registro
 * 3. registro <---- valor
 * 4. memoria RAM <---- valor
 */
val processor = entryPoint {
    /** Cómo es un if en el procesador */
    proc("caseNotZero") {
        print("no es cero")
    }
    proc("caseZero") {
        print("es cero")
    }
    // Inicio del programa
    mov(r01, 5)
    mov(r02, 5)
    sub(r02, r01)
    // Jump if zero
    jz("caseZero")
    // Jump if NOT zero
    jnz("caseNotZero")

    val operand1 = 5
    val operand2 = 4

    if (operand2 - operand1 == 0) {
        print("kotlin: es cero")
    } else {
        print("kotlin: no es cero")
    }

    /** Cómo es un bucle en el procesador */
    val age = 3

    // loop
    proc("loop1") {
        print(r01)
        inc(r01, 1)
        cmp(r01, age)
        jnz("loop1")
    }
    // Acá arranca el programa
    print("bucles")
    mov(r01, 0)
    jmp("loop1")

    var counter = 0
    while(counter < age) {
        // le suma uno a counter y pisa el valor de counter con ese resultado
        // counter = counter + 1
        // le suma el valor de la derecha a counter
        println(counter)
        counter += 1
        // incrementa uno
        // counter++
    }

    counter = 0
    do {
        // le suma uno a counter y pisa el valor de counter con ese resultado
        // counter = counter + 1
        // le suma el valor de la derecha a counter
        println(counter)
        counter += 1
        // incrementa uno
        // counter++
    } while(counter < age)

    /** Sumar dos numeros. */
    proc("sumar") {
        mov(r01, ref("operando1"))
        mov(r02, ref("operando2"))
        add(r01, r02)
        print(res)
    }
    fun sumar(operando1: Int, operando2: Int) {
        print(operando1 + operando2)
    }
    fun connectDb(): Int {
        return 1000
    }
    fun startWebServer(dbHandle: Int): Int {
        //
        return dbHandle + 2000
    }
    // El programa arranca aca
    mov(ref("operando1"), 6)
    mov(ref("operando2"), 7)
    jmp("sumar")

    print("web server handle: " + startWebServer(connectDb()))

    end() // Ends the program.
}

// DO NOT CHANGE ANY CODE FROM HERE, IT VALIDATES THE EXERCISE.
fun main() {
}
