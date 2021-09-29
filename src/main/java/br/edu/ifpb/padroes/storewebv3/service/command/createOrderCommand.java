package br.edu.ifpb.padroes.storewebv3.service.command;

import br.edu.ifpb.padroes.storewebv3.domain.Order;

public class createOrderCommand extends Command{

    @Override
    public boolean executeCommand(Order order){
        order.setProcessed(true);
        return true;
    }

}
