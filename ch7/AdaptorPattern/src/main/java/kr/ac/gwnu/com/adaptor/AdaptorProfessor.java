package kr.ac.gwnu.com.adaptor;

public class AdaptorProfessor implements IMember {
    private Professor pf;

    public AdaptorProfessor(Professor pf) {
        this.pf = pf;
    }

    @Override
    public String getID() {
        return this.pf.getPid();
    }

    @Override
    public String getName() {
        return this.pf.getFullName();
    }

    @Override
    public String getAddress() {
        return this.pf.getLocation();
    }
}
