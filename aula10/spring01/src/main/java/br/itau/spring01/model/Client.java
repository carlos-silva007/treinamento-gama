package br.itau.spring01.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // indica que esta classe sera armazenada no Banco de Dados
@Table(name = "cliente") // nome da tabela no banco de dados

public class Client {

    @Id // indica que este campo sera a chave primaria (PK)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // indica que numero sera gerado pelo BD sequencial
    private long cod;

    @Column(name = "nome", length = 200, nullable = false)
    // length = tamanho maximo, nullable = false > campo obrigatorio
    private String name;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    // unique = nao pode ter 2 emails iguais
    private String email;

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
