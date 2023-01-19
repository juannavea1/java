package com.example;

public class Empleado extends Persona {

    private String ID;
    private String cargo;
    private String departamento;
    private int sueldo;

    public Empleado(String nombre, String apellido, int edad, String ID, String cargo, String departamento, int sueldo){
        super(nombre,apellido,edad);
        this.ID = ID;
        this.cargo = cargo;
        this.departamento = departamento;
        this.sueldo = sueldo;
    }

    
}
