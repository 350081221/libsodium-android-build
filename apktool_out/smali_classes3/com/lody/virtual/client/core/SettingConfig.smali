.class public abstract Lcom/lody/virtual/client/core/SettingConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/core/SettingConfig$FakeWifiStatus;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isEnableSeccomp(Ljava/lang/String;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isPie()Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-static {}, Lcom/lody/virtual/client/env/VirtualRuntime;->is64bit()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    return v0

    .line 16
    :cond_1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1, p0}, Lcom/lody/virtual/client/core/VirtualCore;->isRunInExtProcess(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    return v0

    .line 27
    :cond_2
    invoke-static {p0}, Lcom/lody/virtual/client/seccomp/SeccompWhitelist;->isEnableSeccomp(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/4 v2, 0x1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    invoke-static {p0}, Lcom/lody/virtual/client/seccomp/SeccompWhitelist;->isProtectApp(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    if-eqz p0, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    return v0

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 45
    .line 46
    .line 47
    return v0
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


# virtual methods
.method public disableSetScreenOrientation(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getBinderProviderAuthority()Ljava/lang/String;
    .locals 1

    const-string v0, "com.yqtech.multiapp.virtual.service.BinderProvider"

    return-object v0
.end method

.method public getExtPackageHelperAuthority()Ljava/lang/String;
    .locals 1

    const-string v0, "com.yqtech.multiapp.ext.virtual.service.ext_helper"

    return-object v0
.end method

.method public abstract getExtPackageName()Ljava/lang/String;
.end method

.method public getFakeWifiStatus()Lcom/lody/virtual/client/core/SettingConfig$FakeWifiStatus;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract getMainPackageName()Ljava/lang/String;
.end method

.method public getVirtualSdcardAndroidDataName()Ljava/lang/String;
    .locals 1

    const-string v0, "Android_va"

    return-object v0
.end method

.method public isAllowCreateShortcut()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isDisableDrawOverlays(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public isDisableTinker(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "com.tencent.mm"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method public isEnableIORedirect()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isEnableVirtualSdcardAndroidData()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isHideForegroundNotification()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isHostIntent(Landroid/content/Intent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public isOutsideAction(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "android.media.action.IMAGE_CAPTURE"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "android.media.action.VIDEO_CAPTURE"

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-string v0, "android.intent.action.PICK"

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 29
    :goto_1
    return p1
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

.method public isOutsideAppInfoPriority(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public abstract isOutsidePackage(Ljava/lang/String;)Z
.end method

.method public isUnProtectAction(Ljava/lang/String;)Z
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/env/SpecialComponentList;->SYSTEM_BROADCAST_ACTION:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public isUseRealApkPath(Ljava/lang/String;Landroid/content/pm/ApplicationInfo;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public isUseRealDataDir(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onHandleLauncherIntent(Landroid/content/Intent;)Landroid/content/Intent;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method
