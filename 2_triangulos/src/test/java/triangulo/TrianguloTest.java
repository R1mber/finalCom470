/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

import java.util.Arrays;
import java.util.List;
import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Rimber
 */
@RunWith(Parameterized.class)
public class TrianguloTest {
    
   @Parameterized.Parameters
    public static List<Object> datos(){
        return Arrays.asList(new Object[][]{
            {1,2,3,"El triangulo es escaleno"},
            {1,1,1,"El triangulo es equilatero"},
            {2,2,2,"El triangulo es equilatero"},
            {5,5,10,"El triangulo es isoceles"},
            {4,4,4,"El triangulo es equilatero"},
            {7,3,3,"El triangulo es isoceles"},
            {2,2,7,"El triangulo es isoceles"},
            {2,10,4,"El triangulo es escaleno"},
            {5,8,3,"El triangulo es escaleno"},
            {1,6,7,"El triangulo es escaleno"},
        });
    }
    @Parameterized.Parameter(0)
    public int l1;
    @Parameterized.Parameter(1)
    public int l2;
    @Parameterized.Parameter(2)
    public int l3;
    @Parameterized.Parameter(3)
    public String res;
    
    Triangulo triangulo=new Triangulo();
    
    @Test
    public void trianguloTest(){
        System.out.println("resultado de >>>l1"+l1+" l2:"+l2+" l3:"+l3);
        assertThat(triangulo.tipoTriangulo(l1, l2, l3),Matchers.is(res));
    }
    
}
