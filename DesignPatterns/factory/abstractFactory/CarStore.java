package DesignPatterns.factory.abstractFactory;

import DesignPatterns.factory.abstractFactory.partsFactory.IEnvPartsFactory;
import DesignPatterns.factory.abstractFactory.partsFactory.SHEnvPartsFactory;

public class CarStore {
    public static void main(String[] args) {
        // 假设这是一家上海的车店
        IEnvPartsFactory factory = new SHEnvPartsFactory();
        Env env = new Env(factory);
        System.out.println("订购成功：");
        env.info();
    }
}
