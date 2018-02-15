public class Main{

	public static void main(String[] arg){
		System.out.println("");
		System.out.println("clase de programacion II");
		System.out.println("EJERCICIO AREA DE FIGURAS");
		System.out.println("");
		System.out.println("\n\n\t\tEjercicio N 1");
		System.out.println("");
		
		System.out.println("AREA CIRCULO");
		double radio = 6;
		double pi = 3.1415;
		System.out.println("Con Radio ="+radio);
		System.out.println("El area del circulo es:"+(pi*(Math.pow(radio,2)))+" cm^2");
		System.out.println("");
		
                System.out.println("AREA CUADRADO");
		double lado = 4;
		System.out.println("Con lado = "+lado);
		System.out.println("El area del cuadrado es: "+(lado*lado)+" cm^2");
		System.out.println("");		
		
		System.out.println("AREA TRIANGULO");
		double base = 4;
		double altura = 10;
                System.out.println("Con base = " + base + " y altura = " + altura);
		System.out.println("El area del triangulo es: "+((base*altura)/2)+" cm^2");
		System.out.println("");		
	}
}