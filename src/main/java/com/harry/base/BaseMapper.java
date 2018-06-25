package com.harry.base;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<T extends Serializable, I extends Serializable> {


    T select(I var1);

    int insert(T var1);

    int update(T var1);

    int delete(I var1);

    List<T> selectAll();

    List<T> selectList(PagingParam var1);

    T selectOne(T var1);

    int batchSoftDelete(List<I> var1);

    int batchDelete(List<I> var1);

    int countAll(T var1);

    List<T> listByPage(T var1);

    List<T> listByModel(T var1);

}
