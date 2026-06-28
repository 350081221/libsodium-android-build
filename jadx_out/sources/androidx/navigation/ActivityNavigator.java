package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.umeng.analytics.pro.d;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.ranges.u;
import kotlin.sequences.s;
import kotlin.text.e0;
import p4.l;
import p4.m;

@Navigator.Name("activity")
@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0017\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0016\u0017\u0018B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u0002H\u0016J0\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0013\u0010\u0003\u001a\u00020\u00048\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/navigation/ActivityNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/ActivityNavigator$Destination;", d.X, "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "hostActivity", "Landroid/app/Activity;", "createDestination", "navigate", "Landroidx/navigation/NavDestination;", "destination", "args", "Landroid/os/Bundle;", "navOptions", "Landroidx/navigation/NavOptions;", "navigatorExtras", "Landroidx/navigation/Navigator$Extras;", "popBackStack", "", "Companion", "Destination", "Extras", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nActivityNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,531:1\n179#2,2:532\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator\n*L\n48#1:532,2\n*E\n"})
/* loaded from: classes2.dex */
public class ActivityNavigator extends Navigator<Destination> {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final String EXTRA_NAV_CURRENT = "android-support-navigation:ActivityNavigator:current";

    @l
    private static final String EXTRA_NAV_SOURCE = "android-support-navigation:ActivityNavigator:source";

    @l
    private static final String EXTRA_POP_ENTER_ANIM = "android-support-navigation:ActivityNavigator:popEnterAnim";

    @l
    private static final String EXTRA_POP_EXIT_ANIM = "android-support-navigation:ActivityNavigator:popExitAnim";

    @l
    private static final String LOG_TAG = "ActivityNavigator";

    @l
    private final Context context;

