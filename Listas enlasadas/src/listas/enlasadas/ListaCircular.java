/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas.enlasadas;
import java.util.LinkedList;
import java.util.Scanner;

public class ListaCircular {

    public static class Node {

        private int numeroNodo;
        private String nombre;
        private String apellido;

        public Node(int numeroNodo, String nombre, String apellido) {
            this.numeroNodo = numeroNodo;
            this.nombre = nombre;
            this.apellido = apellido;
        }

        @Override
        public String toString() {
            return "{" +
                    "numeroNodo=" + numeroNodo +
                    ", nombre='" + nombre + '\'' +
                    ", apellido='" + apellido + '\'' +
                    '}';
        }

        void setNext(Node next) {
            this.next = next;
        }
    }

    public static LinkedList<Node> makeCircular(LinkedList<Node> linkedList) {
        // Convertir la lista enlazada en circular
        Node ultimoNodo = linkedList.getLast();
        ultimoNodo.setNext(linkedList.getFirst());

        return linkedList;
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

            // Crear un nuevo nodo
            Node node = new Node(numeroNodo, nombre, apellido);

            // Agregar el nodo a la lista enlazada
            linkedList.add(node);

            // Convertir la lista enlazada en circular
            LinkedList<Node> circularLinkedList = makeCircular(linkedList);

            // Imprimir la lista enlazada
                System.out.println(circularLinkedList);
        }
    }
}


    
