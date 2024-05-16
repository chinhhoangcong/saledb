/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hcc.services.impl;

import com.hcc.repositories.StatsRepository;
import com.hcc.services.StatsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACER
 */
@Service
public class StatsServiceImpl implements StatsService{
    @Autowired
    private StatsRepository statRepo;
    
    @Override
    public List<Object[]> statsRevenueByProduct() {
        return this.statRepo.statsRevenueByProduct();
    }

    @Override
    public List<Object[]> statsRevenueByPeriod(int year, String period) {
        return this.statRepo.statsRevenueByPeriod(year, period);
    }
    
}
