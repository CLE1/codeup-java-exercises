class Red {
    public void showMyFavoriteColorOfAllTimefromTheRainbow(){
        System.out.println("I am Red");
    }
}

class Orange extends Red{
    public void showMyFavoriteColorOfAllTimefromTheRainbow(){
        System.out.println("I am Orange");
    }
}

public class colors {
    public static void main(String[] args) {
        Red redobj = new Red();
        Orange orangeobj = new Orange();
        redobj.showMyFavoriteColorOfAllTimefromTheRainbow();
        orangeobj.showMyFavoriteColorOfAllTimefromTheRainbow();



    }
}
