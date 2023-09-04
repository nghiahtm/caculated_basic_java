public class Solution {
    private Double cr;
    private Double cd;

    public Solution(double cr, double cd) {
        this.cr = cr;
        this.cd = cd;
    }

    double tinhChuVi (){
        return  (cd + cr) * 2;
    }

    double tinhDienTich (){
        return cd * cr;
    }
}
