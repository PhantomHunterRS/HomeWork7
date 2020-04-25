import java.util.ArrayList;

public class Company {
    private ArrayList<SubsidiaryCompany> subsidiaryCompany;
    private String nameParentCompany;

    public Company(String nameParentCompany) {
        this.nameParentCompany = nameParentCompany;
        subsidiaryCompany  = new ArrayList<SubsidiaryCompany>();
    }
    public ArrayList<SubsidiaryCompany> getSubsidiaryCompany() {
        return subsidiaryCompany;
    }
}


