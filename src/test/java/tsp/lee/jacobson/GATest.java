package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class GATest {
	GA algogen= new GA();
    private static final boolean elitism = true;

	@Test
	public static Population evolvePopulation_test(Population pop) {
		Population newPopulation = new Population(pop.populationSize(), false);
		GA algogen= new GA();

		// Keep our best individual if elitism is enabled
		int elitismOffset = 0;
		if (elitism) {
			newPopulation.saveTour(0, pop.getFittest());
			elitismOffset = 1;
		}

		// Crossover population
		// Loop over the new population's size and create individuals from
		// Current population
		for (int i = elitismOffset; i < newPopulation.populationSize(); i++) {
			// Select parents
			Tour parent1 = algogen.tournamentSelection(pop);
			Tour parent2 = algogen.tournamentSelection(pop);
			// Crossover parents
			Tour child = crossover(parent1, parent2);
			// Add child to new population
			newPopulation.saveTour(i, child);
		}

		// Mutate the new population a bit to add some new genetic material
		for (int i = elitismOffset; i < newPopulation.populationSize(); i++) {
			algogen.mutate(newPopulation.getTour(i));
		}

	}


}
