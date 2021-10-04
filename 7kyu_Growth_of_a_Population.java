class Arge {
    // la mejor solución es la mia
    public static int nbYear(int p0, double percent, int aug, int p) {
      // retorna cuantos años tardará en incrementar la p0 (actual) en sobrepasar a la p (deseada/prevista)
      percent /= 100;
      int contador = 0;
      
      while (!(p0 >= p)){
        p0 += p0 * percent + aug;
        contador++;
      }
      return contador;

    }
}
