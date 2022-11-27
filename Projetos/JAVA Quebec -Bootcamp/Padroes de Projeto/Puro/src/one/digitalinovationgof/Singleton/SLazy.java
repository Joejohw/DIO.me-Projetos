package one.digitalinovationgof.Singleton;
/**
 *  ze preguica
 * @author Jonathan
 *
 */

public class SLazy {

	private static SLazy instancia;
	
	public SLazy(){
		super();
	}
	
	public static SLazy getInstancia(){
		if (instancia == null){
			instancia = new SLazy();
		}
		return instancia;
	}
	
}
