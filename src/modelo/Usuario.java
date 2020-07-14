package modelo;
public class Usuario {
    Long id;
    String login;
    String senha;
    String nome;
    String cpf;
    String email;
    String telefone;
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getLogin() { 
        return login;
    }
    public void setLogin(String login) { 
        this.login = login;
    } 
    public String getNome() { 
        return nome;
    } 
    public void setNome(String nome) { 
        this.nome = nome;
    } 
    public String getTelefone() { 
        return telefone;
    } 
    public void setTelefone(String telefone) { 
        this.telefone = telefone;
    } 
    public String getSenha() { 
        return senha;
    } 
    public void setSenha(String senha) { 
        this.senha = senha;
    }
}