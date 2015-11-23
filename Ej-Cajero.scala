var nombre = new Array[String](50)
var precio = new Array[Float](50)
var codigos = new Array[String](50)
var opcion = 3
var i = 0
 catalogo()

def catalogo(){
	do{
		mostrarMenuPrincipal()
		opcion = readInt()
		opcion match {
			case 1 => agregarProductos()
			case 2 => println("aun no hay que hacerlo")
			case default =>println("Adios...")
		}
		} while (opcion!=3)
        }
        def mostrarMenu(){
        	println("1) Agregar productos ")
        	println("2) Nota ")
        	println("3) Salir ")
        }
        def agregarProductos() {
        	var continuar='N'
        	do{
        		i+=1
        		capturarDatos()
        		mostrarCatalogo()
        		println("quieres agregar otro producto (S/N")
        			continuar=readChar()
        } while (continuar == 'S')
        }
        def capturarDatos() {
        	println("Capturar datos del producto")
        	println("Nombre")
        	 nombre(i) = readLine()
        	println("Precio")
            precio(i)=readFloat()
          println("Codigo de barras")
            codigos(i)=readLine()        }
        def mostrarCatalogo()  {
        	println("Nombre |  Precio  | Codigo ")
        	for( j <- 1 to i) {
        		println(" | " + nombre(j) + " | " + precio(j) + " | " + codigos(j + " | ") }
        		}
