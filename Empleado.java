package com.colegioanahuac.tarea1;
import java.util.*;
public abstract class Empleado {
    public String nombre; protected double salario; private int id;
    public int edad_primitiva; public Integer edad_objeto;
    public double salario_primitivo; public Double salario_objeto;
    public boolean activo_primitivo; public Boolean activo_objeto;
    public char genero_primitivo; public Character genero_objeto;
    public long telefono_primitivo; public Long telefono_objeto;
    public float bono_primitivo; public Float bono_objeto;
    public byte nivel_primitivo; public Byte nivel_objeto;
    public String departamento;
    public ArrayList<String> habilidades; public LinkedList<String> proyectos;
    public HashSet<String> certificaciones; public HashMap<String, Integer> evaluaciones;
    public Empleado(int id, String nombre, double salario) {
        this.id=id; this.nombre=nombre; this.salario=salario;
        habilidades=new ArrayList<>(); proyectos=new LinkedList<>();
        certificaciones=new HashSet<>(); evaluaciones=new HashMap<>();
    }
    public int getId(){return id;} public abstract void trabajar();
}
