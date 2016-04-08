# macowins
Primera Iteración

La conocida empresa de ropa formal para caballeros, MacoWins, nos solicita un software que sea capaz de satisfacer el siguiente requisito:

Se requiere el diseño y la implementación de una solución que permita el cálculo del precio final de una prenda determinada.

Los tipos de prenda y sus respectivos precios base que a priori el negocio está vendiendo son:
Sacos = $300                         
Pantalones = $250		
Camisas = $200

Para calcular el precio final de la prenda, se utiliza la siguiente fórmula:

Precio Final = (Valor fijo del negocio + Precio Base de la Prenda) x Tasa de Importación

Donde:
El valor fijo del negocio, es un valor X determinado constante para todas las prendas, sea cuales fueran
El precio base, es un precio bruto de cada prenda, por lo que depende exclusivamente de cada tipo de prenda. No existe un precio de venta default.
La tasa de importación es de un 30%, que aplica si y sólo si, obviamente, la prenda es importada: si es nacional, la tasa no afecta al precio final.

Ah, un requerimiento más: MacoWins registra las ventas de estas prendas y necesita tener control sobre las ganancias de un determinado día. Cada venta tiene asociada la prenda que se vendió, su cantidad y la fecha de venta.

--------------------------------------------------------------

Segunda Iteración

Tras una llamada del analista, pudimos entender, que es necesario incluir en la fórmula un factor más: la marca:

Precio Final =  (V. Fijo + P. Base) x T. Importación  x Coeficiente de la Marca

Cada marca, nos comunica su política de precios. Se deben implementar las siguientes políticas:

Armani: Siempre agrega un 65% del valor del precio original del producto
Sarkany: Si el precio original del producto es mayor a $500, agrega un 35%, si es menor, agrega un 10%

Se requiere además, que puedan agregarse políticas de marcas fácilmente, y que no sea difícil modificar las existentes


También cambia la forma de calcular el precio base de algunas prendas y se agregan otras:

Pantalón: $250 + ($1 por cm2 de tela usada en el mismo).
Saco: $300 + (10$ por la cantidad de botones).
Zapatos: $400 + ($5 por el talle).
Sombrero: 150 * (1 + coeficiente de metrosexualidad) (depende del sombrero).
