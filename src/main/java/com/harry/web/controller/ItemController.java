package com.harry.web.controller;

import com.harry.entity.Items;
import com.harry.entity.Orders;
import com.harry.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

//    @Autowired
//    public ItemController(ItemServiceImpl itemService) {
//        this.itemService = itemService;
//    }

    @RequestMapping(value = "/login.action", method = RequestMethod.POST)
    public String login() {
        return "redirect:itemList.action";
    }

    @RequestMapping(value = "itemList.action")
    public ModelAndView getItemList() {
        List<Items> allItems = itemService.getAllItems();
        ModelAndView mav = new ModelAndView();
        mav.addObject("itemList", allItems);
        mav.setViewName("/itemList.jsp");
        return mav;
    }

    @RequestMapping(value = "/itemEdit.action")
    public ModelAndView editItem(Integer id) {
        List<Items> list = new ArrayList<Items>();
        Items item = list.get(id);
        ModelAndView mav = new ModelAndView();
        mav.addObject("item", item);
        mav.setViewName("/editItem.jsp");
        return mav;
    }

    @RequestMapping(value = "/getJson.action", method = RequestMethod.POST)
    @ResponseBody
    public Orders getJson(@RequestBody Orders order) {
        System.out.println(order);
        return order;
    }

}
