public class With_LSP {

    static class transport {
        public float speed;
        public float Speed(){
            return speed;
        }
        public void setSpeed(float v){
            this.speed=v;
        }
    }
    static class car extends transport {
        public int license_plate;
        public void setNumber(float v){
            this.speed=v;
        }
    }




    public static void main(String[] args) {
        transport Bus=new transport();
        Bus.setSpeed(10);
        System.out.println(Bus.Speed());

        car Bus_2 = new car();
        Bus_2.setSpeed(10);
        System.out.println(Bus_2.Speed());
        System.out.println("LSP - complited!");



    }
}