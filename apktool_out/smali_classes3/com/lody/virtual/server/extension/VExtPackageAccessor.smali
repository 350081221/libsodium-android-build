.class public Lcom/lody/virtual/server/extension/VExtPackageAccessor;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "VExtPackageAccessor"

.field private static sHelper:Lcom/lody/virtual/helper/IPCHelper;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/lody/virtual/helper/IPCHelper<",
            "Lcom/lody/virtual/IExtHelperInterface;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/server/extension/VExtPackageAccessor$1;

    invoke-direct {v0}, Lcom/lody/virtual/server/extension/VExtPackageAccessor$1;-><init>()V

    sput-object v0, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->sHelper:Lcom/lody/virtual/helper/IPCHelper;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->getAuthority()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$100()V
    .locals 0

    invoke-static {}, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->tryPullUpExtProcess()V

    return-void
.end method

.method public static callHelper()Z
    .locals 6

    .line 1
    const-string v0, "@"

    .line 2
    .line 3
    const-string v1, "VExtPackageAccessor"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    new-instance v3, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;

    .line 7
    .line 8
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    invoke-virtual {v4}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-static {}, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->getAuthority()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-direct {v3, v4, v5}, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3, v0}, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->methodName(Ljava/lang/String;)Lcom/lody/virtual/client/ipc/ProviderCall$Builder;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3, v2}, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->retry(I)Lcom/lody/virtual/client/ipc/ProviderCall$Builder;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3}, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->call()Landroid/os/Bundle;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    .line 32
    .line 33
    .line 34
    :try_start_1
    new-instance v3, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;

    .line 35
    .line 36
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v4}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const-string v5, "com.yqtech.multiapp.ext.virtual_stub_ext_0"

    .line 45
    .line 46
    invoke-direct {v3, v4, v5}, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v0}, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->methodName(Ljava/lang/String;)Lcom/lody/virtual/client/ipc/ProviderCall$Builder;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0, v2}, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->retry(I)Lcom/lody/virtual/client/ipc/ProviderCall$Builder;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->call()Landroid/os/Bundle;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    return v0

    .line 62
    :catch_0
    move-exception v0

    .line 63
    new-instance v3, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v4, "callHelper virtual_stub_ext_0 failed...:"

    .line 69
    .line 70
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    return v2

    .line 84
    :catch_1
    const-string v0, "callHelper virtual.service.ext_helper failed..."

    .line 85
    .line 86
    invoke-static {v1, v0}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return v2
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

