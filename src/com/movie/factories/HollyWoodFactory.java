package com.movie.factories;

import com.movie.concretes.HollyWoodAction;
import com.movie.concretes.HollyWoodComedy;

public class HollyWoodFactory implements AbstractFactory {

	public Action getAction() {
		return new HollyWoodAction();
	}
	
	public Comedy getComedy() {
		return new HollyWoodComedy();
	}
	
}
