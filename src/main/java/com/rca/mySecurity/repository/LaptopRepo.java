package com.rca.mySecurity.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rca.mySecurity.entity.Laptop;
@Repository
public interface LaptopRepo extends JpaRepository<Laptop, Integer> {
}
