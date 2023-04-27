package one.digitalinovationgof;

import one.digitalinovationgof.Facade.Facade;
import one.digitalinovationgof.Singleton.SEager;
import one.digitalinovationgof.Singleton.SLazy;
import one.digitalinovationgof.Singleton.SLazyHolder;
import one.digitalinovationgof.Strategy.ComporamentoNormal;
import one.digitalinovationgof.Strategy.Comportamento;
import one.digitalinovationgof.Strategy.ComportamentoAgressivo;
import one.digitalinovationgof.Strategy.ComportamentoDefensivo;
import one.digitalinovationgof.Strategy.Robo;


public class Teste {

	public static void main(String[] args) {
		
		//singleton
		SLazy Lazy = SLazy.getInstancia();
		System.out.println(Lazy);
		Lazy = SLazy.getInstancia();
		System.out.println(Lazy);
		
		SEager eager = SEager.getInstancia();
		System.out.println(eager);
		eager = SEager.getInstancia();
		System.out.println(eager);	

		SLazyHolder LazyHolder = SLazyHolder.getInstancia();
		System.out.println(LazyHolder);
		LazyHolder = SLazyHolder.getInstancia();
		System.out.println(LazyHolder);	
		
		//strategy
		
		Comportamento normal = new ComporamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		Comportamento defensivo = new ComportamentoDefensivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defensivo);
		robo.mover();
		
		//facade
		
		Facade facade = new Facade();
		facade.migraCliente("Jonathan", "13584-147");
		
		
		
	}

}
