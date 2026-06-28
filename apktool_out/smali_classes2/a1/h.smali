.class public La1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La1/h$d;,
        La1/h$e;,
        La1/h$f;
    }
.end annotation


# static fields
.field public static final i:Ljava/lang/String; = "failed"

.field public static final j:Ljava/lang/String; = "scheme_failed"


# instance fields
.field public a:Landroid/app/Activity;

.field public volatile b:Lcom/alipay/android/app/IAlixPay;

.field public final c:Ljava/lang/Object;

.field public d:Z

.field public e:La1/h$f;

.field public final f:Ly0/a;

.field public g:Z

.field public h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ly0/a;La1/h$f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/alipay/android/app/IAlixPay;

    .line 5
    .line 6
    iput-object v0, p0, La1/h;->c:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, La1/h;->g:Z

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, La1/h;->h:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p1, p0, La1/h;->a:Landroid/app/Activity;

    .line 15
    .line 16
    iput-object p2, p0, La1/h;->f:Ly0/a;

    .line 17
    .line 18
    iput-object p3, p0, La1/h;->e:La1/h$f;

    .line 19
    .line 20
    const-string p1, "mspl"

    .line 21
    .line 22
    const-string p2, "alipaySdk"

    .line 23
    .line 24
    invoke-static {p1, p2}, La1/e;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ly0/a;)Landroid/util/Pair;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ly0/a;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p3

    .line 1
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    move-object/from16 v0, p2

    .line 2
    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 3
    invoke-static/range {p2 .. p2}, La1/n;->M(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    const-string v0, "biz"

    const-string v7, "PgBindStarting"

    .line 5
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, ""

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string/jumbo v9, "|"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v9, 0x0

    if-eqz v2, :cond_0

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v10

    goto :goto_0

    :cond_0
    move v10, v9

    :goto_0
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v0, v7, v8}, Li0/a;->d(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object v0, v1, La1/h;->a:Landroid/app/Activity;

    iget-object v7, v3, Ly0/a;->d:Ljava/lang/String;

    invoke-static {v0, v3, v2, v7}, Li0/a;->b(Landroid/content/Context;Ly0/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    :try_start_0
    invoke-static {}, Lm0/a;->J()Lm0/a;

    move-result-object v0

    invoke-virtual {v0}, Lm0/a;->p()Z

    move-result v0

    if-nez v0, :cond_2

    .line 8
    iget-object v0, v1, La1/h;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v7, "biz"

    const-string v8, "stSrv"

    if-eqz v0, :cond_1

    .line 9
    :try_start_1
    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_1
    const-string v0, "null"

    :goto_1
    :try_start_2
    invoke-static {v3, v7, v8, v0}, Li0/a;->d(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    const-string v0, "biz"

    const-string v7, "stSrv"

    const-string v8, "skipped"

    .line 10
    invoke-static {v3, v0, v7, v8}, Li0/a;->d(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    :try_start_3
    const-string v7, "biz"

    const-string v8, "TryStartServiceEx"

    .line 11
    invoke-static {v3, v7, v8, v0}, Li0/a;->e(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 12
    :goto_2
    invoke-static {}, Lm0/a;->J()Lm0/a;

    move-result-object v0

    invoke-virtual {v0}, Lm0/a;->l()Z

    move-result v0

    const/4 v7, 0x1

    if-eqz v0, :cond_3

    const-string v0, "biz"

    const-string v8, "bindFlg"

    const-string v10, "imp"

    .line 13
    invoke-static {v3, v0, v8, v10}, Li0/a;->d(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x41

    goto :goto_3

    :cond_3
    move v0, v7

    .line 14
    :goto_3
    new-instance v8, La1/h$e;

    const/4 v10, 0x0

    invoke-direct {v8, v1, v10}, La1/h$e;-><init>(La1/h;La1/h$a;)V

    .line 15
    iget-object v11, v1, La1/h;->a:Landroid/app/Activity;

    invoke-virtual {v11}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v11

    invoke-virtual {v11, v4, v8, v0}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_12

    if-eqz v0, :cond_13

    .line 16
    iget-object v4, v1, La1/h;->c:Ljava/lang/Object;

    monitor-enter v4

    .line 17
    :try_start_4
    iget-object v0, v1, La1/h;->b:Lcom/alipay/android/app/IAlixPay;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_11

    if-nez v0, :cond_4

    .line 18
    :try_start_5
    iget-object v0, v1, La1/h;->c:Ljava/lang/Object;

    invoke-static {}, Lm0/a;->J()Lm0/a;

    move-result-object v11

    invoke-virtual {v11}, Lm0/a;->s()I

    move-result v11

    int-to-long v11, v11

    invoke-virtual {v0, v11, v12}, Ljava/lang/Object;->wait(J)V
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_11

    goto :goto_4

    :catch_0
    move-exception v0

    :try_start_6
    const-string v11, "biz"

    const-string v12, "BindWaitTimeoutEx"

    .line 19
    invoke-static {v3, v11, v12, v0}, Li0/a;->e(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    :cond_4
    :goto_4
    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_11

    .line 21
    iget-object v4, v1, La1/h;->b:Lcom/alipay/android/app/IAlixPay;

    if-nez v4, :cond_6

    :try_start_7
    const-string v0, "biz"

    const-string v5, "ClientBindFailed"

    const-string v6, ""

    .line 22
    invoke-static {v3, v0, v5, v6}, Li0/a;->i(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_b

    const-string v0, "alipaySdk"

    const-string v5, "bindServiceTimeout"

    .line 23
    :try_start_8
    iget-object v6, v1, La1/h;->a:Landroid/app/Activity;

    iget-object v7, v1, La1/h;->f:Ly0/a;

    invoke-static {v0, v5, v6, v7}, La1/n;->u(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ly0/a;)V

    .line 24
    new-instance v5, Landroid/util/Pair;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_b

    const-string v0, "failed"

    :try_start_9
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v5, v0, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_b

    .line 25
    :try_start_a
    iget-object v0, v1, La1/h;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    .line 26
    invoke-static {v0}, La1/e;->d(Ljava/lang/Throwable;)V

    .line 27
    :goto_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v4, "biz"

    const-string v6, "PgBindEnd"

    invoke-static {v3, v4, v6, v0}, Li0/a;->d(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    iget-object v0, v1, La1/h;->a:Landroid/app/Activity;

    iget-object v4, v3, Ly0/a;->d:Ljava/lang/String;

    invoke-static {v0, v3, v2, v4}, Li0/a;->b(Landroid/content/Context;Ly0/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    iput-object v10, v1, La1/h;->b:Lcom/alipay/android/app/IAlixPay;

    .line 30
    iget-boolean v0, v1, La1/h;->d:Z

    if-eqz v0, :cond_5

    iget-object v0, v1, La1/h;->a:Landroid/app/Activity;

    if-eqz v0, :cond_5

    .line 31
    invoke-virtual {v0, v9}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 32
    iput-boolean v9, v1, La1/h;->d:Z

    :cond_5
    return-object v5

    .line 33
    :cond_6
    :try_start_b
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v11
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    const-string v0, "biz"

    const-string v13, "PgBinded"

    .line 34
    :try_start_c
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, ""

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v3, v0, v13, v14}, Li0/a;->d(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    iget-object v0, v1, La1/h;->e:La1/h$f;

    if-eqz v0, :cond_7

    .line 36
    invoke-interface {v0}, La1/h$f;->b()V

    .line 37
    :cond_7
    iget-object v0, v1, La1/h;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getRequestedOrientation()I

    move-result v0

    if-nez v0, :cond_8

    .line 38
    iget-object v0, v1, La1/h;->a:Landroid/app/Activity;

    invoke-virtual {v0, v7}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 39
    iput-boolean v7, v1, La1/h;->d:Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_b

    .line 40
    :cond_8
    :try_start_d
    invoke-interface {v4}, Lcom/alipay/android/app/IAlixPay;->getVersion()I

    move-result v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    goto :goto_6

    :catchall_2
    move-exception v0

    move-object v7, v0

    .line 41
    :try_start_e
    invoke-static {v7}, La1/e;->d(Ljava/lang/Throwable;)V

    move v0, v9

    .line 42
    :goto_6
    new-instance v7, La1/h$d;

    invoke-direct {v7, v1, v10}, La1/h$d;-><init>(La1/h;La1/h$a;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_b

    const/4 v13, 0x3

    if-lt v0, v13, :cond_9

    .line 43
    :try_start_f
    invoke-interface {v4, v7, v2, v10}, Lcom/alipay/android/app/IAlixPay;->registerCallback03(Lcom/alipay/android/app/IRemoteServiceCallback;Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_7

    .line 44
    :cond_9
    invoke-interface {v4, v7}, Lcom/alipay/android/app/IAlixPay;->registerCallback(Lcom/alipay/android/app/IRemoteServiceCallback;)V

    .line 45
    :goto_7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v14
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_a

    const-string v9, "biz"

    const-string v10, "PgBindPay"

    .line 46
    :try_start_10
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_a

    move-object/from16 v16, v8

    :try_start_11
    const-string v8, ""

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v9, v10, v8}, Li0/a;->d(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v8, 0x3

    if-lt v0, v8, :cond_a

    const-string v8, "biz"

    const-string v9, "bind_pay"

    const/4 v10, 0x0

    .line 47
    invoke-interface {v4, v8, v9, v10}, Lcom/alipay/android/app/IAlixPay;->r03(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    :cond_a
    const/4 v8, 0x2

    if-lt v0, v8, :cond_b

    .line 48
    :try_start_12
    invoke-static/range {p3 .. p3}, Ly0/a;->f(Ly0/a;)Ljava/util/HashMap;

    move-result-object v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    const-string/jumbo v8, "ts_bind"

    .line 49
    :try_start_13
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v8, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_3

    const-string/jumbo v5, "ts_bend"

    .line 50
    :try_start_14
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_3

    const-string/jumbo v5, "ts_pay"

    .line 51
    :try_start_15
    invoke-static {v14, v15}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    invoke-interface {v4, v2, v0}, Lcom/alipay/android/app/IAlixPay;->pay02(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    goto :goto_8

    .line 53
    :cond_b
    invoke-interface {v4, v2}, Lcom/alipay/android/app/IAlixPay;->Pay(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_3

    :goto_8
    move-object v5, v0

    move-object/from16 v6, v16

    goto/16 :goto_b

    :catchall_3
    move-exception v0

    .line 54
    :try_start_16
    iget-object v5, v1, La1/h;->f:Ly0/a;

    if-eqz v5, :cond_d

    invoke-virtual {v5}, Ly0/a;->t()Z

    move-result v5

    if-nez v5, :cond_d

    const-string v5, "biz"

    const-string v6, "ClientBindException"

    .line 55
    invoke-static {v3, v5, v6, v0}, Li0/a;->e(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_9

    const-string v0, "alipaySdk"

    const-string v5, "bindServiceEx"

    .line 56
    :try_start_17
    iget-object v6, v1, La1/h;->a:Landroid/app/Activity;

    iget-object v8, v1, La1/h;->f:Ly0/a;

    invoke-static {v0, v5, v6, v8}, La1/n;->u(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ly0/a;)V

    .line 57
    invoke-static {}, Lm0/a;->J()Lm0/a;

    move-result-object v0

    invoke-virtual {v0}, Lm0/a;->B()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 58
    new-instance v5, Landroid/util/Pair;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_9

    const-string v0, "failed"

    :try_start_18
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v5, v0, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_9

    .line 59
    :try_start_19
    invoke-interface {v4, v7}, Lcom/alipay/android/app/IAlixPay;->unregisterCallback(Lcom/alipay/android/app/IRemoteServiceCallback;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_4

    goto :goto_9

    :catchall_4
    move-exception v0

    move-object v4, v0

    .line 60
    invoke-static {v4}, La1/e;->d(Ljava/lang/Throwable;)V

    .line 61
    :goto_9
    :try_start_1a
    iget-object v0, v1, La1/h;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    move-object/from16 v6, v16

    invoke-virtual {v0, v6}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_5

    goto :goto_a

    :catchall_5
    move-exception v0

    .line 62
    invoke-static {v0}, La1/e;->d(Ljava/lang/Throwable;)V

    .line 63
    :goto_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v4, "biz"

    const-string v6, "PgBindEnd"

    invoke-static {v3, v4, v6, v0}, Li0/a;->d(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    iget-object v0, v1, La1/h;->a:Landroid/app/Activity;

    iget-object v4, v3, Ly0/a;->d:Ljava/lang/String;

    invoke-static {v0, v3, v2, v4}, Li0/a;->b(Landroid/content/Context;Ly0/a;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 65
    iput-object v2, v1, La1/h;->b:Lcom/alipay/android/app/IAlixPay;

    .line 66
    iget-boolean v0, v1, La1/h;->d:Z

    if-eqz v0, :cond_c

    iget-object v0, v1, La1/h;->a:Landroid/app/Activity;

    if-eqz v0, :cond_c

    const/4 v2, 0x0

    .line 67
    invoke-virtual {v0, v2}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 68
    iput-boolean v2, v1, La1/h;->d:Z

    :cond_c
    return-object v5

    :cond_d
    move-object/from16 v6, v16

    .line 69
    :try_start_1b
    invoke-static {}, Lg0/b;->a()Ljava/lang/String;

    move-result-object v0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_8

    move-object v5, v0

    .line 70
    :goto_b
    :try_start_1c
    invoke-interface {v4, v7}, Lcom/alipay/android/app/IAlixPay;->unregisterCallback(Lcom/alipay/android/app/IRemoteServiceCallback;)V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_6

    goto :goto_c

    :catchall_6
    move-exception v0

    move-object v4, v0

    .line 71
    invoke-static {v4}, La1/e;->d(Ljava/lang/Throwable;)V

    .line 72
    :goto_c
    :try_start_1d
    iget-object v0, v1, La1/h;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_7

    goto :goto_d

    :catchall_7
    move-exception v0

    .line 73
    invoke-static {v0}, La1/e;->d(Ljava/lang/Throwable;)V

    .line 74
    :goto_d
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v4, "biz"

    const-string v6, "PgBindEnd"

    invoke-static {v3, v4, v6, v0}, Li0/a;->d(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    iget-object v0, v1, La1/h;->a:Landroid/app/Activity;

    iget-object v4, v3, Ly0/a;->d:Ljava/lang/String;

    invoke-static {v0, v3, v2, v4}, Li0/a;->b(Landroid/content/Context;Ly0/a;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 76
    iput-object v2, v1, La1/h;->b:Lcom/alipay/android/app/IAlixPay;

    .line 77
    iget-boolean v0, v1, La1/h;->d:Z

    if-eqz v0, :cond_e

    iget-object v0, v1, La1/h;->a:Landroid/app/Activity;

    if-eqz v0, :cond_e

    const/4 v2, 0x0

    .line 78
    invoke-virtual {v0, v2}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 79
    iput-boolean v2, v1, La1/h;->d:Z

    .line 80
    :cond_e
    new-instance v0, Landroid/util/Pair;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v0, v5, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :catchall_8
    move-exception v0

    goto :goto_e

    :catchall_9
    move-exception v0

    move-object/from16 v6, v16

    goto :goto_e

    :catchall_a
    move-exception v0

    move-object v6, v8

    goto :goto_e

    :catchall_b
    move-exception v0

    move-object v6, v8

    const/4 v7, 0x0

    :goto_e
    :try_start_1e
    const-string v5, "biz"

    const-string v8, "ClientBindFailed"

    const-string v9, "in_bind"

    .line 81
    invoke-static {v3, v5, v8, v0, v9}, Li0/a;->f(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 82
    new-instance v5, Landroid/util/Pair;
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_e

    const-string v0, "failed"

    :try_start_1f
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v5, v0, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_e

    if-eqz v7, :cond_f

    .line 83
    :try_start_20
    invoke-interface {v4, v7}, Lcom/alipay/android/app/IAlixPay;->unregisterCallback(Lcom/alipay/android/app/IRemoteServiceCallback;)V
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_c

    goto :goto_f

    :catchall_c
    move-exception v0

    move-object v4, v0

    .line 84
    invoke-static {v4}, La1/e;->d(Ljava/lang/Throwable;)V

    .line 85
    :cond_f
    :goto_f
    :try_start_21
    iget-object v0, v1, La1/h;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_d

    goto :goto_10

    :catchall_d
    move-exception v0

    .line 86
    invoke-static {v0}, La1/e;->d(Ljava/lang/Throwable;)V

    .line 87
    :goto_10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v4, "biz"

    const-string v6, "PgBindEnd"

    invoke-static {v3, v4, v6, v0}, Li0/a;->d(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    iget-object v0, v1, La1/h;->a:Landroid/app/Activity;

    iget-object v4, v3, Ly0/a;->d:Ljava/lang/String;

    invoke-static {v0, v3, v2, v4}, Li0/a;->b(Landroid/content/Context;Ly0/a;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 89
    iput-object v2, v1, La1/h;->b:Lcom/alipay/android/app/IAlixPay;

    .line 90
    iget-boolean v0, v1, La1/h;->d:Z

    if-eqz v0, :cond_10

    iget-object v0, v1, La1/h;->a:Landroid/app/Activity;

    if-eqz v0, :cond_10

    const/4 v2, 0x0

    .line 91
    invoke-virtual {v0, v2}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 92
    iput-boolean v2, v1, La1/h;->d:Z

    :cond_10
    return-object v5

    :catchall_e
    move-exception v0

    move-object v5, v0

    if-eqz v7, :cond_11

    .line 93
    :try_start_22
    invoke-interface {v4, v7}, Lcom/alipay/android/app/IAlixPay;->unregisterCallback(Lcom/alipay/android/app/IRemoteServiceCallback;)V
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_f

    goto :goto_11

    :catchall_f
    move-exception v0

    move-object v4, v0

    .line 94
    invoke-static {v4}, La1/e;->d(Ljava/lang/Throwable;)V

    .line 95
    :cond_11
    :goto_11
    :try_start_23
    iget-object v0, v1, La1/h;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_10

    goto :goto_12

    :catchall_10
    move-exception v0

    .line 96
    invoke-static {v0}, La1/e;->d(Ljava/lang/Throwable;)V

    .line 97
    :goto_12
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v4, "biz"

    const-string v6, "PgBindEnd"

    invoke-static {v3, v4, v6, v0}, Li0/a;->d(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    iget-object v0, v1, La1/h;->a:Landroid/app/Activity;

    iget-object v4, v3, Ly0/a;->d:Ljava/lang/String;

    invoke-static {v0, v3, v2, v4}, Li0/a;->b(Landroid/content/Context;Ly0/a;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 99
    iput-object v2, v1, La1/h;->b:Lcom/alipay/android/app/IAlixPay;

    .line 100
    iget-boolean v0, v1, La1/h;->d:Z

    if-eqz v0, :cond_12

    iget-object v0, v1, La1/h;->a:Landroid/app/Activity;

    if-eqz v0, :cond_12

    const/4 v2, 0x0

    .line 101
    invoke-virtual {v0, v2}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 102
    iput-boolean v2, v1, La1/h;->d:Z

    :cond_12
    throw v5

    :catchall_11
    move-exception v0

    .line 103
    :try_start_24
    monitor-exit v4
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_11

    throw v0

    .line 104
    :cond_13
    :try_start_25
    new-instance v0, Ljava/lang/Throwable;

    const-string v2, "bindService fail"

    invoke-direct {v0, v2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_12

    :catchall_12
    move-exception v0

    const-string v2, "biz"

    const-string v4, "ClientBindServiceFailed"

    .line 105
    invoke-static {v3, v2, v4, v0}, Li0/a;->e(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 106
    iget-object v0, v1, La1/h;->a:Landroid/app/Activity;

    iget-object v2, v1, La1/h;->f:Ly0/a;

    const-string v3, "alipaySdk"

    const-string v4, "bindServiceFail"

    invoke-static {v3, v4, v0, v2}, La1/n;->u(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ly0/a;)V

    .line 107
    new-instance v0, Landroid/util/Pair;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v3, "failed"

    invoke-direct {v0, v3, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static synthetic b(La1/h;Lcom/alipay/android/app/IAlixPay;)Lcom/alipay/android/app/IAlixPay;
    .locals 0

    iput-object p1, p0, La1/h;->b:Lcom/alipay/android/app/IAlixPay;

    return-object p1
.end method

.method public static synthetic c(La1/h;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, La1/h;->h:Ljava/lang/String;

    return-object p1
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x20

    .line 7
    .line 8
    invoke-static {v1}, La1/n;->j(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    iget-object v4, p0, La1/h;->f:Ly0/a;

    .line 17
    .line 18
    new-instance v5, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string/jumbo v6, "|"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    const-string v6, "biz"

    .line 40
    .line 41
    const-string v7, "BSAStart"

    .line 42
    .line 43
    invoke-static {v4, v6, v7, v5}, Li0/a;->d(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v4, p0, La1/h;->f:Ly0/a;

    .line 47
    .line 48
    invoke-static {v4, v1}, Ly0/a$a;->d(Ly0/a;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v4, La1/h$a;

    .line 52
    .line 53
    invoke-direct {v4, p0, v0}, La1/h$a;-><init>(La1/h;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object v5, Lcom/alipay/sdk/app/APayEntranceActivity;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 57
    .line 58
    invoke-virtual {v5, v1, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    :try_start_0
    iget-object v5, p0, La1/h;->f:Ly0/a;

    .line 62
    .line 63
    invoke-static {v5}, Ly0/a;->f(Ly0/a;)Ljava/util/HashMap;

    .line 64
    .line 65
    .line 66
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    const-string/jumbo v6, "ts_intent"

    .line 68
    .line 69
    .line 70
    :try_start_1
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-interface {v5, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    new-instance v2, Lorg/json/JSONObject;

    .line 78
    .line 79
    invoke-direct {v2, v5}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    move-exception v2

    .line 84
    :try_start_2
    iget-object v3, p0, La1/h;->f:Ly0/a;

    .line 85
    .line 86
    const-string v5, "biz"

    .line 87
    .line 88
    const-string v6, "BSALocEx"

    .line 89
    .line 90
    invoke-static {v3, v5, v6, v2}, Li0/a;->e(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    const/4 v2, 0x0

    .line 94
    :goto_0
    new-instance v3, Landroid/content/Intent;

    .line 95
    .line 96
    iget-object v5, p0, La1/h;->a:Landroid/app/Activity;

    .line 97
    .line 98
    const-class v6, Lcom/alipay/sdk/app/APayEntranceActivity;

    .line 99
    .line 100
    invoke-direct {v3, v5, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 101
    .line 102
    .line 103
    const-string v5, "ap_order_info"

    .line 104
    .line 105
    invoke-virtual {v3, v5, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 106
    .line 107
    .line 108
    const-string v5, "ap_target_packagename"

    .line 109
    .line 110
    invoke-virtual {v3, v5, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 111
    .line 112
    .line 113
    const-string p2, "ap_session"

    .line 114
    .line 115
    invoke-virtual {v3, p2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 116
    .line 117
    .line 118
    if-eqz v2, :cond_0

    .line 119
    .line 120
    const-string p2, "ap_local_info"

    .line 121
    .line 122
    :try_start_3
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v3, p2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 127
    .line 128
    .line 129
    :cond_0
    new-instance p2, Landroid/os/Handler;

    .line 130
    .line 131
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-direct {p2, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 136
    .line 137
    .line 138
    new-instance v1, La1/h$b;

    .line 139
    .line 140
    invoke-direct {v1, p0, v4}, La1/h$b;-><init>(La1/h;Lcom/alipay/sdk/app/APayEntranceActivity$a;)V

    .line 141
    .line 142
    .line 143
    invoke-static {}, Lm0/a;->J()Lm0/a;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v2}, Lm0/a;->s()I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    int-to-long v4, v2

    .line 152
    invoke-virtual {p2, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 153
    .line 154
    .line 155
    iget-object p2, p0, La1/h;->a:Landroid/app/Activity;

    .line 156
    .line 157
    iget-object v1, p0, La1/h;->f:Ly0/a;

    .line 158
    .line 159
    iget-object v2, v1, Ly0/a;->d:Ljava/lang/String;

    .line 160
    .line 161
    invoke-static {p2, v1, p1, v2}, Li0/a;->b(Landroid/content/Context;Ly0/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-static {}, Lm0/a;->J()Lm0/a;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-virtual {p1}, Lm0/a;->G()Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-eqz p1, :cond_1

    .line 173
    .line 174
    new-instance p1, Landroid/os/Handler;

    .line 175
    .line 176
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 181
    .line 182
    .line 183
    new-instance p2, La1/h$c;

    .line 184
    .line 185
    invoke-direct {p2, p0, v3, v0}, La1/h$c;-><init>(La1/h;Landroid/content/Intent;Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 189
    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_1
    :try_start_4
    iget-object p1, p0, La1/h;->a:Landroid/app/Activity;

    .line 193
    .line 194
    if-eqz p1, :cond_2

    .line 195
    .line 196
    invoke-virtual {p1, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 197
    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_2
    iget-object p1, p0, La1/h;->f:Ly0/a;

    .line 201
    .line 202
    const-string p2, "biz"

    .line 203
    .line 204
    const-string v1, "ErrActNull"

    .line 205
    .line 206
    const-string v2, ""

    .line 207
    .line 208
    invoke-static {p1, p2, v1, v2}, Li0/a;->i(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    iget-object p1, p0, La1/h;->f:Ly0/a;

    .line 212
    .line 213
    invoke-virtual {p1}, Ly0/a;->a()Landroid/content/Context;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    if-eqz p1, :cond_3

    .line 218
    .line 219
    invoke-virtual {p1, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 220
    .line 221
    .line 222
    :cond_3
    :goto_1
    :try_start_5
    monitor-enter v0
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 223
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Object;->wait()V

    .line 224
    .line 225
    .line 226
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 227
    :try_start_7
    iget-object p1, p0, La1/h;->h:Ljava/lang/String;
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 228
    .line 229
    const-string/jumbo p2, "unknown"

    .line 230
    .line 231
    .line 232
    :try_start_8
    iget-object v0, p0, La1/h;->f:Ly0/a;

    .line 233
    .line 234
    invoke-static {v0, p1}, La1/l;->d(Ly0/a;Ljava/lang/String;)Ljava/util/Map;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    const-string v1, "resultStatus"

    .line 239
    .line 240
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    check-cast v0, Ljava/lang/String;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 245
    .line 246
    if-nez v0, :cond_4

    .line 247
    .line 248
    const-string p2, "null"

    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_4
    move-object p2, v0

    .line 252
    goto :goto_2

    .line 253
    :catchall_1
    move-exception v0

    .line 254
    :try_start_9
    iget-object v1, p0, La1/h;->f:Ly0/a;

    .line 255
    .line 256
    const-string v2, "biz"

    .line 257
    .line 258
    const-string v3, "BSAStatEx"

    .line 259
    .line 260
    invoke-static {v1, v2, v3, v0}, Li0/a;->e(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 261
    .line 262
    .line 263
    :goto_2
    iget-object v0, p0, La1/h;->f:Ly0/a;
    :try_end_9
    .catch Ljava/lang/InterruptedException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 264
    .line 265
    const-string v1, "biz"

    .line 266
    .line 267
    :try_start_a
    new-instance v2, Ljava/lang/StringBuilder;

    .line 268
    .line 269
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 270
    .line 271
    .line 272
    const-string v3, "BSADone-"

    .line 273
    .line 274
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object p2

    .line 284
    invoke-static {v0, v1, p2}, Li0/a;->c(Ly0/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 288
    .line 289
    .line 290
    move-result p2

    .line 291
    if-eqz p2, :cond_5

    .line 292
    .line 293
    iget-object p1, p0, La1/h;->f:Ly0/a;

    .line 294
    .line 295
    const-string p2, "biz"

    .line 296
    .line 297
    const-string v0, "BSAEmpty"

    .line 298
    .line 299
    invoke-static {p1, p2, v0}, Li0/a;->c(Ly0/a;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 300
    .line 301
    .line 302
    const-string p1, "scheme_failed"

    .line 303
    .line 304
    goto :goto_3

    .line 305
    :catchall_2
    move-exception p1

    .line 306
    :try_start_b
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 307
    :try_start_c
    throw p1

    .line 308
    :catchall_3
    move-exception p1

    .line 309
    iget-object p2, p0, La1/h;->f:Ly0/a;

    .line 310
    .line 311
    const-string v0, "biz"

    .line 312
    .line 313
    const-string v1, "ErrActEx"

    .line 314
    .line 315
    invoke-static {p2, v0, v1, p1}, Li0/a;->e(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 316
    .line 317
    .line 318
    throw p1
    :try_end_c
    .catch Ljava/lang/InterruptedException; {:try_start_c .. :try_end_c} :catch_0
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 319
    :catchall_4
    move-exception p1

    .line 320
    iget-object p2, p0, La1/h;->f:Ly0/a;

    .line 321
    .line 322
    const-string v0, "biz"

    .line 323
    .line 324
    const-string v1, "BSAEx"

    .line 325
    .line 326
    invoke-static {p2, v0, v1, p1}, Li0/a;->e(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 327
    .line 328
    .line 329
    iget-object p1, p0, La1/h;->a:Landroid/app/Activity;

    .line 330
    .line 331
    iget-object p2, p0, La1/h;->f:Ly0/a;

    .line 332
    .line 333
    const-string v0, "alipaySdk"

    .line 334
    .line 335
    const-string v1, "startActivityEx"

    .line 336
    .line 337
    invoke-static {v0, v1, p1, p2}, La1/n;->u(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ly0/a;)V

    .line 338
    .line 339
    .line 340
    const-string p1, "scheme_failed"

    .line 341
    .line 342
    goto :goto_3

    .line 343
    :catch_0
    move-exception p1

    .line 344
    iget-object p2, p0, La1/h;->f:Ly0/a;

    .line 345
    .line 346
    const-string v0, "biz"

    .line 347
    .line 348
    const-string v1, "BSAWaiting"

    .line 349
    .line 350
    invoke-static {p2, v0, v1, p1}, Li0/a;->e(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 351
    .line 352
    .line 353
    sget-object p1, Lg0/c;->j:Lg0/c;

    .line 354
    .line 355
    invoke-virtual {p1}, Lg0/c;->b()I

    .line 356
    .line 357
    .line 358
    move-result p2

    .line 359
    invoke-virtual {p1}, Lg0/c;->a()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object p1

    .line 363
    const-string v0, ""

    .line 364
    .line 365
    invoke-static {p2, p1, v0}, Lg0/b;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    :cond_5
    :goto_3
    return-object p1
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
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;Landroid/content/pm/PackageInfo;)Ljava/lang/String;
    .locals 3

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    iget-object p3, p3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string p3, ""

    .line 7
    .line 8
    :goto_0
    const-string v0, "mspl"

    .line 9
    .line 10
    const-string v1, "pay payInvokeAct"

    .line 11
    .line 12
    invoke-static {v0, v1}, La1/e;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La1/h;->f:Ly0/a;

    .line 16
    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string/jumbo v2, "|"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    const-string v1, "biz"

    .line 39
    .line 40
    const-string v2, "PgWltVer"

    .line 41
    .line 42
    invoke-static {v0, v1, v2, p3}, Li0/a;->d(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object p3, p0, La1/h;->a:Landroid/app/Activity;

    .line 46
    .line 47
    iget-object v0, p0, La1/h;->f:Ly0/a;

    .line 48
    .line 49
    iget-object v1, v0, Ly0/a;->d:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {p3, v0, p1, v1}, Li0/a;->b(Landroid/content/Context;Ly0/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p0, p1, p2}, La1/h;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    return-object p1
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
.end method

.method private f(Ljava/lang/String;Ljava/lang/String;Landroid/content/pm/PackageInfo;La1/n$c;)Ljava/lang/String;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    iget v1, p3, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v1, v0

    .line 8
    :goto_0
    const-string v2, "pay bind or scheme"

    .line 9
    .line 10
    const-string v3, "mspl"

    .line 11
    .line 12
    invoke-static {v3, v2}, La1/e;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, La1/h;->f:Ly0/a;

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-object v2, v2, Ly0/a;->g:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, La1/h;->f:Ly0/a;

    .line 28
    .line 29
    iget-object v0, v0, Ly0/a;->g:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v2, "auth"

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    :cond_1
    const-string v2, "failed"

    .line 42
    .line 43
    const-string v4, "biz"

    .line 44
    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    iget-object v5, p0, La1/h;->f:Ly0/a;

    .line 48
    .line 49
    invoke-static {v5, p2}, La1/n;->R(Ly0/a;Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_3

    .line 54
    .line 55
    if-eqz p4, :cond_2

    .line 56
    .line 57
    :try_start_0
    invoke-static {}, Lm0/a;->J()Lm0/a;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-virtual {v5}, Lm0/a;->H()Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_2

    .line 66
    .line 67
    invoke-direct {p0, p4}, La1/h;->j(La1/n$c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    :catchall_0
    :cond_2
    iget-object p4, p0, La1/h;->f:Ly0/a;

    .line 71
    .line 72
    const-string v5, "BindSkipByL"

    .line 73
    .line 74
    invoke-static {p4, v4, v5}, Li0/a;->c(Ly0/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    move-object v5, v2

    .line 78
    goto :goto_1

    .line 79
    :cond_3
    if-eqz p4, :cond_4

    .line 80
    .line 81
    :try_start_1
    invoke-static {}, Lm0/a;->J()Lm0/a;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-virtual {v5}, Lm0/a;->x()Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-nez v5, :cond_4

    .line 90
    .line 91
    invoke-direct {p0, p4}, La1/h;->j(La1/n$c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 92
    .line 93
    .line 94
    :catchall_1
    :cond_4
    iget-object p4, p0, La1/h;->f:Ly0/a;

    .line 95
    .line 96
    invoke-direct {p0, p1, p2, p4}, La1/h;->a(Ljava/lang/String;Ljava/lang/String;Ly0/a;)Landroid/util/Pair;

    .line 97
    .line 98
    .line 99
    move-result-object p4

    .line 100
    iget-object v5, p4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v5, Ljava/lang/String;

    .line 103
    .line 104
    :try_start_2
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    if-eqz v6, :cond_5

    .line 109
    .line 110
    iget-object p4, p4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p4, Ljava/lang/Boolean;

    .line 113
    .line 114
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 115
    .line 116
    .line 117
    move-result p4

    .line 118
    if-eqz p4, :cond_5

    .line 119
    .line 120
    invoke-static {}, Lm0/a;->J()Lm0/a;

    .line 121
    .line 122
    .line 123
    move-result-object p4

    .line 124
    invoke-virtual {p4}, Lm0/a;->v()Z

    .line 125
    .line 126
    .line 127
    move-result p4

    .line 128
    if-eqz p4, :cond_5

    .line 129
    .line 130
    iget-object p4, p0, La1/h;->f:Ly0/a;

    .line 131
    .line 132
    const-string v6, "BindRetry"

    .line 133
    .line 134
    invoke-static {p4, v4, v6}, Li0/a;->c(Ly0/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    iget-object p4, p0, La1/h;->f:Ly0/a;

    .line 138
    .line 139
    invoke-direct {p0, p1, p2, p4}, La1/h;->a(Ljava/lang/String;Ljava/lang/String;Ly0/a;)Landroid/util/Pair;

    .line 140
    .line 141
    .line 142
    move-result-object p4

    .line 143
    iget-object p4, p4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast p4, Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 146
    .line 147
    move-object v5, p4

    .line 148
    goto :goto_1

    .line 149
    :catchall_2
    move-exception p4

    .line 150
    iget-object v6, p0, La1/h;->f:Ly0/a;

    .line 151
    .line 152
    const-string v7, "BindRetryEx"

    .line 153
    .line 154
    invoke-static {v6, v4, v7, p4}, Li0/a;->e(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 155
    .line 156
    .line 157
    :cond_5
    :goto_1
    new-instance p4, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 160
    .line 161
    .line 162
    const-string v6, "pay bind result: "

    .line 163
    .line 164
    invoke-virtual {p4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p4

    .line 174
    invoke-static {v3, p4}, La1/e;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    iget-object p4, p0, La1/h;->a:Landroid/app/Activity;

    .line 178
    .line 179
    iget-object v3, p0, La1/h;->f:Ly0/a;

    .line 180
    .line 181
    iget-object v6, v3, Ly0/a;->d:Ljava/lang/String;

    .line 182
    .line 183
    invoke-static {p4, v3, p1, v6}, Li0/a;->b(Landroid/content/Context;Ly0/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result p4

    .line 190
    if-eqz p4, :cond_7

    .line 191
    .line 192
    const-string p4, "com.eg.android.AlipayGphone"

    .line 193
    .line 194
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result p4

    .line 198
    if-nez p4, :cond_6

    .line 199
    .line 200
    iget-object p1, p0, La1/h;->f:Ly0/a;

    .line 201
    .line 202
    new-instance p3, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    const-string/jumbo p2, "|"

    .line 211
    .line 212
    .line 213
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p2

    .line 223
    const-string p3, "BSPNotStartByAlipay"

    .line 224
    .line 225
    invoke-static {p1, v4, p3, p2}, Li0/a;->d(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    return-object v5

    .line 229
    :cond_6
    const/16 p4, 0x1cc

    .line 230
    .line 231
    if-lt v1, p4, :cond_7

    .line 232
    .line 233
    if-nez v0, :cond_7

    .line 234
    .line 235
    iget-object p4, p0, La1/h;->a:Landroid/app/Activity;

    .line 236
    .line 237
    if-eqz p4, :cond_7

    .line 238
    .line 239
    iget-object v0, p0, La1/h;->f:Ly0/a;

    .line 240
    .line 241
    invoke-static {p2, p4, v0}, La1/h;->k(Ljava/lang/String;Landroid/content/Context;Ly0/a;)Z

    .line 242
    .line 243
    .line 244
    move-result p4

    .line 245
    if-eqz p4, :cond_7

    .line 246
    .line 247
    invoke-direct {p0, p1, p2, p3}, La1/h;->e(Ljava/lang/String;Ljava/lang/String;Landroid/content/pm/PackageInfo;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    return-object p1

    .line 252
    :cond_7
    return-object v5
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
.end method

.method public static synthetic h(La1/h;)Ly0/a;
    .locals 0

    iget-object p0, p0, La1/h;->f:Ly0/a;

    return-object p0
.end method

.method private j(La1/n$c;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object p1, p1, La1/n$c;->a:Landroid/content/pm/PackageInfo;

    .line 5
    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return-void

    .line 9
    :cond_1
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v0, Landroid/content/Intent;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "com.alipay.android.app.TransProcessPayActivity"

    .line 17
    .line 18
    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 19
    .line 20
    .line 21
    :try_start_0
    iget-object p1, p0, La1/h;->a:Landroid/app/Activity;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    iget-object v0, p0, La1/h;->f:Ly0/a;

    .line 29
    .line 30
    const-string v1, "biz"

    .line 31
    .line 32
    const-string v2, "StartLaunchAppTransEx"

    .line 33
    .line 34
    invoke-static {v0, v1, v2, p1}, Li0/a;->e(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    const-wide/16 v0, 0xc8

    .line 38
    .line 39
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 40
    .line 41
    .line 42
    return-void
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
.end method

.method public static k(Ljava/lang/String;Landroid/content/Context;Ly0/a;)Z
    .locals 5

    .line 1
    const-string v0, "BSADetectFail"

    .line 2
    .line 3
    const-string v1, "biz"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    new-instance v3, Landroid/content/Intent;

    .line 7
    .line 8
    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v4, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity"

    .line 12
    .line 13
    invoke-virtual {v3, p0, v4}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {v3, p0, v2}, Landroid/content/Intent;->resolveActivityInfo(Landroid/content/pm/PackageManager;I)Landroid/content/pm/ActivityInfo;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-nez p0, :cond_0

    .line 25
    .line 26
    invoke-static {p2, v1, v0}, Li0/a;->c(Ly0/a;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    return v2

    .line 30
    :cond_0
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    invoke-static {p2, v1, v0, p0}, Li0/a;->e(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    return v2
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public static synthetic l(La1/h;)Landroid/app/Activity;
    .locals 0

    iget-object p0, p0, La1/h;->a:Landroid/app/Activity;

    return-object p0
.end method

.method public static synthetic m(La1/h;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, La1/h;->c:Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic n(La1/h;)La1/h$f;
    .locals 0

    iget-object p0, p0, La1/h;->e:La1/h$f;

    return-object p0
.end method


# virtual methods
.method public g(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-static {}, Lm0/a;->J()Lm0/a;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    invoke-virtual {v2}, Lm0/a;->t()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-static {}, Lm0/a;->J()Lm0/a;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    iget-boolean v3, v3, Lm0/a;->g:Z

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    :cond_0
    sget-object v2, Lg0/a;->d:Ljava/util/List;

    .line 23
    .line 24
    :cond_1
    iget-object v3, p0, La1/h;->f:Ly0/a;

    .line 25
    .line 26
    iget-object v4, p0, La1/h;->a:Landroid/app/Activity;

    .line 27
    .line 28
    invoke-static {v3, v4, v2}, La1/n;->f(Ly0/a;Landroid/content/Context;Ljava/util/List;)La1/n$c;

    .line 29
    .line 30
    .line 31
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 32
    const-string v3, "failed"

    .line 33
    .line 34
    if-eqz v2, :cond_8

    .line 35
    .line 36
    :try_start_1
    iget-object v4, p0, La1/h;->f:Ly0/a;

    .line 37
    .line 38
    invoke-virtual {v2, v4}, La1/n$c;->b(Ly0/a;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-nez v4, :cond_8

    .line 43
    .line 44
    invoke-virtual {v2}, La1/n$c;->a()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    goto/16 :goto_2

    .line 51
    .line 52
    :cond_2
    iget-object v4, v2, La1/n$c;->a:Landroid/content/pm/PackageInfo;

    .line 53
    .line 54
    invoke-static {v4}, La1/n;->w(Landroid/content/pm/PackageInfo;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_3

    .line 59
    .line 60
    return-object v3

    .line 61
    :cond_3
    iget-object v3, v2, La1/n$c;->a:Landroid/content/pm/PackageInfo;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    .line 63
    if-eqz v3, :cond_5

    .line 64
    .line 65
    const-string v4, "com.eg.android.AlipayGphone"

    .line 66
    .line 67
    :try_start_2
    iget-object v3, v3, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_4

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    iget-object v3, v2, La1/n$c;->a:Landroid/content/pm/PackageInfo;

    .line 77
    .line 78
    iget-object v0, v3, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_5
    :goto_0
    invoke-static {}, La1/n;->D()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    :goto_1
    iget-object v3, v2, La1/n$c;->a:Landroid/content/pm/PackageInfo;

    .line 86
    .line 87
    if-eqz v3, :cond_6

    .line 88
    .line 89
    move-object v1, v3

    .line 90
    :cond_6
    invoke-static {}, Lm0/a;->J()Lm0/a;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-virtual {v3}, Lm0/a;->m()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    if-eqz v3, :cond_9

    .line 99
    .line 100
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 101
    .line 102
    .line 103
    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 104
    if-lez v4, :cond_9

    .line 105
    .line 106
    :try_start_3
    new-instance v4, Lorg/json/JSONObject;

    .line 107
    .line 108
    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    if-eqz v3, :cond_9

    .line 116
    .line 117
    invoke-virtual {v3}, Lorg/json/JSONObject;->length()I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-lez v4, :cond_9

    .line 122
    .line 123
    invoke-virtual {v3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    :catch_0
    :cond_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    if-eqz v5, :cond_9

    .line 132
    .line 133
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    check-cast v5, Ljava/lang/String;

    .line 138
    .line 139
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-eqz v1, :cond_7

    .line 144
    .line 145
    iget v7, v1, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 146
    .line 147
    if-lt v7, v6, :cond_7

    .line 148
    .line 149
    :try_start_4
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    invoke-static {}, Lm0/a;->J()Lm0/a;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    iget-object v7, p0, La1/h;->a:Landroid/app/Activity;

    .line 162
    .line 163
    invoke-virtual {v6, v7, v5}, Lm0/a;->k(Landroid/content/Context;I)Z

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    iput-boolean v5, p0, La1/h;->g:Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 168
    .line 169
    if-eqz v5, :cond_7

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :catchall_0
    move-exception v3

    .line 173
    goto :goto_3

    .line 174
    :cond_8
    :goto_2
    return-object v3

    .line 175
    :catchall_1
    move-exception v3

    .line 176
    move-object v2, v1

    .line 177
    :goto_3
    iget-object v4, p0, La1/h;->f:Ly0/a;

    .line 178
    .line 179
    const-string v5, "biz"

    .line 180
    .line 181
    const-string v6, "CheckClientSignEx"

    .line 182
    .line 183
    invoke-static {v4, v5, v6, v3}, Li0/a;->e(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 184
    .line 185
    .line 186
    :catchall_2
    :cond_9
    :goto_4
    iget-object v3, p0, La1/h;->f:Ly0/a;

    .line 187
    .line 188
    invoke-static {v3}, La1/n;->J(Ly0/a;)Z

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-nez p2, :cond_a

    .line 193
    .line 194
    iget-boolean p2, p0, La1/h;->g:Z

    .line 195
    .line 196
    if-eqz p2, :cond_b

    .line 197
    .line 198
    :cond_a
    if-nez v3, :cond_b

    .line 199
    .line 200
    iget-object p2, p0, La1/h;->a:Landroid/app/Activity;

    .line 201
    .line 202
    iget-object v3, p0, La1/h;->f:Ly0/a;

    .line 203
    .line 204
    invoke-static {v0, p2, v3}, La1/h;->k(Ljava/lang/String;Landroid/content/Context;Ly0/a;)Z

    .line 205
    .line 206
    .line 207
    move-result p2

    .line 208
    if-eqz p2, :cond_b

    .line 209
    .line 210
    invoke-direct {p0, p1, v0, v1}, La1/h;->e(Ljava/lang/String;Ljava/lang/String;Landroid/content/pm/PackageInfo;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    return-object p1

    .line 215
    :cond_b
    invoke-direct {p0, p1, v0, v1, v2}, La1/h;->f(Ljava/lang/String;Ljava/lang/String;Landroid/content/pm/PackageInfo;La1/n$c;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    return-object p1
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
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
.end method

.method public i()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, La1/h;->a:Landroid/app/Activity;

    .line 3
    .line 4
    iput-object v0, p0, La1/h;->e:La1/h$f;

    .line 5
    .line 6
    return-void
    .line 7
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
.end method
