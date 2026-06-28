package com.huawei.agconnect.apms.instrument;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface AddCustomTrace {
    boolean enabled() default true;

    String name();
}
