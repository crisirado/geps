package models.geps;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import models.login.Usuario;
import play.db.jpa.Model;

@Entity
@Table(schema = "GEPS", name = "TAREFAS_SITUACOES")
public class TarefaSituacao extends Model{
    
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    public Tarefa tarefa;
    
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    public Situacao situacao;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public Usuario usuario;
}
