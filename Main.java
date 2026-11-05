package com.colegioanahuac.tarea1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Desarrollador(1, "Jazmin Contreras Bm26520307", 25000, "Java");
        Empleado emp2 = new Diseñador(2, "Ana Lopez", 20000, "Figma");
        Empleado emp3 = new Gerente(3, "Arturo Caballero", 40000, "TI");
        emp1.edad_primitiva=20; emp1.edad_objeto=20;
        emp1.habilidades.add("POO"); emp1.proyectos.add("Sistema Anahuac");
        List<Empleado> lista = new ArrayList<>(Arrays.asList(emp1,emp2,emp3));
        System.out.println("=== Tarea1 Jazmin Bm26520307 ===");
        for(Empleado e: lista){ e.trabajar(); }
    }
}
