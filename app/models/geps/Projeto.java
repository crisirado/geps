package models.geps;

import java.util.Date;
import javax.persistence.Entity;
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
}
