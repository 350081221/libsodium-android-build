.class public Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation


# instance fields
.field private a:Lcom/ss/android/socialbase/appdownloader/c/k;

.field private b:Landroid/content/Intent;

.field private c:Landroid/content/Intent;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private d:I

.field private e:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)Landroid/content/Intent;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->c:Landroid/content/Intent;

    return-object p0
.end method

.method private a()V
    .locals 3

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    const/4 v2, 0x0

    .line 4
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->alpha:F

    .line 5
    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    return-void
.end method

.method static synthetic b(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->d:I

    return p0
.end method

.method private b()V
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->a:Lcom/ss/android/socialbase/appdownloader/c/k;

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->b:Landroid/content/Intent;

    if-nez v0, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/d;->j()Lcom/ss/android/socialbase/appdownloader/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/socialbase/appdownloader/d;->a()Lcom/ss/android/socialbase/appdownloader/c/c;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {v0, p0}, Lcom/ss/android/socialbase/appdownloader/c/c;->a(Landroid/content/Context;)Lcom/ss/android/socialbase/appdownloader/c/l;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    .line 5
    new-instance v0, Lcom/ss/android/socialbase/appdownloader/d/a;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/appdownloader/d/a;-><init>(Landroid/content/Context;)V

    :cond_2
    const-string v1, "tt_appdownloader_tip"

    .line 6
    invoke-static {p0, v1}, Lcom/ss/android/socialbase/appdownloader/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const-string v2, "tt_appdownloader_label_ok"

    .line 7
    invoke-static {p0, v2}, Lcom/ss/android/socialbase/appdownloader/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    const-string v3, "tt_appdownloader_label_cancel"

    .line 8
    invoke-static {p0, v3}, Lcom/ss/android/socialbase/appdownloader/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    .line 9
    iget-object v4, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->e:Lorg/json/JSONObject;

    const-string v5, "jump_unknown_source_tips"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 10
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_3

    const-string v4, "tt_appdownloader_jump_unknown_source_tips"

    .line 11
    invoke-static {p0, v4}, Lcom/ss/android/socialbase/appdownloader/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    .line 12
    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 13
    :cond_3
    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/appdownloader/c/l;->a(I)Lcom/ss/android/socialbase/appdownloader/c/l;

    move-result-object v1

    invoke-interface {v1, v4}, Lcom/ss/android/socialbase/appdownloader/c/l;->a(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/c/l;

    move-result-object v1

    new-instance v4, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity$3;

    invoke-direct {v4, p0}, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity$3;-><init>(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)V

    .line 14
    invoke-interface {v1, v2, v4}, Lcom/ss/android/socialbase/appdownloader/c/l;->a(ILandroid/content/DialogInterface$OnClickListener;)Lcom/ss/android/socialbase/appdownloader/c/l;

    move-result-object v1

    new-instance v2, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity$2;

    invoke-direct {v2, p0}, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity$2;-><init>(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)V

    .line 15
    invoke-interface {v1, v3, v2}, Lcom/ss/android/socialbase/appdownloader/c/l;->b(ILandroid/content/DialogInterface$OnClickListener;)Lcom/ss/android/socialbase/appdownloader/c/l;

    move-result-object v1

    new-instance v2, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity$1;

    invoke-direct {v2, p0}, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity$1;-><init>(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)V

    .line 16
    invoke-interface {v1, v2}, Lcom/ss/android/socialbase/appdownloader/c/l;->a(Landroid/content/DialogInterface$OnCancelListener;)Lcom/ss/android/socialbase/appdownloader/c/l;

    move-result-object v1

    const/4 v2, 0x0

    .line 17
    invoke-interface {v1, v2}, Lcom/ss/android/socialbase/appdownloader/c/l;->a(Z)Lcom/ss/android/socialbase/appdownloader/c/l;

    .line 18
    invoke-interface {v0}, Lcom/ss/android/socialbase/appdownloader/c/l;->a()Lcom/ss/android/socialbase/appdownloader/c/k;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->a:Lcom/ss/android/socialbase/appdownloader/c/k;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_4
    :goto_1
    return-void
.end method

.method static synthetic c(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)Lorg/json/JSONObject;
    .locals 0

    iget-object p0, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->e:Lorg/json/JSONObject;

    return-object p0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/TraceManager;->startActivityTrace(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->a()V

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/h;->a()Lcom/ss/android/socialbase/appdownloader/h;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1, p0}, Lcom/ss/android/socialbase/appdownloader/h;->a(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)V

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityCreateEnd()V

    .line 26
    .line 27
    .line 28
    return-void
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
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/h;->a()Lcom/ss/android/socialbase/appdownloader/h;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1, p0}, Lcom/ss/android/socialbase/appdownloader/h;->a(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)V

    .line 12
    .line 13
    .line 14
    return-void
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

.method protected onRestart()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onRestart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartEnd()V

    return-void
.end method

.method protected onResume()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeBegin(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->b:Landroid/content/Intent;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const-string v1, "intent"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Landroid/content/Intent;

    .line 30
    .line 31
    iput-object v1, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->c:Landroid/content/Intent;

    .line 32
    .line 33
    const-string v1, "id"

    .line 34
    .line 35
    const/4 v2, -0x1

    .line 36
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iput v1, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->d:I

    .line 41
    .line 42
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 43
    .line 44
    const-string v2, "config"

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->e:Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catch_0
    move-exception v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 58
    .line 59
    .line 60
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->e:Lorg/json/JSONObject;

    .line 61
    .line 62
    if-nez v0, :cond_1

    .line 63
    .line 64
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/c;->a(Landroid/app/Activity;)V

    .line 65
    .line 66
    .line 67
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeEnd()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_1
    invoke-direct {p0}, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->b()V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->a:Lcom/ss/android/socialbase/appdownloader/c/k;

    .line 75
    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    invoke-interface {v0}, Lcom/ss/android/socialbase/appdownloader/c/k;->b()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-nez v0, :cond_2

    .line 83
    .line 84
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->a:Lcom/ss/android/socialbase/appdownloader/c/k;

    .line 85
    .line 86
    invoke-interface {v0}, Lcom/ss/android/socialbase/appdownloader/c/k;->a()V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->a:Lcom/ss/android/socialbase/appdownloader/c/k;

    .line 91
    .line 92
    if-nez v0, :cond_3

    .line 93
    .line 94
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 95
    .line 96
    .line 97
    :cond_3
    :goto_1
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeEnd()V

    .line 98
    .line 99
    .line 100
    return-void
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method protected onStart()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartEnd()V

    return-void
.end method
