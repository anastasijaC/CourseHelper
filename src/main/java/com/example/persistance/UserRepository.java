package com.example.persistance;

import com.example.model.jpa.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Anastasija on 3/8/2017.
 */
interface UserRepository  extends CrudRepository<User, Long> {
}
