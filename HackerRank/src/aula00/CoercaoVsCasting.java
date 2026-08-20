package aula00;

public class CoercaoVsCasting {
    public static void main(String[] args){

        long populacaoCidade = 1_500_000;
        int votosApurados = 1_499_999;
        long totalGeral = votosApurados;

        float mediasNotas = 8;
        double notaFinal = mediasNotas;

        double saldoConta = 2500.75;
        long saldoEmCentavosAproximado = (long) (saldoConta * 100);

        int quantidadeItens = 10;
        float precoUnitario = 3.5f;
        float totalCompra = quantidadeItens * precoUnitario;

        double mediaFinal = 7.8;
        int mediaParaAprovacao = (int) mediaFinal;

        System.out.println("populacaoCidade = " + populacaoCidade);
        System.out.println("totalGeral = " + totalGeral);
        System.out.println("notaFinal = " + notaFinal);
        System.out.println("saldoEmCentavosAproximado = " + saldoEmCentavosAproximado);
        System.out.println("totalCompra = " + totalCompra);
        System.out.println("mediaParaAprovacao = " + mediaParaAprovacao);
    }
}

//abluble