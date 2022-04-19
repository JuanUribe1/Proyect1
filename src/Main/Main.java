package Main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Persona estudiante = new Persona();
        estudiante.setNombre(JOptionPane.showInputDialog("Ingrese su nombre"));
        estudiante.setApellidos(JOptionPane.showInputDialog("Ingrese su apellido"));
        estudiante.setID(JOptionPane.showInputDialog("Ingrese su ID"));
        estudiante.setCorreo(JOptionPane.showInputDialog("Ingrese su correo electronico"));
        estudiante.setPais(JOptionPane.showInputDialog("Ingrese su pais de residencia"));
        estudiante.setEdad(JOptionPane.showInputDialog("Ingrese su Edad"));
        Mostrar(estudiante);


        System.out.println(estudiante.getNombre()+" "+estudiante.getApellidos()+" "+ estudiante.getID()+" "+estudiante.getCorreo()+" "+estudiante.getPais()+" "+estudiante.getEdad());
        Mostrar(new Persona("Armando","Casas", "23456789", "20", "armando@correo.com", "Colombia"));
    }
    public static void Mostrar(Persona estudiante){
        JOptionPane.showMessageDialog(null, "Datos del estudiante" +
                "\nNombre: "+estudiante.getNombre()+
                "\nApellido: "+estudiante.getApellidos()+
                "\nID: "+ estudiante.getID()+
                "\nCorreo: "+estudiante.getCorreo()+
                "\nPais: "+estudiante.getPais()+
                "\nEdad: "+estudiante.getEdad());
    }
}