    @m
    private final Activity hostActivity;

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f"}, d2 = {"Landroidx/navigation/ActivityNavigator$Companion;", "", "Landroid/app/Activity;", "activity", "Lkotlin/r2;", "applyPopAnimationsToPendingTransition", "", "EXTRA_NAV_CURRENT", "Ljava/lang/String;", "EXTRA_NAV_SOURCE", "EXTRA_POP_ENTER_ANIM", "EXTRA_POP_EXIT_ANIM", "LOG_TAG", "<init>", "()V", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @u3.m
        public final void applyPopAnimationsToPendingTransition(@l Activity activity) {
            l0.p(activity, "activity");
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            int intExtra = intent.getIntExtra(ActivityNavigator.EXTRA_POP_ENTER_ANIM, -1);
            int intExtra2 = intent.getIntExtra(ActivityNavigator.EXTRA_POP_EXIT_ANIM, -1);
            if (intExtra != -1 || intExtra2 != -1) {
                if (intExtra == -1) {
                    intExtra = 0;
                }
                if (intExtra2 == -1) {
                    intExtra2 = 0;
                }
                activity.overridePendingTransition(intExtra, intExtra2);
            }
        }
    }

    @NavDestination.ClassType(Activity.class)
    @i0(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000003¢\u0006\u0004\b5\u00106B\u0011\b\u0016\u0012\u0006\u00108\u001a\u000207¢\u0006\u0004\b5\u00109J\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0017J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\b\u0010\u001b\u001a\u00020\u001aH\u0017J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\u0013\u0010\u001f\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010!\u001a\u00020 H\u0016R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R(\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R(\u0010)\u001a\u0004\u0018\u00010\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u00048F@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R(\u0010+\u001a\u0004\u0018\u00010\u00122\b\u0010\"\u001a\u0004\u0018\u00010\u00128F@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R(\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u00048F@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b/\u0010(R(\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\"\u001a\u0004\u0018\u00010\u00178F@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u00100\u001a\u0004\b1\u00102¨\u0006:"}, d2 = {"Landroidx/navigation/ActivityNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroid/content/Context;", d.X, "", "pattern", "parseApplicationId", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "setIntent", "dataPattern", "setDataPattern", "Landroid/util/AttributeSet;", "attrs", "Lkotlin/r2;", "onInflate", TTDownloadField.TT_PACKAGE_NAME, "setTargetPackage", "Landroid/content/ComponentName;", "name", "setComponentName", "action", "setAction", "Landroid/net/Uri;", "data", "setData", "", "supportsActions", "toString", "", "other", "equals", "", TTDownloadField.TT_HASHCODE, "<set-?>", "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "Ljava/lang/String;", "getDataPattern", "()Ljava/lang/String;", "targetPackage", "getTargetPackage", "component", "Landroid/content/ComponentName;", "getComponent", "()Landroid/content/ComponentName;", "getAction", "Landroid/net/Uri;", "getData", "()Landroid/net/Uri;", "Landroidx/navigation/Navigator;", "activityNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "Landroidx/navigation/NavigatorProvider;", "navigatorProvider", "(Landroidx/navigation/NavigatorProvider;)V", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nActivityNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator$Destination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,531:1\n232#2,3:532\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator$Destination\n*L\n270#1:532,3\n*E\n"})
    /* loaded from: classes2.dex */
    public static class Destination extends NavDestination {

        @m
        private String action;

        @m
        private ComponentName component;

        @m
        private Uri data;

        @m
        private String dataPattern;

        @m
        private Intent intent;

        @m
        private String targetPackage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Destination(@l Navigator<? extends Destination> activityNavigator) {
            super(activityNavigator);
            l0.p(activityNavigator, "activityNavigator");
        }

        private final String parseApplicationId(Context context, String str) {
            String i22;
            if (str != null) {
                String packageName = context.getPackageName();
                l0.o(packageName, "context.packageName");
                i22 = e0.i2(str, NavInflater.APPLICATION_ID_PLACEHOLDER, packageName, false, 4, null);
                return i22;
            }
            return null;
        }

        @Override // androidx.navigation.NavDestination
        public boolean equals(@m Object obj) {
            boolean z4;
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof Destination)) {
                return false;
            }
            if (super.equals(obj)) {
                Intent intent = this.intent;
                if (intent != null) {
                    z4 = intent.filterEquals(((Destination) obj).intent);
                } else if (((Destination) obj).intent == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && l0.g(this.dataPattern, ((Destination) obj).dataPattern)) {
                    return true;
                }
            }
            return false;
        }

        @m
        public final String getAction() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        @m
        public final ComponentName getComponent() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        @m
        public final Uri getData() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @m
        public final String getDataPattern() {
            return this.dataPattern;
        }

        @m
        public final Intent getIntent() {
            return this.intent;
        }

        @m
        public final String getTargetPackage() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getPackage();
            }
            return null;
        }

        @Override // androidx.navigation.NavDestination
        public int hashCode() {
            int i5;
            int hashCode = super.hashCode() * 31;
            Intent intent = this.intent;
            int i6 = 0;
            if (intent != null) {
                i5 = intent.filterHashCode();
            } else {
                i5 = 0;
            }
            int i7 = (hashCode + i5) * 31;
            String str = this.dataPattern;
            if (str != null) {
                i6 = str.hashCode();
            }
            return i7 + i6;
        }

        @Override // androidx.navigation.NavDestination
        @CallSuper
        public void onInflate(@l Context context, @l AttributeSet attrs) {
            l0.p(context, "context");
            l0.p(attrs, "attrs");
            super.onInflate(context, attrs);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, R.styleable.ActivityNavigator);
            l0.o(obtainAttributes, "context.resources.obtain…tyNavigator\n            )");
            setTargetPackage(parseApplicationId(context, obtainAttributes.getString(R.styleable.ActivityNavigator_targetPackage)));
            String string = obtainAttributes.getString(R.styleable.ActivityNavigator_android_name);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                setComponentName(new ComponentName(context, string));
            }
            setAction(obtainAttributes.getString(R.styleable.ActivityNavigator_action));
            String parseApplicationId = parseApplicationId(context, obtainAttributes.getString(R.styleable.ActivityNavigator_data));
            if (parseApplicationId != null) {
                setData(Uri.parse(parseApplicationId));
            }
            setDataPattern(parseApplicationId(context, obtainAttributes.getString(R.styleable.ActivityNavigator_dataPattern)));
            obtainAttributes.recycle();
        }

        @l
        public final Destination setAction(@m String str) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            l0.m(intent);
            intent.setAction(str);
            return this;
        }

        @l
        public final Destination setComponentName(@m ComponentName componentName) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            l0.m(intent);
            intent.setComponent(componentName);
            return this;
        }

        @l
        public final Destination setData(@m Uri uri) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            l0.m(intent);
            intent.setData(uri);
            return this;
        }

        @l
        public final Destination setDataPattern(@m String str) {
            this.dataPattern = str;
            return this;
        }

        @l
        public final Destination setIntent(@m Intent intent) {
            this.intent = intent;
            return this;
        }

        @l
        public final Destination setTargetPackage(@m String str) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            l0.m(intent);
            intent.setPackage(str);
            return this;
        }

        @Override // androidx.navigation.NavDestination
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public boolean supportsActions() {
            return false;
        }

        @Override // androidx.navigation.NavDestination
        @l
        public String toString() {
            ComponentName component = getComponent();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (component != null) {
                sb.append(" class=");
                sb.append(component.getClassName());
            } else {
                String action = getAction();
                if (action != null) {
                    sb.append(" action=");
                    sb.append(action);
                }
            }
            String sb2 = sb.toString();
            l0.o(sb2, "sb.toString()");
            return sb2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Destination(@l NavigatorProvider navigatorProvider) {
            this((Navigator<? extends Destination>) navigatorProvider.getNavigator(ActivityNavigator.class));
            l0.p(navigatorProvider, "navigatorProvider");
        }
    }

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/navigation/ActivityNavigator$Extras;", "Landroidx/navigation/Navigator$Extras;", "flags", "", "activityOptions", "Landroidx/core/app/ActivityOptionsCompat;", "(ILandroidx/core/app/ActivityOptionsCompat;)V", "getActivityOptions", "()Landroidx/core/app/ActivityOptionsCompat;", "getFlags", "()I", "Builder", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Extras implements Navigator.Extras {

        @m
        private final ActivityOptionsCompat activityOptions;
        private final int flags;

        @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/navigation/ActivityNavigator$Extras$Builder;", "", "()V", "activityOptions", "Landroidx/core/app/ActivityOptionsCompat;", "flags", "", "addFlags", "build", "Landroidx/navigation/ActivityNavigator$Extras;", "setActivityOptions", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Builder {

            @m
            private ActivityOptionsCompat activityOptions;
            private int flags;

            @l
            public final Builder addFlags(int i5) {
                this.flags = i5 | this.flags;
                return this;
            }

            @l
            public final Extras build() {
                return new Extras(this.flags, this.activityOptions);
            }

            @l
            public final Builder setActivityOptions(@l ActivityOptionsCompat activityOptions) {
                l0.p(activityOptions, "activityOptions");
                this.activityOptions = activityOptions;
                return this;
            }
        }

        public Extras(int i5, @m ActivityOptionsCompat activityOptionsCompat) {
            this.flags = i5;
            this.activityOptions = activityOptionsCompat;
        }

        @m
        public final ActivityOptionsCompat getActivityOptions() {
            return this.activityOptions;
        }

        public final int getFlags() {
            return this.flags;
        }
    }

    public ActivityNavigator(@l Context context) {
        kotlin.sequences.m l5;
        Object obj;
        l0.p(context, "context");
        this.context = context;
        l5 = s.l(context, ActivityNavigator$hostActivity$1.INSTANCE);
        Iterator it = l5.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.hostActivity = (Activity) obj;
    }

    @u3.m
    public static final void applyPopAnimationsToPendingTransition(@l Activity activity) {
        Companion.applyPopAnimationsToPendingTransition(activity);
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.navigation.Navigator
    public boolean popBackStack() {
        Activity activity = this.hostActivity;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.Navigator
    @l
    public Destination createDestination() {
        return new Destination(this);
    }

    @Override // androidx.navigation.Navigator
    @m
    public NavDestination navigate(@l Destination destination, @m Bundle bundle, @m NavOptions navOptions, @m Navigator.Extras extras) {
        int u4;
        int u5;
        Intent intent;
        int intExtra;
        l0.p(destination, "destination");
        if (destination.getIntent() != null) {
            Intent intent2 = new Intent(destination.getIntent());
            if (bundle != null) {
                intent2.putExtras(bundle);
                String dataPattern = destination.getDataPattern();
                if (!(dataPattern == null || dataPattern.length() == 0)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(dataPattern);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + dataPattern);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z4 = extras instanceof Extras;
            if (z4) {
                intent2.addFlags(((Extras) extras).getFlags());
            }
            if (this.hostActivity == null) {
                intent2.addFlags(268435456);
            }
            if (navOptions != null && navOptions.shouldLaunchSingleTop()) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.hostActivity;
            if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra(EXTRA_NAV_CURRENT, 0)) != 0) {
                intent2.putExtra(EXTRA_NAV_SOURCE, intExtra);
            }
            intent2.putExtra(EXTRA_NAV_CURRENT, destination.getId());
            Resources resources = this.context.getResources();
            if (navOptions != null) {
                int popEnterAnim = navOptions.getPopEnterAnim();
                int popExitAnim = navOptions.getPopExitAnim();
                if ((popEnterAnim > 0 && l0.g(resources.getResourceTypeName(popEnterAnim), "animator")) || (popExitAnim > 0 && l0.g(resources.getResourceTypeName(popExitAnim), "animator"))) {
                    Log.w(LOG_TAG, "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(popEnterAnim) + " and popExit resource " + resources.getResourceName(popExitAnim) + " when launching " + destination);
                } else {
                    intent2.putExtra(EXTRA_POP_ENTER_ANIM, popEnterAnim);
                    intent2.putExtra(EXTRA_POP_EXIT_ANIM, popExitAnim);
                }
            }
            if (z4) {
                ActivityOptionsCompat activityOptions = ((Extras) extras).getActivityOptions();
                if (activityOptions != null) {
                    ContextCompat.startActivity(this.context, intent2, activityOptions.toBundle());
                } else {
                    this.context.startActivity(intent2);
                }
            } else {
                this.context.startActivity(intent2);
            }
            if (navOptions == null || this.hostActivity == null) {
                return null;
            }
            int enterAnim = navOptions.getEnterAnim();
            int exitAnim = navOptions.getExitAnim();
            if ((enterAnim <= 0 || !l0.g(resources.getResourceTypeName(enterAnim), "animator")) && (exitAnim <= 0 || !l0.g(resources.getResourceTypeName(exitAnim), "animator"))) {
                if (enterAnim < 0 && exitAnim < 0) {
                    return null;
                }
                u4 = u.u(enterAnim, 0);
                u5 = u.u(exitAnim, 0);
                this.hostActivity.overridePendingTransition(u4, u5);
                return null;
            }
            Log.w(LOG_TAG, "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(enterAnim) + " and exit resource " + resources.getResourceName(exitAnim) + "when launching " + destination);
            return null;
        }
        throw new IllegalStateException(("Destination " + destination.getId() + " does not have an Intent set.").toString());
    }
}
