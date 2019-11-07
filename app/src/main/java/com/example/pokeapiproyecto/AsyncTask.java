package com.example.pokeapiproyecto;

public class AsyncTask {


    @Override
    protected String doInBackground(String... urls) {

        // Creamos el objeto URL desde el string que recibimos.
        if (urls.length == 0) return "";
        URL url = createUrl("https://pokeapi.co/api/v2/pokemon?offset=0&limit=150");
        // Hacemos la petición. Ésta puede tirar una exepción.
        String jsonResponse = "";
        try {
            jsonResponse = makeHttpRequest(url);
        } catch (IOException e) {
            Log.e(LOG_TAG, "Problem making the HTTP request.", e);
        }
        return jsonResponse;
    }



}
