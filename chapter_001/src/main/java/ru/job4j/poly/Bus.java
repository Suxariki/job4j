package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Мы едем едем едем, в далекие края");
    }

    @Override
    public void getPassenger(int passenger) {
        System.out.println("В автобусе " + passenger + " пассажиров");
    }

    @Override
    public double refuel(double gas) {
        double price = 66.65;
        return price * gas;
    }
}
