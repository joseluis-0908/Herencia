
package domain;

/**
 *
 * @author JOSE
 */
public class Persona {
    //utilizo modificador de acceso protected porque todo lo que sea private no se hereda a las clases hijas
    //queremos que las clases hijas puedan acceder a estos atributos necesitamos utilizar el modificador de acceso protected
    // se puede tambien no indicar nada pero entonces este atributo seria tipo default y solo va ser accesible a las clases que se encuentren en el mismo paquete
   //utilizado en herencia 
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    
    //ahora despues agrego el constructor vacio 
    
    public Persona(){
        
    }
    // se agrega un constructor ocn un argumento para inicializar el atributo de nombre
    
    public Persona(String nombre){
         this.nombre = nombre;
    }
    
    //agrego un constructor completo, con todos sus argumentos ya que con ello podemos agregar distintos objetos

    public Persona(String nombre, char genero, int edad, String direccion) {
        //en el constructor esta inicializando cada uno de estos argumetnos
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }
    //Por ultimo agrego los metodos get y set para cada atributno
    //es buena practica en los metodos get en el return despues del colocar en el atributo el this no es necesario pero se hace por buena practica

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    // aca ultimo genero el metodo toString para imprimir el estado del objeto con el valor de cada uno de los atributos de nuestra clase

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("nombre = ").append(nombre);
        sb.append(", Genero = ").append(genero);
        sb.append(", Edad = ").append(edad);
        sb.append(", Direccion = ").append(direccion);
        sb.append(", ").append(super.toString());
        sb.append("}");
        return sb.toString();
   }
}