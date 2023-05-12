
package test;

import domain.Cliente;
import domain.Empleado;
import domain.Persona;
import java.util.Date;

public class testHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000.0);
        System.out.println("Imprimiendo  = " + empleado1);
       //otra forma es Cliente cliente1 = new Cliente(new Date(),true, "Kala", 'F', 28, "Calle 13");
       //otra forma es Cliente cliente1 = new Cliente(fecha,true, "Kala", 'F', 28, "Calle 13");
//         Date fecha = new Date();
//        Cliente cliente1 = new Cliente(fecha,true, "Kala", 'F', 28, "Calle 13");
//        System.out.println("====="+ cliente1);
//        
//       Persona persona1 = new Persona();
    }
    
}

