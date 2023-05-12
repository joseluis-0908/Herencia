package domain;

//las clases hijas pueden acceder a los constructores de la clase padre utilizando la palabra reservada Super y seleccionando el consructor que deseen utilizar
//saber que constructor queremos utilizar simplemente lo define el numero de arguento o parametro que pasemo, si no se pasa ningun argumento se utiliza el constructor de la clase padre vacio
// clase de empleado se va considerar para no tener subclases entonces las declaramos privados (privates)
public class Empleado extends Persona {

    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;//esta variable static la se utiliza para incrementar en 1 cada vez que se cree un objeto de tipo emplado en el constructor de esa clase

    public Empleado() {
        //el compilador hara primero que todo un llamado a la clase padre con super();
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public Empleado(String nombre, double sueldo) {
        //una formad e llamar la clase padre se hace con super
        //super(nombre);// de esta forma llamo
        ///otra forma es con constructor es this
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // env vez de utiilizar contatenarcicon de cadena utilizao la clase StringBbuider ya que nos permite modificar internamene los valores 
    // Utilizando el metodo append vamos contatenando y agregando la informacion de la cadena utilziando append vamos agregando cada uno de los atributos
    // Al final utilizamos la variable dada en la clase y llamamos al metodo toString y nos regresara y String que es lo que pide el metodo toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado idEmpleado = ").append(this.idEmpleado);
        sb.append(", sueldo = ").append(this.sueldo);
        sb.append(",  = ").append(super.toString());
        sb.append("}");
        return sb.toString();
    }

}
