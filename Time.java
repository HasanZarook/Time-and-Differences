public class Time {
    private int h;
    private int m;
    private int s;

    static int a;
    Time(int sec)
    {
        h=sec/3600;
        m=(sec-(h*3600))/60;
        s=sec-((h*3600)+(m*60));
    }
    Time(int hh,int mm,int ss)
    {
        h=hh;
        s=ss;
        m=mm;
        a =3;
    }
    public int diffs(Time n)
    {
        int nnh=Math.abs(h-n.h);
        int nnm=Math.abs(m-n.m);
        int nns=Math.abs(s-n.s);
        int secs=(nnh*3600)+(nnm*60)+nns;
        return secs;
    }

    public String diff(Time n)
    {
        int nnh=Math.abs(h-n.h);
        int nnm=Math.abs(m-n.m);
        int nns=Math.abs(s-n.s);
        return nnh+":"+nnm+":"+nns;
    }
    public void sett(int hh,int mm,int ss) {
        h=hh;
        m=mm;
        s = ss;
    }
    public void gett()
    {
        System.out.println(h+":"+m+":"+s);
    }


    public static void main(String[] args) {
        Time ab = new Time(12,22,4);
        Time d= new Time(400);
        d.gett();
        ab.gett();
        Time c= new Time(2,30,20);
        System.out.println(ab.diff(c));
        System.out.println(ab.diffs(c));
        System.out.println(a);
        System.out.println(ab.a);
        System.out.println(d.a);

    }
}
