package github.com.pedrohctrezeleste.Patrimonio.Patrimonio.model;

import jakarta.persistence.*;

@Entity
@Table(name="tb_patrimonio")


public class Patrimonio {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

@Column(name = "nr_patrimonio", nullable = false,length = 50)
    private String nr_patrimonio;

@Column(name = "local",nullable = false,length = 255)
    private String local;

@Column(name = "descricao",nullable = false,length = 255)
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNr_patrimonio() {
        return nr_patrimonio;
    }

    public void setNr_patrimonio(String nr_patrimonio) {
        this.nr_patrimonio = nr_patrimonio;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Patrimonio(Long id, String descricao, String nr_patrimonio, String local) {
        Id = id;
        this.descricao = descricao;
        this.nr_patrimonio = nr_patrimonio;
        this.local = local;
    }

}
