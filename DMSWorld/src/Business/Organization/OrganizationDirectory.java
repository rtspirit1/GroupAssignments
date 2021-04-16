package Business.Organization;

import Business.Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author rtspi
 */
public class OrganizationDirectory {
    
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<Organization>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
}