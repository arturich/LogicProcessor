/**
 *  @version 1.0
 *  @author Carlos Iván Castillo Sepúlveda
 *  adhoc talent todos los derechos reservados 2020
 */

package com.adhoc.java.processor.logic.interfaces;

/**
 * Esta interfaz establece la plantilla para las evaluaciones de equivalencias logicas
 * @author Carlos Iván Castillo Sepúlveda
 * @param <T> tipo de la expresion a evaluar
 */
@FunctionalInterface
public interface Equivalencia<T> {
    T aplicar(T expresion);   
}
