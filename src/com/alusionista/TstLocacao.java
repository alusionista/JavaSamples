package com.alusionista;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

import static com.alusionista.Leitura.inData;

public class TstLocacao {
    private Locacao locacao = null;
    private Leitura leitura = null;

    private static Casa setMockUp(){
        Cidade cidade = new Cidade(1, "Curitiba");
        Endereco end = new Endereco("Rua Augusto Stresse", 1234, cidade);
        Endereco endProp = new Endereco("Rua Augusto Stresse", 4321, cidade);
        Proprietario proprietario = new Proprietario(123456789, "João da Silva Sauro", endProp);
        return new Casa("Edifício Édifícil", 1010, "Madeira", 1200, end, proprietario);
    }

    private static Date dateParser(String dateString) throws ParseException{
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.parse(dateString);
    }

    public static void imprimirPropriedades(Locacao locacao) {
        Imovel imovel;
        imovel = (locacao.getApartamento() == null)? locacao.getCasa(): locacao.getApartamento();
        System.out.println("Imóvel: ");
        System.out.println("    Cidade: " + imovel.getNomeCid());
        System.out.println("    Rua: " + imovel.getRua());
        System.out.println("    Número: " + imovel.getNum());
        System.out.println("Data de início: " + locacao.getDataInicio().toString());
        System.out.println("Data de fim: " + locacao.getDataFim().toString());
    }
    public static void main(String[] args) {
        Casa casa = setMockUp();
        Date initLoc;
        Date finalLoc;
        while (true) {
            try {
                initLoc = dateParser(inData("Início da locação(dd/MM/yyyy)"));
                break;
            } catch (ParseException e){
                System.out.println("Data inválida");
            }
        }
        while (true){
            try {
                finalLoc = dateParser(inData("Final da locação(dd/MM/yyyy)"));
                break;
            } catch (ParseException e){
                System.out.println("Data inválida");
            }
        }
        System.out.println("Dados da locação de exemplo:");
        imprimirPropriedades(new Locacao(initLoc, finalLoc, casa, null));
    }
}