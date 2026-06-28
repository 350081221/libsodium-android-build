package com.lody.virtual.server.pm.parser;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ConfigurationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageParser;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.SharedLibraryInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import mirror.android.content.pm.ApplicationInfoP;

/* loaded from: classes3.dex */
public class VPackage implements Parcelable {
    public static final Parcelable.Creator<VPackage> CREATOR = new Parcelable.Creator<VPackage>() { // from class: com.lody.virtual.server.pm.parser.VPackage.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VPackage createFromParcel(Parcel parcel) {
            return new VPackage(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VPackage[] newArray(int i5) {
            return new VPackage[i5];
        }
    };
    public ArrayList<ActivityComponent> activities;
    public ApplicationInfo applicationInfo;
    public ArrayList<ConfigurationInfo> configPreferences;
    public ArrayList<InstrumentationComponent> instrumentation;
    public Bundle mAppMetaData;
    public Object mExtras;
    public int mPreferredOrder;
    public String mSharedUserId;
    public int mSharedUserLabel;
    public Signature[] mSignatures;
    public PackageParser.SigningDetails mSigningDetails;
    public int mVersionCode;
    public String mVersionName;
    public String packageName;
    public ArrayList<PermissionGroupComponent> permissionGroups;
    public ArrayList<PermissionComponent> permissions;
    public ArrayList<String> protectedBroadcasts;
    public ArrayList<ProviderComponent> providers;
    public ArrayList<ActivityComponent> receivers;
    public ArrayList<FeatureInfo> reqFeatures;
    public ArrayList<String> requestedPermissions;
    public ArrayList<ServiceComponent> services;
    public ArrayList<SharedLibraryInfo> sharedLibraryInfos;
    public ArrayList<String> splitNames;
    public ArrayList<String> usesLibraries;
    public ArrayList<String> usesOptionalLibraries;

    /* loaded from: classes3.dex */
    public static class ActivityIntentInfo extends IntentInfo {
        public ActivityComponent activity;

        public ActivityIntentInfo(PackageParser.IntentInfo intentInfo) {
            super(intentInfo);
        }

        protected ActivityIntentInfo(Parcel parcel) {
            super(parcel);
        }
    }

    /* loaded from: classes3.dex */
    public static class Component<II extends IntentInfo> {
        public String className;
        private ComponentName componentName;
        public ArrayList<II> intents;
        public Bundle metaData;
        public VPackage owner;

        protected Component() {
        }

        public ComponentName getComponentName() {
            ComponentName componentName = this.componentName;
            if (componentName != null) {
                return componentName;
            }
            if (this.className != null) {
                this.componentName = new ComponentName(this.owner.packageName, this.className);
            }
            return this.componentName;
        }

        public Component(PackageParser.Component component) {
            this.className = component.className;
            this.metaData = component.metaData;
        }
    }

    /* loaded from: classes3.dex */
    public static class ProviderIntentInfo extends IntentInfo {
        public ProviderComponent provider;

        public ProviderIntentInfo(PackageParser.IntentInfo intentInfo) {
            super(intentInfo);
        }

        protected ProviderIntentInfo(Parcel parcel) {
            super(parcel);
        }
    }

    /* loaded from: classes3.dex */
    public static class ServiceIntentInfo extends IntentInfo {
        public ServiceComponent service;

        public ServiceIntentInfo(PackageParser.IntentInfo intentInfo) {
            super(intentInfo);
        }

        protected ServiceIntentInfo(Parcel parcel) {
            super(parcel);
        }
    }

    public VPackage() {
        this.configPreferences = null;
        this.reqFeatures = null;
        this.splitNames = null;
        this.sharedLibraryInfos = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        parcel.writeInt(this.activities.size());
        Iterator<ActivityComponent> it = this.activities.iterator();
        while (true) {
            int i12 = 0;
            if (!it.hasNext()) {
                break;
            }
            ActivityComponent next = it.next();
            parcel.writeParcelable(next.info, 0);
            parcel.writeString(next.className);
            parcel.writeBundle(next.metaData);
            ArrayList<II> arrayList = next.intents;
            if (arrayList != 0) {
                i12 = arrayList.size();
            }
            parcel.writeInt(i12);
            ArrayList<II> arrayList2 = next.intents;
            if (arrayList2 != 0) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((ActivityIntentInfo) it2.next()).writeToParcel(parcel, i5);
                }
            }
        }
        parcel.writeInt(this.receivers.size());
        Iterator<ActivityComponent> it3 = this.receivers.iterator();
        while (it3.hasNext()) {
            ActivityComponent next2 = it3.next();
            parcel.writeParcelable(next2.info, 0);
            parcel.writeString(next2.className);
            parcel.writeBundle(next2.metaData);
            ArrayList<II> arrayList3 = next2.intents;
            if (arrayList3 != 0) {
                i11 = arrayList3.size();
            } else {
                i11 = 0;
            }
            parcel.writeInt(i11);
            ArrayList<II> arrayList4 = next2.intents;
            if (arrayList4 != 0) {
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    ((ActivityIntentInfo) it4.next()).writeToParcel(parcel, i5);
                }
            }
        }
        parcel.writeInt(this.providers.size());
        Iterator<ProviderComponent> it5 = this.providers.iterator();
        while (it5.hasNext()) {
            ProviderComponent next3 = it5.next();
            parcel.writeParcelable(next3.info, 0);
            parcel.writeString(next3.className);
            parcel.writeBundle(next3.metaData);
            ArrayList<II> arrayList5 = next3.intents;
            if (arrayList5 != 0) {
                i10 = arrayList5.size();
            } else {
                i10 = 0;
            }
            parcel.writeInt(i10);
            ArrayList<II> arrayList6 = next3.intents;
            if (arrayList6 != 0) {
                Iterator it6 = arrayList6.iterator();
                while (it6.hasNext()) {
                    ((ProviderIntentInfo) it6.next()).writeToParcel(parcel, i5);
                }
            }
        }
        parcel.writeInt(this.services.size());
        Iterator<ServiceComponent> it7 = this.services.iterator();
        while (it7.hasNext()) {
            ServiceComponent next4 = it7.next();
            parcel.writeParcelable(next4.info, 0);
            parcel.writeString(next4.className);
            parcel.writeBundle(next4.metaData);
            ArrayList<II> arrayList7 = next4.intents;
            if (arrayList7 != 0) {
                i9 = arrayList7.size();
            } else {
                i9 = 0;
            }
            parcel.writeInt(i9);
            ArrayList<II> arrayList8 = next4.intents;
            if (arrayList8 != 0) {
                Iterator it8 = arrayList8.iterator();
                while (it8.hasNext()) {
                    ((ServiceIntentInfo) it8.next()).writeToParcel(parcel, i5);
                }
            }
        }
        parcel.writeInt(this.instrumentation.size());
        Iterator<InstrumentationComponent> it9 = this.instrumentation.iterator();
        while (it9.hasNext()) {
            InstrumentationComponent next5 = it9.next();
            parcel.writeParcelable(next5.info, 0);
            parcel.writeString(next5.className);
            parcel.writeBundle(next5.metaData);
            ArrayList<II> arrayList9 = next5.intents;
            if (arrayList9 != 0) {
                i8 = arrayList9.size();
            } else {
                i8 = 0;
            }
            parcel.writeInt(i8);
            ArrayList<II> arrayList10 = next5.intents;
            if (arrayList10 != 0) {
                Iterator it10 = arrayList10.iterator();
                while (it10.hasNext()) {
                    ((IntentInfo) it10.next()).writeToParcel(parcel, i5);
                }
            }
        }
        parcel.writeInt(this.permissions.size());
        Iterator<PermissionComponent> it11 = this.permissions.iterator();
        while (it11.hasNext()) {
            PermissionComponent next6 = it11.next();
            parcel.writeParcelable(next6.info, 0);
            parcel.writeString(next6.className);
            parcel.writeBundle(next6.metaData);
            ArrayList<II> arrayList11 = next6.intents;
            if (arrayList11 != 0) {
                i7 = arrayList11.size();
            } else {
                i7 = 0;
            }
            parcel.writeInt(i7);
            ArrayList<II> arrayList12 = next6.intents;
            if (arrayList12 != 0) {
                Iterator it12 = arrayList12.iterator();
                while (it12.hasNext()) {
                    ((IntentInfo) it12.next()).writeToParcel(parcel, i5);
                }
            }
        }
        parcel.writeInt(this.permissionGroups.size());
        Iterator<PermissionGroupComponent> it13 = this.permissionGroups.iterator();
        while (it13.hasNext()) {
            PermissionGroupComponent next7 = it13.next();
            parcel.writeParcelable(next7.info, 0);
            parcel.writeString(next7.className);
            parcel.writeBundle(next7.metaData);
            ArrayList<II> arrayList13 = next7.intents;
            if (arrayList13 != 0) {
                i6 = arrayList13.size();
            } else {
                i6 = 0;
            }
            parcel.writeInt(i6);
            ArrayList<II> arrayList14 = next7.intents;
            if (arrayList14 != 0) {
                Iterator it14 = arrayList14.iterator();
                while (it14.hasNext()) {
                    ((IntentInfo) it14.next()).writeToParcel(parcel, i5);
                }
            }
        }
        parcel.writeStringList(this.requestedPermissions);
        parcel.writeStringList(this.protectedBroadcasts);
        parcel.writeParcelable(this.applicationInfo, i5);
        parcel.writeBundle(this.mAppMetaData);
        parcel.writeString(this.packageName);
        parcel.writeInt(this.mPreferredOrder);
        parcel.writeString(this.mVersionName);
        parcel.writeString(this.mSharedUserId);
        parcel.writeStringList(this.usesLibraries);
        parcel.writeStringList(this.usesOptionalLibraries);
        parcel.writeInt(this.mVersionCode);
        parcel.writeInt(this.mSharedUserLabel);
        parcel.writeTypedList(this.configPreferences);
        parcel.writeTypedList(this.reqFeatures);
        parcel.writeStringList(this.splitNames);
        if (ApplicationInfoP.sharedLibraryInfos != null) {
            parcel.writeTypedList(this.sharedLibraryInfos);
        }
    }

    /* loaded from: classes3.dex */
    public static class InstrumentationComponent extends Component<IntentInfo> {
        public InstrumentationInfo info;

        public InstrumentationComponent(PackageParser.Instrumentation instrumentation) {
            super(instrumentation);
            this.info = instrumentation.info;
        }

        protected InstrumentationComponent(Parcel parcel) {
            this.info = (InstrumentationInfo) parcel.readParcelable(ActivityInfo.class.getClassLoader());
            this.className = parcel.readString();
            this.metaData = parcel.readBundle(Bundle.class.getClassLoader());
            int readInt = parcel.readInt();
            this.intents = new ArrayList<>(readInt);
            while (true) {
                int i5 = readInt - 1;
                if (readInt <= 0) {
                    return;
                }
                this.intents.add(new IntentInfo(parcel));
                readInt = i5;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class PermissionComponent extends Component<IntentInfo> {
        public PermissionInfo info;

        public PermissionComponent(PackageParser.Permission permission) {
            super(permission);
            this.info = permission.info;
        }

        protected PermissionComponent(Parcel parcel) {
            this.info = (PermissionInfo) parcel.readParcelable(ActivityInfo.class.getClassLoader());
            this.className = parcel.readString();
            this.metaData = parcel.readBundle(Bundle.class.getClassLoader());
            int readInt = parcel.readInt();
            this.intents = new ArrayList<>(readInt);
            while (true) {
                int i5 = readInt - 1;
                if (readInt <= 0) {
                    return;
                }
                this.intents.add(new IntentInfo(parcel));
                readInt = i5;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class PermissionGroupComponent extends Component<IntentInfo> {
        public PermissionGroupInfo info;

        public PermissionGroupComponent(PackageParser.PermissionGroup permissionGroup) {
            super(permissionGroup);
            this.info = permissionGroup.info;
        }

        protected PermissionGroupComponent(Parcel parcel) {
            this.info = (PermissionGroupInfo) parcel.readParcelable(ActivityInfo.class.getClassLoader());
            this.className = parcel.readString();
            this.metaData = parcel.readBundle(Bundle.class.getClassLoader());
            int readInt = parcel.readInt();
            this.intents = new ArrayList<>(readInt);
            while (true) {
                int i5 = readInt - 1;
                if (readInt <= 0) {
                    return;
                }
                this.intents.add(new IntentInfo(parcel));
                readInt = i5;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class ActivityComponent extends Component<ActivityIntentInfo> {
        public ActivityInfo info;

        public ActivityComponent(PackageParser.Activity activity) {
            super(activity);
            if (activity.intents != null) {
                this.intents = new ArrayList<>(activity.intents.size());
                Iterator it = activity.intents.iterator();
                while (it.hasNext()) {
                    this.intents.add(new ActivityIntentInfo((PackageParser.IntentInfo) it.next()));
                }
            }
            this.info = activity.info;
        }

        protected ActivityComponent(Parcel parcel) {
            this.info = (ActivityInfo) parcel.readParcelable(ActivityInfo.class.getClassLoader());
            this.className = parcel.readString();
            this.metaData = parcel.readBundle(Bundle.class.getClassLoader());
            int readInt = parcel.readInt();
            this.intents = new ArrayList<>(readInt);
            while (true) {
                int i5 = readInt - 1;
                if (readInt <= 0) {
                    return;
                }
                this.intents.add(new ActivityIntentInfo(parcel));
                readInt = i5;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class ProviderComponent extends Component<ProviderIntentInfo> {
        public ProviderInfo info;

        public ProviderComponent(PackageParser.Provider provider) {
            super(provider);
            if (provider.intents != null) {
                this.intents = new ArrayList<>(provider.intents.size());
                Iterator it = provider.intents.iterator();
                while (it.hasNext()) {
                    this.intents.add(new ProviderIntentInfo((PackageParser.IntentInfo) it.next()));
                }
            }
            this.info = provider.info;
        }

        protected ProviderComponent(Parcel parcel) {
            this.info = (ProviderInfo) parcel.readParcelable(ActivityInfo.class.getClassLoader());
            this.className = parcel.readString();
            this.metaData = parcel.readBundle(Bundle.class.getClassLoader());
            int readInt = parcel.readInt();
            this.intents = new ArrayList<>(readInt);
            while (true) {
                int i5 = readInt - 1;
                if (readInt <= 0) {
                    return;
                }
                this.intents.add(new ProviderIntentInfo(parcel));
                readInt = i5;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class ServiceComponent extends Component<ServiceIntentInfo> {
        public ServiceInfo info;

        public ServiceComponent(PackageParser.Service service) {
            super(service);
            if (service.intents != null) {
                this.intents = new ArrayList<>(service.intents.size());
                Iterator it = service.intents.iterator();
                while (it.hasNext()) {
                    this.intents.add(new ServiceIntentInfo((PackageParser.IntentInfo) it.next()));
                }
            }
            this.info = service.info;
        }

        protected ServiceComponent(Parcel parcel) {
            this.info = (ServiceInfo) parcel.readParcelable(ActivityInfo.class.getClassLoader());
            this.className = parcel.readString();
            this.metaData = parcel.readBundle(Bundle.class.getClassLoader());
            int readInt = parcel.readInt();
            this.intents = new ArrayList<>(readInt);
            while (true) {
                int i5 = readInt - 1;
                if (readInt <= 0) {
                    return;
                }
                this.intents.add(new ServiceIntentInfo(parcel));
                readInt = i5;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public VPackage(Parcel parcel) {
        this.configPreferences = null;
        this.reqFeatures = null;
        this.splitNames = null;
        this.sharedLibraryInfos = null;
        int readInt = parcel.readInt();
        this.activities = new ArrayList<>(readInt);
        while (true) {
            int i5 = readInt - 1;
            if (readInt <= 0) {
                break;
            }
            this.activities.add(new ActivityComponent(parcel));
            readInt = i5;
        }
        int readInt2 = parcel.readInt();
        this.receivers = new ArrayList<>(readInt2);
        while (true) {
            int i6 = readInt2 - 1;
            if (readInt2 <= 0) {
                break;
            }
            this.receivers.add(new ActivityComponent(parcel));
            readInt2 = i6;
        }
        int readInt3 = parcel.readInt();
        this.providers = new ArrayList<>(readInt3);
        while (true) {
            int i7 = readInt3 - 1;
            if (readInt3 <= 0) {
                break;
            }
            this.providers.add(new ProviderComponent(parcel));
            readInt3 = i7;
        }
        int readInt4 = parcel.readInt();
        this.services = new ArrayList<>(readInt4);
        while (true) {
            int i8 = readInt4 - 1;
            if (readInt4 <= 0) {
                break;
            }
            this.services.add(new ServiceComponent(parcel));
            readInt4 = i8;
        }
        int readInt5 = parcel.readInt();
        this.instrumentation = new ArrayList<>(readInt5);
        while (true) {
            int i9 = readInt5 - 1;
            if (readInt5 <= 0) {
                break;
            }
            this.instrumentation.add(new InstrumentationComponent(parcel));
            readInt5 = i9;
        }
        int readInt6 = parcel.readInt();
        this.permissions = new ArrayList<>(readInt6);
        while (true) {
            int i10 = readInt6 - 1;
            if (readInt6 <= 0) {
                break;
            }
            this.permissions.add(new PermissionComponent(parcel));
            readInt6 = i10;
        }
        int readInt7 = parcel.readInt();
        this.permissionGroups = new ArrayList<>(readInt7);
        while (true) {
            int i11 = readInt7 - 1;
            if (readInt7 <= 0) {
                break;
            }
            this.permissionGroups.add(new PermissionGroupComponent(parcel));
            readInt7 = i11;
        }
        this.requestedPermissions = parcel.createStringArrayList();
        this.protectedBroadcasts = parcel.createStringArrayList();
        this.applicationInfo = (ApplicationInfo) parcel.readParcelable(ApplicationInfo.class.getClassLoader());
        this.mAppMetaData = parcel.readBundle(Bundle.class.getClassLoader());
        this.packageName = parcel.readString();
        this.mPreferredOrder = parcel.readInt();
        this.mVersionName = parcel.readString();
        this.mSharedUserId = parcel.readString();
        this.usesLibraries = parcel.createStringArrayList();
        this.usesOptionalLibraries = parcel.createStringArrayList();
        this.mVersionCode = parcel.readInt();
        this.mSharedUserLabel = parcel.readInt();
        this.configPreferences = parcel.createTypedArrayList(ConfigurationInfo.CREATOR);
        this.reqFeatures = parcel.createTypedArrayList(FeatureInfo.CREATOR);
        this.splitNames = parcel.createStringArrayList();
        if (ApplicationInfoP.sharedLibraryInfos != null) {
            this.sharedLibraryInfos = parcel.createTypedArrayList(SharedLibraryInfo.CREATOR);
        }
    }

    /* loaded from: classes3.dex */
    public static class IntentInfo implements Parcelable {
        public static final Parcelable.Creator<IntentInfo> CREATOR = new Parcelable.Creator<IntentInfo>() { // from class: com.lody.virtual.server.pm.parser.VPackage.IntentInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public IntentInfo createFromParcel(Parcel parcel) {
                return new IntentInfo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public IntentInfo[] newArray(int i5) {
                return new IntentInfo[i5];
            }
        };
        public int banner;
        public IntentFilter filter;
        public boolean hasDefault;
        public int icon;
        public int labelRes;
        public int logo;
        public String nonLocalizedLabel;

        public IntentInfo(PackageParser.IntentInfo intentInfo) {
            this.filter = intentInfo;
            this.hasDefault = intentInfo.hasDefault;
            this.labelRes = intentInfo.labelRes;
            CharSequence charSequence = intentInfo.nonLocalizedLabel;
            if (charSequence != null) {
                this.nonLocalizedLabel = charSequence.toString();
            }
            this.icon = intentInfo.icon;
            this.logo = intentInfo.logo;
            this.banner = intentInfo.banner;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            parcel.writeParcelable(this.filter, i5);
            parcel.writeByte(this.hasDefault ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.labelRes);
            parcel.writeString(this.nonLocalizedLabel);
            parcel.writeInt(this.icon);
            parcel.writeInt(this.logo);
            parcel.writeInt(this.banner);
        }

        protected IntentInfo(Parcel parcel) {
            this.filter = (IntentFilter) parcel.readParcelable(VPackage.class.getClassLoader());
            this.hasDefault = parcel.readByte() != 0;
            this.labelRes = parcel.readInt();
            this.nonLocalizedLabel = parcel.readString();
            this.icon = parcel.readInt();
            this.logo = parcel.readInt();
            this.banner = parcel.readInt();
        }
    }
}
