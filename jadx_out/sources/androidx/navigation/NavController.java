package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavControllerViewModel;
import androidx.navigation.NavDeepLinkRequest;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.b0;
import kotlin.collections.c0;
import kotlin.collections.k;
import kotlin.collections.p;
import kotlin.f0;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.jvm.internal.w;
import kotlin.q1;
import kotlin.r2;
import kotlin.sequences.s;
import kotlin.sequences.u;
import kotlinx.coroutines.flow.d0;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.t0;
import kotlinx.coroutines.flow.v0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000ä\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0016\u0018\u0000 æ\u00012\u00020\u0001:\u0006æ\u0001ç\u0001è\u0001B\u0011\u0012\u0006\u0010v\u001a\u00020u¢\u0006\u0006\bä\u0001\u0010å\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J[\u0010\u0014\u001a\u00020\u0005*\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2#\b\u0002\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00050\u000fH\u0002JI\u0010\u0018\u001a\u00020\u0005*\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162#\b\u0002\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00050\u000fH\u0002J$\u0010\u0018\u001a\u00020\u00162\b\b\u0001\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0003J \u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J2\u0010 \u001a\u00020\u00162\u0010\u0010\u001e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\t2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J*\u0010$\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002J\u0012\u0010%\u001a\u00020\u00162\b\b\u0001\u0010\u001a\u001a\u00020\u0019H\u0003J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cH\u0003J\b\u0010&\u001a\u00020\u0016H\u0002J\b\u0010'\u001a\u00020\u0016H\u0002J\b\u0010(\u001a\u00020\u0016H\u0002J\u0012\u0010+\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010)H\u0003J\u0012\u0010.\u001a\u0004\u0018\u00010\u001c2\u0006\u0010-\u001a\u00020,H\u0002J\u0018\u0010/\u001a\u0004\u0018\u00010\b*\u00020\b2\b\b\u0001\u0010\u001a\u001a\u00020\u0019H\u0002J.\u00102\u001a\u00020\u00052\u0006\u00100\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u00010)2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0003J\u001a\u00103\u001a\u00020\u00162\u0006\u00100\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u00010)H\u0002J.\u00105\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u00192\b\u00101\u001a\u0004\u0018\u00010)2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u00105\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J4\u00106\u001a\u00020\u00162\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\b\u00101\u001a\u0004\u0018\u00010)2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u001e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!H\u0002J2\u0010;\u001a\u00020\u00052\u0006\u00100\u001a\u00020\b2\b\u00109\u001a\u0004\u0018\u00010)2\u0006\u0010\u0012\u001a\u00020\u00022\u000e\b\u0002\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0002J\b\u0010<\u001a\u00020\u0005H\u0002J\u0019\u0010?\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b=\u0010>J\u0010\u0010B\u001a\u00020\u00052\u0006\u0010A\u001a\u00020@H\u0016J\u0010\u0010C\u001a\u00020\u00052\u0006\u0010A\u001a\u00020@H\u0016J\b\u0010D\u001a\u00020\u0016H\u0017J\u001a\u0010D\u001a\u00020\u00162\b\b\u0001\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0017J\"\u0010D\u001a\u00020\u00162\b\b\u0001\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0017J\"\u0010D\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007J%\u0010I\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00022\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00050EH\u0000¢\u0006\u0004\bG\u0010HJ\u0010\u0010J\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cH\u0007J\u0012\u0010J\u001a\u00020\u00162\b\b\u0001\u0010\u001a\u001a\u00020\u0019H\u0007J\b\u0010K\u001a\u00020\u0016H\u0017J\u000f\u0010N\u001a\u00020\u0005H\u0000¢\u0006\u0004\bL\u0010MJ\u0015\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0000¢\u0006\u0004\bO\u0010PJ\u0012\u0010S\u001a\u00020\u00052\b\b\u0001\u0010R\u001a\u00020\u0019H\u0017J\u001c\u0010S\u001a\u00020\u00052\b\b\u0001\u0010R\u001a\u00020\u00192\b\u0010*\u001a\u0004\u0018\u00010)H\u0017J\u001a\u0010S\u001a\u00020\u00052\u0006\u0010U\u001a\u00020T2\b\u0010*\u001a\u0004\u0018\u00010)H\u0017J\u0012\u0010X\u001a\u00020\u00162\b\u0010W\u001a\u0004\u0018\u00010VH\u0017J\u0014\u0010/\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u001a\u001a\u00020\u0019H\u0007J\u0012\u0010/\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007J\u0012\u00102\u001a\u00020\u00052\b\b\u0001\u0010Y\u001a\u00020\u0019H\u0017J\u001c\u00102\u001a\u00020\u00052\b\b\u0001\u0010Y\u001a\u00020\u00192\b\u00101\u001a\u0004\u0018\u00010)H\u0017J&\u00102\u001a\u00020\u00052\b\b\u0001\u0010Y\u001a\u00020\u00192\b\u00101\u001a\u0004\u0018\u00010)2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017J0\u00102\u001a\u00020\u00052\b\b\u0001\u0010Y\u001a\u00020\u00192\b\u00101\u001a\u0004\u0018\u00010)2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017J\u0010\u00102\u001a\u00020\u00052\u0006\u0010-\u001a\u00020ZH\u0017J\u001a\u00102\u001a\u00020\u00052\u0006\u0010-\u001a\u00020Z2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017J$\u00102\u001a\u00020\u00052\u0006\u0010-\u001a\u00020Z2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017J\u0010\u00102\u001a\u00020\u00052\u0006\u0010\\\u001a\u00020[H\u0017J\u001a\u00102\u001a\u00020\u00052\u0006\u0010\\\u001a\u00020[2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017J$\u00102\u001a\u00020\u00052\u0006\u0010\\\u001a\u00020[2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017J\u0010\u00102\u001a\u00020\u00052\u0006\u0010^\u001a\u00020]H\u0017J\u001a\u00102\u001a\u00020\u00052\u0006\u0010^\u001a\u00020]2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017J\u0018\u00102\u001a\u00020\u00052\u0006\u0010^\u001a\u00020]2\u0006\u0010\u000e\u001a\u00020\rH\u0017J)\u00102\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0017\u0010a\u001a\u0013\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\u0002\b`H\u0007J(\u00102\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J\b\u0010c\u001a\u00020bH\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010)H\u0017J\u0012\u0010e\u001a\u00020\u00052\b\u0010d\u001a\u0004\u0018\u00010)H\u0017J\u0010\u0010h\u001a\u00020\u00052\u0006\u0010g\u001a\u00020fH\u0017J\u0010\u0010k\u001a\u00020\u00052\u0006\u0010j\u001a\u00020iH\u0017J\u0010\u0010m\u001a\u00020\u00052\u0006\u0010l\u001a\u00020\u0016H\u0017J\u0010\u0010p\u001a\u00020\u00052\u0006\u0010o\u001a\u00020nH\u0017J\u0012\u0010s\u001a\u00020r2\b\b\u0001\u0010q\u001a\u00020\u0019H\u0016J\u0012\u0010t\u001a\u00020\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0019H\u0016J\u000e\u0010t\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cR\u0017\u0010v\u001a\u00020u8\u0007¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u0018\u0010{\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010~\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R#\u0010\u0086\u0001\u001a\f\u0012\u0005\u0012\u00030\u0085\u0001\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001d\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020!8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R$\u0010\u008d\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R,\u0010\u0090\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u008f\u00018GX\u0087\u0004¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R$\u0010\u0094\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u008e\u0001R)\u0010\u0095\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u008f\u00018\u0006¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0091\u0001\u001a\u0006\b\u0096\u0001\u0010\u0093\u0001R$\u0010\u0098\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R%\u0010\u009b\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030\u009a\u00010\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0099\u0001R&\u0010\u009c\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0099\u0001R*\u0010\u009d\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0099\u0001R\u001b\u0010\u009e\u0001\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001b\u0010 \u0001\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u001c\u0010£\u0001\u001a\u0005\u0018\u00010¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001e\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020@0¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R*\u0010©\u0001\u001a\u00030¨\u00018@@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R\u0018\u0010°\u0001\u001a\u00030¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0018\u0010³\u0001\u001a\u00030²\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u0019\u0010µ\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010\u0089\u0001R\u001a\u0010·\u0001\u001a\u00030¶\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R1\u0010º\u0001\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\t\u0012\u00070¹\u0001R\u00020\u00000\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010\u0099\u0001R6\u0010»\u0001\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R6\u0010½\u0001\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¼\u0001R$\u0010¾\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010\u0099\u0001R\u0019\u0010¿\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u001e\u0010Â\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020Á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R \u0010È\u0001\u001a\u00020}8VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u001e\u0010Ê\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020É\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R#\u0010Í\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020Ì\u00018\u0006¢\u0006\u0010\n\u0006\bÍ\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u0017\u0010Ó\u0001\u001a\u00020\u00198BX\u0082\u0004¢\u0006\b\u001a\u0006\bÑ\u0001\u0010Ò\u0001R'\u0010U\u001a\u00020T2\u0006\u0010U\u001a\u00020T8W@WX\u0096\u000e¢\u0006\u000f\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0005\bS\u0010Ö\u0001R,\u0010×\u0001\u001a\u00030¶\u00012\b\u0010×\u0001\u001a\u00030¶\u00018V@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\bØ\u0001\u0010Ù\u0001\"\u0006\bÚ\u0001\u0010Û\u0001R\u0019\u0010Þ\u0001\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÜ\u0001\u0010Ý\u0001R\u0019\u0010á\u0001\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bß\u0001\u0010à\u0001R\u0019\u0010ã\u0001\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bâ\u0001\u0010à\u0001¨\u0006é\u0001"}, d2 = {"Landroidx/navigation/NavController;", "", "Landroidx/navigation/NavBackStackEntry;", "child", "parent", "Lkotlin/r2;", "linkChildToParent", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "", "entries", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "backStackEntry", "handler", "navigateInternal", "popUpTo", "", "saveState", "popBackStackInternal", "", "destinationId", "inclusive", "", "route", "popOperations", "foundDestination", "executePopOperations", "Lkotlin/collections/k;", "Landroidx/navigation/NavBackStackEntryState;", "savedState", "popEntryFromBackStack", "clearBackStackInternal", "tryRelaunchUpToExplicitStack", "tryRelaunchUpToGeneratedStack", "dispatchOnDestinationChanged", "Landroid/os/Bundle;", "startDestinationArgs", "onGraphCreated", "", "deepLink", "findInvalidDestinationDisplayNameInDeepLink", "findDestination", "node", "args", "navigate", "launchSingleTopInternal", "id", "restoreStateInternal", "executeRestoreState", "backStackState", "instantiateBackStack", "finalArgs", "restoredEntries", "addEntryToBackStack", "updateOnBackPressedCallbackEnabled", "unlinkChildFromParent$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;)Landroidx/navigation/NavBackStackEntry;", "unlinkChildFromParent", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "listener", "addOnDestinationChangedListener", "removeOnDestinationChangedListener", "popBackStack", "Lkotlin/Function0;", "onComplete", "popBackStackFromNavigator$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;Lv3/a;)V", "popBackStackFromNavigator", "clearBackStack", "navigateUp", "updateBackStackLifecycle$navigation_runtime_release", "()V", "updateBackStackLifecycle", "populateVisibleEntries$navigation_runtime_release", "()Ljava/util/List;", "populateVisibleEntries", "graphResId", "setGraph", "Landroidx/navigation/NavGraph;", "graph", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "handleDeepLink", "resId", "Landroid/net/Uri;", "Landroidx/navigation/NavDeepLinkRequest;", "request", "Landroidx/navigation/NavDirections;", "directions", "Landroidx/navigation/NavOptionsBuilder;", "Lkotlin/u;", "builder", "Landroidx/navigation/NavDeepLinkBuilder;", "createDeepLink", "navState", "restoreState", "Landroidx/lifecycle/LifecycleOwner;", "owner", "setLifecycleOwner", "Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "setOnBackPressedDispatcher", "enabled", "enableOnBackPressed", "Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "setViewModelStore", "navGraphId", "Landroidx/lifecycle/ViewModelStoreOwner;", "getViewModelStoreOwner", "getBackStackEntry", "Landroid/content/Context;", d.X, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "Landroidx/navigation/NavInflater;", "inflater", "Landroidx/navigation/NavInflater;", "_graph", "Landroidx/navigation/NavGraph;", "navigatorStateToRestore", "Landroid/os/Bundle;", "", "Landroid/os/Parcelable;", "backStackToRestore", "[Landroid/os/Parcelable;", "deepLinkHandled", "Z", "backQueue", "Lkotlin/collections/k;", "Lkotlinx/coroutines/flow/e0;", "_currentBackStack", "Lkotlinx/coroutines/flow/e0;", "Lkotlinx/coroutines/flow/t0;", "currentBackStack", "Lkotlinx/coroutines/flow/t0;", "getCurrentBackStack", "()Lkotlinx/coroutines/flow/t0;", "_visibleEntries", "visibleEntries", "getVisibleEntries", "", "childToParentEntries", "Ljava/util/Map;", "Ljava/util/concurrent/atomic/AtomicInteger;", "parentToChildCount", "backStackMap", "backStackStates", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onBackPressedDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "Landroidx/navigation/NavControllerViewModel;", "viewModel", "Landroidx/navigation/NavControllerViewModel;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onDestinationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "getHostLifecycleState$navigation_runtime_release", "()Landroidx/lifecycle/Lifecycle$State;", "setHostLifecycleState$navigation_runtime_release", "(Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/lifecycle/LifecycleObserver;", "lifecycleObserver", "Landroidx/lifecycle/LifecycleObserver;", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "enableOnBackPressedCallback", "Landroidx/navigation/NavigatorProvider;", "_navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "Landroidx/navigation/NavController$NavControllerNavigatorState;", "navigatorState", "addToBackStackHandler", "Lv3/l;", "popFromBackStackHandler", "entrySavedState", "dispatchReentrantCount", "I", "", "backStackEntriesToDispatch", "Ljava/util/List;", "navInflater$delegate", "Lkotlin/d0;", "getNavInflater", "()Landroidx/navigation/NavInflater;", "navInflater", "Lkotlinx/coroutines/flow/d0;", "_currentBackStackEntryFlow", "Lkotlinx/coroutines/flow/d0;", "Lkotlinx/coroutines/flow/i;", "currentBackStackEntryFlow", "Lkotlinx/coroutines/flow/i;", "getCurrentBackStackEntryFlow", "()Lkotlinx/coroutines/flow/i;", "getDestinationCountOnBackStack", "()I", "destinationCountOnBackStack", "getGraph", "()Landroidx/navigation/NavGraph;", "(Landroidx/navigation/NavGraph;)V", "navigatorProvider", "getNavigatorProvider", "()Landroidx/navigation/NavigatorProvider;", "setNavigatorProvider", "(Landroidx/navigation/NavigatorProvider;)V", "getCurrentDestination", "()Landroidx/navigation/NavDestination;", "currentDestination", "getCurrentBackStackEntry", "()Landroidx/navigation/NavBackStackEntry;", "currentBackStackEntry", "getPreviousBackStackEntry", "previousBackStackEntry", "<init>", "(Landroid/content/Context;)V", "Companion", "NavControllerNavigatorState", "OnDestinationChangedListener", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 7 Uri.kt\nandroidx/core/net/UriKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,2604:1\n179#2,2:2605\n1295#2,2:2615\n1295#2,2:2617\n179#2,2:2736\n1#3:2607\n150#4:2608\n533#5,6:2609\n1855#5,2:2619\n1855#5,2:2621\n1855#5,2:2623\n1855#5,2:2625\n1864#5,3:2627\n1774#5,4:2630\n1855#5:2634\n766#5:2635\n857#5,2:2636\n1856#5:2638\n766#5:2639\n857#5,2:2640\n766#5:2642\n857#5,2:2643\n1855#5,2:2645\n1855#5:2647\n1789#5,3:2648\n1856#5:2651\n819#5:2659\n847#5,2:2660\n1855#5:2662\n1856#5:2670\n1855#5,2:2671\n1855#5,2:2673\n378#5,7:2675\n1855#5,2:2682\n1855#5,2:2684\n819#5:2686\n847#5,2:2687\n1855#5,2:2689\n1855#5,2:2691\n533#5,6:2693\n533#5,6:2699\n533#5,6:2705\n1855#5,2:2711\n1855#5,2:2713\n1864#5,3:2716\n1855#5,2:2722\n533#5,6:2724\n533#5,6:2730\n361#6,7:2652\n361#6,7:2663\n29#7:2715\n13674#8,3:2719\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController\n*L\n77#1:2605,2\n664#1:2615,2\n683#1:2617,2\n2512#1:2736,2\n162#1:2608\n606#1:2609,6\n810#1:2619,2\n815#1:2621,2\n823#1:2623,2\n827#1:2625,2\n909#1:2627,3\n969#1:2630,4\n1111#1:2634\n1112#1:2635\n1112#1:2636,2\n1111#1:2638\n1119#1:2639\n1119#1:2640,2\n1123#1:2642\n1123#1:2643,2\n1192#1:2645,2\n1208#1:2647\n1211#1:2648,3\n1208#1:2651\n1275#1:2659\n1275#1:2660,2\n1275#1:2662\n1275#1:2670\n1833#1:2671,2\n1878#1:2673,2\n1898#1:2675,7\n1911#1:2682,2\n1921#1:2684,2\n1989#1:2686\n1989#1:2687,2\n1992#1:2689,2\n2034#1:2691,2\n2076#1:2693,6\n2101#1:2699,6\n2128#1:2705,6\n2138#1:2711,2\n2154#1:2713,2\n2299#1:2716,3\n2342#1:2722,2\n2447#1:2724,6\n2469#1:2730,6\n1261#1:2652,7\n1276#1:2663,7\n2226#1:2715\n2337#1:2719,3\n*E\n"})
/* loaded from: classes2.dex */
public class NavController {

    @l
    private static final String KEY_BACK_STACK = "android-support-nav:controller:backStack";

    @l
    private static final String KEY_BACK_STACK_DEST_IDS = "android-support-nav:controller:backStackDestIds";

    @l
    private static final String KEY_BACK_STACK_IDS = "android-support-nav:controller:backStackIds";

    @l
    private static final String KEY_BACK_STACK_STATES_IDS = "android-support-nav:controller:backStackStates";

    @l
    private static final String KEY_BACK_STACK_STATES_PREFIX = "android-support-nav:controller:backStackStates:";

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_ARGS = "android-support-nav:controller:deepLinkArgs";

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_EXTRAS = "android-support-nav:controller:deepLinkExtras";

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_HANDLED = "android-support-nav:controller:deepLinkHandled";

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_IDS = "android-support-nav:controller:deepLinkIds";

    @l
    public static final String KEY_DEEP_LINK_INTENT = "android-support-nav:controller:deepLinkIntent";

    @l
    private static final String KEY_NAVIGATOR_STATE = "android-support-nav:controller:navigatorState";

    @l
    private static final String KEY_NAVIGATOR_STATE_NAMES = "android-support-nav:controller:navigatorState:names";

    @l
    private static final String TAG = "NavController";

    @l
    private final e0<List<NavBackStackEntry>> _currentBackStack;

    @l
    private final d0<NavBackStackEntry> _currentBackStackEntryFlow;

    @m
    private NavGraph _graph;

    @l
    private NavigatorProvider _navigatorProvider;

    @l
    private final e0<List<NavBackStackEntry>> _visibleEntries;

    @m
    private Activity activity;

    @m
    private v3.l<? super NavBackStackEntry, r2> addToBackStackHandler;

    @l
    private final k<NavBackStackEntry> backQueue;

    @l
    private final List<NavBackStackEntry> backStackEntriesToDispatch;

    @l
    private final Map<Integer, String> backStackMap;

    @l
    private final Map<String, k<NavBackStackEntryState>> backStackStates;

    @m
    private Parcelable[] backStackToRestore;

    @l
    private final Map<NavBackStackEntry, NavBackStackEntry> childToParentEntries;

    @l
    private final Context context;

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private final t0<List<NavBackStackEntry>> currentBackStack;

    @l
    private final i<NavBackStackEntry> currentBackStackEntryFlow;
    private boolean deepLinkHandled;
    private int dispatchReentrantCount;
    private boolean enableOnBackPressedCallback;

    @l
    private final Map<NavBackStackEntry, Boolean> entrySavedState;

    @l
    private Lifecycle.State hostLifecycleState;

    @m
    private NavInflater inflater;

    @l
    private final LifecycleObserver lifecycleObserver;

    @m
    private LifecycleOwner lifecycleOwner;

    @l
    private final kotlin.d0 navInflater$delegate;

    @l
    private final Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> navigatorState;

    @m
    private Bundle navigatorStateToRestore;

    @l
    private final OnBackPressedCallback onBackPressedCallback;

    @m
    private OnBackPressedDispatcher onBackPressedDispatcher;

    @l
    private final CopyOnWriteArrayList<OnDestinationChangedListener> onDestinationChangedListeners;

    @l
    private final Map<NavBackStackEntry, AtomicInteger> parentToChildCount;

    @m
    private v3.l<? super NavBackStackEntry, r2> popFromBackStackHandler;

    @m
    private NavControllerViewModel viewModel;

    @l
    private final t0<List<NavBackStackEntry>> visibleEntries;

    @l
    public static final Companion Companion = new Companion(null);
    private static boolean deepLinkSaveState = true;

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u001a\u0010\u000e\u001a\u00020\u00068\u0006X\u0087T¢\u0006\f\n\u0004\b\u000e\u0010\b\u0012\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\bR\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/navigation/NavController$Companion;", "", "", "saveState", "Lkotlin/r2;", "enableDeepLinkSaveState", "", "KEY_BACK_STACK", "Ljava/lang/String;", "KEY_BACK_STACK_DEST_IDS", "KEY_BACK_STACK_IDS", "KEY_BACK_STACK_STATES_IDS", "KEY_BACK_STACK_STATES_PREFIX", "KEY_DEEP_LINK_ARGS", "KEY_DEEP_LINK_EXTRAS", "getKEY_DEEP_LINK_EXTRAS$annotations", "()V", "KEY_DEEP_LINK_HANDLED", "KEY_DEEP_LINK_IDS", "KEY_DEEP_LINK_INTENT", "KEY_NAVIGATOR_STATE", "KEY_NAVIGATOR_STATE_NAMES", "TAG", "deepLinkSaveState", "Z", "<init>", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        public static /* synthetic */ void getKEY_DEEP_LINK_EXTRAS$annotations() {
        }

        @NavDeepLinkSaveStateControl
        @u3.m
        public final void enableDeepLinkSaveState(boolean z4) {
            NavController.deepLinkSaveState = z4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002H\u0016R\u001f\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/navigation/NavController$NavControllerNavigatorState;", "Landroidx/navigation/NavigatorState;", "Landroidx/navigation/NavBackStackEntry;", "backStackEntry", "Lkotlin/r2;", "push", "addInternal", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "arguments", "createBackStackEntry", "popUpTo", "", "saveState", "pop", "popWithTransition", "entry", "markTransitionComplete", "prepareForTransition", "Landroidx/navigation/Navigator;", "navigator", "Landroidx/navigation/Navigator;", "getNavigator", "()Landroidx/navigation/Navigator;", "<init>", "(Landroidx/navigation/NavController;Landroidx/navigation/Navigator;)V", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController$NavControllerNavigatorState\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2604:1\n150#2:2605\n150#2:2606\n2624#3,3:2607\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController$NavControllerNavigatorState\n*L\n289#1:2605\n326#1:2606\n358#1:2607,3\n*E\n"})
    /* loaded from: classes2.dex */
    public final class NavControllerNavigatorState extends NavigatorState {

        @l
        private final Navigator<? extends NavDestination> navigator;
        final /* synthetic */ NavController this$0;

        public NavControllerNavigatorState(@l NavController navController, Navigator<? extends NavDestination> navigator) {
            l0.p(navigator, "navigator");
            this.this$0 = navController;
            this.navigator = navigator;
        }

        public final void addInternal(@l NavBackStackEntry backStackEntry) {
            l0.p(backStackEntry, "backStackEntry");
            super.push(backStackEntry);
        }

        @Override // androidx.navigation.NavigatorState
        @l
        public NavBackStackEntry createBackStackEntry(@l NavDestination destination, @m Bundle bundle) {
            l0.p(destination, "destination");
            return NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, this.this$0.getContext(), destination, bundle, this.this$0.getHostLifecycleState$navigation_runtime_release(), this.this$0.viewModel, null, null, 96, null);
        }

        @l
        public final Navigator<? extends NavDestination> getNavigator() {
            return this.navigator;
        }

        @Override // androidx.navigation.NavigatorState
        public void markTransitionComplete(@l NavBackStackEntry entry) {
            List V5;
            NavControllerViewModel navControllerViewModel;
            l0.p(entry, "entry");
            boolean g5 = l0.g(this.this$0.entrySavedState.get(entry), Boolean.TRUE);
            super.markTransitionComplete(entry);
            this.this$0.entrySavedState.remove(entry);
            if (!this.this$0.backQueue.contains(entry)) {
                this.this$0.unlinkChildFromParent$navigation_runtime_release(entry);
                if (entry.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                    entry.setMaxLifecycle(Lifecycle.State.DESTROYED);
                }
                k kVar = this.this$0.backQueue;
                boolean z4 = true;
                if (!(kVar instanceof Collection) || !kVar.isEmpty()) {
                    Iterator<E> it = kVar.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (l0.g(((NavBackStackEntry) it.next()).getId(), entry.getId())) {
                            z4 = false;
                            break;
                        }
                    }
                }
                if (z4 && !g5 && (navControllerViewModel = this.this$0.viewModel) != null) {
                    navControllerViewModel.clear(entry.getId());
                }
                this.this$0.updateBackStackLifecycle$navigation_runtime_release();
                this.this$0._visibleEntries.b(this.this$0.populateVisibleEntries$navigation_runtime_release());
                return;
            }
            if (!isNavigating()) {
                this.this$0.updateBackStackLifecycle$navigation_runtime_release();
                e0 e0Var = this.this$0._currentBackStack;
                V5 = kotlin.collections.e0.V5(this.this$0.backQueue);
                e0Var.b(V5);
                this.this$0._visibleEntries.b(this.this$0.populateVisibleEntries$navigation_runtime_release());
            }
        }

        @Override // androidx.navigation.NavigatorState
        public void pop(@l NavBackStackEntry popUpTo, boolean z4) {
            l0.p(popUpTo, "popUpTo");
            Navigator navigator = this.this$0._navigatorProvider.getNavigator(popUpTo.getDestination().getNavigatorName());
            if (l0.g(navigator, this.navigator)) {
                v3.l lVar = this.this$0.popFromBackStackHandler;
                if (lVar != null) {
                    lVar.invoke(popUpTo);
                    super.pop(popUpTo, z4);
                    return;
                } else {
                    this.this$0.popBackStackFromNavigator$navigation_runtime_release(popUpTo, new NavController$NavControllerNavigatorState$pop$1(this, popUpTo, z4));
                    return;
                }
            }
            Object obj = this.this$0.navigatorState.get(navigator);
            l0.m(obj);
            ((NavControllerNavigatorState) obj).pop(popUpTo, z4);
        }

        @Override // androidx.navigation.NavigatorState
        public void popWithTransition(@l NavBackStackEntry popUpTo, boolean z4) {
            l0.p(popUpTo, "popUpTo");
            super.popWithTransition(popUpTo, z4);
            this.this$0.entrySavedState.put(popUpTo, Boolean.valueOf(z4));
        }

        @Override // androidx.navigation.NavigatorState
        public void prepareForTransition(@l NavBackStackEntry entry) {
            l0.p(entry, "entry");
            super.prepareForTransition(entry);
            if (this.this$0.backQueue.contains(entry)) {
                entry.setMaxLifecycle(Lifecycle.State.STARTED);
                return;
            }
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }

        @Override // androidx.navigation.NavigatorState
        public void push(@l NavBackStackEntry backStackEntry) {
            l0.p(backStackEntry, "backStackEntry");
            Navigator navigator = this.this$0._navigatorProvider.getNavigator(backStackEntry.getDestination().getNavigatorName());
            if (l0.g(navigator, this.navigator)) {
                v3.l lVar = this.this$0.addToBackStackHandler;
                if (lVar != null) {
                    lVar.invoke(backStackEntry);
                    addInternal(backStackEntry);
                    return;
                }
                Log.i(NavController.TAG, "Ignoring add of destination " + backStackEntry.getDestination() + " outside of the call to navigate(). ");
                return;
            }
            Object obj = this.this$0.navigatorState.get(navigator);
            if (obj != null) {
                ((NavControllerNavigatorState) obj).push(backStackEntry);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.getDestination().getNavigatorName() + " should already be created").toString());
        }
    }

    @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/navigation/NavController$OnDestinationChangedListener;", "", "Landroidx/navigation/NavController;", "controller", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "arguments", "Lkotlin/r2;", "onDestinationChanged", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public interface OnDestinationChangedListener {
        void onDestinationChanged(@l NavController navController, @l NavDestination navDestination, @m Bundle bundle);
    }

    public NavController(@l Context context) {
        kotlin.sequences.m l5;
        Object obj;
        List E;
        List E2;
        kotlin.d0 c5;
        l0.p(context, "context");
        this.context = context;
        l5 = s.l(context, NavController$activity$1.INSTANCE);
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
        this.activity = (Activity) obj;
        this.backQueue = new k<>();
        E = kotlin.collections.w.E();
        e0<List<NavBackStackEntry>> a5 = v0.a(E);
        this._currentBackStack = a5;
        this.currentBackStack = kotlinx.coroutines.flow.k.m(a5);
        E2 = kotlin.collections.w.E();
        e0<List<NavBackStackEntry>> a6 = v0.a(E2);
        this._visibleEntries = a6;
        this.visibleEntries = kotlinx.coroutines.flow.k.m(a6);
        this.childToParentEntries = new LinkedHashMap();
        this.parentToChildCount = new LinkedHashMap();
        this.backStackMap = new LinkedHashMap();
        this.backStackStates = new LinkedHashMap();
        this.onDestinationChangedListeners = new CopyOnWriteArrayList<>();
        this.hostLifecycleState = Lifecycle.State.INITIALIZED;
        this.lifecycleObserver = new LifecycleEventObserver() { // from class: androidx.navigation.a
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                NavController.lifecycleObserver$lambda$2(NavController.this, lifecycleOwner, event);
            }
        };
        this.onBackPressedCallback = new OnBackPressedCallback() { // from class: androidx.navigation.NavController$onBackPressedCallback$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(false);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                NavController.this.popBackStack();
            }
        };
        this.enableOnBackPressedCallback = true;
        this._navigatorProvider = new NavigatorProvider();
        this.navigatorState = new LinkedHashMap();
        this.entrySavedState = new LinkedHashMap();
        NavigatorProvider navigatorProvider = this._navigatorProvider;
        navigatorProvider.addNavigator(new NavGraphNavigator(navigatorProvider));
        this._navigatorProvider.addNavigator(new ActivityNavigator(this.context));
        this.backStackEntriesToDispatch = new ArrayList();
        c5 = f0.c(new NavController$navInflater$2(this));
        this.navInflater$delegate = c5;
        d0<NavBackStackEntry> b5 = k0.b(1, 0, kotlinx.coroutines.channels.i.DROP_OLDEST, 2, null);
        this._currentBackStackEntryFlow = b5;
        this.currentBackStackEntryFlow = kotlinx.coroutines.flow.k.l(b5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0230, code lost:
    
        r19 = androidx.navigation.NavBackStackEntry.Companion;
        r0 = r32.context;
        r1 = r32._graph;
        kotlin.jvm.internal.l0.m(r1);
        r2 = r32._graph;
        kotlin.jvm.internal.l0.m(r2);
        r18 = androidx.navigation.NavBackStackEntry.Companion.create$default(r19, r0, r1, r2.addInDefaultArgs(r14), getHostLifecycleState$navigation_runtime_release(), r32.viewModel, null, null, 96, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x025a, code lost:
    
        r11.addFirst(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x025f, code lost:
    
        r0 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0267, code lost:
    
        if (r0.hasNext() == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0269, code lost:
    
        r1 = (androidx.navigation.NavBackStackEntry) r0.next();
        r2 = r32.navigatorState.get(r32._navigatorProvider.getNavigator(r1.getDestination().getNavigatorName()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0283, code lost:
    
        if (r2 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0285, code lost:
    
        r2.addInternal(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02ae, code lost:
    
        throw new java.lang.IllegalStateException(("NavigatorBackStack for " + r33.getNavigatorName() + " should already be created").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02af, code lost:
    
        r32.backQueue.addAll(r11);
        r32.backQueue.add(r8);
        r0 = kotlin.collections.e0.B4(r11, r8);
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02c7, code lost:
    
        if (r0.hasNext() == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02c9, code lost:
    
        r1 = (androidx.navigation.NavBackStackEntry) r0.next();
        r2 = r1.getDestination().getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02d7, code lost:
    
        if (r2 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02d9, code lost:
    
        linkChildToParent(r1, getBackStackEntry(r2.getId()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02e5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01fc, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0193, code lost:
    
        r12 = ((androidx.navigation.NavBackStackEntry) r11.first()).getDestination();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0112, code lost:
    
        r12 = ((androidx.navigation.NavBackStackEntry) r11.first()).getDestination();
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00e8, code lost:
    
        r13 = r0;
        r14 = r2;
        r9 = r3;
        r10 = r4;
        r11 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00ae, code lost:
    
        r20 = r12;
        r0 = r13;
        r8 = r14;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x007c, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x00ee, code lost:
    
        r9 = r3;
        r10 = r4;
        r11 = r5;
        r20 = r12;
        r8 = r14;
        r14 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        r5 = new kotlin.collections.k();
        r4 = true;
        r18 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0103, code lost:
    
        r10 = true;
        r11 = r5;
        r20 = r12;
        r8 = r14;
        r14 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if ((r33 instanceof androidx.navigation.NavGraph) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        r0 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        kotlin.jvm.internal.l0.m(r0);
        r3 = r0.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if (r3 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        r0 = r13.listIterator(r36.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r0.hasPrevious() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        r1 = r0.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (kotlin.jvm.internal.l0.g(r1.getDestination(), r3) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if (r1 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        r20 = r12;
        r0 = r13;
        r2 = r15;
        r8 = r14;
        r1 = androidx.navigation.NavBackStackEntry.Companion.create$default(androidx.navigation.NavBackStackEntry.Companion, r32.context, r3, r34, getHostLifecycleState$navigation_runtime_release(), r32.viewModel, null, null, 96, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b3, code lost:
    
        r5.addFirst(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
    
        if ((r32.backQueue.isEmpty() ^ r4) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0010, code lost:
    
        if ((r12 instanceof androidx.navigation.FloatingWindow) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cb, code lost:
    
        if (r32.backQueue.last().getDestination() != r3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cd, code lost:
    
        r13 = r0;
        r14 = r2;
        r9 = r3;
        r10 = r4;
        r11 = r5;
        popEntryFromBackStack$default(r32, r32.backQueue.last(), false, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f5, code lost:
    
        if (r9 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f7, code lost:
    
        if (r9 != r33) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fa, code lost:
    
        r0 = r9;
        r4 = r10;
        r5 = r11;
        r15 = r14;
        r12 = r20;
        r14 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010d, code lost:
    
        if (r11.isEmpty() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010f, code lost:
    
        r12 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011d, code lost:
    
        if (r12 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0127, code lost:
    
        if (findDestination(r12.getId()) == r12) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0129, code lost:
    
        r12 = r12.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012d, code lost:
    
        if (r12 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012f, code lost:
    
        if (r14 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0135, code lost:
    
        if (r34.isEmpty() != r10) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r32.backQueue.isEmpty() != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0137, code lost:
    
        r4 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013a, code lost:
    
        if (r4 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013c, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0140, code lost:
    
        r0 = r13.listIterator(r36.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014c, code lost:
    
        if (r0.hasPrevious() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014e, code lost:
    
        r1 = r0.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015d, code lost:
    
        if (kotlin.jvm.internal.l0.g(r1.getDestination(), r12) == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0162, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0164, code lost:
    
        if (r1 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0166, code lost:
    
        r1 = androidx.navigation.NavBackStackEntry.Companion.create$default(androidx.navigation.NavBackStackEntry.Companion, r32.context, r12, r12.addInDefaultArgs(r15), getHostLifecycleState$navigation_runtime_release(), r32.viewModel, null, null, 96, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0186, code lost:
    
        r11.addFirst(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0160, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013f, code lost:
    
        r15 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0139, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if ((r32.backQueue.last().getDestination() instanceof androidx.navigation.FloatingWindow) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018e, code lost:
    
        if (r11.isEmpty() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0190, code lost:
    
        r12 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a3, code lost:
    
        if (r32.backQueue.isEmpty() != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b3, code lost:
    
        if ((r32.backQueue.last().getDestination() instanceof androidx.navigation.NavGraph) == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b5, code lost:
    
        r0 = r32.backQueue.last().getDestination();
        kotlin.jvm.internal.l0.n(r0, "null cannot be cast to non-null type androidx.navigation.NavGraph");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01d0, code lost:
    
        if (((androidx.navigation.NavGraph) r0).findNode(r12.getId(), false) != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d2, code lost:
    
        popEntryFromBackStack$default(r32, r32.backQueue.last(), false, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e5, code lost:
    
        r0 = r32.backQueue.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ed, code lost:
    
        if (r0 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ef, code lost:
    
        r0 = (androidx.navigation.NavBackStackEntry) r11.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01f5, code lost:
    
        if (r0 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01f7, code lost:
    
        r0 = r0.getDestination();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
    
        if (popBackStackInternal$default(r32, r32.backQueue.last().getDestination().getId(), true, false, 4, null) != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0204, code lost:
    
        if (kotlin.jvm.internal.l0.g(r0, r32._graph) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0206, code lost:
    
        r0 = r13.listIterator(r36.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0212, code lost:
    
        if (r0.hasPrevious() == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0214, code lost:
    
        r1 = r0.previous();
        r2 = r1.getDestination();
        r3 = r32._graph;
        kotlin.jvm.internal.l0.m(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0228, code lost:
    
        if (kotlin.jvm.internal.l0.g(r2, r3) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x022a, code lost:
    
        r18 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x022c, code lost:
    
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x022e, code lost:
    
        if (r18 != null) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void addEntryToBackStack(androidx.navigation.NavDestination r33, android.os.Bundle r34, androidx.navigation.NavBackStackEntry r35, java.util.List<androidx.navigation.NavBackStackEntry> r36) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.addEntryToBackStack(androidx.navigation.NavDestination, android.os.Bundle, androidx.navigation.NavBackStackEntry, java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addEntryToBackStack$default(NavController navController, NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List list, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 8) != 0) {
                list = kotlin.collections.w.E();
            }
            navController.addEntryToBackStack(navDestination, bundle, navBackStackEntry, list);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
    }

    @MainThread
    private final boolean clearBackStackInternal(@IdRes int i5) {
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((NavControllerNavigatorState) it.next()).setNavigating(true);
        }
        boolean restoreStateInternal = restoreStateInternal(i5, null, NavOptionsBuilderKt.navOptions(NavController$clearBackStackInternal$restored$1.INSTANCE), null);
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((NavControllerNavigatorState) it2.next()).setNavigating(false);
        }
        return restoreStateInternal && popBackStackInternal(i5, true, false);
    }

    private final boolean dispatchOnDestinationChanged() {
        List<NavBackStackEntry> V5;
        List<NavBackStackEntry> V52;
        while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof NavGraph)) {
            popEntryFromBackStack$default(this, this.backQueue.last(), false, null, 6, null);
        }
        NavBackStackEntry n5 = this.backQueue.n();
        if (n5 != null) {
            this.backStackEntriesToDispatch.add(n5);
        }
        this.dispatchReentrantCount++;
        updateBackStackLifecycle$navigation_runtime_release();
        int i5 = this.dispatchReentrantCount - 1;
        this.dispatchReentrantCount = i5;
        if (i5 == 0) {
            V5 = kotlin.collections.e0.V5(this.backStackEntriesToDispatch);
            this.backStackEntriesToDispatch.clear();
            for (NavBackStackEntry navBackStackEntry : V5) {
                Iterator<OnDestinationChangedListener> it = this.onDestinationChangedListeners.iterator();
                while (it.hasNext()) {
                    it.next().onDestinationChanged(this, navBackStackEntry.getDestination(), navBackStackEntry.getArguments());
                }
                this._currentBackStackEntryFlow.b(navBackStackEntry);
            }
            e0<List<NavBackStackEntry>> e0Var = this._currentBackStack;
            V52 = kotlin.collections.e0.V5(this.backQueue);
            e0Var.b(V52);
            this._visibleEntries.b(populateVisibleEntries$navigation_runtime_release());
        }
        if (n5 != null) {
            return true;
        }
        return false;
    }

    @NavDeepLinkSaveStateControl
    @u3.m
    public static final void enableDeepLinkSaveState(boolean z4) {
        Companion.enableDeepLinkSaveState(z4);
    }

    private final boolean executePopOperations(List<? extends Navigator<?>> list, NavDestination navDestination, boolean z4, boolean z5) {
        kotlin.sequences.m l5;
        kotlin.sequences.m Z2;
        kotlin.sequences.m l6;
        kotlin.sequences.m<NavDestination> Z22;
        String str;
        k1.a aVar = new k1.a();
        k<NavBackStackEntryState> kVar = new k<>();
        Iterator<? extends Navigator<?>> it = list.iterator();
        while (it.hasNext()) {
            Navigator<? extends NavDestination> navigator = (Navigator) it.next();
            k1.a aVar2 = new k1.a();
            popBackStackInternal(navigator, this.backQueue.last(), z5, new NavController$executePopOperations$1(aVar2, aVar, this, z5, kVar));
            if (!aVar2.element) {
                break;
            }
        }
        if (z5) {
            if (!z4) {
                l6 = s.l(navDestination, NavController$executePopOperations$2.INSTANCE);
                Z22 = u.Z2(l6, new NavController$executePopOperations$3(this));
                for (NavDestination navDestination2 : Z22) {
                    Map<Integer, String> map = this.backStackMap;
                    Integer valueOf = Integer.valueOf(navDestination2.getId());
                    NavBackStackEntryState i5 = kVar.i();
                    if (i5 != null) {
                        str = i5.getId();
                    } else {
                        str = null;
                    }
                    map.put(valueOf, str);
                }
            }
            if (!kVar.isEmpty()) {
                NavBackStackEntryState first = kVar.first();
                l5 = s.l(findDestination(first.getDestinationId()), NavController$executePopOperations$5.INSTANCE);
                Z2 = u.Z2(l5, new NavController$executePopOperations$6(this));
                Iterator it2 = Z2.iterator();
                while (it2.hasNext()) {
                    this.backStackMap.put(Integer.valueOf(((NavDestination) it2.next()).getId()), first.getId());
                }
                if (this.backStackMap.values().contains(first.getId())) {
                    this.backStackStates.put(first.getId(), kVar);
                }
            }
        }
        updateOnBackPressedCallbackEnabled();
        return aVar.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean executeRestoreState(java.util.List<androidx.navigation.NavBackStackEntry> r12, android.os.Bundle r13, androidx.navigation.NavOptions r14, androidx.navigation.Navigator.Extras r15) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r12
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r1.next()
            r4 = r3
            androidx.navigation.NavBackStackEntry r4 = (androidx.navigation.NavBackStackEntry) r4
            androidx.navigation.NavDestination r4 = r4.getDestination()
            boolean r4 = r4 instanceof androidx.navigation.NavGraph
            if (r4 != 0) goto L11
            r2.add(r3)
            goto L11
        L2a:
            java.util.Iterator r1 = r2.iterator()
        L2e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L78
            java.lang.Object r2 = r1.next()
            androidx.navigation.NavBackStackEntry r2 = (androidx.navigation.NavBackStackEntry) r2
            java.lang.Object r3 = kotlin.collections.u.s3(r0)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L55
            java.lang.Object r4 = kotlin.collections.u.m3(r3)
            androidx.navigation.NavBackStackEntry r4 = (androidx.navigation.NavBackStackEntry) r4
            if (r4 == 0) goto L55
            androidx.navigation.NavDestination r4 = r4.getDestination()
            if (r4 == 0) goto L55
            java.lang.String r4 = r4.getNavigatorName()
            goto L56
        L55:
            r4 = 0
        L56:
            androidx.navigation.NavDestination r5 = r2.getDestination()
            java.lang.String r5 = r5.getNavigatorName()
            boolean r4 = kotlin.jvm.internal.l0.g(r4, r5)
            if (r4 == 0) goto L6a
            java.util.Collection r3 = (java.util.Collection) r3
            r3.add(r2)
            goto L2e
        L6a:
            r3 = 1
            androidx.navigation.NavBackStackEntry[] r3 = new androidx.navigation.NavBackStackEntry[r3]
            r4 = 0
            r3[r4] = r2
            java.util.List r2 = kotlin.collections.u.P(r3)
            r0.add(r2)
            goto L2e
        L78:
            kotlin.jvm.internal.k1$a r1 = new kotlin.jvm.internal.k1$a
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L81:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lba
            java.lang.Object r2 = r0.next()
            java.util.List r2 = (java.util.List) r2
            androidx.navigation.NavigatorProvider r3 = r11._navigatorProvider
            java.lang.Object r4 = kotlin.collections.u.y2(r2)
            androidx.navigation.NavBackStackEntry r4 = (androidx.navigation.NavBackStackEntry) r4
            androidx.navigation.NavDestination r4 = r4.getDestination()
            java.lang.String r4 = r4.getNavigatorName()
            androidx.navigation.Navigator r9 = r3.getNavigator(r4)
            kotlin.jvm.internal.k1$f r6 = new kotlin.jvm.internal.k1$f
            r6.<init>()
            androidx.navigation.NavController$executeRestoreState$3 r10 = new androidx.navigation.NavController$executeRestoreState$3
            r3 = r10
            r4 = r1
            r5 = r12
            r7 = r11
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r3 = r11
            r4 = r9
            r5 = r2
            r6 = r14
            r7 = r15
            r8 = r10
            r3.navigateInternal(r4, r5, r6, r7, r8)
            goto L81
        Lba:
            boolean r12 = r1.element
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.executeRestoreState(java.util.List, android.os.Bundle, androidx.navigation.NavOptions, androidx.navigation.Navigator$Extras):boolean");
    }

    private final String findInvalidDestinationDisplayNameInDeepLink(int[] iArr) {
        NavGraph navGraph;
        NavGraph navGraph2 = this._graph;
        int length = iArr.length;
        int i5 = 0;
        while (true) {
            NavDestination navDestination = null;
            if (i5 >= length) {
                return null;
            }
            int i6 = iArr[i5];
            if (i5 == 0) {
                NavGraph navGraph3 = this._graph;
                l0.m(navGraph3);
                if (navGraph3.getId() == i6) {
                    navDestination = this._graph;
                }
            } else {
                l0.m(navGraph2);
                navDestination = navGraph2.findNode(i6);
            }
            if (navDestination == null) {
                return NavDestination.Companion.getDisplayName(this.context, i6);
            }
            if (i5 != iArr.length - 1 && (navDestination instanceof NavGraph)) {
                while (true) {
                    navGraph = (NavGraph) navDestination;
                    l0.m(navGraph);
                    if (!(navGraph.findNode(navGraph.getStartDestinationId()) instanceof NavGraph)) {
                        break;
                    }
                    navDestination = navGraph.findNode(navGraph.getStartDestinationId());
                }
                navGraph2 = navGraph;
            }
            i5++;
        }
    }

    private final int getDestinationCountOnBackStack() {
        k<NavBackStackEntry> kVar = this.backQueue;
        int i5 = 0;
        if (!(kVar instanceof Collection) || !kVar.isEmpty()) {
            Iterator<NavBackStackEntry> it = kVar.iterator();
            while (it.hasNext()) {
                if ((!(it.next().getDestination() instanceof NavGraph)) && (i5 = i5 + 1) < 0) {
                    kotlin.collections.w.V();
                }
            }
        }
        return i5;
    }

    private final List<NavBackStackEntry> instantiateBackStack(k<NavBackStackEntryState> kVar) {
        NavDestination graph;
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry n5 = this.backQueue.n();
        if (n5 == null || (graph = n5.getDestination()) == null) {
            graph = getGraph();
        }
        if (kVar != null) {
            for (NavBackStackEntryState navBackStackEntryState : kVar) {
                NavDestination findDestination = findDestination(graph, navBackStackEntryState.getDestinationId());
                if (findDestination != null) {
                    arrayList.add(navBackStackEntryState.instantiate(this.context, findDestination, getHostLifecycleState$navigation_runtime_release(), this.viewModel));
                    graph = findDestination;
                } else {
                    throw new IllegalStateException(("Restore State failed: destination " + NavDestination.Companion.getDisplayName(this.context, navBackStackEntryState.getDestinationId()) + " cannot be found from the current destination " + graph).toString());
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Incorrect condition in loop: B:26:0x0062 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean launchSingleTopInternal(androidx.navigation.NavDestination r6, android.os.Bundle r7) {
        /*
            r5 = this;
            androidx.navigation.NavBackStackEntry r0 = r5.getCurrentBackStackEntry()
            boolean r1 = r6 instanceof androidx.navigation.NavGraph
            if (r1 == 0) goto L16
            androidx.navigation.NavGraph$Companion r1 = androidx.navigation.NavGraph.Companion
            r2 = r6
            androidx.navigation.NavGraph r2 = (androidx.navigation.NavGraph) r2
            androidx.navigation.NavDestination r1 = r1.findStartDestination(r2)
            int r1 = r1.getId()
            goto L1a
        L16:
            int r1 = r6.getId()
        L1a:
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L2c
            androidx.navigation.NavDestination r0 = r0.getDestination()
            if (r0 == 0) goto L2c
            int r0 = r0.getId()
            if (r1 != r0) goto L2c
            r0 = r2
            goto L2d
        L2c:
            r0 = r3
        L2d:
            if (r0 != 0) goto L30
            return r3
        L30:
            kotlin.collections.k r0 = new kotlin.collections.k
            r0.<init>()
            kotlin.collections.k<androidx.navigation.NavBackStackEntry> r1 = r5.backQueue
            int r4 = r1.size()
            java.util.ListIterator r1 = r1.listIterator(r4)
        L3f:
            boolean r4 = r1.hasPrevious()
            if (r4 == 0) goto L5b
            java.lang.Object r4 = r1.previous()
            androidx.navigation.NavBackStackEntry r4 = (androidx.navigation.NavBackStackEntry) r4
            androidx.navigation.NavDestination r4 = r4.getDestination()
            if (r4 != r6) goto L53
            r4 = r2
            goto L54
        L53:
            r4 = r3
        L54:
            if (r4 == 0) goto L3f
            int r6 = r1.nextIndex()
            goto L5c
        L5b:
            r6 = -1
        L5c:
            kotlin.collections.k<androidx.navigation.NavBackStackEntry> r1 = r5.backQueue
            int r1 = kotlin.collections.u.G(r1)
            if (r1 < r6) goto L80
            kotlin.collections.k<androidx.navigation.NavBackStackEntry> r1 = r5.backQueue
            java.lang.Object r1 = r1.removeLast()
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            r5.unlinkChildFromParent$navigation_runtime_release(r1)
            androidx.navigation.NavBackStackEntry r3 = new androidx.navigation.NavBackStackEntry
            androidx.navigation.NavDestination r4 = r1.getDestination()
            android.os.Bundle r4 = r4.addInDefaultArgs(r7)
            r3.<init>(r1, r4)
            r0.addFirst(r3)
            goto L5c
        L80:
            java.util.Iterator r6 = r0.iterator()
        L84:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lab
            java.lang.Object r7 = r6.next()
            androidx.navigation.NavBackStackEntry r7 = (androidx.navigation.NavBackStackEntry) r7
            androidx.navigation.NavDestination r1 = r7.getDestination()
            androidx.navigation.NavGraph r1 = r1.getParent()
            if (r1 == 0) goto La5
            int r1 = r1.getId()
            androidx.navigation.NavBackStackEntry r1 = r5.getBackStackEntry(r1)
            r5.linkChildToParent(r7, r1)
        La5:
            kotlin.collections.k<androidx.navigation.NavBackStackEntry> r1 = r5.backQueue
            r1.add(r7)
            goto L84
        Lab:
            java.util.Iterator r6 = r0.iterator()
        Laf:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lcd
            java.lang.Object r7 = r6.next()
            androidx.navigation.NavBackStackEntry r7 = (androidx.navigation.NavBackStackEntry) r7
            androidx.navigation.NavigatorProvider r0 = r5._navigatorProvider
            androidx.navigation.NavDestination r1 = r7.getDestination()
            java.lang.String r1 = r1.getNavigatorName()
            androidx.navigation.Navigator r0 = r0.getNavigator(r1)
            r0.onLaunchSingleTop(r7)
            goto Laf
        Lcd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.launchSingleTopInternal(androidx.navigation.NavDestination, android.os.Bundle):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$2(NavController this$0, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        l0.p(this$0, "this$0");
        l0.p(lifecycleOwner, "<anonymous parameter 0>");
        l0.p(event, "event");
        this$0.hostLifecycleState = event.getTargetState();
        if (this$0._graph != null) {
            Iterator<NavBackStackEntry> it = this$0.backQueue.iterator();
            while (it.hasNext()) {
                it.next().handleLifecycleEvent(event);
            }
        }
    }

    private final void linkChildToParent(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        this.childToParentEntries.put(navBackStackEntry, navBackStackEntry2);
        if (this.parentToChildCount.get(navBackStackEntry2) == null) {
            this.parentToChildCount.put(navBackStackEntry2, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(navBackStackEntry2);
        l0.m(atomicInteger);
        atomicInteger.incrementAndGet();
    }

    public static /* synthetic */ void navigate$default(NavController navController, String str, NavOptions navOptions, Navigator.Extras extras, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i5 & 2) != 0) {
            navOptions = null;
        }
        if ((i5 & 4) != 0) {
            extras = null;
        }
        navController.navigate(str, navOptions, extras);
    }

    private final void navigateInternal(Navigator<? extends NavDestination> navigator, List<NavBackStackEntry> list, NavOptions navOptions, Navigator.Extras extras, v3.l<? super NavBackStackEntry, r2> lVar) {
        this.addToBackStackHandler = lVar;
        navigator.navigate(list, navOptions, extras);
        this.addToBackStackHandler = null;
    }

    static /* synthetic */ void navigateInternal$default(NavController navController, Navigator navigator, List list, NavOptions navOptions, Navigator.Extras extras, v3.l lVar, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 8) != 0) {
                lVar = NavController$navigateInternal$1.INSTANCE;
            }
            navController.navigateInternal(navigator, list, navOptions, extras, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateInternal");
    }

    @MainThread
    private final void onGraphCreated(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.navigatorStateToRestore;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList(KEY_NAVIGATOR_STATE_NAMES)) != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String name = it.next();
                NavigatorProvider navigatorProvider = this._navigatorProvider;
                l0.o(name, "name");
                Navigator navigator = navigatorProvider.getNavigator(name);
                Bundle bundle3 = bundle2.getBundle(name);
                if (bundle3 != null) {
                    navigator.onRestoreState(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.backStackToRestore;
        boolean z4 = false;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                l0.n(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                NavDestination findDestination = findDestination(navBackStackEntryState.getDestinationId());
                if (findDestination != null) {
                    NavBackStackEntry instantiate = navBackStackEntryState.instantiate(this.context, findDestination, getHostLifecycleState$navigation_runtime_release(), this.viewModel);
                    Navigator<? extends NavDestination> navigator2 = this._navigatorProvider.getNavigator(findDestination.getNavigatorName());
                    Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> map = this.navigatorState;
                    NavControllerNavigatorState navControllerNavigatorState = map.get(navigator2);
                    if (navControllerNavigatorState == null) {
                        navControllerNavigatorState = new NavControllerNavigatorState(this, navigator2);
                        map.put(navigator2, navControllerNavigatorState);
                    }
                    this.backQueue.add(instantiate);
                    navControllerNavigatorState.addInternal(instantiate);
                    NavGraph parent = instantiate.getDestination().getParent();
                    if (parent != null) {
                        linkChildToParent(instantiate, getBackStackEntry(parent.getId()));
                    }
                } else {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + NavDestination.Companion.getDisplayName(this.context, navBackStackEntryState.getDestinationId()) + " cannot be found from the current destination " + getCurrentDestination());
                }
            }
            updateOnBackPressedCallbackEnabled();
            this.backStackToRestore = null;
        }
        Collection<Navigator<? extends NavDestination>> values = this._navigatorProvider.getNavigators().values();
        ArrayList<Navigator<? extends NavDestination>> arrayList = new ArrayList();
        for (Object obj : values) {
            if (!((Navigator) obj).isAttached()) {
                arrayList.add(obj);
            }
        }
        for (Navigator<? extends NavDestination> navigator3 : arrayList) {
            Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> map2 = this.navigatorState;
            NavControllerNavigatorState navControllerNavigatorState2 = map2.get(navigator3);
            if (navControllerNavigatorState2 == null) {
                navControllerNavigatorState2 = new NavControllerNavigatorState(this, navigator3);
                map2.put(navigator3, navControllerNavigatorState2);
            }
            navigator3.onAttach(navControllerNavigatorState2);
        }
        if (this._graph != null && this.backQueue.isEmpty()) {
            if (!this.deepLinkHandled && (activity = this.activity) != null) {
                l0.m(activity);
                if (handleDeepLink(activity.getIntent())) {
                    z4 = true;
                }
            }
            if (!z4) {
                NavGraph navGraph = this._graph;
                l0.m(navGraph);
                navigate(navGraph, bundle, (NavOptions) null, (Navigator.Extras) null);
                return;
            }
            return;
        }
        dispatchOnDestinationChanged();
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, String str, boolean z4, boolean z5, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i5 & 4) != 0) {
            z5 = false;
        }
        return navController.popBackStack(str, z4, z5);
    }

    private final void popBackStackInternal(Navigator<? extends NavDestination> navigator, NavBackStackEntry navBackStackEntry, boolean z4, v3.l<? super NavBackStackEntry, r2> lVar) {
        this.popFromBackStackHandler = lVar;
        navigator.popBackStack(navBackStackEntry, z4);
        this.popFromBackStackHandler = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void popBackStackInternal$default(NavController navController, Navigator navigator, NavBackStackEntry navBackStackEntry, boolean z4, v3.l lVar, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i5 & 4) != 0) {
            lVar = NavController$popBackStackInternal$1.INSTANCE;
        }
        navController.popBackStackInternal(navigator, navBackStackEntry, z4, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void popEntryFromBackStack(NavBackStackEntry navBackStackEntry, boolean z4, k<NavBackStackEntryState> kVar) {
        boolean z5;
        NavControllerViewModel navControllerViewModel;
        t0<Set<NavBackStackEntry>> transitionsInProgress;
        Set<NavBackStackEntry> value;
        NavBackStackEntry last = this.backQueue.last();
        if (l0.g(last, navBackStackEntry)) {
            this.backQueue.removeLast();
            NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(getNavigatorProvider().getNavigator(last.getDestination().getNavigatorName()));
            boolean z6 = true;
            if (navControllerNavigatorState != null && (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) != null && (value = transitionsInProgress.getValue()) != null && value.contains(last)) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5 && !this.parentToChildCount.containsKey(last)) {
                z6 = false;
            }
            Lifecycle.State currentState = last.getLifecycle().getCurrentState();
            Lifecycle.State state = Lifecycle.State.CREATED;
            if (currentState.isAtLeast(state)) {
                if (z4) {
                    last.setMaxLifecycle(state);
                    kVar.addFirst(new NavBackStackEntryState(last));
                }
                if (!z6) {
                    last.setMaxLifecycle(Lifecycle.State.DESTROYED);
                    unlinkChildFromParent$navigation_runtime_release(last);
                } else {
                    last.setMaxLifecycle(state);
                }
            }
            if (!z4 && !z6 && (navControllerViewModel = this.viewModel) != null) {
                navControllerViewModel.clear(last.getId());
                return;
            }
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + navBackStackEntry.getDestination() + ", which is not the top of the back stack (" + last.getDestination() + ')').toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void popEntryFromBackStack$default(NavController navController, NavBackStackEntry navBackStackEntry, boolean z4, k kVar, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 2) != 0) {
                z4 = false;
            }
            if ((i5 & 4) != 0) {
                kVar = new k();
            }
            navController.popEntryFromBackStack(navBackStackEntry, z4, kVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
    }

    private final boolean restoreStateInternal(int i5, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        if (!this.backStackMap.containsKey(Integer.valueOf(i5))) {
            return false;
        }
        String str = this.backStackMap.get(Integer.valueOf(i5));
        b0.D0(this.backStackMap.values(), new NavController$restoreStateInternal$1(str));
        return executeRestoreState(instantiateBackStack((k) u1.k(this.backStackStates).remove(str)), bundle, navOptions, extras);
    }

    private final boolean tryRelaunchUpToExplicitStack() {
        List Ry;
        Object L0;
        boolean z4;
        Bundle bundle;
        Object L02;
        int i5 = 0;
        if (!this.deepLinkHandled) {
            return false;
        }
        Activity activity = this.activity;
        l0.m(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        l0.m(extras);
        int[] intArray = extras.getIntArray(KEY_DEEP_LINK_IDS);
        l0.m(intArray);
        Ry = p.Ry(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList(KEY_DEEP_LINK_ARGS);
        L0 = b0.L0(Ry);
        int intValue = ((Number) L0).intValue();
        if (parcelableArrayList != null) {
            L02 = b0.L0(parcelableArrayList);
        }
        if (Ry.isEmpty()) {
            return false;
        }
        NavDestination findDestination = findDestination(getGraph(), intValue);
        if (findDestination instanceof NavGraph) {
            intValue = NavGraph.Companion.findStartDestination((NavGraph) findDestination).getId();
        }
        NavDestination currentDestination = getCurrentDestination();
        if (currentDestination != null && intValue == currentDestination.getId()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        NavDeepLinkBuilder createDeepLink = createDeepLink();
        Bundle bundleOf = BundleKt.bundleOf(q1.a(KEY_DEEP_LINK_INTENT, intent));
        Bundle bundle2 = extras.getBundle(KEY_DEEP_LINK_EXTRAS);
        if (bundle2 != null) {
            bundleOf.putAll(bundle2);
        }
        createDeepLink.setArguments(bundleOf);
        for (Object obj : Ry) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.w.W();
            }
            int intValue2 = ((Number) obj).intValue();
            if (parcelableArrayList != null) {
                bundle = (Bundle) parcelableArrayList.get(i5);
            } else {
                bundle = null;
            }
            createDeepLink.addDestination(intValue2, bundle);
            i5 = i6;
        }
        createDeepLink.createTaskStackBuilder().startActivities();
        Activity activity2 = this.activity;
        if (activity2 != null) {
            activity2.finish();
        }
        return true;
    }

    private final boolean tryRelaunchUpToGeneratedStack() {
        Bundle bundle;
        NavDestination currentDestination = getCurrentDestination();
        l0.m(currentDestination);
        int id = currentDestination.getId();
        for (NavGraph parent = currentDestination.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getStartDestinationId() != id) {
                Bundle bundle2 = new Bundle();
                Activity activity = this.activity;
                if (activity != null) {
                    l0.m(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.activity;
                        l0.m(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.activity;
                            l0.m(activity3);
                            bundle2.putParcelable(KEY_DEEP_LINK_INTENT, activity3.getIntent());
                            NavGraph navGraph = this._graph;
                            l0.m(navGraph);
                            Activity activity4 = this.activity;
                            l0.m(activity4);
                            Intent intent = activity4.getIntent();
                            l0.o(intent, "activity!!.intent");
                            NavDestination.DeepLinkMatch matchDeepLink = navGraph.matchDeepLink(new NavDeepLinkRequest(intent));
                            if (matchDeepLink != null) {
                                bundle = matchDeepLink.getMatchingArgs();
                            } else {
                                bundle = null;
                            }
                            if (bundle != null) {
                                bundle2.putAll(matchDeepLink.getDestination().addInDefaultArgs(matchDeepLink.getMatchingArgs()));
                            }
                        }
                    }
                }
                NavDeepLinkBuilder.setDestination$default(new NavDeepLinkBuilder(this), parent.getId(), (Bundle) null, 2, (Object) null).setArguments(bundle2).createTaskStackBuilder().startActivities();
                Activity activity5 = this.activity;
                if (activity5 != null) {
                    activity5.finish();
                    return true;
                }
                return true;
            }
            id = parent.getId();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (getDestinationCountOnBackStack() > 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateOnBackPressedCallbackEnabled() {
        /*
            r3 = this;
            androidx.activity.OnBackPressedCallback r0 = r3.onBackPressedCallback
            boolean r1 = r3.enableOnBackPressedCallback
            if (r1 == 0) goto Le
            int r1 = r3.getDestinationCountOnBackStack()
            r2 = 1
            if (r1 <= r2) goto Le
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.updateOnBackPressedCallbackEnabled():void");
    }

    public void addOnDestinationChangedListener(@l OnDestinationChangedListener listener) {
        l0.p(listener, "listener");
        this.onDestinationChangedListeners.add(listener);
        if (!this.backQueue.isEmpty()) {
            NavBackStackEntry last = this.backQueue.last();
            listener.onDestinationChanged(this, last.getDestination(), last.getArguments());
        }
    }

    @MainThread
    public final boolean clearBackStack(@l String route) {
        l0.p(route, "route");
        return clearBackStackInternal(route) && dispatchOnDestinationChanged();
    }

    @l
    public NavDeepLinkBuilder createDeepLink() {
        return new NavDeepLinkBuilder(this);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void enableOnBackPressed(boolean z4) {
        this.enableOnBackPressedCallback = z4;
        updateOnBackPressedCallbackEnabled();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @m
    public final NavDestination findDestination(@IdRes int i5) {
        NavDestination navDestination;
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            return null;
        }
        l0.m(navGraph);
        if (navGraph.getId() == i5) {
            return this._graph;
        }
        NavBackStackEntry n5 = this.backQueue.n();
        if (n5 == null || (navDestination = n5.getDestination()) == null) {
            navDestination = this._graph;
            l0.m(navDestination);
        }
        return findDestination(navDestination, i5);
    }

    @l
    public NavBackStackEntry getBackStackEntry(@IdRes int i5) {
        NavBackStackEntry navBackStackEntry;
        k<NavBackStackEntry> kVar = this.backQueue;
        ListIterator<NavBackStackEntry> listIterator = kVar.listIterator(kVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntry = null;
                break;
            }
            navBackStackEntry = listIterator.previous();
            if (navBackStackEntry.getDestination().getId() == i5) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
        if (navBackStackEntry2 != null) {
            return navBackStackEntry2;
        }
        throw new IllegalArgumentException(("No destination with ID " + i5 + " is on the NavController's back stack. The current destination is " + getCurrentDestination()).toString());
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Context getContext() {
        return this.context;
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final t0<List<NavBackStackEntry>> getCurrentBackStack() {
        return this.currentBackStack;
    }

    @m
    public NavBackStackEntry getCurrentBackStackEntry() {
        return this.backQueue.n();
    }

    @l
    public final i<NavBackStackEntry> getCurrentBackStackEntryFlow() {
        return this.currentBackStackEntryFlow;
    }

    @m
    public NavDestination getCurrentDestination() {
        NavBackStackEntry currentBackStackEntry = getCurrentBackStackEntry();
        if (currentBackStackEntry != null) {
            return currentBackStackEntry.getDestination();
        }
        return null;
    }

    @l
    @MainThread
    public NavGraph getGraph() {
        NavGraph navGraph = this._graph;
        if (navGraph != null) {
            l0.n(navGraph, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            return navGraph;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
    }

    @l
    public final Lifecycle.State getHostLifecycleState$navigation_runtime_release() {
        if (this.lifecycleOwner == null) {
            return Lifecycle.State.CREATED;
        }
        return this.hostLifecycleState;
    }

    @l
    public NavInflater getNavInflater() {
        return (NavInflater) this.navInflater$delegate.getValue();
    }

    @l
    public NavigatorProvider getNavigatorProvider() {
        return this._navigatorProvider;
    }

    @m
    public NavBackStackEntry getPreviousBackStackEntry() {
        List U4;
        kotlin.sequences.m e5;
        Object obj;
        U4 = kotlin.collections.e0.U4(this.backQueue);
        Iterator it = U4.iterator();
        if (it.hasNext()) {
            it.next();
        }
        e5 = s.e(it);
        Iterator it2 = e5.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (!(((NavBackStackEntry) obj).getDestination() instanceof NavGraph)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (NavBackStackEntry) obj;
    }

    @l
    public ViewModelStoreOwner getViewModelStoreOwner(@IdRes int i5) {
        if (this.viewModel != null) {
            NavBackStackEntry backStackEntry = getBackStackEntry(i5);
            if (backStackEntry.getDestination() instanceof NavGraph) {
                return backStackEntry;
            }
            throw new IllegalArgumentException(("No NavGraph with ID " + i5 + " is on the NavController's back stack").toString());
        }
        throw new IllegalStateException("You must call setViewModelStore() before calling getViewModelStoreOwner().".toString());
    }

    @l
    public final t0<List<NavBackStackEntry>> getVisibleEntries() {
        return this.visibleEntries;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r2 != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @androidx.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleDeepLink(@p4.m android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.handleDeepLink(android.content.Intent):boolean");
    }

    @MainThread
    public void navigate(@IdRes int i5) {
        navigate(i5, (Bundle) null);
    }

    @MainThread
    @u3.i
    public final void navigate(@l String route) {
        l0.p(route, "route");
        navigate$default(this, route, null, null, 6, null);
    }

    @MainThread
    @u3.i
    public final void navigate(@l String route, @m NavOptions navOptions) {
        l0.p(route, "route");
        navigate$default(this, route, navOptions, null, 4, null);
    }

    @MainThread
    public boolean navigateUp() {
        Bundle bundle;
        Intent intent;
        if (getDestinationCountOnBackStack() == 1) {
            Activity activity = this.activity;
            int[] iArr = null;
            if (activity != null && (intent = activity.getIntent()) != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            if (bundle != null) {
                iArr = bundle.getIntArray(KEY_DEEP_LINK_IDS);
            }
            if (iArr != null) {
                return tryRelaunchUpToExplicitStack();
            }
            return tryRelaunchUpToGeneratedStack();
        }
        return popBackStack();
    }

    @MainThread
    public boolean popBackStack() {
        if (this.backQueue.isEmpty()) {
            return false;
        }
        NavDestination currentDestination = getCurrentDestination();
        l0.m(currentDestination);
        return popBackStack(currentDestination.getId(), true);
    }

    @MainThread
    @u3.i
    public final boolean popBackStack(@l String route, boolean z4) {
        l0.p(route, "route");
        return popBackStack$default(this, route, z4, false, 4, null);
    }

    public final void popBackStackFromNavigator$navigation_runtime_release(@l NavBackStackEntry popUpTo, @l v3.a<r2> onComplete) {
        l0.p(popUpTo, "popUpTo");
        l0.p(onComplete, "onComplete");
        int indexOf = this.backQueue.indexOf(popUpTo);
        if (indexOf < 0) {
            Log.i(TAG, "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i5 = indexOf + 1;
        if (i5 != this.backQueue.size()) {
            popBackStackInternal(this.backQueue.get(i5).getDestination().getId(), true, false);
        }
        popEntryFromBackStack$default(this, popUpTo, false, null, 6, null);
        onComplete.invoke();
        updateOnBackPressedCallbackEnabled();
        dispatchOnDestinationChanged();
    }

    @l
    public final List<NavBackStackEntry> populateVisibleEntries$navigation_runtime_release() {
        boolean z4;
        boolean z5;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            Set<NavBackStackEntry> value = ((NavControllerNavigatorState) it.next()).getTransitionsInProgress().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if (!arrayList.contains(navBackStackEntry) && !navBackStackEntry.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    arrayList2.add(obj);
                }
            }
            b0.n0(arrayList, arrayList2);
        }
        k<NavBackStackEntry> kVar = this.backQueue;
        ArrayList arrayList3 = new ArrayList();
        for (NavBackStackEntry navBackStackEntry2 : kVar) {
            NavBackStackEntry navBackStackEntry3 = navBackStackEntry2;
            if (!arrayList.contains(navBackStackEntry3) && navBackStackEntry3.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                arrayList3.add(navBackStackEntry2);
            }
        }
        b0.n0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((NavBackStackEntry) obj2).getDestination() instanceof NavGraph)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public void removeOnDestinationChangedListener(@l OnDestinationChangedListener listener) {
        l0.p(listener, "listener");
        this.onDestinationChangedListeners.remove(listener);
    }

    @CallSuper
    public void restoreState(@m Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.context.getClassLoader());
        this.navigatorStateToRestore = bundle.getBundle(KEY_NAVIGATOR_STATE);
        this.backStackToRestore = bundle.getParcelableArray(KEY_BACK_STACK);
        this.backStackStates.clear();
        int[] intArray = bundle.getIntArray(KEY_BACK_STACK_DEST_IDS);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(KEY_BACK_STACK_IDS);
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i5 = 0;
            int i6 = 0;
            while (i5 < length) {
                this.backStackMap.put(Integer.valueOf(intArray[i5]), stringArrayList.get(i6));
                i5++;
                i6++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList(KEY_BACK_STACK_STATES_IDS);
        if (stringArrayList2 != null) {
            for (String id : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray(KEY_BACK_STACK_STATES_PREFIX + id);
                if (parcelableArray != null) {
                    Map<String, k<NavBackStackEntryState>> map = this.backStackStates;
                    l0.o(id, "id");
                    k<NavBackStackEntryState> kVar = new k<>(parcelableArray.length);
                    Iterator a5 = kotlin.jvm.internal.i.a(parcelableArray);
                    while (a5.hasNext()) {
                        Parcelable parcelable = (Parcelable) a5.next();
                        l0.n(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        kVar.add((NavBackStackEntryState) parcelable);
                    }
                    map.put(id, kVar);
                }
            }
        }
        this.deepLinkHandled = bundle.getBoolean(KEY_DEEP_LINK_HANDLED);
    }

    @CallSuper
    @m
    public Bundle saveState() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, Navigator<? extends NavDestination>> entry : this._navigatorProvider.getNavigators().entrySet()) {
            String key = entry.getKey();
            Bundle onSaveState = entry.getValue().onSaveState();
            if (onSaveState != null) {
                arrayList.add(key);
                bundle2.putBundle(key, onSaveState);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList(KEY_NAVIGATOR_STATE_NAMES, arrayList);
            bundle.putBundle(KEY_NAVIGATOR_STATE, bundle2);
        } else {
            bundle = null;
        }
        if (!this.backQueue.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.backQueue.size()];
            Iterator<NavBackStackEntry> it = this.backQueue.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                parcelableArr[i5] = new NavBackStackEntryState(it.next());
                i5++;
            }
            bundle.putParcelableArray(KEY_BACK_STACK, parcelableArr);
        }
        if (!this.backStackMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.backStackMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i6 = 0;
            for (Map.Entry<Integer, String> entry2 : this.backStackMap.entrySet()) {
                int intValue = entry2.getKey().intValue();
                String value = entry2.getValue();
                iArr[i6] = intValue;
                arrayList2.add(value);
                i6++;
            }
            bundle.putIntArray(KEY_BACK_STACK_DEST_IDS, iArr);
            bundle.putStringArrayList(KEY_BACK_STACK_IDS, arrayList2);
        }
        if (!this.backStackStates.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry<String, k<NavBackStackEntryState>> entry3 : this.backStackStates.entrySet()) {
                String key2 = entry3.getKey();
                k<NavBackStackEntryState> value2 = entry3.getValue();
                arrayList3.add(key2);
                Parcelable[] parcelableArr2 = new Parcelable[value2.size()];
                int i7 = 0;
                for (NavBackStackEntryState navBackStackEntryState : value2) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        kotlin.collections.w.W();
                    }
                    parcelableArr2[i7] = navBackStackEntryState;
                    i7 = i8;
                }
                bundle.putParcelableArray(KEY_BACK_STACK_STATES_PREFIX + key2, parcelableArr2);
            }
            bundle.putStringArrayList(KEY_BACK_STACK_STATES_IDS, arrayList3);
        }
        if (this.deepLinkHandled) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(KEY_DEEP_LINK_HANDLED, this.deepLinkHandled);
        }
        return bundle;
    }

    @CallSuper
    @MainThread
    public void setGraph(@l NavGraph graph) {
        l0.p(graph, "graph");
        setGraph(graph, (Bundle) null);
    }

    public final void setHostLifecycleState$navigation_runtime_release(@l Lifecycle.State state) {
        l0.p(state, "<set-?>");
        this.hostLifecycleState = state;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLifecycleOwner(@l LifecycleOwner owner) {
        Lifecycle lifecycle;
        l0.p(owner, "owner");
        if (l0.g(owner, this.lifecycleOwner)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this.lifecycleObserver);
        }
        this.lifecycleOwner = owner;
        owner.getLifecycle().addObserver(this.lifecycleObserver);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setNavigatorProvider(@l NavigatorProvider navigatorProvider) {
        l0.p(navigatorProvider, "navigatorProvider");
        if (this.backQueue.isEmpty()) {
            this._navigatorProvider = navigatorProvider;
            return;
        }
        throw new IllegalStateException("NavigatorProvider must be set before setGraph call".toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setOnBackPressedDispatcher(@l OnBackPressedDispatcher dispatcher) {
        l0.p(dispatcher, "dispatcher");
        if (l0.g(dispatcher, this.onBackPressedDispatcher)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.lifecycleOwner;
        if (lifecycleOwner != null) {
            this.onBackPressedCallback.remove();
            this.onBackPressedDispatcher = dispatcher;
            dispatcher.addCallback(lifecycleOwner, this.onBackPressedCallback);
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            lifecycle.removeObserver(this.lifecycleObserver);
            lifecycle.addObserver(this.lifecycleObserver);
            return;
        }
        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setViewModelStore(@l ViewModelStore viewModelStore) {
        l0.p(viewModelStore, "viewModelStore");
        NavControllerViewModel navControllerViewModel = this.viewModel;
        NavControllerViewModel.Companion companion = NavControllerViewModel.Companion;
        if (l0.g(navControllerViewModel, companion.getInstance(viewModelStore))) {
            return;
        }
        if (this.backQueue.isEmpty()) {
            this.viewModel = companion.getInstance(viewModelStore);
            return;
        }
        throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
    }

    @m
    public final NavBackStackEntry unlinkChildFromParent$navigation_runtime_release(@l NavBackStackEntry child) {
        l0.p(child, "child");
        NavBackStackEntry remove = this.childToParentEntries.remove(child);
        Integer num = null;
        if (remove == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(remove);
        if (atomicInteger != null) {
            num = Integer.valueOf(atomicInteger.decrementAndGet());
        }
        if (num != null && num.intValue() == 0) {
            NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(this._navigatorProvider.getNavigator(remove.getDestination().getNavigatorName()));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.markTransitionComplete(remove);
            }
            this.parentToChildCount.remove(remove);
        }
        return remove;
    }

    public final void updateBackStackLifecycle$navigation_runtime_release() {
        List<NavBackStackEntry> V5;
        Object m32;
        List<NavBackStackEntry> U4;
        Object y22;
        Object J0;
        Object D2;
        Boolean bool;
        boolean z4;
        t0<Set<NavBackStackEntry>> transitionsInProgress;
        Set<NavBackStackEntry> value;
        List U42;
        V5 = kotlin.collections.e0.V5(this.backQueue);
        if (V5.isEmpty()) {
            return;
        }
        m32 = kotlin.collections.e0.m3(V5);
        NavDestination destination = ((NavBackStackEntry) m32).getDestination();
        ArrayList arrayList = new ArrayList();
        if (destination instanceof FloatingWindow) {
            U42 = kotlin.collections.e0.U4(V5);
            Iterator it = U42.iterator();
            while (it.hasNext()) {
                NavDestination destination2 = ((NavBackStackEntry) it.next()).getDestination();
                arrayList.add(destination2);
                if (!(destination2 instanceof FloatingWindow) && !(destination2 instanceof NavGraph)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        U4 = kotlin.collections.e0.U4(V5);
        for (NavBackStackEntry navBackStackEntry : U4) {
            Lifecycle.State maxLifecycle = navBackStackEntry.getMaxLifecycle();
            NavDestination destination3 = navBackStackEntry.getDestination();
            boolean z5 = true;
            if (destination != null && destination3.getId() == destination.getId()) {
                Lifecycle.State state = Lifecycle.State.RESUMED;
                if (maxLifecycle != state) {
                    NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(getNavigatorProvider().getNavigator(navBackStackEntry.getDestination().getNavigatorName()));
                    if (navControllerNavigatorState != null && (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) != null && (value = transitionsInProgress.getValue()) != null) {
                        bool = Boolean.valueOf(value.contains(navBackStackEntry));
                    } else {
                        bool = null;
                    }
                    if (!l0.g(bool, Boolean.TRUE)) {
                        AtomicInteger atomicInteger = this.parentToChildCount.get(navBackStackEntry);
                        if (atomicInteger != null && atomicInteger.get() == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            hashMap.put(navBackStackEntry, state);
                        }
                    }
                    hashMap.put(navBackStackEntry, Lifecycle.State.STARTED);
                }
                D2 = kotlin.collections.e0.D2(arrayList);
                NavDestination navDestination = (NavDestination) D2;
                if (navDestination == null || navDestination.getId() != destination3.getId()) {
                    z5 = false;
                }
                if (z5) {
                    b0.J0(arrayList);
                }
                destination = destination.getParent();
            } else {
                if (true ^ arrayList.isEmpty()) {
                    int id = destination3.getId();
                    y22 = kotlin.collections.e0.y2(arrayList);
                    if (id == ((NavDestination) y22).getId()) {
                        J0 = b0.J0(arrayList);
                        NavDestination navDestination2 = (NavDestination) J0;
                        if (maxLifecycle == Lifecycle.State.RESUMED) {
                            navBackStackEntry.setMaxLifecycle(Lifecycle.State.STARTED);
                        } else {
                            Lifecycle.State state2 = Lifecycle.State.STARTED;
                            if (maxLifecycle != state2) {
                                hashMap.put(navBackStackEntry, state2);
                            }
                        }
                        NavGraph parent = navDestination2.getParent();
                        if (parent != null && !arrayList.contains(parent)) {
                            arrayList.add(parent);
                        }
                    }
                }
                navBackStackEntry.setMaxLifecycle(Lifecycle.State.CREATED);
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : V5) {
            Lifecycle.State state3 = (Lifecycle.State) hashMap.get(navBackStackEntry2);
            if (state3 != null) {
                navBackStackEntry2.setMaxLifecycle(state3);
            } else {
                navBackStackEntry2.updateState();
            }
        }
    }

    @MainThread
    public void navigate(@IdRes int i5, @m Bundle bundle) {
        navigate(i5, bundle, (NavOptions) null);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NavigationRes int i5) {
        setGraph(getNavInflater().inflate(i5), (Bundle) null);
    }

    static /* synthetic */ boolean popBackStackInternal$default(NavController navController, int i5, boolean z4, boolean z5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i6 & 4) != 0) {
            z5 = false;
        }
        return navController.popBackStackInternal(i5, z4, z5);
    }

    @MainThread
    public final boolean clearBackStack(@IdRes int i5) {
        return clearBackStackInternal(i5) && dispatchOnDestinationChanged();
    }

    @MainThread
    public void navigate(@IdRes int i5, @m Bundle bundle, @m NavOptions navOptions) {
        navigate(i5, bundle, navOptions, (Navigator.Extras) null);
    }

    @MainThread
    public boolean popBackStack(@IdRes int i5, boolean z4) {
        return popBackStack(i5, z4, false);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NavigationRes int i5, @m Bundle bundle) {
        setGraph(getNavInflater().inflate(i5), bundle);
    }

    @MainThread
    private final boolean popBackStackInternal(@IdRes int i5, boolean z4, boolean z5) {
        List U4;
        NavDestination navDestination;
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        U4 = kotlin.collections.e0.U4(this.backQueue);
        Iterator it = U4.iterator();
        while (true) {
            if (!it.hasNext()) {
                navDestination = null;
                break;
            }
            navDestination = ((NavBackStackEntry) it.next()).getDestination();
            Navigator navigator = this._navigatorProvider.getNavigator(navDestination.getNavigatorName());
            if (z4 || navDestination.getId() != i5) {
                arrayList.add(navigator);
            }
            if (navDestination.getId() == i5) {
                break;
            }
        }
        if (navDestination == null) {
            Log.i(TAG, "Ignoring popBackStack to destination " + NavDestination.Companion.getDisplayName(this.context, i5) + " as it was not found on the current back stack");
            return false;
        }
        return executePopOperations(arrayList, navDestination, z4, z5);
    }

    @MainThread
    public void navigate(@IdRes int i5, @m Bundle bundle, @m NavOptions navOptions, @m Navigator.Extras extras) {
        NavDestination destination;
        int i6;
        if (this.backQueue.isEmpty()) {
            destination = this._graph;
        } else {
            destination = this.backQueue.last().getDestination();
        }
        if (destination != null) {
            NavAction action = destination.getAction(i5);
            Bundle bundle2 = null;
            if (action != null) {
                if (navOptions == null) {
                    navOptions = action.getNavOptions();
                }
                i6 = action.getDestinationId();
                Bundle defaultArguments = action.getDefaultArguments();
                if (defaultArguments != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(defaultArguments);
                }
            } else {
                i6 = i5;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (i6 == 0 && navOptions != null && (navOptions.getPopUpToId() != -1 || navOptions.getPopUpToRoute() != null)) {
                if (navOptions.getPopUpToRoute() != null) {
                    String popUpToRoute = navOptions.getPopUpToRoute();
                    l0.m(popUpToRoute);
                    popBackStack$default(this, popUpToRoute, navOptions.isPopUpToInclusive(), false, 4, null);
                    return;
                } else {
                    if (navOptions.getPopUpToId() != -1) {
                        popBackStack(navOptions.getPopUpToId(), navOptions.isPopUpToInclusive());
                        return;
                    }
                    return;
                }
            }
            if (i6 != 0) {
                NavDestination findDestination = findDestination(i6);
                if (findDestination == null) {
                    NavDestination.Companion companion = NavDestination.Companion;
                    String displayName = companion.getDisplayName(this.context, i6);
                    if (!(action == null)) {
                        throw new IllegalArgumentException(("Navigation destination " + displayName + " referenced from action " + companion.getDisplayName(this.context, i5) + " cannot be found from the current destination " + destination).toString());
                    }
                    throw new IllegalArgumentException("Navigation action/destination " + displayName + " cannot be found from the current destination " + destination);
                }
                navigate(findDestination, bundle2, navOptions, extras);
                return;
            }
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
        }
        throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + external.org.apache.commons.lang3.d.f15957a);
    }

    @MainThread
    public boolean popBackStack(@IdRes int i5, boolean z4, boolean z5) {
        return popBackStackInternal(i5, z4, z5) && dispatchOnDestinationChanged();
    }

    @CallSuper
    @MainThread
    public void setGraph(@l NavGraph graph, @m Bundle bundle) {
        List c32;
        List<NavDestination> X0;
        l0.p(graph, "graph");
        if (!l0.g(this._graph, graph)) {
            NavGraph navGraph = this._graph;
            if (navGraph != null) {
                for (Integer id : new ArrayList(this.backStackMap.keySet())) {
                    l0.o(id, "id");
                    clearBackStackInternal(id.intValue());
                }
                popBackStackInternal$default(this, navGraph.getId(), true, false, 4, null);
            }
            this._graph = graph;
            onGraphCreated(bundle);
            return;
        }
        int size = graph.getNodes().size();
        for (int i5 = 0; i5 < size; i5++) {
            NavDestination valueAt = graph.getNodes().valueAt(i5);
            NavGraph navGraph2 = this._graph;
            l0.m(navGraph2);
            int keyAt = navGraph2.getNodes().keyAt(i5);
            NavGraph navGraph3 = this._graph;
            l0.m(navGraph3);
            navGraph3.getNodes().replace(keyAt, valueAt);
        }
        for (NavBackStackEntry navBackStackEntry : this.backQueue) {
            c32 = u.c3(NavDestination.Companion.getHierarchy(navBackStackEntry.getDestination()));
            X0 = c0.X0(c32);
            NavDestination navDestination = this._graph;
            l0.m(navDestination);
            for (NavDestination navDestination2 : X0) {
                if (!l0.g(navDestination2, this._graph) || !l0.g(navDestination, graph)) {
                    if (navDestination instanceof NavGraph) {
                        navDestination = ((NavGraph) navDestination).findNode(navDestination2.getId());
                        l0.m(navDestination);
                    }
                }
            }
            navBackStackEntry.setDestination(navDestination);
        }
    }

    private final NavDestination findDestination(NavDestination navDestination, @IdRes int i5) {
        NavGraph parent;
        if (navDestination.getId() == i5) {
            return navDestination;
        }
        if (navDestination instanceof NavGraph) {
            parent = (NavGraph) navDestination;
        } else {
            parent = navDestination.getParent();
            l0.m(parent);
        }
        return parent.findNode(i5);
    }

    @MainThread
    @u3.i
    public final boolean popBackStack(@l String route, boolean z4, boolean z5) {
        l0.p(route, "route");
        return popBackStackInternal(route, z4, z5) && dispatchOnDestinationChanged();
    }

    private final boolean restoreStateInternal(String str) {
        NavBackStackEntryState i5;
        int hashCode = NavDestination.Companion.createRoute(str).hashCode();
        if (this.backStackMap.containsKey(Integer.valueOf(hashCode))) {
            return restoreStateInternal(hashCode, null, null, null);
        }
        NavDestination findDestination = findDestination(str);
        if (findDestination != null) {
            String str2 = this.backStackMap.get(Integer.valueOf(findDestination.getId()));
            b0.D0(this.backStackMap.values(), new NavController$restoreStateInternal$3(str2));
            k<NavBackStackEntryState> kVar = (k) u1.k(this.backStackStates).remove(str2);
            NavDestination.DeepLinkMatch matchDeepLink = findDestination.matchDeepLink(str);
            l0.m(matchDeepLink);
            if (matchDeepLink.hasMatchingArgs((kVar == null || (i5 = kVar.i()) == null) ? null : i5.getArgs())) {
                return executeRestoreState(instantiateBackStack(kVar), null, null, null);
            }
            return false;
        }
        throw new IllegalStateException(("Restore State failed: route " + str + " cannot be found from the current destination " + getCurrentDestination()).toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @m
    public final NavDestination findDestination(@l String route) {
        NavGraph navGraph;
        NavGraph parent;
        l0.p(route, "route");
        NavGraph navGraph2 = this._graph;
        if (navGraph2 == null) {
            return null;
        }
        l0.m(navGraph2);
        if (!l0.g(navGraph2.getRoute(), route)) {
            NavGraph navGraph3 = this._graph;
            l0.m(navGraph3);
            if (navGraph3.matchDeepLink(route) == null) {
                NavBackStackEntry n5 = this.backQueue.n();
                if (n5 == null || (navGraph = n5.getDestination()) == null) {
                    navGraph = this._graph;
                    l0.m(navGraph);
                }
                if (navGraph instanceof NavGraph) {
                    parent = navGraph;
                } else {
                    parent = navGraph.getParent();
                    l0.m(parent);
                }
                return parent.findNode(route);
            }
        }
        return this._graph;
    }

    @MainThread
    private final boolean clearBackStackInternal(String str) {
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((NavControllerNavigatorState) it.next()).setNavigating(true);
        }
        boolean restoreStateInternal = restoreStateInternal(str);
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((NavControllerNavigatorState) it2.next()).setNavigating(false);
        }
        return restoreStateInternal && popBackStackInternal(str, true, false);
    }

    @l
    public final NavBackStackEntry getBackStackEntry(@l String route) {
        NavBackStackEntry navBackStackEntry;
        l0.p(route, "route");
        k<NavBackStackEntry> kVar = this.backQueue;
        ListIterator<NavBackStackEntry> listIterator = kVar.listIterator(kVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntry = null;
                break;
            }
            navBackStackEntry = listIterator.previous();
            NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
            if (navBackStackEntry2.getDestination().hasRoute(route, navBackStackEntry2.getArguments())) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry3 = navBackStackEntry;
        if (navBackStackEntry3 != null) {
            return navBackStackEntry3;
        }
        throw new IllegalArgumentException(("No destination with route " + route + " is on the NavController's back stack. The current destination is " + getCurrentDestination()).toString());
    }

    private final boolean popBackStackInternal(String str, boolean z4, boolean z5) {
        NavBackStackEntry navBackStackEntry;
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        k<NavBackStackEntry> kVar = this.backQueue;
        ListIterator<NavBackStackEntry> listIterator = kVar.listIterator(kVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntry = null;
                break;
            }
            navBackStackEntry = listIterator.previous();
            NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
            boolean hasRoute = navBackStackEntry2.getDestination().hasRoute(str, navBackStackEntry2.getArguments());
            if (z4 || !hasRoute) {
                arrayList.add(this._navigatorProvider.getNavigator(navBackStackEntry2.getDestination().getNavigatorName()));
            }
            if (hasRoute) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry3 = navBackStackEntry;
        NavDestination destination = navBackStackEntry3 != null ? navBackStackEntry3.getDestination() : null;
        if (destination == null) {
            Log.i(TAG, "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
            return false;
        }
        return executePopOperations(arrayList, destination, z4, z5);
    }

    @MainThread
    public void navigate(@l Uri deepLink) {
        l0.p(deepLink, "deepLink");
        navigate(new NavDeepLinkRequest(deepLink, null, null));
    }

    @MainThread
    public void navigate(@l Uri deepLink, @m NavOptions navOptions) {
        l0.p(deepLink, "deepLink");
        navigate(new NavDeepLinkRequest(deepLink, null, null), navOptions, (Navigator.Extras) null);
    }

    @MainThread
    public void navigate(@l Uri deepLink, @m NavOptions navOptions, @m Navigator.Extras extras) {
        l0.p(deepLink, "deepLink");
        navigate(new NavDeepLinkRequest(deepLink, null, null), navOptions, extras);
    }

    @MainThread
    public void navigate(@l NavDeepLinkRequest request) {
        l0.p(request, "request");
        navigate(request, (NavOptions) null);
    }

    @MainThread
    public void navigate(@l NavDeepLinkRequest request, @m NavOptions navOptions) {
        l0.p(request, "request");
        navigate(request, navOptions, (Navigator.Extras) null);
    }

    @MainThread
    public void navigate(@l NavDeepLinkRequest request, @m NavOptions navOptions, @m Navigator.Extras extras) {
        l0.p(request, "request");
        NavGraph navGraph = this._graph;
        if (navGraph != null) {
            l0.m(navGraph);
            NavDestination.DeepLinkMatch matchDeepLink = navGraph.matchDeepLink(request);
            if (matchDeepLink != null) {
                Bundle addInDefaultArgs = matchDeepLink.getDestination().addInDefaultArgs(matchDeepLink.getMatchingArgs());
                if (addInDefaultArgs == null) {
                    addInDefaultArgs = new Bundle();
                }
                NavDestination destination = matchDeepLink.getDestination();
                Intent intent = new Intent();
                intent.setDataAndType(request.getUri(), request.getMimeType());
                intent.setAction(request.getAction());
                addInDefaultArgs.putParcelable(KEY_DEEP_LINK_INTENT, intent);
                navigate(destination, addInDefaultArgs, navOptions, extras);
                return;
            }
            throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + this._graph);
        }
        throw new IllegalArgumentException(("Cannot navigate to " + request + ". Navigation graph has not been set for NavController " + this + external.org.apache.commons.lang3.d.f15957a).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00f8 A[LOOP:1: B:22:0x00f2->B:24:0x00f8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    @androidx.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void navigate(androidx.navigation.NavDestination r22, android.os.Bundle r23, androidx.navigation.NavOptions r24, androidx.navigation.Navigator.Extras r25) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.navigate(androidx.navigation.NavDestination, android.os.Bundle, androidx.navigation.NavOptions, androidx.navigation.Navigator$Extras):void");
    }

    @MainThread
    public void navigate(@l NavDirections directions) {
        l0.p(directions, "directions");
        navigate(directions.getActionId(), directions.getArguments(), (NavOptions) null);
    }

    @MainThread
    public void navigate(@l NavDirections directions, @m NavOptions navOptions) {
        l0.p(directions, "directions");
        navigate(directions.getActionId(), directions.getArguments(), navOptions);
    }

    @MainThread
    public void navigate(@l NavDirections directions, @l Navigator.Extras navigatorExtras) {
        l0.p(directions, "directions");
        l0.p(navigatorExtras, "navigatorExtras");
        navigate(directions.getActionId(), directions.getArguments(), (NavOptions) null, navigatorExtras);
    }

    @MainThread
    public final void navigate(@l String route, @l v3.l<? super NavOptionsBuilder, r2> builder) {
        l0.p(route, "route");
        l0.p(builder, "builder");
        navigate$default(this, route, NavOptionsBuilderKt.navOptions(builder), null, 4, null);
    }

    @MainThread
    @u3.i
    public final void navigate(@l String route, @m NavOptions navOptions, @m Navigator.Extras extras) {
        l0.p(route, "route");
        NavDeepLinkRequest.Builder.Companion companion = NavDeepLinkRequest.Builder.Companion;
        Uri parse = Uri.parse(NavDestination.Companion.createRoute(route));
        l0.h(parse, "Uri.parse(this)");
        navigate(companion.fromUri(parse).build(), navOptions, extras);
    }
}
