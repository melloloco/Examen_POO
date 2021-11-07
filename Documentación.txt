Documentación Examen_POO


Mi proyecto se asa en la utilización de Decorator Pattern, el cual permite agregar
una nueva funcionalidad a un objeto existente sin alterar su estructura cumpliéndose así
el principio O – Open/Closed Principle (OCP) (Principio abierto / cerrado) ya que está abierto a agregar y
extender el software, pero cerrado ha modificarlo. Este patrón crea una clase decoradora (Decorator) que envuelve la
clase y proporciona funcionalidad adicional (ColorRelleno y ColorBorde) manteniendo intacta la firma de los
métodos de clase.

En resumen creo una interfaz Shape y clases concretas(Corazón, Estrella y Rayo) implementando la interfaz Shape.
Luego creo una clase decoradora abstracta Decorator implementando la interfaz Shape y teniendo el objeto Shape
como su variable de instancia encapsulada con protected para que solo sea accesible desde las clases que heredan
de esta.

MainLienzo, utilizará ColorBorder y ColorRelleno para decorar objetos Shape.

También se cumple el primer principio S – Single Responsability Principle (SRP)
(Principio de responsabilidad única) por el cuál cada componente/clase debe tener una responsabilidad
única y concreta, pequeñas clases con pequeñas funcionalidads.
El principio de L – Liskov Substitution Principle (LSP) (Principio de substitución de Liskov) he intentado
cumplirlo pero no está implementado, igualmente con más tiempo creo que se podría conseguir que la clase Estrella
pueda ser sustituida por la clase Forma y hacer que la clase Estrella pase a ser su subclase.
El principio I – Interface Segretation Principle (ISP) (Principio de segregación de interfaz) no ha sido difícil
de cumplir ya que solo hay una interfaz draw(), la cuál utilizan las clases Estrella, Corazón y Rayo.
El principio D – Dependency Inversion Principle (DIP) (Principio de inversión de dependencias) se cumple ya que
existe la clase abstracta Forma, con la cual se evita que los componentes de alto nivel dependan de los de bajo
nivel al hacer que esta implemente la interfaz con el método draw.
También se aplica el @Override en las 3 clases (Corazón, Rayo y Estrella) y en las dos clases que componen el
ToolBar de Colores (ColorRelleno y ColorBorde) logrando así polimorfismo en tiempo de ejecución.




