package com.duan.orientacaoAObjetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CadastroDePessoa {

    ArrayList<Pessoa> pessoaList = new ArrayList<>();

    Maternidade maternidade = new Maternidade();


    public static void main(String[] args ) throws ParseException {
        new CadastroDePessoa().rodar();
    }

    private void rodar() throws ParseException {
        Pessoa jose = maternidade.nascer("Jose", "Masculino");
        Pessoa ametista = maternidade.nascer("Ametista", "Feminino");
        Pessoa robo = maternidade.nascer("GPT", "AI");

        pessoaList.add(jose);
        pessoaList.add(ametista);
        pessoaList.add(robo);

        ArrayList<Pessoa> homemList = new ArrayList<>();
        ArrayList<Pessoa> mulherList = new ArrayList<>();
        ArrayList<Pessoa> outrosGeneros = new ArrayList<>();

        for (Pessoa pessoa : pessoaList) {
            if (pessoa.getSexo().equals("Masculino")) {
                homemList.add(pessoa);
            } else if (pessoa.getSexo().equals("Feminino")) {
                mulherList.add(pessoa);
            } else {
                outrosGeneros.add(pessoa);
            }
        }
        System.out.println("opa");
    }
}
