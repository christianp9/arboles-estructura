/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

/**
 *
 * @author docente
 */
public class ArbolBinario {
    private Nodo raiz;

    public ArbolBinario(Nodo raiz) {
        this.raiz = raiz;
    }

    public ArbolBinario() {
    }

    public static Nodo nuevoArbol(Nodo iz, Object d,Nodo de){
        return new Nodo(d,iz,de);
    }
    
    /**
     * @return the raiz
     */
    public Nodo getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    //recorrido en preorden
    public static void mPreorden(Nodo r){
        System.out.println(""+r.getDato().toString());
        if(r.getIzquierda()!=null){
             mPreorden(r.getIzquierda());
        }if(r.getDerecha()!=null){
             mPreorden(r.getDerecha());
        }
    }
    //recorrido en inorden
    public static void mInorden(Nodo r){
        if(r.getIzquierda()!=null){
             mInorden(r.getIzquierda());
        }
        System.out.println(""+r.getDato().toString());
        if(r.getDerecha()!=null){
             mInorden(r.getDerecha());
        }
    }
    // recorrido en postOrden
     public static void mPostorden(Nodo r){
        if(r.getIzquierda()!=null){
             mPostorden(r.getIzquierda());
        }
        if(r.getDerecha()!=null){
             mPostorden(r.getDerecha());
        }
        System.out.println(""+r.getDato().toString());
        
    }
}
