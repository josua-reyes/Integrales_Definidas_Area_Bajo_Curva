package Controlador;

import Modelo.ParametrosIntegracion;
import de.congrace.exp4j.*;

public class Funcion {

    protected ExpressionBuilder parser;
    ParametrosIntegracion parametrosIntegracion;

    public Funcion() {
    }

    public Funcion(ParametrosIntegracion parametros) {
        this.parser = new ExpressionBuilder(parametros.Funcion);
        this.parametrosIntegracion = parametros;
    }

    public Double ejecutar(double valor) {
        Double resultado = null;
        try {
            resultado = this.ejecutar(valor, false);
        } catch (UnknownFunctionException | UnparsableExpressionException ex) {
        }

        return resultado;
    }

    public double ejecutar(double valor, boolean error) throws UnknownFunctionException, UnparsableExpressionException {
        double resultado = 0;
        Calculable calc = this.parser.withVariable("x", valor).build();
        resultado = calc.calculate();
        return resultado;
    }
}
