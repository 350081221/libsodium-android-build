package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.ContextAware;
import androidx.activity.contextaware.ContextAwareHelper;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.DoNotInline;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnNewIntentProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.OnUserLeaveHintProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.tracing.Trace;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.d0;
import kotlin.f0;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000ð\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 Å\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u0011:\nÆ\u0001Å\u0001Ç\u0001È\u0001É\u0001B\t¢\u0006\u0006\bÃ\u0001\u0010\u0088\u0001B\u0016\b\u0017\u0012\t\b\u0001\u0010\u0094\u0001\u001a\u00020!¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0003J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0012\u0010\u001b\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0019H\u0015J\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eJ\n\u0010 \u001a\u0004\u0018\u00010\u001eH\u0017J\u0012\u0010#\u001a\u00020\u00122\b\b\u0001\u0010\"\u001a\u00020!H\u0016J\u0012\u0010#\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010$H\u0016J\u001c\u0010#\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016J\u001c\u0010(\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016J\b\u0010)\u001a\u00020\u0012H\u0017J\n\u0010+\u001a\u0004\u0018\u00010*H\u0016J\u000e\u0010.\u001a\u00020\u00122\u0006\u0010-\u001a\u00020,J\u000e\u0010/\u001a\u00020\u00122\u0006\u0010-\u001a\u00020,J\"\u00104\u001a\u0002032\u0006\u00100\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u00102\u001a\u000201H\u0016J\u0018\u00105\u001a\u0002032\u0006\u00100\u001a\u00020!2\u0006\u00102\u001a\u000201H\u0016J\u0018\u00108\u001a\u0002032\u0006\u00100\u001a\u00020!2\u0006\u00107\u001a\u000206H\u0016J\u0018\u00109\u001a\u00020\u00122\u0006\u00100\u001a\u00020!2\u0006\u00102\u001a\u000201H\u0016J\u0010\u0010<\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:H\u0016J\u0018\u0010<\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020\u0003H\u0016J \u0010<\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020\u00032\u0006\u0010?\u001a\u00020>H\u0017J\u0010\u0010@\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:H\u0016J\b\u0010A\u001a\u00020\u0012H\u0016J\b\u0010B\u001a\u00020\u0012H\u0017J\u0018\u0010F\u001a\u00020\u00122\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020!H\u0017J\"\u0010F\u001a\u00020\u00122\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020!2\b\u0010G\u001a\u0004\u0018\u00010\u0019H\u0017J:\u0010M\u001a\u00020\u00122\u0006\u0010D\u001a\u00020H2\u0006\u0010E\u001a\u00020!2\b\u0010I\u001a\u0004\u0018\u00010C2\u0006\u0010J\u001a\u00020!2\u0006\u0010K\u001a\u00020!2\u0006\u0010L\u001a\u00020!H\u0017JD\u0010M\u001a\u00020\u00122\u0006\u0010D\u001a\u00020H2\u0006\u0010E\u001a\u00020!2\b\u0010I\u001a\u0004\u0018\u00010C2\u0006\u0010J\u001a\u00020!2\u0006\u0010K\u001a\u00020!2\u0006\u0010L\u001a\u00020!2\b\u0010G\u001a\u0004\u0018\u00010\u0019H\u0017J\"\u0010P\u001a\u00020\u00122\u0006\u0010E\u001a\u00020!2\u0006\u0010N\u001a\u00020!2\b\u0010O\u001a\u0004\u0018\u00010CH\u0015J-\u0010V\u001a\u00020\u00122\u0006\u0010E\u001a\u00020!2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020R0Q2\u0006\u0010U\u001a\u00020TH\u0017¢\u0006\u0004\bV\u0010WJB\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00000`\"\u0004\b\u0000\u0010X\"\u0004\b\u0001\u0010Y2\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010Z2\u0006\u0010]\u001a\u00020\\2\f\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00010^J:\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00000`\"\u0004\b\u0000\u0010X\"\u0004\b\u0001\u0010Y2\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010Z2\f\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00010^J\u0010\u0010d\u001a\u00020\u00122\u0006\u0010c\u001a\u00020bH\u0017J\u0014\u0010f\u001a\u00020\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020b0eJ\u0014\u0010g\u001a\u00020\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020b0eJ\u0010\u0010i\u001a\u00020\u00122\u0006\u0010h\u001a\u00020!H\u0017J\u0014\u0010j\u001a\u00020\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020!0eJ\u0014\u0010k\u001a\u00020\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020!0eJ\u0010\u0010l\u001a\u00020\u00122\u0006\u0010D\u001a\u00020CH\u0015J\u0014\u0010m\u001a\u00020\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020C0eJ\u0014\u0010n\u001a\u00020\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020C0eJ\u0010\u0010p\u001a\u00020\u00122\u0006\u0010o\u001a\u000203H\u0017J\u0018\u0010p\u001a\u00020\u00122\u0006\u0010o\u001a\u0002032\u0006\u0010c\u001a\u00020bH\u0017J\u0014\u0010r\u001a\u00020\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020q0eJ\u0014\u0010s\u001a\u00020\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020q0eJ\u0010\u0010u\u001a\u00020\u00122\u0006\u0010t\u001a\u000203H\u0017J\u0018\u0010u\u001a\u00020\u00122\u0006\u0010t\u001a\u0002032\u0006\u0010c\u001a\u00020bH\u0017J\u0014\u0010w\u001a\u00020\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020v0eJ\u0014\u0010x\u001a\u00020\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020v0eJ\b\u0010y\u001a\u00020\u0012H\u0015J\u000e\u0010{\u001a\u00020\u00122\u0006\u0010-\u001a\u00020zJ\u000e\u0010|\u001a\u00020\u00122\u0006\u0010-\u001a\u00020zJ\b\u0010}\u001a\u00020\u0012H\u0016R\u0015\u0010\u007f\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R \u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u0012\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001c\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0017\u0010\u008c\u0001\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R!\u0010\u0093\u0001\u001a\u00030\u008e\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0094\u0001\u001a\u00020!8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010XR\u0018\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001c\u0010\u0098\u0001\u001a\u00020\\8\u0006¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R$\u0010\u009d\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020b0e0\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R$\u0010\u009f\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0e0\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u009e\u0001R$\u0010 \u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0e0\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010\u009e\u0001R$\u0010¡\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020q0e0\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010\u009e\u0001R$\u0010¢\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020v0e0\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010\u009e\u0001R\u001e\u0010£\u0001\u001a\t\u0012\u0004\u0012\u00020z0\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010\u009e\u0001R\u0019\u0010¤\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0019\u0010¦\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010¥\u0001R!\u0010«\u0001\u001a\u00030§\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b¨\u0001\u0010\u0090\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R(\u0010°\u0001\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\u0018\n\u0006\b¬\u0001\u0010\u0090\u0001\u0012\u0006\b¯\u0001\u0010\u0088\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0019\u0010³\u0001\u001a\u0004\u0018\u00010\u001e8WX\u0096\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001R\u0018\u0010·\u0001\u001a\u00030´\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010¶\u0001R\u0018\u0010º\u0001\u001a\u00030\u0089\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¸\u0001\u0010¹\u0001R\u0018\u0010¾\u0001\u001a\u00030»\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001R\u0015\u0010Â\u0001\u001a\u00030¿\u00018F¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Á\u0001¨\u0006Ê\u0001"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/core/app/ComponentActivity;", "Landroidx/activity/contextaware/ContextAware;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/lifecycle/HasDefaultViewModelProviderFactory;", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "Landroidx/activity/result/ActivityResultRegistryOwner;", "Landroidx/activity/result/ActivityResultCaller;", "Landroidx/core/content/OnConfigurationChangedProvider;", "Landroidx/core/content/OnTrimMemoryProvider;", "Landroidx/core/app/OnNewIntentProvider;", "Landroidx/core/app/OnMultiWindowModeChangedProvider;", "Landroidx/core/app/OnPictureInPictureModeChangedProvider;", "Landroidx/core/app/OnUserLeaveHintProvider;", "Landroidx/core/view/MenuHost;", "Landroidx/activity/FullyDrawnReporterOwner;", "Lkotlin/r2;", "ensureViewModelStore", "Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "addObserverForBackInvoker", "Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "createFullyDrawnExecutor", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "outState", "onSaveInstanceState", "", "onRetainNonConfigurationInstance", "onRetainCustomNonConfigurationInstance", "", "layoutResID", "setContentView", "Landroid/view/View;", "view", "Landroid/view/ViewGroup$LayoutParams;", "params", "addContentView", "initializeViewTreeOwners", "Landroid/content/Context;", "peekAvailableContext", "Landroidx/activity/contextaware/OnContextAvailableListener;", "listener", "addOnContextAvailableListener", "removeOnContextAvailableListener", "featureId", "Landroid/view/Menu;", "menu", "", "onPreparePanel", "onCreatePanelMenu", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "onPanelClosed", "Landroidx/core/view/MenuProvider;", "provider", "addMenuProvider", "owner", "Landroidx/lifecycle/Lifecycle$State;", "state", "removeMenuProvider", "invalidateMenu", "onBackPressed", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "requestCode", "startActivityForResult", "options", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "resultCode", "data", "onActivityResult", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "I", "O", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "Landroidx/activity/result/ActivityResultCallback;", "callback", "Landroidx/activity/result/ActivityResultLauncher;", "registerForActivityResult", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "Landroidx/core/util/Consumer;", "addOnConfigurationChangedListener", "removeOnConfigurationChangedListener", "level", "onTrimMemory", "addOnTrimMemoryListener", "removeOnTrimMemoryListener", "onNewIntent", "addOnNewIntentListener", "removeOnNewIntentListener", "isInMultiWindowMode", "onMultiWindowModeChanged", "Landroidx/core/app/MultiWindowModeChangedInfo;", "addOnMultiWindowModeChangedListener", "removeOnMultiWindowModeChangedListener", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Landroidx/core/app/PictureInPictureModeChangedInfo;", "addOnPictureInPictureModeChangedListener", "removeOnPictureInPictureModeChangedListener", "onUserLeaveHint", "Ljava/lang/Runnable;", "addOnUserLeaveHintListener", "removeOnUserLeaveHintListener", "reportFullyDrawn", "Landroidx/activity/contextaware/ContextAwareHelper;", "contextAwareHelper", "Landroidx/activity/contextaware/ContextAwareHelper;", "Landroidx/core/view/MenuHostHelper;", "menuHostHelper", "Landroidx/core/view/MenuHostHelper;", "Landroidx/savedstate/SavedStateRegistryController;", "savedStateRegistryController", "Landroidx/savedstate/SavedStateRegistryController;", "getSavedStateRegistryController$annotations", "()V", "Landroidx/lifecycle/ViewModelStore;", "_viewModelStore", "Landroidx/lifecycle/ViewModelStore;", "reportFullyDrawnExecutor", "Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Landroidx/activity/FullyDrawnReporter;", "fullyDrawnReporter$delegate", "Lkotlin/d0;", "getFullyDrawnReporter", "()Landroidx/activity/FullyDrawnReporter;", "fullyDrawnReporter", "contentLayoutId", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "activityResultRegistry", "Landroidx/activity/result/ActivityResultRegistry;", "getActivityResultRegistry", "()Landroidx/activity/result/ActivityResultRegistry;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onTrimMemoryListeners", "onNewIntentListeners", "onMultiWindowModeChangedListeners", "onPictureInPictureModeChangedListeners", "onUserLeaveHintListeners", "dispatchingOnMultiWindowModeChanged", "Z", "dispatchingOnPictureInPictureModeChanged", "Landroidx/lifecycle/ViewModelProvider$Factory;", "defaultViewModelProviderFactory$delegate", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "defaultViewModelProviderFactory", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "getLastCustomNonConfigurationInstance", "()Ljava/lang/Object;", "lastCustomNonConfigurationInstance", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultViewModelCreationExtras", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultViewModelCreationExtras", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "<init>", "(I)V", "Companion", "Api33Impl", "NonConfigurationInstances", "ReportFullyDrawnExecutor", "ReportFullyDrawnExecutorImpl", "activity_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements ContextAware, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, ActivityResultCaller, OnConfigurationChangedProvider, OnTrimMemoryProvider, OnNewIntentProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, OnUserLeaveHintProvider, MenuHost, FullyDrawnReporterOwner {

    @p4.l
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";

    @p4.l
    private static final Companion Companion = new Companion(null);

    @p4.m
    private ViewModelStore _viewModelStore;

    @p4.l
    private final ActivityResultRegistry activityResultRegistry;

    @LayoutRes
    private int contentLayoutId;

    @p4.l
    private final ContextAwareHelper contextAwareHelper;

    @p4.l
    private final d0 defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    @p4.l
    private final d0 fullyDrawnReporter$delegate;

    @p4.l
    private final MenuHostHelper menuHostHelper;

    @p4.l
    private final AtomicInteger nextLocalRequestCode;

    @p4.l
    private final d0 onBackPressedDispatcher$delegate;

    @p4.l
    private final CopyOnWriteArrayList<Consumer<Configuration>> onConfigurationChangedListeners;

    @p4.l
    private final CopyOnWriteArrayList<Consumer<MultiWindowModeChangedInfo>> onMultiWindowModeChangedListeners;

    @p4.l
    private final CopyOnWriteArrayList<Consumer<Intent>> onNewIntentListeners;

    @p4.l
    private final CopyOnWriteArrayList<Consumer<PictureInPictureModeChangedInfo>> onPictureInPictureModeChangedListeners;

    @p4.l
    private final CopyOnWriteArrayList<Consumer<Integer>> onTrimMemoryListeners;

    @p4.l
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;

    @p4.l
    private final ReportFullyDrawnExecutor reportFullyDrawnExecutor;

    @p4.l
    private final SavedStateRegistryController savedStateRegistryController;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/activity/ComponentActivity$Api33Impl;", "", "()V", "getOnBackInvokedDispatcher", "Landroid/window/OnBackInvokedDispatcher;", "activity", "Landroid/app/Activity;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RequiresApi(33)
    /* loaded from: classes.dex */
    public static final class Api33Impl {

        @p4.l
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        @p4.l
        @DoNotInline
        public final OnBackInvokedDispatcher getOnBackInvokedDispatcher(@p4.l Activity activity) {
            l0.p(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            l0.o(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/activity/ComponentActivity$Companion;", "", "()V", "ACTIVITY_RESULT_TAG", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/activity/ComponentActivity$NonConfigurationInstances;", "", "()V", "custom", "getCustom", "()Ljava/lang/Object;", "setCustom", "(Ljava/lang/Object;)V", "viewModelStore", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "setViewModelStore", "(Landroidx/lifecycle/ViewModelStore;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class NonConfigurationInstances {

        @p4.m
        private Object custom;

        @p4.m
        private ViewModelStore viewModelStore;

        @p4.m
        public final Object getCustom() {
            return this.custom;
        }

        @p4.m
        public final ViewModelStore getViewModelStore() {
            return this.viewModelStore;
        }

        public final void setCustom(@p4.m Object obj) {
            this.custom = obj;
        }

        public final void setViewModelStore(@p4.m ViewModelStore viewModelStore) {
            this.viewModelStore = viewModelStore;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Ljava/util/concurrent/Executor;", "Landroid/view/View;", "view", "Lkotlin/r2;", "viewCreated", "activityDestroyed", "activity_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public interface ReportFullyDrawnExecutor extends Executor {
        void activityDestroyed();

        void viewCreated(@p4.l View view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutorImpl;", "Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Ljava/lang/Runnable;", "Landroid/view/View;", "view", "Lkotlin/r2;", "viewCreated", "activityDestroyed", "runnable", "execute", "onDraw", "run", "", "endWatchTimeMillis", "J", "getEndWatchTimeMillis", "()J", "currentRunnable", "Ljava/lang/Runnable;", "getCurrentRunnable", "()Ljava/lang/Runnable;", "setCurrentRunnable", "(Ljava/lang/Runnable;)V", "", "onDrawScheduled", "Z", "getOnDrawScheduled", "()Z", "setOnDrawScheduled", "(Z)V", "<init>", "(Landroidx/activity/ComponentActivity;)V", "activity_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public final class ReportFullyDrawnExecutorImpl implements ReportFullyDrawnExecutor, ViewTreeObserver.OnDrawListener, Runnable {

        @p4.m
        private Runnable currentRunnable;
        private final long endWatchTimeMillis = SystemClock.uptimeMillis() + 10000;
        private boolean onDrawScheduled;

        public ReportFullyDrawnExecutorImpl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void execute$lambda$0(ReportFullyDrawnExecutorImpl this$0) {
            l0.p(this$0, "this$0");
            Runnable runnable = this$0.currentRunnable;
            if (runnable != null) {
                l0.m(runnable);
                runnable.run();
                this$0.currentRunnable = null;
            }
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void activityDestroyed() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@p4.l Runnable runnable) {
            l0.p(runnable, "runnable");
            this.currentRunnable = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            l0.o(decorView, "window.decorView");
            if (this.onDrawScheduled) {
                if (l0.g(Looper.myLooper(), Looper.getMainLooper())) {
                    decorView.invalidate();
                    return;
                } else {
                    decorView.postInvalidate();
                    return;
                }
            }
            decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.j
                @Override // java.lang.Runnable
                public final void run() {
                    ComponentActivity.ReportFullyDrawnExecutorImpl.execute$lambda$0(ComponentActivity.ReportFullyDrawnExecutorImpl.this);
                }
            });
        }

        @p4.m
        public final Runnable getCurrentRunnable() {
            return this.currentRunnable;
        }

        public final long getEndWatchTimeMillis() {
            return this.endWatchTimeMillis;
        }

        public final boolean getOnDrawScheduled() {
            return this.onDrawScheduled;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.currentRunnable;
            if (runnable != null) {
                runnable.run();
                this.currentRunnable = null;
                if (ComponentActivity.this.getFullyDrawnReporter().isFullyDrawnReported()) {
                    this.onDrawScheduled = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            if (SystemClock.uptimeMillis() > this.endWatchTimeMillis) {
                this.onDrawScheduled = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        public final void setCurrentRunnable(@p4.m Runnable runnable) {
            this.currentRunnable = runnable;
        }

        public final void setOnDrawScheduled(boolean z4) {
            this.onDrawScheduled = z4;
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void viewCreated(@p4.l View view) {
            l0.p(view, "view");
            if (!this.onDrawScheduled) {
                this.onDrawScheduled = true;
                view.getViewTreeObserver().addOnDrawListener(this);
            }
        }
    }

    public ComponentActivity() {
        d0 c5;
        d0 c6;
        d0 c7;
        this.contextAwareHelper = new ContextAwareHelper();
        this.menuHostHelper = new MenuHostHelper(new Runnable() { // from class: androidx.activity.e
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.menuHostHelper$lambda$0(ComponentActivity.this);
            }
        });
        SavedStateRegistryController create = SavedStateRegistryController.Companion.create(this);
        this.savedStateRegistryController = create;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        c5 = f0.c(new ComponentActivity$fullyDrawnReporter$2(this));
        this.fullyDrawnReporter$delegate = c5;
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new ComponentActivity$activityResultRegistry$1(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() != null) {
            getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.f
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    ComponentActivity._init_$lambda$2(ComponentActivity.this, lifecycleOwner, event);
                }
            });
            getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.g
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    ComponentActivity._init_$lambda$3(ComponentActivity.this, lifecycleOwner, event);
                }
            });
            getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.4
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(@p4.l LifecycleOwner source, @p4.l Lifecycle.Event event) {
                    l0.p(source, "source");
                    l0.p(event, "event");
                    ComponentActivity.this.ensureViewModelStore();
                    ComponentActivity.this.getLifecycle().removeObserver(this);
                }
            });
            create.performAttach();
            SavedStateHandleSupport.enableSavedStateHandles(this);
            getSavedStateRegistry().registerSavedStateProvider(ACTIVITY_RESULT_TAG, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.activity.h
                @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                public final Bundle saveState() {
                    Bundle _init_$lambda$4;
                    _init_$lambda$4 = ComponentActivity._init_$lambda$4(ComponentActivity.this);
                    return _init_$lambda$4;
                }
            });
            addOnContextAvailableListener(new OnContextAvailableListener() { // from class: androidx.activity.i
                @Override // androidx.activity.contextaware.OnContextAvailableListener
                public final void onContextAvailable(Context context) {
                    ComponentActivity._init_$lambda$5(ComponentActivity.this, context);
                }
            });
            c6 = f0.c(new ComponentActivity$defaultViewModelProviderFactory$2(this));
            this.defaultViewModelProviderFactory$delegate = c6;
            c7 = f0.c(new ComponentActivity$onBackPressedDispatcher$2(this));
            this.onBackPressedDispatcher$delegate = c7;
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ComponentActivity this$0, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Window window;
        View peekDecorView;
        l0.p(this$0, "this$0");
        l0.p(lifecycleOwner, "<anonymous parameter 0>");
        l0.p(event, "event");
        if (event == Lifecycle.Event.ON_STOP && (window = this$0.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
            peekDecorView.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(ComponentActivity this$0, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        l0.p(this$0, "this$0");
        l0.p(lifecycleOwner, "<anonymous parameter 0>");
        l0.p(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            this$0.contextAwareHelper.clearAvailableContext();
            if (!this$0.isChangingConfigurations()) {
                this$0.getViewModelStore().clear();
            }
            this$0.reportFullyDrawnExecutor.activityDestroyed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$4(ComponentActivity this$0) {
        l0.p(this$0, "this$0");
        Bundle bundle = new Bundle();
        this$0.activityResultRegistry.onSaveInstanceState(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(ComponentActivity this$0, Context it) {
        l0.p(this$0, "this$0");
        l0.p(it, "it");
        Bundle consumeRestoredStateForKey = this$0.getSavedStateRegistry().consumeRestoredStateForKey(ACTIVITY_RESULT_TAG);
        if (consumeRestoredStateForKey != null) {
            this$0.activityResultRegistry.onRestoreInstanceState(consumeRestoredStateForKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(33)
    public final void addObserverForBackInvoker(final OnBackPressedDispatcher onBackPressedDispatcher) {
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.d
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ComponentActivity.addObserverForBackInvoker$lambda$7(OnBackPressedDispatcher.this, this, lifecycleOwner, event);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$7(OnBackPressedDispatcher dispatcher, ComponentActivity this$0, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        l0.p(dispatcher, "$dispatcher");
        l0.p(this$0, "this$0");
        l0.p(lifecycleOwner, "<anonymous parameter 0>");
        l0.p(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            dispatcher.setOnBackInvokedDispatcher(Api33Impl.INSTANCE.getOnBackInvokedDispatcher(this$0));
        }
    }

    private final ReportFullyDrawnExecutor createFullyDrawnExecutor() {
        return new ReportFullyDrawnExecutorImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
            if (nonConfigurationInstances != null) {
                this._viewModelStore = nonConfigurationInstances.getViewModelStore();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new ViewModelStore();
            }
        }
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void menuHostHelper$lambda$0(ComponentActivity this$0) {
        l0.p(this$0, "this$0");
        this$0.invalidateMenu();
    }

    @Override // android.app.Activity
    public void addContentView(@p4.m View view, @p4.m ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        l0.o(decorView, "window.decorView");
        reportFullyDrawnExecutor.viewCreated(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(@p4.l MenuProvider provider) {
        l0.p(provider, "provider");
        this.menuHostHelper.addMenuProvider(provider);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void addOnConfigurationChangedListener(@p4.l Consumer<Configuration> listener) {
        l0.p(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void addOnContextAvailableListener(@p4.l OnContextAvailableListener listener) {
        l0.p(listener, "listener");
        this.contextAwareHelper.addOnContextAvailableListener(listener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(@p4.l Consumer<MultiWindowModeChangedInfo> listener) {
        l0.p(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void addOnNewIntentListener(@p4.l Consumer<Intent> listener) {
        l0.p(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(@p4.l Consumer<PictureInPictureModeChangedInfo> listener) {
        l0.p(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void addOnTrimMemoryListener(@p4.l Consumer<Integer> listener) {
        l0.p(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    @Override // androidx.core.app.OnUserLeaveHintProvider
    public final void addOnUserLeaveHintListener(@p4.l Runnable listener) {
        l0.p(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // androidx.activity.result.ActivityResultRegistryOwner
    @p4.l
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @p4.l
    @CallSuper
    public CreationExtras getDefaultViewModelCreationExtras() {
        Bundle bundle = null;
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(null, 1, null);
        if (getApplication() != null) {
            CreationExtras.Key<Application> key = ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY;
            Application application = getApplication();
            l0.o(application, "application");
            mutableCreationExtras.set(key, application);
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        }
        if (bundle != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, bundle);
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @p4.l
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return (ViewModelProvider.Factory) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    @Override // androidx.activity.FullyDrawnReporterOwner
    @p4.l
    public FullyDrawnReporter getFullyDrawnReporter() {
        return (FullyDrawnReporter) this.fullyDrawnReporter$delegate.getValue();
    }

    @kotlin.k(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    @p4.m
    public Object getLastCustomNonConfigurationInstance() {
        NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
        if (nonConfigurationInstances != null) {
            return nonConfigurationInstances.getCustom();
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    @p4.l
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    @p4.l
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return (OnBackPressedDispatcher) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    @p4.l
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @p4.l
    public ViewModelStore getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            ViewModelStore viewModelStore = this._viewModelStore;
            l0.m(viewModelStore);
            return viewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.".toString());
    }

    @CallSuper
    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        l0.o(decorView, "window.decorView");
        ViewTreeLifecycleOwner.set(decorView, this);
        View decorView2 = getWindow().getDecorView();
        l0.o(decorView2, "window.decorView");
        ViewTreeViewModelStoreOwner.set(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        l0.o(decorView3, "window.decorView");
        ViewTreeSavedStateRegistryOwner.set(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        l0.o(decorView4, "window.decorView");
        ViewTreeOnBackPressedDispatcherOwner.set(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        l0.o(decorView5, "window.decorView");
        ViewTreeFullyDrawnReporterOwner.set(decorView5, this);
    }

    @Override // androidx.core.view.MenuHost
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    @kotlin.k(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with the appropriate {@link ActivityResultContract} and handling the result in the\n      {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    @CallSuper
    public void onActivityResult(int i5, int i6, @p4.m Intent intent) {
        if (!this.activityResultRegistry.dispatchResult(i5, i6, intent)) {
            super.onActivityResult(i5, i6, intent);
        }
    }

    @Override // android.app.Activity
    @kotlin.k(message = "This method has been deprecated in favor of using the\n      {@link OnBackPressedDispatcher} via {@link #getOnBackPressedDispatcher()}.\n      The OnBackPressedDispatcher controls how back button events are dispatched\n      to one or more {@link OnBackPressedCallback} objects.")
    @CallSuper
    @MainThread
    public void onBackPressed() {
        getOnBackPressedDispatcher().onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @CallSuper
    public void onConfigurationChanged(@p4.l Configuration newConfig) {
        l0.p(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<Consumer<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@p4.m Bundle bundle) {
        this.savedStateRegistryController.performRestore(bundle);
        this.contextAwareHelper.dispatchOnContextAvailable(this);
        super.onCreate(bundle);
        ReportFragment.Companion.injectIfNeededIn(this);
        int i5 = this.contentLayoutId;
        if (i5 != 0) {
            setContentView(i5);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i5, @p4.l Menu menu) {
        l0.p(menu, "menu");
        if (i5 == 0) {
            super.onCreatePanelMenu(i5, menu);
            this.menuHostHelper.onCreateMenu(menu, getMenuInflater());
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i5, @p4.l MenuItem item) {
        l0.p(item, "item");
        if (super.onMenuItemSelected(i5, item)) {
            return true;
        }
        if (i5 == 0) {
            return this.menuHostHelper.onMenuItemSelected(item);
        }
        return false;
    }

    @Override // android.app.Activity
    @kotlin.k(message = "Deprecated in android.app.Activity")
    @CallSuper
    public void onMultiWindowModeChanged(boolean z4) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new MultiWindowModeChangedInfo(z4));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    @CallSuper
    public void onNewIntent(@p4.l Intent intent) {
        l0.p(intent, "intent");
        super.onNewIntent(intent);
        Iterator<Consumer<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i5, @p4.l Menu menu) {
        l0.p(menu, "menu");
        this.menuHostHelper.onMenuClosed(menu);
        super.onPanelClosed(i5, menu);
    }

    @Override // android.app.Activity
    @kotlin.k(message = "Deprecated in android.app.Activity")
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z4) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new PictureInPictureModeChangedInfo(z4));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i5, @p4.m View view, @p4.l Menu menu) {
        l0.p(menu, "menu");
        if (i5 == 0) {
            super.onPreparePanel(i5, view, menu);
            this.menuHostHelper.onPrepareMenu(menu);
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @kotlin.k(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)} passing\n      in a {@link RequestMultiplePermissions} object for the {@link ActivityResultContract} and\n      handling the result in the {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    @CallSuper
    public void onRequestPermissionsResult(int i5, @p4.l String[] permissions, @p4.l int[] grantResults) {
        l0.p(permissions, "permissions");
        l0.p(grantResults, "grantResults");
        if (!this.activityResultRegistry.dispatchResult(i5, -1, new Intent().putExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSIONS, permissions).putExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSION_GRANT_RESULTS, grantResults))) {
            super.onRequestPermissionsResult(i5, permissions, grantResults);
        }
    }

    @kotlin.k(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    @p4.m
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    @p4.m
    public final Object onRetainNonConfigurationInstance() {
        NonConfigurationInstances nonConfigurationInstances;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ViewModelStore viewModelStore = this._viewModelStore;
        if (viewModelStore == null && (nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance()) != null) {
            viewModelStore = nonConfigurationInstances.getViewModelStore();
        }
        if (viewModelStore == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        NonConfigurationInstances nonConfigurationInstances2 = new NonConfigurationInstances();
        nonConfigurationInstances2.setCustom(onRetainCustomNonConfigurationInstance);
        nonConfigurationInstances2.setViewModelStore(viewModelStore);
        return nonConfigurationInstances2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    @CallSuper
    public void onSaveInstanceState(@p4.l Bundle outState) {
        l0.p(outState, "outState");
        if (getLifecycle() instanceof LifecycleRegistry) {
            Lifecycle lifecycle = getLifecycle();
            l0.n(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((LifecycleRegistry) lifecycle).setCurrentState(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.performSave(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @CallSuper
    public void onTrimMemory(int i5) {
        super.onTrimMemory(i5);
        Iterator<Consumer<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    @CallSuper
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    @Override // androidx.activity.contextaware.ContextAware
    @p4.m
    public Context peekAvailableContext() {
        return this.contextAwareHelper.peekAvailableContext();
    }

    @Override // androidx.activity.result.ActivityResultCaller
    @p4.l
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(@p4.l ActivityResultContract<I, O> contract, @p4.l ActivityResultRegistry registry, @p4.l ActivityResultCallback<O> callback) {
        l0.p(contract, "contract");
        l0.p(registry, "registry");
        l0.p(callback, "callback");
        return registry.register("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // androidx.core.view.MenuHost
    public void removeMenuProvider(@p4.l MenuProvider provider) {
        l0.p(provider, "provider");
        this.menuHostHelper.removeMenuProvider(provider);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void removeOnConfigurationChangedListener(@p4.l Consumer<Configuration> listener) {
        l0.p(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void removeOnContextAvailableListener(@p4.l OnContextAvailableListener listener) {
        l0.p(listener, "listener");
        this.contextAwareHelper.removeOnContextAvailableListener(listener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(@p4.l Consumer<MultiWindowModeChangedInfo> listener) {
        l0.p(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void removeOnNewIntentListener(@p4.l Consumer<Intent> listener) {
        l0.p(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(@p4.l Consumer<PictureInPictureModeChangedInfo> listener) {
        l0.p(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void removeOnTrimMemoryListener(@p4.l Consumer<Integer> listener) {
        l0.p(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    @Override // androidx.core.app.OnUserLeaveHintProvider
    public final void removeOnUserLeaveHintListener(@p4.l Runnable listener) {
        l0.p(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (Trace.isEnabled()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().fullyDrawnReported();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(@LayoutRes int i5) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        l0.o(decorView, "window.decorView");
        reportFullyDrawnExecutor.viewCreated(decorView);
        super.setContentView(i5);
    }

    @Override // android.app.Activity
    @kotlin.k(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(@p4.l Intent intent, int i5) {
        l0.p(intent, "intent");
        super.startActivityForResult(intent, i5);
    }

    @Override // android.app.Activity
    @kotlin.k(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(@p4.l IntentSender intent, int i5, @p4.m Intent intent2, int i6, int i7, int i8) throws IntentSender.SendIntentException {
        l0.p(intent, "intent");
        super.startIntentSenderForResult(intent, i5, intent2, i6, i7, i8);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(@p4.l MenuProvider provider, @p4.l LifecycleOwner owner) {
        l0.p(provider, "provider");
        l0.p(owner, "owner");
        this.menuHostHelper.addMenuProvider(provider, owner);
    }

    @Override // android.app.Activity
    @kotlin.k(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(@p4.l Intent intent, int i5, @p4.m Bundle bundle) {
        l0.p(intent, "intent");
        super.startActivityForResult(intent, i5, bundle);
    }

    @Override // android.app.Activity
    @kotlin.k(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(@p4.l IntentSender intent, int i5, @p4.m Intent intent2, int i6, int i7, int i8, @p4.m Bundle bundle) throws IntentSender.SendIntentException {
        l0.p(intent, "intent");
        super.startIntentSenderForResult(intent, i5, intent2, i6, i7, i8, bundle);
    }

    @Override // androidx.core.view.MenuHost
    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@p4.l MenuProvider provider, @p4.l LifecycleOwner owner, @p4.l Lifecycle.State state) {
        l0.p(provider, "provider");
        l0.p(owner, "owner");
        l0.p(state, "state");
        this.menuHostHelper.addMenuProvider(provider, owner, state);
    }

    @Override // androidx.activity.result.ActivityResultCaller
    @p4.l
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(@p4.l ActivityResultContract<I, O> contract, @p4.l ActivityResultCallback<O> callback) {
        l0.p(contract, "contract");
        l0.p(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    @RequiresApi(api = 26)
    @CallSuper
    public void onMultiWindowModeChanged(boolean z4, @p4.l Configuration newConfig) {
        l0.p(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z4, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new MultiWindowModeChangedInfo(z4, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    @RequiresApi(api = 26)
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z4, @p4.l Configuration newConfig) {
        l0.p(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z4, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new PictureInPictureModeChangedInfo(z4, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@p4.m View view) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        l0.o(decorView, "window.decorView");
        reportFullyDrawnExecutor.viewCreated(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@p4.m View view, @p4.m ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        l0.o(decorView, "window.decorView");
        reportFullyDrawnExecutor.viewCreated(decorView);
        super.setContentView(view, layoutParams);
    }

    @ContentView
    public ComponentActivity(@LayoutRes int i5) {
        this();
        this.contentLayoutId = i5;
    }
}
