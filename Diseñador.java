package com.colegioanahuac.tarea1;
public class Diseñador extends Empleado {
    public String herramientaDiseno;
    public Diseñador(int id, String nombre, double salario, String h){ super(id,nombre,salario); this.herramientaDiseno=h; }
    @Override public void trabajar(){ System.out.println(nombre+" (Diseñador) diseñando en "+herramientaDiseno); }
}
