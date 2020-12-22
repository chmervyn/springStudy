package com.sap.mervyn.spring.soundsystem;

import junit.framework.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TrackCounterConfig.class)
public class TrackCounterTest {
    @Rule
    public final SystemOutRule log = new SystemOutRule();

    @Autowired
    private TrackCounter counter;

    @Autowired
    private CompactDisc cd;

    @Test
    public void testTrackCounter() {
        cd.playTrack(1);
        cd.playTrack(2);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(7);
        cd.playTrack(7);

        Assert.assertEquals(1, counter.getPlayCount(1));
        Assert.assertEquals(1, counter.getPlayCount(2));
        Assert.assertEquals(4, counter.getPlayCount(3));
        Assert.assertEquals(0, counter.getPlayCount(4));

        Assert.assertEquals(0, counter.getPlayCount(5));
        Assert.assertEquals(0, counter.getPlayCount(6));
        Assert.assertEquals(2, counter.getPlayCount(7));
    }


}
