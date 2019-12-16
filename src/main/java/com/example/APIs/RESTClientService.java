package com.example.APIs;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

@Service
public class RESTClientService {

	public Pokemon getPokemon(String name) {

		Gson gson = new Gson();

		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder().url("https://some-random-api.ml/pokedex?pokemon=" + name.toLowerCase())
				.build();

		Response response = null;
		Pokemon pokemon = null;
		try {
			response = client.newCall(request).execute();
			pokemon = gson.fromJson(response.body().string(), Pokemon.class);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return pokemon;

	}
}
