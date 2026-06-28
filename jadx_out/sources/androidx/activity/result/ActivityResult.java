package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import u3.e;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0015B\u0011\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Landroidx/activity/result/ActivityResult;", "Landroid/os/Parcelable;", "", "toString", "Landroid/os/Parcel;", "dest", "", "flags", "Lkotlin/r2;", "writeToParcel", "describeContents", "resultCode", "I", "getResultCode", "()I", "Landroid/content/Intent;", "data", "Landroid/content/Intent;", "getData", "()Landroid/content/Intent;", "<init>", "(ILandroid/content/Intent;)V", "parcel", "(Landroid/os/Parcel;)V", "Companion", "activity_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ActivityResult implements Parcelable {

    @m
    private final Intent data;
    private final int resultCode;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    @e
    public static final Parcelable.Creator<ActivityResult> CREATOR = new Parcelable.Creator<ActivityResult>() { // from class: androidx.activity.result.ActivityResult$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @l
        public ActivityResult createFromParcel(@l Parcel parcel) {
            l0.p(parcel, "parcel");
            return new ActivityResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @l
        public ActivityResult[] newArray(int i5) {
            return new ActivityResult[i5];
        }
    };

    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002¨\u0006\u000b"}, d2 = {"Landroidx/activity/result/ActivityResult$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Landroidx/activity/result/ActivityResult;", "getCREATOR$annotations", "resultCodeToString", "", "resultCode", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }

        @l
        @u3.m
        public final String resultCodeToString(int i5) {
            return i5 != -1 ? i5 != 0 ? String.valueOf(i5) : "RESULT_CANCELED" : "RESULT_OK";
        }
    }

    public ActivityResult(int i5, @m Intent intent) {
        this.resultCode = i5;
        this.data = intent;
    }

    @l
    @u3.m
    public static final String resultCodeToString(int i5) {
        return Companion.resultCodeToString(i5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @m
    public final Intent getData() {
        return this.data;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    @l
    public String toString() {
        return "ActivityResult{resultCode=" + Companion.resultCodeToString(this.resultCode) + ", data=" + this.data + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@l Parcel dest, int i5) {
        int i6;
        l0.p(dest, "dest");
        dest.writeInt(this.resultCode);
        if (this.data == null) {
            i6 = 0;
        } else {
            i6 = 1;
        }
        dest.writeInt(i6);
        Intent intent = this.data;
        if (intent != null) {
            intent.writeToParcel(dest, i5);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityResult(@l Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        l0.p(parcel, "parcel");
    }
}
