package com.itmuch.cloud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 735 on 2019/5/5.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
