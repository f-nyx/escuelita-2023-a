package be.rlab.training.day01

import be.rlab.cpu.entryPoint

/** Métodos de direccionamiento de memoria.
 *
 * 1. registro <--- memoria RAM
 * 2. memoria RAM <---- registro
 * 3. registro <---- valor
 * 4. memoria RAM <---- valor
 */
val processor = entryPoint {

    print("1. registro <--- memoria RAM")
    mov(ref("operador1"), 7)
    mov(ref("operador2"), 2)
    mov(r01, ref("operador1"))
    mov(r02, ref("operador2"))
    add(r01, r02)
    print(res)

    print("2. memoria RAM <---- registro")
    mov(r01, 7)
    mov(r02, 2)
    mov(ref(4096), r01)
    mov(ref(4097), r02)
    mov(r03, ref(4096))
    mov(r04, ref(4097))
    add(r03, r04)
    print(res)

    print("3. registro <---- valor")
    mov(r01, 7)
    mov(r02, 2)
    add(r01, r02)
    print(res)

    print("4. Memoria RAM <---- valor")
    mov(ref(4096), 7)
    mov(ref(4097), 2)
    mov(r01, ref(4096))
    mov(r02, ref(4097))
    add(r01, r02)
    print(res)


    end() // Ends the program.
}

// DO NOT CHANGE ANY CODE FROM HERE, IT VALIDATES THE EXERCISE.
fun main() {
}
