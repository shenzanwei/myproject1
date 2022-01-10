package com.stx.myproject.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author jzj(贝西)
 * 博客：https://blog.csdn.net/beixishuo
 * B站：'贝西贝西'
 * @create 2020-04-07 1:57
 */
@Entity
@Data
public class Dept {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer deptno;
    private String dname;
    private String loc;
}
