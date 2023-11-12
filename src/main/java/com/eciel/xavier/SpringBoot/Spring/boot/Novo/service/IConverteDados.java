package com.eciel.xavier.SpringBoot.Spring.boot.Novo.service;

import com.eciel.xavier.SpringBoot.Spring.boot.Novo.model.DadosSerie;

public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe);
}
