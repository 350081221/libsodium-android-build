package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.text.k0;
import kotlin.u0;
import p4.l;

@i0(d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\b"}, d2 = {"", "Lkotlin/u0;", "", "", "pairs", "Landroid/os/Bundle;", "bundleOf", "([Lkotlin/u0;)Landroid/os/Bundle;", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BundleKt {
    @l
    public static final Bundle bundleOf(@l u0<String, ? extends Object>... u0VarArr) {
        Bundle bundle = new Bundle(u0VarArr.length);
        for (u0<String, ? extends Object> u0Var : u0VarArr) {
            String component1 = u0Var.component1();
            Object component2 = u0Var.component2();
            if (component2 == null) {
                bundle.putString(component1, null);
            } else if (component2 instanceof Boolean) {
                bundle.putBoolean(component1, ((Boolean) component2).booleanValue());
            } else if (component2 instanceof Byte) {
                bundle.putByte(component1, ((Number) component2).byteValue());
            } else if (component2 instanceof Character) {
                bundle.putChar(component1, ((Character) component2).charValue());
            } else if (component2 instanceof Double) {
                bundle.putDouble(component1, ((Number) component2).doubleValue());
            } else if (component2 instanceof Float) {
                bundle.putFloat(component1, ((Number) component2).floatValue());
            } else if (component2 instanceof Integer) {
                bundle.putInt(component1, ((Number) component2).intValue());
            } else if (component2 instanceof Long) {
                bundle.putLong(component1, ((Number) component2).longValue());
            } else if (component2 instanceof Short) {
                bundle.putShort(component1, ((Number) component2).shortValue());
            } else if (component2 instanceof Bundle) {
                bundle.putBundle(component1, (Bundle) component2);
            } else if (component2 instanceof CharSequence) {
                bundle.putCharSequence(component1, (CharSequence) component2);
            } else if (component2 instanceof Parcelable) {
                bundle.putParcelable(component1, (Parcelable) component2);
            } else if (component2 instanceof boolean[]) {
                bundle.putBooleanArray(component1, (boolean[]) component2);
            } else if (component2 instanceof byte[]) {
                bundle.putByteArray(component1, (byte[]) component2);
            } else if (component2 instanceof char[]) {
                bundle.putCharArray(component1, (char[]) component2);
            } else if (component2 instanceof double[]) {
                bundle.putDoubleArray(component1, (double[]) component2);
            } else if (component2 instanceof float[]) {
                bundle.putFloatArray(component1, (float[]) component2);
            } else if (component2 instanceof int[]) {
                bundle.putIntArray(component1, (int[]) component2);
            } else if (component2 instanceof long[]) {
                bundle.putLongArray(component1, (long[]) component2);
            } else if (component2 instanceof short[]) {
                bundle.putShortArray(component1, (short[]) component2);
            } else if (component2 instanceof Object[]) {
                Class<?> componentType = component2.getClass().getComponentType();
                l0.m(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    l0.n(component2, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(component1, (Parcelable[]) component2);
                } else if (String.class.isAssignableFrom(componentType)) {
                    l0.n(component2, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(component1, (String[]) component2);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    l0.n(component2, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(component1, (CharSequence[]) component2);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(component1, (Serializable) component2);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + component1 + k0.f19765b);
                }
            } else if (component2 instanceof Serializable) {
                bundle.putSerializable(component1, (Serializable) component2);
            } else if (component2 instanceof IBinder) {
                bundle.putBinder(component1, (IBinder) component2);
            } else if (component2 instanceof Size) {
                BundleApi21ImplKt.putSize(bundle, component1, (Size) component2);
            } else if (component2 instanceof SizeF) {
                BundleApi21ImplKt.putSizeF(bundle, component1, (SizeF) component2);
            } else {
                throw new IllegalArgumentException("Illegal value type " + component2.getClass().getCanonicalName() + " for key \"" + component1 + k0.f19765b);
            }
        }
        return bundle;
    }

    @l
    public static final Bundle bundleOf() {
        return new Bundle(0);
    }
}
