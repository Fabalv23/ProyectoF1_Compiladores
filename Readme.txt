Ventana Principal e Inicio del analizador


1.Se compila el archivo flex para generar la clase del lexer
2. Se carga el archivo .sql a ser leído en el boton superior derecho (...)
3. Se ejecuta el analizador con el botón leer y se espera sea procesado para luego abrir
   otra ventana con los resultados y luego abrir el archivo .out de una vez


El programa funciona correctamente, porque realice las pruebas con archivos .sql que utilizo en el desarrollo del sistema que estoy realizando por parte del trabajo y que ya han sido ejecutados, por otra parte tambien utilice archivos de la clase de BD1 y BD2 para corroborar que todo estuviera bien.



Los errores como son especificos y para que fuera mas rapido su identificacion, se le realizó su especifica expresion regular sin afectar identificar los demas tokens, en la ventana de resultados del lado derecho muestra todos los errores que se encuentran en el archivo, especificando donde esta y cual es, el de identificador imprime doble pero solo para mostrar que si se realiza el truncado de 31 caracteres.



***NOTA: Tanto la ruta del archivo flex como del destino de los archivos de salida
	estan quemadas en el codigo de la aplicacion. (Inicio.Java)
