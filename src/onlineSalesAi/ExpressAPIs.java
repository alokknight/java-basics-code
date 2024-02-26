package onlineSalesAi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExpressAPIs {

    public static void evaluateExpression(String expression, String apiEndpoint) {
        try {
            URL url = new URL(apiEndpoint + "?expression=" + expression);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String result = reader.readLine();
            reader.close();

            System.out.println(expression + " => " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String apiEndpoint = "API_ENDPOINT_HERE";  // Replace with the actual API endpoint

        List<String> expressions = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter expressions (type 'end' to stop):");
            String expression;
            while (!(expression = br.readLine()).equals("end")) {
                expressions.add(expression);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int numThreads = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);

        int chunkSize = (int) Math.ceil((double) expressions.size() / numThreads);
        for (int i = 0; i < expressions.size(); i += chunkSize) {
            final List<String> chunk = expressions.subList(i, Math.min(i + chunkSize, expressions.size()));
            executorService.submit(() -> {
                for (String expr : chunk) {
                    evaluateExpression(expr, apiEndpoint);
                }
            });
        }

        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
