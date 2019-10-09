package com.example.challengedocfriends.ifs;

import com.example.challengedocfriends.model.Header;

public interface CrudInterface<Req, Res> {

    Header<Res> create(Header<Req> request);    // todo request object 추가

    Header<Res> read(Header<Req> request);

    Header<Res> update(Header<Req> request);

    Header delete(Long id);

}
