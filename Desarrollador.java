package com.colegioanahuac.tarea1;

public class Desarrollador extends Empleado {
    public String lenguajePrincipal;
    public Desarrollador(int id, String nombre, double salario, String lenguaje){
        super(id, nombre, salario);
        this.lenguajePrincipal = lenguaje;
    }
    @Override
    public void trabajar(){
        System.out.println(nombre + " (Desarrollador) programando en " + lenguajePrincipal + " - Salario $" + salario);
    }
}
