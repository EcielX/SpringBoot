package com.eciel.xavier.SpringBoot.Spring.boot.Novo;

import com.eciel.xavier.SpringBoot.Spring.boot.Novo.model.DadosSerie;
import com.eciel.xavier.SpringBoot.Spring.boot.Novo.service.ConsumoApi;
import com.eciel.xavier.SpringBoot.Spring.boot.Novo.service.ConverteDados;
import com.fasterxml.jackson.annotation.JacksonAnnotation;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@SpringBootApplication

public class SpringBootNovoApplication implements CommandLineRunner {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(SpringBootNovoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		var   consumo = new  ConsumoApi();
		var json = consumo.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=b7000c6");
		ConverteDados converso = new ConverteDados();
		DadosSerie dados = converso.obterDados(json, DadosSerie.class);
		System.out.println(dados);

	}
}