package models.geps;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import play.db.jpa.Model;

@Entity
@Table(schema = "GEPS", name = "PROJETOS")
public class Projeto extends Model {

    public String nome;
    
    @Temporal(TemporalType.TIMESTAMP)
    public Date inicio;

    @Temporal(TemporalType.TIMESTAMP)
    public Date fim;
    
    @OneToMany(cascade = CascadeType.ALL)
    public List<Sprint> sprints;
}
