package Main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("too easy");
        Persona estudiante = new Persona();
        estudiante.setNombre(JOptionPane.showInputDialog("Ingrese su nombre"));
        estudiante.setApellidos(JOptionPane.showInputDialog("Ingrese su apellido"));
        estudiante.setID(JOptionPane.showInputDialog("Ingrese su ID"));
        estudiante.setCorreo(JOptionPane.showInputDialog("Ingrese su correo electronico"));
        estudiante.setPais(JOptionPane.showInputDialog("Ingrese su pais de residencia"));
        estudiante.setEdad(JOptionPane.showInputDialog("Ingrese su Edad"));

        System.out.println(estudiante.getNombre()+" "+estudiante.getApellidos()+" "+ estudiante.getID()+" "+estudiante.getCorreo()+" "+estudiante.getPais()+" "+estudiante.getEdad());
    }
}