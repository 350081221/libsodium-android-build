package kotlin.internal;

import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.n1;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@g1(version = "1.2")
@n3.e(n3.a.SOURCE)
@n3.d
@n3.f(allowedTargets = {n3.b.CLASS, n3.b.FUNCTION, n3.b.PROPERTY, n3.b.CONSTRUCTOR, n3.b.TYPEALIAS})
@Retention(RetentionPolicy.SOURCE)
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\u0002\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\nR\u000f\u0010\t\u001a\u00020\n¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u000f\u0010\u0005\u001a\u00020\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\fR\u000f\u0010\u0004\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0004\u0010\rR\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\rR\u000f\u0010\u0007\u001a\u00020\b¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/internal/RequireKotlin;", "", "version", "", CrashHianalyticsData.MESSAGE, "level", "Lkotlin/DeprecationLevel;", "versionKind", "Lkotlin/internal/RequireKotlinVersionKind;", MediationConstant.KEY_ERROR_CODE, "", "()I", "()Lkotlin/DeprecationLevel;", "()Ljava/lang/String;", "()Lkotlin/internal/RequireKotlinVersionKind;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Repeatable(a.class)
/* loaded from: classes3.dex */
public @interface p {

    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @n3.e(n3.a.SOURCE)
    @n1
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    @n3.f(allowedTargets = {n3.b.CLASS, n3.b.FUNCTION, n3.b.PROPERTY, n3.b.CONSTRUCTOR, n3.b.TYPEALIAS})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface a {
        p[] value();
    }

    int errorCode() default -1;

    kotlin.m level() default kotlin.m.ERROR;

    String message() default "";

    String version();

    q versionKind() default q.LANGUAGE_VERSION;
}
