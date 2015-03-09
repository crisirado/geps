package models.geps;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import play.db.jpa.Model;

@Entity
@Table(schema = "GEPS", name = "SPRINTS")
public class Sprint extends Model{
    @Temporal(TemporalType.TIMESTAMP)
    public Date inicio;
    
    @Temporal(TemporalType.TIMESTAMP)
    public Date fim;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PROJETO_ID")
    public Projeto projeto;
}
