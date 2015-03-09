package models.geps;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "GEPS", name = "SPRINTS")
public class Sprint {
    @Temporal(TemporalType.TIMESTAMP)
    Date inicio;
    
    @Temporal(TemporalType.TIMESTAMP)
    Date fim;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "projetos")
    Projeto projeto;
}
