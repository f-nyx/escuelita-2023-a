package be.rlab.cpu.operations

import be.rlab.cpu.Op
import be.rlab.cpu.Processor

class Cat(
    private val processor: Processor,
    private val operand1: Any,
    private val operand2: Any
) : Op {
    override fun exec() {
        val value1 = processor.read(operand1)
        val value2 = processor.read(operand2)
        processor.write(processor.res, "$value1$value2")
    }

    override fun toString(): String = "CAT ${mkString(operand1)}, ${mkString(operand2)}"
}
