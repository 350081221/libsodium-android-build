package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class DataLoaderParamsParcel implements Parcelable {
    public static final Parcelable.Creator<DataLoaderParamsParcel> CREATOR = new Parcelable.Creator<DataLoaderParamsParcel>() { // from class: android.content.pm.DataLoaderParamsParcel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DataLoaderParamsParcel createFromParcel(Parcel parcel) {
            DataLoaderParamsParcel dataLoaderParamsParcel = new DataLoaderParamsParcel();
            dataLoaderParamsParcel.readFromParcel(parcel);
            return dataLoaderParamsParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DataLoaderParamsParcel[] newArray(int i5) {
            return new DataLoaderParamsParcel[i5];
        }
    };
    public String arguments;
    public String className;
    public String packageName;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void readFromParcel(Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return;
        }
        try {
            this.packageName = parcel.readString();
            if (parcel.dataPosition() - dataPosition < readInt) {
                this.className = parcel.readString();
                if (parcel.dataPosition() - dataPosition < readInt) {
                    this.arguments = parcel.readString();
                    if (parcel.dataPosition() - dataPosition < readInt) {
                    }
                }
            }
        } finally {
            parcel.setDataPosition(dataPosition + readInt);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeString(this.packageName);
        parcel.writeString(this.className);
        parcel.writeString(this.arguments);
        int dataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition2 - dataPosition);
        parcel.setDataPosition(dataPosition2);
    }
}
