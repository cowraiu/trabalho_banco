public class dados {
    private String nome;
    private String sobrenome;
    private int cpf;
    private int saldo = 0;

    public dados(){

    }
    public void setNome(String nome){
        this.nome = nome;

    }
    public void setsobrenome(String sobrenome){
        this.sobrenome = sobrenome;

    }
    public void setcpf(int cpf){
        this.cpf = cpf;

    }
    public int getSaldo(){
        return saldo;
    }
    public void setsaldo(int saldo) {
        if(saldo < 0){
            throw new RuntimeException("\nNão é possivel sacar, valor acima do saldo em conta!");

        }
        this.saldo = saldo;

    }
    public String imprimir(){
        return "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nCPF: " + cpf + "\nSeu saldo é de: " + saldo;
    }

}
