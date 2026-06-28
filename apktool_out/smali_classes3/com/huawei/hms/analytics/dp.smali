.class public final Lcom/huawei/hms/analytics/dp;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final lmn:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    const-string v0, "e2f856b9f9a4fd4cb2795aeaf83268e4bff189aaec05d691ffde76e075b82648"

    const-string v1, "173cf86fe9894a0f70dadd09d4fd88c380836099d4939f8c3754361bdc16a32b"

    const-string v2, "b368b110e3b565fe97c91f786e11bc48754cc8e4e6f21d8a94a68ac6ad67aaaf"

    const-string v3, "db48223fd9e143f7e133c57f5d08a4e38549ce3ebd921fe3b4003c26e5e35bed"

    const-string v4, "4bdecdf772491e35c4e8b48f88aee22bae1311984f2e1da4dfad0b78ee7f5163"

    const-string v5, "3081a0adab3018d57165e6dd24074bdbac640f6dbe21a9e24d3474a87ebf38b8"

    const-string v6, "db53fcdc9ab71e9bdd4eab257fe1aba7989ad2b24fbe3a85dfef72ea1dd6bae2"

    const-string v7, "d80f18e8081b624cc64985f87f70118f1702985d2e10dbc985ee7be334fd3c7d"

    const-string v8, "5fed96c85bd58c58aadbd465c172a4c9a794d8eb2f86cbc7bcee6caf4c7a2c5f"

    const-string v9, "07ff9b7aeeff969173c45b285fe0fecdbaae244576ff7a2796a36f1c0c11adb4"

    const-string v10, "92974c6802419e4d18b5ec536cbfa167b8e8eff09ec4c8510a5b95750b1e0c82"

    const-string v11, "403f14ad2f0e5eb3c4f3a0bcd5c1592cc4492662ad53191c92905255d4990656"

    const-string v12, "4230baa077b401374d0fc012375047e79ea0790d58d095ef18d97d95470c738d"

    const-string v13, "f8d927750a0952ffb5bd87dfb83d781ae65f7bed043a7886d1d3cdcfc94bb77a"

    filled-new-array/range {v0 .. v13}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hms/analytics/dp;->lmn:[Ljava/lang/String;

    return-void
.end method

.method private static klm(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "UriToolsKit"

    if-eqz v0, :cond_0

    const-string v0, "url is null"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0}, Landroid/webkit/URLUtil;->isNetworkUrl(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "http:"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/net/URI;

    invoke-direct {v2, p0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    const-string p0, "url don\'t starts with https"

    invoke-static {v1, p0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string p0, "getHostByURI error : "

    invoke-static {v1, p0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static lmn(Ljava/lang/String;)Z
    .locals 5

    sget-object v0, Lcom/huawei/hms/analytics/dp;->lmn:[Ljava/lang/String;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    invoke-static {p0, v4}, Lcom/huawei/hms/analytics/dp;->lmn(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method private static lmn(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8

    invoke-static {p0}, Lcom/huawei/hms/analytics/dp;->klm(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "."

    const/4 v2, 0x1

    const/4 v3, 0x0

    const-string v4, "UriToolsKit"

    if-nez v0, :cond_4

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "url is null"

    invoke-static {v4, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, p0

    goto :goto_0

    :cond_1
    const-string v0, "\\."

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v5, v0

    const/4 v6, 0x2

    if-ge v5, v6, :cond_2

    const-string v0, ""

    goto :goto_0

    :cond_2
    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    array-length v7, v0

    sub-int/2addr v7, v6

    aget-object v7, v0, v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    array-length v7, v0

    sub-int/2addr v7, v6

    add-int/2addr v7, v2

    aget-object v0, v0, v7

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_3

    const-string v0, "get urlLastNStr is null"

    goto :goto_2

    :cond_3
    move-object v3, v0

    goto :goto_3

    :cond_4
    :goto_1
    const-string v0, "url or allowlistHash is null"

    :goto_2
    invoke-static {v4, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    const/4 v0, 0x0

    if-nez v3, :cond_5

    return v0

    :cond_5
    invoke-static {p0}, Lcom/huawei/hms/analytics/de;->lmn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    return v2

    :cond_6
    invoke-static {v3}, Lcom/huawei/hms/analytics/de;->lmn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr p1, v2

    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_7

    return v0

    :cond_7
    const-string p1, "^[A-Za-z0-9.-]+$"

    invoke-virtual {p0, p1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    const-string p0, "other Exception!"

    :goto_4
    invoke-static {v4, p0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v0

    :catch_1
    const-string p0, "IndexOutOfBounds Exception"

    goto :goto_4

    :cond_8
    return v0
.end method
