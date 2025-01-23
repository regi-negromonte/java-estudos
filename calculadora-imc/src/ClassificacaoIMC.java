public class ClassificacaoIMC {
    private double imc;
    private int idade;
    private char sexo;
    private String classificacao;

    public ClassificacaoIMC(double imc, char sexo, int idade) {
        this.imc = imc;
        this.sexo = Character.toLowerCase(sexo);
        this.idade = idade;

        if (this.idade < 20) {
            // Classificação para crianças e adolescentes
            if (this.imc < 18.5) {
                classificacao = "Abaixo do peso";
            } else if (this.imc < 24.9) {
                classificacao = "Peso normal";
            } else if (this.imc < 29.9) {
                classificacao = "Sobrepeso";
            } else {
                classificacao = "Obesidade";
            }
        } else if (idade >= 60) {
            // Classificação para idosos
            if (this.imc < 22) {
                classificacao = "Abaixo do peso";
            } else if (this.imc < 27) {
                classificacao = "Peso normal";
            } else if (this.imc < 30) {
                classificacao = "Sobrepeso";
            } else {
                classificacao = "Obesidade";
            }
        } else {
            if (this.sexo == 'f') {
                // Classificação para mulheres adultas
                if (this.imc < 18.5) {
                    classificacao = "Abaixo do peso";
                } else if (this.imc < 24.9) {
                    classificacao = "Peso normal";
                } else if (this.imc < 29.9) {
                    classificacao = "Sobrepeso";
                } else {
                    classificacao = "Obesidade";
                }
            } else if (this.sexo == 'm') {
                // Classificação para homens adultos
                if (this.imc < 20) {
                    classificacao = "Abaixo do peso";
                } else if (this.imc < 25.9) {
                    classificacao = "Peso normal";
                } else if (this.imc < 29.9) {
                    classificacao = "Sobrepeso";
                } else {
                    classificacao = "Obesidade";
                }
            }
        }
    }

    public String getClassificacao() {
        return classificacao;
    }
}