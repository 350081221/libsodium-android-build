.class public Lcom/huawei/agconnect/apms/i1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final abc:Lcom/huawei/agconnect/apms/log/AgentLog;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/i1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public static abc(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static abc(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class;",
            "[",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    if-nez p2, :cond_1

    if-eqz p3, :cond_3

    return-object v0

    :cond_1
    if-nez p3, :cond_2

    return-object v0

    .line 4
    :cond_2
    array-length v1, p2

    array-length v2, p3

    if-eq v1, v2, :cond_3

    return-object v0

    .line 5
    :cond_3
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    :try_start_1
    invoke-virtual {p0, v0, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_0

    :catch_2
    move-exception p0

    .line 7
    :goto_0
    :try_start_2
    sget-object p1, Lcom/huawei/agconnect/apms/i1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "failed to invoke method: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    .line 8
    sget-object p1, Lcom/huawei/agconnect/apms/i1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string p2, "exception occurred when invoking method: "

    invoke-static {p2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-static {p0, p2, p1}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    :goto_1
    return-object v0
.end method

.method public static abc()Ljava/lang/String;
    .locals 8

    const-string v0, "ro.build.display.id"

    const-string v1, "MIUI"

    const-string v2, "EMUI"

    const-string v3, "FLYME"

    const-string v4, "OTHER"

    .line 9
    :try_start_0
    invoke-static {}, Lcom/huawei/agconnect/apms/k1;->abc()Lcom/huawei/agconnect/apms/k1;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v6, "ro.build.version.emui"

    .line 10
    :try_start_1
    iget-object v7, v5, Lcom/huawei/agconnect/apms/k1;->abc:Ljava/util/Properties;

    invoke-virtual {v7, v6}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v6, :cond_5

    const-string v6, "ro.build.hw_emui_api_level"

    .line 11
    :try_start_2
    iget-object v7, v5, Lcom/huawei/agconnect/apms/k1;->abc:Ljava/util/Properties;

    invoke-virtual {v7, v6}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v6, :cond_5

    const-string v6, "ro.confg.hw_systemversion"

    .line 12
    :try_start_3
    iget-object v7, v5, Lcom/huawei/agconnect/apms/k1;->abc:Ljava/util/Properties;

    invoke-virtual {v7, v6}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v6, :cond_0

    goto :goto_2

    :cond_0
    const-string v6, "ro.miui.ui.version.code"

    .line 13
    :try_start_4
    iget-object v7, v5, Lcom/huawei/agconnect/apms/k1;->abc:Ljava/util/Properties;

    invoke-virtual {v7, v6}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez v6, :cond_4

    const-string v6, "ro.miui.ui.version.name"

    .line 14
    :try_start_5
    iget-object v7, v5, Lcom/huawei/agconnect/apms/k1;->abc:Ljava/util/Properties;

    invoke-virtual {v7, v6}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-nez v6, :cond_4

    const-string v6, "ro.miui.internal.storage"

    .line 15
    :try_start_6
    iget-object v7, v5, Lcom/huawei/agconnect/apms/k1;->abc:Ljava/util/Properties;

    invoke-virtual {v7, v6}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    const-string v6, "persist.sys.use.flyme.icon"

    .line 16
    :try_start_7
    iget-object v7, v5, Lcom/huawei/agconnect/apms/k1;->abc:Ljava/util/Properties;

    invoke-virtual {v7, v6}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v6
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    if-nez v6, :cond_3

    const-string v6, "ro.meizu.setupwizard.flyme"

    .line 17
    :try_start_8
    iget-object v7, v5, Lcom/huawei/agconnect/apms/k1;->abc:Ljava/util/Properties;

    invoke-virtual {v7, v6}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v6
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    if-nez v6, :cond_3

    const-string v6, "ro.flyme.published"

    .line 18
    :try_start_9
    iget-object v7, v5, Lcom/huawei/agconnect/apms/k1;->abc:Ljava/util/Properties;

    invoke-virtual {v7, v6}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_0

    .line 19
    :cond_2
    iget-object v6, v5, Lcom/huawei/agconnect/apms/k1;->abc:Ljava/util/Properties;

    invoke-virtual {v6, v0}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    .line 20
    iget-object v5, v5, Lcom/huawei/agconnect/apms/k1;->abc:Ljava/util/Properties;

    invoke-virtual {v5, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 21
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_a

    const-string v5, "Flyme"

    invoke-virtual {v0, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    if-eqz v0, :cond_a

    :cond_3
    :goto_0
    return-object v3

    :cond_4
    :goto_1
    return-object v1

    :cond_5
    :goto_2
    return-object v2

    .line 22
    :catchall_0
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    if-nez v0, :cond_6

    goto :goto_4

    .line 23
    :cond_6
    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v5

    const/4 v6, -0x1

    sparse-switch v5, :sswitch_data_0

    goto :goto_3

    :sswitch_0
    const-string v5, "Meizu"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_3

    :cond_7
    const/4 v6, 0x2

    goto :goto_3

    :sswitch_1
    const-string v5, "xiaomi"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_3

    :cond_8
    const/4 v6, 0x1

    goto :goto_3

    :sswitch_2
    const-string v5, "huawei"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_3

    :cond_9
    const/4 v6, 0x0

    :goto_3
    packed-switch v6, :pswitch_data_0

    :cond_a
    :goto_4
    move-object v1, v4

    goto :goto_5

    :pswitch_0
    move-object v1, v3

    goto :goto_5

    :pswitch_1
    move-object v1, v2

    :goto_5
    :pswitch_2
    return-object v1

    :sswitch_data_0
    .sparse-switch
        -0x47e95e19 -> :sswitch_2
        -0x2d450b45 -> :sswitch_1
        0x46c94ac -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public static abc(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_0

    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const-string p0, "unknown"

    :cond_1
    return-object p0
.end method

.method public static bcd(Landroid/content/Context;)F
    .locals 6

    .line 1
    new-instance v0, Landroid/util/DisplayMetrics;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/huawei/agconnect/apms/i1;->cde(Landroid/content/Context;)Landroid/view/Display;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget p0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 17
    .line 18
    int-to-float p0, p0

    .line 19
    iget v2, v0, Landroid/util/DisplayMetrics;->xdpi:F

    .line 20
    .line 21
    div-float/2addr p0, v2

    .line 22
    float-to-double v2, p0

    .line 23
    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    .line 24
    .line 25
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    double-to-float p0, v2

    .line 30
    iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 31
    .line 32
    int-to-float v2, v2

    .line 33
    iget v0, v0, Landroid/util/DisplayMetrics;->ydpi:F

    .line 34
    .line 35
    div-float/2addr v2, v0

    .line 36
    float-to-double v2, v2

    .line 37
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 38
    .line 39
    .line 40
    move-result-wide v2

    .line 41
    double-to-float v0, v2

    .line 42
    add-float/2addr p0, v0

    .line 43
    float-to-double v2, p0

    .line 44
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 45
    .line 46
    .line 47
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    double-to-float p0, v0

    .line 49
    return p0

    .line 50
    :catch_0
    :cond_0
    return v1
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

.method public static cde(Landroid/content/Context;)Landroid/view/Display;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "window"

    .line 3
    .line 4
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Landroid/view/WindowManager;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 13
    .line 14
    .line 15
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    return-object p0

    .line 17
    :catchall_0
    :cond_0
    return-object v0
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

.method public static def(Landroid/content/Context;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Landroid/content/IntentFilter;

    .line 3
    .line 4
    const-string v2, "android.intent.action.BATTERY_CHANGED"

    .line 5
    .line 6
    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {p0, v2, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    const-string v1, "status"

    .line 18
    .line 19
    const/4 v2, -0x1

    .line 20
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 21
    .line 22
    .line 23
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    const/4 v1, 0x2

    .line 25
    if-eq p0, v1, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x5

    .line 28
    if-ne p0, v1, :cond_2

    .line 29
    .line 30
    :cond_1
    const/4 v0, 0x1

    .line 31
    :cond_2
    return v0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    sget-object v1, Lcom/huawei/agconnect/apms/i1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 34
    .line 35
    const-string v2, "failed to get device charging status: "

    .line 36
    .line 37
    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {p0, v2, v1}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 42
    .line 43
    .line 44
    return v0
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
