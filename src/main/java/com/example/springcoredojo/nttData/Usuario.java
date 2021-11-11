package com.example.springcoredojo.nttData;

import org.springframework.stereotype.Component;

    @Component
    public class Usuario {
        private Alumno alumno;

        public Alumno getAlumno(){
            return alumno;
        }
        public String toString(){
            return "Alumno{"+
                    "alumno="+ alumno+
                    '}';
        }
        public void setAlumno(Alumno alumno){
            this.alumno = alumno;
        }
        public Usuario(Alumno alumno){
            this.alumno = alumno;
        }
    }
