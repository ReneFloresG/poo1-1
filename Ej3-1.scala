println ("Valor compra")
val Valor compra=readFloat()

println ("Pelota")
val Pelota=readString()


if (Pelota % 2 == 0) {
  println(Blanca + "Sin descuento")
    val Blanca=Valor compra-0
} else {
  println(Verde + "10 por ciento de descuento")
    val Verde=Valor compra-((Valor compra/100)*10)
} else {
  println(Amarillo + "25 por ciento de descuento")
    val Amarillo=Valor compra-((Valor compra/100)*25)
} else {
  println(Azul + "50 por ciento de descuento")
    val Azul=Valor compra-((Valor compra/100)*50)
} else {
  println(Roja + "100 por ciento de descuento")
    val Roja=Valor compra-Valor compra
}
