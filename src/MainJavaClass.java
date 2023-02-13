import vector3d.Vector3D;

public class MainJavaClass {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Vector3D r1 = new Vector3D();
        Vector3D r2 = new Vector3D();
                ;

        r1.setR( 2,3,4 );
        r2.setR( 5,3,1 );
        r1.add(r2);

        System.out.println( String.format(
                "vec sum = %f %f %f", r1.getR()[0], r1.getR()[1], r1.getR()[2] ) );
    }
}

