/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Shobhit, rishabagarwal, parvathypillai,Shobhit, rishabagarwal, parvathy pillai
 */
public abstract class Role {
    
    public enum RoleType{
        HospitalAdmin("HospitalAdmin"),
        Doctor("Doctor"),
        HospitalStaff("HospitalStaff"),
        AmbulanceDriver("AmbulanceDriver"),
        LabAdmin("LabAdmin"),
        LabStaff("LabStaff"),
        PharmacyAdmin("PharmacyAdmin"),
        DeliveryMan("DeliveryMan"),
        InsuranceAdmin("InsuranceAdmin"),
        InsuranceStaff("InsuranceStaff");
       
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() { 
        
        return this.getClass().getName();
    }
    
    
}