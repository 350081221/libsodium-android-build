.class public Lcom/umeng/umcrash/UMCrash;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/umcrash/UMCrash$PaClientImpl;,
        Lcom/umeng/umcrash/UMCrash$CrashClientImpl;
    }
.end annotation


# static fields
.field private static final DEFAULT_PA_TIMEOUT_TIME:J = 0x7d0L

.field private static final DEFAULT_VALUE_CRASH_ANR:Z = true

.field private static final DEFAULT_VALUE_CRASH_JAVA:Z = true

.field private static final DEFAULT_VALUE_CRASH_NATIVE:Z = true

.field private static final DEFAULT_VALUE_CRASH_UNEXP:Z = false

.field private static final DEFAULT_VALUE_FLUTTER:Z = true

.field private static final DEFAULT_VALUE_H5PAGE:Z = true

.field private static final DEFAULT_VALUE_LAUNCH:Z = true

.field private static final DEFAULT_VALUE_MEM:Z = true

.field private static final DEFAULT_VALUE_NET:Z = true

.field private static final DEFAULT_VALUE_PA:Z = true

.field private static final DEFAULT_VALUE_PAGE:Z = true

.field private static final DEFAULT_VALUE_POWER:Z = true

.field private static final INTEGRATIONTESTING_SP:Ljava/lang/String; = "itconfig"

.field private static final IT_DEBUGKEY:Ljava/lang/String; = "apm_debugkey"

.field private static final IT_SENDAGING:Ljava/lang/String; = "apm_sendaging"

.field private static final KEY_ACTIITY_ON_CREATED:Ljava/lang/String; = "onCreated"

.field private static final KEY_ACTIITY_ON_DESTROYED:Ljava/lang/String; = "onDestroyed"

.field private static final KEY_ACTIITY_ON_PAUSED:Ljava/lang/String; = "onPaused"

.field private static final KEY_ACTIITY_ON_RESUMED:Ljava/lang/String; = "onResumed"

.field private static final KEY_ACTIITY_ON_STARTED:Ljava/lang/String; = "onStarted"

.field private static final KEY_ACTIITY_ON_STOPPED:Ljava/lang/String; = "onStopped"

.field public static final KEY_APM_DEFAULT_SECRET:Ljava/lang/String; = "NEej8y@anWa*8hep"

.field public static final KEY_APM_ROOT_NAME:Ljava/lang/String; = "UApm"

.field public static final KEY_CALLBACK_PAGE_ACTION:Ljava/lang/String; = "um_action_log"

.field public static final KEY_CALLBACK_SESSION_ID:Ljava/lang/String; = "um_session_id"

.field public static final KEY_CALLBACK_UMID:Ljava/lang/String; = "um_umid"

.field private static final KEY_CALLBACK_USER_STRING:Ljava/lang/String; = "um_user_string"

.field public static final KEY_DEBUGKEY:Ljava/lang/String; = "um_dk"

.field public static final KEY_ENABLE_ANR:Ljava/lang/String; = "enableANRLog"

.field public static final KEY_ENABLE_CRASH_JAVA:Ljava/lang/String; = "enableJavaLog"

.field public static final KEY_ENABLE_CRASH_NATIVE:Ljava/lang/String; = "enableNativeLog"

.field public static final KEY_ENABLE_CRASH_UNEXP:Ljava/lang/String; = "enableUnexpLog"

.field public static final KEY_ENABLE_FLUTTER:Ljava/lang/String; = "enableFlutterLog"

.field public static final KEY_ENABLE_H5PAGE:Ljava/lang/String; = "enableH5PageLog"

.field public static final KEY_ENABLE_LAUNCH:Ljava/lang/String; = "enableLaunchLog"

.field public static final KEY_ENABLE_MEM:Ljava/lang/String; = "enableMemLog"

.field public static final KEY_ENABLE_NET:Ljava/lang/String; = "enableNetLog"

.field public static final KEY_ENABLE_PA:Ljava/lang/String; = "enablePaLog"

.field public static final KEY_ENABLE_PAGE:Ljava/lang/String; = "enablePageLog"

.field public static final KEY_ENABLE_POWER:Ljava/lang/String; = "enablePowerLog"

.field public static final KEY_HEADER_ACCESS:Ljava/lang/String; = "um_access"

.field public static final KEY_HEADER_ACCESS_SUBTYPE:Ljava/lang/String; = "um_access_subtype"

.field public static final KEY_HEADER_APPKEY:Ljava/lang/String; = "um_app_key"

.field public static final KEY_HEADER_BESRIAL:Ljava/lang/String; = "um_bserial"

.field public static final KEY_HEADER_BSVER:Ljava/lang/String; = "um_bsver"

.field public static final KEY_HEADER_BVER:Ljava/lang/String; = "um_bver"

.field public static final KEY_HEADER_CARRIER:Ljava/lang/String; = "um_app_carrier"

.field public static final KEY_HEADER_CHANNEL:Ljava/lang/String; = "um_app_channel"

.field public static final KEY_HEADER_CRASH_VERSION:Ljava/lang/String; = "um_crash_sdk_version"

.field public static final KEY_HEADER_DEBUGKEY:Ljava/lang/String; = "um_dk"

.field public static final KEY_HEADER_NETWORK_TYPE:Ljava/lang/String; = "um_network_type"

.field public static final KEY_HEADER_OS:Ljava/lang/String; = "um_os"

.field public static final KEY_HEADER_PROVIDER:Ljava/lang/String; = "um_app_provider"

.field public static final KEY_HEADER_PUID:Ljava/lang/String; = "um_app_puid"

.field public static final KEY_HEADER_START_TIME:Ljava/lang/String; = "um_app_start_time"

.field public static final KEY_HEADER_UMID:Ljava/lang/String; = "um_umid_header"

.field private static final KEY_MAX_LENGTH:I = 0x5000

.field private static final KEY_MAX_LENGTH_128:I = 0x80

.field public static final KEY_PA_TIMEOUT_TIME:Ljava/lang/String; = "pa_timeout_time"

.field public static final SP_KEY_DEBUG:Ljava/lang/String; = "debugkey"

.field public static final SP_KEY_TIMESTAMP:Ljava/lang/String; = "timestamp"

.field private static final TAG:Ljava/lang/String; = "UMCrash"

.field private static crashSdkVersion:Ljava/lang/String; = "1.9.5"

.field private static enableANRLog:Z = false

.field private static enableFlutterLog:Z = false

.field private static enableH5PageLog:Z = false

.field private static enableJavaLog:Z = false

.field private static enableLaunchLog:Z = false

.field private static enableMemLog:Z = false

.field private static enableNativeLog:Z = false

.field private static enableNetLog:Z = false

.field private static enablePaLog:Z = false

.field private static enablePageLog:Z = false

.field private static enablePowerLog:Z = false

.field private static index:I = 0x0

.field private static isBuildId:Z = true

.field private static isDebug:Z = true

.field private static isEncrypt:Z = false

.field private static isFlutter:Z = false

.field private static isIntl:Z = false

.field private static isLa:Z = false

.field private static isNet:Z = false

.field private static isOpenUserCrash:Z = false

.field private static isPA:Z = false

.field private static isPage:Z = false

.field private static isPower:Z = false

.field private static isUploadNowUserCrash:Z = false

.field private static isZip:Z = true

.field private static mArrayList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static mContext:Landroid/content/Context;

.field private static mUMCrashCallback:Lcom/umeng/umcrash/UMCrashCallback;

.field private static paTimeoutTime:J

.field private static pageArrayLock:Ljava/lang/Object;

.field public static sReporter:Lcom/efs/sdk/base/EfsReporter;

.field private static userBesrial:Ljava/lang/String;

.field private static userBsver:Ljava/lang/String;

.field private static userBver:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/umeng/umcrash/UMCrash;->pageArrayLock:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    const/16 v1, 0xa

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcom/umeng/umcrash/UMCrash;->mArrayList:Ljava/util/ArrayList;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    sput-boolean v0, Lcom/umeng/umcrash/UMCrash;->isPA:Z

    .line 19
    .line 20
    sput-boolean v0, Lcom/umeng/umcrash/UMCrash;->isLa:Z

    .line 21
    .line 22
    sput-boolean v0, Lcom/umeng/umcrash/UMCrash;->isNet:Z

    .line 23
    .line 24
    sput-boolean v0, Lcom/umeng/umcrash/UMCrash;->isPage:Z

    .line 25
    .line 26
    sput-boolean v0, Lcom/umeng/umcrash/UMCrash;->isPower:Z

    .line 27
    .line 28
    sput-boolean v0, Lcom/umeng/umcrash/UMCrash;->isFlutter:Z

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    sput-boolean v1, Lcom/umeng/umcrash/UMCrash;->enableJavaLog:Z

    .line 32
    .line 33
    sput-boolean v1, Lcom/umeng/umcrash/UMCrash;->enableNativeLog:Z

    .line 34
    .line 35
    sput-boolean v1, Lcom/umeng/umcrash/UMCrash;->enableANRLog:Z

    .line 36
    .line 37
    sput-boolean v1, Lcom/umeng/umcrash/UMCrash;->enablePaLog:Z

    .line 38
    .line 39
    sput-boolean v1, Lcom/umeng/umcrash/UMCrash;->enableLaunchLog:Z

    .line 40
    .line 41
    sput-boolean v1, Lcom/umeng/umcrash/UMCrash;->enableMemLog:Z

    .line 42
    .line 43
    sput-boolean v1, Lcom/umeng/umcrash/UMCrash;->enableNetLog:Z

    .line 44
    .line 45
    sput-boolean v1, Lcom/umeng/umcrash/UMCrash;->enableH5PageLog:Z

    .line 46
    .line 47
    sput-boolean v1, Lcom/umeng/umcrash/UMCrash;->enablePageLog:Z

    .line 48
    .line 49
    sput-boolean v1, Lcom/umeng/umcrash/UMCrash;->enablePowerLog:Z

    .line 50
    .line 51
    sput-boolean v1, Lcom/umeng/umcrash/UMCrash;->enableFlutterLog:Z

    .line 52
    .line 53
    const-wide/16 v2, 0x7d0

    .line 54
    .line 55
    sput-wide v2, Lcom/umeng/umcrash/UMCrash;->paTimeoutTime:J

    .line 56
    .line 57
    sput v0, Lcom/umeng/umcrash/UMCrash;->index:I

    .line 58
    .line 59
    sput-boolean v1, Lcom/umeng/umcrash/UMCrash;->isOpenUserCrash:Z

    .line 60
    .line 61
    sput-boolean v0, Lcom/umeng/umcrash/UMCrash;->isUploadNowUserCrash:Z

    .line 62
    .line 63
    return-void
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000()Ljava/util/ArrayList;
    .locals 1

    sget-object v0, Lcom/umeng/umcrash/UMCrash;->mArrayList:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$100()Z
    .locals 1

    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isPage:Z

    return v0
