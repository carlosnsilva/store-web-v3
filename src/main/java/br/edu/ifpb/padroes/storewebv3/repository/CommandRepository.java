package br.edu.ifpb.padroes.storewebv3.repository;

import br.edu.ifpb.padroes.storewebv3.service.command.Command;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CommandRepository {

    private List<Command> commandList = new ArrayList<>();

    public List<Command> getCommandList(){
        return commandList;
    }

    public void add(Command c){
        commandList.add(c);
    }

    public void remove(Command c){
        commandList.remove(c);
    }

}
