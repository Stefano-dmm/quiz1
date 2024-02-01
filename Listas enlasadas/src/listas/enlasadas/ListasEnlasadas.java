/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas.enlasadas;
import java.util.Scanner;
import java.util.LinkedList;



public class ListasEnlasadas {

    public static class Node {

        private int numeroNodo;
        private String nombre;
        private String apellido;
        private int edad;

        public Node(int numeroNodo, String nombre, String apellido, int edad) {
            this.numeroNodo = numeroNodo;
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
        }

        @Override
        public String toString() {
            return "{" +
                    "numeroNodo=" + numeroNodo +
                    ", nombre='" + nombre + '\'' +
                    ", apellido='" + apellido + '\'' +
                    ", edad=" + edad +
                    '}';
        }

        void setNext(Node first) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }

    public static void main(String[] args) {
        // Crear una lista enlazada vacía
        LinkedList<Node> linkedList = new LinkedList<>();

        // Preguntar al usuario cuántos nodos quiere agregar
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántos nodos quieres agregar?");
        int cantidadNodos = scanner.nextInt();

        // Agregar los nodos a la lista enlazada
        for (int i = 0; i <= cantidadNodos - 1; i++) {
            System.out.println("Ingrese el número de nodo: ");
            int numeroNodo = scanner.nextInt();
            System.out.println("Ingrese el nombre: ");
            String nombre = scanner.next();
            System.out.println("Ingrese el apellido: ");
            String apellido = scanner.next();
            System.out.println("Ingrese la edad: ");
            int edad = scanner.nextInt();


            linkedList.add(new Node(numeroNodo, nombre, apellido, edad));
           
        }
        
        scanner.close();

        // Imprimir la lista enlazada
        for (Node node : linkedList) {
            System.out.println(node);
        }
    }
    
}



