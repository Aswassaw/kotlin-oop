package data

class Car(pBrand: String, pName: String, pYear: Int) {
    init {
        println("Car $pBrand dibuat")
    }

    constructor(pBrand: String, pName: String) : this(pBrand, pName, 2020) {
        println("Cunstructor Kedua")
    }

    var brand: String = pBrand
    var name: String = pName;
    var year: Int = pYear
}