package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new Parcelable.Creator<BackStackRecordState>() { // from class: androidx.fragment.app.BackStackRecordState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BackStackRecordState[] newArray(int i5) {
            return new BackStackRecordState[i5];
        }
    };
    private static final String TAG = "FragmentManager";
    final int mBreadCrumbShortTitleRes;
    final CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final CharSequence mBreadCrumbTitleText;
    final int[] mCurrentMaxLifecycleStates;
    final ArrayList<String> mFragmentWhos;
    final int mIndex;
    final String mName;
    final int[] mOldMaxLifecycleStates;
    final int[] mOps;
    final boolean mReorderingAllowed;
    final ArrayList<String> mSharedElementSourceNames;
    final ArrayList<String> mSharedElementTargetNames;
    final int mTransition;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BackStackRecordState(BackStackRecord backStackRecord) {
        int size = backStackRecord.mOps.size();
        this.mOps = new int[size * 6];
        if (backStackRecord.mAddToBackStack) {
            this.mFragmentWhos = new ArrayList<>(size);
            this.mOldMaxLifecycleStates = new int[size];
            this.mCurrentMaxLifecycleStates = new int[size];
            int i5 = 0;
            int i6 = 0;
            while (i5 < size) {
                FragmentTransaction.Op op = backStackRecord.mOps.get(i5);
                int i7 = i6 + 1;
                this.mOps[i6] = op.mCmd;
                ArrayList<String> arrayList = this.mFragmentWhos;
                Fragment fragment = op.mFragment;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.mOps;
                int i8 = i7 + 1;
                iArr[i7] = op.mFromExpandedOp ? 1 : 0;
                int i9 = i8 + 1;
                iArr[i8] = op.mEnterAnim;
                int i10 = i9 + 1;
                iArr[i9] = op.mExitAnim;
                int i11 = i10 + 1;
                iArr[i10] = op.mPopEnterAnim;
                iArr[i11] = op.mPopExitAnim;
                this.mOldMaxLifecycleStates[i5] = op.mOldMaxState.ordinal();
                this.mCurrentMaxLifecycleStates[i5] = op.mCurrentMaxState.ordinal();
                i5++;
                i6 = i11 + 1;
            }
            this.mTransition = backStackRecord.mTransition;
            this.mName = backStackRecord.mName;
            this.mIndex = backStackRecord.mIndex;
            this.mBreadCrumbTitleRes = backStackRecord.mBreadCrumbTitleRes;
            this.mBreadCrumbTitleText = backStackRecord.mBreadCrumbTitleText;
            this.mBreadCrumbShortTitleRes = backStackRecord.mBreadCrumbShortTitleRes;
            this.mBreadCrumbShortTitleText = backStackRecord.mBreadCrumbShortTitleText;
            this.mSharedElementSourceNames = backStackRecord.mSharedElementSourceNames;
            this.mSharedElementTargetNames = backStackRecord.mSharedElementTargetNames;
            this.mReorderingAllowed = backStackRecord.mReorderingAllowed;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    private void fillInBackStackRecord(@NonNull BackStackRecord backStackRecord) {
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean z4 = true;
            if (i5 < this.mOps.length) {
                FragmentTransaction.Op op = new FragmentTransaction.Op();
                int i7 = i5 + 1;
                op.mCmd = this.mOps[i5];
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "Instantiate " + backStackRecord + " op #" + i6 + " base fragment #" + this.mOps[i7]);
                }
                op.mOldMaxState = Lifecycle.State.values()[this.mOldMaxLifecycleStates[i6]];
                op.mCurrentMaxState = Lifecycle.State.values()[this.mCurrentMaxLifecycleStates[i6]];
                int[] iArr = this.mOps;
                int i8 = i7 + 1;
                if (iArr[i7] == 0) {
                    z4 = false;
                }
                op.mFromExpandedOp = z4;
                int i9 = i8 + 1;
                int i10 = iArr[i8];
                op.mEnterAnim = i10;
                int i11 = i9 + 1;
                int i12 = iArr[i9];
                op.mExitAnim = i12;
                int i13 = i11 + 1;
                int i14 = iArr[i11];
                op.mPopEnterAnim = i14;
                int i15 = iArr[i13];
                op.mPopExitAnim = i15;
                backStackRecord.mEnterAnim = i10;
                backStackRecord.mExitAnim = i12;
                backStackRecord.mPopEnterAnim = i14;
                backStackRecord.mPopExitAnim = i15;
                backStackRecord.addOp(op);
                i6++;
                i5 = i13 + 1;
            } else {
                backStackRecord.mTransition = this.mTransition;
                backStackRecord.mName = this.mName;
                backStackRecord.mAddToBackStack = true;
                backStackRecord.mBreadCrumbTitleRes = this.mBreadCrumbTitleRes;
                backStackRecord.mBreadCrumbTitleText = this.mBreadCrumbTitleText;
                backStackRecord.mBreadCrumbShortTitleRes = this.mBreadCrumbShortTitleRes;
                backStackRecord.mBreadCrumbShortTitleText = this.mBreadCrumbShortTitleText;
                backStackRecord.mSharedElementSourceNames = this.mSharedElementSourceNames;
                backStackRecord.mSharedElementTargetNames = this.mSharedElementTargetNames;
                backStackRecord.mReorderingAllowed = this.mReorderingAllowed;
                return;
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public BackStackRecord instantiate(@NonNull FragmentManager fragmentManager) {
        BackStackRecord backStackRecord = new BackStackRecord(fragmentManager);
        fillInBackStackRecord(backStackRecord);
        backStackRecord.mIndex = this.mIndex;
        for (int i5 = 0; i5 < this.mFragmentWhos.size(); i5++) {
            String str = this.mFragmentWhos.get(i5);
            if (str != null) {
                backStackRecord.mOps.get(i5).mFragment = fragmentManager.findActiveFragment(str);
            }
        }
        backStackRecord.bumpBackStackNesting(1);
        return backStackRecord;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeIntArray(this.mOps);
        parcel.writeStringList(this.mFragmentWhos);
        parcel.writeIntArray(this.mOldMaxLifecycleStates);
        parcel.writeIntArray(this.mCurrentMaxLifecycleStates);
        parcel.writeInt(this.mTransition);
        parcel.writeString(this.mName);
        parcel.writeInt(this.mIndex);
        parcel.writeInt(this.mBreadCrumbTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbTitleText, parcel, 0);
        parcel.writeInt(this.mBreadCrumbShortTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbShortTitleText, parcel, 0);
        parcel.writeStringList(this.mSharedElementSourceNames);
        parcel.writeStringList(this.mSharedElementTargetNames);
        parcel.writeInt(this.mReorderingAllowed ? 1 : 0);
    }

    @NonNull
    public BackStackRecord instantiate(@NonNull FragmentManager fragmentManager, @NonNull Map<String, Fragment> map) {
        BackStackRecord backStackRecord = new BackStackRecord(fragmentManager);
        fillInBackStackRecord(backStackRecord);
        for (int i5 = 0; i5 < this.mFragmentWhos.size(); i5++) {
            String str = this.mFragmentWhos.get(i5);
            if (str != null) {
                Fragment fragment = map.get(str);
                if (fragment != null) {
                    backStackRecord.mOps.get(i5).mFragment = fragment;
                } else {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.mName + " failed due to missing saved state for Fragment (" + str + ")");
                }
            }
        }
        return backStackRecord;
    }

    BackStackRecordState(Parcel parcel) {
        this.mOps = parcel.createIntArray();
        this.mFragmentWhos = parcel.createStringArrayList();
        this.mOldMaxLifecycleStates = parcel.createIntArray();
        this.mCurrentMaxLifecycleStates = parcel.createIntArray();
        this.mTransition = parcel.readInt();
        this.mName = parcel.readString();
        this.mIndex = parcel.readInt();
        this.mBreadCrumbTitleRes = parcel.readInt();
        this.mBreadCrumbTitleText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mBreadCrumbShortTitleRes = parcel.readInt();
        this.mBreadCrumbShortTitleText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mSharedElementSourceNames = parcel.createStringArrayList();
        this.mSharedElementTargetNames = parcel.createStringArrayList();
        this.mReorderingAllowed = parcel.readInt() != 0;
    }
}
