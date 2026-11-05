package com.colegioanahuac.tarea1;
public class Gerente extends Empleado {
    public String departamentoAsignado; protected int equipoACargo=5;
    public Gerente(int id, String nombre, double salario, String d){ super(id,nombre,salario); this.departamentoAsignado=d; }
    @Override public void trabajar(){ System.out.println(nombre+" (Gerente) gestionando "+departamentoAsignado); }
}
