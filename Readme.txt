Ventana Principal e Inicio del analizador


1.Se compila el archivo flex para generar la clase del lexer
2. Se carga el archivo .sql a ser leído en el boton superior derecho (...)
3. Se ejecuta el analizador con el botón leer y se espera sea procesado para luego abrir
   otra ventana con los resultados y luego abrir el archivo .out de una vez


El programa funciona correctamente, porque realice las pruebas con archivos .sql que utilizo en el desarrollo del sistema que estoy realizando por parte del trabajo y que ya han sido ejecutados, por otra parte tambien utilice archivos de la clase de BD1 y BD2 para corroborar que todo estuviera bien.



Los errores como son especificos y para que fuera mas rapido su identificacion, se le realizó su especifica expresion regular sin afectar identificar los demas tokens, en la ventana de resultados del lado derecho muestra todos los errores que se encuentran en el archivo, especificando donde esta y cual es, el de identificador imprime doble pero solo para mostrar que si se realiza el truncado de 31 caracteres.



***NOTA: Tanto la ruta del archivo flex como del destino de los archivos de salida
	estan quemadas en el codigo de la aplicacion. (Inicio.Java)

README FASE 3

Manejo de la tabla de simbolos
Pare el manejo de la tabla de simbolos se empleo un metodo de Escribir() el cual actualiza un archivo  .OUT con la tabla de simbolos
, se utilizaron estructuras de datos para ser mas especificos se utilizaron listas enlazadas donde almacenamos
las funciones y sus parametros , la tablas  y los campos de las mismas , variables que estan declaradas para cierto ambito o base de datos.

Estructura de tabla de simbolos
Ejemplo:

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
-------------------------------------------------------------------------------------------------------------------------------------------------
|                                                              TABLA DE SIMBOLOS                                                                |
-------------------------------------------------------------------------------------------------------------------------------------------------
|                                                                  VARIABLES                                                                    |
-------------------------------------------------------------------------------------------------------------------------------------------------
| Nombre                        | Tipo de Dato | Valor                                                          | Ambito                        |
-------------------------------------------------------------------------------------------------------------------------------------------------
|                              h|        string|                                        holamaniana no hay clase|                           base|
|                            hay|        string|                                                             Hey|                           base|
|                              k|           int|                                                        24757888|                           base|
|                              n|         float|                                                       3847414.5|                           base|
|                              f|         float|                                                                |                           base|
|                             id|           int|                                                        24757888|                    FN_Circuito|
|                         nombre|        string|                                                                |                    FN_Circuito|
|                            mul|         float|                                                                |                    FN_Circuito|
-------------------------------------------------------------------------------------------------------------------------------------------------
|                                                                  FUNCIONES                                                                    |
-------------------------------------------------------------------------------------------------------------------------------------------------
| Nombre                        | Tipo de Dato | Parametros                                                     | Ambito                        |
-------------------------------------------------------------------------------------------------------------------------------------------------
|                    FN_Circuito|           int|                             id,                             int|                   Motociclismo|
|                               |              |                         nombre,                          string|                               |
|                               |              |                            mul,                           float|                               |
-------------------------------------------------------------------------------------------------------------------------------------------------
|                                                                    TABLAS                                                                     |
-------------------------------------------------------------------------------------------------------------------------------------------------
| Nombre                        | Schema                        | Campos                                        | Ambito                        |
-------------------------------------------------------------------------------------------------------------------------------------------------
|                        Carrera|                         NASCAR|                       NombreGP,         string|                         master|
|                               |                               |                            Año,         string|                               |
|                               |                               |                FechaHoraInicio,         string|                               |
|                               |                               |                     NumVueltas,            int|                               |

Para el manejo de transacciones se manejo una pila donde si se hace un begin tran hace un push en la pila con el nombre de la transaccion
o si esta vacia , tambien se hace un commit tran que representa un pop en la pila , si se raliza un save tran se hace un push en la pila
donde se manda el nombre del save point por ultimo para los rollback se vacia la pila hasta el id que mandemos y si el rollback viene
vacio se sacan todos los elementos de la pila.

Manejo de errores
Para el manejo de errores  se comprobaron que los elementos que deseemos usar estuvieran creados en la BDD,tambien se comprobo que no se
pudieran crear dos objetos  del mismo tipo con el mismo id para el mismo ambito , se comprobo que si en una variable
deseamos ingresar algo que no es de su tipo da error , se comprobo que se pudieran operar objetos del mismo tipo en el caso de los int 
y floats se comprobo que si operamos int con float de forma automatica lo convierte a float y si desemos meter un float en un int esto da
error porque el float pierde todos sus decimales de lo contrario si deseamos meter un  int en un float si deja porque no pierde
decimales; todos estos errores semanticos se guardan en una lista la cual al terminar el analisis los imprime.






