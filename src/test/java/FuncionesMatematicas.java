import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FuncionesMatematicasTest {

    public FuncionesMatematicas funciones = new FuncionesMatematicas();



    @Test
    public void suma() {

        double resultado = 10.0;

        assertEquals(10.0,funciones.suma(5,5));

    }

    @Test
    public void resta() {
        double resultado = 5;

        assertEquals(5,funciones.resta(10,5));
    }

    @Test
    public void multiplicacion() {
        double resultado = 4;

        assertEquals(4,funciones.multiplicacion(2,2));
    }

    @Test
    public void division() {
        double resultado = 4;

        assertEquals(4,funciones.division(8,2));
    }

    @Test
    public void esCapicua() {
        boolean resultado = true;

        assertEquals(true,funciones.esCapicua(2882));
    }

    @Test
    public void digitos() {
        int resultado = 3;

        assertEquals(3,funciones.digitos(111));
    }

    @Test
    public void esPrimo() {
        boolean resultado = true;

        assertEquals(true,funciones.esPrimo(3));
    }

    @Test
    public void siguientePrimo() {
        int resultado = 5;

        assertEquals(5,funciones.siguientePrimo(3));
    }

    @Test
    public void potencia() {
        double resultado = 4;

        assertEquals(4,funciones.potencia(2,2));
    }

    @Test
    public void voltea() {
        int resultado = 321;

        assertEquals(321,funciones.voltea(123));
    }

    @Test
    public void digitoN() {
        int resultado = 2;

        assertEquals(2,funciones.digitoN(123,1));
    }

    @Test
    public void posicionDeDigito() {
        int resultado = 2;

        assertEquals(2,funciones.posicionDeDigito(132,2));
    }

    @Test
    public void quitaPorDetras() {
        int resultado = 3;

        assertEquals(3,funciones.quitaPorDetras(321,2));
    }

    @Test
    public void quitaPorDelante() {
        int resultado = 3;

        assertEquals(3,funciones.quitaPorDelante(113,2));
    }

    @Test
    public void pegaPorDetras() {
        int resultado = 12;

        assertEquals(12,funciones.pegaPorDetras(1,2));
    }

    @Test
    public void pegaPorDelante() {
        int resultado = 23;

        assertEquals(23,funciones.pegaPorDelante(3,2));
    }

    @Test
    public void trozoDeNumero() {
        int resultado = 12;

        assertEquals(12,funciones.trozoDeNumero(1122,1,2));
    }

    @Test
    public void juntaNumeros() {
        int resultado = 1122;

        assertEquals(1122,funciones.juntaNumeros(11,22));
    }

}

