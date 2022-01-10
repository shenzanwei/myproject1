package com.stx.myproject.repository;

import com.stx.myproject.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jzj(贝西)
 * 博客：https://blog.csdn.net/beixishuo
 * B站：'贝西贝西'
 * @create 2020-04-07 1:59
 */
public interface DeptRepository extends JpaRepository<Dept,Integer> {
}
