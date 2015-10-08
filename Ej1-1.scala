println ("Primera claificacion")
  var clalificacion1 = readFloat()
println ("Segunda claificacion")
  var clalificacion2 = readFloat()
println ("Tercera claificacion")
  var clalificacion3 = readFloat()
println ("Examen Final")
  var clalificacionExamenFinal = readFloat()
println ("Trabajo Final")
  var TrabajoFinal = readFloat()

val promedio=(calificacion1+calificacion2+calificacion3)/3

porcentajePromedioCalificacion = (((calificacion1+calificacion2+calificacion3)/3)/100)*55
porcentajeCalificacionExamenFinal = (clalificacionExamenFinal/100)*30
porcentajeTrabajoFinal = (TrabajoFinal/100)*15

val final = porcentajePromedioCalificacion+porcentajeCalificacionExamenFinal+porcentajeTrabajoFinal

println ("Calificacion"+Final)
