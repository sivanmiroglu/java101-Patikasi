public class Car2 {
    String model ;
    String type;
    String color;
    int speed;
    int speedLimit =100;

    // Constructor method

    Car2(String model,int speed ,String color){
        this.model=model;
        this.speed=speed;
        this.type="Sedan";
        this.speedLimit=180;
        this.color=color;
    }

    void increaseSpeed(int increment){
        this.speed += increment;
    }

    void decreaseSpeed(int decrease) {
        if (speed > 10) {
            this.speed -= decrease;
        }
    }

    void printSpeed(){
        System.out.println(this.model + "Hızınız :"+ this.speed);
    }

    void printinfo(){
        System.out.println("Model :\t" + this.model);
        System.out.println("Color :\t"+ this.color);
        System.out.println("Type :\t"+ this.type);
        System.out.println("Spped :\t"+ this.speed);
    }
}
