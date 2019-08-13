/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertion.sort.assignment;

/**
 *
 * @author Vincent
 */
public class InsertionSort {
    
    private int[] a;
    private int nElms;
    
    public void myArray(int max)
    {
        a = new int[max];
        nElms = 0;
    }
    
    public void insert(int value)
    {
        a[nElms] = value;
        nElms++;
    }
    public int[] getArray(){
		return a;
	}
    public void printout()
    {
        for(int i=0; i<nElms; i++)
        {
            System.out.println(a[i]);
        }
    }
    public void ISort()
   {
       int in, out;
       for(out=1;out<nElms;out++)
       {
           int temp = a[out];
           in = out;
           while(in > 0 && a[in-1] >= temp)
           {
               a[in] = a[in-1];
               --in;
           }
           a[in]=temp;
       }    
   }
    
}
