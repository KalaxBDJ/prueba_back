package com.example.backend.services;

import java.util.List;
import java.util.Optional;

import com.example.backend.interfaces.IUserDao;
import com.example.backend.models.resp;
import com.example.backend.models.update;
import com.example.backend.models.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class userService implements IUserService{

    @Autowired
    private IUserDao userDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<user> findAll() {
        // TODO Auto-generated method stub
        return (List<user>) userDao.findAll();
    }
    @Override
    public Object findUser(user user) {
        // TODO Auto-generated method stub

        List<user> iterable = this.findAll();
        
       

        for(user i : iterable)
        {   
            if((user.getUsername().equals(i.getUsername()))&&(user.getPassword().equals(i.getPassword())))
            {
                return i;
            }
            
        }
        
        resp respuesta = new resp(404, "User not found");

        return respuesta;
    }

    @Override
    public Object updateDesc(@RequestBody update data) {
        Optional<user> useropt = userDao.findById(data.getId());

        if(!useropt.isPresent())
        {
            
        }
        else
        {
            user usuario = useropt.get();
            if(!data.getDesc().equals(""))
            {
                usuario.setDescription(data.getDesc());
            }

            if(!data.getPais().equals(""))
            {
                usuario.setCountry(data.getPais());
            }

            return userDao.save(usuario);
        }

        

        resp respuesta = new resp(404, "User not found");

        return respuesta;
        
    }
    
    
}
