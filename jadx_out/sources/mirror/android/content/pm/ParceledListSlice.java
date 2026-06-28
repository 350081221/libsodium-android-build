package mirror.android.content.pm;

import android.os.Parcelable;
import java.util.List;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefConstructor;
import mirror.RefMethod;
import mirror.RefStaticObject;

/* loaded from: classes4.dex */
public class ParceledListSlice {
    public static RefStaticObject<Parcelable.Creator> CREATOR;
    public static Class<?> TYPE = RefClass.load((Class<?>) ParceledListSlice.class, "android.content.pm.ParceledListSlice");
    public static RefMethod<Boolean> append;
    public static RefConstructor<Parcelable> ctor;

    @MethodParams({List.class})
    public static RefConstructor<Parcelable> ctorQ;
    public static RefMethod<List<?>> getList;
    public static RefMethod<Boolean> isLastSlice;
    public static RefMethod<Parcelable> populateList;
    public static RefMethod<Void> setLastSlice;
}
