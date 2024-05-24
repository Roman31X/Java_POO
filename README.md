# Programación Orientada a Objetos

- Java es un lenguaje orientado a objetos.
- Un objeto e suna representación de una entidad de la vida real
 en nuestro programa.
- Para crear un objeto primero necesitamos crear una clase a 
plantilla.
- Una clase representa las características en común de nuestros
objetos. Es una abstracción.

- [x] EJEMPLO
- Si queremos construir un edificio, primero necesitamos su plano,
es decir, una clase o plantilla y partir de ese plano, podemos crear
muchos edificios similares, es decir los objetos.

## Elementos de una Clase
Una clase se compone de atributos y métodos.
- [x] ATRIBUTOS: 
  - son características de nuestros objetos.
- [x] MÉTODOS: 
  - son las acciones que pueden realizar nuestros objetos.
  En sí estas acciones son funciones, pero cuando se asocian con una clase
  se le llama métodos.
  Una vez que hemos definido nuestra clase, podemos crear objetos,
  a esto se le llama instanciar clase.

## Paquetes en Java
Un paquete es una colección de archivos y directorios. Nos permite
organizar las clases.

# PILARES DE LA PROGRAMACIÓN ORIENTADA A OBJETOS

## ENCAPSULAMIENTO
- [x] El encapsulamiento nos permite controlar el acceso a los atributos
de nuestra clase.
- [x] Para evitar acceder a los atributos directamente usaremos el modificador
de acceso private.
- [x] Y para poder leer y modificar los atributos creamos métodos conocidos
como get y set.
- [x] Los métodos get (obtener) nos permite leer el valor de un atributo.
- [x] los métodos set (poner) nos permite modificar el valor de un atributo.

## HERENCIA
- [x] El más fácil de entender porque tiene relación con el mundo real. 
Por ejemplo, mis hijos han heredado muchas cosas de mí, tanto atributos 
como funcionalidades.
- [X] Tenemos una clase padre, y las clases hijas heredan funcionalidades
y atributos, pero no son idénticas.
- [x] Sin embargo, ninguno es una copia exacta de mí. Sobre esas cosas que 
han heredado, tienen sus propios atributos y funcionalidad.

## POLIMORFISMO
- [x] Polimorfismo significa de muchas formas. En nuestro caso llamamos 
polimorfismo cuando un método recibe un parámetro que abarca varios tipos.
- [x] La ventaja que esto ofrece es que podemos generalizar algoritmos 
para que funcionen con distintos tipos.
- [x] De esta manera se da el polimorfismo, pues el método reparar puede
trabajar con varios tipos distintos.

## ABSTRACCIÓN
- [x] Cuando hacemos una abstracción, queremos omitir detalles que no son
  necesarios para nosotros, y queremos solamente mostrar lo que sí es relevante.
- [x] Desde el punto de vista del desarrollo de software, podemos ver que con
  una clase podemos realizar una abstracción de una entidad del mundo real.
- [x] Nuestra clase abstrae todo lo que representa un carro, tomando solamente
  lo que nos interesa, descartando todo lo demás
