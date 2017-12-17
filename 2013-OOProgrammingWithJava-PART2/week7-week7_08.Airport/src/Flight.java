/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ChiuSing
 */
class Flight {
        private String pid, depart, dest;

    public Flight(String pid, String depart, String dest) {
        this.pid = pid;
        this.depart = depart;
        this.dest = dest;
    }

    public String getPid() {
        return pid;
    }
    
    public String getRoute(){
        return " (" + this.depart  + "-" + this.dest + ")" ;
    }

    
        
}
