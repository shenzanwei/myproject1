package com.stx.myproject.controller;

import com.stx.myproject.entity.Dept;
import com.stx.myproject.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author jzj(贝西)
 * 博客：https://blog.csdn.net/beixishuo
 * B站：'贝西贝西'
 * @create 2020-04-07 2:06
 */
@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptRepository deptRepository;
    //@GetMapping("/findAll/{page}/{size}")
    @GetMapping("/findAll")
    /*page是查询第几页*/
    public List<Dept> findAll(){
        //PageRequest request = PageRequest.of(page, size);
        return deptRepository.findAll();
    }
    @PostMapping("/save")
    public String save(@RequestBody Dept dept){
        Dept result = deptRepository.save(dept);
        if(result!=null){
            return "success";
        }else{
            return "error";
        }
    }
    @GetMapping("/findById/{deptno}")
    public Dept findById(@PathVariable("deptno") Integer deptno){
       return deptRepository.findById(deptno).get();
    }
    @PutMapping("/update")
    public String update(@RequestBody Dept dept){
        Dept result = deptRepository.save(dept);
        if(result!=null){
            return "success";
        }else{
            return "error";
        }
    }
    @DeleteMapping("/delete/{deptno}")
    public void delete(@PathVariable("deptno") Integer deptno){
        deptRepository.deleteById(deptno);
    }
}
