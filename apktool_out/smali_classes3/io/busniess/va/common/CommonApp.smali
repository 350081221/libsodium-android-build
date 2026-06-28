.class public Lio/busniess/va/common/CommonApp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/lody/virtual/helper/Keep;
.end annotation


# static fields
.field private static sUseRealLibMapCache:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mConfig:Lcom/lody/virtual/client/core/SettingConfig;

.field private mGmsInitializeReceiver:Landroid/content/BroadcastReceiver;

.field private virtualCore:Lcom/lody/virtual/client/core/VirtualCore;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/busniess/va/common/CommonApp;->sUseRealLibMapCache:Ljava/util/HashMap;

    .line 7
    .line 8
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 9
    .line 10
    const-string v2, "com.seeyon.cmp"

    .line 11
    .line 12
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    sget-object v0, Lio/busniess/va/common/CommonApp;->sUseRealLibMapCache:Ljava/util/HashMap;

    .line 16
    .line 17
    const-string v2, "com.momoklucky.worldsoccerchyccs"

    .line 18
    .line 19
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/busniess/va/common/CommonApp$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lio/busniess/va/common/CommonApp$1;-><init>(Lio/busniess/va/common/CommonApp;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/busniess/va/common/CommonApp;->mConfig:Lcom/lody/virtual/client/core/SettingConfig;

    .line 10
    .line 11
    new-instance v0, Lio/busniess/va/common/CommonApp$2;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lio/busniess/va/common/CommonApp$2;-><init>(Lio/busniess/va/common/CommonApp;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lio/busniess/va/common/CommonApp;->mGmsInitializeReceiver:Landroid/content/BroadcastReceiver;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method static synthetic access$000()Ljava/util/HashMap;
    .locals 1

    sget-object v0, Lio/busniess/va/common/CommonApp;->sUseRealLibMapCache:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic access$100(Lio/busniess/va/common/CommonApp;)Landroid/content/BroadcastReceiver;
    .locals 0

    iget-object p0, p0, Lio/busniess/va/common/CommonApp;->mGmsInitializeReceiver:Landroid/content/BroadcastReceiver;

    return-object p0
.end method

.method static synthetic access$200(Lio/busniess/va/common/CommonApp;)Lcom/lody/virtual/client/core/VirtualCore;
    .locals 0

    iget-object p0, p0, Lio/busniess/va/common/CommonApp;->virtualCore:Lcom/lody/virtual/client/core/VirtualCore;

    return-object p0
.end method


# virtual methods
.method public attachBaseContext(Landroid/content/Context;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lcom/lody/virtual/helper/utils/VLog;->OPEN_LOG:Z

    .line 3
    .line 4
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lio/busniess/va/common/CommonApp;->mConfig:Lcom/lody/virtual/client/core/SettingConfig;

    .line 9
    .line 10
    invoke-virtual {v0, p1, v1}, Lcom/lody/virtual/client/core/VirtualCore;->startup(Landroid/content/Context;Lcom/lody/virtual/client/core/SettingConfig;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 16
    .line 17
    .line 18
    :goto_0
    return-void
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

.method public onCreate(Landroid/app/Application;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lio/busniess/va/common/CommonApp;->virtualCore:Lcom/lody/virtual/client/core/VirtualCore;

    .line 6
    .line 7
    new-instance v1, Lio/busniess/va/common/CommonApp$3;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, Lio/busniess/va/common/CommonApp$3;-><init>(Lio/busniess/va/common/CommonApp;Landroid/app/Application;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/lody/virtual/client/core/VirtualCore;->initialize(Lcom/lody/virtual/client/core/VirtualCore$VirtualInitializer;)V

    .line 13
    .line 14
    .line 15
    return-void
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
