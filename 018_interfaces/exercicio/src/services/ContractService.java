package services;

import entities.Contract;
import entities.Parcela;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void contratoProcessado(Contract contract, int meses) {

        double juroSimples = contract.getValorContrato() / meses;

        for (int i = 1; i <= meses; i++) {
            LocalDate vencimentoParcela = contract.getData().plusMonths(i);

            double juros = onlinePaymentService.juros(juroSimples, i);
            double taxa = onlinePaymentService.taxaDePagamento(juroSimples + juros);
            double quota = juroSimples + juros + taxa;

            contract.getParcelas().add(new Parcela(vencimentoParcela, quota));
        }
    }
}