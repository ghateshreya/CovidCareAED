/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shreya.ghate
 */
public class VaccineManufacturer extends Enterprise {
     public VaccineManufacturer (String name){
        super( Enterprise.EnterpriseType.VaccineManufacturer, name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
