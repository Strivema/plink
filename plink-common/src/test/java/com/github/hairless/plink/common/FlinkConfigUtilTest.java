package com.github.hairless.plink.common;

import com.github.hairless.plink.model.exception.PlinkMessageException;
import lombok.extern.slf4j.Slf4j;
import org.apache.flink.configuration.Configuration;
import org.junit.Test;

/**
 * @author: silence
 * @date: 2020/3/10
 */
@Slf4j
public class FlinkConfigUtilTest {

    @Test
    public void getFlinkHome() throws PlinkMessageException {
        String flinkHome = FlinkConfigUtil.getFlinkHome();
        assert flinkHome != null;
        log.info("FlinkConfigUtilTest flinkHome is {}", flinkHome);
    }

    @Test
    public void getConfiguration() throws PlinkMessageException {
        Configuration configuration = FlinkConfigUtil.getConfiguration();
        assert configuration != null;
        log.info("FlinkConfigUtilTest flink configuration is {}", configuration);
    }

    @Test
    public void getRestAddress() throws PlinkMessageException {
        String restAddress = FlinkConfigUtil.getRestAddress();
        log.info("FlinkConfigUtilTest flink restAddress is {}", restAddress);
    }

    @Test
    public void getFlinkVersion() throws PlinkMessageException {
        String version = FlinkConfigUtil.getFlinkVersion();
        assert version != null;
        log.info("FlinkConfigUtilTest flink version is {}", version);
    }
}