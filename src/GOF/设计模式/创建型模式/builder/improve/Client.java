package GOF.设计模式.创建型模式.builder.improve;

public class Client {
    public static void main(String args[]){
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        houseDirector.constructHouse();
        System.out.println("----------");
        HighBuilding highBuilding = new HighBuilding();
        houseDirector = new HouseDirector(highBuilding);
        houseDirector.constructHouse();
    }
}
