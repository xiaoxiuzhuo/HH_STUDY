package com.kuki.springboot.service;

import java.util.List;

import com.kuki.springboot.pojo.Hero;

public interface HeroService {
    public int add(Hero hero);

    public void delete(int id);

    public Hero get(int id);

    public int update(Hero hero);

    public List<Hero> list();
}