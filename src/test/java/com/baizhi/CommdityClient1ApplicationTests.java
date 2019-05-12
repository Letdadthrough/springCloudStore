package com.baizhi;

import com.baizhi.dao.InfoMapper;
import com.baizhi.entity.Info;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommdityClient1ApplicationTests {
    @Autowired
    private InfoMapper infoMapper;

    @Test
    public void contextLoads() {
        List<Info> infos = infoMapper.selectAll();
        for (Info info : infos) {
            System.out.println(info);
        }
    }

    @Test
    public void tets(){
        String str1 ="151617";
        String str2 = "15";

        boolean contains = str1.contains(str2);
        System.out.println(contains);

    }


}
