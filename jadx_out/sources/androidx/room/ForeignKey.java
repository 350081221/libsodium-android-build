package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.i0;

@Target({})
@n3.e(n3.a.BINARY)
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\u0002\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0011BF\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000eR\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0011\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n8\u0007¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0011\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/room/ForeignKey;", "", "Lkotlin/reflect/d;", "entity", "()Ljava/lang/Class;", "", "", "parentColumns", "()[Ljava/lang/String;", "childColumns", "", "onDelete", "()I", "onUpdate", "", "deferred", "()Z", "Companion", "Action", "room-common"}, k = 1, mv = {1, 8, 0})
@n3.f(allowedTargets = {})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface ForeignKey {
    public static final int CASCADE = 5;

    @p4.l
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int NO_ACTION = 1;
    public static final int RESTRICT = 2;
    public static final int SET_DEFAULT = 4;
    public static final int SET_NULL = 3;

    @n3.e(n3.a.BINARY)
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/room/ForeignKey$Action;", "", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes2.dex */
    public @interface Action {
    }

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/room/ForeignKey$Companion;", "", "()V", "CASCADE", "", "NO_ACTION", "RESTRICT", "SET_DEFAULT", "SET_NULL", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int CASCADE = 5;
        public static final int NO_ACTION = 1;
        public static final int RESTRICT = 2;
        public static final int SET_DEFAULT = 4;
        public static final int SET_NULL = 3;

        private Companion() {
        }
    }

    String[] childColumns();

    boolean deferred() default false;

    Class<?> entity();

    @Action
    int onDelete() default 1;

    @Action
    int onUpdate() default 1;

    String[] parentColumns();
}
