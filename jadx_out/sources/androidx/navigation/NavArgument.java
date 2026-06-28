package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u001fB3\b\u0000\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0013\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u001f\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Landroidx/navigation/NavArgument;", "", "", "name", "Landroid/os/Bundle;", "bundle", "Lkotlin/r2;", "putDefaultValue", "", "verify", "toString", "other", "equals", "", TTDownloadField.TT_HASHCODE, "Landroidx/navigation/NavType;", "type", "Landroidx/navigation/NavType;", "getType", "()Landroidx/navigation/NavType;", "isNullable", "Z", "()Z", "isDefaultValuePresent", "defaultValue", "Ljava/lang/Object;", "getDefaultValue", "()Ljava/lang/Object;", "defaultValuePresent", "<init>", "(Landroidx/navigation/NavType;ZLjava/lang/Object;Z)V", "Builder", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NavArgument {

    @m
    private final Object defaultValue;
    private final boolean isDefaultValuePresent;
    private final boolean isNullable;

    @l
    private final NavType<Object> type;

    @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u001a\u0010\r\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u000e0\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/navigation/NavArgument$Builder;", "", "()V", "defaultValue", "defaultValuePresent", "", "isNullable", "type", "Landroidx/navigation/NavType;", "build", "Landroidx/navigation/NavArgument;", "setDefaultValue", "setIsNullable", "setType", "T", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Builder {

        @m
        private Object defaultValue;
        private boolean defaultValuePresent;
        private boolean isNullable;

        @m
        private NavType<Object> type;

        @l
        public final NavArgument build() {
            NavType<Object> navType = this.type;
            if (navType == null) {
                navType = NavType.Companion.inferFromValueType(this.defaultValue);
                l0.n(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new NavArgument(navType, this.isNullable, this.defaultValue, this.defaultValuePresent);
        }

        @l
        public final Builder setDefaultValue(@m Object obj) {
            this.defaultValue = obj;
            this.defaultValuePresent = true;
            return this;
        }

        @l
        public final Builder setIsNullable(boolean z4) {
            this.isNullable = z4;
            return this;
        }

        @l
        public final <T> Builder setType(@l NavType<T> type) {
            l0.p(type, "type");
            this.type = type;
            return this;
        }
    }

    public NavArgument(@l NavType<Object> type, boolean z4, @m Object obj, boolean z5) {
        boolean z6;
        l0.p(type, "type");
        if (!type.isNullableAllowed() && z4) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z6) {
            if ((!z4 && z5 && obj == null) ? false : true) {
                this.type = type;
                this.isNullable = z4;
                this.defaultValue = obj;
                this.isDefaultValuePresent = z5;
                return;
            }
            throw new IllegalArgumentException(("Argument with type " + type.getName() + " has null value but is not nullable.").toString());
        }
        throw new IllegalArgumentException((type.getName() + " does not allow nullable values").toString());
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !l0.g(NavArgument.class, obj.getClass())) {
            return false;
        }
        NavArgument navArgument = (NavArgument) obj;
        if (this.isNullable != navArgument.isNullable || this.isDefaultValuePresent != navArgument.isDefaultValuePresent || !l0.g(this.type, navArgument.type)) {
            return false;
        }
        Object obj2 = this.defaultValue;
        if (obj2 != null) {
            return l0.g(obj2, navArgument.defaultValue);
        }
        if (navArgument.defaultValue == null) {
            return true;
        }
        return false;
    }

    @m
    public final Object getDefaultValue() {
        return this.defaultValue;
    }

    @l
    public final NavType<Object> getType() {
        return this.type;
    }

    public int hashCode() {
        int i5;
        int hashCode = ((((this.type.hashCode() * 31) + (this.isNullable ? 1 : 0)) * 31) + (this.isDefaultValuePresent ? 1 : 0)) * 31;
        Object obj = this.defaultValue;
        if (obj != null) {
            i5 = obj.hashCode();
        } else {
            i5 = 0;
        }
        return hashCode + i5;
    }

    public final boolean isDefaultValuePresent() {
        return this.isDefaultValuePresent;
    }

    public final boolean isNullable() {
        return this.isNullable;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void putDefaultValue(@l String name, @l Bundle bundle) {
        l0.p(name, "name");
        l0.p(bundle, "bundle");
        if (this.isDefaultValuePresent) {
            this.type.put(bundle, name, this.defaultValue);
        }
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NavArgument.class.getSimpleName());
        sb.append(" Type: " + this.type);
        sb.append(" Nullable: " + this.isNullable);
        if (this.isDefaultValuePresent) {
            sb.append(" DefaultValue: " + this.defaultValue);
        }
        String sb2 = sb.toString();
        l0.o(sb2, "sb.toString()");
        return sb2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean verify(@l String name, @l Bundle bundle) {
        l0.p(name, "name");
        l0.p(bundle, "bundle");
        if (!this.isNullable && bundle.containsKey(name) && bundle.get(name) == null) {
            return false;
        }
        try {
            this.type.get(bundle, name);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }
}
