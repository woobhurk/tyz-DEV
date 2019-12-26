package com.tyfanch.designpattern.creational.abstractfactory;

/**
 * 衣服工厂
 */
public interface ClothesFactory {
    Clothes createLargeClothes();

    Clothes createMediumClothes();

    Clothes createSmallClothes();
}
