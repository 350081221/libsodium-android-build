package com.lody.virtual.remote;

import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import mirror.RefConstructor;
import mirror.android.content.BroadcastReceiver;

/* loaded from: classes3.dex */
public class PendingResultData implements Parcelable {
    public static final Parcelable.Creator<PendingResultData> CREATOR = new Parcelable.Creator<PendingResultData>() { // from class: com.lody.virtual.remote.PendingResultData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PendingResultData createFromParcel(Parcel parcel) {
            return new PendingResultData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PendingResultData[] newArray(int i5) {
            return new PendingResultData[i5];
        }
    };
    public boolean mAbortBroadcast;
    public boolean mFinished;
    public int mFlags;
    public boolean mInitialStickyHint;
    public boolean mOrderedHint;
    public int mResultCode;
    public String mResultData;
    public Bundle mResultExtras;
    public int mSendingUser;
    public IBinder mToken;
    public int mType;

    public PendingResultData(BroadcastReceiver.PendingResult pendingResult) {
        if (BroadcastReceiver.PendingResultMNC.ctor != null) {
            this.mType = BroadcastReceiver.PendingResultMNC.mType.get(pendingResult);
            this.mOrderedHint = BroadcastReceiver.PendingResultMNC.mOrderedHint.get(pendingResult);
            this.mInitialStickyHint = BroadcastReceiver.PendingResultMNC.mInitialStickyHint.get(pendingResult);
            this.mToken = BroadcastReceiver.PendingResultMNC.mToken.get(pendingResult);
            this.mSendingUser = BroadcastReceiver.PendingResultMNC.mSendingUser.get(pendingResult);
            this.mFlags = BroadcastReceiver.PendingResultMNC.mFlags.get(pendingResult);
            this.mResultCode = BroadcastReceiver.PendingResultMNC.mResultCode.get(pendingResult);
            this.mResultData = BroadcastReceiver.PendingResultMNC.mResultData.get(pendingResult);
            this.mResultExtras = BroadcastReceiver.PendingResultMNC.mResultExtras.get(pendingResult);
            this.mAbortBroadcast = BroadcastReceiver.PendingResultMNC.mAbortBroadcast.get(pendingResult);
            this.mFinished = BroadcastReceiver.PendingResultMNC.mFinished.get(pendingResult);
            return;
        }
        if (BroadcastReceiver.PendingResultJBMR1.ctor != null) {
            this.mType = BroadcastReceiver.PendingResultJBMR1.mType.get(pendingResult);
            this.mOrderedHint = BroadcastReceiver.PendingResultJBMR1.mOrderedHint.get(pendingResult);
            this.mInitialStickyHint = BroadcastReceiver.PendingResultJBMR1.mInitialStickyHint.get(pendingResult);
            this.mToken = BroadcastReceiver.PendingResultJBMR1.mToken.get(pendingResult);
            this.mSendingUser = BroadcastReceiver.PendingResultJBMR1.mSendingUser.get(pendingResult);
            this.mResultCode = BroadcastReceiver.PendingResultJBMR1.mResultCode.get(pendingResult);
            this.mResultData = BroadcastReceiver.PendingResultJBMR1.mResultData.get(pendingResult);
            this.mResultExtras = BroadcastReceiver.PendingResultJBMR1.mResultExtras.get(pendingResult);
            this.mAbortBroadcast = BroadcastReceiver.PendingResultJBMR1.mAbortBroadcast.get(pendingResult);
            this.mFinished = BroadcastReceiver.PendingResultJBMR1.mFinished.get(pendingResult);
            return;
        }
        this.mType = BroadcastReceiver.PendingResult.mType.get(pendingResult);
        this.mOrderedHint = BroadcastReceiver.PendingResult.mOrderedHint.get(pendingResult);
        this.mInitialStickyHint = BroadcastReceiver.PendingResult.mInitialStickyHint.get(pendingResult);
        this.mToken = BroadcastReceiver.PendingResult.mToken.get(pendingResult);
        this.mResultCode = BroadcastReceiver.PendingResult.mResultCode.get(pendingResult);
        this.mResultData = BroadcastReceiver.PendingResult.mResultData.get(pendingResult);
        this.mResultExtras = BroadcastReceiver.PendingResult.mResultExtras.get(pendingResult);
        this.mAbortBroadcast = BroadcastReceiver.PendingResult.mAbortBroadcast.get(pendingResult);
        this.mFinished = BroadcastReceiver.PendingResult.mFinished.get(pendingResult);
    }

    public BroadcastReceiver.PendingResult build() {
        RefConstructor<BroadcastReceiver.PendingResult> refConstructor = BroadcastReceiver.PendingResultMNC.ctor;
        if (refConstructor != null) {
            return refConstructor.newInstance(Integer.valueOf(this.mResultCode), this.mResultData, this.mResultExtras, Integer.valueOf(this.mType), Boolean.valueOf(this.mOrderedHint), Boolean.valueOf(this.mInitialStickyHint), this.mToken, Integer.valueOf(this.mSendingUser), Integer.valueOf(this.mFlags));
        }
        RefConstructor<BroadcastReceiver.PendingResult> refConstructor2 = BroadcastReceiver.PendingResultJBMR1.ctor;
        if (refConstructor2 != null) {
            return refConstructor2.newInstance(Integer.valueOf(this.mResultCode), this.mResultData, this.mResultExtras, Integer.valueOf(this.mType), Boolean.valueOf(this.mOrderedHint), Boolean.valueOf(this.mInitialStickyHint), this.mToken, Integer.valueOf(this.mSendingUser));
        }
        return BroadcastReceiver.PendingResult.ctor.newInstance(Integer.valueOf(this.mResultCode), this.mResultData, this.mResultExtras, Integer.valueOf(this.mType), Boolean.valueOf(this.mOrderedHint), Boolean.valueOf(this.mInitialStickyHint), this.mToken);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void finish() {
        try {
            build().finish();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.mType);
        parcel.writeByte(this.mOrderedHint ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mInitialStickyHint ? (byte) 1 : (byte) 0);
        parcel.writeStrongBinder(this.mToken);
        parcel.writeInt(this.mSendingUser);
        parcel.writeInt(this.mFlags);
        parcel.writeInt(this.mResultCode);
        parcel.writeString(this.mResultData);
        parcel.writeBundle(this.mResultExtras);
        parcel.writeByte(this.mAbortBroadcast ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mFinished ? (byte) 1 : (byte) 0);
    }

    protected PendingResultData(Parcel parcel) {
        this.mType = parcel.readInt();
        this.mOrderedHint = parcel.readByte() != 0;
        this.mInitialStickyHint = parcel.readByte() != 0;
        this.mToken = parcel.readStrongBinder();
        this.mSendingUser = parcel.readInt();
        this.mFlags = parcel.readInt();
        this.mResultCode = parcel.readInt();
        this.mResultData = parcel.readString();
        this.mResultExtras = parcel.readBundle();
        this.mAbortBroadcast = parcel.readByte() != 0;
        this.mFinished = parcel.readByte() != 0;
    }
}
