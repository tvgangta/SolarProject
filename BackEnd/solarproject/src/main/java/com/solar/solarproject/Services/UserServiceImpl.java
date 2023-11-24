package com.solar.solarproject.Services;

import com.solar.solarproject.DAO.*;
import com.solar.solarproject.Entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDao;

    @Override
    public List<UserEntity> getUsers() {
        return null;
    }

    @Override
    public String test() {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public UserEntity update(UserEntity user) {
        return null;
    }

    @Override
    public UserEntity addUser(UserEntity user) {
        return null;
    }

    @Override
    public boolean isPresent(int id, String password) {
        return false;
    }

    @Override
    public UserEntity getUser(int id) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends UserEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends UserEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<UserEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public UserEntity getOne(Integer integer) {
        return null;
    }

    @Override
    public UserEntity getById(Integer integer) {
        return null;
    }

    @Override
    public UserEntity getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends UserEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends UserEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends UserEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends UserEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends UserEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends UserEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends UserEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends UserEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends UserEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<UserEntity> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<UserEntity> findAll() {
        return null;
    }

    @Override
    public List<UserEntity> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(UserEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends UserEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<UserEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<UserEntity> findAll(Pageable pageable) {
        return null;
    }
}
//    List<Integer> list =new ArrayList<>();
//    public UserServiceImpl(){
//        list.add(1);
//        list.add(2);
//    }
//
//    @Override
//    public String test(){
//        return list.toString();
//    }
//
//    @Override
//    public void deleteUser(Long id) {
//
//    }
//
//
//    @Override
//    public List<UserEntity> getUsers(){
//        return userDao.findAll();
//    }
//    @Override
//    public UserEntity getUser(int id){ return userDao.getOne(id); }
//
//    @Override
//    public boolean isPresent(int id, String password){
//        UserEntity user = userDao.getOne(id);
//        if(user!=null)
//        {
//            return user.getPassword().equals(password);
//        }
//        return false;
//    }
//
//    @Override
//    public UserEntity getUser(long id) {
//        return null;
//    }
//
//    @Override
//    public UserEntity addUser(UserEntity user){
//        userDao.save(user);
//        return user;
//    }
//
//    @Override
//    public UserEntity update(UserEntity user){
//        userDao.save(user);
//        return user;
//    }
//
//    @Override
//    public void deleteUser(int id){
//        UserEntity user = userDao.getOne(id);
//        userDao.delete(user);
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//    //Flush and Unused methods, not to be edited/modified
//    @Override
//    public void flush() {
//
//    }
//
//    @Override
//    public <S extends UserEntity> S saveAndFlush(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends UserEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public void deleteInBatch(Iterable<UserEntity> entities) {
//        UserService.super.deleteInBatch(entities);
//    }
//
//    @Override
//    public void deleteAllInBatch(Iterable<UserEntity> entities) {
//
//    }
//
//    @Override
//    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
//
//    }
//
//    @Override
//    public void deleteAllInBatch() {
//
//    }
//
//    @Override
//    public UserEntity getOne(Integer integer) {
//        return null;
//    }
//
//    @Override
//    public UserEntity getById(Integer integer) {
//        return null;
//    }
//
//    @Override
//    public UserEntity getReferenceById(Integer integer) {
//        return null;
//    }
//
//    @Override
//    public <S extends UserEntity> Optional<S> findOne(Example<S> example) {
//        return Optional.empty();
//    }
//
//    @Override
//    public <S extends UserEntity> List<S> findAll(Example<S> example) {
//        return null;
//    }
//
//    @Override
//    public <S extends UserEntity> List<S> findAll(Example<S> example, Sort sort) {
//        return null;
//    }
//
//    @Override
//    public <S extends UserEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public <S extends UserEntity> long count(Example<S> example) {
//        return 0;
//    }
//
//    @Override
//    public <S extends UserEntity> boolean exists(Example<S> example) {
//        return false;
//    }
//
//    @Override
//    public <S extends UserEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//        return null;
//    }
//
//    @Override
//    public <S extends UserEntity> S save(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends UserEntity> List<S> saveAll(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public Optional<UserEntity> findById(Integer integer) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Integer integer) {
//        return false;
//    }
//
//    @Override
//    public List<UserEntity> findAll() {
//        return null;
//    }
//
//    @Override
//    public List<UserEntity> findAllById(Iterable<Integer> integers) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(Integer integer) {
//
//    }
//
//    @Override
//    public void delete(UserEntity entity) {
//
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends Integer> integers) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends UserEntity> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//
//    @Override
//    public List<UserEntity> findAll(Sort sort) {
//        return null;
//    }
//
//    @Override
//    public Page<UserEntity> findAll(Pageable pageable) {
//        return null;
//    }
//}
