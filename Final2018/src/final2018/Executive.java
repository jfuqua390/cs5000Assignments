/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final2018;

/**
 *
 * @author jfuqua390
 */
public class Executive extends Manager {
    public String position;
    
    public Executive(String aName, double aSalary, String aDepartment, String aPosition) {
        super(aName, aSalary, aDepartment);
        position=aPosition;
    }
    
    @Override
    public String toString(){
        return(super.toString()+
                "\nPosition: "+position);
    }
}
