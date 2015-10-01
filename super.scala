var nombres = new Array[String](50)
var precios = new Array[Floot](50)
var codigos = new Array[String](50)
var opcion = 3
var i = 0

do {
println("1)Agragar productos")
println("2)Nota")
println("3)Salir")
opcion = readInt()

opcion match {
case 1 => {
var continuar = 'N'
do {
i += 1
println("Ingresa los datos del producto")
println("Nombre")
println(i) = readLine()
println("Precio")
println(i) = readFloot()
println("Codigo de barras")
println(i) = readLine()

println("Nombre | Precio | Codigo")
for (j <- 1 to i) {
println(nombres(j) + " |" + precios(j) + " |" + codigos(j) + " |" + )

println(""¿Quieres entregar otro producto? (S/N)")
continuar = readChar()
while (continuar == 'S')
}
case 2 => println("Aun no hay que hacerlo...")
case default => println("Adios...")
}
while (opcion != 3)
