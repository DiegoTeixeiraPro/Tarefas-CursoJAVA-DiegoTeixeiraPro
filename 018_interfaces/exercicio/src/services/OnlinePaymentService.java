package services;

public interface OnlinePaymentService {
    Double taxaDePagamento(Double quantia);

    Double juros(Double quantia, int meses);
}