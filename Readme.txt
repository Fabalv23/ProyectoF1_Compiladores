Ventana Principal e Inicio del analizador


1.Se compila el archivo flex para generar la clase del lexer
2. Se carga el archivo .sql a ser leído en el boton superior derecho (...)
3. Se ejecuta el analizador con el botón leer y se espera sea procesado para luego abrir
   otra ventana con los resultados y luego abrir el archivo .out de una vez


El programa funciona correctamente, porque realice las pruebas con archivos .sql que utilizo en el desarrollo del sistema que estoy realizando por parte del trabajo y que ya han sido ejecutados, por otra parte tambien utilice archivos de la clase de BD1 y BD2 para corroborar que todo estuviera bien.



Los errores como son especificos y para que fuera mas rapido su identificacion, se le realizó su especifica expresion regular sin afectar identificar los demas tokens, en la ventana de resultados del lado derecho muestra todos los errores que se encuentran en el archivo, especificando donde esta y cual es, el de identificador imprime doble pero solo para mostrar que si se realiza el truncado de 31 caracteres.



***NOTA: Tanto la ruta del archivo flex como del destino de los archivos de salida
	estan quemadas en el codigo de la aplicacion. (Inicio.Java)


Manejo de la tabla de simbolos
Pare el manejo de la tabla de simbolos se empleo un metodo de Escribir() el cual actualiza un archivo  .OUT con la tabla de simbolos
para el manejo de la misma se utilizaron estructura de datos para ser mas especificos se utilizaron listas enlazadas donde almacenamos
las funciones y sus parametros , la tablas (los campos de las mismas) , variables , para cierto ambito o base de datos.

Estructura de tabla de simbolos



Para el manejo de transacciones se manejo una pila donde si se hace un begin tran hace un push en la pila con el nombre de la transaccion
o si esta vacia , tambien se hace un commit tran que representa un pop en la pila , si se raliza un save tran se hace un push en la pila
donde se manda el nombre del save point po ultimo para los rollback se vacia la pila hasta el id que mandemos y si el rollback viene
vacio se sacan todos los elementos de la pila.


