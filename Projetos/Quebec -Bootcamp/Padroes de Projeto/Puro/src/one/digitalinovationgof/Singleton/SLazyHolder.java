package one.digitalinovationgof.Singleton;
/**
 *  pegador de ze preguica
 *  
 * @author Jonathan
 *
 */

public class SLazyHolder {
	
	private static class InstanceHolder{
		public static SLazyHolder instancia = new SLazyHolder();
	}

	
	public SLazyHolder(){
		super();
	}
	
	public static SLazyHolder getInstancia(){
		return InstanceHolder.instancia;
	}
	
}
