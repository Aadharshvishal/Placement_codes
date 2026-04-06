class constructor{
    int year;
    String model;
    public constructor(int year,String model){
        this.year =year;
        this.model=model;
    }
    public static void main(String[] args) {
        constructor car=new constructor(2020,"Seden");
        System.out.println("Car Year: "+car.year);
        System.out.println("Car Model: "+car.model);
    }
}
