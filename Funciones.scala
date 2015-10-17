option match {
do{
println("1. Suma")
println("2. Resta")
println("3. Dividir")
println("4. Multiplicar")
println("5. Adios")

case 1 => sumaFraccion()
case 2 => restaFraccion()
case 3 => divirFraccion()
case 4 => multiplicarFraccion()
case default => println("Adios")
}
}


var continuar = 'S'
var i = 1
do {

var numerator = new Array[Int](999999)
var denominator = new Array[Int](999999)

println("Ingresa tu fraccion")

def capturarDatosFraccion()
 class Rational (a: Int , b:Int) {
  val numerator = a
  val denominator = b
}

println(“Deseas continuar (S/N)”)
continuar = readChar()
i += 1
} while (continuar == 'S')
}


def sumaFraccion (b:racional):Racional = {
 new Racional:
  (numerator*b.denominator)+(denominator*b.numerator) = numerator
  (numerator*b.numerator)+(denominator*b.denominator) = denominator
}

def restaFraccion (b:racional):Racional = {
 new Racional:
  (numerator*b.denominator)-(denominator*b.numerator) = numerator
  (numerator*b.numerator)-(denominator*b.denominator) = denominator
}

def divisionFraccion (b:racional):Racional = {
 new Racional:
  (numerator*b.numerator) = numerator
  (denominator*b.denominator) = denominator
}

def multiplicacionFraccion (b:racional):Racional = {
 new Racional:
  (numerator*b.denominator)+(denominator*b.numerator) = numerator
  (numerator*b.numerator)+(denominator*b.denominator) = denominator
  (numerator/denominator)
}
