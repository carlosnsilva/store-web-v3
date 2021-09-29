package br.edu.ifpb.padroes.storewebv3.service;

import br.edu.ifpb.padroes.storewebv3.domain.Order;
import br.edu.ifpb.padroes.storewebv3.service.command.Command;
import br.edu.ifpb.padroes.storewebv3.service.command.CommandList;
import br.edu.ifpb.padroes.storewebv3.service.command.createOrderCommand;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    public List<Command> getCommands(Order pedido){
        return executeCommand(new createOrderCommand(),pedido);
    }

    private List<Command> executeCommand(Command c, Order o){
        CommandList ComandoLista = new CommandList();
        c.executeCommand(o);
        ComandoLista.add(c);

        return ComandoLista.getList();

    }
}
