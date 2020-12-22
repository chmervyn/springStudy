package com.sap.mervyn.spring.aop.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EncoreableIntroducer {

    @DeclareParents(value="com.sap.mervyn.spring.aop.concert.Performance+",
                    defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;


}
