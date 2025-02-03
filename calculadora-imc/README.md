# ⚖️ Calculadora de IMC

Este projeto é uma **prática de programação em Java** desenvolvida para calcular o Índice de Massa Corporal (IMC) e classificar os resultados de acordo com idade e sexo. **Atenção: este programa é exclusivamente educativo e não deve ser utilizado como referência médica ou para controle de peso.** O cálculo de IMC envolve diversas variáveis e especificidades individuais que não são consideradas aqui.

## 🖥️ Técnicas Utilizadas

O projeto utiliza conceitos fundamentais de **programação em Java**, como estrutura de controle `while` para criar loops e permitir a repetição do cálculo de IMC até que o usuário decida encerrar. Também são aplicadas **estruturas condicionais** (`if-else`) para validar entradas do usuário e determinar a classificação do IMC com base em diferentes critérios, como idade e sexo. Além disso, o programa demonstra o uso de **POO (Programação Orientada a Objetos)**, com a classe `ClassificacaoIMC` encapsulando a lógica de classificação, destacando princípios como encapsulamento, uso de construtores e métodos para acessar dados. Essas técnicas tornam o código modular, reutilizável e de fácil manutenção.

## 📋 Funcionalidades
- Entrada de dados: peso (kg), altura (m), idade (anos) e sexo (M/F).
- Cálculo do IMC baseado na fórmula:
IMC = peso (kg) / altura (m)^2
- Classificação do IMC considerando:
  - Crianças e adolescentes (< 20 anos);
  - Adultos (20 a 59 anos, com diferenças entre homens e mulheres);
  - Idosos (≥ 60 anos).
- Opção de repetir o cálculo com novos dados.

## 🛠 Estrutura do Projeto
### Arquivos principais:
1. **`Calculadora.java`**: Responsável por coletar os dados do usuário, calcular o IMC e exibir os resultados.
2. **`ClassificacaoIMC.java`**: Contém a lógica para classificar o IMC com base em idade e sexo.

## 📝 Próximo Passo
- Implementar uma interface gráfica para facilitar o uso.
