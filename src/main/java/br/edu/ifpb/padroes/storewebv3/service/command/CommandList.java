package br.edu.ifpb.padroes.storewebv3.service.command;

import java.util.ArrayList;
import java.util.List;

public class CommandList {
    private List<Command> listaDeComando = new ArrayList();

    public void add(Command c){
        listaDeComando.add(c);
    }

    public void remove(Command c){
        listaDeComando.remove(c);
    }

    public boolean isEmpty(){
        return listaDeComando.isEmpty();
    }

    public List<Command> getList(){
        return listaDeComando;
    }

}
