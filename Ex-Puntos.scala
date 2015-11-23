var maximo = -1
var minimo = 101
var puntosContaminantes = 0
var suma = 0

for(i <- 1 to 25) {
println("Ingresa los Puntos del auto. " + i)
puntosContaminantes = readInt()

if(puntosContaminantes < minimo) {
  minimo = puntosContaminantes
}
if(puntosContaminantes > maximo){
	maximo = puntosContaminantes
}
Total += puntosContaminantes
}

println("El promedio es: " + (Total/25))
println("El más contaminante: " + maximo)
println("El menos contaminante: " + minimo)
