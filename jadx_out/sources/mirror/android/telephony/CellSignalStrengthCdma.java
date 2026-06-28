package mirror.android.telephony;

import android.annotation.TargetApi;
import mirror.RefClass;
import mirror.RefConstructor;
import mirror.RefInt;

@TargetApi(17)
/* loaded from: classes4.dex */
public class CellSignalStrengthCdma {
    public static Class<?> TYPE = RefClass.load(CellSignalStrengthCdma.class, (Class<?>) android.telephony.CellSignalStrengthCdma.class);
    public static RefConstructor<android.telephony.CellSignalStrengthCdma> ctor;
    public static RefInt mCdmaDbm;
    public static RefInt mCdmaEcio;
    public static RefInt mEvdoDbm;
    public static RefInt mEvdoEcio;
    public static RefInt mEvdoSnr;
}
