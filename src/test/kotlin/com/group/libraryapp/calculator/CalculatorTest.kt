package com.group.libraryapp.calculator

import org.junit.jupiter.api.Assertions.*


fun main() {
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
    calculatorTest.minusTest()
    calculatorTest.multiplyTest()
    calculatorTest.divideTest()
    calculatorTest.divideExceptionTest()
}

class CalculatorTest {
    fun addTest() {
        val calculator = Calculator(5)
        calculator.add(3)
        if(calculator.number != 8) {
            throw IllegalArgumentException()
        }
    }

    fun minusTest() {
        val calculator = Calculator(5)
        calculator.minus(3)
        if(calculator.number != 2) {
            throw IllegalArgumentException()
        }
    }

    fun multiplyTest() {
        val calculator = Calculator(5)
        calculator.multiply(3)
        if (calculator.number != 15) {
            throw IllegalArgumentException()
        }
    }

    fun divideTest() {
        val calculator = Calculator(5)
        calculator.divide(2)
        if(calculator.number != 2) {
            throw IllegalArgumentException()
        }
    }

    fun divideExceptionTest() {
        val calculator = Calculator(5)

        try {
            calculator.divide(0)
        } catch (e: IllegalArgumentException) {
            return
        } catch (e : Exception) {
            throw IllegalArgumentException()
        }
        throw IllegalArgumentException("기대하는 예외가 발생하지 않았습니다. ")
    }

}