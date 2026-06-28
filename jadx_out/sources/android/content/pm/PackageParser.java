package android.content.pm;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.IntentFilter;
import android.os.Bundle;
import java.io.File;
import java.security.cert.CertificateException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class PackageParser {
    public static final int PARSE_COLLECT_CERTIFICATES = 32;
    public static final int PARSE_ENFORCE_CODE = 64;
    public static final int PARSE_IS_SYSTEM = 1;
    public static final int PARSE_IS_SYSTEM_DIR = 16;

    /* loaded from: classes.dex */
    public static final class Activity extends Component<ActivityIntentInfo> {
        public ActivityInfo info;
    }

    /* loaded from: classes.dex */
    public class ActivityIntentInfo extends IntentInfo {
        public Activity activity;

        public ActivityIntentInfo() {
        }
    }

    /* loaded from: classes.dex */
    public static class ApkLite {
        public String codePath;
        public boolean coreApp;
        public boolean extractNativeLibs;
        public int installLocation;
        public boolean multiArch;
        public String packageName;
        public Signature[] signatures;
        public String splitName;
        public boolean use32bitAbi;
        public int versionCode;
    }

    @TargetApi(28)
    /* loaded from: classes.dex */
    public static class Builder {
        private Signature[] mSignatures;

        public SigningDetails build() throws CertificateException {
            return new SigningDetails();
        }

        public Builder setSignatures(Signature[] signatureArr) {
            this.mSignatures = signatureArr;
            return this;
        }
    }

    @TargetApi(29)
    /* loaded from: classes.dex */
    public interface Callback {
    }

    @TargetApi(29)
    /* loaded from: classes.dex */
    public static final class CallbackImpl implements Callback {
        public CallbackImpl(PackageManager packageManager) {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: classes.dex */
    public static class Component<II extends IntentInfo> {
        public String className;
        public ArrayList<II> intents;
        public Bundle metaData;
        public Package owner;

        public ComponentName getComponentName() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public final class Instrumentation extends Component<IntentInfo> {
        public InstrumentationInfo info;

        public Instrumentation() {
        }
    }

    /* loaded from: classes.dex */
    public static class IntentInfo extends IntentFilter {
        public int banner;
        public boolean hasDefault;
        public int icon;
        public int labelRes;
        public int logo;
        public CharSequence nonLocalizedLabel;
    }

    /* loaded from: classes.dex */
    public class Package {
        public ApplicationInfo applicationInfo;
        public Bundle mAppMetaData;
        public Object mExtras;
        public int mPreferredOrder;
        public String mSharedUserId;
        public int mSharedUserLabel;
        public Signature[] mSignatures;
        public SigningDetails mSigningDetails;
        public int mVersionCode;
        public String mVersionName;
        public String packageName;
        public boolean use32bitAbi;
        public ArrayList<String> usesLibraries;
        public ArrayList<String> usesOptionalLibraries;
        public final ArrayList<Activity> activities = new ArrayList<>(0);
        public final ArrayList<Activity> receivers = new ArrayList<>(0);
        public final ArrayList<Provider> providers = new ArrayList<>(0);
        public final ArrayList<Service> services = new ArrayList<>(0);
        public final ArrayList<Instrumentation> instrumentation = new ArrayList<>(0);
        public final ArrayList<Permission> permissions = new ArrayList<>(0);
        public final ArrayList<PermissionGroup> permissionGroups = new ArrayList<>(0);
        public final ArrayList<String> requestedPermissions = new ArrayList<>();
        public ArrayList<ConfigurationInfo> configPreferences = null;
        public ArrayList<FeatureInfo> reqFeatures = null;

        public Package() {
        }
    }

    /* loaded from: classes.dex */
    public final class Permission extends Component<IntentInfo> {
        public PermissionInfo info;

        public Permission() {
        }
    }

    /* loaded from: classes.dex */
    public final class PermissionGroup extends Component<IntentInfo> {
        public PermissionGroupInfo info;

        public PermissionGroup() {
        }
    }

    /* loaded from: classes.dex */
    public final class Provider extends Component<ProviderIntentInfo> {
        public ProviderInfo info;

        public Provider() {
        }
    }

    /* loaded from: classes.dex */
    public class ProviderIntentInfo extends IntentInfo {
        public Provider provider;

        public ProviderIntentInfo() {
        }
    }

    /* loaded from: classes.dex */
    public final class Service extends Component<ServiceIntentInfo> {
        public ServiceInfo info;

        public Service() {
        }
    }

    /* loaded from: classes.dex */
    public class ServiceIntentInfo extends IntentInfo {
        public Service service;

        public ServiceIntentInfo() {
        }
    }

    @TargetApi(28)
    /* loaded from: classes.dex */
    public static final class SigningDetails {
        public static final SigningDetails UNKNOWN = null;
        public Signature[] pastSigningCertificates;
        public Signature[] signatures;
    }

    public static ApkLite parseApkLite(File file, int i5) throws PackageParserException {
        throw new RuntimeException("Stub!");
    }

    @TargetApi(29)
    public void setCallback(Callback callback) {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: classes.dex */
    public static class PackageParserException extends Exception {
        public final int error;

        public PackageParserException(int i5, String str) {
            super(str);
            this.error = i5;
        }

        public PackageParserException(int i5, String str, Throwable th) {
            super(str, th);
            this.error = i5;
        }
    }
}
