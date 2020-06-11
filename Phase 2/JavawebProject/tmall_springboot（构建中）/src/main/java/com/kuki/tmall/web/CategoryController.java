package com.kuki.tmall.web;

import com.kuki.tmall.pojo.Category;
import com.kuki.tmall.service.CategoryService;
import com.kuki.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.List;

@RestController
public class CategoryController {
    @Autowired CategoryService categoryService;

    @GetMapping("/categories")
    public Page4Navigator<Category> list(
            @RequestParam(value = "start",defaultValue = "0")int start,@RequestParam(value = "size", defaultValue = "5") int size) throws Exception{
        System.out.print("Start kuki:");
        start=start<0?0:start;
        Page4Navigator<Category> page=categoryService.list(start,size,5);
        List<Category> l=categoryService.list();
        for(Category each : l){
            System.out.print(each.getName());
        }
        return page;

    }
}
