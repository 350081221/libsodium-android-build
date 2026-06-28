package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.i0;
import kotlin.jvm.internal.n1;
import n3.a;
import n3.b;
import n3.d;
import n3.e;
import n3.f;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

@Target({ElementType.TYPE})
@e(a.RUNTIME)
@d
@f(allowedTargets = {b.CLASS})
@Retention(RetentionPolicy.RUNTIME)
@ComposeCompilerApi
@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003R\u000f\u0010\u0005\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0006R\u000f\u0010\u0004\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/internal/FunctionKeyMeta;", "", DatabaseFileArchive.COLUMN_KEY, "", "startOffset", "endOffset", "()I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Repeatable(Container.class)
/* loaded from: classes.dex */
public @interface FunctionKeyMeta {

    @Target({ElementType.TYPE})
    @e(a.RUNTIME)
    @n1
    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(allowedTargets = {b.CLASS})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface Container {
        FunctionKeyMeta[] value();
    }

    int endOffset();

    int key();

    int startOffset();
}
