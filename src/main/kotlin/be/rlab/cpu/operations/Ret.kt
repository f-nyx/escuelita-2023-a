package be.rlab.cpu.operations

import be.rlab.cpu.Op
import be.rlab.cpu.Processor

class Ret(
    private val processor: Processor,
    private val value: Any?
) : Op {
    override fun exec() {
        processor.write(processor.res, processor.read(value))
    }

    override fun toString(): String = "RET ${processor.read(value)}"
}
