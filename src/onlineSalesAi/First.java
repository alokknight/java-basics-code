package onlineSalesAi;

import java.util.*;
public class First {

    public static Map<Object, Integer> simulateEvent(List<Map.Entry<Object, Integer>> outcomes) {
        int totalProb = 0;
        for (Map.Entry<Object, Integer> entry : outcomes) {
            totalProb += entry.getValue();
        }

        Map<Object, Double> normalizedProbs = new HashMap<>();
        for (Map.Entry<Object, Integer> entry : outcomes) {
            normalizedProbs.put(entry.getKey(), (double) entry.getValue() / totalProb);
        }

        Map<Object, Integer> simulationResults = new HashMap<>();
        int numSimulations = 1000; // You can adjust this value

        for (Map.Entry<Object, Integer> entry : outcomes) {
            simulationResults.put(entry.getKey(), 0);
        }

        Random random = new Random();

        for (int i = 0; i < numSimulations; i++) {
            double randomNum = random.nextDouble();
            double cumulativeProb = 0;

            for (Map.Entry<Object, Double> entry : normalizedProbs.entrySet()) {
                cumulativeProb += entry.getValue();
                if (randomNum <= cumulativeProb) {
                    simulationResults.put(entry.getKey(), simulationResults.get(entry.getKey()) + 1);
                    break;
                }
            }
        }

        return simulationResults;
    }

    public static void main(String[] args) {
        List<Map.Entry<Object, Integer>> biasedDiceInput = new ArrayList<>();
        biasedDiceInput.add(new AbstractMap.SimpleEntry<>(1, 10));
        biasedDiceInput.add(new AbstractMap.SimpleEntry<>(2, 30));
        biasedDiceInput.add(new AbstractMap.SimpleEntry<>(3, 15));
        biasedDiceInput.add(new AbstractMap.SimpleEntry<>(4, 15));
        biasedDiceInput.add(new AbstractMap.SimpleEntry<>(5, 30));
        biasedDiceInput.add(new AbstractMap.SimpleEntry<>(6, 0));

        List<Map.Entry<Object, Integer>> coinFlipInput = new ArrayList<>();
        coinFlipInput.add(new AbstractMap.SimpleEntry<>("Head", 35));
        coinFlipInput.add(new AbstractMap.SimpleEntry<>("Tail", 65));

        // Simulate events
        Map<Object, Integer> biasedDiceResults = simulateEvent(biasedDiceInput);
        Map<Object, Integer> coinFlipResults = simulateEvent(coinFlipInput);

        // Print simulation results
        System.out.println("Biased Dice Simulation Results:");
        for (Map.Entry<Object, Integer> entry : biasedDiceResults.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
        }

        System.out.println("\nCoin Flip Simulation Results:");
        for (Map.Entry<Object, Integer> entry : coinFlipResults.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
        }
    }
}
