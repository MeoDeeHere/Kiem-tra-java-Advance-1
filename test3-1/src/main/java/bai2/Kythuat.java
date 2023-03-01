package bai2;

public class Kythuat extends Nhanvien {
    private String Major;

    public Kythuat() {
    }

    @Override
    public String moTaCongViec() {
        return Major;
    }

    public Kythuat(String ID) {
        super(ID);
    }

    public Kythuat(String ID, String name, String dob, String address, String major) {
        super(ID, name, dob, address);
        Major = major;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    @Override
    public String toString() {
        return "Kythuat[" + super.toString() +"Major='" + Major + '\'' +
                ']';
    }
}
