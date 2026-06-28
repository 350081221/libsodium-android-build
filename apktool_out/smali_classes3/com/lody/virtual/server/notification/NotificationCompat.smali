.class public abstract Lcom/lody/virtual/server/notification/NotificationCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final EXTRA_BIG_TEXT:Ljava/lang/String; = "android.bigText"

.field public static final EXTRA_BUILDER_APPLICATION_INFO:Ljava/lang/String; = "android.appInfo"

.field public static final EXTRA_INFO_TEXT:Ljava/lang/String; = "android.infoText"

.field public static final EXTRA_PROGRESS:Ljava/lang/String; = "android.progress"

.field public static final EXTRA_PROGRESS_MAX:Ljava/lang/String; = "android.progressMax"

.field public static final EXTRA_SUB_TEXT:Ljava/lang/String; = "android.subText"

.field public static final EXTRA_SUMMARY_TEXT:Ljava/lang/String; = "android.summaryText"

.field public static final EXTRA_TEXT:Ljava/lang/String; = "android.text"

.field public static final EXTRA_TITLE:Ljava/lang/String; = "android.title"

.field public static final EXTRA_TITLE_BIG:Ljava/lang/String; = "android.title.big"

.field static final SYSTEM_UI_PKG:Ljava/lang/String; = "com.android.systemui"

.field static final TAG:Ljava/lang/String; = "NotificationCompat"


# instance fields
.field private mNotificationFixer:Lcom/lody/virtual/server/notification/NotificationFixer;

.field private final sSystemLayoutResIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    const/16 v1, 0xa

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/lody/virtual/server/notification/NotificationCompat;->sSystemLayoutResIds:Ljava/util/List;

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/lody/virtual/server/notification/NotificationCompat;->loadSystemLayoutRes()V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcom/lody/virtual/server/notification/NotificationFixer;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Lcom/lody/virtual/server/notification/NotificationFixer;-><init>(Lcom/lody/virtual/server/notification/NotificationCompat;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/lody/virtual/server/notification/NotificationCompat;->mNotificationFixer:Lcom/lody/virtual/server/notification/NotificationFixer;

    .line 22
    .line 23
    return-void
.end method

.method public static create()Lcom/lody/virtual/server/notification/NotificationCompat;
    .locals 1

    new-instance v0, Lcom/lody/virtual/server/notification/NotificationCompatCompatV21;

    invoke-direct {v0}, Lcom/lody/virtual/server/notification/NotificationCompatCompatV21;-><init>()V

    return-object v0
.end method

.method private loadSystemLayoutRes()V
    .locals 5

    .line 1
    sget-object v0, Lmirror/com/android/internal/R_Hide$layout;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    array-length v1, v0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1

    .line 10
    .line 11
    aget-object v3, v0, v2

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    :try_start_0
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    iget-object v4, p0, Lcom/lody/virtual/server/notification/NotificationCompat;->sSystemLayoutResIds:Ljava/util/List;

    .line 39
    .line 40
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    :catchall_0
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    return-void
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


# virtual methods
.method public abstract dealNotification(ILandroid/app/Notification;Ljava/lang/String;)Z
.end method

.method public getHostContext()Landroid/content/Context;
    .locals 1

    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method getNotificationFixer()Lcom/lody/virtual/server/notification/NotificationFixer;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/server/notification/NotificationCompat;->mNotificationFixer:Lcom/lody/virtual/server/notification/NotificationFixer;

    return-object v0
.end method

.method getPackageInfo(Ljava/lang/String;)Landroid/content/pm/PackageInfo;
    .locals 3

    :try_start_0
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getHostPackageManager()Lcom/lody/virtual/client/env/HostPackageManager;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lcom/lody/virtual/client/env/HostPackageManager;->getPackageInfo(Ljava/lang/String;J)Landroid/content/pm/PackageInfo;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method isSystemLayout(Landroid/widget/RemoteViews;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/lody/virtual/server/notification/NotificationCompat;->sSystemLayoutResIds:Ljava/util/List;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/widget/RemoteViews;->getLayoutId()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    return p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
