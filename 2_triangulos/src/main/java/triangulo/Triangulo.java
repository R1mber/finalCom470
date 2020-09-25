/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

/**
 *
 * @author Rimber
 */
public class Triangulo {
    public String tipoTriangulo(int l1, int l2, int l3) {
        String resultado = "Sin resultado";
        if (l1 == l2 && l2 == l3) {
            resultado = "El triangulo es equilatero";
        } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                resultado = "El triangulo es isoceles";
            } else if (l1 != l2 || l1 != l3 || l3 != l2) {
                    resultado = "El triangulo es escaleno";
                }
        return resultado;
    }
}
