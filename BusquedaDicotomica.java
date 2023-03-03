package tema5;

import java.util.Arrays;

public class BusquedaDicotomica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int datos[]= {45,67,64,3258,9658,3,567};
		//System.out.println("Arrays sin ordenar-> "+Arrays.toString(datos);
		//AArrays.sortstem.out.println("Arrays ordenado ->"+Arrays.toString(datos));
		int elementoBuscadelementoBuscadodiceBusqueda=Arrays.binarySearch(datos, elementoBuscado);//-5;
		if (indiceBusqueda<datos.length&&indiceBusqueda<=0) {
			System.out.println("El elemento buscado esta en la posicion"+indiceBusqueda);
			
		}else {
		System.out.println("El elemento buscao no se encuentra y deberia ir rn la posicion->"+(indiceBusqueda-1));	
		}
		
	}

}
