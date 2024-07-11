package com.rca.mySecurity.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rca.mySecurity.entity.UserData;
import java.util.Optional;
@Repository
public interface UserDataRepo extends JpaRepository<UserData, Integer> {
    Optional<UserData> findByEmail(String email);
}
