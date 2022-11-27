package one.digitalinovationgof.Singleton;
/**
 *  apressad
 * @author Jonathan
 *
 */
public class SEager {

	private static SEager instancia = new SEager();
	
	private SEager(){
		super();
	}
	
	public static SEager getInstancia(){
		return instancia;
	}
	
}
