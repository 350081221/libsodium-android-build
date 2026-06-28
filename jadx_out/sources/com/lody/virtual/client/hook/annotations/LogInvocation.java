package com.lody.virtual.client.hook.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface LogInvocation {

    /* loaded from: classes3.dex */
    public enum Condition {
        NEVER { // from class: com.lody.virtual.client.hook.annotations.LogInvocation.Condition.1
            @Override // com.lody.virtual.client.hook.annotations.LogInvocation.Condition
            public int getLogLevel(boolean z4, boolean z5) {
                return -1;
            }
        },
        ALWAYS { // from class: com.lody.virtual.client.hook.annotations.LogInvocation.Condition.2
            @Override // com.lody.virtual.client.hook.annotations.LogInvocation.Condition
            public int getLogLevel(boolean z4, boolean z5) {
                return z5 ? 5 : 4;
            }
        },
        ON_ERROR { // from class: com.lody.virtual.client.hook.annotations.LogInvocation.Condition.3
            @Override // com.lody.virtual.client.hook.annotations.LogInvocation.Condition
            public int getLogLevel(boolean z4, boolean z5) {
                return z5 ? 5 : -1;
            }
        },
        NOT_HOOKED { // from class: com.lody.virtual.client.hook.annotations.LogInvocation.Condition.4
            @Override // com.lody.virtual.client.hook.annotations.LogInvocation.Condition
            public int getLogLevel(boolean z4, boolean z5) {
                if (z4) {
                    return -1;
                }
                return z5 ? 5 : 4;
            }
        };

        public abstract int getLogLevel(boolean z4, boolean z5);
    }

    Condition value() default Condition.ALWAYS;
}
