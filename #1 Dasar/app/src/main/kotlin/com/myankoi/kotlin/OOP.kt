package com.myankoi.kotlin

open class Animal(name: String, weight: Double, age: Int, isCarnivore: Boolean) {
    protected val name: String
    protected val weight: Double
    protected val age: Int
    protected val isCarnivore: Boolean

    init {
        this.name = name
        this.weight = weight
        this.age = age
        this.isCarnivore = isCarnivore
    }

    open fun eat() {
        println("${name} is eating")
    }
    open fun sleep() {
        println("${name} is sleeping")
    }
}

class Cat(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, furColor: String, numberOfFeet: Int)
    : Animal(pName, pWeight, pAge, pIsCarnivore) {

        private val furColor: String
        private val numberOfFeet: Int

        init {
            this.furColor = furColor
            this.numberOfFeet = numberOfFeet
        }

    fun playWithHuman() {
        println("${name} is playing with human")
    }

    override fun eat() {
        super.eat()
        println("${name} is eating fish")
    }

    override fun sleep() {
        super.sleep()
        println("${name} is sleeping on the pillow")
    }
}


fun main() {
    val cat = Cat("Tom", 4.2, 2, true, "Orange", 4)
    cat.playWithHuman()
    cat.eat()
    cat.sleep()
}
