package padrao.builder;

import java.util.Date;

public class ContaBuilder {

    private Conta conta;

    public ContaBuilder() {
        conta = new Conta();
    }

    public Conta build() {
        if (conta.getNumeroConta() == 0) {
            throw new IllegalArgumentException("Número da conta inválido");
        }
        if (conta.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return conta;
    }

    public ContaBuilder setNumeroConta(int numeroConta) {
        conta.setNumeroConta(numeroConta);
        return this;
    }

    public ContaBuilder setSaldo(double saldo) {
        conta.setSaldo(saldo);
        return this;
    }

    public ContaBuilder setSenha(String senha) {
        conta.setSenha(senha);
        return this;
    }

    public ContaBuilder setNome(String nome) {
        conta.setNome(nome);
        return this;
    }

    public ContaBuilder setDataNascimento(Date dataNascimento) {
        conta.setDataNascimento(dataNascimento);
        return this;
    }

    public ContaBuilder setNomeMae(String nomeMae) {
        conta.setNomeMae(nomeMae);
        return this;
    }

    public ContaBuilder setNomePai(String nomePai) {
        conta.setNomePai(nomePai);
        return this;
    }

    public ContaBuilder setCpf(String cpf) {
        conta.setCpf(cpf);
        return this;
    }

    public ContaBuilder setRg(String rg) {
        conta.setRg(rg);
        return this;
    }

    public ContaBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        conta.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public ContaBuilder setEnderecoNumero(int enderecoNumero) {
        conta.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public ContaBuilder setEnderecoComplemento(String enderecoComplemento) {
        conta.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public ContaBuilder setEnderecoBairro(String enderecoBairro) {
        conta.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public ContaBuilder setEnderecoCidade(String enderecoCidade) {
        conta.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public ContaBuilder setEnderecoUF(String enderecoUF) {
        conta.setEnderecoUF(enderecoUF);
        return this;
    }

    public ContaBuilder setCep(String cep) {
        conta.setCep(cep);
        return this;
    }

    public ContaBuilder setEmail(String email) {
        conta.setEmail(email);
        return this;
    }

    public ContaBuilder setCelular(String celular) {
        conta.setCelular(celular);
        return this;
    }

    public ContaBuilder setNomeGerente(String nomeGerente) {
        conta.setNomeGerente(nomeGerente);
        return this;
    }

}
