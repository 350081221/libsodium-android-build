package com.yuanqi.master.addapp;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.util.Log;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.android.multidex.ClassPathElement;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.lody.virtual.GmsSupport;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.helper.utils.Reflect;
import com.lody.virtual.remote.InstalledAppInfo;
import com.lody.virtual.remote.VAppInstallerParams;
import com.ss.android.download.api.constant.BaseConstants;
import com.yuanqi.group.App;
import com.yuanqi.group.home.models.AppInfoLite;
import com.yuanqi.master.BaseViewModel;
import com.yuanqi.master.addapp.AddAppActivity;
import com.yuanqi.master.addapp.AddAppViewModel;
import com.yuanqi.master.config.a;
import com.yuanqi.master.network.model.response.ConfigResponse;
import com.yuanqi.master.tools.a1;
import com.yuanqi.master.tools.f1;
import com.yuanqi.master.tools.o0;
import com.yuanqi.master.tools.q0;
import com.yuanqi.master.tools.t0;
import com.yuanqi.master.tools.v0;
import com.yuanqi.master.tools.x0;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.collections.a0;
import kotlin.collections.e0;
import kotlin.collections.x;
import kotlin.d0;
import kotlin.e1;
import kotlin.f0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k0;
import kotlin.r2;
import kotlin.reflect.o;
import kotlin.text.h0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.s0;
import v3.l;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 «\u00012\u00020\u0001:\u0002«\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020nH\u0002J\u000e\u0010o\u001a\u00020l2\u0006\u0010m\u001a\u00020nJ(\u0010p\u001a\u00020l2\u0006\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020\u00042\u0006\u0010t\u001a\u00020u2\u0006\u0010v\u001a\u00020wH\u0002J\b\u0010x\u001a\u00020lH\u0002J\u000e\u0010y\u001a\u00020l2\u0006\u0010z\u001a\u00020{J\u0014\u0010|\u001a\u00020l2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020\u000706J\u0006\u0010~\u001a\u00020lJ\u000f\u0010\u007f\u001a\u0002092\u0007\u0010\u0080\u0001\u001a\u00020\u0004J*\u0010\u007f\u001a\u0002092\u0017\u0010\u0081\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0014j\b\u0012\u0004\u0012\u00020\u0007`\u00162\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0004J\u000f\u0010\u0082\u0001\u001a\u0002092\u0006\u0010m\u001a\u00020nJ\u001b\u0010\u0083\u0001\u001a\u00020l2\b\u0010\u0084\u0001\u001a\u00030\u0085\u00012\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001J\u0019\u0010\u0087\u0001\u001a\u00020l2\u0007\u0010\u0088\u0001\u001a\u00020r2\u0007\u0010\u0089\u0001\u001a\u00020rJ=\u0010\u008a\u0001\u001a\u00020l2\u0006\u0010m\u001a\u00020n2\u0016\u0010\u008b\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u008d\u0001\u0012\u0005\u0012\u00030\u008e\u00010\u008c\u00012\u0014\u0010\u008f\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002090\u008c\u0001J'\u0010\u0090\u0001\u001a\u00020l2\u0006\u0010m\u001a\u00020n2\u0016\u0010\u0091\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u008d\u0001\u0012\u0005\u0012\u00030\u008e\u00010\u008c\u0001J'\u0010\u0092\u0001\u001a\u00020l2\u0006\u0010m\u001a\u00020n2\u0016\u0010\u0091\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u008d\u0001\u0012\u0005\u0012\u00030\u008e\u00010\u008c\u0001J\u000f\u0010\u0093\u0001\u001a\u00020l2\u0006\u0010m\u001a\u00020nJ\u0007\u0010\u0094\u0001\u001a\u00020lJ\u000f\u0010\u0095\u0001\u001a\u00020l2\u0006\u0010m\u001a\u00020nJ\u000f\u0010\u0096\u0001\u001a\u00020l2\u0006\u0010z\u001a\u00020{J\u000f\u0010\u0097\u0001\u001a\u00020l2\u0006\u0010m\u001a\u00020nJ\u000f\u0010\u0098\u0001\u001a\u00020l2\u0006\u0010m\u001a\u00020nJ\u000f\u0010\u0099\u0001\u001a\u00020l2\u0006\u0010m\u001a\u00020nJ\u000f\u0010\u009a\u0001\u001a\u00020l2\u0006\u0010m\u001a\u00020nJ'\u0010\u009a\u0001\u001a\u00020l2\u0006\u0010m\u001a\u00020n2\u0016\u0010\u009b\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u008d\u0001\u0012\u0005\u0012\u00030\u008e\u00010\u008c\u0001J\u000f\u0010\u009c\u0001\u001a\u00020l2\u0006\u0010m\u001a\u00020nJ\u0007\u0010\u009d\u0001\u001a\u00020lJ\u0007\u0010\u009e\u0001\u001a\u00020lJ\u0019\u0010\u009f\u0001\u001a\u00020l2\u0006\u0010m\u001a\u00020n2\b\u0010 \u0001\u001a\u00030¡\u0001J\u000f\u0010¢\u0001\u001a\u00020l2\u0006\u0010m\u001a\u00020nJ.\u0010£\u0001\u001a\u00020l2\u0006\u0010m\u001a\u00020n2\u0007\u0010¤\u0001\u001a\u0002092\u0014\u0010\u008f\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002090\u008c\u0001J\u000f\u0010¥\u0001\u001a\u00020l2\u0006\u0010m\u001a\u00020nJ\u000f\u0010¦\u0001\u001a\u00020l2\u0006\u0010m\u001a\u00020nJ\u0012\u0010§\u0001\u001a\u00020l2\u0007\u0010¨\u0001\u001a\u00020rH\u0002J\u0018\u0010©\u0001\u001a\u00020l2\u0006\u0010q\u001a\u00020r2\u0007\u0010ª\u0001\u001a\u00020rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR0\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u00160\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020$0\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018R+\u0010+\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020$8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\"\u001a\u0004\b,\u0010&\"\u0004\b-\u0010(R\u0019\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000400¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R6\u00104\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040605j\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000406`7X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u00108\u001a\u0002098F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u0002090\u0013¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0018R\u0011\u0010>\u001a\u0002098F¢\u0006\u0006\u001a\u0004\b?\u0010;R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u0006¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\tR\u001c\u0010C\u001a\u0004\u0018\u00010DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010I\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u001e\"\u0004\bK\u0010 R+\u0010L\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010\"\u001a\u0004\bM\u0010\u001e\"\u0004\bN\u0010 R\u0011\u0010P\u001a\u00020Q¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0017\u0010T\u001a\b\u0012\u0004\u0012\u0002090\u0013¢\u0006\b\n\u0000\u001a\u0004\bU\u0010\u0018R\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013¢\u0006\b\n\u0000\u001a\u0004\bW\u0010\u0018R+\u0010X\u001a\u0002092\u0006\u0010\u001b\u001a\u0002098F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u0010\"\u001a\u0004\bY\u0010;\"\u0004\bZ\u0010[R\u0017\u0010]\u001a\b\u0012\u0004\u0012\u0002090\u0013¢\u0006\b\n\u0000\u001a\u0004\b^\u0010\u0018R\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013¢\u0006\b\n\u0000\u001a\u0004\b`\u0010\u0018R0\u0010a\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020b0\u0014j\b\u0012\u0004\u0012\u00020b`\u00160\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\u0018\"\u0004\bd\u0010\u001aR\u0017\u0010e\u001a\b\u0012\u0004\u0012\u00020f0\u0006¢\u0006\b\n\u0000\u001a\u0004\bg\u0010\tR\u001a\u0010h\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\u001e\"\u0004\bj\u0010 ¨\u0006¬\u0001"}, d2 = {"Lcom/yuanqi/master/addapp/AddAppViewModel;", "Lcom/yuanqi/master/BaseViewModel;", "()V", "TAG", "", "appFileList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/yuanqi/group/home/models/AppInfo;", "getAppFileList", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "setAppFileList", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;)V", "appInstallList", "getAppInstallList", "setAppInstallList", "appInstallListSearch", "getAppInstallListSearch", "setAppInstallListSearch", "appList", "Landroidx/compose/runtime/MutableState;", "Ljava/util/ArrayList;", "Lcom/yuanqi/group/home/models/MultiplePackageAppData;", "Lkotlin/collections/ArrayList;", "getAppList", "()Landroidx/compose/runtime/MutableState;", "setAppList", "(Landroidx/compose/runtime/MutableState;)V", "<set-?>", "appNameList", "getAppNameList", "()Ljava/lang/String;", "setAppNameList", "(Ljava/lang/String;)V", "appNameList$delegate", "Lcom/yuanqi/master/tools/MVFast;", "appNum", "", "getAppNum", "()I", "setAppNum", "(I)V", "displayAppNum", "getDisplayAppNum", "displayNumValue", "getDisplayNumValue", "setDisplayNumValue", "displayNumValue$delegate", "googlePkgs", "", "getGooglePkgs", "()[Ljava/lang/String;", "[Ljava/lang/String;", "hashMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "haveAllFilePress", "", "getHaveAllFilePress", "()Z", "haveLastVersion", "getHaveLastVersion", "haveQueryAppPermission", "getHaveQueryAppPermission", "indexSets", "", "getIndexSets", "mRepository", "Lcom/yuanqi/group/home/repo/AppRepository;", "getMRepository", "()Lcom/yuanqi/group/home/repo/AppRepository;", "setMRepository", "(Lcom/yuanqi/group/home/repo/AppRepository;)V", "originalUrl", "getOriginalUrl", "setOriginalUrl", "packageNameList", "getPackageNameList", "setPackageNameList", "packageNameList$delegate", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "selectFileScreen", "getSelectFileScreen", "showChar", "getShowChar", com.yuanqi.master.config.c.O, "getShowFirstAddApp", "setShowFirstAddApp", "(Z)V", "showFirstAddApp$delegate", "showLoading", "getShowLoading", "showLoadingText", "getShowLoadingText", "sortAppList", "Lcom/yuanqi/master/config/SortApp;", "getSortAppList", "setSortAppList", "versionList", "Lcom/yuanqi/master/addapp/update/model/VersionData;", "getVersionList", TTDownloadField.TT_WEB_TITLE, "getWebTitle", "setWebTitle", "checkAndWriteDefaultContentIfEmpty", "", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "checkUpDate", "compressDirectory", "sourceDir", "Ljava/io/File;", "parentPath", "zos", "Ljava/util/zip/ZipOutputStream;", "buffer", "", "getInstalledApp", "initRepo", "activity", "Landroid/app/Activity;", "installApps", "appInfos", "installGoogleTools", "isExist", TTDownloadField.TT_PACKAGE_NAME, "appInfoList", "isIgnoringBatteryOptimizations", "move", TypedValues.TransitionType.S_FROM, "Lorg/burnoutcrew/reorderable/ItemPosition;", TypedValues.TransitionType.S_TO, "moveFile", "sourceFile", "targetDir", "openAllFilesAccessSettings", "allFilesAccessPermissionResultLauncher", "Landroidx/activity/compose/ManagedActivityResultLauncher;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResult;", "storagePermissionResultLauncher", "openFullScreenNotificationSettings", "notificationPermissionResultLauncher", "openNotificationSettings", "openStartInterface", "readConfig", "requestAllApp", "requestApkFile", "requestFloating", "requestGPS", "requestIgnoreBatteryOptimizations", "requestShortCut", "activityResultLauncher", "requestStorage", "restoreData", "saveConfig", "setLocale", "newLocale", "Ljava/util/Locale;", "showBackupFileDialog", "showFilePermissionDialog", "backup", "startBackup", "startToAutoStartSetting", "writeDefaultContent", "xmlFile", "zipDirectory", "zipFile", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nAddAppViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddAppViewModel.kt\ncom/yuanqi/master/addapp/AddAppViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1103:1\n1747#2,3:1104\n1#3:1107\n*S KotlinDebug\n*F\n+ 1 AddAppViewModel.kt\ncom/yuanqi/master/addapp/AddAppViewModel\n*L\n194#1:1104,3\n*E\n"})
/* loaded from: classes3.dex */
public final class AddAppViewModel extends BaseViewModel {

    @p4.l
    private static final d0<AddAppViewModel> D;

    @p4.l
    private static final com.yuanqi.master.database.dao.c E;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final String f14436b;

    /* renamed from: c, reason: collision with root package name */
    private int f14437c;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private String f14438d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private String f14439e;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private final SnapshotStateList<u2.c> f14440f;

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    private final s0 f14441g;

    /* renamed from: h, reason: collision with root package name */
    @p4.l
    private final MutableState<String> f14442h;

    /* renamed from: i, reason: collision with root package name */
    @p4.l
    private MutableState<ArrayList<com.yuanqi.group.home.models.h>> f14443i;

    /* renamed from: j, reason: collision with root package name */
    @p4.l
    private MutableState<ArrayList<com.yuanqi.master.config.e>> f14444j;

    /* renamed from: k, reason: collision with root package name */
    @p4.l
    private final MutableState<Boolean> f14445k;

    /* renamed from: l, reason: collision with root package name */
    @p4.l
    private final MutableState<String> f14446l;

    /* renamed from: m, reason: collision with root package name */
    @p4.l
    private final String[] f14447m;

    /* renamed from: n, reason: collision with root package name */
    @p4.l
    private final MutableState<Integer> f14448n;

    /* renamed from: o, reason: collision with root package name */
    @p4.m
    private t2.f f14449o;

    /* renamed from: p, reason: collision with root package name */
    @p4.l
    private SnapshotStateList<com.yuanqi.group.home.models.c> f14450p;

    /* renamed from: q, reason: collision with root package name */
    @p4.l
    private SnapshotStateList<com.yuanqi.group.home.models.c> f14451q;

    /* renamed from: r, reason: collision with root package name */
    @p4.l
    private SnapshotStateList<com.yuanqi.group.home.models.c> f14452r;

    /* renamed from: s, reason: collision with root package name */
    @p4.l
    private final SnapshotStateList<Character> f14453s;

    /* renamed from: t, reason: collision with root package name */
    @p4.l
    private final MutableState<Boolean> f14454t;

    /* renamed from: u, reason: collision with root package name */
    @p4.l
    private final x0 f14455u;

    /* renamed from: v, reason: collision with root package name */
    @p4.l
    private final x0 f14456v;

    /* renamed from: w, reason: collision with root package name */
    @p4.l
    private final x0 f14457w;

    /* renamed from: x, reason: collision with root package name */
    @p4.l
    private final x0 f14458x;

    /* renamed from: y, reason: collision with root package name */
    @p4.l
    private final MutableState<Boolean> f14459y;

    /* renamed from: z, reason: collision with root package name */
    @p4.l
    private final HashMap<String, List<String>> f14460z;
    static final /* synthetic */ o<Object>[] B = {l1.k(new kotlin.jvm.internal.x0(AddAppViewModel.class, "appNameList", "getAppNameList()Ljava/lang/String;", 0)), l1.k(new kotlin.jvm.internal.x0(AddAppViewModel.class, "packageNameList", "getPackageNameList()Ljava/lang/String;", 0)), l1.k(new kotlin.jvm.internal.x0(AddAppViewModel.class, "displayNumValue", "getDisplayNumValue()I", 0)), l1.k(new kotlin.jvm.internal.x0(AddAppViewModel.class, com.yuanqi.master.config.c.O, "getShowFirstAddApp()Z", 0))};

    @p4.l
    public static final b A = new b(null);
    public static final int C = 8;

    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/yuanqi/master/addapp/AddAppViewModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class a extends n0 implements v3.a<AddAppViewModel> {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final AddAppViewModel invoke() {
            return new AddAppViewModel(null);
        }
    }

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/yuanqi/master/addapp/AddAppViewModel$Companion;", "", "()V", "appNoteDao", "Lcom/yuanqi/master/database/dao/AppNoteDao;", "getAppNoteDao", "()Lcom/yuanqi/master/database/dao/AppNoteDao;", "instance", "Lcom/yuanqi/master/addapp/AddAppViewModel;", "getInstance", "()Lcom/yuanqi/master/addapp/AddAppViewModel;", "instance$delegate", "Lkotlin/Lazy;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(w wVar) {
            this();
        }

        @p4.l
        public final com.yuanqi.master.database.dao.c a() {
            return AddAppViewModel.E;
        }

        @p4.l
        public final AddAppViewModel b() {
            return (AddAppViewModel) AddAppViewModel.D.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lcom/yuanqi/master/network/model/response/ConfigResponse;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends n0 implements v3.l<ConfigResponse, r2> {
        final /* synthetic */ Context $context;
        final /* synthetic */ AddAppViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, AddAppViewModel addAppViewModel) {
            super(1);
            this.$context = context;
            this.this$0 = addAppViewModel;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(ConfigResponse configResponse) {
            invoke2(configResponse);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m ConfigResponse configResponse) {
            int e5 = v0.f15260a.e(this.$context);
            if (configResponse != null) {
                this.this$0.t().setValue(Boolean.valueOf(e5 < configResponse.getVersion()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends n0 implements v3.l<String, r2> {
        d() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            l0.p(it, "it");
            AddAppViewModel.this.t().setValue(Boolean.FALSE);
        }
    }

    @i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001j\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0003`\u0004¨\u0006\u0005"}, d2 = {"com/yuanqi/master/addapp/AddAppViewModel$hashMap$1", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends HashMap<String, List<? extends String>> {
        e() {
            List P;
            List P2;
            List P3;
            List P4;
            List P5;
            List P6;
            List P7;
            List P8;
            List P9;
            List P10;
            List P11;
            List P12;
            List P13;
            List P14;
            List P15;
            List P16;
            List P17;
            List P18;
            List P19;
            P = kotlin.collections.w.P("com.miui.securitycenter/com.miui.permcenter.autostart.AutoStartManagementActivity", "com.miui.securitycenter");
            put("Xiaomi", P);
            P2 = kotlin.collections.w.P("com.samsung.android.sm_cn/com.samsung.android.sm.ui.ram.AutoRunActivity", "com.samsung.android.sm_cn/com.samsung.android.sm.ui.appmanagement.AppManagementActivity", "com.samsung.android.sm_cn/com.samsung.android.sm.ui.cstyleboard.SmartManagerDashBoardActivity", "com.samsung.android.sm_cn/.ui.ram.RamActivity", "com.samsung.android.sm_cn/.app.dashboard.SmartManagerDashBoardActivity", "com.samsung.android.sm/com.samsung.android.sm.ui.ram.AutoRunActivity", "com.samsung.android.sm/com.samsung.android.sm.ui.appmanagement.AppManagementActivity", "com.samsung.android.sm/com.samsung.android.sm.ui.cstyleboard.SmartManagerDashBoardActivity", "com.samsung.android.sm/.ui.ram.RamActivity", "com.samsung.android.sm/.app.dashboard.SmartManagerDashBoardActivity", "com.samsung.android.lool/com.samsung.android.sm.ui.battery.BatteryActivity", "com.samsung.android.sm_cn", "com.samsung.android.sm");
            put("samsung", P2);
            P3 = kotlin.collections.w.P("com.huawei.systemmanager/.startupmgr.ui.StartupNormalAppListActivity", "com.huawei.systemmanager/.appcontrol.activity.StartupAppControlActivity", "com.huawei.systemmanager/.optimize.process.ProtectActivity", "com.huawei.systemmanager/.optimize.bootstart.BootStartActivity", "com.huawei.systemmanager");
            put("HUAWEI", P3);
            P4 = kotlin.collections.w.P("com.iqoo.secure/.ui.phoneoptimize.BgStartUpManager", "com.iqoo.secure/.safeguard.PurviewTabActivity", "com.vivo.permissionmanager/.activity.BgStartUpManagerActivity", "com.iqoo.secure", "com.vivo.permissionmanager");
            put("vivo", P4);
            P5 = kotlin.collections.w.P("com.meizu.safe/.permission.SmartBGActivity", "com.meizu.safe/.permission.PermissionMainActivity", "com.meizu.safe");
            put("Meizu", P5);
            P6 = kotlin.collections.w.P("com.coloros.safecenter/.startupapp.StartupAppListActivity", "com.coloros.safecenter/.permission.startup.StartupAppListActivity", "com.oppo.safe/.permission.startup.StartupAppListActivity", "com.coloros.oppoguardelf/com.coloros.powermanager.fuelgaue.PowerUsageModelActivity", "com.coloros.safecenter/com.coloros.privacypermissionsentry.PermissionTopActivity", "com.coloros.safecenter", "com.oppo.safe", "com.coloros.oppoguardelf");
            put(BaseConstants.ROM_OPPO_UPPER_CONSTANT, P6);
            P7 = kotlin.collections.w.P("com.oneplus.security/.chainlaunch.view.ChainLaunchAppListActivity", "com.oneplus.security");
            put("oneplus", P7);
            P8 = kotlin.collections.w.P("com.letv.android.letvsafe/.AutobootManageActivity", "com.letv.android.letvsafe/.BackgroundAppManageActivity", "com.letv.android.letvsafe");
            put("letv", P8);
            P9 = kotlin.collections.w.P("com.zte.heartyservice/.autorun.AppAutoRunManager", "com.zte.heartyservice");
            put("zte", P9);
            P10 = kotlin.collections.w.P("com.gionee.softmanager/.MainActivity", "com.gionee.softmanager");
            put("F", P10);
            P11 = kotlin.collections.w.P("com.smartisanos.security/.invokeHistory.InvokeHistoryActivity", "com.smartisanos.security");
            put("smartisanos", P11);
            P12 = kotlin.collections.w.P("com.yulong.android.coolsafe/.ui.activity.autorun.AutoRunListActivity", "com.yulong.android.coolsafe");
            put("360", P12);
            P13 = kotlin.collections.w.P("com.yulong.android.coolsafe/.ui.activity.autorun.AutoRunListActivity", "com.yulong.android.coolsafe");
            put("ulong", P13);
            P14 = kotlin.collections.w.P("com.yulong.android.security/com.yulong.android.seccenter.tabbarmain", "com.yulong.android.security");
            put("coolpad", P14);
            P15 = kotlin.collections.w.P("com.lenovo.security/.purebackground.PureBackgroundActivity", "com.lenovo.security");
            put("lenovo", P15);
            P16 = kotlin.collections.w.P("com.htc.pitroad/.landingpage.activity.LandingPageActivity", "com.htc.pitroad");
            put("htc", P16);
            P17 = kotlin.collections.w.P("com.asus.mobilemanager/.MainActivity", "com.asus.mobilemanager");
            put("asus", P17);
            P18 = kotlin.collections.w.P("com.yulong.android.softmanager/.SpeedupActivity", "com.yulong.android.security/com.yulong.android.seccenter.tabbarmain", "com.yulong.android.security");
            put("YuLong", P18);
            P19 = kotlin.collections.w.P("com.hihonor.systemmanager/com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity", "com.hihonor.systemmanager");
            put("HONOR", P19);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof String) {
                return containsKey((String) obj);
            }
            return false;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof List) {
                return containsValue((List<String>) obj);
            }
            return false;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<String, List<String>>> entrySet() {
            return getEntries();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof String) {
                return get((String) obj);
            }
            return null;
        }

        public /* bridge */ Set<Map.Entry<String, List<String>>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<String> getKeys() {
            return super.keySet();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof String) ? obj2 : getOrDefault((String) obj, (List<String>) obj2);
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<List<String>> getValues() {
            return super.values();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<String> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof String) {
                return remove((String) obj);
            }
            return null;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<List<String>> values() {
            return getValues();
        }

        public /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public /* bridge */ boolean containsValue(List<String> list) {
            return super.containsValue((Object) list);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ List<String> get(Object obj) {
            if (obj instanceof String) {
                return get((String) obj);
            }
            return null;
        }

        public final /* bridge */ List getOrDefault(Object obj, List list) {
            return !(obj instanceof String) ? list : getOrDefault((String) obj, (List<String>) list);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ List<String> remove(Object obj) {
            if (obj instanceof String) {
                return remove((String) obj);
            }
            return null;
        }

        public /* bridge */ List<String> get(String str) {
            return (List) super.get((Object) str);
        }

        public /* bridge */ List<String> getOrDefault(String str, List<String> list) {
            return (List) super.getOrDefault((Object) str, (String) list);
        }

        public /* bridge */ List<String> remove(String str) {
            return (List) super.remove((Object) str);
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof String) && (obj2 instanceof List)) {
                return remove((String) obj, (List<String>) obj2);
            }
            return false;
        }

        public /* bridge */ boolean remove(String str, List<String> list) {
            return super.remove((Object) str, (Object) list);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.addapp.AddAppViewModel$installGoogleTools$1", f = "AddAppViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class f extends kotlin.coroutines.jvm.internal.o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        int label;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new f(dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                VAppInstallerParams vAppInstallerParams = new VAppInstallerParams(2);
                for (String str : AddAppViewModel.this.r()) {
                    int i5 = VirtualCore.get().installPackage(Uri.parse("package:" + str), vAppInstallerParams).status;
                }
                AddAppViewModel.this.E().setValue(kotlin.coroutines.jvm.internal.b.a(false));
                AddAppViewModel.this.w();
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.addapp.AddAppViewModel$readConfig$1", f = "AddAppViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nAddAppViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddAppViewModel.kt\ncom/yuanqi/master/addapp/AddAppViewModel$readConfig$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1103:1\n1855#2,2:1104\n*S KotlinDebug\n*F\n+ 1 AddAppViewModel.kt\ncom/yuanqi/master/addapp/AddAppViewModel$readConfig$1\n*L\n450#1:1104,2\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        int label;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new g(dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                AddAppViewModel.this.G().getValue().clear();
                a.b bVar = com.yuanqi.master.config.a.f14505g;
                bVar.a().i();
                AddAppViewModel.this.G().getValue().addAll(bVar.a().h().getValue());
                for (com.yuanqi.master.config.e eVar : AddAppViewModel.this.G().getValue()) {
                }
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.addapp.AddAppViewModel$requestAllApp$1", f = "AddAppViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nAddAppViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddAppViewModel.kt\ncom/yuanqi/master/addapp/AddAppViewModel$requestAllApp$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1103:1\n1549#2:1104\n1620#2,3:1105\n1855#2,2:1108\n*S KotlinDebug\n*F\n+ 1 AddAppViewModel.kt\ncom/yuanqi/master/addapp/AddAppViewModel$requestAllApp$1\n*L\n340#1:1104\n340#1:1105,3\n342#1:1108,2\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ ArrayList<com.yuanqi.group.home.models.c> $tempList;
        int label;
        final /* synthetic */ AddAppViewModel this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/group/home/models/AppInfo;", "invoke", "(Lcom/yuanqi/group/home/models/AppInfo;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements v3.l<com.yuanqi.group.home.models.c, Boolean> {
            final /* synthetic */ Context $context;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context) {
                super(1);
                this.$context = context;
            }

            @Override // v3.l
            @p4.l
            public final Boolean invoke(@p4.l com.yuanqi.group.home.models.c it) {
                l0.p(it, "it");
                return Boolean.valueOf(l0.g(it.f14012a, this.$context.getPackageName()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Context context, ArrayList<com.yuanqi.group.home.models.c> arrayList, AddAppViewModel addAppViewModel, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.$context = context;
            this.$tempList = arrayList;
            this.this$0 = addAppViewModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invokeSuspend$lambda$0(com.yuanqi.group.home.models.c cVar, com.yuanqi.group.home.models.c cVar2) {
            int t5;
            try {
                Character pinyinName = cVar.f14021j;
                l0.o(pinyinName, "pinyinName");
                if (!com.yuanqi.master.config.c.f(pinyinName.charValue())) {
                    Character pinyinName2 = cVar2.f14021j;
                    l0.o(pinyinName2, "pinyinName");
                    if (!com.yuanqi.master.config.c.f(pinyinName2.charValue())) {
                        String str = cVar.f14012a;
                        String packageName = cVar2.f14012a;
                        l0.o(packageName, "packageName");
                        t5 = str.compareTo(packageName);
                        return t5;
                    }
                }
                Character pinyinName3 = cVar.f14021j;
                l0.o(pinyinName3, "pinyinName");
                if (com.yuanqi.master.config.c.f(pinyinName3.charValue())) {
                    Character pinyinName4 = cVar2.f14021j;
                    l0.o(pinyinName4, "pinyinName");
                    if (!com.yuanqi.master.config.c.f(pinyinName4.charValue())) {
                        return -1;
                    }
                }
                Character pinyinName5 = cVar.f14021j;
                l0.o(pinyinName5, "pinyinName");
                if (!com.yuanqi.master.config.c.f(pinyinName5.charValue())) {
                    Character pinyinName6 = cVar2.f14021j;
                    l0.o(pinyinName6, "pinyinName");
                    if (com.yuanqi.master.config.c.f(pinyinName6.charValue())) {
                        t5 = 1;
                        return t5;
                    }
                }
                char charValue = cVar.f14021j.charValue();
                Character pinyinName7 = cVar2.f14021j;
                l0.o(pinyinName7, "pinyinName");
                t5 = l0.t(charValue, pinyinName7.charValue());
                return t5;
            } catch (Exception unused) {
                return -1;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$1(v3.l lVar, Object obj) {
            return ((Boolean) lVar.invoke(obj)).booleanValue();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new h(this.$context, this.$tempList, this.this$0, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            int Y;
            boolean s8;
            String str;
            char S6;
            boolean s82;
            char S62;
            char S63;
            char S64;
            char S65;
            char S66;
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                List<PackageInfo> installedPackages = this.$context.getPackageManager().getInstalledPackages(0);
                l0.o(installedPackages, "getInstalledPackages(...)");
                for (PackageInfo packageInfo : installedPackages) {
                    s8 = kotlin.collections.p.s8(com.yuanqi.master.config.c.a(), packageInfo.packageName);
                    if (!s8) {
                        com.yuanqi.group.home.models.c cVar = new com.yuanqi.group.home.models.c();
                        String name = packageInfo.applicationInfo.loadLabel(this.$context.getPackageManager()).toString();
                        cVar.f14016e = name;
                        try {
                            l0.o(name, "name");
                            S62 = h0.S6(name);
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                        if (com.github.promeg.pinyinhelper.c.e(S62)) {
                            CharSequence name2 = cVar.f14016e;
                            l0.o(name2, "name");
                            S65 = h0.S6(name2);
                            String g5 = com.github.promeg.pinyinhelper.c.g(S65);
                            l0.o(g5, "toPinyin(...)");
                            S66 = h0.S6(g5);
                            String valueOf = String.valueOf(S66);
                            l0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
                            str = valueOf.toUpperCase(Locale.ROOT);
                            l0.o(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        } else {
                            CharSequence name3 = cVar.f14016e;
                            l0.o(name3, "name");
                            S63 = h0.S6(name3);
                            if (com.yuanqi.master.config.c.f(S63)) {
                                CharSequence name4 = cVar.f14016e;
                                l0.o(name4, "name");
                                S64 = h0.S6(name4);
                                str = String.valueOf(S64).toUpperCase(Locale.ROOT);
                                l0.o(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                            }
                            str = "#";
                        }
                        S6 = h0.S6(str);
                        cVar.f14021j = kotlin.coroutines.jvm.internal.b.c(S6);
                        cVar.f14012a = packageInfo.packageName;
                        cVar.f14015d = packageInfo.applicationInfo.loadIcon(this.$context.getPackageManager());
                        if ((packageInfo.applicationInfo.flags & 1) != 0) {
                            s82 = kotlin.collections.p.s8(com.yuanqi.master.config.c.d(), packageInfo.packageName);
                            if (s82) {
                            }
                        }
                        this.$tempList.add(cVar);
                    }
                }
                a0.m0(this.$tempList, new Comparator() { // from class: com.yuanqi.master.addapp.d
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        int invokeSuspend$lambda$0;
                        invokeSuspend$lambda$0 = AddAppViewModel.h.invokeSuspend$lambda$0((com.yuanqi.group.home.models.c) obj2, (com.yuanqi.group.home.models.c) obj3);
                        return invokeSuspend$lambda$0;
                    }
                });
                ArrayList<com.yuanqi.group.home.models.c> arrayList = this.$tempList;
                final a aVar = new a(this.$context);
                arrayList.removeIf(new Predicate() { // from class: com.yuanqi.master.addapp.e
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        boolean invokeSuspend$lambda$1;
                        invokeSuspend$lambda$1 = AddAppViewModel.h.invokeSuspend$lambda$1(l.this, obj2);
                        return invokeSuspend$lambda$1;
                    }
                });
                ArrayList<com.yuanqi.group.home.models.c> arrayList2 = this.$tempList;
                Y = x.Y(arrayList2, 10);
                ArrayList<Character> arrayList3 = new ArrayList(Y);
                Iterator<T> it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((com.yuanqi.group.home.models.c) it.next()).f14021j);
                }
                AddAppViewModel addAppViewModel = this.this$0;
                for (Character ch : arrayList3) {
                    if (!addAppViewModel.v().contains(ch)) {
                        SnapshotStateList<Character> v4 = addAppViewModel.v();
                        l0.m(ch);
                        v4.add(ch);
                    }
                }
                this.this$0.k().addAll(this.$tempList);
                this.this$0.l().clear();
                this.this$0.l().addAll(this.this$0.k().toList());
                this.this$0.E().setValue(kotlin.coroutines.jvm.internal.b.a(false));
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.addapp.AddAppViewModel$requestApkFile$1", f = "AddAppViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ Activity $activity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Activity activity, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.$activity = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(AddAppViewModel addAppViewModel, List list) {
            List list2 = list;
            if (!list2.isEmpty()) {
                addAppViewModel.j().clear();
                addAppViewModel.j().addAll(list2);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new i(this.$activity, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((i) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                App a5 = App.f13716d.a();
                l0.m(a5);
                Context applicationContext = a5.getApplicationContext();
                l0.o(applicationContext, "getApplicationContext(...)");
                Object systemService = applicationContext.getSystemService("storage");
                l0.n(systemService, "null cannot be cast to non-null type android.os.storage.StorageManager");
                Iterator<StorageVolume> it = ((StorageManager) systemService).getStorageVolumes().iterator();
                File file = null;
                while (it.hasNext()) {
                    File file2 = (File) Reflect.on(it.next()).call("getPathFile").get();
                    if (file2.listFiles() != null) {
                        file = file2;
                    }
                }
                t2.f x4 = AddAppViewModel.this.x();
                l0.m(x4);
                org.jdeferred.p<List<com.yuanqi.group.home.models.c>, Throwable, Void> e5 = x4.e(this.$activity, file);
                final AddAppViewModel addAppViewModel = AddAppViewModel.this;
                e5.d(new org.jdeferred.g() { // from class: com.yuanqi.master.addapp.f
                    @Override // org.jdeferred.g
                    public final void a(Object obj2) {
                        AddAppViewModel.i.invokeSuspend$lambda$0(AddAppViewModel.this, (List) obj2);
                    }
                });
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/config/SortApp;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class j extends n0 implements v3.l<com.yuanqi.master.config.e, CharSequence> {
        public static final j INSTANCE = new j();

        j() {
            super(1);
        }

        @Override // v3.l
        @p4.l
        public final CharSequence invoke(@p4.l com.yuanqi.master.config.e it) {
            l0.p(it, "it");
            return it.a();
        }
    }

    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/config/SortApp;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class k extends n0 implements v3.l<com.yuanqi.master.config.e, CharSequence> {
        public static final k INSTANCE = new k();

        k() {
            super(1);
        }

        @Override // v3.l
        @p4.l
        public final CharSequence invoke(@p4.l com.yuanqi.master.config.e it) {
            l0.p(it, "it");
            return it.c();
        }
    }

    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class l extends n0 implements v3.l<File, r2> {
        final /* synthetic */ Context $context;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.addapp.AddAppViewModel$showBackupFileDialog$1$1", f = "AddAppViewModel.kt", i = {}, l = {875}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ Context $context;
            final /* synthetic */ File $it;
            int label;
            final /* synthetic */ AddAppViewModel this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.addapp.AddAppViewModel$showBackupFileDialog$1$1$1", f = "AddAppViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.addapp.AddAppViewModel$l$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0266a extends kotlin.coroutines.jvm.internal.o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
                final /* synthetic */ Context $context;
                final /* synthetic */ File $it;
                int label;
                final /* synthetic */ AddAppViewModel this$0;

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.addapp.AddAppViewModel$l$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0267a extends n0 implements v3.l<String, r2> {
                    final /* synthetic */ AddAppViewModel this$0;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.addapp.AddAppViewModel$showBackupFileDialog$1$1$1$1$1", f = "AddAppViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.yuanqi.master.addapp.AddAppViewModel$l$a$a$a$a, reason: collision with other inner class name */
                    /* loaded from: classes3.dex */
                    public static final class C0268a extends kotlin.coroutines.jvm.internal.o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
                        final /* synthetic */ String $it;
                        int label;
                        final /* synthetic */ AddAppViewModel this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0268a(AddAppViewModel addAppViewModel, String str, kotlin.coroutines.d<? super C0268a> dVar) {
                            super(2, dVar);
                            this.this$0 = addAppViewModel;
                            this.$it = str;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @p4.l
                        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                            return new C0268a(this.this$0, this.$it, dVar);
                        }

                        @Override // v3.p
                        @p4.m
                        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                            return ((C0268a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @p4.m
                        public final Object invokeSuspend(@p4.l Object obj) {
                            kotlin.coroutines.intrinsics.d.l();
                            if (this.label == 0) {
                                e1.n(obj);
                                this.this$0.E().setValue(kotlin.coroutines.jvm.internal.b.a(false));
                                f1.r(this.$it, 0, 2, null);
                                return r2.f19517a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0267a(AddAppViewModel addAppViewModel) {
                        super(1);
                        this.this$0 = addAppViewModel;
                    }

                    @Override // v3.l
                    public /* bridge */ /* synthetic */ r2 invoke(String str) {
                        invoke2(str);
                        return r2.f19517a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@p4.l String it) {
                        l0.p(it, "it");
                        kotlinx.coroutines.k.f(this.this$0.A(), k1.e(), null, new C0268a(this.this$0, it, null), 2, null);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0266a(Context context, File file, AddAppViewModel addAppViewModel, kotlin.coroutines.d<? super C0266a> dVar) {
                    super(2, dVar);
                    this.$context = context;
                    this.$it = file;
                    this.this$0 = addAppViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    return new C0266a(this.$context, this.$it, this.this$0, dVar);
                }

                @Override // v3.p
                @p4.m
                public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                    return ((C0266a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.m
                public final Object invokeSuspend(@p4.l Object obj) {
                    kotlin.coroutines.intrinsics.d.l();
                    if (this.label == 0) {
                        e1.n(obj);
                        File file = new File(this.$context.getFilesDir().getParent(), "virtual");
                        File file2 = new File(this.$context.getFilesDir().getParent() + "/virtual/data/app/system");
                        t0 t0Var = t0.f15250a;
                        t0Var.d(file2);
                        t0Var.f(this.$it, file, new C0267a(this.this$0));
                        return r2.f19517a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AddAppViewModel addAppViewModel, Context context, File file, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.this$0 = addAppViewModel;
                this.$context = context;
                this.$it = file;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                return new a(this.this$0, this.$context, this.$it, dVar);
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                Object l5;
                l5 = kotlin.coroutines.intrinsics.d.l();
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 == 1) {
                        e1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    e1.n(obj);
                    f1.r("开始恢复", 0, 2, null);
                    this.this$0.F().setValue("恢复中...");
                    this.this$0.E().setValue(kotlin.coroutines.jvm.internal.b.a(true));
                    kotlinx.coroutines.n0 c5 = k1.c();
                    C0266a c0266a = new C0266a(this.$context, this.$it, this.this$0, null);
                    this.label = 1;
                    if (kotlinx.coroutines.i.h(c5, c0266a, this) == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Context context) {
            super(1);
            this.$context = context;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(File file) {
            invoke2(file);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l File it) {
            l0.p(it, "it");
            kotlinx.coroutines.k.f(AddAppViewModel.this.A(), k1.e(), null, new a(AddAppViewModel.this, this.$context, it, null), 2, null);
        }
    }

    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class m extends n0 implements v3.a<r2> {
        final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $storagePermissionResultLauncher;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher) {
            super(0);
            this.$storagePermissionResultLauncher = managedActivityResultLauncher;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$storagePermissionResultLauncher.launch("android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.addapp.AddAppViewModel$startBackup$1", f = "AddAppViewModel.kt", i = {}, l = {760}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class n extends kotlin.coroutines.jvm.internal.o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.addapp.AddAppViewModel$startBackup$1$1", f = "AddAppViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ Context $context;
            int label;
            final /* synthetic */ AddAppViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, AddAppViewModel addAppViewModel, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.$context = context;
                this.this$0 = addAppViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                return new a(this.$context, this.this$0, dVar);
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                kotlin.coroutines.intrinsics.d.l();
                if (this.label == 0) {
                    e1.n(obj);
                    File file = new File(this.$context.getFilesDir().getParent() + "/virtual");
                    File file2 = new File("/storage/emulated/0/YQDK_Backup_" + f1.d() + ".zip");
                    File file3 = new File(Environment.getExternalStorageDirectory().getPath());
                    this.this$0.z0(file, file2);
                    this.this$0.Q(file2, file3);
                    return r2.f19517a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Context context, kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new n(this.$context, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((n) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                Log.d(AddAppViewModel.this.f14436b, "开始备份: ");
                f1.r("开始备份", 0, 2, null);
                AddAppViewModel.this.F().setValue("备份中...");
                AddAppViewModel.this.E().setValue(kotlin.coroutines.jvm.internal.b.a(true));
                kotlinx.coroutines.n0 c5 = k1.c();
                a aVar = new a(this.$context, AddAppViewModel.this, null);
                this.label = 1;
                if (kotlinx.coroutines.i.h(c5, aVar, this) == l5) {
                    return l5;
                }
            }
            AddAppViewModel.this.E().setValue(kotlin.coroutines.jvm.internal.b.a(false));
            f1.r("备份完成", 0, 2, null);
            return r2.f19517a;
        }
    }

    static {
        d0<AddAppViewModel> b5;
        b5 = f0.b(kotlin.h0.SYNCHRONIZED, a.INSTANCE);
        D = b5;
        com.yuanqi.master.database.a a5 = com.yuanqi.master.database.a.f14574b.a();
        App a6 = App.f13716d.a();
        l0.m(a6);
        E = a5.c(a6);
    }

    private AddAppViewModel() {
        MutableState<String> mutableStateOf$default;
        MutableState<ArrayList<com.yuanqi.group.home.models.h>> mutableStateOf$default2;
        MutableState<ArrayList<com.yuanqi.master.config.e>> mutableStateOf$default3;
        MutableState<Boolean> mutableStateOf$default4;
        MutableState<String> mutableStateOf$default5;
        MutableState<Boolean> mutableStateOf$default6;
        MutableState<Boolean> mutableStateOf$default7;
        this.f14436b = "AddAppViewModel";
        this.f14438d = "";
        this.f14439e = "";
        this.f14440f = SnapshotStateKt.mutableStateListOf();
        this.f14441g = kotlinx.coroutines.t0.a(k1.e());
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.f14442h = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new ArrayList(), null, 2, null);
        this.f14443i = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new ArrayList(), null, 2, null);
        this.f14444j = mutableStateOf$default3;
        Boolean bool = Boolean.FALSE;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f14445k = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("备份中...", null, 2, null);
        this.f14446l = mutableStateOf$default5;
        this.f14447m = new String[]{GmsSupport.GMS_PKG, GmsSupport.GSF_PKG, GmsSupport.VENDING_PKG};
        this.f14448n = com.yuanqi.master.config.a.f14505g.a().c();
        this.f14450p = SnapshotStateKt.mutableStateListOf();
        this.f14451q = SnapshotStateKt.mutableStateListOf();
        this.f14452r = SnapshotStateKt.mutableStateListOf();
        this.f14453s = SnapshotStateKt.mutableStateListOf();
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f14454t = mutableStateOf$default6;
        this.f14455u = new x0(com.yuanqi.master.config.c.A, "");
        this.f14456v = new x0(com.yuanqi.master.config.c.B, "");
        this.f14457w = new x0(com.yuanqi.master.config.c.C, 3);
        this.f14458x = new x0(com.yuanqi.master.config.c.O, Boolean.TRUE);
        mutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f14459y = mutableStateOf$default7;
        this.f14460z = new e();
    }

    public /* synthetic */ AddAppViewModel(w wVar) {
        this();
    }

    private final void g(Context context) {
        File file = new File(context.getFilesDir().getParent() + "/virtual/data/app/system/sync/accounts.xml");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                if (fileInputStream.getChannel().size() != 0) {
                    Log.d(this.f14436b, "文件不为空，跳过写入默认内容");
                    kotlin.io.c.a(fileInputStream, null);
                    return;
                }
                Log.d(this.f14436b, "文件为空，写入默认内容");
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bytes = "<?xml version='1.0' encoding='utf-8' standalone='yes' ?>\n<accounts version=\"2\" nextAuthorityId=\"0\" offsetInSeconds=\"0\" />".getBytes(kotlin.text.f.f19703b);
                    l0.o(bytes, "this as java.lang.String).getBytes(charset)");
                    fileOutputStream.write(bytes);
                    Log.d(this.f14436b, "默认内容已写入文件");
                    kotlin.io.c.a(fileOutputStream, null);
                    kotlin.io.c.a(fileInputStream, null);
                } finally {
                }
            } finally {
            }
        } catch (IOException e5) {
            System.err.println("读取文件时发生错误: " + e5.getMessage());
        }
    }

    private final void i(File file, String str, ZipOutputStream zipOutputStream, byte[] bArr) {
        boolean z4;
        String str2;
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (str.length() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                str2 = file2.getName();
            } else {
                str2 = str + ClassPathElement.SEPARATOR_CHAR + file2.getName();
            }
            if (file2.isDirectory()) {
                l0.m(file2);
                l0.m(str2);
                i(file2, str2, zipOutputStream, bArr);
            } else {
                if (!file2.exists()) {
                    Log.e(this.f14436b, "File does not exist: " + file2);
                    return;
                }
                if (!file2.canRead()) {
                    Log.e(this.f14436b, "File cannot be read: " + file2 + external.org.apache.commons.lang3.d.f15957a);
                    return;
                }
                FileInputStream fileInputStream = new FileInputStream(file2);
                try {
                    zipOutputStream.putNextEntry(new ZipEntry(str2));
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        } else {
                            zipOutputStream.write(bArr, 0, read);
                        }
                    }
                    zipOutputStream.closeEntry();
                    r2 r2Var = r2.f19517a;
                    kotlin.io.c.a(fileInputStream, null);
                } finally {
                }
            }
        }
    }

    private final void k0(String str) {
        this.f14455u.setValue(this, B[0], str);
    }

    private final void m0(int i5) {
        this.f14457w.setValue(this, B[2], Integer.valueOf(i5));
    }

    private final String n() {
        return (String) this.f14455u.getValue(this, B[0]);
    }

    private final int q() {
        return ((Number) this.f14457w.getValue(this, B[2])).intValue();
    }

    private final void q0(String str) {
        this.f14456v.setValue(this, B[1], str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        AddAppActivity a5 = AddAppActivity.f14427e.a();
        l0.m(a5);
        this.f14443i.getValue().clear();
        for (InstalledAppInfo installedAppInfo : VirtualCore.get().getInstalledApps(0)) {
            int[] installedUsers = installedAppInfo.getInstalledUsers();
            l0.m(installedUsers);
            for (int i5 : installedUsers) {
                if (VirtualCore.get().isPackageLaunchable(installedAppInfo.packageName)) {
                    com.yuanqi.group.home.models.i iVar = new com.yuanqi.group.home.models.i(a5, installedAppInfo);
                    if (VirtualCore.get().isAppInstalledAsUser(0, installedAppInfo.packageName)) {
                        this.f14443i.getValue().add(new com.yuanqi.group.home.models.h(iVar, i5));
                    }
                }
            }
        }
        V();
    }

    private final void y0(File file) {
    }

    private final String z() {
        return (String) this.f14456v.getValue(this, B[1]);
    }

    @p4.l
    public final s0 A() {
        return this.f14441g;
    }

    @p4.l
    public final MutableState<Boolean> B() {
        return this.f14454t;
    }

    @p4.l
    public final MutableState<String> C() {
        return this.f14442h;
    }

    public final boolean D() {
        return ((Boolean) this.f14458x.getValue(this, B[3])).booleanValue();
    }

    @p4.l
    public final MutableState<Boolean> E() {
        return this.f14445k;
    }

    @p4.l
    public final MutableState<String> F() {
        return this.f14446l;
    }

    @p4.l
    public final MutableState<ArrayList<com.yuanqi.master.config.e>> G() {
        return this.f14444j;
    }

    @p4.l
    public final SnapshotStateList<u2.c> H() {
        return this.f14440f;
    }

    @p4.l
    public final String I() {
        return this.f14438d;
    }

    public final void J(@p4.l Activity activity) {
        l0.p(activity, "activity");
        this.f14449o = new t2.f(activity);
    }

    public final void K(@p4.l List<? extends com.yuanqi.group.home.models.c> appInfos) {
        l0.p(appInfos, "appInfos");
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (com.yuanqi.group.home.models.c cVar : appInfos) {
            cVar.f14014c = !this.f14454t.getValue().booleanValue();
            cVar.f14017f = cVar.f14017f;
            try {
                arrayList.add(new AppInfoLite(cVar));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra(com.yuanqi.group.c.f13754h, arrayList);
        AddAppActivity.a aVar = AddAppActivity.f14427e;
        AddAppActivity a5 = aVar.a();
        l0.m(a5);
        a5.setResult(-1, intent);
        AddAppActivity a6 = aVar.a();
        l0.m(a6);
        a6.finish();
    }

    public final void L() {
        this.f14445k.setValue(Boolean.TRUE);
        kotlinx.coroutines.k.f(this.f14441g, k1.c(), null, new f(null), 2, null);
    }

    public final boolean M(@p4.l String packageName) {
        boolean T2;
        l0.p(packageName, "packageName");
        T2 = kotlin.text.f0.T2(z(), packageName, false, 2, null);
        return T2;
    }

    public final boolean N(@p4.l ArrayList<com.yuanqi.group.home.models.c> appInfoList, @p4.m String str) {
        l0.p(appInfoList, "appInfoList");
        if ((appInfoList instanceof Collection) && appInfoList.isEmpty()) {
            return false;
        }
        Iterator<T> it = appInfoList.iterator();
        while (it.hasNext()) {
            if (l0.g(((com.yuanqi.group.home.models.c) it.next()).f14012a, str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean O(@p4.l Context context) {
        l0.p(context, "context");
        Object systemService = context.getSystemService("power");
        l0.n(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((PowerManager) systemService).isIgnoringBatteryOptimizations(context.getPackageName());
    }

    public final void P(@p4.l org.burnoutcrew.reorderable.d from, @p4.l org.burnoutcrew.reorderable.d to) {
        List V5;
        l0.p(from, "from");
        l0.p(to, "to");
        MutableState<ArrayList<com.yuanqi.master.config.e>> mutableState = this.f14444j;
        V5 = e0.V5(mutableState.getValue());
        V5.add(to.e(), V5.remove(from.e()));
        l0.n(V5, "null cannot be cast to non-null type java.util.ArrayList<com.yuanqi.master.config.SortApp>{ kotlin.collections.TypeAliasesKt.ArrayList<com.yuanqi.master.config.SortApp> }");
        mutableState.setValue((ArrayList) V5);
    }

    public final void Q(@p4.l File sourceFile, @p4.l File targetDir) {
        Path path;
        Path path2;
        StandardCopyOption standardCopyOption;
        l0.p(sourceFile, "sourceFile");
        l0.p(targetDir, "targetDir");
        if (Build.VERSION.SDK_INT >= 26) {
            path = Paths.get(targetDir.getAbsolutePath(), sourceFile.getName());
            path2 = Paths.get(sourceFile.getAbsolutePath(), new String[0]);
            standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            Files.move(path2, path, standardCopyOption);
            return;
        }
        throw new k0("An operation is not implemented: VERSION.SDK_INT < O");
    }

    public final void R(@p4.l Context context, @p4.l ManagedActivityResultLauncher<Intent, ActivityResult> allFilesAccessPermissionResultLauncher, @p4.l ManagedActivityResultLauncher<String, Boolean> storagePermissionResultLauncher) {
        l0.p(context, "context");
        l0.p(allFilesAccessPermissionResultLauncher, "allFilesAccessPermissionResultLauncher");
        l0.p(storagePermissionResultLauncher, "storagePermissionResultLauncher");
        if (Build.VERSION.SDK_INT >= 30) {
            allFilesAccessPermissionResultLauncher.launch(new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION"));
            return;
        }
        AddAppActivity a5 = AddAppActivity.f14427e.a();
        l0.m(a5);
        if (!ActivityCompat.shouldShowRequestPermissionRationale(a5, "android.permission.READ_EXTERNAL_STORAGE")) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            allFilesAccessPermissionResultLauncher.launch(intent);
            return;
        }
        storagePermissionResultLauncher.launch("android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public final void S(@p4.l Context context, @p4.l ManagedActivityResultLauncher<Intent, ActivityResult> notificationPermissionResultLauncher) {
        l0.p(context, "context");
        l0.p(notificationPermissionResultLauncher, "notificationPermissionResultLauncher");
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 34) {
            intent.setAction("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
        }
    }

    public final void T(@p4.l Context context, @p4.l ManagedActivityResultLauncher<Intent, ActivityResult> notificationPermissionResultLauncher) {
        l0.p(context, "context");
        l0.p(notificationPermissionResultLauncher, "notificationPermissionResultLauncher");
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else {
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + context + ".packageName"));
        }
        try {
            String MANUFACTURER = Build.MANUFACTURER;
            l0.o(MANUFACTURER, "MANUFACTURER");
            Locale ROOT = Locale.ROOT;
            l0.o(ROOT, "ROOT");
            String lowerCase = MANUFACTURER.toLowerCase(ROOT);
            l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            switch (lowerCase.hashCode()) {
                case -1206476313:
                    if (!lowerCase.equals("huawei")) {
                        break;
                    } else {
                        intent.setAction("huawei.intent.action.NOTIFICATIONMANAGER");
                        intent.putExtra(TTDownloadField.TT_PACKAGE_NAME, context.getPackageName());
                        break;
                    }
                case -759499589:
                    if (!lowerCase.equals("xiaomi")) {
                        break;
                    } else {
                        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                        intent.putExtra("app_package", context.getPackageName());
                        intent.putExtra("app_uid", context.getApplicationInfo().uid);
                        break;
                    }
                case 3418016:
                    if (!lowerCase.equals("oppo")) {
                        break;
                    } else {
                        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                        intent.putExtra("app_package", context.getPackageName());
                        intent.putExtra("app_uid", context.getApplicationInfo().uid);
                        break;
                    }
                case 3620012:
                    if (!lowerCase.equals("vivo")) {
                        break;
                    } else {
                        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                        intent.putExtra(TTDownloadField.TT_PACKAGE_NAME, context.getPackageName());
                        break;
                    }
                case 103777484:
                    if (!lowerCase.equals("meizu")) {
                        break;
                    } else {
                        intent.setAction("com.meizu.safe.security.SHOW_APPSEC");
                        intent.addCategory("android.intent.category.DEFAULT");
                        intent.putExtra(TTDownloadField.TT_PACKAGE_NAME, context.getPackageName());
                        break;
                    }
            }
        } catch (Exception unused) {
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + context + ".packageName"));
        }
        notificationPermissionResultLauncher.launch(intent);
    }

    public final void U(@p4.l Context context) {
        ComponentName componentName;
        l0.p(context, "context");
        String MANUFACTURER = Build.MANUFACTURER;
        l0.o(MANUFACTURER, "MANUFACTURER");
        String lowerCase = MANUFACTURER.toLowerCase(Locale.ROOT);
        l0.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        Intent intent = new Intent();
        try {
            intent.addFlags(268435456);
            if (lowerCase.equals("xiaomi")) {
                componentName = new ComponentName("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity");
            } else {
                if (lowerCase.equals("letv")) {
                    intent.setAction("com.letv.android.permissionautoboot");
                } else if (lowerCase.equals("samsung")) {
                    componentName = new ComponentName("com.samsung.android.sm_cn", "com.samsung.android.sm.ui.ram.AutoRunActivity");
                } else if (lowerCase.equals("huawei")) {
                    componentName = new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.appcontrol.activity.StartupAppControlActivity");
                } else if (lowerCase.equals("vivo")) {
                    componentName = ComponentName.unflattenFromString("com.iqoo.secure/.safeguard.PurviewTabActivity");
                } else if (lowerCase.equals("meizu")) {
                    componentName = ComponentName.unflattenFromString("com.meizu.safe/.permission.PermissionMainActivity");
                } else if (lowerCase.equals("oppo")) {
                    componentName = ComponentName.unflattenFromString("com.oppo.safe/.permission.startup.StartupAppListActivity");
                } else if (lowerCase.equals("ulong")) {
                    componentName = new ComponentName("com.yulong.android.coolsafe", ".ui.activity.autorun.AutoRunListActivity");
                } else {
                    intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                }
                componentName = null;
            }
            intent.addFlags(268435456);
            intent.setComponent(componentName);
            context.startActivity(intent);
        } catch (Exception unused) {
            context.startActivity(new Intent("android.settings.SETTINGS"));
        }
    }

    public final void V() {
        kotlinx.coroutines.k.f(this.f14441g, k1.c(), null, new g(null), 2, null);
    }

    public final void W(@p4.l Context context) {
        l0.p(context, "context");
        this.f14451q.clear();
        this.f14453s.clear();
        this.f14445k.setValue(Boolean.TRUE);
        kotlinx.coroutines.k.f(this.f14441g, k1.c(), null, new h(context, new ArrayList(), this, null), 2, null);
    }

    public final void X(@p4.l Activity activity) {
        l0.p(activity, "activity");
        kotlinx.coroutines.k.f(this.f14441g, k1.c(), null, new i(activity, null), 2, null);
    }

    public final void Y(@p4.l Context context) {
        l0.p(context, "context");
        a1.f15052a.a(context);
        f1.r("请找到悬浮窗权限并打开", 0, 2, null);
    }

    public final void Z(@p4.l Context context) {
        l0.p(context, "context");
        a1.f15052a.a(context);
        f1.r("请找到位置权限并打开", 0, 2, null);
    }

    public final void a0(@p4.l Context context) {
        l0.p(context, "context");
        try {
            Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            context.startActivity(intent);
            f1.r("请设置后台配置为无限制", 0, 2, null);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public final void b0(@p4.l Context context) {
        l0.p(context, "context");
        a1.f15052a.a(context);
        f1.r("请找到创建桌面快捷方式权限并打开", 0, 2, null);
    }

    public final void c0(@p4.l Context context, @p4.l ManagedActivityResultLauncher<Intent, ActivityResult> activityResultLauncher) {
        l0.p(context, "context");
        l0.p(activityResultLauncher, "activityResultLauncher");
        a1.f15052a.b(context, activityResultLauncher);
        f1.r("请找到创建桌面快捷方式权限并打开", 0, 2, null);
    }

    public final void d0(@p4.l Context context) {
        l0.p(context, "context");
        a1.f15052a.a(context);
        f1.r("请找到存储权限并打开", 0, 2, null);
    }

    public final void e0() {
    }

    public final void f0() {
        String j32;
        String j33;
        Object y22;
        j32 = e0.j3(this.f14444j.getValue(), ",", null, null, 0, null, j.INSTANCE, 30, null);
        k0(j32);
        j33 = e0.j3(this.f14444j.getValue(), ",", null, null, 0, null, k.INSTANCE, 30, null);
        q0(j33);
        m0(this.f14448n.getValue().intValue());
        q0 a5 = q0.f15237a.a();
        AddAppActivity a6 = AddAppActivity.f14427e.a();
        l0.m(a6);
        String valueOf = String.valueOf(this.f14448n.getValue().intValue());
        y22 = e0.y2(this.f14444j.getValue());
        a5.c(a6, valueOf, ((com.yuanqi.master.config.e) y22).a());
    }

    public final void g0(@p4.l SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList) {
        l0.p(snapshotStateList, "<set-?>");
        this.f14452r = snapshotStateList;
    }

    public final void h(@p4.l Context context) {
        l0.p(context, "context");
        f1.a(com.yuanqi.master.network.repository.f.f14851g.h(), new c(context, this), new d());
    }

    public final void h0(@p4.l SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList) {
        l0.p(snapshotStateList, "<set-?>");
        this.f14451q = snapshotStateList;
    }

    public final void i0(@p4.l SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList) {
        l0.p(snapshotStateList, "<set-?>");
        this.f14450p = snapshotStateList;
    }

    @p4.l
    public final SnapshotStateList<com.yuanqi.group.home.models.c> j() {
        return this.f14452r;
    }

    public final void j0(@p4.l MutableState<ArrayList<com.yuanqi.group.home.models.h>> mutableState) {
        l0.p(mutableState, "<set-?>");
        this.f14443i = mutableState;
    }

    @p4.l
    public final SnapshotStateList<com.yuanqi.group.home.models.c> k() {
        return this.f14451q;
    }

    @p4.l
    public final SnapshotStateList<com.yuanqi.group.home.models.c> l() {
        return this.f14450p;
    }

    public final void l0(int i5) {
        this.f14437c = i5;
    }

    @p4.l
    public final MutableState<ArrayList<com.yuanqi.group.home.models.h>> m() {
        return this.f14443i;
    }

    public final void n0(@p4.l Context context, @p4.l Locale newLocale) {
        l0.p(context, "context");
        l0.p(newLocale, "newLocale");
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        Locale.setDefault(newLocale);
        Configuration configuration2 = new Configuration(configuration);
        configuration2.setLocale(newLocale);
        context.createConfigurationContext(configuration2);
        context.getResources().updateConfiguration(configuration2, resources.getDisplayMetrics());
    }

    public final int o() {
        return this.f14437c;
    }

    public final void o0(@p4.m t2.f fVar) {
        this.f14449o = fVar;
    }

    @p4.l
    public final MutableState<Integer> p() {
        return this.f14448n;
    }

    public final void p0(@p4.l String str) {
        l0.p(str, "<set-?>");
        this.f14439e = str;
    }

    @p4.l
    public final String[] r() {
        return this.f14447m;
    }

    public final void r0(boolean z4) {
        this.f14458x.setValue(this, B[3], Boolean.valueOf(z4));
    }

    public final boolean s() {
        boolean isExternalStorageManager;
        if (Build.VERSION.SDK_INT >= 30) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            return isExternalStorageManager;
        }
        AddAppActivity.a aVar = AddAppActivity.f14427e;
        AddAppActivity a5 = aVar.a();
        l0.m(a5);
        if (ContextCompat.checkSelfPermission(a5, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            AddAppActivity a6 = aVar.a();
            l0.m(a6);
            if (ContextCompat.checkSelfPermission(a6, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                return true;
            }
        }
        return false;
    }

    public final void s0(@p4.l MutableState<ArrayList<com.yuanqi.master.config.e>> mutableState) {
        l0.p(mutableState, "<set-?>");
        this.f14444j = mutableState;
    }

    @p4.l
    public final MutableState<Boolean> t() {
        return this.f14459y;
    }

    public final void t0(@p4.l String str) {
        l0.p(str, "<set-?>");
        this.f14438d = str;
    }

    public final boolean u() {
        try {
            App.a aVar = App.f13716d;
            App a5 = aVar.a();
            l0.m(a5);
            if (a5.getPackageManager().getPermissionInfo("com.android.permission.GET_INSTALLED_APPS", 0) != null) {
                App a6 = aVar.a();
                l0.m(a6);
                if (ContextCompat.checkSelfPermission(a6, "com.android.permission.GET_INSTALLED_APPS") == 0) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public final void u0(@p4.l Context context) {
        String str;
        boolean s22;
        boolean J1;
        l0.p(context, "context");
        String path = Environment.getExternalStorageDirectory().getPath();
        Log.d(this.f14436b, "path: " + path);
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            str = externalFilesDir.getPath();
        } else {
            str = null;
        }
        Log.d(this.f14436b, "path2: " + str);
        if (path == null) {
            f1.r("未找到目标文件路径", 0, 2, null);
            return;
        }
        File file = new File(path);
        ArrayList arrayList = new ArrayList();
        if (!file.exists()) {
            f1.r("未找到目标文件", 0, 2, null);
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            f1.r("目标文件为空", 0, 2, null);
            return;
        }
        for (File file2 : listFiles) {
            String name = file2.getName();
            l0.o(name, "getName(...)");
            s22 = kotlin.text.e0.s2(name, "YQDK_Backup_", false, 2, null);
            if (s22) {
                String name2 = file2.getName();
                l0.o(name2, "getName(...)");
                J1 = kotlin.text.e0.J1(name2, ".zip", false, 2, null);
                if (J1) {
                    l0.m(file2);
                    arrayList.add(file2);
                }
            }
        }
        Collections.sort(arrayList, new com.yuanqi.master.tools.s0());
        if (arrayList.isEmpty()) {
            f1.r("未找到备份文件目标文件", 0, 2, null);
        } else {
            o0.f15213a.N(context, arrayList, new l(context));
        }
    }

    @p4.l
    public final SnapshotStateList<Character> v() {
        return this.f14453s;
    }

    public final void v0(@p4.l Context context, boolean z4, @p4.l ManagedActivityResultLauncher<String, Boolean> storagePermissionResultLauncher) {
        String str;
        l0.p(context, "context");
        l0.p(storagePermissionResultLauncher, "storagePermissionResultLauncher");
        o0 o0Var = o0.f15213a;
        if (z4) {
            str = "请您授予我们访问您设备上文件的权限，以便您将数据备份到您的设备上。";
        } else {
            str = "请您授予我们访问您设备上文件的权限，以便我们读取需要恢复的数据到当前应用目录下。";
        }
        o0.Y(o0Var, context, "存储权限申请", str, null, null, false, false, false, false, null, null, null, new m(storagePermissionResultLauncher), 4088, null);
    }

    public final void w0(@p4.l Context context) {
        l0.p(context, "context");
        if (this.f14437c == 0) {
            f1.r("请在添加了应用之后再进行备份", 0, 2, null);
        } else {
            kotlinx.coroutines.k.f(this.f14441g, k1.e(), null, new n(context, null), 2, null);
        }
    }

    @p4.m
    public final t2.f x() {
        return this.f14449o;
    }

    public final void x0(@p4.l Context context) {
        boolean K1;
        boolean T2;
        Intent launchIntentForPackage;
        l0.p(context, "context");
        Set<Map.Entry<String, List<String>>> entrySet = this.f14460z.entrySet();
        l0.o(entrySet, "<get-entries>(...)");
        for (Map.Entry<String, List<String>> entry : entrySet) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            K1 = kotlin.text.e0.K1(Build.MANUFACTURER, key, true);
            if (K1) {
                Iterator<String> it = value.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String next = it.next();
                        try {
                            T2 = kotlin.text.f0.T2(next, "/", false, 2, null);
                            if (T2) {
                                launchIntentForPackage = new Intent();
                                launchIntentForPackage.addFlags(268435456);
                                launchIntentForPackage.setComponent(ComponentName.unflattenFromString(next));
                            } else {
                                launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(next);
                            }
                            context.startActivity(launchIntentForPackage);
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    @p4.l
    public final String y() {
        return this.f14439e;
    }

    public final void z0(@p4.l File sourceDir, @p4.l File zipFile) {
        l0.p(sourceDir, "sourceDir");
        l0.p(zipFile, "zipFile");
        byte[] bArr = new byte[1024];
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(zipFile)));
        try {
            i(sourceDir, "", zipOutputStream, bArr);
            r2 r2Var = r2.f19517a;
            kotlin.io.c.a(zipOutputStream, null);
        } finally {
        }
    }
}
