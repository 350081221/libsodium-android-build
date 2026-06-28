package mirror.android.telephony;

import android.annotation.TargetApi;
import mirror.RefClass;
import mirror.RefConstructor;
import mirror.RefInt;

@TargetApi(17)
/* loaded from: classes4.dex */
public class CellIdentityGsm {
    public static Class<?> TYPE = RefClass.load(CellIdentityGsm.class, (Class<?>) android.telephony.CellIdentityGsm.class);
    public static RefConstructor<android.telephony.CellIdentityGsm> ctor;
    public static RefInt mCid;
    public static RefInt mLac;
    public static RefInt mMcc;
    public static RefInt mMnc;
}
