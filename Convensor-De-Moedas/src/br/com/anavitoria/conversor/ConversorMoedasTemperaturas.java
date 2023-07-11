package br.com.anavitoria.conversor;
import javax.swing.JOptionPane;
/**
 * Permite exibir caixas de dialogos para a interação do usuario 
 * @author Anah
 *
 */
public class ConversorMoedasTemperaturas {
	public static void main(String[] args) {
	 String[] opcoes = {
             "Converter de Moedas",
             "Converter de Temperaturas"
     };

     String escolhaOpcao = (String) JOptionPane.showInputDialog(
             null, "Selecione uma opção:", "Conversor de Moedas e Temperaturas",
             JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

     if (escolhaOpcao != null) {
         if (escolhaOpcao.equals("Converter de Moedas")) {
             converterMoedas();
         } else if (escolhaOpcao.equals("Converter de Temperaturas")) {
             converterTemperaturas();
         }
     }
}

 private static void converterMoedas() {
     String[] opcoesMoedas = {
             "Converter de Reais a Dólar",
             "Converter de Dólar a Reais",
             "Converter de Reais a Euro",
             "Converter de Euro a Reais",
             "Converter de Reais a Libras Esterlinas",
             "Converter de Libras Esterlinas para Reais",
             "Converter de Reais a Peso Argentino",
             "Converter de Peso Argentino para Reais",
             "Converter de Reais a Peso Chileno",
             "Converter de Peso Chileno para Reais",
     };

     String escolhaMoedas = (String) JOptionPane.showInputDialog(
             null, "Selecione uma opção:", "Conversor de Moedas",
             JOptionPane.PLAIN_MESSAGE, null, opcoesMoedas, opcoesMoedas[0]);

     if (escolhaMoedas != null) {
         double valorOrigem = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor:"));
         double resultado = 0;

         if (escolhaMoedas.equals("Converter de Reais a Dólar")) {
             resultado = valorOrigem * 0.21;
         } else if (escolhaMoedas.equals("Converter de Dólar a Reais")) {
             resultado = valorOrigem * 4.80;
         } else if (escolhaMoedas.equals("Converter de Reais a Euro")) {
             resultado = valorOrigem * 0.19;
         } else if (escolhaMoedas.equals("Converter de Euro a Reais")) {
             resultado = valorOrigem * 6;
         } else if (escolhaMoedas.equals( "Converter de Reais a Libras Esterlinas")) {
             resultado = valorOrigem *  0.16;
         }else if (escolhaMoedas.equals( "Converter de Libras Esterlinas para Reais")) {
             resultado = valorOrigem *  06.25;;
         }else if (escolhaMoedas.equals(  "Converter de Reais a Peso Argentino")) {
             resultado = valorOrigem *  53.81;
         }else if (escolhaMoedas.equals( "Converter de Peso Argentino para Reais")) {
             resultado = valorOrigem *  0.019;
         }else if (escolhaMoedas.equals( "Converter de Reais a Peso Chileno")) {
             resultado = valorOrigem *  00166.26;
         }else if (escolhaMoedas.equals(   "Converter de Peso Chileno para Reais")) {
             resultado = valorOrigem * 0.60;
         }

         JOptionPane.showMessageDialog(null,
                 valorOrigem + " equivale a " + resultado,
                 "Resultado", JOptionPane.INFORMATION_MESSAGE);
     }
 }

 private static void converterTemperaturas() {
     String[] opcoesTemperaturas = {
             "Converter de Celsius a Fahrenheit",
             "Converter de Fahrenheit a Celsius"
     };

     String escolhaTemperaturas = (String) JOptionPane.showInputDialog(
             null, "Selecione uma opção:", "Conversor de Temperaturas",
             JOptionPane.PLAIN_MESSAGE, null, opcoesTemperaturas, opcoesTemperaturas[0]);

     if (escolhaTemperaturas != null) {
         double valorOrigem = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura:"));
         double resultado = 0;

         if (escolhaTemperaturas.equals("Converter de Celsius a Fahrenheit")) {
             resultado = (valorOrigem * 9/5) + 32;
         } else if (escolhaTemperaturas.equals("Converter de Fahrenheit a Celsius")) {
             resultado = (valorOrigem - 32) * 5/9;
         }

         JOptionPane.showMessageDialog(null,
                 valorOrigem + " equivale a " + resultado,
                 "Resultado", JOptionPane.INFORMATION_MESSAGE);
     }
 }
}
