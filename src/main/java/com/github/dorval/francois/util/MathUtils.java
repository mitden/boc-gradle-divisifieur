package com.github.dorval.francois.util;

public class MathUtils {

    /**
     * retourne un entier si la chaine en entrée en est un, sinon IllegalArgumentException
     * @param s
     * @return
     */
    public static Integer parseIntegerString(String s){
        try {
            return Integer.parseInt(s);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException(Errors.PARAMETRE_NON_ENTIER);
        }
    }
}
