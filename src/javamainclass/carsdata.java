/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamainclass;

import java.util.ArrayList;

/**
 *
 * @author sanik
 */
public class carsdata {
    private ArrayList<cars> data;
    public carsdata(){
        this.data=new ArrayList<cars>();
    }

    public ArrayList<cars> getData() {
        return data;
    }

    public void setData(ArrayList<cars> data) {
        this.data = data;
    } 

    public cars addNewcar() {
        cars newcars = new cars();
        data.add(newcars);
        return newcars;
    }
    public cars addNewCar(cars Cars){
        data.add(Cars);
        return Cars;
    }
    public void deletecars (cars c)
    {
        data.remove(c);
    }
}
    
