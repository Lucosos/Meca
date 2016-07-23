public class Quicksort_mediana implements Ordenacion {

    public void ordenar (int[] arreglo) {
	quicksort_mediana(arreglo,0,arreglo.length - 1);
    }
    

    public void quicksort_mediana (int[] arreglo, int inicio,int fin) {

	if ( condicion que aun no se , ){
	    int p = particionar(arreglo,inicio,fin);
	    quicksort_normal(arreglo,inicio,p);
	    quicksort_normal(arreglo,p+1,fin);

	}

    }

    public int particionar (int[] arreglo, int inicio, int fin) {

	int izq,der,piv,aux;
	izq = inicio;
	der = fin;
	piv = fin;
	while (izq < der) {
	    while (arreglo[izq] < arreglo[piv]  && izq < der ) {//!!
 //un if repetido varias veces es equivalente a un while , queremos.... chamullo
		izq++;
	    }
	    while (arreglo[der] > arreglo[piv] && izq < der ) {//!!!
		der++;
	    }
	    //si no pasa cierta condicion ,!!!!!!!!!!
	    intercambiar(arreglo,izq,der);
	    aux = arreglo[izq];
	    arreglo[izq] = arreglo[der];
	    arreglo[der] = aux;

	}//whileprincipal 

	/// dependiendo de que pivote se eligio intercambiar 
	// acorde, ademas EL PIVOTE DEBE IR EN LA POSICION QUE ESTE     "DER"

    }






    public int mediana (int a, int b, int c) {
	

    }

    public void insertionsort (int[] arreglo, int inicio, int fin) {
	//int[] aux;
	//	System.arrayCopy(arreglo,0,aux,0,arreglo.length);
	int i = fin;
	int j,auxiliar;
	while (i > inicio) { 
	    auxiliar = arreglo[i];
	    j=i-1;
	    while (arreglo[j] > auxiliar && j >=inicio) {//y que tambien no se salga de los limites(inicio)
		arreglo[j+1] = arreglo[j];
		j--;
	    }
	    arreglo[j+1] = auxiliar;
	    i--;
    }
    


}
