public class Mergesort implements Ordenacion {

    public void ordenar(int[] arreglo){
	mergesort(arreglo, 0, arreglo.length - 1);

    }//ordenar


    public void mergesort(int[] arreglo, int inic, int fin) {
	if (fin - inic < 1){
	    //nada
	}
	else {
	    int medio = (inic + fin)/2; 
	    mergesort(arreglo, inic, medio);
	    mergesort(arreglo, medio + 1, fin);
	    merge(arreglo, inic, medio, fin);
	}
    }

    public void merge(int[] arreglo, int inic, int medio,  int fin) {
	int largo = inic - fin + 1;
	int izq = inic;
	int der = medio + 1;
	int i = inic;
	int[] aux= arreglo; ////si no funciona o para un improvment
                             // copiar solo la seccion que se ordenara
	System.arrayCopy(arreglo,0,aux,0,arreglo.length);
	while ( not(izq == medio && der == fin) ) {
	    if (izq == medio + 1) {
		for (int j = der; j <= fin; j++) {
		    arreglo[i] = aux[j];
		    i++;
		}
		break;
	    }
	    else if (der == fin + 1) { /////// + 1
		for (int j = izq; j <= medio; j++) {
		    arreglo[i] = aux[j];
		    i++;
		}
		break;
	    }




            else if (aux[izq] < aux[der]) {
		arreglo[i] = aux[izq];
		izq++;
		i++;
	    }
	    else  {
		arreglo[i] = aux[der];
		der++;
		i++;
	    }
		


	}


    }


}
