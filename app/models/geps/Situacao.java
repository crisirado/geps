package models.geps;

import javax.persistence.Entity;
import javax.persistence.Table;
import play.db.jpa.Model;

@Entity
@Table(schema = "GEPS", name = "SITUACOES")
public class Situacao extends Model {

    public String sigla;

    public String descricao;
}
