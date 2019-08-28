package com.movie.factories;

import com.movie.concretes.EgyptianAction;
import com.movie.concretes.EgyptianComedy;

public class EgyptianFactory implements AbstractFactory {

	public Action getAction() {
		return new EgyptianAction();
	}
	
	public Comedy getComedy() {
		return new EgyptianComedy();
	}
	
}
