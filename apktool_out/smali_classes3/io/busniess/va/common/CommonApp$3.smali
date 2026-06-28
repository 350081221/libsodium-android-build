.class Lio/busniess/va/common/CommonApp$3;
.super Lcom/lody/virtual/client/core/VirtualCore$VirtualInitializer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/busniess/va/common/CommonApp;->onCreate(Landroid/app/Application;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/busniess/va/common/CommonApp;

.field final synthetic val$application:Landroid/app/Application;


# direct methods
.method constructor <init>(Lio/busniess/va/common/CommonApp;Landroid/app/Application;)V
    .locals 0

    iput-object p1, p0, Lio/busniess/va/common/CommonApp$3;->this$0:Lio/busniess/va/common/CommonApp;

    iput-object p2, p0, Lio/busniess/va/common/CommonApp$3;->val$application:Landroid/app/Application;

    invoke-direct {p0}, Lcom/lody/virtual/client/core/VirtualCore$VirtualInitializer;-><init>()V

    return-void
.end method


# virtual methods
.method public onMainProcess()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Landroidx/appcompat/app/AppCompatDelegate;->setCompatVectorFromResourcesEnabled(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lio/busniess/va/common/CommonApp$3;->val$application:Landroid/app/Application;

    .line 6
    .line 7
    invoke-static {v0}, Ljonathanfinerty/once/Once;->initialise(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v1, 0x21

    .line 13
    .line 14
    const-string v2, "android.intent.action.GMS_INITIALIZED"

    .line 15
    .line 16
    if-lt v0, v1, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lio/busniess/va/common/CommonApp$3;->val$application:Landroid/app/Application;

    .line 19
    .line 20
    iget-object v1, p0, Lio/busniess/va/common/CommonApp$3;->this$0:Lio/busniess/va/common/CommonApp;

    .line 21
    .line 22
    invoke-static {v1}, Lio/busniess/va/common/CommonApp;->access$100(Lio/busniess/va/common/CommonApp;)Landroid/content/BroadcastReceiver;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v3, Landroid/content/IntentFilter;

    .line 27
    .line 28
    invoke-direct {v3, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    invoke-static {v0, v1, v3, v2}, Lio/busniess/va/common/a;->a(Landroid/app/Application;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v0, p0, Lio/busniess/va/common/CommonApp$3;->val$application:Landroid/app/Application;

    .line 37
    .line 38
    iget-object v1, p0, Lio/busniess/va/common/CommonApp$3;->this$0:Lio/busniess/va/common/CommonApp;

    .line 39
    .line 40
    invoke-static {v1}, Lio/busniess/va/common/CommonApp;->access$100(Lio/busniess/va/common/CommonApp;)Landroid/content/BroadcastReceiver;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    new-instance v3, Landroid/content/IntentFilter;

    .line 45
    .line 46
    invoke-direct {v3, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 50
    .line 51
    .line 52
    :goto_0
    return-void
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

.method public onServerProcess()V
    .locals 0

    return-void
.end method

.method public onVirtualProcess()V
    .locals 3
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x11
    .end annotation

    .line 1
    iget-object v0, p0, Lio/busniess/va/common/CommonApp$3;->this$0:Lio/busniess/va/common/CommonApp;

    .line 2
    .line 3
    invoke-static {v0}, Lio/busniess/va/common/CommonApp;->access$200(Lio/busniess/va/common/CommonApp;)Lcom/lody/virtual/client/core/VirtualCore;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lio/busniess/va/delegate/DefaultCrashHandler;

    .line 8
    .line 9
    invoke-direct {v1}, Lio/busniess/va/delegate/DefaultCrashHandler;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/lody/virtual/client/core/VirtualCore;->setCrashHandler(Lcom/lody/virtual/client/core/CrashHandler;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lio/busniess/va/common/CommonApp$3;->this$0:Lio/busniess/va/common/CommonApp;

    .line 16
    .line 17
    invoke-static {v0}, Lio/busniess/va/common/CommonApp;->access$200(Lio/busniess/va/common/CommonApp;)Lcom/lody/virtual/client/core/VirtualCore;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Lio/busniess/va/delegate/MyComponentDelegate;

    .line 22
    .line 23
    invoke-direct {v1}, Lio/busniess/va/delegate/MyComponentDelegate;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/lody/virtual/client/core/VirtualCore;->setAppCallback(Lcom/lody/virtual/client/core/AppCallback;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lio/busniess/va/common/CommonApp$3;->this$0:Lio/busniess/va/common/CommonApp;

    .line 30
    .line 31
    invoke-static {v0}, Lio/busniess/va/common/CommonApp;->access$200(Lio/busniess/va/common/CommonApp;)Lcom/lody/virtual/client/core/VirtualCore;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, Lio/busniess/va/delegate/MyTaskDescDelegate;

    .line 36
    .line 37
    invoke-direct {v1}, Lio/busniess/va/delegate/MyTaskDescDelegate;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lcom/lody/virtual/client/core/VirtualCore;->setTaskDescriptionDelegate(Lcom/lody/virtual/client/hook/delegate/TaskDescriptionDelegate;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lio/busniess/va/common/CommonApp$3;->this$0:Lio/busniess/va/common/CommonApp;

    .line 44
    .line 45
    invoke-static {v0}, Lio/busniess/va/common/CommonApp;->access$200(Lio/busniess/va/common/CommonApp;)Lcom/lody/virtual/client/core/VirtualCore;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    new-instance v1, Lio/busniess/va/delegate/MyAppRequestListener;

    .line 50
    .line 51
    iget-object v2, p0, Lio/busniess/va/common/CommonApp$3;->val$application:Landroid/app/Application;

    .line 52
    .line 53
    invoke-direct {v1, v2}, Lio/busniess/va/delegate/MyAppRequestListener;-><init>(Landroid/content/Context;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lcom/lody/virtual/client/core/VirtualCore;->setAppRequestListener(Lcom/lody/virtual/client/core/VirtualCore$AppRequestListener;)V

    .line 57
    .line 58
    .line 59
    return-void
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
