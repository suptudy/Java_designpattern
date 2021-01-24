package kr.ac.gwnu.com.adaptor;

public class ProfessorAdaptor extends Professor implements IMember {

    public ProfessorAdaptor(String id, String name, String address) {
        super(id, name, address);
    }

    @Override
    public String getID() {
        return this.getPid();
    }

    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getAddress() {
        return this.getLocation();
    }

}
