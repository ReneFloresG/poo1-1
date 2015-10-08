var continuar = 'S'
var i = 1
do {

println("Edad")
  var Edad = readFloat()
  
println("Antiguedad empleo")
  var Antiguedad empleo = readFloat()

if (Edad>60 , Antiguedad empleo<25 + "Por Edad"){
}
if (Edad=60 , Antiguedad empleo<25 + "Por Edad"){
}
if (Edad<60 , Antiguedad empleo>25 + "Por Antiguedad joven") {
}
if (Edad<60 , Antiguedad empleo=25 + "Por Antiguedad joven") {
} 
if (Edad>60 , Antiguedad empleo=25 + "Por Antiguedad Adulta") {
}
if (Edad=60 , Antiguedad empleo=25 + "Por Antiguedad Adulta") {
}
if (Edad=60 , Antiguedad empleo>25 + "Por Antiguedad Adulta") {
}
if (Edad>60 , Antiguedad empleo>25 + "Por Antiguedad Adulta") {
}

var Edad = new Array [Float] (100 000 000 000)

println ("Deseas continuar (S/N)")
continuar = readChar()
i += 1

} while (continuar == 'S')
