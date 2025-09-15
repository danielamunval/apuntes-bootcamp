package J5_Funciones;

public class F2_ModificadoresAcceso {
    /** MODIFICADORES DE ACCESO **/

    // Son palabras clave que se utilizan para restringir el alcance de una clase, constructor, variable, método o miembro de datos.
    //  Estos modificadores proporcionan seguridad y control sobre el acceso a los elementos de un programa.
    //  Asegurando que solo las partes específicas del código tengan permiso para interactuar con ciertos elementos.

    /** Existen cuatro tipos: public - private - protected - default **/

    /** PUBLIC **/
        // Los elementos son accesibles desde cualquier parte, ya sea dentro de la misma clase, desde otras clases en el mismo paquete o desde clases en otros paquetes.
        /** Sintaxis básica: **/
                    public class MiClase {
                        public int variablePublica;
                        public void metodoPublico() {
                            // código
                        }
                    }

    // -----------------------------

    /** PRIVATE **/
        // Los elementos solo son accesibles dentro de la misma clase. No son accesibles desde clases en otros paquetes ni siquiera desde subclases.
        /** Sintaxis básica: **/
                public class MiClase1 {
                    private int variablePrivada;
                    private void metodoPrivado() {
                        // código
                    }
                }

    // -----------------------------

    /** PROTECTED **/
        // Los elementos son accesibles dentro de la misma clase, desde clases en el mismo paquete y desde subclases, ya sea en el mismo paquete o en otro paquete.
        /** Sintaxis básica: **/
                public class MiClase2 {
                    protected int variableProtegida;
                    protected void metodoProtegido() {
                        // código
                    }
                }

    // -----------------------------
    /** DEFAULT **/
        // Si no se especifica ningún modificador, el elemento tiene un nivel de acceso predeterminado, que es el acceso dentro del mismo paquete.
        // Es decir, el elemento es accesible desde cualquier clase en el mismo paquete, pero no desde clases en otros paquetes.

        /** Sintaxis básica: **/
            class MiClase3 {
                int variableDefault;
                void metodoDefault() {
                    // código
                }
         }

}