package school.sptech;

public class ExercicioMetodos {
    public Boolean verificarMaioridade(Integer idade) {
        if (idade >= 18) {
            return true;
        } else {
            return false;
        }
    }


    public Double calcularMedia(Double v1, Double v2, Double v3) {
        Double soma = v1 + v2 + v3;
        return soma / 3;
}

    public Integer maiorNumero(Integer a, Integer b, Integer c) {
        Integer maior = a;
        if (b > maior){
            maior = b;
        }

        if (c > maior){
            maior = c;
        }
        return maior;
    }

    public Integer calcularFatorial(Integer num){
        Integer fat = 1;
        Integer i = 1;
        while (i <= num){
            fat *= i;
            i++;
        }
        return fat;
    }

    public Boolean verificarPrimo(Integer n){
        if (n <= 1){
            return false;
        }
        for (Integer i = 2; i <= n / 2; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public Integer calcularPotencia(Integer base, Integer exp){
        Integer pot = 1;
        for (int i = 0; i < exp; i++){
            pot *= base;
        }
        return pot;
    }





    public Integer calcularTrocoEmBalas(Double valorCompra, Double valorRecebido){
        if (valorRecebido < valorCompra){
            return 0;
        }
        Double troco = valorRecebido - valorCompra;
        Integer qtd = 0;
        while (troco >= 0.25){
            qtd++;
            troco -= 0.25;
        }
        return qtd;
    }


    public Boolean verificarPalindromo(String palavra) {
        String texto = palavra.replaceAll("\\s+", "").toLowerCase();
        int inicio = 0;
        int fim = texto.length() - 1;

        while (inicio < fim) {
            if (texto.charAt(inicio) != texto.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }
}
