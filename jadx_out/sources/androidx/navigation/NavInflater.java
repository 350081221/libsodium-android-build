package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.navigation.NavArgument;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavOptions;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.text.e0;
import org.xmlpull.v1.XmlPullParserException;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J(\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J \u0010\u0016\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J0\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\u000b\u001a\u00020\u00182\b\b\u0001\u0010\t\u001a\u00020\bH\u0007R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Landroidx/navigation/NavInflater;", "", "Landroid/content/res/Resources;", "res", "Landroid/content/res/XmlResourceParser;", "parser", "Landroid/util/AttributeSet;", "attrs", "", "graphResId", "Landroidx/navigation/NavDestination;", "inflate", "dest", "Lkotlin/r2;", "inflateArgumentForDestination", "Landroid/os/Bundle;", "bundle", "inflateArgumentForBundle", "Landroid/content/res/TypedArray;", bi.ay, "Landroidx/navigation/NavArgument;", "inflateArgument", "inflateDeepLink", "inflateAction", "Landroidx/navigation/NavGraph;", "Landroid/content/Context;", d.X, "Landroid/content/Context;", "Landroidx/navigation/NavigatorProvider;", "navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "<init>", "(Landroid/content/Context;Landroidx/navigation/NavigatorProvider;)V", "Companion", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nNavInflater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavInflater.kt\nandroidx/navigation/NavInflater\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 4 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,352:1\n1#2:353\n232#3,3:354\n232#3,3:357\n232#3,3:360\n232#3,3:363\n55#4,6:366\n*S KotlinDebug\n*F\n+ 1 NavInflater.kt\nandroidx/navigation/NavInflater\n*L\n109#1:354,3\n127#1:357,3\n142#1:360,3\n247#1:363,3\n284#1:366,6\n*E\n"})
/* loaded from: classes2.dex */
public final class NavInflater {

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String APPLICATION_ID_PLACEHOLDER = "${applicationId}";

    @l
    private static final String TAG_ACTION = "action";

    @l
    private static final String TAG_ARGUMENT = "argument";

    @l
    private static final String TAG_DEEP_LINK = "deepLink";

    @l
    private static final String TAG_INCLUDE = "include";

    @l
    private final Context context;

    @l
    private final NavigatorProvider navigatorProvider;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final ThreadLocal<TypedValue> sTmpValue = new ThreadLocal<>();

    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JE\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0013R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/navigation/NavInflater$Companion;", "", "()V", "APPLICATION_ID_PLACEHOLDER", "", "TAG_ACTION", "TAG_ARGUMENT", "TAG_DEEP_LINK", "TAG_INCLUDE", "sTmpValue", "Ljava/lang/ThreadLocal;", "Landroid/util/TypedValue;", "checkNavType", "Landroidx/navigation/NavType;", t0.b.f22420d, "navType", "expectedNavType", "argType", "foundType", "checkNavType$navigation_runtime_release", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final NavType<?> checkNavType$navigation_runtime_release(@l TypedValue value, @m NavType<?> navType, @l NavType<?> expectedNavType, @m String str, @l String foundType) throws XmlPullParserException {
            l0.p(value, "value");
            l0.p(expectedNavType, "expectedNavType");
            l0.p(foundType, "foundType");
            if (navType != null && navType != expectedNavType) {
                throw new XmlPullParserException("Type is " + str + " but found " + foundType + ": " + value.data);
            }
            if (navType == null) {
                return expectedNavType;
            }
            return navType;
        }
    }

    public NavInflater(@l Context context, @l NavigatorProvider navigatorProvider) {
        l0.p(context, "context");
        l0.p(navigatorProvider, "navigatorProvider");
        this.context = context;
        this.navigatorProvider = navigatorProvider;
    }

    private final void inflateAction(Resources resources, NavDestination navDestination, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i5) throws IOException, XmlPullParserException {
        int depth;
        Context context = this.context;
        int[] NavAction = androidx.navigation.common.R.styleable.NavAction;
        l0.o(NavAction, "NavAction");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NavAction, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_android_id, 0);
        NavAction navAction = new NavAction(obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_destination, 0), null, null, 6, null);
        NavOptions.Builder builder = new NavOptions.Builder();
        builder.setLaunchSingleTop(obtainStyledAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_launchSingleTop, false));
        builder.setRestoreState(obtainStyledAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_restoreState, false));
        builder.setPopUpTo(obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_popUpTo, -1), obtainStyledAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_popUpToInclusive, false), obtainStyledAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_popUpToSaveState, false));
        builder.setEnterAnim(obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_enterAnim, -1));
        builder.setExitAnim(obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_exitAnim, -1));
        builder.setPopEnterAnim(obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_popEnterAnim, -1));
        builder.setPopExitAnim(obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_popExitAnim, -1));
        navAction.setNavOptions(builder.build());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && l0.g(TAG_ARGUMENT, xmlResourceParser.getName())) {
                inflateArgumentForBundle(resources, bundle, attributeSet, i5);
            }
        }
        if (!bundle.isEmpty()) {
            navAction.setDefaultArguments(bundle);
        }
        navDestination.putAction(resourceId, navAction);
        obtainStyledAttributes.recycle();
    }

    private final NavArgument inflateArgument(TypedArray typedArray, Resources resources, int i5) throws XmlPullParserException {
        NavType<Object> navType;
        NavArgument.Builder builder = new NavArgument.Builder();
        boolean z4 = false;
        int i6 = 0;
        builder.setIsNullable(typedArray.getBoolean(androidx.navigation.common.R.styleable.NavArgument_nullable, false));
        ThreadLocal<TypedValue> threadLocal = sTmpValue;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(androidx.navigation.common.R.styleable.NavArgument_argType);
        Object obj = null;
        if (string != null) {
            navType = NavType.Companion.fromArgType(string, resources.getResourcePackageName(i5));
        } else {
            navType = null;
        }
        int i7 = androidx.navigation.common.R.styleable.NavArgument_android_defaultValue;
        if (typedArray.getValue(i7, typedValue)) {
            NavType<Object> navType2 = NavType.ReferenceType;
            if (navType == navType2) {
                int i8 = typedValue.resourceId;
                if (i8 != 0) {
                    i6 = i8;
                } else if (typedValue.type != 16 || typedValue.data != 0) {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + navType.getName() + ". Must be a reference to a resource.");
                }
                obj = Integer.valueOf(i6);
            } else {
                int i9 = typedValue.resourceId;
                if (i9 != 0) {
                    if (navType == null) {
                        navType = navType2;
                        obj = Integer.valueOf(i9);
                    } else {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + navType.getName() + ". You must use a \"" + navType2.getName() + "\" type to reference other resources.");
                    }
                } else if (navType == NavType.StringType) {
                    obj = typedArray.getString(i7);
                } else {
                    int i10 = typedValue.type;
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                if (i10 != 18) {
                                    if (i10 >= 16 && i10 <= 31) {
                                        NavType<Object> navType3 = NavType.FloatType;
                                        if (navType == navType3) {
                                            navType = Companion.checkNavType$navigation_runtime_release(typedValue, navType, navType3, string, "float");
                                            obj = Float.valueOf(typedValue.data);
                                        } else {
                                            navType = Companion.checkNavType$navigation_runtime_release(typedValue, navType, NavType.IntType, string, TypedValues.Custom.S_INT);
                                            obj = Integer.valueOf(typedValue.data);
                                        }
                                    } else {
                                        throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                                    }
                                } else {
                                    navType = Companion.checkNavType$navigation_runtime_release(typedValue, navType, NavType.BoolType, string, "boolean");
                                    if (typedValue.data != 0) {
                                        z4 = true;
                                    }
                                    obj = Boolean.valueOf(z4);
                                }
                            } else {
                                navType = Companion.checkNavType$navigation_runtime_release(typedValue, navType, NavType.IntType, string, TypedValues.Custom.S_DIMENSION);
                                obj = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                            }
                        } else {
                            navType = Companion.checkNavType$navigation_runtime_release(typedValue, navType, NavType.FloatType, string, "float");
                            obj = Float.valueOf(typedValue.getFloat());
                        }
                    } else {
                        String obj2 = typedValue.string.toString();
                        if (navType == null) {
                            navType = NavType.Companion.inferFromValue(obj2);
                        }
                        obj = navType.parseValue(obj2);
                    }
                }
            }
        }
        if (obj != null) {
            builder.setDefaultValue(obj);
        }
        if (navType != null) {
            builder.setType(navType);
        }
        return builder.build();
    }

    private final void inflateArgumentForBundle(Resources resources, Bundle bundle, AttributeSet attributeSet, int i5) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.NavArgument);
        l0.o(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavArgument_android_name);
        if (string != null) {
            l0.o(string, "array.getString(R.stylea…uments must have a name\")");
            NavArgument inflateArgument = inflateArgument(obtainAttributes, resources, i5);
            if (inflateArgument.isDefaultValuePresent()) {
                inflateArgument.putDefaultValue(string, bundle);
            }
            r2 r2Var = r2.f19517a;
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    private final void inflateArgumentForDestination(Resources resources, NavDestination navDestination, AttributeSet attributeSet, int i5) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.NavArgument);
        l0.o(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavArgument_android_name);
        if (string != null) {
            l0.o(string, "array.getString(R.stylea…uments must have a name\")");
            navDestination.addArgument(string, inflateArgument(obtainAttributes, resources, i5));
            r2 r2Var = r2.f19517a;
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    private final void inflateDeepLink(Resources resources, NavDestination navDestination, AttributeSet attributeSet) throws XmlPullParserException {
        boolean z4;
        String i22;
        String i23;
        String i24;
        boolean z5;
        boolean z6;
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.NavDeepLink);
        l0.o(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
        String string = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavDeepLink_uri);
        String string2 = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavDeepLink_action);
        String string3 = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavDeepLink_mimeType);
        boolean z7 = false;
        if (string != null && string.length() != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            if (string2 != null && string2.length() != 0) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (z5) {
                if (string3 != null && string3.length() != 0) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (z6) {
                    throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                }
            }
        }
        NavDeepLink.Builder builder = new NavDeepLink.Builder();
        if (string != null) {
            String packageName = this.context.getPackageName();
            l0.o(packageName, "context.packageName");
            i24 = e0.i2(string, APPLICATION_ID_PLACEHOLDER, packageName, false, 4, null);
            builder.setUriPattern(i24);
        }
        if (string2 == null || string2.length() == 0) {
            z7 = true;
        }
        if (!z7) {
            String packageName2 = this.context.getPackageName();
            l0.o(packageName2, "context.packageName");
            i23 = e0.i2(string2, APPLICATION_ID_PLACEHOLDER, packageName2, false, 4, null);
            builder.setAction(i23);
        }
        if (string3 != null) {
            String packageName3 = this.context.getPackageName();
            l0.o(packageName3, "context.packageName");
            i22 = e0.i2(string3, APPLICATION_ID_PLACEHOLDER, packageName3, false, 4, null);
            builder.setMimeType(i22);
        }
        navDestination.addDeepLink(builder.build());
        r2 r2Var = r2.f19517a;
        obtainAttributes.recycle();
    }

    @l
    @SuppressLint({"ResourceType"})
    public final NavGraph inflate(@NavigationRes int i5) {
        int next;
        Resources res = this.context.getResources();
        XmlResourceParser xml = res.getXml(i5);
        l0.o(xml, "res.getXml(graphResId)");
        AttributeSet attrs = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e5) {
                    throw new RuntimeException("Exception inflating " + res.getResourceName(i5) + " line " + xml.getLineNumber(), e5);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            l0.o(res, "res");
            l0.o(attrs, "attrs");
            NavDestination inflate = inflate(res, xml, attrs, i5);
            if (inflate instanceof NavGraph) {
                return (NavGraph) inflate;
            }
            throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
        }
        throw new XmlPullParserException("No start tag found");
    }

    private final NavDestination inflate(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i5) throws XmlPullParserException, IOException {
        int depth;
        NavigatorProvider navigatorProvider = this.navigatorProvider;
        String name = xmlResourceParser.getName();
        l0.o(name, "parser.name");
        NavDestination createDestination = navigatorProvider.getNavigator(name).createDestination();
        createDestination.onInflate(this.context, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                if (l0.g(TAG_ARGUMENT, name2)) {
                    inflateArgumentForDestination(resources, createDestination, attributeSet, i5);
                } else if (l0.g(TAG_DEEP_LINK, name2)) {
                    inflateDeepLink(resources, createDestination, attributeSet);
                } else if (l0.g("action", name2)) {
                    inflateAction(resources, createDestination, attributeSet, xmlResourceParser, i5);
                } else if (l0.g(TAG_INCLUDE, name2) && (createDestination instanceof NavGraph)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, R.styleable.NavInclude);
                    l0.o(obtainAttributes, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                    ((NavGraph) createDestination).addDestination(inflate(obtainAttributes.getResourceId(R.styleable.NavInclude_graph, 0)));
                    r2 r2Var = r2.f19517a;
                    obtainAttributes.recycle();
                } else if (createDestination instanceof NavGraph) {
                    ((NavGraph) createDestination).addDestination(inflate(resources, xmlResourceParser, attributeSet, i5));
                }
            }
        }
        return createDestination;
    }
}
