package com.thinkgem.jeesite.common.persistence;

import com.thinkgem.jeesite.common.test.SpringTransactionalContextTests;
import com.thinkgem.jeesite.modules.sys.dao.MyBatisDictDao;
import com.thinkgem.jeesite.modules.sys.entity.Dict;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MybatisDaoTest extends SpringTransactionalContextTests {

    @Autowired
    private MyBatisDictDao myBatisDictDao;

    @Test
    public void testFind() {
        List<Dict> dictList = myBatisDictDao.find(new Dict());
        System.out.println(dictList.size());
    }
}
