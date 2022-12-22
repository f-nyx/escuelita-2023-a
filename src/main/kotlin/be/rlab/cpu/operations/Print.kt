package be.rlab.cpu.operations

import be.rlab.cpu.MemoryRef
import be.rlab.cpu.Op
import be.rlab.cpu.Register

class Print(private val value: Any) : Op {
    override fun exec() {
        when (value) {
            is Register -> println("// register $value")
            is MemoryRef -> println("// memory address $value")
            else -> println("// $value")
        }
    }

    override fun toString(): String = "PRINT ${mkString(value)}"
}
