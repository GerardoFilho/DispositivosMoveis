package dadm.quixada.ufc.trabalho02.helper;

import java.util.List;

import dadm.quixada.ufc.trabalho02.model.Tarefa;

public interface ITarefaDAO {

    public boolean salvar(Tarefa tarefa);
    public boolean atualizar(Tarefa tarefa);
    public boolean deletar(Tarefa tarefa);
    public List<Tarefa> listar();

}
