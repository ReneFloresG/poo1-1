main()

def main() {
 var nombre = new Array[String](100)
 var precio = new Array[Float](100)
 var codigo = new Array[String](100)

catalogo(nombre, precio, codigo)
}

def mostrarMenuPrincipal() {
println("1) Agregar productos")
println("2) Nota")
println("3) Salir")
}



def catalogo(
 nombre: Array[String]
 precio: Array[Float]
 codigo: Array[String]
) {
var opcion = 3
var cantidadProductos = 0
var productosAgregados = 0

do {
mostrarMenuPrincipal()
opcion = readInt()
opcion match {
case 1 => {
 productosAgregados = agregarProductos ( nombre, precio, codigo, cantidadProductos )
 cantidadProductos = productosAgregados
 }

case 2 => println("No lo hagas aun")
 case default => println("Arrivederchi")
 }
 } while (opcion != 3)
 }


def agregarProductos(
nombre: Array[String]
precio: Array[Float]
codigo: Array[String]
cantidadProductos: Int
) : Int = {
var continuar = 'N'
var i = cantidadProductos
 do {
 capturarProducto (nombre, precio, codigo)
 mostrarCatalogo (nombre, precio, codigo)
 i = i + 1
 print("¿Quieres agregar otro producto (S/N)? ")
continuar = readChar()
 } while (continuar == 'S')
 }

def capturarProducto(
  nombre: Array[String]
  precio: Array[Float]
  codigo: Array[String]
) {
  println("Ingresa los datos del producto")
  print("Nombre: ")
  nombre = readLine()
  print("Precio: ")
  precio = readFloat()
  print("Código de barras: ")
  codigo = readLine()
}

def mostrarCatalogo (
  nombre: Array[String]
  precio: Array[Float]
  codigo: Array[String]
  i: Int
) {
  println(" Nombre | Precio | Código ")
  for (m <- 0 to i) {
    println(" | " nombre(m) + " | " +  precio(m) + " | " + codigo(m)" | ")
  }
}
