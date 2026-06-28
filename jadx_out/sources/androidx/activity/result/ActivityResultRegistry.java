package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.MainThread;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.os.BundleCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.jvm.internal.w;
import kotlin.sequences.m;
import kotlin.sequences.s;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;

@i0(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\f\b&\u0018\u0000 ;2\u00020\u0001:\u0003<;=B\u0007¢\u0006\u0004\b9\u0010:J8\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0002J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002JI\u0010\u0018\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0012\u001a\u00020\u00052\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\u0015\u001a\u00028\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H'¢\u0006\u0004\b\u0018\u0010\u0019JJ\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cJB\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cJ\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b \u0010!J\u000e\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#J\u0010\u0010'\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010#J\"\u0010)\u001a\u00020(2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J%\u0010)\u001a\u00020(\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010*\u001a\u00028\u0000H\u0007¢\u0006\u0004\b)\u0010+R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R \u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002000,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0003028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R$\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010.R\"\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010.R\u0014\u00107\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006>"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry;", "", "O", "", DatabaseFileArchive.COLUMN_KEY, "", "resultCode", "Landroid/content/Intent;", "data", "Landroidx/activity/result/ActivityResultRegistry$CallbackAndContract;", "callbackAndContract", "Lkotlin/r2;", "doDispatch", "registerKey", "generateRandomNumber", "rc", "bindRcKey", "I", "requestCode", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "input", "Landroidx/core/app/ActivityOptionsCompat;", "options", "onLaunch", "(ILandroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/activity/result/ActivityResultCallback;", "callback", "Landroidx/activity/result/ActivityResultLauncher;", "register", "unregister$activity_release", "(Ljava/lang/String;)V", "unregister", "Landroid/os/Bundle;", "outState", "onSaveInstanceState", "savedInstanceState", "onRestoreInstanceState", "", "dispatchResult", "result", "(ILjava/lang/Object;)Z", "", "rcToKey", "Ljava/util/Map;", "keyToRc", "Landroidx/activity/result/ActivityResultRegistry$LifecycleContainer;", "keyToLifecycleContainers", "", "launchedKeys", "Ljava/util/List;", "keyToCallback", "parsedPendingResults", "pendingResults", "Landroid/os/Bundle;", "<init>", "()V", "Companion", "CallbackAndContract", "LifecycleContainer", "activity_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,447:1\n123#2,2:448\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry\n*L\n401#1:448,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    @l
    private static final Companion Companion = new Companion(null);
    private static final int INITIAL_REQUEST_CODE_VALUE = 65536;

    @l
    private static final String KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";

    @l
    private static final String KEY_COMPONENT_ACTIVITY_PENDING_RESULTS = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";

    @l
    private static final String KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";

    @l
    private static final String KEY_COMPONENT_ACTIVITY_REGISTERED_RCS = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";

    @l
    private static final String LOG_TAG = "ActivityResultRegistry";

    @l
    private final Map<Integer, String> rcToKey = new LinkedHashMap();

    @l
    private final Map<String, Integer> keyToRc = new LinkedHashMap();

    @l
    private final Map<String, LifecycleContainer> keyToLifecycleContainers = new LinkedHashMap();

    @l
    private final List<String> launchedKeys = new ArrayList();

    @l
    private final transient Map<String, CallbackAndContract<?>> keyToCallback = new LinkedHashMap();

    @l
    private final Map<String, Object> parsedPendingResults = new LinkedHashMap();

    @l
    private final Bundle pendingResults = new Bundle();

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$CallbackAndContract;", "O", "", "callback", "Landroidx/activity/result/ActivityResultCallback;", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "(Landroidx/activity/result/ActivityResultCallback;Landroidx/activity/result/contract/ActivityResultContract;)V", "getCallback", "()Landroidx/activity/result/ActivityResultCallback;", "getContract", "()Landroidx/activity/result/contract/ActivityResultContract;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class CallbackAndContract<O> {

        @l
        private final ActivityResultCallback<O> callback;

        @l
        private final ActivityResultContract<?, O> contract;

        public CallbackAndContract(@l ActivityResultCallback<O> callback, @l ActivityResultContract<?, O> contract) {
            l0.p(callback, "callback");
            l0.p(contract, "contract");
            this.callback = callback;
            this.contract = contract;
        }

        @l
        public final ActivityResultCallback<O> getCallback() {
            return this.callback;
        }

        @l
        public final ActivityResultContract<?, O> getContract() {
            return this.contract;
        }
    }

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$Companion;", "", "()V", "INITIAL_REQUEST_CODE_VALUE", "", ActivityResultRegistry.KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS, "", "KEY_COMPONENT_ACTIVITY_PENDING_RESULTS", ActivityResultRegistry.KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS, ActivityResultRegistry.KEY_COMPONENT_ACTIVITY_REGISTERED_RCS, "LOG_TAG", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$LifecycleContainer;", "", "Landroidx/lifecycle/LifecycleEventObserver;", "observer", "Lkotlin/r2;", "addObserver", "clearObservers", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "", "observers", "Ljava/util/List;", "<init>", "(Landroidx/lifecycle/Lifecycle;)V", "activity_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry$LifecycleContainer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,447:1\n1855#2,2:448\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry$LifecycleContainer\n*L\n425#1:448,2\n*E\n"})
    /* loaded from: classes.dex */
    public static final class LifecycleContainer {

        @l
        private final Lifecycle lifecycle;

        @l
        private final List<LifecycleEventObserver> observers;

        public LifecycleContainer(@l Lifecycle lifecycle) {
            l0.p(lifecycle, "lifecycle");
            this.lifecycle = lifecycle;
            this.observers = new ArrayList();
        }

        public final void addObserver(@l LifecycleEventObserver observer) {
            l0.p(observer, "observer");
            this.lifecycle.addObserver(observer);
            this.observers.add(observer);
        }

        public final void clearObservers() {
            Iterator<T> it = this.observers.iterator();
            while (it.hasNext()) {
                this.lifecycle.removeObserver((LifecycleEventObserver) it.next());
            }
            this.observers.clear();
        }

        @l
        public final Lifecycle getLifecycle() {
            return this.lifecycle;
        }
    }

    private final void bindRcKey(int i5, String str) {
        this.rcToKey.put(Integer.valueOf(i5), str);
        this.keyToRc.put(str, Integer.valueOf(i5));
    }

    private final <O> void doDispatch(String str, int i5, Intent intent, CallbackAndContract<O> callbackAndContract) {
        ActivityResultCallback<O> activityResultCallback;
        if (callbackAndContract != null) {
            activityResultCallback = callbackAndContract.getCallback();
        } else {
            activityResultCallback = null;
        }
        if (activityResultCallback != null && this.launchedKeys.contains(str)) {
            callbackAndContract.getCallback().onActivityResult(callbackAndContract.getContract().parseResult(i5, intent));
            this.launchedKeys.remove(str);
        } else {
            this.parsedPendingResults.remove(str);
            this.pendingResults.putParcelable(str, new ActivityResult(i5, intent));
        }
    }

    private final int generateRandomNumber() {
        m<Number> m5;
        m5 = s.m(ActivityResultRegistry$generateRandomNumber$1.INSTANCE);
        for (Number number : m5) {
            if (!this.rcToKey.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$1(ActivityResultRegistry this$0, String key, ActivityResultCallback callback, ActivityResultContract contract, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        l0.p(this$0, "this$0");
        l0.p(key, "$key");
        l0.p(callback, "$callback");
        l0.p(contract, "$contract");
        l0.p(lifecycleOwner, "<anonymous parameter 0>");
        l0.p(event, "event");
        if (Lifecycle.Event.ON_START == event) {
            this$0.keyToCallback.put(key, new CallbackAndContract<>(callback, contract));
            if (this$0.parsedPendingResults.containsKey(key)) {
                Object obj = this$0.parsedPendingResults.get(key);
                this$0.parsedPendingResults.remove(key);
                callback.onActivityResult(obj);
            }
            ActivityResult activityResult = (ActivityResult) BundleCompat.getParcelable(this$0.pendingResults, key, ActivityResult.class);
            if (activityResult != null) {
                this$0.pendingResults.remove(key);
                callback.onActivityResult(contract.parseResult(activityResult.getResultCode(), activityResult.getData()));
                return;
            }
            return;
        }
        if (Lifecycle.Event.ON_STOP == event) {
            this$0.keyToCallback.remove(key);
        } else if (Lifecycle.Event.ON_DESTROY == event) {
            this$0.unregister$activity_release(key);
        }
    }

    private final void registerKey(String str) {
        if (this.keyToRc.get(str) != null) {
            return;
        }
        bindRcKey(generateRandomNumber(), str);
    }

    @MainThread
    public final boolean dispatchResult(int i5, int i6, @p4.m Intent intent) {
        String str = this.rcToKey.get(Integer.valueOf(i5));
        if (str == null) {
            return false;
        }
        doDispatch(str, i6, intent, this.keyToCallback.get(str));
        return true;
    }

    @MainThread
    public abstract <I, O> void onLaunch(int i5, @l ActivityResultContract<I, O> activityResultContract, I i6, @p4.m ActivityOptionsCompat activityOptionsCompat);

    public final void onRestoreInstanceState(@p4.m Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS);
        if (stringArrayList != null && integerArrayList != null) {
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS);
            if (stringArrayList2 != null) {
                this.launchedKeys.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundle.getBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS);
            if (bundle2 != null) {
                this.pendingResults.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                String str = stringArrayList.get(i5);
                if (this.keyToRc.containsKey(str)) {
                    Integer remove = this.keyToRc.remove(str);
                    if (!this.pendingResults.containsKey(str)) {
                        u1.k(this.rcToKey).remove(remove);
                    }
                }
                Integer num = integerArrayList.get(i5);
                l0.o(num, "rcs[i]");
                int intValue = num.intValue();
                String str2 = stringArrayList.get(i5);
                l0.o(str2, "keys[i]");
                bindRcKey(intValue, str2);
            }
        }
    }

    public final void onSaveInstanceState(@l Bundle outState) {
        l0.p(outState, "outState");
        outState.putIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS, new ArrayList<>(this.keyToRc.values()));
        outState.putStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS, new ArrayList<>(this.keyToRc.keySet()));
        outState.putStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS, new ArrayList<>(this.launchedKeys));
        outState.putBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS, new Bundle(this.pendingResults));
    }

    @l
    public final <I, O> ActivityResultLauncher<I> register(@l final String key, @l LifecycleOwner lifecycleOwner, @l final ActivityResultContract<I, O> contract, @l final ActivityResultCallback<O> callback) {
        l0.p(key, "key");
        l0.p(lifecycleOwner, "lifecycleOwner");
        l0.p(contract, "contract");
        l0.p(callback, "callback");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (!lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            registerKey(key);
            LifecycleContainer lifecycleContainer = this.keyToLifecycleContainers.get(key);
            if (lifecycleContainer == null) {
                lifecycleContainer = new LifecycleContainer(lifecycle);
            }
            lifecycleContainer.addObserver(new LifecycleEventObserver() { // from class: androidx.activity.result.c
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    ActivityResultRegistry.register$lambda$1(ActivityResultRegistry.this, key, callback, contract, lifecycleOwner2, event);
                }
            });
            this.keyToLifecycleContainers.put(key, lifecycleContainer);
            return new ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry$register$2
                @Override // androidx.activity.result.ActivityResultLauncher
                @l
                public ActivityResultContract<I, ?> getContract() {
                    return (ActivityResultContract<I, ?>) contract;
                }

                @Override // androidx.activity.result.ActivityResultLauncher
                public void launch(I i5, @p4.m ActivityOptionsCompat activityOptionsCompat) {
                    Map map;
                    List list;
                    List list2;
                    map = ActivityResultRegistry.this.keyToRc;
                    Object obj = map.get(key);
                    Object obj2 = contract;
                    if (obj != null) {
                        int intValue = ((Number) obj).intValue();
                        list = ActivityResultRegistry.this.launchedKeys;
                        list.add(key);
                        try {
                            ActivityResultRegistry.this.onLaunch(intValue, contract, i5, activityOptionsCompat);
                            return;
                        } catch (Exception e5) {
                            list2 = ActivityResultRegistry.this.launchedKeys;
                            list2.remove(key);
                            throw e5;
                        }
                    }
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + i5 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }

                @Override // androidx.activity.result.ActivityResultLauncher
                public void unregister() {
                    ActivityResultRegistry.this.unregister$activity_release(key);
                }
            };
        }
        throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.").toString());
    }

    @MainThread
    public final void unregister$activity_release(@l String key) {
        Integer remove;
        l0.p(key, "key");
        if (!this.launchedKeys.contains(key) && (remove = this.keyToRc.remove(key)) != null) {
            this.rcToKey.remove(remove);
        }
        this.keyToCallback.remove(key);
        if (this.parsedPendingResults.containsKey(key)) {
            Log.w(LOG_TAG, "Dropping pending result for request " + key + ": " + this.parsedPendingResults.get(key));
            this.parsedPendingResults.remove(key);
        }
        if (this.pendingResults.containsKey(key)) {
            Log.w(LOG_TAG, "Dropping pending result for request " + key + ": " + ((ActivityResult) BundleCompat.getParcelable(this.pendingResults, key, ActivityResult.class)));
            this.pendingResults.remove(key);
        }
        LifecycleContainer lifecycleContainer = this.keyToLifecycleContainers.get(key);
        if (lifecycleContainer != null) {
            lifecycleContainer.clearObservers();
            this.keyToLifecycleContainers.remove(key);
        }
    }

    @MainThread
    public final <O> boolean dispatchResult(int i5, O o5) {
        String str = this.rcToKey.get(Integer.valueOf(i5));
        if (str == null) {
            return false;
        }
        CallbackAndContract<?> callbackAndContract = this.keyToCallback.get(str);
        if ((callbackAndContract != null ? callbackAndContract.getCallback() : null) == null) {
            this.pendingResults.remove(str);
            this.parsedPendingResults.put(str, o5);
            return true;
        }
        ActivityResultCallback<?> callback = callbackAndContract.getCallback();
        l0.n(callback, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.launchedKeys.remove(str)) {
            return true;
        }
        callback.onActivityResult(o5);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final <I, O> ActivityResultLauncher<I> register(@l final String key, @l final ActivityResultContract<I, O> contract, @l ActivityResultCallback<O> callback) {
        l0.p(key, "key");
        l0.p(contract, "contract");
        l0.p(callback, "callback");
        registerKey(key);
        this.keyToCallback.put(key, new CallbackAndContract<>(callback, contract));
        if (this.parsedPendingResults.containsKey(key)) {
            Object obj = this.parsedPendingResults.get(key);
            this.parsedPendingResults.remove(key);
            callback.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) BundleCompat.getParcelable(this.pendingResults, key, ActivityResult.class);
        if (activityResult != null) {
            this.pendingResults.remove(key);
            callback.onActivityResult(contract.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
        return new ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry$register$3
            @Override // androidx.activity.result.ActivityResultLauncher
            @l
            public ActivityResultContract<I, ?> getContract() {
                return (ActivityResultContract<I, ?>) contract;
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void launch(I i5, @p4.m ActivityOptionsCompat activityOptionsCompat) {
                Map map;
                List list;
                List list2;
                map = ActivityResultRegistry.this.keyToRc;
                Object obj2 = map.get(key);
                Object obj3 = contract;
                if (obj2 != null) {
                    int intValue = ((Number) obj2).intValue();
                    list = ActivityResultRegistry.this.launchedKeys;
                    list.add(key);
                    try {
                        ActivityResultRegistry.this.onLaunch(intValue, contract, i5, activityOptionsCompat);
                        return;
                    } catch (Exception e5) {
                        list2 = ActivityResultRegistry.this.launchedKeys;
                        list2.remove(key);
                        throw e5;
                    }
                }
                throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj3 + " and input " + i5 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void unregister() {
                ActivityResultRegistry.this.unregister$activity_release(key);
            }
        };
    }
}
