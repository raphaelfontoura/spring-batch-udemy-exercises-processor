package com.springbatch.contasbancarias.processor;

import com.springbatch.contasbancarias.dominio.Cliente;
import com.springbatch.contasbancarias.dominio.Conta;
import com.springbatch.contasbancarias.dominio.Tipo;
import org.springframework.batch.item.ItemProcessor;

public class ContaBancariaProcessor implements ItemProcessor<Cliente, Conta> {

    @Override
    public Conta process(Cliente cliente) throws Exception {
        Conta conta = new Conta();
        conta.clienteId = cliente.getEmail();
        conta.tipo = Tipo.getTipo(cliente.getFaixaSalarial());
        conta.limite = conta.tipo.getLimite();

        return conta;
    }
}
