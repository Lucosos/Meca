public class Quicksort_mejorado implements Ordenacion {

    public void ordenar (int[] arreglo) {
	quicksort_mejorado(arreglo,0,arreglo.length - 1);
    }
    

    public void quicksort_mejorado (int[] arreglo, int inicio,int fin) {

	if ( fin - inicio > 9 ) { //condicion que aun no se , ){
	    int p = particionar(arreglo,inicio,fin);
	    quicksort_normal(arreglo,inicio,p);
	    quicksort_normal(arreglo,p+1,fin);

	}
	else{//si a de tamaño 10 o menor el arreglo se ordnara esa seccion con un insertionsort
		insertionsort(arreglo,inicio,fin);			
	}

    }

    public int particionar (int[] arreglo, int inicio, int fin) {

	int izq,der,med,piv,aux;
	izq = inicio;
	der = fin;
	med = (fin + inicio)/2;
	int median = mediana(arreglo[inicio],arreglo[med],arreglo[fin]);
	piv = fin;	
	if (median == arreglo[inicio])
		piv = inicio;
	else if (median == arreglo[med])
		piv = med;  
	
	while (izq < der) {// si es = pasarlo nomas
	    while (arreglo[izq] <= arreglo[piv]  && izq < fin ) {//!!
 //un if repetido varias veces es equivalente a un while , queremos.... chamullo
		izq++;
	    }
	    while (arreglo[der]	 >= arreglo[piv] &&  izq < der ) {//!!!
		der++;
	    }
	    //si no pasa cierta condicion ,!!!!!!!!!!
	    //intercambiar(arreglo,izq,der);
	    if (izq < der) {	    	
		aux = arreglo[izq];
	    	arreglo[izq] = arreglo[der];
	    	arreglo[der] = aux;
		}
	}//whileprincipal 


	if (der < piv) {	

		aux = arreglo[der];
		arreglo[der] = arreglo[piv];
		arreglo[piv] = aux;	
		piv = der;
	}
	else if (der > piv  && (der - 1) != piv ){

		aux = arreglo[der-1];
		arreglo[der-1] = arreglo[piv];
		arreglo[piv] = aux;
		piv = der-1;
	

	}
	return piv;

    }






    public int mediana (int a, int b, int c) {
	if ( ( a >= b && b >= c) || ( c >= b && b >= a) )
	    return b;
	else if ( ( b >= a && a >= c) || ( c >= a && a >= b) )
	    return a;
	else
	    return c;

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
