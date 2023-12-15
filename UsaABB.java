public class UsaABB
{
         public static void main(String[] args){
        ABB arbol = new ABB();
        //crear árbol
        Nodo raizArbolABB = arbol.regresaRaiz();
        //25, 8, 29, 38, 27
        arbol.insertarValor(25);
        arbol.insertarValor(8);
        arbol.insertarValor(29);
        arbol.insertarValor(38);
        arbol.insertarValor(27);
        System.out.println("");
        //imprimir inorden
        System.out.println("");
        arbol.inOrden(arbol.regresaRaiz());
        System.out.println("recorrido inorden ");
        //imprimir preorden        
        arbol.preOrden(arbol.regresaRaiz());
        System.out.println("recorrido preorden ");
        //imprimir postorden
        arbol.postOrden(arbol.regresaRaiz());
        System.out.println("recorrido postorden ");
        //imprime en inorden sin el nodo que fue eliminado
        arbol.eliminarNodo(29);
        arbol.inOrden(arbol.regresaRaiz());
        System.out.println("recorrido inorden sin el nodo eliminado");
        //muestra árbol
        arbol.muestraAcostado(0, arbol.regresaRaiz());
    }
}