.method public static cleanPackageData([ILjava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->isExtPackageInstalled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    sget-object v0, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->sHelper:Lcom/lody/virtual/helper/IPCHelper;

    .line 13
    .line 14
    new-instance v1, Lcom/lody/virtual/server/extension/VExtPackageAccessor$3;

    .line 15
    .line 16
    invoke-direct {v1, p0, p1}, Lcom/lody/virtual/server/extension/VExtPackageAccessor$3;-><init>([ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/lody/virtual/helper/IPCHelper;->callVoid(Lcom/lody/virtual/helper/IPCHelper$CallableVoid;)V

    .line 20
    .line 21
    .line 22
    return-void
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
.end method

.method public static forceStop([I)V
    .locals 2

    sget-object v0, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->sHelper:Lcom/lody/virtual/helper/IPCHelper;

    new-instance v1, Lcom/lody/virtual/server/extension/VExtPackageAccessor$4;

    invoke-direct {v1, p0}, Lcom/lody/virtual/server/extension/VExtPackageAccessor$4;-><init>([I)V

    invoke-virtual {v0, v1}, Lcom/lody/virtual/helper/IPCHelper;->callVoid(Lcom/lody/virtual/helper/IPCHelper$CallableVoid;)V

    return-void
.end method

.method private static getAuthority()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->getConfig()Lcom/lody/virtual/client/core/SettingConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/lody/virtual/client/core/SettingConfig;->getExtPackageHelperAuthority()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static getLaunchIntentForPackage(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/Intent;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "android.intent.action.LAUNCH_HELPER"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-virtual {p0, v0, p1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-gtz v1, :cond_0

    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :cond_0
    new-instance v1, Landroid/content/Intent;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 27
    .line 28
    .line 29
    const/high16 v0, 0x10000000

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 32
    .line 33
    .line 34
    const/high16 v0, 0x10000

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 37
    .line 38
    .line 39
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 44
    .line 45
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 46
    .line 47
    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 48
    .line 49
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Landroid/content/pm/ResolveInfo;

    .line 54
    .line 55
    iget-object p0, p0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 56
    .line 57
    iget-object p0, p0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v1, v0, p0}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 60
    .line 61
    .line 62
    return-object v1
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

.method public static getRecentTasks(II)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List<",
            "Landroid/app/ActivityManager$RecentTaskInfo;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->isExtPackageInstalled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    sget-object v0, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->sHelper:Lcom/lody/virtual/helper/IPCHelper;

    .line 17
    .line 18
    new-instance v1, Lcom/lody/virtual/server/extension/VExtPackageAccessor$6;

    .line 19
    .line 20
    invoke-direct {v1, p0, p1}, Lcom/lody/virtual/server/extension/VExtPackageAccessor$6;-><init>(II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/lody/virtual/helper/IPCHelper;->call(Lcom/lody/virtual/helper/IPCHelper$Callable;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ljava/util/List;

    .line 28
    .line 29
    if-nez p0, :cond_1

    .line 30
    .line 31
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :cond_1
    return-object p0
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
.end method

.method public static getRunningAppProcesses()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/app/ActivityManager$RunningAppProcessInfo;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->isExtPackageInstalled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    sget-object v0, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->sHelper:Lcom/lody/virtual/helper/IPCHelper;

    .line 17
    .line 18
    new-instance v1, Lcom/lody/virtual/server/extension/VExtPackageAccessor$7;

    .line 19
    .line 20
    invoke-direct {v1}, Lcom/lody/virtual/server/extension/VExtPackageAccessor$7;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/lody/virtual/helper/IPCHelper;->call(Lcom/lody/virtual/helper/IPCHelper$Callable;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/util/List;

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :cond_1
    return-object v0
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

.method public static getRunningTasks(I)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Landroid/app/ActivityManager$RunningTaskInfo;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->isExtPackageInstalled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    sget-object v0, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->sHelper:Lcom/lody/virtual/helper/IPCHelper;

    .line 17
    .line 18
    new-instance v1, Lcom/lody/virtual/server/extension/VExtPackageAccessor$5;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Lcom/lody/virtual/server/extension/VExtPackageAccessor$5;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/lody/virtual/helper/IPCHelper;->call(Lcom/lody/virtual/helper/IPCHelper$Callable;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ljava/util/List;

    .line 28
    .line 29
    if-nez p0, :cond_1

    .line 30
    .line 31
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :cond_1
    return-object p0
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

.method public static hasExtPackageBootPermission()Z
    .locals 5

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->isExtPackageInstalled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    invoke-static {}, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->callHelper()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    return v2

    .line 21
    :cond_1
    invoke-static {}, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->tryPullUpExtProcess()V

    .line 22
    .line 23
    .line 24
    move v0, v1

    .line 25
    :goto_0
    const/4 v3, 0x5

    .line 26
    if-ge v0, v3, :cond_3

    .line 27
    .line 28
    invoke-static {}, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->callHelper()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    return v2

    .line 35
    :cond_2
    const-wide/16 v3, 0xc8

    .line 36
    .line 37
    invoke-static {v3, v4}, Landroid/os/SystemClock;->sleep(J)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    return v1
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

.method public static isExternalStorageManager()Z
    .locals 2

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->isExtPackageInstalled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    sget-object v0, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->sHelper:Lcom/lody/virtual/helper/IPCHelper;

    .line 14
    .line 15
    new-instance v1, Lcom/lody/virtual/server/extension/VExtPackageAccessor$8;

    .line 16
    .line 17
    invoke-direct {v1}, Lcom/lody/virtual/server/extension/VExtPackageAccessor$8;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/lody/virtual/helper/IPCHelper;->callBoolean(Lcom/lody/virtual/helper/IPCHelper$Callable;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    return v0
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

.method public static startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->isExtPackageInstalled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    sget-object v0, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->sHelper:Lcom/lody/virtual/helper/IPCHelper;

    .line 13
    .line 14
    new-instance v1, Lcom/lody/virtual/server/extension/VExtPackageAccessor$9;

    .line 15
    .line 16
    invoke-direct {v1, p0, p1}, Lcom/lody/virtual/server/extension/VExtPackageAccessor$9;-><init>(Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/lody/virtual/helper/IPCHelper;->callVoid(Lcom/lody/virtual/helper/IPCHelper$CallableVoid;)V

    .line 20
    .line 21
    .line 22
    return-void
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
.end method

.method public static syncPackages()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->isExtPackageInstalled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    sget-object v0, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->sHelper:Lcom/lody/virtual/helper/IPCHelper;

    .line 13
    .line 14
    new-instance v1, Lcom/lody/virtual/server/extension/VExtPackageAccessor$2;

    .line 15
    .line 16
    invoke-direct {v1}, Lcom/lody/virtual/server/extension/VExtPackageAccessor$2;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/lody/virtual/helper/IPCHelper;->callVoid(Lcom/lody/virtual/helper/IPCHelper$CallableVoid;)V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
.end method

.method private static tryPullUpExtProcess()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Lcom/lody/virtual/client/stub/StubManifest;->EXT_PACKAGE_NAME:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v1, v2}, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->getLaunchIntentForPackage(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/high16 v2, 0x10000

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 24
    .line 25
    .line 26
    const/high16 v2, 0x10000000

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
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
