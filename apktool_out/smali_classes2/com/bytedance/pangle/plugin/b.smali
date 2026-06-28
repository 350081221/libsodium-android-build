.class final Lcom/bytedance/pangle/plugin/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/pangle/plugin/b$a;
    }
.end annotation


# static fields
.field private static final a:Lcom/bytedance/pangle/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/bytedance/pangle/i;->a()Lcom/bytedance/pangle/i;

    move-result-object v0

    sput-object v0, Lcom/bytedance/pangle/plugin/b;->a:Lcom/bytedance/pangle/i;

    return-void
.end method

.method static synthetic a(Ljava/io/File;Ljava/lang/String;ILjava/lang/StringBuffer;)V
    .locals 11

    const-string v0, ";"

    const-string v1, "checkSignature cost:"

    .line 37
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 38
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p1}, Lcom/bytedance/pangle/g/e;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_0

    .line 39
    invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p0

    sub-long/2addr p0, v2

    invoke-virtual {p3, p0, p1}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    return-void

    .line 40
    :cond_0
    :try_start_1
    new-instance p0, Ljava/lang/RuntimeException;

    const-string/jumbo v4, "\u5b89\u88c5\u5305\u7b7e\u540d\u6821\u9a8c\u5931\u8d25[1]"

    invoke-direct {p0, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 41
    :try_start_2
    sget-object v4, Lcom/bytedance/pangle/c/b;->f:Ljava/lang/String;

    sget v5, Lcom/bytedance/pangle/c/b$a;->u:I

    const-wide/16 v8, -0x1

    const/4 v10, 0x0

    move-object v6, p1

    move v7, p2

    invoke-static/range {v4 .. v10}, Lcom/bytedance/pangle/plugin/b;->a(Ljava/lang/String;ILjava/lang/String;IJLjava/lang/String;)V

    .line 42
    sget-object v4, Lcom/bytedance/pangle/plugin/b;->a:Lcom/bytedance/pangle/i;

    const/16 v5, 0x44c

    const/4 v6, -0x3

    move-object v7, p1

    move v8, p2

    move-object v9, p0

    invoke-virtual/range {v4 .. v9}, Lcom/bytedance/pangle/i;->a(IILjava/lang/String;ILjava/lang/Throwable;)V

    .line 43
    new-instance p1, Lcom/bytedance/pangle/plugin/b$a;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    const/4 v4, 0x0

    invoke-direct {p1, p2, p0, v4}, Lcom/bytedance/pangle/plugin/b$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    :goto_0
    invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    sub-long/2addr p1, v2

    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 45
    throw p0
.end method

.method static synthetic a(Ljava/lang/String;I)V
    .locals 9

    const/4 v0, 0x0

    .line 72
    :try_start_0
    invoke-static {}, Lcom/bytedance/pangle/util/i;->e()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lcom/bytedance/pangle/util/i;->g()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 73
    :cond_0
    invoke-static {}, Lcom/bytedance/pangle/util/l;->a()Lcom/bytedance/pangle/util/l;

    move-result-object v1

    invoke-virtual {v1, p0, p1, v0}, Lcom/bytedance/pangle/util/l;->b(Ljava/lang/String;IZ)V

    .line 74
    invoke-static {}, Lcom/bytedance/pangle/Zeus;->getAppApplication()Landroid/app/Application;

    move-result-object v1

    invoke-static {v1}, Lcom/bytedance/pangle/e/b;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, p0, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 75
    invoke-static {}, Lcom/bytedance/pangle/e/f;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception v1

    .line 76
    sget-object v2, Lcom/bytedance/pangle/c/b;->f:Ljava/lang/String;

    sget v3, Lcom/bytedance/pangle/c/b$a;->z:I

    const-wide/16 v6, -0x1

    const/4 v8, 0x0

    move-object v4, p0

    move v5, p1

    invoke-static/range {v2 .. v8}, Lcom/bytedance/pangle/plugin/b;->a(Ljava/lang/String;ILjava/lang/String;IJLjava/lang/String;)V

    .line 77
    new-instance p0, Lcom/bytedance/pangle/plugin/b$a;

    const-string p1, "dexOpt2\u5931\u8d25"

    invoke-direct {p0, p1, v1, v0}, Lcom/bytedance/pangle/plugin/b$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    throw p0
.end method

.method private static a(Ljava/lang/String;ILjava/lang/String;IJLjava/lang/String;)V
    .locals 4
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 27
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 28
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 29
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v3, "status_code"

    .line 30
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lcom/bytedance/pangle/log/b;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v3, p1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "plugin_package_name"

    .line 31
    invoke-static {p2}, Lcom/bytedance/pangle/log/b;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string/jumbo p1, "version_code"

    .line 32
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p2}, Lcom/bytedance/pangle/log/b;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "duration"

    .line 33
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p2}, Lcom/bytedance/pangle/log/b;->b(Ljava/lang/Object;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v2, p1, p2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "message"

    .line 34
    invoke-static {p6}, Lcom/bytedance/pangle/log/b;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p1, p2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 35
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 36
    :goto_0
    invoke-static {}, Lcom/bytedance/pangle/c/b;->a()Lcom/bytedance/pangle/c/b;

    move-result-object p1

    invoke-virtual {p1, p0, v0, v2, v1}, Lcom/bytedance/pangle/c/b;->a(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    return-void
.end method

.method static synthetic a(Ljava/lang/String;ILjava/util/Map;Ljava/lang/StringBuffer;)V
    .locals 11

    const-string v0, ";"

    const-string v1, "copySo cost:"

    .line 54
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 55
    invoke-static {p0, p1}, Lcom/bytedance/pangle/d/c;->b(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    .line 56
    invoke-static {p0, p1}, Lcom/bytedance/pangle/d/c;->d(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v5

    .line 57
    :try_start_0
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v6, v4, p0, p2}, Lcom/bytedance/pangle/d/b;->a(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p0

    sub-long/2addr p0, v2

    invoke-virtual {p3, p0, p1}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    return-void

    :catchall_0
    move-exception p0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 59
    :try_start_1
    sget-object v4, Lcom/bytedance/pangle/c/b;->f:Ljava/lang/String;

    sget v5, Lcom/bytedance/pangle/c/b$a;->x:I

    const-wide/16 v8, -0x1

    .line 60
    invoke-static {p2}, Lcom/bytedance/pangle/log/b;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    move-object v6, p0

    move v7, p1

    .line 61
    invoke-static/range {v4 .. v10}, Lcom/bytedance/pangle/plugin/b;->a(Ljava/lang/String;ILjava/lang/String;IJLjava/lang/String;)V

    .line 62
    sget-object v4, Lcom/bytedance/pangle/plugin/b;->a:Lcom/bytedance/pangle/i;

    const/16 v5, 0x44c

    const/4 v6, -0x7

    move-object v7, p0

    move v8, p1

    move-object v9, p2

    invoke-virtual/range {v4 .. v9}, Lcom/bytedance/pangle/i;->a(IILjava/lang/String;ILjava/lang/Throwable;)V

    .line 63
    new-instance p0, Lcom/bytedance/pangle/plugin/b$a;

    const-string/jumbo p1, "\u5b89\u88c5\u5305\u52a8\u6001\u5e93\u62f7\u8d1d\u5931\u8d25"

    const/4 v4, 0x0

    invoke-direct {p0, p1, p2, v4}, Lcom/bytedance/pangle/plugin/b$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    :goto_0
    invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    sub-long/2addr p1, v2

    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 65
    throw p0
.end method

.method static synthetic a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/StringBuffer;)V
    .locals 19

    move-object/from16 v0, p3

    .line 46
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 47
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    new-instance v4, Lcom/bytedance/pangle/res/a/c;

    invoke-direct {v4}, Lcom/bytedance/pangle/res/a/c;-><init>()V

    new-instance v5, Ljava/io/File;

    move-object/from16 v6, p0

    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6, v3}, Lcom/bytedance/pangle/res/a/c;->a(Ljava/io/File;ZLjava/lang/StringBuilder;)I

    move-result v4

    const/16 v5, 0x64

    if-ne v4, v5, :cond_0

    const-string v7, "modifyRes"

    goto :goto_0

    :cond_0
    const-string v7, "noModifyRes"

    .line 49
    :goto_0
    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v7, " cost:"

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sub-long/2addr v7, v1

    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    if-eq v4, v5, :cond_2

    const/16 v0, 0xc8

    if-ne v4, v0, :cond_1

    goto :goto_1

    .line 50
    :cond_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 51
    sget-object v7, Lcom/bytedance/pangle/c/b;->f:Ljava/lang/String;

    sget v8, Lcom/bytedance/pangle/c/b$a;->B:I

    const-wide/16 v11, -0x1

    move-object/from16 v9, p1

    move/from16 v10, p2

    move-object v13, v0

    invoke-static/range {v7 .. v13}, Lcom/bytedance/pangle/plugin/b;->a(Ljava/lang/String;ILjava/lang/String;IJLjava/lang/String;)V

    .line 52
    sget-object v13, Lcom/bytedance/pangle/plugin/b;->a:Lcom/bytedance/pangle/i;

    const/16 v14, 0x44c

    const/4 v15, -0x2

    const/16 v18, 0x0

    move-object/from16 v16, p1

    move/from16 v17, p2

    invoke-virtual/range {v13 .. v18}, Lcom/bytedance/pangle/i;->a(IILjava/lang/String;ILjava/lang/Throwable;)V

    .line 53
    new-instance v1, Lcom/bytedance/pangle/plugin/b$a;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "modifyRes failed. result = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", errorLog = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, v6}, Lcom/bytedance/pangle/plugin/b$a;-><init>(Ljava/lang/String;B)V

    throw v1

    :cond_2
    :goto_1
    return-void
.end method

.method static a(Ljava/io/File;Ljava/lang/String;I)Z
    .locals 18

    move-object/from16 v8, p1

    move/from16 v9, p2

    const-string v10, "install"

    const-string v11, "Zeus/install_pangle"

    .line 1
    new-instance v12, Ljava/lang/StringBuffer;

    invoke-direct {v12}, Ljava/lang/StringBuffer;-><init>()V

    const-string/jumbo v0, "useOpt;"

    .line 2
    invoke-virtual {v12, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/4 v0, 0x1

    new-array v13, v0, [Z

    const/4 v14, 0x0

    aput-boolean v14, v13, v14

    .line 3
    :try_start_0
    sget-object v15, Lcom/bytedance/pangle/plugin/b;->a:Lcom/bytedance/pangle/i;

    const/16 v2, 0x3e8

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v1, v15

    move-object/from16 v4, p1

    move/from16 v5, p2

    invoke-virtual/range {v1 .. v6}, Lcom/bytedance/pangle/i;->a(IILjava/lang/String;ILjava/lang/Throwable;)V

    const-string v1, "PluginInstaller"

    const-string v2, "install:"

    .line 4
    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v11, v1, v2}, Lcom/bytedance/pangle/log/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/pangle/log/a;

    move-result-object v7

    .line 5
    sget-object v1, Lcom/bytedance/pangle/c/b;->e:Ljava/lang/String;

    sget v2, Lcom/bytedance/pangle/c/b$a;->r:I

    const-wide/16 v5, -0x1

    const/16 v16, 0x0

    move-object/from16 v3, p1

    move/from16 v4, p2

    move-object/from16 v17, v7

    move-object/from16 v7, v16

    invoke-static/range {v1 .. v7}, Lcom/bytedance/pangle/plugin/b;->a(Ljava/lang/String;ILjava/lang/String;IJLjava/lang/String;)V

    .line 6
    invoke-static {}, Lcom/bytedance/pangle/util/l;->a()Lcom/bytedance/pangle/util/l;

    move-result-object v1

    invoke-virtual {v1, v8, v9, v10}, Lcom/bytedance/pangle/util/l;->b(Ljava/lang/String;ILjava/lang/String;)I

    move-result v1

    .line 7
    invoke-static {}, Lcom/bytedance/pangle/util/l;->a()Lcom/bytedance/pangle/util/l;

    move-result-object v2

    const-string v3, "load"

    invoke-virtual {v2, v8, v9, v3}, Lcom/bytedance/pangle/util/l;->b(Ljava/lang/String;ILjava/lang/String;)I

    move-result v2

    .line 8
    invoke-static {}, Lcom/bytedance/pangle/GlobalParam;->getInstance()Lcom/bytedance/pangle/GlobalParam;

    move-result-object v3

    invoke-virtual {v3, v8}, Lcom/bytedance/pangle/GlobalParam;->getRemoveApkEntryFlag(Ljava/lang/String;)I

    move-result v3

    const/4 v4, 0x3

    if-gt v1, v4, :cond_0

    if-le v2, v4, :cond_1

    :cond_0
    move v3, v14

    .line 9
    :cond_1
    invoke-static {}, Lcom/bytedance/pangle/util/l;->a()Lcom/bytedance/pangle/util/l;

    move-result-object v1

    .line 10
    iget-object v1, v1, Lcom/bytedance/pangle/util/l;->a:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "remove_entry_flag_"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "_"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 12
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 13
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 14
    invoke-static {}, Lcom/bytedance/pangle/util/l;->a()Lcom/bytedance/pangle/util/l;

    move-result-object v1

    invoke-virtual {v1, v8, v9, v14}, Lcom/bytedance/pangle/util/l;->c(Ljava/lang/String;IZ)V

    .line 15
    invoke-static/range {p1 .. p2}, Lcom/bytedance/pangle/d/c;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/bytedance/pangle/util/g;->a(Ljava/lang/String;)V

    const/4 v1, 0x2

    new-array v7, v1, [Lcom/bytedance/pangle/a/a$a;

    .line 16
    new-instance v1, Lcom/bytedance/pangle/plugin/b$1;

    move-object/from16 v6, p0

    invoke-direct {v1, v6, v8, v9, v12}, Lcom/bytedance/pangle/plugin/b$1;-><init>(Ljava/io/File;Ljava/lang/String;ILjava/lang/StringBuffer;)V

    aput-object v1, v7, v14

    new-instance v16, Lcom/bytedance/pangle/plugin/b$2;

    move-object/from16 v1, v16

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move/from16 v4, p2

    move-object v5, v12

    move-object v6, v13

    invoke-direct/range {v1 .. v6}, Lcom/bytedance/pangle/plugin/b$2;-><init>(Ljava/io/File;Ljava/lang/String;ILjava/lang/StringBuffer;[Z)V

    aput-object v16, v7, v0

    invoke-static {v7}, Lcom/bytedance/pangle/a/a;->a([Lcom/bytedance/pangle/a/a$a;)V

    .line 17
    invoke-static/range {p0 .. p0}, Lcom/bytedance/pangle/util/g;->a(Ljava/io/File;)V

    .line 18
    sget-object v1, Lcom/bytedance/pangle/c/b;->f:Ljava/lang/String;

    sget v2, Lcom/bytedance/pangle/c/b$a;->s:I

    invoke-virtual/range {v17 .. v17}, Lcom/bytedance/pangle/log/a;->a()J

    move-result-wide v5

    invoke-virtual {v12}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v3, p1

    move/from16 v4, p2

    invoke-static/range {v1 .. v7}, Lcom/bytedance/pangle/plugin/b;->a(Ljava/lang/String;ILjava/lang/String;IJLjava/lang/String;)V

    const-string v1, "success"

    move-object/from16 v2, v17

    .line 19
    invoke-virtual {v2, v1}, Lcom/bytedance/pangle/log/a;->a(Ljava/lang/String;)J

    const/16 v2, 0x44c

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v1, v15

    move-object/from16 v4, p1

    move/from16 v5, p2

    .line 20
    invoke-virtual/range {v1 .. v6}, Lcom/bytedance/pangle/i;->a(IILjava/lang/String;ILjava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    :catchall_0
    move-exception v0

    .line 21
    instance-of v1, v0, Lcom/bytedance/pangle/plugin/b$a;

    const-string v2, "PluginInstaller "

    if-eqz v1, :cond_2

    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " install failed."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v1, v0}, Lcom/bytedance/pangle/log/ZeusLogger;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 23
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " install failed unknown error."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v1, v0}, Lcom/bytedance/pangle/log/ZeusLogger;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 24
    sget-object v1, Lcom/bytedance/pangle/c/b;->f:Ljava/lang/String;

    sget v2, Lcom/bytedance/pangle/c/b$a;->t:I

    const-wide/16 v5, -0x1

    invoke-virtual {v12}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v3, p1

    move/from16 v4, p2

    invoke-static/range {v1 .. v7}, Lcom/bytedance/pangle/plugin/b;->a(Ljava/lang/String;ILjava/lang/String;IJLjava/lang/String;)V

    .line 25
    sget-object v1, Lcom/bytedance/pangle/plugin/b;->a:Lcom/bytedance/pangle/i;

    const/16 v2, 0x44c

    const/4 v3, -0x1

    move-object/from16 v4, p1

    move/from16 v5, p2

    move-object v6, v0

    invoke-virtual/range {v1 .. v6}, Lcom/bytedance/pangle/i;->a(IILjava/lang/String;ILjava/lang/Throwable;)V

    :goto_0
    aget-boolean v0, v13, v14

    if-eqz v0, :cond_3

    .line 26
    invoke-static {}, Lcom/bytedance/pangle/util/l;->a()Lcom/bytedance/pangle/util/l;

    move-result-object v0

    invoke-virtual {v0, v8, v9, v10}, Lcom/bytedance/pangle/util/l;->a(Ljava/lang/String;ILjava/lang/String;)V

    :cond_3
    return v14
.end method

.method static synthetic a(Ljava/lang/String;IZLjava/lang/StringBuffer;)Z
    .locals 10

    .line 66
    invoke-static {}, Lcom/bytedance/pangle/util/l;->a()Lcom/bytedance/pangle/util/l;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/bytedance/pangle/util/l;->b(Ljava/lang/String;I)I

    move-result v0

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    move v6, v3

    goto :goto_1

    :cond_1
    move v6, v2

    :goto_1
    if-nez v1, :cond_2

    if-nez v6, :cond_2

    const-string p0, "removeEntry skip;"

    .line 67
    invoke-virtual {p3, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    return v2

    :cond_2
    if-eqz p2, :cond_3

    if-eqz v1, :cond_3

    move v5, v3

    goto :goto_2

    :cond_3
    move v5, v2

    .line 68
    :goto_2
    invoke-static {p0, p1}, Lcom/bytedance/pangle/d/c;->b(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    .line 69
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/4 v9, 0x1

    move-object v7, p0

    move v8, p1

    .line 70
    invoke-static/range {v4 .. v9}, Lcom/bytedance/pangle/util/b/b;->a(Ljava/lang/String;ZZLjava/lang/String;II)Z

    move-result p0

    const-string p1, "removeEntry cost:"

    .line 71
    invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    sub-long/2addr p1, v0

    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    const-string p1, ";"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    return p0
.end method

.method static synthetic b(Ljava/io/File;Ljava/lang/String;ILjava/lang/StringBuffer;)Ljava/util/Map;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/bytedance/pangle/plugin/b;->f(Ljava/io/File;Ljava/lang/String;ILjava/lang/StringBuffer;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c(Ljava/io/File;Ljava/lang/String;ILjava/lang/StringBuffer;)V
    .locals 14

    .line 1
    move-object/from16 v1, p3

    .line 2
    .line 3
    const-string v0, "The following permissions are declared in the plugin but not in the host: "

    .line 4
    .line 5
    const-string v2, ";"

    .line 6
    .line 7
    const-string v3, "checkPermissions cost:"

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    const/4 v6, 0x0

    .line 14
    :try_start_0
    invoke-static {}, Lcom/bytedance/pangle/Zeus;->getAppApplication()Landroid/app/Application;

    .line 15
    .line 16
    .line 17
    move-result-object v7

    .line 18
    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    invoke-static {}, Lcom/bytedance/pangle/Zeus;->getAppApplication()Landroid/app/Application;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v8

    .line 30
    const/16 v9, 0x1000

    .line 31
    .line 32
    invoke-virtual {v7, v8, v9}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    invoke-static {}, Lcom/bytedance/pangle/Zeus;->getAppApplication()Landroid/app/Application;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    invoke-virtual {v8}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v10

    .line 48
    invoke-virtual {v8, v10, v9}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    iget-object v7, v7, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    iget-object v9, v8, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 59
    .line 60
    if-eqz v9, :cond_3

    .line 61
    .line 62
    array-length v9, v9

    .line 63
    if-lez v9, :cond_3

    .line 64
    .line 65
    new-instance v9, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    iget-object v8, v8, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 71
    .line 72
    array-length v10, v8

    .line 73
    move v11, v6

    .line 74
    :goto_0
    if-ge v11, v10, :cond_1

    .line 75
    .line 76
    aget-object v12, v8, v11

    .line 77
    .line 78
    invoke-interface {v7, v12}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v13

    .line 82
    if-nez v13, :cond_0

    .line 83
    .line 84
    invoke-interface {v9, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    :cond_0
    add-int/lit8 v11, v11, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-nez v7, :cond_3

    .line 95
    .line 96
    const-string v7, "PluginInstaller"

    .line 97
    .line 98
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    invoke-virtual {v0, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    invoke-static {v7, v8}, Lcom/bytedance/pangle/log/ZeusLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-static {}, Lcom/bytedance/pangle/GlobalParam;->getInstance()Lcom/bytedance/pangle/GlobalParam;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    invoke-virtual {v7}, Lcom/bytedance/pangle/GlobalParam;->checkPermission()Z

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    if-nez v7, :cond_2

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_2
    new-instance v7, Lcom/bytedance/pangle/plugin/b$a;

    .line 121
    .line 122
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    invoke-virtual {v0, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-direct {v7, v0, v6}, Lcom/bytedance/pangle/plugin/b$a;-><init>(Ljava/lang/String;B)V

    .line 131
    .line 132
    .line 133
    throw v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    :cond_3
    :goto_1
    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 135
    .line 136
    .line 137
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 138
    .line 139
    .line 140
    move-result-wide v6

    .line 141
    sub-long/2addr v6, v4

    .line 142
    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :catchall_0
    move-exception v0

    .line 150
    goto :goto_2

    .line 151
    :catch_0
    move-exception v0

    .line 152
    :try_start_1
    sget-object v7, Lcom/bytedance/pangle/c/b;->f:Ljava/lang/String;

    .line 153
    .line 154
    sget v8, Lcom/bytedance/pangle/c/b$a;->v:I

    .line 155
    .line 156
    const-wide/16 v11, -0x1

    .line 157
    .line 158
    const/4 v13, 0x0

    .line 159
    move-object v9, p1

    .line 160
    move/from16 v10, p2

    .line 161
    .line 162
    invoke-static/range {v7 .. v13}, Lcom/bytedance/pangle/plugin/b;->a(Ljava/lang/String;ILjava/lang/String;IJLjava/lang/String;)V

    .line 163
    .line 164
    .line 165
    sget-object v8, Lcom/bytedance/pangle/plugin/b;->a:Lcom/bytedance/pangle/i;

    .line 166
    .line 167
    const/16 v9, 0x44c

    .line 168
    .line 169
    const/4 v10, -0x4

    .line 170
    move-object v11, p1

    .line 171
    move/from16 v12, p2

    .line 172
    .line 173
    move-object v13, v0

    .line 174
    invoke-virtual/range {v8 .. v13}, Lcom/bytedance/pangle/i;->a(IILjava/lang/String;ILjava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    new-instance v7, Lcom/bytedance/pangle/plugin/b$a;

    .line 178
    .line 179
    const-string/jumbo v8, "\u5b89\u88c5\u5305\u6743\u9650\u6821\u9a8c\u5931\u8d25"

    .line 180
    .line 181
    .line 182
    invoke-direct {v7, v8, v0, v6}, Lcom/bytedance/pangle/plugin/b$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    .line 183
    .line 184
    .line 185
    throw v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 186
    :goto_2
    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 187
    .line 188
    .line 189
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 190
    .line 191
    .line 192
    move-result-wide v6

    .line 193
    sub-long/2addr v6, v4

    .line 194
    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 198
    .line 199
    .line 200
    throw v0
    .line 201
    .line 202
    .line 203
    .line 204
.end method

.method static synthetic d(Ljava/io/File;Ljava/lang/String;ILjava/lang/StringBuffer;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/bytedance/pangle/plugin/b;->g(Ljava/io/File;Ljava/lang/String;ILjava/lang/StringBuffer;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e(Ljava/io/File;Ljava/lang/String;ILjava/lang/StringBuffer;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/bytedance/pangle/plugin/b;->h(Ljava/io/File;Ljava/lang/String;ILjava/lang/StringBuffer;)Z

    move-result p0

    return p0
.end method

.method private static f(Ljava/io/File;Ljava/lang/String;ILjava/lang/StringBuffer;)Ljava/util/Map;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/StringBuffer;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/util/zip/ZipEntry;",
            ">;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p3

    .line 2
    .line 3
    const-string/jumbo v2, "\u63d2\u4ef6\u5305\u5305\u542bso\u4e0d\u7b26\u5408\u5bbf\u4e3bABI\u7c7b\u578b"

    .line 4
    .line 5
    .line 6
    const-string v3, ";"

    .line 7
    .line 8
    const-string v4, "checkMatchHostAbi cost:"

    .line 9
    .line 10
    invoke-static {}, Lcom/bytedance/pangle/GlobalParam;->getInstance()Lcom/bytedance/pangle/GlobalParam;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/bytedance/pangle/GlobalParam;->checkMatchHostAbi()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v5

    .line 24
    const/4 v7, 0x0

    .line 25
    :try_start_0
    invoke-static {p0}, Lcom/bytedance/pangle/d/b;->a(Ljava/io/File;)Lcom/bytedance/pangle/util/e;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v8, v0, Lcom/bytedance/pangle/util/e;->a:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v8, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    iget-object v0, v0, Lcom/bytedance/pangle/util/e;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Ljava/util/Map;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    if-eqz v8, :cond_0

    .line 42
    .line 43
    invoke-virtual {v1, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 44
    .line 45
    .line 46
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 47
    .line 48
    .line 49
    move-result-wide v7

    .line 50
    sub-long/2addr v7, v5

    .line 51
    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_0
    :try_start_1
    new-instance v0, Lcom/bytedance/pangle/plugin/b$a;

    .line 59
    .line 60
    invoke-direct {v0, v2, v7}, Lcom/bytedance/pangle/plugin/b$a;-><init>(Ljava/lang/String;B)V

    .line 61
    .line 62
    .line 63
    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    goto :goto_0

    .line 66
    :catch_0
    move-exception v0

    .line 67
    :try_start_2
    sget-object v8, Lcom/bytedance/pangle/c/b;->f:Ljava/lang/String;

    .line 68
    .line 69
    sget v9, Lcom/bytedance/pangle/c/b$a;->A:I

    .line 70
    .line 71
    const-wide/16 v12, -0x1

    .line 72
    .line 73
    const/4 v14, 0x0

    .line 74
    move-object/from16 v10, p1

    .line 75
    .line 76
    move/from16 v11, p2

    .line 77
    .line 78
    invoke-static/range {v8 .. v14}, Lcom/bytedance/pangle/plugin/b;->a(Ljava/lang/String;ILjava/lang/String;IJLjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    sget-object v8, Lcom/bytedance/pangle/plugin/b;->a:Lcom/bytedance/pangle/i;

    .line 82
    .line 83
    const/16 v9, 0x44c

    .line 84
    .line 85
    const/4 v10, -0x5

    .line 86
    move-object/from16 v11, p1

    .line 87
    .line 88
    move/from16 v12, p2

    .line 89
    .line 90
    move-object v13, v0

    .line 91
    invoke-virtual/range {v8 .. v13}, Lcom/bytedance/pangle/i;->a(IILjava/lang/String;ILjava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    new-instance v8, Lcom/bytedance/pangle/plugin/b$a;

    .line 95
    .line 96
    invoke-direct {v8, v2, v0, v7}, Lcom/bytedance/pangle/plugin/b$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    .line 97
    .line 98
    .line 99
    throw v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 100
    :goto_0
    invoke-virtual {v1, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 101
    .line 102
    .line 103
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 104
    .line 105
    .line 106
    move-result-wide v7

    .line 107
    sub-long/2addr v7, v5

    .line 108
    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 112
    .line 113
    .line 114
    throw v0

    .line 115
    :cond_1
    const/4 v0, 0x0

    .line 116
    return-object v0
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
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
.end method

.method private static g(Ljava/io/File;Ljava/lang/String;ILjava/lang/StringBuffer;)Ljava/lang/String;
    .locals 11

    .line 1
    const-string v0, ";"

    .line 2
    .line 3
    const-string v1, "copyApk cost:"

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    invoke-static {p1, p2}, Lcom/bytedance/pangle/d/c;->b(Ljava/lang/String;I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0, v4}, Lcom/bytedance/pangle/util/h;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 21
    .line 22
    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide p0

    .line 27
    sub-long/2addr p0, v2

    .line 28
    invoke-virtual {p3, p0, p1}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 32
    .line 33
    .line 34
    return-object v4

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_0

    .line 37
    :catch_0
    move-exception p0

    .line 38
    :try_start_1
    sget-object v4, Lcom/bytedance/pangle/c/b;->f:Ljava/lang/String;

    .line 39
    .line 40
    sget v5, Lcom/bytedance/pangle/c/b$a;->w:I

    .line 41
    .line 42
    const-wide/16 v8, -0x1

    .line 43
    .line 44
    const/4 v10, 0x0

    .line 45
    move-object v6, p1

    .line 46
    move v7, p2

    .line 47
    invoke-static/range {v4 .. v10}, Lcom/bytedance/pangle/plugin/b;->a(Ljava/lang/String;ILjava/lang/String;IJLjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    sget-object v4, Lcom/bytedance/pangle/plugin/b;->a:Lcom/bytedance/pangle/i;

    .line 51
    .line 52
    const/16 v5, 0x44c

    .line 53
    .line 54
    const/4 v6, -0x6

    .line 55
    move-object v7, p1

    .line 56
    move v8, p2

    .line 57
    move-object v9, p0

    .line 58
    invoke-virtual/range {v4 .. v9}, Lcom/bytedance/pangle/i;->a(IILjava/lang/String;ILjava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    new-instance p1, Lcom/bytedance/pangle/plugin/b$a;

    .line 62
    .line 63
    const-string/jumbo p2, "\u5b89\u88c5\u5305\u62f7\u8d1d\u5931\u8d25"

    .line 64
    .line 65
    .line 66
    const/4 v4, 0x0

    .line 67
    invoke-direct {p1, p2, p0, v4}, Lcom/bytedance/pangle/plugin/b$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    .line 68
    .line 69
    .line 70
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    :goto_0
    invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 72
    .line 73
    .line 74
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 75
    .line 76
    .line 77
    move-result-wide p1

    .line 78
    sub-long/2addr p1, v2

    .line 79
    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 83
    .line 84
    .line 85
    throw p0
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
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
.end method

.method private static h(Ljava/io/File;Ljava/lang/String;ILjava/lang/StringBuffer;)Z
    .locals 21

    .line 1
    move-object/from16 v3, p1

    .line 2
    .line 3
    move/from16 v4, p2

    .line 4
    .line 5
    move-object/from16 v8, p3

    .line 6
    .line 7
    const-string v1, ".dex"

    .line 8
    .line 9
    const-string v2, "classes"

    .line 10
    .line 11
    const-string v5, "Zeus/install_pangle"

    .line 12
    .line 13
    const-string v9, ";"

    .line 14
    .line 15
    const-string v10, "dexOpt1 cost:"

    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v11

    .line 21
    :try_start_0
    invoke-static {}, Lcom/bytedance/pangle/util/i;->b()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v6, 0x1

    .line 26
    if-eqz v0, :cond_8

    .line 27
    .line 28
    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->exists()Z

    .line 29
    .line 30
    .line 31
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 32
    if-eqz v0, :cond_7

    .line 33
    .line 34
    if-eqz v3, :cond_7

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    :try_start_1
    new-instance v14, Ljava/util/zip/ZipFile;

    .line 38
    .line 39
    move-object/from16 v15, p0

    .line 40
    .line 41
    invoke-direct {v14, v15}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 42
    .line 43
    .line 44
    :try_start_2
    new-instance v7, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-static/range {p1 .. p2}, Lcom/bytedance/pangle/d/c;->i(Ljava/lang/String;I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    new-instance v13, Ljava/io/File;

    .line 54
    .line 55
    invoke-direct {v13, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v13}, Lcom/bytedance/pangle/e/g;->a(Ljava/io/File;)V

    .line 59
    .line 60
    .line 61
    move v15, v6

    .line 62
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 65
    .line 66
    .line 67
    const-string v16, ""

    .line 68
    .line 69
    if-ne v15, v6, :cond_0

    .line 70
    .line 71
    move-object/from16 v6, v16

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_0
    :try_start_3
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v17

    .line 78
    move-object/from16 v6, v17

    .line 79
    .line 80
    :goto_1
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v14, v0}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    if-eqz v6, :cond_6

    .line 95
    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 102
    .line 103
    .line 104
    move-object/from16 v17, v9

    .line 105
    .line 106
    const/4 v9, 0x1

    .line 107
    if-ne v15, v9, :cond_1

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_1
    :try_start_4
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v16

    .line 114
    :goto_2
    move-object/from16 v9, v16

    .line 115
    .line 116
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    new-instance v9, Lcom/bytedance/pangle/e/g$a;

    .line 127
    .line 128
    invoke-direct {v9, v13, v0}, Lcom/bytedance/pangle/e/g$a;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 129
    .line 130
    .line 131
    move-object/from16 v16, v1

    .line 132
    .line 133
    const/4 v1, 0x0

    .line 134
    const/16 v18, 0x0

    .line 135
    .line 136
    :goto_3
    const/4 v0, 0x3

    .line 137
    if-ge v1, v0, :cond_4

    .line 138
    .line 139
    if-nez v18, :cond_4

    .line 140
    .line 141
    :try_start_5
    invoke-static {v14, v6, v9, v2}, Lcom/bytedance/pangle/e/g;->a(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;Lcom/bytedance/pangle/e/g$a;Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 142
    .line 143
    .line 144
    move-object/from16 v19, v2

    .line 145
    .line 146
    move-object/from16 v20, v6

    .line 147
    .line 148
    const/16 v18, 0x1

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :catch_0
    move-exception v0

    .line 152
    move-object/from16 v19, v2

    .line 153
    .line 154
    move-object v2, v0

    .line 155
    :try_start_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    move-object/from16 v20, v6

    .line 158
    .line 159
    const-string v6, "Plugin-MultiDex Failed to extract entry from "

    .line 160
    .line 161
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-static {v5, v0, v2}, Lcom/bytedance/pangle/log/ZeusLogger;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 176
    .line 177
    .line 178
    :goto_4
    add-int/lit8 v1, v1, 0x1

    .line 179
    .line 180
    new-instance v0, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    const-string v2, "Plugin-MultiDex Extraction "

    .line 183
    .line 184
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    if-eqz v18, :cond_2

    .line 188
    .line 189
    const-string v2, "succeeded"

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_2
    const-string v2, "failed"

    .line 193
    .line 194
    :goto_5
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    const-string v2, " \'"

    .line 198
    .line 199
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    const-string v2, "\': length "

    .line 210
    .line 211
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    move v6, v1

    .line 215
    invoke-virtual {v9}, Ljava/io/File;->length()J

    .line 216
    .line 217
    .line 218
    move-result-wide v1

    .line 219
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-static {v5, v0}, Lcom/bytedance/pangle/log/ZeusLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    if-nez v18, :cond_3

    .line 230
    .line 231
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    .line 232
    .line 233
    .line 234
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-eqz v0, :cond_3

    .line 239
    .line 240
    new-instance v0, Ljava/lang/StringBuilder;

    .line 241
    .line 242
    const-string v1, "Plugin-MultiDex Failed to delete corrupted secondary dex \'"

    .line 243
    .line 244
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v9}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    const-string v1, "\'"

    .line 255
    .line 256
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-static {v5, v0}, Lcom/bytedance/pangle/log/ZeusLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    :cond_3
    move v1, v6

    .line 267
    move-object/from16 v2, v19

    .line 268
    .line 269
    move-object/from16 v6, v20

    .line 270
    .line 271
    goto/16 :goto_3

    .line 272
    .line 273
    :cond_4
    move-object/from16 v19, v2

    .line 274
    .line 275
    if-eqz v18, :cond_5

    .line 276
    .line 277
    invoke-interface {v7, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    add-int/lit8 v15, v15, 0x1

    .line 281
    .line 282
    move-object/from16 v1, v16

    .line 283
    .line 284
    move-object/from16 v9, v17

    .line 285
    .line 286
    move-object/from16 v2, v19

    .line 287
    .line 288
    const/4 v6, 0x1

    .line 289
    goto/16 :goto_0

    .line 290
    .line 291
    :cond_5
    new-instance v0, Ljava/io/IOException;

    .line 292
    .line 293
    new-instance v1, Ljava/lang/StringBuilder;

    .line 294
    .line 295
    const-string v2, "Could not create zip file "

    .line 296
    .line 297
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    const-string v2, " for secondary dex ("

    .line 308
    .line 309
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    const-string v2, ")"

    .line 316
    .line 317
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    throw v0

    .line 328
    :cond_6
    move-object/from16 v17, v9

    .line 329
    .line 330
    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    new-instance v0, Ljava/lang/StringBuilder;

    .line 334
    .line 335
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    const-string v1, "-"

    .line 342
    .line 343
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-static {}, Lcom/bytedance/pangle/e/g;->a()Landroid/content/SharedPreferences;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    new-instance v2, Ljava/lang/StringBuilder;

    .line 362
    .line 363
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    const-string v0, ".dex.number"

    .line 370
    .line 371
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 379
    .line 380
    .line 381
    move-result v2

    .line 382
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 383
    .line 384
    .line 385
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 386
    .line 387
    .line 388
    :try_start_7
    invoke-static {v14}, Lcom/bytedance/pangle/util/g;->a(Ljava/util/zip/ZipFile;)V

    .line 389
    .line 390
    .line 391
    invoke-static {}, Lcom/bytedance/pangle/Zeus;->getAppApplication()Landroid/app/Application;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-static {v0}, Lcom/bytedance/pangle/e/b;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 408
    .line 409
    .line 410
    invoke-static {}, Lcom/bytedance/pangle/e/f;->a()V

    .line 411
    .line 412
    .line 413
    goto/16 :goto_8

    .line 414
    .line 415
    :catchall_0
    move-exception v0

    .line 416
    goto :goto_6

    .line 417
    :catchall_1
    move-exception v0

    .line 418
    move-object/from16 v17, v9

    .line 419
    .line 420
    :goto_6
    move-object v7, v14

    .line 421
    goto :goto_7

    .line 422
    :catchall_2
    move-exception v0

    .line 423
    move-object/from16 v17, v9

    .line 424
    .line 425
    :goto_7
    invoke-static {v7}, Lcom/bytedance/pangle/util/g;->a(Ljava/util/zip/ZipFile;)V

    .line 426
    .line 427
    .line 428
    throw v0

    .line 429
    :cond_7
    move-object/from16 v17, v9

    .line 430
    .line 431
    new-instance v0, Ljava/io/IOException;

    .line 432
    .line 433
    new-instance v1, Ljava/lang/StringBuilder;

    .line 434
    .line 435
    const-string v2, "Could not check apk info "

    .line 436
    .line 437
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v2

    .line 444
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    throw v0

    .line 455
    :cond_8
    move-object/from16 v17, v9

    .line 456
    .line 457
    invoke-static {}, Lcom/bytedance/pangle/util/i;->f()Z

    .line 458
    .line 459
    .line 460
    move-result v0

    .line 461
    if-eqz v0, :cond_9

    .line 462
    .line 463
    invoke-static/range {p1 .. p2}, Lcom/bytedance/pangle/d/c;->c(Ljava/lang/String;I)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    invoke-static/range {p1 .. p2}, Lcom/bytedance/pangle/d/c;->b(Ljava/lang/String;I)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    new-instance v2, Ljava/lang/StringBuilder;

    .line 472
    .line 473
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    sget-object v5, Ljava/io/File;->separator:Ljava/lang/String;

    .line 480
    .line 481
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    invoke-static {v1}, Lcom/bytedance/pangle/e/b;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v6

    .line 488
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    new-instance v6, Ljava/lang/StringBuilder;

    .line 496
    .line 497
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    .line 505
    .line 506
    invoke-static {v1}, Lcom/bytedance/pangle/e/b;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    invoke-static {v1, v0}, Lcom/bytedance/pangle/e/b;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 518
    .line 519
    .line 520
    move-result v0

    .line 521
    if-eqz v0, :cond_9

    .line 522
    .line 523
    const/4 v1, 0x1

    .line 524
    new-array v0, v1, [Ljava/lang/String;

    .line 525
    .line 526
    const/4 v1, 0x0

    .line 527
    aput-object v2, v0, v1

    .line 528
    .line 529
    invoke-static {v0}, Lcom/bytedance/pangle/e/b;->a([Ljava/lang/String;)Z

    .line 530
    .line 531
    .line 532
    move-result v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 533
    if-eqz v0, :cond_9

    .line 534
    .line 535
    invoke-virtual {v8, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 536
    .line 537
    .line 538
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 539
    .line 540
    .line 541
    move-result-wide v0

    .line 542
    sub-long/2addr v0, v11

    .line 543
    invoke-virtual {v8, v0, v1}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 544
    .line 545
    .line 546
    move-object/from16 v9, v17

    .line 547
    .line 548
    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 549
    .line 550
    .line 551
    const/4 v1, 0x1

    .line 552
    return v1

    .line 553
    :cond_9
    :goto_8
    move-object/from16 v9, v17

    .line 554
    .line 555
    invoke-virtual {v8, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 556
    .line 557
    .line 558
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 559
    .line 560
    .line 561
    move-result-wide v0

    .line 562
    sub-long/2addr v0, v11

    .line 563
    invoke-virtual {v8, v0, v1}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 567
    .line 568
    .line 569
    const/4 v1, 0x0

    .line 570
    return v1

    .line 571
    :catchall_3
    move-exception v0

    .line 572
    move-object/from16 v9, v17

    .line 573
    .line 574
    goto :goto_a

    .line 575
    :catch_1
    move-exception v0

    .line 576
    move-object/from16 v9, v17

    .line 577
    .line 578
    goto :goto_9

    .line 579
    :catchall_4
    move-exception v0

    .line 580
    goto :goto_a

    .line 581
    :catch_2
    move-exception v0

    .line 582
    :goto_9
    :try_start_8
    sget-object v1, Lcom/bytedance/pangle/c/b;->f:Ljava/lang/String;

    .line 583
    .line 584
    sget v2, Lcom/bytedance/pangle/c/b$a;->z:I

    .line 585
    .line 586
    const-wide/16 v5, -0x1

    .line 587
    .line 588
    const/4 v7, 0x0

    .line 589
    move-object/from16 v3, p1

    .line 590
    .line 591
    move/from16 v4, p2

    .line 592
    .line 593
    invoke-static/range {v1 .. v7}, Lcom/bytedance/pangle/plugin/b;->a(Ljava/lang/String;ILjava/lang/String;IJLjava/lang/String;)V

    .line 594
    .line 595
    .line 596
    new-instance v1, Lcom/bytedance/pangle/plugin/b$a;

    .line 597
    .line 598
    const-string v2, "dexOpt1\u5931\u8d25"

    .line 599
    .line 600
    const/4 v3, 0x0

    .line 601
    invoke-direct {v1, v2, v0, v3}, Lcom/bytedance/pangle/plugin/b$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    .line 602
    .line 603
    .line 604
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 605
    :goto_a
    invoke-virtual {v8, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 606
    .line 607
    .line 608
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 609
    .line 610
    .line 611
    move-result-wide v1

    .line 612
    sub-long/2addr v1, v11

    .line 613
    invoke-virtual {v8, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 614
    .line 615
    .line 616
    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 617
    .line 618
    .line 619
    throw v0
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
