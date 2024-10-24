package com.campusdual.classroom;

import java.util.Objects;

public class Exercise03 {

    // Esto es una funcion, ya que devuelve un valor
    public static String greetings(String name) {
        return ("Hola. Bienvenido " + name);
    }

    // Esto es una funcion, ya que devuelve un valor
    public static String error(String nombre) {
        return ("Ups. No pudimos validar tus datos. Tu nombre de usuario no es " + nombre);
    }

    //Esto es un procedimiento, ya que no devuelve un valor
    // TODO ↓: Tiene que comprobar si el usuario que recibe por parámetro es "Sebas" y su contraseña es "sebas01". Si es correcto, que muestre el mensaje de la función greetings() y si no que muestre el mensaje de la función error()
    public static void checkUser(String user, String pass) {
        if (Objects.equals(user, "Sebas") && Objects.equals(pass, "sebas01")){
            System.out.println(greetings(user));
        } else {
            System.out.println(error("Sebas"));
        }
    }


    public static void main(String[] args) {
        checkUser("Sebas", "sebas01");
        checkUser("Test", "Test");
    }
}
