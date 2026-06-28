.class public Lmirror/android/app/ActivityThread;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmirror/android/app/ActivityThread$H;,
        Lmirror/android/app/ActivityThread$AppBindData;,
        Lmirror/android/app/ActivityThread$ProviderKeyJBMR1;,
        Lmirror/android/app/ActivityThread$ProviderClientRecordJB;,
        Lmirror/android/app/ActivityThread$ProviderClientRecord;,
        Lmirror/android/app/ActivityThread$ActivityClientRecord;
    }
.end annotation


# static fields
.field public static TYPE:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static USE_CACHE:Lmirror/RefStaticObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefStaticObject<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static currentActivityThread:Lmirror/RefStaticMethod;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefStaticMethod<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static getApplicationThread:Lmirror/RefMethod;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefMethod<",
            "Landroid/os/IBinder;",
            ">;"
        }
    .end annotation
.end field

.field public static getHandler:Lmirror/RefMethod;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefMethod<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field

.field public static getLaunchingActivity:Lmirror/RefMethod;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefMethod<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static getPackageInfoNoCheck:Lmirror/RefMethod;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefMethod<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static getPackageManager:Lmirror/RefStaticMethod;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefStaticMethod<",
            "Landroid/content/pm/IPackageManager;",
            ">;"
        }
    .end annotation
.end field

.field public static getProcessName:Lmirror/RefMethod;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefMethod<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static installProvider:Lmirror/RefMethod;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefMethod<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static mActivities:Lmirror/RefObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefObject<",
            "Ljava/util/Map<",
            "Landroid/os/IBinder;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public static mBoundApplication:Lmirror/RefObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefObject<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static mH:Lmirror/RefObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefObject<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field

.field public static mInitialApplication:Lmirror/RefObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefObject<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field public static mInstrumentation:Lmirror/RefObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefObject<",
            "Landroid/app/Instrumentation;",
            ">;"
        }
    .end annotation
.end field

.field public static mPackages:Lmirror/RefObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefObject<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/WeakReference<",
            "*>;>;>;"
        }
    .end annotation
.end field

.field public static mProviderMap:Lmirror/RefObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefObject<",
            "Ljava/util/Map;",
            ">;"
        }
    .end annotation
.end field

.field public static mResourcePackages:Lmirror/RefObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefObject<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/WeakReference<",
            "*>;>;>;"
        }
    .end annotation
.end field

.field public static performNewIntents:Lmirror/RefMethod;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefMethod<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation runtime Lmirror/MethodParams;
        value = {
            Landroid/os/IBinder;,
            Ljava/util/List;
        }
    .end annotation
.end field

.field public static sPackageManager:Lmirror/RefStaticObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefStaticObject<",
            "Landroid/os/IInterface;",
            ">;"
        }
    .end annotation
.end field

.field public static sPermissionManager:Lmirror/RefStaticObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefStaticObject<",
            "Landroid/os/IInterface;",
            ">;"
        }
    .end annotation
.end field

.field public static sendActivityResult:Lmirror/RefMethod;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefMethod<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation runtime Lmirror/MethodParams;
        value = {
            Landroid/os/IBinder;,
            Ljava/lang/String;,
            I,
            I,
            Landroid/content/Intent;
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lmirror/android/app/ActivityThread;

    const-string v1, "android.app.ActivityThread"

    invoke-static {v0, v1}, Lmirror/RefClass;->load(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lmirror/android/app/ActivityThread;->TYPE:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static USE_CACHE(Z)V
    .locals 1

    .line 1
    sget-object v0, Lmirror/android/app/ActivityThread;->USE_CACHE:Lmirror/RefStaticObject;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {v0, p0}, Lmirror/RefStaticObject;->set(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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
    .line 28
    .line 29
    .line 30
    .line 31
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
.end method

.method public static handleNewIntent(Ljava/lang/Object;Ljava/util/List;)V
    .locals 8

    .line 1
    :try_start_0
    sget-object v0, Lmirror/android/app/ActivityThread;->currentActivityThread:Lmirror/RefStaticMethod;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {v0, v2}, Lmirror/RefStaticMethod;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const-string v3, "handleNewIntent"

    .line 17
    .line 18
    const/4 v4, 0x2

    .line 19
    new-array v5, v4, [Ljava/lang/Class;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    aput-object v6, v5, v1

    .line 26
    .line 27
    const-class v6, Ljava/util/List;

    .line 28
    .line 29
    const/4 v7, 0x1

    .line 30
    aput-object v6, v5, v7

    .line 31
    .line 32
    invoke-virtual {v2, v3, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    invoke-virtual {v2, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 39
    .line 40
    .line 41
    new-array v3, v4, [Ljava/lang/Object;

    .line 42
    .line 43
    aput-object p0, v3, v1

    .line 44
    .line 45
    aput-object p1, v3, v7

    .line 46
    .line 47
    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catch_0
    move-exception p0

    .line 52
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 53
    .line 54
    .line 55
    :cond_0
    :goto_0
    return-void
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
.end method

.method public static installProvider(Ljava/lang/Object;Landroid/content/Context;Landroid/content/pm/ProviderInfo;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    sget-object v0, Lmirror/android/app/ActivityThread;->installProvider:Lmirror/RefMethod;

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p3, v1, p1

    const/4 p1, 0x2

    aput-object p2, v1, p1

    const/4 p1, 0x3

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object p2, v1, p1

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 p2, 0x4

    aput-object p1, v1, p2

    const/4 p2, 0x5

    aput-object p1, v1, p2

    invoke-virtual {v0, p0, v1}, Lmirror/RefMethod;->callWithException(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