.end method

.method static synthetic access$1000()I
    .locals 1

    sget v0, Lcom/umeng/umcrash/UMCrash;->index:I

    return v0
.end method

.method static synthetic access$1008()I
    .locals 2

    sget v0, Lcom/umeng/umcrash/UMCrash;->index:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lcom/umeng/umcrash/UMCrash;->index:I

    return v0
.end method

.method static synthetic access$1010()I
    .locals 2

    sget v0, Lcom/umeng/umcrash/UMCrash;->index:I

    add-int/lit8 v1, v0, -0x1

    sput v1, Lcom/umeng/umcrash/UMCrash;->index:I

    return v0
.end method

.method static synthetic access$1100()J
    .locals 2

    sget-wide v0, Lcom/umeng/umcrash/UMCrash;->paTimeoutTime:J

    return-wide v0
.end method

.method static synthetic access$1302(Z)Z
    .locals 0

    sput-boolean p0, Lcom/umeng/umcrash/UMCrash;->isPA:Z

    return p0
.end method

.method static synthetic access$1400(Landroid/content/Context;Ljava/util/Map;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/umeng/umcrash/UMCrash;->saveLocalCrashSampling(Landroid/content/Context;Ljava/util/Map;)V

    return-void
.end method

.method static synthetic access$1500(Landroid/content/Context;Ljava/util/Map;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/umeng/umcrash/UMCrash;->updateLocalCrashConfig(Landroid/content/Context;Ljava/util/Map;)V

    return-void
.end method

.method static synthetic access$1602(Z)Z
    .locals 0

    sput-boolean p0, Lcom/umeng/umcrash/UMCrash;->isUploadNowUserCrash:Z

    return p0
.end method

.method static synthetic access$200()Z
    .locals 1

    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    return v0
.end method

.method static synthetic access$300()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$400()Landroid/content/Context;
    .locals 1

    sget-object v0, Lcom/umeng/umcrash/UMCrash;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$500(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/umeng/umcrash/UMCrash;->getUMID(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$600()Lcom/umeng/umcrash/UMCrashCallback;
    .locals 1

    sget-object v0, Lcom/umeng/umcrash/UMCrash;->mUMCrashCallback:Lcom/umeng/umcrash/UMCrashCallback;

    return-object v0
.end method

.method static synthetic access$700(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/umeng/umcrash/UMCrash;->getSessionId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$900(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/umeng/umcrash/UMCrash;->saveActivityState(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static enableANRLog(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sput-boolean p0, Lcom/umeng/umcrash/UMCrash;->enableANRLog:Z

    return-void
.end method

.method public static enableJavaScriptBridge(Landroid/view/View;)V
    .locals 0

    .line 2
    :try_start_0
    invoke-static {p0}, Lcom/efs/sdk/h5pagesdk/H5Manager;->setWebView(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static enableJavaScriptBridge(Landroid/webkit/WebView;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/umeng/umcrash/UMCrash;->enableJavaScriptBridge(Landroid/view/View;)V

    return-void
.end method

.method public static enableMemoryMonitor(Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lcom/efs/sdk/memoryinfo/UMMemoryMonitor;->get()Lcom/efs/sdk/memoryinfo/UMMemoryMonitorApi;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/efs/sdk/memoryinfo/UMMemoryMonitorApi;->setEnable(Z)V

    return-void
.end method

.method public static enableNativeLog(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sput-boolean p0, Lcom/umeng/umcrash/UMCrash;->enableNativeLog:Z

    return-void
.end method

.method public static generateCustomLog(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    const-string v0, "exception"

    .line 19
    sget-boolean v1, Lcom/umeng/umcrash/UMCrash;->isOpenUserCrash:Z

    if-nez v1, :cond_0

    .line 20
    sget-object p0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string p1, "generate user is closed ."

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 21
    :cond_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_2

    .line 22
    :cond_1
    :try_start_0
    new-instance v1, Lcom/uc/crashsdk/export/CustomLogInfo;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Lcom/uc/crashsdk/export/CustomLogInfo;-><init>(Ljava/lang/StringBuffer;Ljava/lang/String;)V

    .line 23
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const-string v3, "um_umid"

    .line 24
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v3, "um_action_log"

    .line 25
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v3, "um_session_id"

    .line 26
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v3, "um_user_string"

    .line 27
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    iput-object v2, v1, Lcom/uc/crashsdk/export/CustomLogInfo;->mCallbacks:Ljava/util/ArrayList;

    .line 29
    sget-object v2, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "upload is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-boolean v4, Lcom/umeng/umcrash/UMCrash;->isUploadNowUserCrash:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    sget-boolean v2, Lcom/umeng/umcrash/UMCrash;->isUploadNowUserCrash:Z

    iput-boolean v2, v1, Lcom/uc/crashsdk/export/CustomLogInfo;->mUploadNow:Z

    .line 31
    new-instance v2, Ljava/util/HashMap;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(I)V

    const-string v3, "k_ct"

    .line 32
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "k_ac"

    .line 33
    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    new-instance p1, Ljava/lang/StringBuffer;

    invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V

    .line 35
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v3, "\n"

    if-eqz v2, :cond_2

    :try_start_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 36
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v4, ":"

    invoke-virtual {p1, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 37
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception message:\nBack traces starts.\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "Back traces ends."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 38
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 39
    invoke-virtual {p1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 40
    :cond_3
    iput-object p1, v1, Lcom/uc/crashsdk/export/CustomLogInfo;->mData:Ljava/lang/StringBuffer;

    .line 41
    invoke-static {}, Lcom/uc/crashsdk/export/CrashApi;->getInstance()Lcom/uc/crashsdk/export/CrashApi;

    move-result-object p0

    if-nez p0, :cond_4

    .line 42
    sget-object p0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string p1, "CrashApi is null, not init ."

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 43
    :cond_4
    invoke-virtual {p0, v1}, Lcom/uc/crashsdk/export/CrashApi;->generateCustomLog(Lcom/uc/crashsdk/export/CustomLogInfo;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :goto_1
    return-void

    .line 44
    :cond_5
    :goto_2
    sget-object p0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string p1, "generate custom log failed ! e is null or type is empty ."

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static generateCustomLog(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isOpenUserCrash:Z

    if-nez v0, :cond_0

    .line 2
    sget-object p0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string p1, "generate user is closed ."

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    if-eqz p0, :cond_3

    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 4
    :cond_1
    :try_start_0
    new-instance v0, Lcom/umeng/umcrash/UMCustomLogInfoBuilder;

    invoke-direct {v0, p1}, Lcom/umeng/umcrash/UMCustomLogInfoBuilder;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0, p0}, Lcom/umeng/umcrash/UMCustomLogInfoBuilder;->stack(Ljava/lang/Throwable;)Lcom/umeng/umcrash/UMCustomLogInfoBuilder;

    move-result-object p0

    .line 6
    invoke-virtual {p0}, Lcom/umeng/umcrash/UMCustomLogInfoBuilder;->build()Lcom/uc/crashsdk/export/CustomLogInfo;

    move-result-object p0

    .line 7
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const-string v0, "um_umid"

    .line 8
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v0, "um_action_log"

    .line 9
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v0, "um_session_id"

    .line 10
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v0, "um_user_string"

    .line 11
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    iput-object p1, p0, Lcom/uc/crashsdk/export/CustomLogInfo;->mCallbacks:Ljava/util/ArrayList;

    .line 13
    sget-object p1, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "upload is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-boolean v1, Lcom/umeng/umcrash/UMCrash;->isUploadNowUserCrash:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isUploadNowUserCrash:Z

    iput-boolean v0, p0, Lcom/uc/crashsdk/export/CustomLogInfo;->mUploadNow:Z

    .line 15
    invoke-static {}, Lcom/uc/crashsdk/export/CrashApi;->getInstance()Lcom/uc/crashsdk/export/CrashApi;

    move-result-object v0

    if-nez v0, :cond_2

    const-string p0, "CrashApi is null, not init ."

    .line 16
    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 17
    :cond_2
    invoke-virtual {v0, p0}, Lcom/uc/crashsdk/export/CrashApi;->generateCustomLog(Lcom/uc/crashsdk/export/CustomLogInfo;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :goto_0
    return-void

    .line 18
    :cond_3
    :goto_1
    sget-object p0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string p1, "generate custom log failed ! e is null or type is empty ."

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static getReporter()Lcom/efs/sdk/base/EfsReporter;
    .locals 1

    sget-object v0, Lcom/umeng/umcrash/UMCrash;->sReporter:Lcom/efs/sdk/base/EfsReporter;

    return-object v0
.end method

.method private static declared-synchronized getSessionId(Landroid/content/Context;)Ljava/lang/String;
    .locals 8

    .line 1
    const-class v0, Lcom/umeng/umcrash/UMCrash;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    monitor-exit v0

    .line 8
    return-object v1

    .line 9
    :cond_0
    :try_start_0
    const-string v2, "com.umeng.commonsdk.statistics.common.DeviceConfig"

    .line 10
    .line 11
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_2

    .line 18
    :catch_0
    move-object v2, v1

    .line 19
    :goto_0
    if-eqz v2, :cond_1

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x1

    .line 23
    :try_start_1
    const-string v5, "getSid"

    .line 24
    .line 25
    new-array v6, v4, [Ljava/lang/Class;

    .line 26
    .line 27
    const-class v7, Landroid/content/Context;

    .line 28
    .line 29
    aput-object v7, v6, v3

    .line 30
    .line 31
    invoke-virtual {v2, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 32
    .line 33
    .line 34
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    goto :goto_1

    .line 36
    :catch_1
    move-object v2, v1

    .line 37
    :goto_1
    if-eqz v2, :cond_1

    .line 38
    .line 39
    :try_start_2
    new-array v4, v4, [Ljava/lang/Object;

    .line 40
    .line 41
    aput-object p0, v4, v3

    .line 42
    .line 43
    invoke-virtual {v2, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-eqz p0, :cond_1

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 53
    move-object v1, p0

    .line 54
    goto :goto_3

    .line 55
    :goto_2
    monitor-exit v0

    .line 56
    throw p0

    .line 57
    :catch_2
    :cond_1
    :goto_3
    monitor-exit v0

    .line 58
    return-object v1
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public static getUMAPMFlag()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    const-string v1, "version"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    const-string v1, "crash"

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 16
    .line 17
    .line 18
    sget-boolean v1, Lcom/umeng/umcrash/UMCrash;->enableJavaLog:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    const-string v4, "crashJava"

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    :try_start_1
    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v0, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 29
    .line 30
    .line 31
    :goto_0
    sget-boolean v1, Lcom/umeng/umcrash/UMCrash;->enableNativeLog:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    const-string v4, "crashNative"

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    :try_start_2
    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {v0, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 42
    .line 43
    .line 44
    :goto_1
    sget-boolean v1, Lcom/umeng/umcrash/UMCrash;->enableANRLog:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 45
    .line 46
    const-string v4, "anr"

    .line 47
    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    :try_start_3
    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    invoke-virtual {v0, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 55
    .line 56
    .line 57
    :goto_2
    sget-boolean v1, Lcom/umeng/umcrash/UMCrash;->isPA:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 58
    .line 59
    const-string v4, "pa"

    .line 60
    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    :try_start_4
    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 64
    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    invoke-virtual {v0, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 68
    .line 69
    .line 70
    :goto_3
    sget-boolean v1, Lcom/umeng/umcrash/UMCrash;->isLa:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 71
    .line 72
    const-string v4, "la"

    .line 73
    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    :try_start_5
    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 77
    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_4
    invoke-virtual {v0, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 81
    .line 82
    .line 83
    :goto_4
    invoke-static {}, Lcom/efs/sdk/memoryinfo/UMMemoryMonitor;->get()Lcom/efs/sdk/memoryinfo/UMMemoryMonitorApi;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-interface {v1}, Lcom/efs/sdk/memoryinfo/UMMemoryMonitorApi;->isEnable()Z

    .line 88
    .line 89
    .line 90
    move-result v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 91
    const-string v4, "mem"

    .line 92
    .line 93
    if-eqz v1, :cond_5

    .line 94
    .line 95
    :try_start_6
    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 96
    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_5
    invoke-virtual {v0, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 100
    .line 101
    .line 102
    :goto_5
    sget-boolean v1, Lcom/umeng/umcrash/UMCrash;->isNet:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 103
    .line 104
    const-string v4, "net"

    .line 105
    .line 106
    if-eqz v1, :cond_6

    .line 107
    .line 108
    :try_start_7
    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 109
    .line 110
    .line 111
    goto :goto_6

    .line 112
    :cond_6
    invoke-virtual {v0, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 113
    .line 114
    .line 115
    :goto_6
    invoke-static {}, Lcom/efs/sdk/h5pagesdk/H5Manager;->getH5ConfigMananger()Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;

    .line 116
    .line 117
    .line 118
    move-result-object v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 119
    const-string v4, "h5"

    .line 120
    .line 121
    if-eqz v1, :cond_7

    .line 122
    .line 123
    :try_start_8
    invoke-static {}, Lcom/efs/sdk/h5pagesdk/H5Manager;->getH5ConfigMananger()Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v1}, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->isH5TracerEnable()Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_7

    .line 132
    .line 133
    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 134
    .line 135
    .line 136
    goto :goto_7

    .line 137
    :cond_7
    invoke-virtual {v0, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 138
    .line 139
    .line 140
    :goto_7
    sget-boolean v1, Lcom/umeng/umcrash/UMCrash;->isOpenUserCrash:Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 141
    .line 142
    const-string v4, "crashUser"

    .line 143
    .line 144
    if-eqz v1, :cond_8

    .line 145
    .line 146
    :try_start_9
    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 147
    .line 148
    .line 149
    goto :goto_8

    .line 150
    :cond_8
    invoke-virtual {v0, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 151
    .line 152
    .line 153
    :goto_8
    sget-boolean v1, Lcom/umeng/umcrash/UMCrash;->isPage:Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 154
    .line 155
    const-string v4, "page"

    .line 156
    .line 157
    if-eqz v1, :cond_9

    .line 158
    .line 159
    :try_start_a
    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 160
    .line 161
    .line 162
    goto :goto_9

    .line 163
    :cond_9
    invoke-virtual {v0, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 164
    .line 165
    .line 166
    :goto_9
    sget-boolean v1, Lcom/umeng/umcrash/UMCrash;->isPower:Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 167
    .line 168
    const-string v4, "power"

    .line 169
    .line 170
    if-eqz v1, :cond_a

    .line 171
    .line 172
    :try_start_b
    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 173
    .line 174
    .line 175
    goto :goto_a

    .line 176
    :cond_a
    invoke-virtual {v0, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 177
    .line 178
    .line 179
    :catchall_0
    :goto_a
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    return-object v0
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method

.method private static declared-synchronized getUMID(Landroid/content/Context;)Ljava/lang/String;
    .locals 8

    .line 1
    const-class v0, Lcom/umeng/umcrash/UMCrash;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    monitor-exit v0

    .line 8
    return-object v1

    .line 9
    :cond_0
    :try_start_0
    const-string v2, "com.umeng.commonsdk.UMConfigure"

    .line 10
    .line 11
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_2

    .line 18
    :catch_0
    move-object v2, v1

    .line 19
    :goto_0
    if-eqz v2, :cond_1

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x1

    .line 23
    :try_start_1
    const-string v5, "getUMIDString"

    .line 24
    .line 25
    new-array v6, v4, [Ljava/lang/Class;

    .line 26
    .line 27
    const-class v7, Landroid/content/Context;

    .line 28
    .line 29
    aput-object v7, v6, v3

    .line 30
    .line 31
    invoke-virtual {v2, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 32
    .line 33
    .line 34
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    goto :goto_1

    .line 36
    :catch_1
    move-object v2, v1

    .line 37
    :goto_1
    if-eqz v2, :cond_1

    .line 38
    .line 39
    :try_start_2
    new-array v4, v4, [Ljava/lang/Object;

    .line 40
    .line 41
    aput-object p0, v4, v3

    .line 42
    .line 43
    invoke-virtual {v2, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-eqz p0, :cond_1

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 53
    move-object v1, p0

    .line 54
    goto :goto_3

    .line 55
    :goto_2
    monitor-exit v0

    .line 56
    throw p0

    .line 57
    :catch_2
    :cond_1
    :goto_3
    monitor-exit v0

    .line 58
    return-object v1
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public static init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v3, "um_app_provider"

    const-string v4, "um_app_puid"

    const-string v5, "https://errnewlogos.umeng.com"

    const-string v6, "https://errnewlog.umeng.com"

    const-string v7, ""

    if-eqz v1, :cond_39

    if-nez v2, :cond_0

    goto/16 :goto_15

    .line 1
    :cond_0
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v8, "==================\u53ef\u63a5\u5165\u514d\u8d39\u7684\u7f51\u7edc\u5206\u6790\u80fd\u529b!!!===================\n============================\u8be6\u60c5\u89c1============================\nhttps://developer.umeng.com/docs/193624/detail/194590#h2-n5n-d0l-fmj"

    invoke-static {v0, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    sput-object v1, Lcom/umeng/umcrash/UMCrash;->mContext:Landroid/content/Context;

    .line 3
    :try_start_0
    new-instance v0, Lcom/umeng/umcrash/UMCrash$1;

    invoke-direct {v0, v1}, Lcom/umeng/umcrash/UMCrash$1;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lcom/efs/sdk/base/core/util/concurrent/WorkThreadUtil;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    const/4 v8, 0x0

    const/4 v9, -0x1

    .line 5
    :try_start_1
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->mContext:Landroid/content/Context;

    const-string v10, "apm_ctr_flag"

    invoke-static {v0, v10, v8}, Lcom/umeng/umcrash/UMCrashUtils;->getInnerConfig(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    .line 6
    sget-boolean v10, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v10, :cond_1

    .line 7
    sget-object v10, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "int apm. flag is "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_1
    if-ne v0, v9, :cond_2

    return-void

    :catchall_1
    move-exception v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    const/4 v10, 0x1

    .line 9
    :try_start_2
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->mContext:Landroid/content/Context;

    const-string v11, "hit_wl"

    invoke-static {v0, v11, v8}, Lcom/umeng/umcrash/UMCrashUtils;->getInnerConfig(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    .line 10
    sget-boolean v11, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v11, :cond_3

    .line 11
    sget-object v11, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "int apm. hitWlState is "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    if-ne v0, v10, :cond_4

    move v0, v10

    goto :goto_1

    :cond_4
    move v0, v8

    .line 12
    :goto_1
    invoke-static {v0}, Lcom/efs/sdk/base/samplingwhitelist/SamplingWhiteListUtil;->setHitWL(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_2
    const-string v0, "itconfig"

    .line 14
    invoke-static {v1, v0}, Lcom/efs/sdk/base/newsharedpreferences/SharedPreferencesUtils;->getSharedPreferences(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v11

    const/16 v12, 0x64

    .line 15
    :try_start_3
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->enableJavaLog:Z

    if-eqz v0, :cond_5

    .line 16
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v13, "apm_crash_java_sampling_rate"

    invoke-static {v0, v13, v12}, Lcom/umeng/umcrash/UMCrashUtils;->getInnerConfig(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    .line 17
    invoke-static {v0}, Lcom/umeng/umcrash/UMCrashUtils;->random(I)Z

    move-result v0

    sput-boolean v0, Lcom/umeng/umcrash/UMCrash;->enableJavaLog:Z

    .line 18
    :cond_5
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->enableNativeLog:Z

    if-eqz v0, :cond_6

    .line 19
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v13, "apm_crash_native_sampling_rate"

    invoke-static {v0, v13, v12}, Lcom/umeng/umcrash/UMCrashUtils;->getInnerConfig(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    .line 20
    invoke-static {v0}, Lcom/umeng/umcrash/UMCrashUtils;->random(I)Z

    move-result v0

    sput-boolean v0, Lcom/umeng/umcrash/UMCrash;->enableNativeLog:Z

    .line 21
    :cond_6
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->enableANRLog:Z

    if-eqz v0, :cond_7

    .line 22
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v13, "apm_crash_anr_sampling_rate"

    invoke-static {v0, v13, v12}, Lcom/umeng/umcrash/UMCrashUtils;->getInnerConfig(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    .line 23
    invoke-static {v0}, Lcom/umeng/umcrash/UMCrashUtils;->random(I)Z

    move-result v0

    sput-boolean v0, Lcom/umeng/umcrash/UMCrash;->enableANRLog:Z

    .line 24
    :cond_7
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v13, "apm_crash_user_sampling_rate"

    invoke-static {v0, v13, v12}, Lcom/umeng/umcrash/UMCrashUtils;->getInnerConfig(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    .line 25
    invoke-static {v0}, Lcom/umeng/umcrash/UMCrashUtils;->random(I)Z

    move-result v0

    sput-boolean v0, Lcom/umeng/umcrash/UMCrash;->isOpenUserCrash:Z

    .line 26
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v13, "apm_crash_user_upload_type"

    invoke-static {v0, v13, v9}, Lcom/umeng/umcrash/UMCrashUtils;->getInnerConfig(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_8

    .line 27
    sput-boolean v10, Lcom/umeng/umcrash/UMCrash;->isUploadNowUserCrash:Z

    goto :goto_3

    .line 28
    :cond_8
    sput-boolean v8, Lcom/umeng/umcrash/UMCrash;->isUploadNowUserCrash:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v0

    .line 29
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 30
    :goto_3
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v13, "mDebug"

    .line 31
    sget-boolean v14, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    invoke-virtual {v0, v13, v14}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v13, "mEncryptLog"

    .line 32
    sget-boolean v14, Lcom/umeng/umcrash/UMCrash;->isEncrypt:Z

    invoke-virtual {v0, v13, v14}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v13, "mZipLog"

    .line 33
    sget-boolean v14, Lcom/umeng/umcrash/UMCrash;->isZip:Z

    invoke-virtual {v0, v13, v14}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v13, "enableJavaLog"

    .line 34
    sget-boolean v14, Lcom/umeng/umcrash/UMCrash;->enableJavaLog:Z

    invoke-virtual {v0, v13, v14}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v13, "enableNativeLog"

    .line 35
    sget-boolean v14, Lcom/umeng/umcrash/UMCrash;->enableNativeLog:Z

    invoke-virtual {v0, v13, v14}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v13, "enableANRLog"

    .line 36
    sget-boolean v14, Lcom/umeng/umcrash/UMCrash;->enableANRLog:Z

    invoke-virtual {v0, v13, v14}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 37
    sget-boolean v13, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v13, :cond_9

    .line 38
    sget-object v13, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "enable : java is "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-boolean v15, Lcom/umeng/umcrash/UMCrash;->enableJavaLog:Z

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v15, ", native is "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-boolean v15, Lcom/umeng/umcrash/UMCrash;->enableNativeLog:Z

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v15, ", anr is "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-boolean v15, Lcom/umeng/umcrash/UMCrash;->enableANRLog:Z

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_9
    const-string v13, "enableUnexpLog"

    .line 39
    invoke-virtual {v0, v13, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v13, "mIsInternational"

    .line 40
    sget-boolean v14, Lcom/umeng/umcrash/UMCrash;->isIntl:Z

    invoke-virtual {v0, v13, v14}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v13, "mDumpUserSolibBuildId"

    .line 41
    sget-boolean v14, Lcom/umeng/umcrash/UMCrash;->isBuildId:Z

    invoke-virtual {v0, v13, v14}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 42
    sget-boolean v13, Lcom/umeng/umcrash/UMCrash;->isIntl:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_8

    const-string v14, "mCrashRateUploadUrl"

    const-string v15, "mCrashSDKAuthUrl"

    const-string v12, "mCrashLogUploadUrl"

    if-eqz v13, :cond_a

    :try_start_5
    const-string v6, "https://errnewlogos.umeng.com/upload"

    .line 43
    invoke-virtual {v0, v12, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    invoke-virtual {v0, v15, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    invoke-virtual {v0, v14, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    sget-boolean v5, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v5, :cond_b

    .line 47
    sget-object v5, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v6, "crash log domain is https://errnewlogos.umeng.com"

    invoke-static {v5, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :cond_a
    const-string v5, "https://errnewlog.umeng.com/upload"

    .line 48
    invoke-virtual {v0, v12, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    invoke-virtual {v0, v15, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    invoke-virtual {v0, v14, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    sget-boolean v5, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v5, :cond_b

    .line 52
    sget-object v5, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v6, "crash rate domain is https://errnewlog.umeng.com"

    invoke-static {v5, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    :cond_b
    :goto_4
    sget-boolean v5, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    new-instance v6, Lcom/umeng/umcrash/UMCrash$CrashClientImpl;

    const/4 v12, 0x0

    invoke-direct {v6, v12}, Lcom/umeng/umcrash/UMCrash$CrashClientImpl;-><init>(Lcom/umeng/umcrash/UMCrash$1;)V

    invoke-static {v1, v2, v5, v0, v6}, Lcom/uc/crashsdk/export/CrashApi;->createInstanceEx(Landroid/content/Context;Ljava/lang/String;ZLandroid/os/Bundle;Lcom/uc/crashsdk/export/ICrashClient;)Lcom/uc/crashsdk/export/CrashApi;

    move-result-object v5

    if-eqz v5, :cond_12

    const-string v0, "um_app_key"

    .line 54
    invoke-virtual {v5, v0, v2}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "um_app_channel"
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_8

    move-object/from16 v6, p2

    .line 55
    :try_start_6
    invoke-virtual {v5, v0, v6}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "um_os"

    const-string v12, "android"

    .line 56
    invoke-virtual {v5, v0, v12}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "um_crash_sdk_version"

    .line 57
    sget-object v12, Lcom/umeng/umcrash/UMCrash;->crashSdkVersion:Ljava/lang/String;

    invoke-virtual {v5, v0, v12}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "um_umid_header"

    .line 58
    invoke-static/range {p0 .. p0}, Lcom/umeng/umcrash/UMCrash;->getUMID(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5, v0, v12}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_9

    .line 59
    :try_start_7
    invoke-static/range {p0 .. p0}, Lcom/umeng/umcrash/UMCrashUtils;->getActiveUser(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 60
    array-length v12, v0

    const/4 v13, 0x2

    if-ne v12, v13, :cond_c

    .line 61
    aget-object v12, v0, v10

    invoke-virtual {v5, v4, v12}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    aget-object v0, v0, v8

    invoke-virtual {v5, v3, v0}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_5

    .line 63
    :catchall_4
    :try_start_8
    invoke-virtual {v5, v4, v7}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    invoke-virtual {v5, v3, v7}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V

    :cond_c
    :goto_5
    const-string v0, "um_app_carrier"

    .line 65
    invoke-static/range {p0 .. p0}, Lcom/umeng/umcrash/UMCrashUtils;->getNetworkOperatorName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v0, v3}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->userBver:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_d

    const-string v0, "um_bver"

    .line 67
    sget-object v3, Lcom/umeng/umcrash/UMCrash;->userBver:Ljava/lang/String;

    invoke-virtual {v5, v0, v3}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    :cond_d
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->userBsver:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_e

    const-string v0, "um_bsver"

    .line 69
    sget-object v3, Lcom/umeng/umcrash/UMCrash;->userBsver:Ljava/lang/String;

    invoke-virtual {v5, v0, v3}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    :cond_e
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->userBesrial:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_f

    const-string v0, "um_bserial"

    .line 71
    sget-object v3, Lcom/umeng/umcrash/UMCrash;->userBesrial:Ljava/lang/String;

    invoke-virtual {v5, v0, v3}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_9

    .line 72
    :cond_f
    :try_start_9
    invoke-static/range {p0 .. p0}, Lcom/efs/sdk/base/core/util/NetworkUtil;->getNetworkTypeUmeng(Landroid/content/Context;)I

    move-result v0

    const-string v3, "um_network_type"

    .line 73
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v3, v0}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    goto :goto_6

    :catchall_5
    move-exception v0

    .line 74
    :try_start_a
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    .line 75
    :goto_6
    :try_start_b
    invoke-static/range {p0 .. p0}, Lcom/umeng/umcrash/UMCrashUtils;->isHarmony(Landroid/content/Context;)Z

    move-result v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    const-string v3, "others_OS"

    if-eqz v0, :cond_10

    :try_start_c
    const-string v0, "harmony"

    .line 76
    invoke-virtual {v5, v3, v0}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_7

    :cond_10
    const-string v0, "Android"

    .line 77
    invoke-virtual {v5, v3, v0}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    goto :goto_7

    :catchall_6
    move-exception v0

    .line 78
    :try_start_d
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 79
    :goto_7
    instance-of v0, v1, Landroid/app/Application;

    if-eqz v0, :cond_11

    .line 80
    move-object v0, v1

    check-cast v0, Landroid/app/Application;

    new-instance v3, Lcom/umeng/umcrash/UMCrash$2;

    invoke-direct {v3, v2, v11}, Lcom/umeng/umcrash/UMCrash$2;-><init>(Ljava/lang/String;Landroid/content/SharedPreferences;)V

    invoke-virtual {v0, v3}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    const-string v0, "um_umid"

    const v3, 0x100011

    .line 81
    invoke-virtual {v5, v0, v3}, Lcom/uc/crashsdk/export/CrashApi;->registerInfoCallback(Ljava/lang/String;I)I

    const-string v0, "um_action_log"

    .line 82
    invoke-virtual {v5, v0, v3}, Lcom/uc/crashsdk/export/CrashApi;->registerInfoCallback(Ljava/lang/String;I)I

    const-string v0, "um_session_id"

    .line 83
    invoke-virtual {v5, v0, v3}, Lcom/uc/crashsdk/export/CrashApi;->registerInfoCallback(Ljava/lang/String;I)I

    goto :goto_8

    .line 84
    :cond_11
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v3, "context not instanceof application."

    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    .line 85
    :goto_8
    :try_start_e
    new-instance v0, Lcom/umeng/umcrash/UMCrash$3;

    invoke-direct {v0, v1, v5}, Lcom/umeng/umcrash/UMCrash$3;-><init>(Landroid/content/Context;Lcom/uc/crashsdk/export/CrashApi;)V

    invoke-static {v0}, Lcom/efs/sdk/base/core/util/concurrent/WorkThreadUtil;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    goto :goto_9

    :catchall_7
    move-exception v0

    .line 86
    :try_start_f
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_9

    :cond_12
    move-object/from16 v6, p2

    .line 87
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v3, "create CrashAPI is null."

    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    goto :goto_9

    :catchall_8
    move-object/from16 v6, p2

    .line 88
    :catchall_9
    :goto_9
    :try_start_10
    invoke-static/range {p0 .. p2}, Lcom/umeng/umcrash/UMCrash;->initReporter(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_a

    goto :goto_a

    :catchall_a
    move-exception v0

    move-object v2, v0

    .line 89
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_a
    :try_start_11
    const-string v0, "debugkey"

    .line 90
    invoke-interface {v11, v0, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "timestamp"

    const-wide/16 v3, 0x0

    .line 91
    invoke-interface {v11, v2, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    sub-long/2addr v5, v12

    cmp-long v2, v5, v3

    if-ltz v2, :cond_13

    .line 92
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_13

    .line 93
    invoke-static {v10}, Lcom/efs/sdk/base/integrationtesting/IntegrationTestingUtil;->setIntegrationTestingInPeriod(Z)V

    .line 94
    invoke-static {v0}, Lcom/umeng/umcrash/UMCrashUtils;->setIntegrationTesingParams(Ljava/lang/String;)V

    goto :goto_b

    .line 95
    :cond_13
    invoke-interface {v11}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 96
    invoke-static {v8}, Lcom/efs/sdk/base/integrationtesting/IntegrationTestingUtil;->setIntegrationTestingInPeriod(Z)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_b

    goto :goto_b

    :catchall_b
    move-exception v0

    .line 97
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 98
    :goto_b
    :try_start_12
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->enablePaLog:Z

    if-eqz v0, :cond_14

    .line 99
    new-instance v0, Lcom/umeng/umcrash/UMCrash$4;

    invoke-direct {v0, v1}, Lcom/umeng/umcrash/UMCrash$4;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lcom/efs/sdk/base/core/util/concurrent/WorkThreadUtil;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_c

    .line 100
    :cond_14
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v0, :cond_15

    .line 101
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v2, "enablePaLog is false"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_c

    goto :goto_c

    :catchall_c
    move-exception v0

    .line 102
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 103
    :cond_15
    :goto_c
    :try_start_13
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->enableLaunchLog:Z

    if-eqz v0, :cond_19

    .line 104
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->sReporter:Lcom/efs/sdk/base/EfsReporter;

    invoke-static {v1, v0}, Lcom/efs/sdk/launch/LaunchManager;->init(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_e

    .line 105
    :try_start_14
    invoke-static {}, Lcom/efs/sdk/launch/LaunchManager;->getLaunchConfigManager()Lcom/efs/sdk/launch/LaunchConfigManager;

    move-result-object v0

    if-eqz v0, :cond_16

    .line 106
    invoke-static {}, Lcom/efs/sdk/launch/LaunchManager;->getLaunchConfigManager()Lcom/efs/sdk/launch/LaunchConfigManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/efs/sdk/launch/LaunchConfigManager;->enableTracer()Z

    move-result v0

    sput-boolean v0, Lcom/umeng/umcrash/UMCrash;->isLa:Z
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_d

    goto :goto_d

    :catchall_d
    move-exception v0

    .line 107
    :try_start_15
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 108
    :cond_16
    :goto_d
    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getUMId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_17

    .line 109
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 110
    :cond_17
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v0, :cond_18

    .line 111
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v2, "begin register common callback.  key is umid."

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    :cond_18
    invoke-static/range {p0 .. p0}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->getImprintService(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    move-result-object v0

    const-string v2, "umid"

    new-instance v3, Lcom/umeng/umcrash/UMCrash$5;

    invoke-direct {v3, v1}, Lcom/umeng/umcrash/UMCrash$5;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v2, v3}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->registImprintCallback(Ljava/lang/String;Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;)V

    goto :goto_e

    .line 113
    :cond_19
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v0, :cond_1a

    .line 114
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v2, "enableLaunchLog is false"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_e

    goto :goto_e

    :catchall_e
    move-exception v0

    .line 115
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 116
    :cond_1a
    :goto_e
    :try_start_16
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->enableMemLog:Z

    if-eqz v0, :cond_1b

    .line 117
    invoke-static {}, Lcom/efs/sdk/memoryinfo/UMMemoryMonitor;->get()Lcom/efs/sdk/memoryinfo/UMMemoryMonitorApi;

    move-result-object v0

    sget-object v2, Lcom/umeng/umcrash/UMCrash;->sReporter:Lcom/efs/sdk/base/EfsReporter;

    invoke-interface {v0, v1, v2}, Lcom/efs/sdk/memoryinfo/UMMemoryMonitorApi;->start(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V

    goto :goto_f

    .line 118
    :cond_1b
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v0, :cond_1c

    .line 119
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v2, "enableMemLog is false"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_f

    goto :goto_f

    :catchall_f
    move-exception v0

    .line 120
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 121
    :cond_1c
    :goto_f
    :try_start_17
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "apm_netperf_state"

    invoke-static {v0, v2, v9}, Lcom/umeng/umcrash/UMCrashUtils;->getInnerConfig(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    .line 122
    sget-boolean v2, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v2, :cond_1d

    .line 123
    sget-object v2, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "inner config : net rate is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1d
    if-nez v0, :cond_1e

    .line 124
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v0, :cond_24

    .line 125
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v2, "inner config : net close."

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_10

    :cond_1e
    const/16 v2, 0x64

    if-ne v0, v2, :cond_24

    .line 126
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v0, :cond_1f

    .line 127
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v2, "inner config : net open."

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    :cond_1f
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->enableNetLog:Z

    if-eqz v0, :cond_23

    .line 129
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->sReporter:Lcom/efs/sdk/base/EfsReporter;

    invoke-static {v1, v0}, Lcom/efs/sdk/net/NetManager;->init(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_11

    .line 130
    :try_start_18
    invoke-static {}, Lcom/efs/sdk/net/NetManager;->getNetConfigManager()Lcom/efs/sdk/net/NetConfigManager;

    move-result-object v0

    if-eqz v0, :cond_24

    .line 131
    invoke-static {}, Lcom/efs/sdk/net/NetManager;->getNetConfigManager()Lcom/efs/sdk/net/NetConfigManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/efs/sdk/net/NetConfigManager;->enableTracer()Z

    move-result v0

    sput-boolean v0, Lcom/umeng/umcrash/UMCrash;->isNet:Z

    .line 132
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "apm_netperf_bd_state"

    invoke-static {v0, v2, v9}, Lcom/umeng/umcrash/UMCrashUtils;->getInnerConfig(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    .line 133
    sget-boolean v2, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v2, :cond_20

    .line 134
    sget-object v2, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "inner config : net reqBody rate is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_20
    const/16 v2, 0x64

    if-ne v0, v2, :cond_22

    .line 135
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v0, :cond_21

    .line 136
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v2, "inner config : net reqbody open."

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 137
    :cond_21
    invoke-static {}, Lcom/efs/sdk/net/NetManager;->getNetConfigManager()Lcom/efs/sdk/net/NetConfigManager;

    move-result-object v0

    invoke-virtual {v0, v10}, Lcom/efs/sdk/net/NetConfigManager;->setNetRequestBodyCollectState(Z)V

    goto :goto_10

    :cond_22
    if-nez v0, :cond_24

    .line 138
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v0, :cond_24

    .line 139
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v2, "inner config : net reqbody close."

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_10

    goto :goto_10

    :catchall_10
    move-exception v0

    .line 140
    :try_start_19
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_10

    .line 141
    :cond_23
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v0, :cond_24

    .line 142
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v2, "enableNetLog is false"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_11

    goto :goto_10

    :catchall_11
    move-exception v0

    .line 143
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 144
    :cond_24
    :goto_10
    :try_start_1a
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "apm_native_h5_state"

    invoke-static {v0, v2, v9}, Lcom/umeng/umcrash/UMCrashUtils;->getInnerConfig(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    .line 145
    sget-boolean v2, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v2, :cond_25

    .line 146
    sget-object v2, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "inner config : nativeH5Rate is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_25
    if-nez v0, :cond_26

    .line 147
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v0, :cond_29

    .line 148
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v2, "inner config : h5 close."

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_11

    :cond_26
    const/16 v2, 0x64

    if-ne v0, v2, :cond_29

    .line 149
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v0, :cond_27

    .line 150
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v2, "inner config : h5 open."

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    :cond_27
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->enableH5PageLog:Z

    if-eqz v0, :cond_28

    .line 152
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->sReporter:Lcom/efs/sdk/base/EfsReporter;

    invoke-static {v1, v0}, Lcom/efs/sdk/h5pagesdk/H5Manager;->init(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V

    goto :goto_11

    .line 153
    :cond_28
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v0, :cond_29

    .line 154
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v2, "enableH5PageLog is false"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_12

    goto :goto_11

    :catchall_12
    move-exception v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 156
    :cond_29
    :goto_11
    :try_start_1b
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "apm_page_state"

    invoke-static {v0, v2, v9}, Lcom/umeng/umcrash/UMCrashUtils;->getInnerConfig(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    .line 157
    sget-boolean v2, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v2, :cond_2a

    .line 158
    sget-object v2, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "inner config : page rate is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2a
    if-nez v0, :cond_2b

    .line 159
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v0, :cond_2e

    .line 160
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v2, "inner config : page close."

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_12

    :cond_2b
    const/16 v2, 0x64

    if-ne v0, v2, :cond_2e

    .line 161
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v0, :cond_2c

    .line 162
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v2, "inner config : page open."

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 163
    :cond_2c
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->enablePageLog:Z

    if-eqz v0, :cond_2d

    .line 164
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->mContext:Landroid/content/Context;

    sget-object v2, Lcom/umeng/umcrash/UMCrash;->sReporter:Lcom/efs/sdk/base/EfsReporter;

    invoke-static {v0, v2}, Lcom/umeng/pagesdk/PageManger;->init(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_14

    .line 165
    :try_start_1c
    invoke-static {}, Lcom/umeng/pagesdk/PageManger;->getPageConfigManger()Lcom/umeng/pagesdk/PageConfigManger;

    move-result-object v0

    if-eqz v0, :cond_2e

    .line 166
    invoke-static {}, Lcom/umeng/pagesdk/PageManger;->getPageConfigManger()Lcom/umeng/pagesdk/PageConfigManger;

    move-result-object v0

    invoke-virtual {v0}, Lcom/umeng/pagesdk/PageConfigManger;->enableTracer()Z

    move-result v0

    sput-boolean v0, Lcom/umeng/umcrash/UMCrash;->isPage:Z
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_13

    goto :goto_12

    :catchall_13
    move-exception v0

    .line 167
    :try_start_1d
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_12

    .line 168
    :cond_2d
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v0, :cond_2e

    .line 169
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v2, "enablePageLog is false"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_14

    goto :goto_12

    :catchall_14
    move-exception v0

    .line 170
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 171
    :cond_2e
    :goto_12
    :try_start_1e
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "apm_power_state"

    invoke-static {v0, v2, v9}, Lcom/umeng/umcrash/UMCrashUtils;->getInnerConfig(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    .line 172
    sget-boolean v2, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v2, :cond_2f

    .line 173
    sget-object v2, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "inner config : power rate is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2f
    if-nez v0, :cond_30

    .line 174
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v0, :cond_33

    .line 175
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v2, "inner config : power close."

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_13

    :cond_30
    const/16 v2, 0x64

    if-ne v0, v2, :cond_33

    .line 176
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v0, :cond_31

    .line 177
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v2, "inner config : power open."

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 178
    :cond_31
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->enablePowerLog:Z

    if-eqz v0, :cond_32

    .line 179
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->mContext:Landroid/content/Context;

    sget-object v2, Lcom/umeng/umcrash/UMCrash;->sReporter:Lcom/efs/sdk/base/EfsReporter;

    invoke-static {v0, v2}, Lcom/umeng/powersdk/PowerManager;->init(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_16

    .line 180
    :try_start_1f
    invoke-static {}, Lcom/umeng/powersdk/PowerManager;->getPowerConfigManager()Lcom/umeng/powersdk/PowerConfigManager;

    move-result-object v0

    if-eqz v0, :cond_33

    .line 181
    invoke-static {}, Lcom/umeng/powersdk/PowerManager;->getPowerConfigManager()Lcom/umeng/powersdk/PowerConfigManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/umeng/powersdk/PowerConfigManager;->enableTracer()Z

    move-result v0

    sput-boolean v0, Lcom/umeng/umcrash/UMCrash;->isPower:Z
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_15

    goto :goto_13

    :catchall_15
    move-exception v0

    .line 182
    :try_start_20
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_13

    .line 183
    :cond_32
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v0, :cond_33

    .line 184
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v2, "enablePowerLog is false"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_16

    goto :goto_13

    :catchall_16
    move-exception v0

    .line 185
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 186
    :cond_33
    :goto_13
    :try_start_21
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "apm_flutter_state"

    invoke-static {v0, v1, v9}, Lcom/umeng/umcrash/UMCrashUtils;->getInnerConfig(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    .line 187
    sget-boolean v1, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v1, :cond_34

    .line 188
    sget-object v1, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "inner config : flutter rate is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_34
    if-nez v0, :cond_35

    .line 189
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v0, :cond_38

    .line 190
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v1, "inner config : flutter close."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_14

    :cond_35
    const/16 v1, 0x64

    if-ne v0, v1, :cond_38

    .line 191
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v0, :cond_36

    .line 192
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v1, "inner config : flutter open."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 193
    :cond_36
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->enableFlutterLog:Z

    if-eqz v0, :cond_37

    .line 194
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->mContext:Landroid/content/Context;

    sget-object v1, Lcom/umeng/umcrash/UMCrash;->sReporter:Lcom/efs/sdk/base/EfsReporter;

    invoke-static {v0, v1}, Lcom/efs/sdk/fluttersdk/FlutterManager;->init(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_18

    .line 195
    :try_start_22
    invoke-static {}, Lcom/efs/sdk/fluttersdk/FlutterManager;->getFlutterConfigManager()Lcom/efs/sdk/fluttersdk/FlutterConfigManager;

    move-result-object v0

    if-eqz v0, :cond_38

    .line 196
    invoke-static {}, Lcom/efs/sdk/fluttersdk/FlutterManager;->getFlutterConfigManager()Lcom/efs/sdk/fluttersdk/FlutterConfigManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->isFlutterEnable()Z

    move-result v0

    sput-boolean v0, Lcom/umeng/umcrash/UMCrash;->isFlutter:Z
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_17

    goto :goto_14

    :catchall_17
    move-exception v0

    .line 197
    :try_start_23
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_14

    .line 198
    :cond_37
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    if-eqz v0, :cond_38

    .line 199
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v1, "enableFlutterLog is false"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_18

    goto :goto_14

    :catchall_18
    move-exception v0

    .line 200
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_38
    :goto_14
    return-void

    .line 201
    :cond_39
    :goto_15
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    const-string v1, "context is null or appkey is null, init failed."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static initConfig(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    if-eqz p0, :cond_b

    .line 2
    .line 3
    const-string v0, "enableJavaLog"

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sput-boolean v1, Lcom/umeng/umcrash/UMCrash;->enableJavaLog:Z

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sput-boolean v2, Lcom/umeng/umcrash/UMCrash;->enableJavaLog:Z

    .line 17
    .line 18
    :goto_0
    const-string v0, "enableNativeLog"

    .line 19
    .line 20
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    sput-boolean v1, Lcom/umeng/umcrash/UMCrash;->enableNativeLog:Z

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    sput-boolean v2, Lcom/umeng/umcrash/UMCrash;->enableNativeLog:Z

    .line 30
    .line 31
    :goto_1
    const-string v0, "enableANRLog"

    .line 32
    .line 33
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    sput-boolean v1, Lcom/umeng/umcrash/UMCrash;->enableANRLog:Z

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    sput-boolean v2, Lcom/umeng/umcrash/UMCrash;->enableANRLog:Z

    .line 43
    .line 44
    :goto_2
    const-string v0, "enablePaLog"

    .line 45
    .line 46
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    sput-boolean v1, Lcom/umeng/umcrash/UMCrash;->enablePaLog:Z

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_3
    sput-boolean v2, Lcom/umeng/umcrash/UMCrash;->enablePaLog:Z

    .line 56
    .line 57
    :goto_3
    const-string v0, "enableLaunchLog"

    .line 58
    .line 59
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    sput-boolean v1, Lcom/umeng/umcrash/UMCrash;->enableLaunchLog:Z

    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_4
    sput-boolean v2, Lcom/umeng/umcrash/UMCrash;->enableLaunchLog:Z

    .line 69
    .line 70
    :goto_4
    const-string v0, "enableMemLog"

    .line 71
    .line 72
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    sput-boolean v1, Lcom/umeng/umcrash/UMCrash;->enableMemLog:Z

    .line 79
    .line 80
    goto :goto_5

    .line 81
    :cond_5
    sput-boolean v2, Lcom/umeng/umcrash/UMCrash;->enableMemLog:Z

    .line 82
    .line 83
    :goto_5
    const-string v0, "enableNetLog"

    .line 84
    .line 85
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_6

    .line 90
    .line 91
    sput-boolean v1, Lcom/umeng/umcrash/UMCrash;->enableNetLog:Z

    .line 92
    .line 93
    goto :goto_6

    .line 94
    :cond_6
    sput-boolean v2, Lcom/umeng/umcrash/UMCrash;->enableNetLog:Z

    .line 95
    .line 96
    :goto_6
    const-string v0, "enableH5PageLog"

    .line 97
    .line 98
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_7

    .line 103
    .line 104
    sput-boolean v1, Lcom/umeng/umcrash/UMCrash;->enableH5PageLog:Z

    .line 105
    .line 106
    goto :goto_7

    .line 107
    :cond_7
    sput-boolean v2, Lcom/umeng/umcrash/UMCrash;->enableH5PageLog:Z

    .line 108
    .line 109
    :goto_7
    const-string v0, "pa_timeout_time"

    .line 110
    .line 111
    const-wide/16 v3, 0x7d0

    .line 112
    .line 113
    invoke-virtual {p0, v0, v3, v4}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 114
    .line 115
    .line 116
    move-result-wide v3

    .line 117
    sput-wide v3, Lcom/umeng/umcrash/UMCrash;->paTimeoutTime:J

    .line 118
    .line 119
    const-string v0, "enablePageLog"

    .line 120
    .line 121
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_8

    .line 126
    .line 127
    sput-boolean v1, Lcom/umeng/umcrash/UMCrash;->enablePageLog:Z

    .line 128
    .line 129
    goto :goto_8

    .line 130
    :cond_8
    sput-boolean v2, Lcom/umeng/umcrash/UMCrash;->enablePageLog:Z

    .line 131
    .line 132
    :goto_8
    const-string v0, "enablePowerLog"

    .line 133
    .line 134
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_9

    .line 139
    .line 140
    sput-boolean v1, Lcom/umeng/umcrash/UMCrash;->enablePowerLog:Z

    .line 141
    .line 142
    goto :goto_9

    .line 143
    :cond_9
    sput-boolean v2, Lcom/umeng/umcrash/UMCrash;->enablePowerLog:Z

    .line 144
    .line 145
    :goto_9
    const-string v0, "enableFlutterLog"

    .line 146
    .line 147
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    if-eqz p0, :cond_a

    .line 152
    .line 153
    sput-boolean v1, Lcom/umeng/umcrash/UMCrash;->enableFlutterLog:Z

    .line 154
    .line 155
    goto :goto_a

    .line 156
    :cond_a
    sput-boolean v2, Lcom/umeng/umcrash/UMCrash;->enableFlutterLog:Z

    .line 157
    .line 158
    :cond_b
    :goto_a
    return-void
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
.end method

.method private static initReporter(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 13

    .line 1
    const-string v0, "um_app_provider"

    .line 2
    .line 3
    const-string v1, "um_app_puid"

    .line 4
    .line 5
    new-instance v2, Ljava/util/HashMap;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const-string v4, "um_umid_header"

    .line 12
    .line 13
    invoke-static {p0}, Lcom/umeng/umcrash/UMCrash;->getUMID(Landroid/content/Context;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    const-string v4, "um_app_channel"

    .line 21
    .line 22
    invoke-virtual {v2, v4, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    const-string p2, "um_app_carrier"

    .line 26
    .line 27
    invoke-static {p0}, Lcom/umeng/umcrash/UMCrashUtils;->getNetworkOperatorName(Landroid/content/Context;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v2, p2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    const-string p2, "um_os"

    .line 35
    .line 36
    const-string v4, "android"

    .line 37
    .line 38
    invoke-virtual {v2, p2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    const-string p2, "um_crash_sdk_version"

    .line 42
    .line 43
    sget-object v4, Lcom/umeng/umcrash/UMCrash;->crashSdkVersion:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v2, p2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    const/4 p2, 0x0

    .line 49
    :try_start_0
    invoke-static {p0}, Lcom/umeng/umcrash/UMCrashUtils;->getActiveUser(Landroid/content/Context;)[Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    if-eqz v4, :cond_0

    .line 54
    .line 55
    array-length v5, v4

    .line 56
    const/4 v6, 0x2

    .line 57
    if-ne v5, v6, :cond_0

    .line 58
    .line 59
    aget-object v3, v4, v3

    .line 60
    .line 61
    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    aget-object v3, v4, p2

    .line 65
    .line 66
    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    const-string v3, ""

    .line 71
    .line 72
    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    :cond_0
    :goto_0
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->userBver:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_1

    .line 85
    .line 86
    const-string v0, "um_bver"

    .line 87
    .line 88
    sget-object v1, Lcom/umeng/umcrash/UMCrash;->userBver:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    :cond_1
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->userBsver:Ljava/lang/String;

    .line 94
    .line 95
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_2

    .line 100
    .line 101
    const-string v0, "um_bsver"

    .line 102
    .line 103
    sget-object v1, Lcom/umeng/umcrash/UMCrash;->userBsver:Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    :cond_2
    sget-object v0, Lcom/umeng/umcrash/UMCrash;->userBesrial:Ljava/lang/String;

    .line 109
    .line 110
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-nez v0, :cond_3

    .line 115
    .line 116
    const-string v0, "um_bserial"

    .line 117
    .line 118
    sget-object v1, Lcom/umeng/umcrash/UMCrash;->userBesrial:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    :cond_3
    :try_start_1
    invoke-static {p0}, Lcom/umeng/umcrash/UMCrashUtils;->isHarmony(Landroid/content/Context;)Z

    .line 124
    .line 125
    .line 126
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 127
    const-string v1, "others_OS"

    .line 128
    .line 129
    if-eqz v0, :cond_4

    .line 130
    .line 131
    :try_start_2
    const-string v0, "harmony"

    .line 132
    .line 133
    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_4
    const-string v0, "Android"

    .line 138
    .line 139
    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :catchall_1
    move-exception v0

    .line 144
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 145
    .line 146
    .line 147
    :goto_1
    new-instance v0, Lcom/efs/sdk/base/EfsReporter$Builder;

    .line 148
    .line 149
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    const-string v3, "NEej8y@anWa*8hep"

    .line 154
    .line 155
    invoke-direct {v0, v1, p1, v3}, Lcom/efs/sdk/base/EfsReporter$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    sget-boolean p1, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    .line 159
    .line 160
    invoke-virtual {v0, p1}, Lcom/efs/sdk/base/EfsReporter$Builder;->debug(Z)Lcom/efs/sdk/base/EfsReporter$Builder;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    const-string v0, "UApm"

    .line 165
    .line 166
    invoke-virtual {p1, v0}, Lcom/efs/sdk/base/EfsReporter$Builder;->efsDirRootName(Ljava/lang/String;)Lcom/efs/sdk/base/EfsReporter$Builder;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    .line 171
    .line 172
    invoke-virtual {p1, v0}, Lcom/efs/sdk/base/EfsReporter$Builder;->printLogDetail(Z)Lcom/efs/sdk/base/EfsReporter$Builder;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isIntl:Z

    .line 177
    .line 178
    invoke-virtual {p1, v0}, Lcom/efs/sdk/base/EfsReporter$Builder;->intl(Z)Lcom/efs/sdk/base/EfsReporter$Builder;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {p1, p2}, Lcom/efs/sdk/base/EfsReporter$Builder;->enableWaStat(Z)Lcom/efs/sdk/base/EfsReporter$Builder;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-virtual {p1}, Lcom/efs/sdk/base/EfsReporter$Builder;->build()Lcom/efs/sdk/base/EfsReporter;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    sput-object p1, Lcom/umeng/umcrash/UMCrash;->sReporter:Lcom/efs/sdk/base/EfsReporter;

    .line 191
    .line 192
    invoke-virtual {p1, v2}, Lcom/efs/sdk/base/EfsReporter;->addPublicParams(Ljava/util/Map;)V

    .line 193
    .line 194
    .line 195
    :try_start_3
    sget-object p1, Lcom/umeng/umcrash/UMCrash;->sReporter:Lcom/efs/sdk/base/EfsReporter;

    .line 196
    .line 197
    const-string v0, "hit_wl"

    .line 198
    .line 199
    const-string v1, "apm_flutter_state"

    .line 200
    .line 201
    const-string v2, "apm_power_state"

    .line 202
    .line 203
    const-string v3, "apm_page_state"

    .line 204
    .line 205
    const-string v4, "apm_netperf_state"

    .line 206
    .line 207
    const-string v5, "apm_netperf_bd_state"

    .line 208
    .line 209
    const-string v6, "apm_native_h5_state"

    .line 210
    .line 211
    const-string v7, "apm_crash_java_sampling_rate"

    .line 212
    .line 213
    const-string v8, "apm_crash_native_sampling_rate"

    .line 214
    .line 215
    const-string v9, "apm_crash_anr_sampling_rate"

    .line 216
    .line 217
    const-string v10, "apm_crash_user_sampling_rate"

    .line 218
    .line 219
    const-string v11, "apm_crash_user_max_count"

    .line 220
    .line 221
    const-string v12, "apm_crash_user_upload_type"

    .line 222
    .line 223
    filled-new-array/range {v0 .. v12}, [Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    new-instance v0, Lcom/umeng/umcrash/UMCrash$6;

    .line 228
    .line 229
    invoke-direct {v0, p0}, Lcom/umeng/umcrash/UMCrash$6;-><init>(Landroid/content/Context;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1, p2, v0}, Lcom/efs/sdk/base/EfsReporter;->getAllSdkConfig([Ljava/lang/String;Lcom/efs/sdk/base/observer/IConfigCallback;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 233
    .line 234
    .line 235
    goto :goto_2

    .line 236
    :catchall_2
    move-exception p0

    .line 237
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 238
    .line 239
    .line 240
    :goto_2
    return-void
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
.end method

.method public static isBuildId(Z)V
    .locals 0

    sput-boolean p0, Lcom/umeng/umcrash/UMCrash;->isBuildId:Z

    return-void
.end method

.method public static registerUMCrashCallback(Lcom/umeng/umcrash/UMCrashCallback;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    sput-object p0, Lcom/umeng/umcrash/UMCrash;->mUMCrashCallback:Lcom/umeng/umcrash/UMCrashCallback;

    .line 4
    .line 5
    invoke-static {}, Lcom/uc/crashsdk/export/CrashApi;->getInstance()Lcom/uc/crashsdk/export/CrashApi;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lcom/uc/crashsdk/export/CrashApi;->getInstance()Lcom/uc/crashsdk/export/CrashApi;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, "um_user_string"

    .line 16
    .line 17
    const v1, 0x100011

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0, v1}, Lcom/uc/crashsdk/export/CrashApi;->registerInfoCallback(Ljava/lang/String;I)I

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object p0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    .line 25
    .line 26
    const-string v0, "callback error, instance is null."

    .line 27
    .line 28
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    sget-object p0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    .line 33
    .line 34
    const-string v0, "callback error."

    .line 35
    .line 36
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    :goto_0
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method private static saveActivityState(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "-"

    .line 2
    .line 3
    :try_start_0
    sget-object v1, Lcom/umeng/umcrash/UMCrash;->mArrayList:Ljava/util/ArrayList;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/16 v2, 0x14

    .line 12
    .line 13
    if-lt v1, v2, :cond_0

    .line 14
    .line 15
    sget-object v1, Lcom/umeng/umcrash/UMCrash;->mArrayList:Ljava/util/ArrayList;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    sget-object v1, Lcom/umeng/umcrash/UMCrash;->mArrayList:Ljava/util/ArrayList;

    .line 22
    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    :catchall_0
    :cond_1
    return-void
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method

.method private static saveLocalCrashSampling(Landroid/content/Context;Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_7

    .line 2
    .line 3
    if-eqz p1, :cond_7

    .line 4
    .line 5
    const-string v0, "apm_crash_java_sampling_rate"

    .line 6
    .line 7
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "efs.config"

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    sget-boolean v3, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    new-instance v3, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v4, "callback crashJavaSampling is "

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-static {v3, v0, v1}, Lcom/umeng/umcrash/UMCrashUtils;->saveInnerConfig(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    const-string v0, "apm_crash_native_sampling_rate"

    .line 51
    .line 52
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    sget-boolean v3, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    .line 59
    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    new-instance v3, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string v4, "callback crashNativeSampling is "

    .line 68
    .line 69
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    :cond_2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-static {v3, v0, v1}, Lcom/umeng/umcrash/UMCrashUtils;->saveInnerConfig(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    const-string v0, "apm_crash_anr_sampling_rate"

    .line 94
    .line 95
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    if-eqz v1, :cond_5

    .line 100
    .line 101
    sget-boolean v3, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    .line 102
    .line 103
    if-eqz v3, :cond_4

    .line 104
    .line 105
    new-instance v3, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    const-string v4, "callback crashANRSampling is "

    .line 111
    .line 112
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    :cond_4
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-static {v3, v0, v1}, Lcom/umeng/umcrash/UMCrashUtils;->saveInnerConfig(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_5
    const-string v0, "apm_crash_user_sampling_rate"

    .line 137
    .line 138
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    if-eqz p1, :cond_7

    .line 143
    .line 144
    sget-boolean v1, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    .line 145
    .line 146
    if-eqz v1, :cond_6

    .line 147
    .line 148
    new-instance v1, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 151
    .line 152
    .line 153
    const-string v3, "callback crashUserSampling is "

    .line 154
    .line 155
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 170
    .line 171
    .line 172
    :cond_6
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-static {p0, v0, p1}, Lcom/umeng/umcrash/UMCrashUtils;->saveInnerConfig(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    :cond_7
    return-void
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
.end method

.method public static setAppVersion(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x80

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    array-length v0, v0

    .line 18
    if-le v0, v1, :cond_0

    .line 19
    .line 20
    invoke-static {p0, v1}, Lcom/umeng/umcrash/UMCrashUtils;->splitByByte(Ljava/lang/String;I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :cond_0
    sput-object p0, Lcom/umeng/umcrash/UMCrash;->userBver:Ljava/lang/String;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    sget-boolean p0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    .line 28
    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    sget-object p0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    .line 32
    .line 33
    const-string v0, "version is null or empty !"

    .line 34
    .line 35
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    :cond_2
    :goto_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-nez p0, :cond_4

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    array-length p0, p0

    .line 53
    if-le p0, v1, :cond_3

    .line 54
    .line 55
    invoke-static {p1, v1}, Lcom/umeng/umcrash/UMCrashUtils;->splitByByte(Ljava/lang/String;I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :cond_3
    sput-object p1, Lcom/umeng/umcrash/UMCrash;->userBsver:Ljava/lang/String;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_4
    sget-boolean p0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    .line 63
    .line 64
    if-eqz p0, :cond_5

    .line 65
    .line 66
    sget-object p0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    .line 67
    .line 68
    const-string p1, "sub version is null or empty !"

    .line 69
    .line 70
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    :cond_5
    :goto_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-nez p0, :cond_7

    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    array-length p0, p0

    .line 88
    if-le p0, v1, :cond_6

    .line 89
    .line 90
    invoke-static {p2, v1}, Lcom/umeng/umcrash/UMCrashUtils;->splitByByte(Ljava/lang/String;I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    :cond_6
    sput-object p2, Lcom/umeng/umcrash/UMCrash;->userBesrial:Ljava/lang/String;

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_7
    sget-boolean p0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    .line 98
    .line 99
    if-eqz p0, :cond_8

    .line 100
    .line 101
    sget-object p0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    .line 102
    .line 103
    const-string p1, "build id is null or empty !"

    .line 104
    .line 105
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    :cond_8
    :goto_2
    invoke-static {}, Lcom/uc/crashsdk/export/CrashApi;->getInstance()Lcom/uc/crashsdk/export/CrashApi;

    .line 109
    .line 110
    .line 111
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    const-string p1, "um_bserial"

    .line 113
    .line 114
    const-string p2, "um_bsver"

    .line 115
    .line 116
    const-string v0, "um_bver"

    .line 117
    .line 118
    if-eqz p0, :cond_b

    .line 119
    .line 120
    :try_start_1
    sget-object v1, Lcom/umeng/umcrash/UMCrash;->userBver:Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-nez v1, :cond_9

    .line 127
    .line 128
    sget-object v1, Lcom/umeng/umcrash/UMCrash;->userBver:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {p0, v0, v1}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_9
    sget-object v1, Lcom/umeng/umcrash/UMCrash;->userBsver:Ljava/lang/String;

    .line 134
    .line 135
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-nez v1, :cond_a

    .line 140
    .line 141
    sget-object v1, Lcom/umeng/umcrash/UMCrash;->userBsver:Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {p0, p2, v1}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :cond_a
    sget-object v1, Lcom/umeng/umcrash/UMCrash;->userBesrial:Ljava/lang/String;

    .line 147
    .line 148
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-nez v1, :cond_c

    .line 153
    .line 154
    sget-object v1, Lcom/umeng/umcrash/UMCrash;->userBesrial:Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {p0, p1, v1}, Lcom/uc/crashsdk/export/CrashApi;->addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_b
    sget-boolean p0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    .line 161
    .line 162
    if-eqz p0, :cond_c

    .line 163
    .line 164
    sget-object p0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    .line 165
    .line 166
    const-string v1, "set app version. crashApi is null"

    .line 167
    .line 168
    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 169
    .line 170
    .line 171
    :cond_c
    :goto_3
    new-instance p0, Ljava/util/HashMap;

    .line 172
    .line 173
    const/4 v1, 0x1

    .line 174
    invoke-direct {p0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 175
    .line 176
    .line 177
    sget-object v1, Lcom/umeng/umcrash/UMCrash;->userBver:Ljava/lang/String;

    .line 178
    .line 179
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-nez v1, :cond_d

    .line 184
    .line 185
    sget-object v1, Lcom/umeng/umcrash/UMCrash;->userBver:Ljava/lang/String;

    .line 186
    .line 187
    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    :cond_d
    sget-object v1, Lcom/umeng/umcrash/UMCrash;->userBsver:Ljava/lang/String;

    .line 191
    .line 192
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-nez v1, :cond_e

    .line 197
    .line 198
    sget-object v1, Lcom/umeng/umcrash/UMCrash;->userBsver:Ljava/lang/String;

    .line 199
    .line 200
    invoke-virtual {p0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    :cond_e
    sget-object v1, Lcom/umeng/umcrash/UMCrash;->userBesrial:Ljava/lang/String;

    .line 204
    .line 205
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    if-nez v1, :cond_f

    .line 210
    .line 211
    sget-object v1, Lcom/umeng/umcrash/UMCrash;->userBesrial:Ljava/lang/String;

    .line 212
    .line 213
    invoke-virtual {p0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    :cond_f
    sget-object v1, Lcom/umeng/umcrash/UMCrash;->sReporter:Lcom/efs/sdk/base/EfsReporter;

    .line 217
    .line 218
    if-eqz v1, :cond_10

    .line 219
    .line 220
    invoke-virtual {v1, p0}, Lcom/efs/sdk/base/EfsReporter;->addPublicParams(Ljava/util/Map;)V

    .line 221
    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_10
    sget-boolean p0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    .line 225
    .line 226
    if-eqz p0, :cond_11

    .line 227
    .line 228
    sget-object p0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    .line 229
    .line 230
    const-string v1, "set app version.  sReporter is null"

    .line 231
    .line 232
    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 233
    .line 234
    .line 235
    :cond_11
    :goto_4
    sget-object p0, Lcom/umeng/umcrash/UMCrash;->userBver:Ljava/lang/String;

    .line 236
    .line 237
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 238
    .line 239
    .line 240
    move-result p0

    .line 241
    if-nez p0, :cond_12

    .line 242
    .line 243
    sget-object p0, Lcom/umeng/umcrash/UMCrash;->userBver:Ljava/lang/String;

    .line 244
    .line 245
    invoke-static {v0, p0}, Lcom/umeng/umcrash/UMCrashUtils;->setCommonTag(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    :cond_12
    sget-object p0, Lcom/umeng/umcrash/UMCrash;->userBsver:Ljava/lang/String;

    .line 249
    .line 250
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 251
    .line 252
    .line 253
    move-result p0

    .line 254
    if-nez p0, :cond_13

    .line 255
    .line 256
    sget-object p0, Lcom/umeng/umcrash/UMCrash;->userBsver:Ljava/lang/String;

    .line 257
    .line 258
    invoke-static {p2, p0}, Lcom/umeng/umcrash/UMCrashUtils;->setCommonTag(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    :cond_13
    sget-object p0, Lcom/umeng/umcrash/UMCrash;->userBesrial:Ljava/lang/String;

    .line 262
    .line 263
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 264
    .line 265
    .line 266
    move-result p0

    .line 267
    if-nez p0, :cond_14

    .line 268
    .line 269
    sget-object p0, Lcom/umeng/umcrash/UMCrash;->userBesrial:Ljava/lang/String;

    .line 270
    .line 271
    invoke-static {p1, p0}, Lcom/umeng/umcrash/UMCrashUtils;->setCommonTag(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 272
    .line 273
    .line 274
    goto :goto_5

    .line 275
    :catchall_0
    move-exception p0

    .line 276
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 277
    .line 278
    .line 279
    :cond_14
    :goto_5
    return-void
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
.end method

.method public static setDebug(Z)V
    .locals 0

    .line 1
    sput-boolean p0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    .line 2
    .line 3
    sput-boolean p0, Lcom/efs/sdk/launch/LaunchManager;->isDebug:Z

    .line 4
    .line 5
    sput-boolean p0, Lcom/efs/sdk/h5pagesdk/H5Manager;->isDebug:Z

    .line 6
    .line 7
    sput-boolean p0, Lcom/umeng/pagesdk/PageManger;->isDebug:Z

    .line 8
    .line 9
    sput-boolean p0, Lcom/umeng/powersdk/PowerManager;->isDebug:Z

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public static setPaTimeoutTime(J)V
    .locals 0

    sput-wide p0, Lcom/umeng/umcrash/UMCrash;->paTimeoutTime:J

    return-void
.end method

.method private static updateLocalCrashConfig(Landroid/content/Context;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    if-eqz p1, :cond_2

    .line 4
    .line 5
    new-instance p0, Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v0, "apm_crash_user_max_count"

    .line 11
    .line 12
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    sget-boolean v0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v1, "callback crashMaxUserCount is "

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v1, "efs.config"

    .line 44
    .line 45
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    const-string v1, "mMaxCustomLogCountPerTypePerDay"

    .line 61
    .line 62
    invoke-virtual {p0, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    const-string v0, "mMaxUploadCustomLogCountPerDay"

    .line 78
    .line 79
    invoke-virtual {p0, v0, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 80
    .line 81
    .line 82
    :cond_1
    invoke-static {}, Lcom/uc/crashsdk/export/CrashApi;->getInstance()Lcom/uc/crashsdk/export/CrashApi;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p1, p0}, Lcom/uc/crashsdk/export/CrashApi;->updateCustomInfo(Landroid/os/Bundle;)I

    .line 87
    .line 88
    .line 89
    :cond_2
    return-void
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method

.method private static updateLocalCrashSampling(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/uc/crashsdk/export/CrashApi;->getInstance()Lcom/uc/crashsdk/export/CrashApi;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-static {p0}, Lcom/umeng/umcrash/UMCrashUtils;->random(I)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    const/16 p0, 0x10

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Lcom/uc/crashsdk/export/CrashApi;->disableLog(I)V

    .line 30
    .line 31
    .line 32
    :cond_0
    if-eqz p1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    invoke-static {p0}, Lcom/umeng/umcrash/UMCrashUtils;->random(I)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eqz p0, :cond_1

    .line 51
    .line 52
    const/4 p0, 0x1

    .line 53
    invoke-virtual {v0, p0}, Lcom/uc/crashsdk/export/CrashApi;->disableLog(I)V

    .line 54
    .line 55
    .line 56
    :cond_1
    if-eqz p2, :cond_2

    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    invoke-static {p0}, Lcom/umeng/umcrash/UMCrashUtils;->random(I)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-eqz p0, :cond_2

    .line 75
    .line 76
    const/high16 p0, 0x100000

    .line 77
    .line 78
    invoke-virtual {v0, p0}, Lcom/uc/crashsdk/export/CrashApi;->disableLog(I)V

    .line 79
    .line 80
    .line 81
    :cond_2
    if-eqz p3, :cond_3

    .line 82
    .line 83
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    invoke-static {p0}, Lcom/umeng/umcrash/UMCrashUtils;->random(I)Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-eqz p0, :cond_3

    .line 100
    .line 101
    const/4 p0, 0x0

    .line 102
    sput-boolean p0, Lcom/umeng/umcrash/UMCrash;->isOpenUserCrash:Z

    .line 103
    .line 104
    :cond_3
    return-void
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method private static useIntlServices(Z)V
    .locals 2

    .line 1
    sput-boolean p0, Lcom/umeng/umcrash/UMCrash;->isIntl:Z

    .line 2
    .line 3
    sget-boolean p0, Lcom/umeng/umcrash/UMCrash;->isDebug:Z

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lcom/umeng/umcrash/UMCrash;->TAG:Ljava/lang/String;

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v1, "useIntlServices is "

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    sget-boolean v1, Lcom/umeng/umcrash/UMCrash;->isIntl:Z

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {p0, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method
