package String;

public class Emp {
    int eid;
    String ename;
    public Emp(int eid,String ename)
    {
       this.eid=eid;
       this.ename=ename;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
    public void disp()
    {
        System.out.println(eid);
        System.out.println(ename);
    }
}
