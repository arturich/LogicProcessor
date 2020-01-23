/**
 *  @version 1.0
 *  @author Carlos Iván Castillo Sepúlveda
 *  adhoc talent todos los derechos reservados 2020
 */

package com.adhoc.java.processor.logic.operators;

import java.util.LinkedList;

/**
 * Esta interfaz establece la plantilla para las evaluaciones de expresiones logicas
 * @author Carlos Iván Castillo Sepúlveda
 * @param <T> tipo de la pila a evaluar
 */
@FunctionalInterface
public interface Operador<T> {
    /**
     * Contiene el caracter \u2194
     */
    String $BICONDITIONAL="\u2194";
    /**
     * Contiene el caracter \u22BB
     */
    String $XOR="\u22BB";
    /**
     * Contiene el caracter \u2192
     */
    String $CONDITIONAL="\u2192";
    public Boolean test(LinkedList<T> Operand);
}
