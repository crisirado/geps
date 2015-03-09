package models.geps;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import play.db.jpa.Model;

@Entity
@Table(schema = "GEPS", name = "PROJETOS")
public class Projeto extends Model {

    String nome;
    
    @Temporal(TemporalType.TIMESTAMP)
    Date inicio;

    @Temporal(TemporalType.TIMESTAMP)
    Date fim;
    
    @ManyToOne(cascade = CascadeType.ALL)
    List<Sprint> sprints;
}
