package Service;

import DAO.IContratoDAO;

public class ContratoService implements IContratoService{
    private IContratoDAO contratoDAO;
    public ContratoService(IContratoDAO dao) {
        this.contratoDAO = dao;
    }


    @Override
    public String salvar() {
        return null;
    }

    @Override
    public String buscar() {
        return null;
    }

    @Override
    public String excluir() {
        return null;
    }

    @Override
    public String atualizar() {
        return null;
    }
}
