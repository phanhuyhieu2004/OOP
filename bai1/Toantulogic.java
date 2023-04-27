package bai1;
//https://www.youtube.com/watch?v=Kbc6L8f0pJI&list=PLPt6-BtUI22rxpe6PZc5H6XAgPusA6fDQ&index=9
public class Toantulogic {
    public static void main(String[] args) {
        int i=7;
        System.out.println(i>0&&i<10);
        System.out.println(i>0||i<-1);
        System.out.println(!(i>0||i<-1));


//        toán tử tăng giảm
        int x=100;
        int y=90;
        int z=80;
        int t=70;
//        x++=)x=X+1;
//++y=)y=y+1;
//z--;
//--t
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);


        int a=1;
        int b=2;
        int c=a++ - ++b +1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
       /* a++,a--(viết sau biến)=)Postfix
                ++a,--a(Prefix)
            B1:Prefix
                    B2:Các phép toán còn lại
                B3:Gán giá  trị cho biến ở bên trái dấu bằng
                B4:Postfix*/

        int f = 5;

//        System.out.println(++f);
//        System.out.println(f);

        System.out.println(f++);
        System.out.println(f);
        System.out.println(f);
//Toán từ 3 ngôi
int l=18;
String ketqua;
ketqua=(l>=18)?"Được xem phim 18+":"Không xem";
        System.out.println(ketqua);

        
    }
}
