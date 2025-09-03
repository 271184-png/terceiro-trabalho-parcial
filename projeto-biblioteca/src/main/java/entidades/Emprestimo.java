package entidades;

import java.time.LocalDate;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Emprestimo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public Integer id;

    public LocalDate dataEmprestimo;
    public LocalDate dataDevolucao;
    
    @ManyToOne
    public LIvro lIvro;
    
    @ManyToOne 
    public Usuario usuario;


}
