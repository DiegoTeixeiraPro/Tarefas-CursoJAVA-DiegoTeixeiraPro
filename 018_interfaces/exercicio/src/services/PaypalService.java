package services;

public class PaypalService implements OnlinePaymentService {
    @Override
    public Double taxaDePagamento(Double quantia) {
        return quantia * 0.02;
    }

    @Override
    public Double juros(Double quantia, int meses) {
        return quantia * 0.01 * meses;
    }
}