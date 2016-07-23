import java.util.Random;
public class Main {

    static public int[] permutacion(int n) {
	int[] a = new int[n];
	for (int i = 0;i < n; ++i)
	    a[i] = i + 1;
	
	Random rnd = new Random();
	for (int i = 0; i < n; i++) {
	    int r = i + rnd.nextInt(n-i);
	    int temp = a[i];
	    a[i] = a[r];
	    a[r] = temp;
	}
	return a;    
    }

    


    public void main () {
	
	Quicksort_normal quicksort_1 = new Quicksort_normal();
	Quicksort_mediana quicksort_2 = new Quicksort_mediana();
	Quicksort_mejorado quicksort_3 = new Quicksort_mejorado();
	Mergesort mergesort = new Mergesort();
	
	long tiempo_inicial,tiempo_estimado;

	int cant = 1000;
	long[] tiempo_m = new long[cant+1];
	long[] tiempo_q1 = new long[cant+1];
	long[] tiempo_q2 = new long[cant+1];
	long[] tiempo_q3 = new long[cant+1];
	long[] tamanos = new long[cant+1];
	int inicio = 10000000;//7
	int fin = 100000000;//8
	int incremento = (fin - inicio)/cant;
	int i=0;

	for (int n = inicio ; n <= fin ; n += incremento) {
	    m = permutacion(n);
	    for (int k = 0; k < 1 ;k++) {
		int[] q_1 = new int[m.length];
		int[] q_2 = new int[m.length];
		int[] q_3 = new int[m.length];

		
	        for (int j = 0; j < m.length; j++) {
		    q_1[j] = m[j];
		    q_2[j] = m[j];
		    q_3[j] = m[j];
		}

		tiempo_inicial = System.currentTimeMillis();
		quicksort_1.ordenar(q_1);
		tiempo_estimado = System.currentTimeMillis() - tiempo_inicial;
		tiempo_q1[i] = tiempo_estimado;

		
		tiempo_inicial = System.currentTimeMillis();
		quicksort_2.ordenar(q_2);
		tiempo_estimado = System.currentTimeMillis() - tiempo_inicial;
		tiempo_q2[i] = tiempo_estimado;



		tiempo_inicial = System.currentTimeMillis();
		quicksort_3.ordenar(q_3);
		tiempo_estimado = System.currentTimeMillis() - tiempo_inicial;
		tiempo_q3[i] = tiempo_estimado;


		tiempo_inicial = System.currentTimeMillis();
		mergesort.ordenar(m);
		tiempo_estimado = System.currentTimeMillis() - tiempo_inicial;
		tiempo_m[i] = tiempo_estimado;
		
		tamano[i] = n;

		i++;
	    }


	}//for con incrementos
	
	int k = 0;
	System.out.print("tamanos= [");
	while (k < cant + 1) {
	    System.out.print(tamanos[k]);
	    System.out.print(",");
	}
	System.println("]");


	k = 0;
	System.out.print("tiempos_q1= [");
	while (k < cant + 1) {
	    System.out.print(tiempo_q1[k]);
	    System.out.print(",");
	}
	System.println("]");




	k = 0;
	System.out.print("tiempos_q2= [");
	while (k < cant + 1) {
	    System.out.print(tiempo_q2[k]);
	    System.out.print(",");
	}
	System.println("]");


	k = 0;
	System.out.print("tiempos_q3= [");
	while (k < cant + 1) {
	    System.out.print(tiempo_q3[k]);
	    System.out.print(",");
	}
	System.println("]");



	k = 0;
	System.out.print("tiempos_m= [");
	while (k < cant + 1) {
	    System.out.print(tiempos_m[k]);
	    System.out.print(",");
	}
	System.println("]");

	

    }//final funcion



}


