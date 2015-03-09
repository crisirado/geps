package models.geps;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import models.login.Usuario;
import play.db.jpa.Model;

@Entity
@Table(schema = "GEPS", name = "TAREFAS")
public class Tarefa extends Model{
    String descricao;
    @Temporal(TemporalType.TIMESTAMP)
    public Date criacao;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public Usuario usuario;
}
