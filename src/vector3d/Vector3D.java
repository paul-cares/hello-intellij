package vector3d;

public class Vector3D {
    public static final int NDIM = 3;
    private double[] r = new double[3];

    public double[] getR() {
        return r;
    }
    public void setR(double x, double y, double z) {
        this.r[0] = x;
        this.r[1] = y;
        this.r[2] = z;
    }

    public Vector3D()
    {
        for ( int i = 0 ; i < NDIM ; ++ i )
        {
            this.r[i] += 0.0;
        }
    }
    public Vector3D add( Vector3D r2 )
    {
        for ( int i = 0 ; i < NDIM ; ++ i )
        {
            this.r[i] += r2.r[i];
        }
        //this.r[0] += r2.r[0];
        //this.r[1] += r2.r[1];
        //this.r[2] += r2.r[2];
        return this;
    }


}
