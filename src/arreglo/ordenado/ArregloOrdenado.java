/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo.ordenado;

import javax.swing.JOptionPane;

/**
 *
 * @author ANDRES
 */
public class ArregloOrdenado {

   
    public static void main(String[] args) {
       
       
        int arreglo[]={20,16,18,19,22,23,18,17,21,24};
        int ordenado[];
        String cad1, cad2;
        int posicion, vrBuscado;
        
        ordenado = ordenarBurbuja(arreglo);
        
        cad1 = pasarDatos(arreglo);
        cad2 = pasarDatos(ordenado);   
        mostrarDatos(cad1,cad2);
        
        vrBuscado = Integer.parseInt(JOptionPane.showInputDialog("Edad a buscar"));
        
        posicion = buscarBinario(vrBuscado, ordenado);
        
        if (posicion==-1)
            JOptionPane.showMessageDialog(null,"La edad buscada no esta en el arreglo");
        else
            JOptionPane.showMessageDialog(null,"La edad buscada esta en la posicion " + posicion);
        
    }
    
    public static void mostrarDatos(String c1, String c2)
    {
        JOptionPane.showMessageDialog(null, c1 + "\n\n" + c2);
    }
    
    public static String pasarDatos(int ar[])
    {
        int i;
        String c="";
        
        for(i=0;i<ar.length;i++)
        {
            c +=ar[i] + "  ";
        }
        return c;
    }
    
    public static int[] ordenarBurbuja(int arreglo[])
    {
      int arre[];
      int i, j, temporal;
      
      arre =new int[arreglo.length];
      
      for(i=0;i <arreglo.length;i++)
         arre[i]=arreglo[i];
      
      for(i=arre.length;i > 0; i--)
      {
         for(j=0; j < i-1;j++)
         {
	   if(arre[j] > arre[j+1])
	   {
	     temporal = arre[j];
	     arre[j] = arre[j+1];
	     arre[j+1] = temporal;
           }
         }
      }
      return arre;
    }
    
    public static int buscarBinario(int vrBuscado, int arreglo[])
    {
        boolean encontrado = false;
        int inicio = 0;
        int fin = arreglo.length-1;
        int pos=-1;
        int medio;
        
        while(inicio<=fin && encontrado==false)
        {
            medio = (inicio+fin)/2;
            if (arreglo[medio]== vrBuscado)
            {
                encontrado = true;
                pos = medio;
            }
            else if (arreglo[medio]> vrBuscado)
            {
                fin = medio -1;
            }
            else
            {
                inicio = medio + 1;
            }
        }
        return pos;
    }
}

    
    

