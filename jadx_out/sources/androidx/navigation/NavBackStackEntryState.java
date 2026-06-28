package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import u3.e;

@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 (2\u00020\u0001:\u0001(B\u0011\b\u0016\u0012\u0006\u0010#\u001a\u00020\n¢\u0006\u0004\b$\u0010%B\u0011\b\u0016\u0012\u0006\u0010&\u001a\u00020\u000e¢\u0006\u0004\b$\u0010'J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bJ\b\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006)"}, d2 = {"Landroidx/navigation/NavBackStackEntryState;", "Landroid/os/Parcelable;", "Landroid/content/Context;", d.X, "Landroidx/navigation/NavDestination;", "destination", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Landroidx/navigation/NavControllerViewModel;", "viewModel", "Landroidx/navigation/NavBackStackEntry;", "instantiate", "", "describeContents", "Landroid/os/Parcel;", "parcel", "i", "Lkotlin/r2;", "writeToParcel", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "destinationId", "I", "getDestinationId", "()I", "Landroid/os/Bundle;", "args", "Landroid/os/Bundle;", "getArgs", "()Landroid/os/Bundle;", "savedState", "getSavedState", "entry", "<init>", "(Landroidx/navigation/NavBackStackEntry;)V", "inParcel", "(Landroid/os/Parcel;)V", "Companion", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public final class NavBackStackEntryState implements Parcelable {

    @m
    private final Bundle args;
    private final int destinationId;

    @l
    private final String id;

    @l
    private final Bundle savedState;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    @e
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new Parcelable.Creator<NavBackStackEntryState>() { // from class: androidx.navigation.NavBackStackEntryState$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @l
        public NavBackStackEntryState createFromParcel(@l Parcel inParcel) {
            l0.p(inParcel, "inParcel");
            return new NavBackStackEntryState(inParcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @l
        public NavBackStackEntryState[] newArray(int i5) {
            return new NavBackStackEntryState[i5];
        }
    };

    @i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/navigation/NavBackStackEntryState$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Landroidx/navigation/NavBackStackEntryState;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    public NavBackStackEntryState(@l NavBackStackEntry entry) {
        l0.p(entry, "entry");
        this.id = entry.getId();
        this.destinationId = entry.getDestination().getId();
        this.args = entry.getArguments();
        Bundle bundle = new Bundle();
        this.savedState = bundle;
        entry.saveState(bundle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @m
    public final Bundle getArgs() {
        return this.args;
    }

    public final int getDestinationId() {
        return this.destinationId;
    }

    @l
    public final String getId() {
        return this.id;
    }

    @l
    public final Bundle getSavedState() {
        return this.savedState;
    }

    @l
    public final NavBackStackEntry instantiate(@l Context context, @l NavDestination destination, @l Lifecycle.State hostLifecycleState, @m NavControllerViewModel navControllerViewModel) {
        l0.p(context, "context");
        l0.p(destination, "destination");
        l0.p(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.args;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return NavBackStackEntry.Companion.create(context, destination, bundle, hostLifecycleState, navControllerViewModel, this.id, this.savedState);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel, int i5) {
        l0.p(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeInt(this.destinationId);
        parcel.writeBundle(this.args);
        parcel.writeBundle(this.savedState);
    }

    public NavBackStackEntryState(@l Parcel inParcel) {
        l0.p(inParcel, "inParcel");
        String readString = inParcel.readString();
        l0.m(readString);
        this.id = readString;
        this.destinationId = inParcel.readInt();
        this.args = inParcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Bundle readBundle = inParcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        l0.m(readBundle);
        this.savedState = readBundle;
    }
}
