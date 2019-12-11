/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



/**
 *
 * @author Castelao
 */
public class TestUnit {

    private enum LetraDNI {
        T("T"), R("R"), W("W"), A("A"), G("G"), M("M"), Y("Y"), F("F"), P("P"),D("D"), X("X"), B("B"),
        N("N"), J("J"), Z("Z"), S("S"), Q("Q"), V("V"), H("H"), L("L"), C("C"),K("K"), E("E");
        private final String s;

        private LetraDNI(String s) {
            this.s = s;
        }

        public String toString() {
            return s;
        }

    };

    private static boolean validarNif(String nif) {
        int size = nif.length();
        int suma = 0;
        String letra;
        if (size != 9) {
            return false;
        }
        if (!Character.isLetter(nif.charAt(8))) {
            return false;
        }
        letra = nif.substring(8).toUpperCase();

        for (int i = 0; i < 8; i++) {
            if (!Character.isDigit(nif.charAt(i))) {
                return false;
            } 
        }
        suma = Integer.parseInt(nif.substring(0,8));
        LetraDNI[] dni = LetraDNI.values();
        
        suma = suma % dni.length;
        
        
        
        if (!letra.equals(dni[suma].toString())) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(validarNif("37768786"));
    }

}
