.class Lcom/lody/virtual/client/hook/proxies/window/session/BaseMethodProxy;
.super Lcom/lody/virtual/client/hook/base/StaticMethodProxy;
.source "SourceFile"


# instance fields
.field private mDrawOverlays:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/lody/virtual/client/hook/base/StaticMethodProxy;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lcom/lody/virtual/client/hook/proxies/window/session/BaseMethodProxy;->mDrawOverlays:Z

    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
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


# virtual methods
.method public varargs beforeCall(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Z
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SwitchIntDef"
        }
    .end annotation

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/lody/virtual/client/hook/proxies/window/session/BaseMethodProxy;->mDrawOverlays:Z

    .line 3
    .line 4
    const-class p1, Landroid/view/WindowManager$LayoutParams;

    .line 5
    .line 6
    invoke-static {p3, p1}, Lcom/lody/virtual/helper/utils/ArrayUtils;->indexOfFirst([Ljava/lang/Object;Ljava/lang/Class;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/4 p2, -0x1

    .line 11
    const/4 v0, 0x1

    .line 12
    if-eq p1, p2, :cond_1

    .line 13
    .line 14
    aget-object p1, p3, p1

    .line 15
    .line 16
    check-cast p1, Landroid/view/WindowManager$LayoutParams;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getHostPkg()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iput-object p2, p1, Landroid/view/WindowManager$LayoutParams;->packageName:Ljava/lang/String;

    .line 25
    .line 26
    iget p2, p1, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 27
    .line 28
    const/16 p3, 0x7d2

    .line 29
    .line 30
    const/16 v1, 0x7f6

    .line 31
    .line 32
    if-eq p2, p3, :cond_0

    .line 33
    .line 34
    const/16 p3, 0x7d3

    .line 35
    .line 36
    if-eq p2, p3, :cond_0

    .line 37
    .line 38
    const/16 p3, 0x7d6

    .line 39
    .line 40
    if-eq p2, p3, :cond_0

    .line 41
    .line 42
    const/16 p3, 0x7d7

    .line 43
    .line 44
    if-eq p2, p3, :cond_0

    .line 45
    .line 46
    const/16 p3, 0x7da

    .line 47
    .line 48
    if-eq p2, p3, :cond_0

    .line 49
    .line 50
    if-eq p2, v1, :cond_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iput-boolean v0, p0, Lcom/lody/virtual/client/hook/proxies/window/session/BaseMethodProxy;->mDrawOverlays:Z

    .line 54
    .line 55
    :goto_0
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 56
    .line 57
    const/16 p3, 0x1a

    .line 58
    .line 59
    if-lt p2, p3, :cond_1

    .line 60
    .line 61
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-virtual {p2}, Lcom/lody/virtual/client/core/VirtualCore;->getTargetSdkVersion()I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    if-lt p2, p3, :cond_1

    .line 70
    .line 71
    iget-boolean p2, p0, Lcom/lody/virtual/client/hook/proxies/window/session/BaseMethodProxy;->mDrawOverlays:Z

    .line 72
    .line 73
    if-eqz p2, :cond_1

    .line 74
    .line 75
    iput v1, p1, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 76
    .line 77
    :cond_1
    return v0
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
.end method

.method protected isDrawOverlays()Z
    .locals 1

    iget-boolean v0, p0, Lcom/lody/virtual/client/hook/proxies/window/session/BaseMethodProxy;->mDrawOverlays:Z

    return v0
.end method
