package com.movie;

import com.movie.factories.AbstractFactory;
import com.movie.factories.Action;
import com.movie.factories.Comedy;
import com.movie.factories.EgyptianFactory;
import com.movie.factories.HollyWoodFactory;

public class FactoryProducer {

	public static void produce(boolean egyptian) {
		AbstractFactory abstractFactory;
		if (egyptian) {
			abstractFactory = new EgyptianFactory();
		} else {
			abstractFactory = new HollyWoodFactory();
		}
		watchMovies(abstractFactory);
		
	}
	
	private static void watchMovies(AbstractFactory abstractFactory) {
		Action action = abstractFactory.getAction();
		action.watch();
		Comedy comedy = abstractFactory.getComedy();
		comedy.watch();
	}
	
}
