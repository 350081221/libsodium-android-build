package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.IdRes;
import androidx.navigation.ActivityNavigator;
import com.umeng.analytics.pro.d;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.k;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0017\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0001\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(B\u0019\b\u0016\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010)\u001a\u00020\u0007¢\u0006\u0004\b'\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR,\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000f\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\rR$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\t\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\r¨\u0006+"}, d2 = {"Landroidx/navigation/ActivityNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/ActivityNavigator$Destination;", "build", "Landroid/content/Context;", d.X, "Landroid/content/Context;", "", "targetPackage", "Ljava/lang/String;", "getTargetPackage", "()Ljava/lang/String;", "setTargetPackage", "(Ljava/lang/String;)V", "Lkotlin/reflect/d;", "Landroid/app/Activity;", "activityClass", "Lkotlin/reflect/d;", "getActivityClass", "()Lkotlin/reflect/d;", "setActivityClass", "(Lkotlin/reflect/d;)V", "action", "getAction", "setAction", "Landroid/net/Uri;", "data", "Landroid/net/Uri;", "getData", "()Landroid/net/Uri;", "setData", "(Landroid/net/Uri;)V", "dataPattern", "getDataPattern", "setDataPattern", "Landroidx/navigation/ActivityNavigator;", "navigator", "", "id", "<init>", "(Landroidx/navigation/ActivityNavigator;I)V", "route", "(Landroidx/navigation/ActivityNavigator;Ljava/lang/String;)V", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
@NavDestinationDsl
/* loaded from: classes2.dex */
public final class ActivityNavigatorDestinationBuilder extends NavDestinationBuilder<ActivityNavigator.Destination> {

    @m
    private String action;

    @m
    private kotlin.reflect.d<? extends Activity> activityClass;

    @l
    private Context context;

    @m
    private Uri data;

    @m
    private String dataPattern;

    @m
    private String targetPackage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @k(message = "Use routes to create your ActivityNavigatorDestinationBuilder instead", replaceWith = @b1(expression = "ActivityNavigatorDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public ActivityNavigatorDestinationBuilder(@l ActivityNavigator navigator, @IdRes int i5) {
        super(navigator, i5);
        l0.p(navigator, "navigator");
        this.context = navigator.getContext();
    }

    @m
    public final String getAction() {
        return this.action;
    }

    @m
    public final kotlin.reflect.d<? extends Activity> getActivityClass() {
        return this.activityClass;
    }

    @m
    public final Uri getData() {
        return this.data;
    }

    @m
    public final String getDataPattern() {
        return this.dataPattern;
    }

    @m
    public final String getTargetPackage() {
        return this.targetPackage;
    }

    public final void setAction(@m String str) {
        this.action = str;
    }

    public final void setActivityClass(@m kotlin.reflect.d<? extends Activity> dVar) {
        this.activityClass = dVar;
    }

    public final void setData(@m Uri uri) {
        this.data = uri;
    }

    public final void setDataPattern(@m String str) {
        this.dataPattern = str;
    }

    public final void setTargetPackage(@m String str) {
        this.targetPackage = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.NavDestinationBuilder
    @l
    public ActivityNavigator.Destination build() {
        ActivityNavigator.Destination destination = (ActivityNavigator.Destination) super.build();
        destination.setTargetPackage(this.targetPackage);
        kotlin.reflect.d<? extends Activity> dVar = this.activityClass;
        if (dVar != null) {
            destination.setComponentName(new ComponentName(this.context, (Class<?>) u3.a.e(dVar)));
        }
        destination.setAction(this.action);
        destination.setData(this.data);
        destination.setDataPattern(this.dataPattern);
        return destination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNavigatorDestinationBuilder(@l ActivityNavigator navigator, @l String route) {
        super(navigator, route);
        l0.p(navigator, "navigator");
        l0.p(route, "route");
        this.context = navigator.getContext();
    }
}
