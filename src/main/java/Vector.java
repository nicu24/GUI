import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Vector {
    private int x;
    private int y;
    private int x1;
    private int y1;

    static Vector sum(Vector v1, Vector v2)
    {
        int a,b,c,d;
        a=v1.getX()+v2.getX();
        b=v1.getY()+v2.getY();
        c=v1.getX1()+v2.getX1();
        d=v1.getY1()+v2.getY1();

        return new Vector(a,b,c,d);

    }

    static Vector diff(Vector v1, Vector v2)
    {
        int a,b,c,d;
        a=v1.getX()-v2.getX();
        b=v1.getY()-v2.getY();
        c=v1.getX1()-v2.getX1();
        d=v1.getY1()-v2.getY1();
        return new Vector(a,b,c,d);

    }


}
