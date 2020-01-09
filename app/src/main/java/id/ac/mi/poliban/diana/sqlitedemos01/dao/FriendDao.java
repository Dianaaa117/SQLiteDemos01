package id.ac.mi.poliban.diana.sqlitedemos01.dao;

import java.util.List;

import id.ac.mi.poliban.diana.sqlitedemos01.domain.Friend;

public interface FriendDao {
    void insert(Friend f);
    void update(Friend f);
    void delete(int id);
    Friend getAFriendById(int id);
    List<Friend> getAllFriends();
}
