/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarboles;

import com.modelo.ArbolBinario;
import com.modelo.Nodo;
import java.util.Stack;
import java.util.TreeSet;

/**
 *
 * @author docente
 */
public class PracticaArboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBinario arbol;
        Nodo a1,a2,a;
        Stack pila=new Stack();
        a1=ArbolBinario.nuevoArbol(null, "D",null);
        a2=ArbolBinario.nuevoArbol(null, "E",null);
        a=ArbolBinario.nuevoArbol(a1, "B",a2);
        pila.push(a);
        a1=ArbolBinario.nuevoArbol(null, "F",null);
        a2=ArbolBinario.nuevoArbol(null, "G",null);
        a=ArbolBinario.nuevoArbol(a1, "C",a2);
        pila.push(a);
        a2=(Nodo) pila.pop();
        a1=(Nodo) pila.pop();        
        a=ArbolBinario.nuevoArbol(a1, "A",a2);
        arbol=new ArbolBinario(a);
        System.out.println("---------- Preorden------------");
        ArbolBinario.mPreorden(a);
        System.out.println("---------- Inorden------------");
        ArbolBinario.mInorden(a);
        System.out.println("---------- postorden------------");
        ArbolBinario.mPostorden(a);
        
    }
    
}
