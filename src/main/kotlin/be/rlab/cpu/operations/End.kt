package be.rlab.cpu.operations

import be.rlab.cpu.Op
import be.rlab.cpu.Processor

class End(private val processor: Processor) : Op {
    override fun exec() {
        processor.end = true
    }

    override fun toString(): String = "END"
}
