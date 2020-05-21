package colegio;

import java.util.Date;

/**
 *
 * @author Amin
 */

public final class AlumnoCiclo extends Alumno {

    /**
     *
     */
    public AlumnoCiclo() {
        super();
    }

    /**
     *
     * @param nombre
     * @param apellidos
     */
    public AlumnoCiclo(String nombre, String apellidos) {
        super(nombre, apellidos);
    }

    /**
     *
     * @param nombre
     * @param apellidos
     * @param nacimiento
     * @param notas
     */
    public AlumnoCiclo(String nombre, String apellidos, Date nacimiento, int[] notas) {
        super(nombre, apellidos, nacimiento, notas);
    }

    /**
     *
     * @param curso
     */
    @Override

    public void matricular(Curso curso) {
        if (curso == Curso.SMR1 || curso == Curso.SMR2 || curso == Curso.ASIR1 || curso == Curso.ASIR2) {
            this.curso = curso;
        }
    }

    @Override
    public void desmatricular() {
        if (curso != null) {
            this.curso = null;
        }
    }

}
