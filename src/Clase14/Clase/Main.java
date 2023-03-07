package Clase14.Clase;

import Clase14.Clase.DAO.MedicamentoH2;
import Clase14.Clase.Model.Medicamento;
import Clase14.Clase.Service.MedicamentoService;

public class Main {
    public static void main(String[] args) {
        Medicamento medicamento = new Medicamento(1,123456, "Tafirol",
                "No se",50,100.0);

        MedicamentoH2 h2 = new MedicamentoH2();
        h2.crearTabla();
        MedicamentoService service = new MedicamentoService(h2);
        service.guardar(medicamento);
    }
}
