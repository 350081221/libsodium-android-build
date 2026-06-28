.class public Lcom/huawei/agconnect/apms/x1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final abc:Lcom/huawei/agconnect/apms/log/AgentLog;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/x1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public static abc()Ljava/lang/String;
    .locals 10

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    .line 13
    :goto_0
    array-length v5, v1

    if-ge v3, v5, :cond_6

    .line 14
    aget-object v5, v1, v3

    if-nez v5, :cond_0

    goto :goto_3

    .line 15
    :cond_0
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v6

    .line 16
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v7

    const-string v8, "com.huawei.agconnect.apms"

    .line 17
    invoke-virtual {v6, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    const/4 v9, 0x1

    if-eqz v8, :cond_1

    goto :goto_1

    :cond_1
    const-string v8, "dalvik.system.VMStack"

    .line 18
    invoke-virtual {v6, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    const-string v8, "getThreadStackTrace"

    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_1

    :cond_2
    const-string v8, "java.lang.Thread"

    .line 19
    invoke-virtual {v6, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    const-string v6, "getStackTrace"

    invoke-virtual {v7, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_1
    move v6, v9

    goto :goto_2

    :cond_3
    move v6, v2

    :goto_2
    if-nez v6, :cond_5

    .line 20
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    array-length v5, v1

    sub-int/2addr v5, v9

    if-gt v3, v5, :cond_4

    const-string v5, "\n"

    .line 22
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 23
    invoke-static {}, Lcom/huawei/agconnect/apms/uvw;->bcd()Lcom/huawei/agconnect/apms/wxy;

    move-result-object v5

    .line 24
    iget v5, v5, Lcom/huawei/agconnect/apms/wxy;->def:I

    if-lt v4, v5, :cond_5

    goto :goto_4

    :cond_5
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 25
    :cond_6
    :goto_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static abc(IIC)Ljava/lang/String;
    .locals 3

    .line 179
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    .line 180
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-lt v0, p1, :cond_0

    .line 181
    invoke-virtual {p0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 182
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 183
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    sub-int v2, p1, v2

    if-ge v1, v2, :cond_1

    .line 184
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 185
    :cond_1
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static abc(Landroid/content/Context;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-string v0, ""

    if-nez p0, :cond_0

    return-object v0

    .line 44
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 45
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/4 v2, 0x0

    invoke-virtual {v1, p0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    .line 46
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    .line 47
    :catchall_0
    sget-object p0, Lcom/huawei/agconnect/apms/x1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v1, "getVersionName fail"

    invoke-interface {p0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    return-object v0
.end method

.method public static abc(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 1
    :cond_0
    :try_start_0
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 3
    invoke-virtual {v1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "://"

    .line 4
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-virtual {v1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    invoke-virtual {v1}, Ljava/net/URL;->getPort()I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    const-string v0, ":"

    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    invoke-virtual {v1}, Ljava/net/URL;->getPort()I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 9
    :cond_1
    invoke-virtual {v1}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :catchall_0
    return-object v0
.end method

.method public static abc(Ljava/lang/String;Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 1

    .line 48
    invoke-virtual {p0, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    const-string v0, ""

    if-eqz p2, :cond_1

    .line 49
    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    if-eqz p0, :cond_0

    .line 50
    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    const/4 p0, 0x0

    .line 51
    invoke-virtual {p1, p0}, Ljava/lang/StringBuffer;->setLength(I)V

    goto :goto_0

    .line 52
    :cond_1
    invoke-virtual {p0, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-virtual {p1}, Ljava/lang/StringBuffer;->length()I

    move-result p2

    if-gt p2, p4, :cond_2

    .line 53
    invoke-static {p0}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_2
    :goto_0
    return-object v0
.end method

.method public static abc(Ljava/util/Map$Entry;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 26
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 27
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-nez v0, :cond_0

    const-string p0, "property key is null"

    return-object p0

    :cond_0
    if-nez p0, :cond_1

    const-string p0, "property value is null"

    return-object p0

    .line 28
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 29
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 30
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/16 v4, 0x28

    if-le v1, v4, :cond_2

    .line 31
    sget-object p0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    new-array v0, v3, [Ljava/lang/Object;

    .line 32
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    const-string v1, "property key length exceeds %d characters"

    .line 33
    invoke-static {p0, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 34
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    const/16 v1, 0x64

    if-le p0, v1, :cond_3

    .line 35
    sget-object p0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    new-array v0, v3, [Ljava/lang/Object;

    .line 36
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    const-string v1, "property value length exceeds %d characters"

    .line 37
    invoke-static {p0, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    const-string p0, "^[\\u4e00-\\u9fa5_a-zA-Z0-9]+$"

    .line 38
    invoke-virtual {v0, p0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_4

    const-string p0, "property name contains special characters"

    return-object p0

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static abc(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 39
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 40
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result p0

    const/4 p1, 0x5

    if-lt p0, p1, :cond_0

    .line 41
    sget-object p0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    .line 42
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "exceeds max limit number of properties - %d"

    .line 43
    invoke-static {p0, p1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static abc(Ljava/util/List;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/huawei/agconnect/apms/tuv;",
            ">;"
        }
    .end annotation

    .line 54
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p0, :cond_5

    .line 55
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_5

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    .line 56
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_5

    .line 57
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "##"

    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 58
    array-length v5, v4

    if-lez v5, :cond_4

    aget-object v5, v4, v1

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_4

    aget-object v5, v4, v1

    const-string v6, "not attached"

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_4

    .line 59
    new-instance v5, Lcom/huawei/agconnect/apms/tuv;

    invoke-direct {v5}, Lcom/huawei/agconnect/apms/tuv;-><init>()V

    .line 60
    aget-object v6, v4, v1

    const-string v7, "\""

    invoke-virtual {v6, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    .line 61
    aget-object v8, v4, v1

    invoke-virtual {v8, v7}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v7

    .line 62
    aget-object v8, v4, v1

    const-string v9, "prio="

    invoke-virtual {v8, v9}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v8

    .line 63
    aget-object v9, v4, v1

    const-string v10, "tid="

    invoke-virtual {v9, v10}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v9

    .line 64
    aget-object v10, v4, v1

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    if-ltz v6, :cond_0

    if-lez v7, :cond_0

    add-int/lit8 v6, v6, 0x1

    .line 65
    invoke-static {v6, v7, v10}, Lcom/huawei/agconnect/apms/x1;->abc(III)Z

    move-result v11

    if-eqz v11, :cond_0

    .line 66
    aget-object v11, v4, v1

    invoke-virtual {v11, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 67
    iput-object v6, v5, Lcom/huawei/agconnect/apms/tuv;->abc:Ljava/lang/String;

    :cond_0
    if-ltz v8, :cond_1

    if-lez v9, :cond_1

    add-int/lit8 v8, v8, 0x5

    add-int/lit8 v6, v9, -0x1

    .line 68
    invoke-static {v8, v6, v10}, Lcom/huawei/agconnect/apms/x1;->abc(III)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 69
    aget-object v7, v4, v1

    invoke-virtual {v7, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 70
    invoke-static {v6}, Lcom/huawei/agconnect/apms/x1;->bcd(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 71
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 72
    iput v6, v5, Lcom/huawei/agconnect/apms/tuv;->cde:I

    :cond_1
    if-lez v9, :cond_2

    if-gt v9, v10, :cond_2

    .line 73
    aget-object v4, v4, v1

    invoke-virtual {v4, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    const-string v6, " "

    invoke-virtual {v4, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 74
    array-length v6, v4

    const/4 v7, 0x1

    if-le v6, v7, :cond_2

    .line 75
    aget-object v4, v4, v7

    .line 76
    iput-object v4, v5, Lcom/huawei/agconnect/apms/tuv;->def:Ljava/lang/String;

    .line 77
    :cond_2
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 78
    iput-object v4, v5, Lcom/huawei/agconnect/apms/tuv;->bcd:Ljava/lang/String;

    .line 79
    invoke-virtual {v5}, Lcom/huawei/agconnect/apms/tuv;->asJsonArray()Lorg/json/JSONArray;

    invoke-virtual {v5}, Lcom/huawei/agconnect/apms/tuv;->asJsonArray()Lorg/json/JSONArray;

    move-result-object v4

    invoke-virtual {v4}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 80
    invoke-virtual {v5}, Lcom/huawei/agconnect/apms/tuv;->asJsonArray()Lorg/json/JSONArray;

    move-result-object v4

    invoke-virtual {v4}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v4, v3

    move v3, v4

    :cond_3
    const v4, 0x16800

    if-gt v3, v4, :cond_4

    .line 81
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_5
    return-object v0
.end method

.method public static abc(Landroid/content/Context;Ljava/lang/String;)V
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v3, "memory info"

    const-string v4, "readFileByLines"

    .line 120
    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 121
    sget-object v0, Lcom/huawei/agconnect/apms/x1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v1, "filepath is empty!"

    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    return-void

    .line 122
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 123
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v5

    if-eqz v5, :cond_13

    .line 124
    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_12

    .line 125
    array-length v0, v5

    if-lez v0, :cond_12

    .line 126
    sget-object v0, Lcom/huawei/agconnect/apms/x1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v6, "readNativeAnrAllFile fileList not empty!"

    invoke-interface {v0, v6}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    const/4 v7, 0x0

    .line 127
    :goto_0
    array-length v0, v5

    if-ge v7, v0, :cond_13

    .line 128
    new-instance v8, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "/"

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v10, v5, v7

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 129
    invoke-virtual {v8}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_10

    .line 130
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v9, v5, v7

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 131
    new-instance v9, Ljava/io/File;

    invoke-direct {v9, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 132
    :try_start_0
    new-instance v11, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/InputStreamReader;

    new-instance v12, Ljava/io/FileInputStream;

    invoke-direct {v12, v9}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 133
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v9

    invoke-direct {v0, v12, v9}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v11, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 134
    :try_start_1
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 135
    new-instance v9, Lcom/huawei/agconnect/apms/stu;

    invoke-direct {v9}, Lcom/huawei/agconnect/apms/stu;-><init>()V

    .line 136
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    const-string v13, ""

    move-object v10, v13

    move-object v14, v10

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    .line 137
    :goto_1
    :try_start_2
    invoke-virtual {v11}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_b

    .line 138
    invoke-static {v9, v6}, Lcom/huawei/agconnect/apms/x1;->abc(Lcom/huawei/agconnect/apms/stu;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    move-object/from16 v20, v5

    const-string v5, "Cmd line"

    if-eqz v15, :cond_1

    .line 139
    :try_start_3
    invoke-virtual {v6, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v21
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v21, :cond_1

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v21, 0x0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_1
    move/from16 v21, v15

    :goto_2
    const-string v15, "DALVIK THREADS"

    if-eqz v16, :cond_3

    .line 140
    :try_start_4
    invoke-virtual {v6, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v16, 0x0

    const/16 v17, 0x1

    :cond_2
    const/16 v10, 0x7800

    .line 141
    invoke-static {v6, v0, v15, v5, v10}, Lcom/huawei/agconnect/apms/x1;->abc(Ljava/lang/String;Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v10
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_3
    const-string v5, "+++"

    if-eqz v17, :cond_8

    .line 142
    :try_start_5
    invoke-virtual {v6, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v22

    if-eqz v22, :cond_4

    const/16 v17, 0x0

    const/16 v18, 0x1

    .line 143
    :cond_4
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v22

    if-nez v22, :cond_6

    .line 144
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v15

    if-eqz v15, :cond_5

    .line 145
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-interface {v12, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_5
    const/4 v15, 0x0

    .line 146
    :try_start_6
    invoke-virtual {v0, v15}, Ljava/lang/StringBuffer;->setLength(I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    move-object/from16 v22, v10

    move/from16 v19, v15

    goto :goto_3

    :catchall_1
    move-exception v0

    move/from16 v19, v15

    goto/16 :goto_6

    :cond_6
    const/16 v19, 0x0

    .line 147
    :try_start_7
    invoke-virtual {v6, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v15

    if-nez v15, :cond_7

    invoke-virtual {v6, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v15

    if-nez v15, :cond_7

    .line 148
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v22, v10

    const-string v10, "##"

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_3

    :cond_7
    move-object/from16 v22, v10

    goto :goto_3

    :cond_8
    move-object/from16 v22, v10

    const/16 v19, 0x0

    :goto_3
    if-eqz v18, :cond_a

    .line 149
    invoke-virtual {v6, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_9

    move/from16 v18, v19

    :cond_9
    const v10, 0x14000

    .line 150
    invoke-static {v6, v0, v3, v5, v10}, Lcom/huawei/agconnect/apms/x1;->abc(Ljava/lang/String;Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v14

    :cond_a
    move-object/from16 v5, v20

    move/from16 v15, v21

    move-object/from16 v10, v22

    goto/16 :goto_1

    :cond_b
    move-object/from16 v20, v5

    const/16 v19, 0x0

    .line 151
    invoke-static {v12}, Lcom/huawei/agconnect/apms/x1;->abc(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 152
    new-instance v5, Lcom/huawei/agconnect/apms/rst;

    invoke-direct {v5}, Lcom/huawei/agconnect/apms/rst;-><init>()V

    .line 153
    iput-object v10, v5, Lcom/huawei/agconnect/apms/rst;->def:Ljava/lang/String;

    .line 154
    iput-object v13, v5, Lcom/huawei/agconnect/apms/rst;->bcd:Ljava/lang/String;

    .line 155
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_c

    .line 156
    iput-object v13, v5, Lcom/huawei/agconnect/apms/rst;->bcd:Ljava/lang/String;

    .line 157
    :cond_c
    iput-object v9, v5, Lcom/huawei/agconnect/apms/rst;->efg:Lcom/huawei/agconnect/apms/stu;

    .line 158
    iput-object v0, v5, Lcom/huawei/agconnect/apms/rst;->cde:Ljava/util/List;

    .line 159
    invoke-static {}, Lcom/huawei/secure/android/common/detect/c;->h()Z

    move-result v0

    .line 160
    iput-boolean v0, v5, Lcom/huawei/agconnect/apms/rst;->abc:Z

    .line 161
    iput-object v14, v5, Lcom/huawei/agconnect/apms/rst;->ghi:Ljava/lang/String;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 162
    :try_start_8
    invoke-virtual {v11}, Ljava/io/BufferedReader;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    goto :goto_4

    .line 163
    :catch_0
    sget-object v0, Lcom/huawei/agconnect/apms/x1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    invoke-interface {v0, v4}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    :goto_4
    move-object v10, v5

    goto :goto_8

    :catchall_2
    move-exception v0

    goto :goto_6

    :catchall_3
    move-exception v0

    move-object/from16 v20, v5

    :goto_5
    const/16 v19, 0x0

    goto :goto_6

    :catchall_4
    move-exception v0

    move-object/from16 v20, v5

    const/16 v19, 0x0

    const/4 v11, 0x0

    .line 164
    :goto_6
    :try_start_9
    sget-object v5, Lcom/huawei/agconnect/apms/x1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "readFileByLines:"

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    if-eqz v11, :cond_d

    .line 165
    :try_start_a
    invoke-virtual {v11}, Ljava/io/BufferedReader;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_1

    goto :goto_7

    .line 166
    :catch_1
    sget-object v0, Lcom/huawei/agconnect/apms/x1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    invoke-interface {v0, v4}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    :cond_d
    :goto_7
    const/4 v10, 0x0

    :goto_8
    if-eqz v10, :cond_11

    .line 167
    new-instance v0, Lcom/huawei/agconnect/apms/qrs;

    invoke-direct {v0, v10}, Lcom/huawei/agconnect/apms/qrs;-><init>(Lcom/huawei/agconnect/apms/rst;)V

    .line 168
    sget-object v5, Lcom/huawei/agconnect/apms/klm;->efg:Lcom/huawei/agconnect/apms/pqr;

    .line 169
    invoke-virtual {v5, v1, v0}, Lcom/huawei/agconnect/apms/pqr;->abc(Landroid/content/Context;Lcom/huawei/agconnect/apms/qrs;)V

    .line 170
    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 171
    sget-object v0, Lcom/huawei/agconnect/apms/x1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v5, "readFile delete success!"

    invoke-interface {v0, v5}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    goto :goto_a

    .line 172
    :cond_e
    sget-object v0, Lcom/huawei/agconnect/apms/x1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v5, "readFile delete failed!"

    invoke-interface {v0, v5}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    goto :goto_a

    :catchall_5
    move-exception v0

    if-eqz v11, :cond_f

    .line 173
    :try_start_b
    invoke-virtual {v11}, Ljava/io/BufferedReader;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_2

    goto :goto_9

    .line 174
    :catch_2
    sget-object v1, Lcom/huawei/agconnect/apms/x1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    invoke-interface {v1, v4}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 175
    :cond_f
    :goto_9
    throw v0

    :cond_10
    move-object/from16 v20, v5

    const/16 v19, 0x0

    .line 176
    invoke-virtual {v8}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 177
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v5, v20, v7

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/x1;->abc(Landroid/content/Context;Ljava/lang/String;)V

    :cond_11
    :goto_a
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v5, v20

    goto/16 :goto_0

    .line 178
    :cond_12
    sget-object v0, Lcom/huawei/agconnect/apms/x1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v1, "readNativeAnrAllFile fileList is empty!"

    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    :cond_13
    return-void
.end method

.method public static abc(Lcom/huawei/agconnect/apms/stu;Ljava/lang/String;)V
    .locals 11

    const-string v0, "Free memory"

    const-string v1, "Total memory"

    const-string v2, "Max memory"

    .line 82
    :try_start_0
    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    const-wide/16 v4, 0x400

    if-eqz v3, :cond_0

    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    add-int/lit8 v3, v3, 0xb

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, -0x2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v7

    invoke-static {v3, v6, v7}, Lcom/huawei/agconnect/apms/x1;->abc(III)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 83
    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    add-int/lit8 v2, v2, 0xb

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x2

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 84
    invoke-static {v2}, Lcom/huawei/agconnect/apms/x1;->bcd(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 85
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    mul-long/2addr v2, v4

    mul-long/2addr v2, v4

    .line 86
    iput-wide v2, p0, Lcom/huawei/agconnect/apms/stu;->abc:J

    .line 87
    :cond_0
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    const-wide/16 v6, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    add-int/lit8 v2, v2, 0xd

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v8

    invoke-static {v2, v3, v8}, Lcom/huawei/agconnect/apms/x1;->abc(III)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 88
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0xd

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x2

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 89
    invoke-static {v1}, Lcom/huawei/agconnect/apms/x1;->bcd(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 90
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    mul-long/2addr v1, v4

    sub-long/2addr v1, v6

    .line 91
    iput-wide v1, p0, Lcom/huawei/agconnect/apms/stu;->bcd:J

    .line 92
    :cond_1
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "until"

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0xc

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v1, v2, v3}, Lcom/huawei/agconnect/apms/x1;->abc(III)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 93
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0xc

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 94
    invoke-static {v0}, Lcom/huawei/agconnect/apms/x1;->bcd(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 95
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    mul-long/2addr v0, v4

    .line 96
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/stu;->cde:J

    :cond_2
    const-string v0, "MemAvailable"

    .line 97
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v1, " "

    const-string v2, ":"

    const/4 v3, 0x0

    const/4 v8, 0x1

    if-eqz v0, :cond_4

    .line 98
    :try_start_1
    invoke-virtual {p1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 99
    array-length v9, v0

    if-le v9, v8, :cond_4

    .line 100
    aget-object v0, v0, v8

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 101
    array-length v9, v0

    if-lez v9, :cond_4

    aget-object v9, v0, v3

    invoke-static {v9}, Lcom/huawei/agconnect/apms/x1;->bcd(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 102
    aget-object v0, v0, v3

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9

    mul-long/2addr v9, v4

    .line 103
    iput-wide v9, p0, Lcom/huawei/agconnect/apms/stu;->def:J

    cmp-long v0, v9, v6

    if-lez v0, :cond_3

    move v0, v3

    goto :goto_0

    :cond_3
    move v0, v8

    .line 104
    :goto_0
    iput-boolean v0, p0, Lcom/huawei/agconnect/apms/stu;->ghi:Z

    :cond_4
    const-string v0, "MemTotal"

    .line 105
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 106
    invoke-virtual {p1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 107
    array-length v6, v0

    if-le v6, v8, :cond_5

    .line 108
    aget-object v0, v0, v8

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 109
    array-length v6, v0

    if-lez v6, :cond_5

    aget-object v6, v0, v3

    invoke-static {v6}, Lcom/huawei/agconnect/apms/x1;->bcd(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 110
    aget-object v0, v0, v3

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    mul-long/2addr v6, v4

    .line 111
    iput-wide v6, p0, Lcom/huawei/agconnect/apms/stu;->efg:J

    :cond_5
    const-string v0, "MemFree"

    .line 112
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 113
    invoke-virtual {p1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 114
    array-length v0, p1

    if-le v0, v8, :cond_6

    .line 115
    aget-object p1, p1, v8

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 116
    array-length v0, p1

    if-lez v0, :cond_6

    aget-object v0, p1, v3

    invoke-static {v0}, Lcom/huawei/agconnect/apms/x1;->bcd(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 117
    aget-object p1, p1, v3

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    mul-long/2addr v0, v4

    .line 118
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/stu;->fgh:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    .line 119
    sget-object p1, Lcom/huawei/agconnect/apms/x1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v0, "setAnrMemoryInfo error :"

    invoke-static {v0}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0, v0, p1}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    :cond_6
    :goto_1
    return-void
.end method

.method public static abc(III)Z
    .locals 0

    if-ltz p0, :cond_0

    if-ge p0, p1, :cond_0

    if-gt p1, p2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static bcd()Ljava/lang/String;
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/Throwable;

    invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x2

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "#"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v0, v0, v2

    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "->"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, ""

    return-object v0
.end method

.method public static bcd(Ljava/lang/String;)Z
    .locals 1

    .line 3
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "[0-9]+"

    invoke-virtual {p0, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static cde(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-nez p0, :cond_0

    const-string p0, "measure name is null"

    return-object p0

    .line 1
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x64

    if-le v0, v1, :cond_1

    .line 3
    sget-object p0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "measure name exceeds %d characters."

    .line 5
    invoke-static {p0, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const-string v0, "^[\\u4e00-\\u9fa5_a-zA-Z0-9]+$"

    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "measure name contains special characters"

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static cde()Z
    .locals 2

    const-string v0, "com.huawei.agconnect.remoteconfig.AGConnectConfig"

    .line 7
    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    .line 8
    :catch_0
    sget-object v0, Lcom/huawei/agconnect/apms/x1;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v1, "cannot found AGConnectConfig class"

    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0
.end method

.method public static def(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "the customTrace name is null, cannot start custom trace. CustomTrace name is invalid."

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x64

    .line 11
    .line 12
    if-le v0, v1, :cond_1

    .line 13
    .line 14
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    new-array v2, v2, [Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v3, 0x0

    .line 24
    aput-object v1, v2, v3

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    aput-object p0, v2, v1

    .line 28
    .line 29
    const-string p0, "customTrace name exceeds %d characters, cannot start custom trace \'%s\'. CustomTrace name is invalid."

    .line 30
    .line 31
    invoke-static {v0, p0, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_1
    const-string v0, "^[\\u4e00-\\u9fa5_a-zA-Z0-9]+$"

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-nez p0, :cond_2

    .line 43
    .line 44
    const-string p0, "customTrace name must not contain special characters."

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_2
    const/4 p0, 0x0

    .line 48
    return-object p0
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
