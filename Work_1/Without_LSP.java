public class Without_LSP {

    static class rectangle {
        public float x;
        public float y;
        public void setWidth(float y) {
            this.y = y;
        }
        public void setHeight(float x) {
            this.x = x;
        }

        public float area() {
            return x*y;
        }
    }

    static class square extends rectangle {
        public float x;

        public void setWidth(float y) {
            this.x = y;
        }
        public void setHeight(float x) {
            this.x = x;
        }
        public float area() {
            return x*x;
        }
    }


    public static void main(String[] args) {
        rectangle Rectangle = new rectangle();
        Rectangle.setHeight(10);
        Rectangle.setWidth(10);
        System.out.println(Rectangle.area());



        square Sqrt= new square();
        Sqrt.setHeight(10);
        Sqrt.setWidth(10);
        System.out.println(Sqrt.area());


    }
}