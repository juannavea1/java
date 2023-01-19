package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * desarrollado por Juan Navea
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Empleado E1 = new Empleado("Juan", "Navea", 24, "A1", "Desarrollador", "Planta 1", 700000);
        Empleado E2 = new Empleado("Allen", "Martinez", 23, "A2", "Chef jefe", "Cocina", 800000);

        E1.MostrarEmpleados();
        E2.MostrarEmpleados();

        List <Empleado> lEmpleados = new ArrayList<Empleado>();
        lEmpleados.add(E1);
        lEmpleados.add(E2);

        for(int i = 0;i< lEmpleados.size();i++){
            System.out.println(lEmpleados.get(i));
        }
    }
}
