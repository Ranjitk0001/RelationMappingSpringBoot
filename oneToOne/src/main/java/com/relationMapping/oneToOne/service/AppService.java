package com.relationMapping.oneToOne.service;

import com.relationMapping.oneToOne.entity.Address;
import com.relationMapping.oneToOne.entity.Student;
import com.relationMapping.oneToOne.repository.AddressRepository;
import com.relationMapping.oneToOne.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@Service
public class AppService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private AddressRepository addressRepository;

    @Transactional
    public void saveData(){
        Student s1=new Student("rk",908234567);

        Address sa1=new Address("Shiv5","pune","maha");

        addressRepository.save(sa1);
        studentRepository.save(s1);

        System.out.println("Data for student and address table now are inserted...");
    }
}
