
package github.com.pedrohctrezeleste.Patrimonio.Patrimonio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_patrimonio")

public class Patrimonio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nr_patrimonio", nullable = false, length = 50)
    private String nrPatrimonio;

    @Column(name = "local", nullable = false, length = 255)
    private String local;

    @Column(name = "descricao", nullable = false, length = 255)
    private String descricao;

    // Construtor
    public Patrimonio() {
    }

    // Getter e Setter da descrição
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Getter e Setter do local
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    // Getter e Setter do número do patrimônio
    public String getNrPatrimonio() {
        return nrPatrimonio;
    }

    public void setNrPatrimonio(String nrPatrimonio) {
        this.nrPatrimonio = nrPatrimonio;
    }

    // Getter e Setter do ID
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
