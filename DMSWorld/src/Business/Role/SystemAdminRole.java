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
 * @author rtspi
 */
public class SystemAdminRole extends Role{

    public SystemAdminRole() {
        
        this.type = Role.RoleType.SysAdmin;
    }
    
    

  
    public JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem system) {
        this.type = Role.RoleType.SysAdmin;
        return null; // change this
    }
    
}
