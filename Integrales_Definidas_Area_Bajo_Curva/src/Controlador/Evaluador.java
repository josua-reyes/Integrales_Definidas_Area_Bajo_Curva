package Controlador;

public class Evaluador {
    
    public Evaluador() {
    }
        public Double evaluar(Funcion funcion) {
        double limiteInferior = funcion.parametrosIntegracion.LimiteInferior; 
        double limiteSuperior = funcion.parametrosIntegracion.LimiteSuperior; 
        int n = 20;
        
        Double res = funcion.ejecutar(limiteInferior);

        if(res != null) {
        
            double h = (limiteSuperior - limiteInferior) / n;

            double par = 0, impar = 0;
            for (int i = 1; i < n; i++) {
                if ((i % 2) == 0) {
                    par += funcion.ejecutar(limiteInferior + i * h);
                } else {
                    impar += funcion.ejecutar(limiteInferior + i * h);
                }
            }
            res += (2 * par);
            res += (4 * impar);

            res += funcion.ejecutar(limiteSuperior);
            res *= ((limiteSuperior - limiteInferior) / (3 * n));
        }

        return res;
    }
}
