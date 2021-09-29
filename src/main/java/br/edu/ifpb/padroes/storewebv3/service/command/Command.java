package br.edu.ifpb.padroes.storewebv3.service.command;

import br.edu.ifpb.padroes.storewebv3.domain.Order;

import java.util.List;

public abstract class Command {

    public boolean executeCommand(Order order){
        return false;
    }
}
