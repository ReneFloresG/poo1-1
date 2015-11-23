var kg = 0.0
var compracliente = 0.0
var total = 0.0

println("Precio del kilo de naranja")
val precio = readFloat()

for (i<- to 15) {
println("¿Cuántos kilos compro?")
kilos = readFloat()
compra = precio * kilos

if (kilos > 10 ){
compra = (compra/100) * 15
}
total += compra
}

println("El total de su compra es: " + compra)

println("La ganancia de la tienda será:" + total) 
