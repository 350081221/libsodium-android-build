.class public final Lcom/huawei/hms/analytics/ck;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/ck$lmn;
    }
.end annotation


# instance fields
.field private ikl:Ljava/lang/String;

.field private final klm:Lcom/huawei/hms/analytics/cw;

.field private lmn:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/hms/analytics/bh;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/hms/analytics/ck;->ikl:Ljava/lang/String;

    iput-object p1, p0, Lcom/huawei/hms/analytics/ck;->lmn:Landroid/content/Context;

    new-instance p1, Lcom/huawei/hms/analytics/ct;

    invoke-direct {p1, p2}, Lcom/huawei/hms/analytics/ct;-><init>(Lcom/huawei/hms/analytics/bh;)V

    iput-object p1, p0, Lcom/huawei/hms/analytics/ck;->klm:Lcom/huawei/hms/analytics/cw;

    return-void
.end method

.method private lmn()Lcom/huawei/hms/analytics/cu;
    .locals 17

    move-object/from16 v1, p0

    const-string v0, "isLastReferrerQueryFailed"

    const-string v2, "global_v2"

    const-string v3, "1"

    const-string v4, "0"

    const-string v5, "ReferrerMission"

    new-instance v6, Lcom/huawei/hms/analytics/cu;

    const-string v7, "AG"

    invoke-direct {v6, v7}, Lcom/huawei/hms/analytics/cu;-><init>(Ljava/lang/String;)V

    const-string v8, "ReferrerTask#AGReferrer"

    invoke-static {v8}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v8

    const/4 v9, 0x1

    :try_start_0
    iget-object v10, v1, Lcom/huawei/hms/analytics/ck;->lmn:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v11

    const-string v10, "content://com.huawei.appmarket.commondata/item/5"

    invoke-static {v10}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v12

    iget-object v10, v1, Lcom/huawei/hms/analytics/ck;->lmn:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v10

    invoke-virtual {v12}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v13

    const/4 v15, 0x0

    invoke-virtual {v10, v13, v15}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    move-result-object v10

    if-eqz v10, :cond_0

    iget-object v10, v10, Landroid/content/pm/ProviderInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v10, :cond_1

    const-string v13, "com.huawei.appmarket"

    iget-object v10, v10, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    goto :goto_0

    :cond_0
    const-string v10, "Invalid param, providerInfo is null"

    invoke-static {v5, v10}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    move v10, v15

    :goto_0
    if-nez v10, :cond_2

    const-string v7, "provder uri pkg check failed"

    invoke-static {v5, v7}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "002"

    iput-object v7, v1, Lcom/huawei/hms/analytics/ck;->ikl:Ljava/lang/String;

    goto/16 :goto_5

    :cond_2
    iget-object v10, v1, Lcom/huawei/hms/analytics/ck;->lmn:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v10

    const/4 v13, 0x0

    new-array v14, v9, [Ljava/lang/String;

    aput-object v10, v14, v15

    const/4 v10, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move-object/from16 v15, v16

    move-object/from16 v16, v10

    invoke-virtual/range {v11 .. v16}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    new-instance v11, Lcom/huawei/hms/analytics/cu;

    invoke-direct {v11, v7}, Lcom/huawei/hms/analytics/cu;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/database/CursorIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v7, "IE-002"

    if-nez v10, :cond_3

    :try_start_1
    const-string v10, " Cannot find the App from AG."

    invoke-static {v5, v7, v10}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "003"

    iput-object v7, v1, Lcom/huawei/hms/analytics/ck;->ikl:Ljava/lang/String;

    iget-object v7, v1, Lcom/huawei/hms/analytics/ck;->lmn:Landroid/content/Context;

    :goto_1
    invoke-static {v7, v2, v0, v9}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_4

    :cond_3
    invoke-interface {v10}, Landroid/database/Cursor;->getCount()I

    move-result v12

    if-gtz v12, :cond_4

    const-string v10, " has no referrer info stored in AG!"

    invoke-static {v5, v7, v10}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "004"

    iput-object v7, v1, Lcom/huawei/hms/analytics/ck;->ikl:Ljava/lang/String;

    iget-object v7, v1, Lcom/huawei/hms/analytics/ck;->lmn:Landroid/content/Context;

    goto :goto_1

    :cond_4
    const-string v7, "referrer query success!"

    invoke-static {v5, v7}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v10}, Landroid/database/Cursor;->moveToFirst()Z

    const/4 v7, 0x0

    invoke-interface {v10, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Landroid/database/CursorIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v13, ""

    if-nez v12, :cond_5

    :try_start_2
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    :cond_5
    const-string v7, "001"

    iput-object v7, v1, Lcom/huawei/hms/analytics/ck;->ikl:Ljava/lang/String;

    const-string v7, "PE-001"

    const-string v12, "referrer is null or 0"

    invoke-static {v5, v7, v12}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v7, v13

    :cond_6
    iput-object v7, v11, Lcom/huawei/hms/analytics/cv;->ikl:Ljava/lang/String;

    invoke-interface {v10}, Landroid/database/Cursor;->getColumnCount()I

    move-result v7

    const/4 v12, 0x4

    if-le v7, v12, :cond_b

    invoke-interface {v10, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_7

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    :cond_7
    const-string v7, "trackId is empty"

    invoke-static {v5, v7}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    move-object v7, v13

    :cond_8
    iput-object v7, v11, Lcom/huawei/hms/analytics/cu;->lmn:Ljava/lang/String;

    invoke-interface {v10, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_a

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    goto :goto_2

    :cond_9
    move-object v13, v7

    goto :goto_3

    :cond_a
    :goto_2
    const-string v7, "trackIdTime is empty"

    invoke-static {v5, v7}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    iput-object v13, v11, Lcom/huawei/hms/analytics/cu;->klm:Ljava/lang/String;

    goto :goto_4

    :cond_b
    const-string v7, "The AG version is too early."

    invoke-static {v5, v7}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Landroid/database/CursorIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_4
    move-object v6, v11

    :goto_5
    iget-object v0, v1, Lcom/huawei/hms/analytics/ck;->ikl:Ljava/lang/String;

    iput-object v0, v8, Lcom/huawei/hms/analytics/cc;->klm:Ljava/lang/String;

    iget-object v0, v6, Lcom/huawei/hms/analytics/cv;->ikl:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_6

    :cond_c
    move-object v3, v4

    :goto_6
    iput-object v3, v8, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v8}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    goto :goto_7

    :catchall_0
    move-exception v0

    goto :goto_8

    :catch_0
    :try_start_3
    const-string v7, "Referrer query Exception!"

    invoke-static {v5, v7}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "999"

    iput-object v5, v1, Lcom/huawei/hms/analytics/ck;->ikl:Ljava/lang/String;

    iget-object v5, v1, Lcom/huawei/hms/analytics/ck;->lmn:Landroid/content/Context;

    invoke-static {v5, v2, v0, v9}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object v0, v1, Lcom/huawei/hms/analytics/ck;->ikl:Ljava/lang/String;

    iput-object v0, v8, Lcom/huawei/hms/analytics/cc;->klm:Ljava/lang/String;

    iget-object v0, v6, Lcom/huawei/hms/analytics/cv;->ikl:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_6

    :catch_1
    :try_start_4
    const-string v7, "Referrer query CursorIndexOutOfBoundsException!"

    invoke-static {v5, v7}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "101"

    iput-object v5, v1, Lcom/huawei/hms/analytics/ck;->ikl:Ljava/lang/String;

    iget-object v5, v1, Lcom/huawei/hms/analytics/ck;->lmn:Landroid/content/Context;

    invoke-static {v5, v2, v0, v9}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    iget-object v0, v1, Lcom/huawei/hms/analytics/ck;->ikl:Ljava/lang/String;

    iput-object v0, v8, Lcom/huawei/hms/analytics/cc;->klm:Ljava/lang/String;

    iget-object v0, v6, Lcom/huawei/hms/analytics/cv;->ikl:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_6

    :catch_2
    :try_start_5
    const-string v7, "Referrer query IllegalStateException!"

    invoke-static {v5, v7}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "100"

    iput-object v5, v1, Lcom/huawei/hms/analytics/ck;->ikl:Ljava/lang/String;

    iget-object v5, v1, Lcom/huawei/hms/analytics/ck;->lmn:Landroid/content/Context;

    invoke-static {v5, v2, v0, v9}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    iget-object v0, v1, Lcom/huawei/hms/analytics/ck;->ikl:Ljava/lang/String;

    iput-object v0, v8, Lcom/huawei/hms/analytics/cc;->klm:Ljava/lang/String;

    iget-object v0, v6, Lcom/huawei/hms/analytics/cv;->ikl:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_6

    :goto_7
    return-object v6

    :goto_8
    iget-object v2, v1, Lcom/huawei/hms/analytics/ck;->ikl:Ljava/lang/String;

    iput-object v2, v8, Lcom/huawei/hms/analytics/cc;->klm:Ljava/lang/String;

    iget-object v2, v6, Lcom/huawei/hms/analytics/cv;->ikl:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_d

    goto :goto_9

    :cond_d
    move-object v3, v4

    :goto_9
    iput-object v3, v8, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {v8}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    throw v0
.end method

.method static synthetic lmn(Lcom/huawei/hms/analytics/ck;Lcom/huawei/hms/analytics/cv;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/hms/analytics/ck;->lmn(Lcom/huawei/hms/analytics/cv;)V

    return-void
.end method

.method private lmn(Lcom/huawei/hms/analytics/cv;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/ck;->klm:Lcom/huawei/hms/analytics/cw;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/analytics/cw;->lmn(Lcom/huawei/hms/analytics/cv;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/huawei/hms/analytics/ck;->lmn:Landroid/content/Context;

    if-eqz v0, :cond_6

    invoke-static {}, Lcom/huawei/hms/analytics/z;->lmn()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/z;->klm()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/hms/analytics/cu;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/cu;-><init>()V

    invoke-direct {p0, v0}, Lcom/huawei/hms/analytics/ck;->lmn(Lcom/huawei/hms/analytics/cv;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/ck;->lmn:Landroid/content/Context;

    const-string v1, "global_v2"

    const-string v2, "isLastReferrerQueryFailed"

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    invoke-direct {p0}, Lcom/huawei/hms/analytics/ck;->lmn()Lcom/huawei/hms/analytics/cu;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v0, :cond_4

    iget-object v0, v1, Lcom/huawei/hms/analytics/cv;->ikl:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, v1, Lcom/huawei/hms/analytics/cu;->lmn:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move v0, v3

    goto :goto_1

    :cond_2
    :goto_0
    move v0, v2

    :goto_1
    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-direct {p0, v1}, Lcom/huawei/hms/analytics/ck;->lmn(Lcom/huawei/hms/analytics/cv;)V

    goto :goto_3

    :cond_4
    :goto_2
    new-instance v0, Lcom/huawei/hms/analytics/m;

    iget-object v1, p0, Lcom/huawei/hms/analytics/ck;->lmn:Landroid/content/Context;

    new-instance v4, Lcom/huawei/hms/analytics/ck$lmn;

    invoke-direct {v4, p0, v3}, Lcom/huawei/hms/analytics/ck$lmn;-><init>(Lcom/huawei/hms/analytics/ck;B)V

    invoke-direct {v0, v1, v4}, Lcom/huawei/hms/analytics/m;-><init>(Landroid/content/Context;Lcom/huawei/hms/analytics/l;)V

    const-string v1, "ads bindService.."

    const-string v4, "PpsServiceCommander"

    invoke-static {v4, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, v0, Lcom/huawei/hms/analytics/m;->lmn:Landroid/content/Context;

    if-eqz v1, :cond_6

    new-instance v1, Lcom/huawei/hms/analytics/m$lmn;

    invoke-direct {v1, v0, v3}, Lcom/huawei/hms/analytics/m$lmn;-><init>(Lcom/huawei/hms/analytics/m;B)V

    iput-object v1, v0, Lcom/huawei/hms/analytics/m;->klm:Landroid/content/ServiceConnection;

    new-instance v1, Landroid/content/Intent;

    const-string v3, "com.huawei.android.hms.CHANNEL_SERVICE"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    :try_start_0
    const-string v3, "com.huawei.hwid"

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v3, v0, Lcom/huawei/hms/analytics/m;->lmn:Landroid/content/Context;

    iget-object v5, v0, Lcom/huawei/hms/analytics/m;->klm:Landroid/content/ServiceConnection;

    invoke-virtual {v3, v1, v5, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v0, v0, Lcom/huawei/hms/analytics/m;->ikl:Lcom/huawei/hms/analytics/l;

    const-string v1, "bindService result: false"

    const-string v2, "009"

    invoke-interface {v0, v1, v2}, Lcom/huawei/hms/analytics/l;->lmn(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_5
    const-string v0, "bindService result: true"

    invoke-static {v4, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :catch_0
    iget-object v0, v0, Lcom/huawei/hms/analytics/m;->ikl:Lcom/huawei/hms/analytics/l;

    const-string v1, "setPackage IllegalArgumentException"

    const-string v2, "103"

    invoke-interface {v0, v1, v2}, Lcom/huawei/hms/analytics/l;->lmn(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_3
    return-void
.end method
