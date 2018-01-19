import org.junit.Assert;
import org.junit.Test;

public class ConversorTest {

	@Test
	public void comprobarConversorCadenaSinInicioConNumeral() {
		Conversor conversor = new Conversor();
		String result = conversor.convertir("Tech And Solve");
		Assert.assertEquals("Tech And Solve", result);
	}
	
	@Test
	public void comprobarConversorCadenaSinEspacio() {
		Conversor conversor = new Conversor();
		String result = conversor.convertir("#TechAndSolve");
		Assert.assertEquals("#TechAndSolve", result);
	}
	
	@Test
	public void comprobarConversorSinEtiquetaAsociada() {
		Conversor conversor = new Conversor();
		String result = conversor.convertir("####### TechAndSolver");
		Assert.assertEquals("####### TechAndSolver", result);
	}

	@Test
	public void comprobarConversorCadena() {
		Conversor conversor = new Conversor();
		String result = conversor.convertir("#Tech And Solve");
		Assert.assertEquals("#Tech And Solve", result);
	}
	
	 @Test
	 public void comprobarConversorCadenaBienFormada() {
		 Conversor conversor = new Conversor();
		 String result = conversor.convertir("###### Hola#Mundo");
		 Assert.assertEquals("<H6>Hola#Mundo</H6>", result);
	 }
	 
	 @Test
	 public void comprobarConversorCadenaBienFormada3() {
		 Conversor conversor = new Conversor();
		 String result = conversor.convertir("## ## Hola Mundo");
		 Assert.assertEquals("<H2>## Hola Mundo</H2>", result);
	 }
}
