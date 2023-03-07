package Clase14.Clase.Service;

import Clase14.Clase.DAO.IDao;
import Clase14.Clase.Model.Medicamento;

import java.util.List;

public class MedicamentoService {

    IDao<Medicamento> medicamentoIDao;

    public MedicamentoService(IDao<Medicamento> medicamentoIDao) {
        this.medicamentoIDao = medicamentoIDao;
    }

    public IDao<Medicamento> getMedicamentoIDao() {
        return medicamentoIDao;
    }

    public void setMedicamentoIDao(IDao<Medicamento> medicamentoIDao) {
        this.medicamentoIDao = medicamentoIDao;
    }

        public Medicamento guardar(Medicamento medicamento) {
            return medicamentoIDao.guardar(medicamento);
        }

        public void eliminar(Long id) {

        }

        public Medicamento buscar(Long id) {
            return medicamentoIDao.buscar(id);
        }

        public List<Medicamento> buscarTodos() {
            return null;
        }
};

