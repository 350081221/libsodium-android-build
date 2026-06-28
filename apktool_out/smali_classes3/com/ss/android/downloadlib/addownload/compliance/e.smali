.class public Lcom/ss/android/downloadlib/addownload/compliance/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/downloadlib/addownload/compliance/e$b;,
        Lcom/ss/android/downloadlib/addownload/compliance/e$a;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Lcom/ss/android/downloadlib/addownload/compliance/e$a;

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:I

.field private j:Ljava/lang/String;

.field private k:J

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Lcom/ss/android/downloadlib/addownload/compliance/e$b;

.field private o:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xf

    .line 5
    .line 6
    iput v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->e:I

    .line 7
    .line 8
    return-void
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
.end method

.method private static a(Lorg/json/JSONObject;)Lcom/ss/android/downloadlib/addownload/compliance/e$a;
    .locals 3

    .line 26
    new-instance v0, Lcom/ss/android/downloadlib/addownload/compliance/e$a;

    invoke-direct {v0}, Lcom/ss/android/downloadlib/addownload/compliance/e$a;-><init>()V

    :try_start_0
    const-string v1, "auth_info"

    .line 27
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_1

    const-string v1, "app_name"

    .line 28
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/e$a;->a(Ljava/lang/String;)V

    const-string v1, "version_name"

    .line 29
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/e$a;->b(Ljava/lang/String;)V

    const-string v1, "update_time"

    .line 30
    invoke-static {p0, v1}, Lcom/ss/android/downloadlib/g/m;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/addownload/compliance/e$a;->a(J)V

    const-string v1, "size"

    .line 31
    invoke-static {p0, v1}, Lcom/ss/android/downloadlib/g/m;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/downloadlib/addownload/compliance/e$a;->b(J)V

    const-string v1, "developer_name"

    .line 32
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/e$a;->c(Ljava/lang/String;)V

    const-string v1, "package_name"

    .line 33
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/e$a;->d(Ljava/lang/String;)V

    const-string v1, "permissions"

    .line 34
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 35
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 36
    invoke-static {v1, v2}, Lcom/ss/android/downloadlib/addownload/compliance/e;->a(Lorg/json/JSONArray;Ljava/util/List;)V

    .line 37
    invoke-virtual {v0, v2}, Lcom/ss/android/downloadlib/addownload/compliance/e$a;->a(Ljava/util/List;)V

    :cond_0
    const-string v1, "permission_classify_url"

    .line 38
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/e$a;->e(Ljava/lang/String;)V

    const-string v1, "policy_url"

    .line 39
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/e$a;->f(Ljava/lang/String;)V

    const-string v1, "icon_url"

    .line 40
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/e$a;->g(Ljava/lang/String;)V

    const-string v1, "download_url"

    .line 41
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/e$a;->h(Ljava/lang/String;)V

    const-string v1, "desc_url"

    .line 42
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/e$a;->i(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 43
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object v1

    const-string v2, "ComplianceResult getAuthInfo"

    invoke-virtual {v1, p0, v2}, Lcom/ss/android/downloadlib/e/c;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static a(Lcom/ss/android/downloadlib/addownload/compliance/e;)Ljava/lang/String;
    .locals 4

    .line 8
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "show_auth"

    .line 9
    iget-boolean v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->a:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "download_permit"

    .line 10
    iget v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "appstore_permit"

    .line 11
    iget v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->d:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "market_online_status"

    .line 12
    iget v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "hijack_permit"

    .line 13
    iget v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->f:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "package_name"

    .line 14
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->g:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "hijack_url"

    .line 15
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->h:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "code"

    .line 16
    iget v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->i:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "message"

    .line 17
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->j:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "request_duration"

    .line 18
    iget-wide v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->k:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "auth_info"

    .line 19
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->b:Lcom/ss/android/downloadlib/addownload/compliance/e$a;

    invoke-static {v2}, Lcom/ss/android/downloadlib/addownload/compliance/e;->b(Lcom/ss/android/downloadlib/addownload/compliance/e$a;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "status"

    .line 20
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->n:Lcom/ss/android/downloadlib/addownload/compliance/e$b;

    invoke-static {v2}, Lcom/ss/android/downloadlib/addownload/compliance/e;->b(Lcom/ss/android/downloadlib/addownload/compliance/e$b;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "back_web_url"

    .line 21
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->o:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "hw_app_id"

    .line 22
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->l:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "deep_link"

    .line 23
    iget-object p0, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->m:Ljava/lang/String;

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    .line 24
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object v1

    const-string v2, "ComplianceResult toJson"

    invoke-virtual {v1, p0, v2}, Lcom/ss/android/downloadlib/e/c;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 25
    :goto_1
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static a(Lorg/json/JSONArray;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            "Ljava/util/List<",
            "Lcom/ss/android/downloadlib/addownload/compliance/e$a$a;",
            ">;)V"
        }
    .end annotation

    if-eqz p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 44
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 45
    invoke-virtual {p0, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 46
    new-instance v2, Lcom/ss/android/downloadlib/addownload/compliance/e$a$a;

    invoke-direct {v2}, Lcom/ss/android/downloadlib/addownload/compliance/e$a$a;-><init>()V

    const-string v3, "permission_name"

    .line 47
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ss/android/downloadlib/addownload/compliance/e$a$a;->a(Ljava/lang/String;)V

    const-string v3, "permission_desc"

    .line 48
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/ss/android/downloadlib/addownload/compliance/e$a$a;->b(Ljava/lang/String;)V

    .line 49
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method private static b(Lorg/json/JSONObject;)Lcom/ss/android/downloadlib/addownload/compliance/e$b;
    .locals 3

    const-string v0, "status"

    .line 17
    new-instance v1, Lcom/ss/android/downloadlib/addownload/compliance/e$b;

    invoke-direct {v1}, Lcom/ss/android/downloadlib/addownload/compliance/e$b;-><init>()V

    .line 18
    :try_start_0
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 19
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/ss/android/downloadlib/addownload/compliance/e$b;->a(I)V

    const-string v0, "message"

    .line 20
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/ss/android/downloadlib/addownload/compliance/e$b;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 21
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    move-result-object v0

    const-string v2, "ComplianceResult getStatus"

    invoke-virtual {v0, p0, v2}, Lcom/ss/android/downloadlib/e/c;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-object v1
.end method

.method private static b(Lcom/ss/android/downloadlib/addownload/compliance/e$a;)Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 4
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    if-eqz p0, :cond_0

    const-string v1, "app_name"

    .line 5
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/e$a;->a(Lcom/ss/android/downloadlib/addownload/compliance/e$a;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "version_name"

    .line 6
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/e$a;->b(Lcom/ss/android/downloadlib/addownload/compliance/e$a;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 7
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/e$a;->c(Lcom/ss/android/downloadlib/addownload/compliance/e$a;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "update_time"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 8
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/e$a;->d(Lcom/ss/android/downloadlib/addownload/compliance/e$a;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "size"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "developer_name"

    .line 9
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/e$a;->e(Lcom/ss/android/downloadlib/addownload/compliance/e$a;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "policy_url"

    .line 10
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/e$a;->f(Lcom/ss/android/downloadlib/addownload/compliance/e$a;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "icon_url"

    .line 11
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/e$a;->g(Lcom/ss/android/downloadlib/addownload/compliance/e$a;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "download_url"

    .line 12
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/e$a;->h(Lcom/ss/android/downloadlib/addownload/compliance/e$a;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 13
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/e;->c(Lcom/ss/android/downloadlib/addownload/compliance/e$a;)Lorg/json/JSONArray;

    move-result-object v1

    const-string v2, "permissions"

    .line 14
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "permission_classify_url"

    .line 15
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/e$a;->i(Lcom/ss/android/downloadlib/addownload/compliance/e$a;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "desc_url"

    .line 16
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/e$a;->j(Lcom/ss/android/downloadlib/addownload/compliance/e$a;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    return-object v0
.end method

.method private static b(Lcom/ss/android/downloadlib/addownload/compliance/e$b;)Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 22
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    if-eqz p0, :cond_0

    .line 23
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/e$b;->a(Lcom/ss/android/downloadlib/addownload/compliance/e$b;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "status"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "message"

    .line 24
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/e$b;->b(Lcom/ss/android/downloadlib/addownload/compliance/e$b;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    return-object v0
.end method

.method private static c(Lcom/ss/android/downloadlib/addownload/compliance/e$a;)Lorg/json/JSONArray;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 3
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/e$a;->k(Lcom/ss/android/downloadlib/addownload/compliance/e$a;)Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 5
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 6
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/downloadlib/addownload/compliance/e$a$a;

    .line 7
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "permission_name"

    .line 8
    invoke-static {v1}, Lcom/ss/android/downloadlib/addownload/compliance/e$a$a;->a(Lcom/ss/android/downloadlib/addownload/compliance/e$a$a;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "permission_desc"

    .line 9
    invoke-static {v1}, Lcom/ss/android/downloadlib/addownload/compliance/e$a$a;->b(Lcom/ss/android/downloadlib/addownload/compliance/e$a$a;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 10
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static g(Ljava/lang/String;)Lcom/ss/android/downloadlib/addownload/compliance/e;
    .locals 4

    .line 1
    new-instance v0, Lcom/ss/android/downloadlib/addownload/compliance/e;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/ss/android/downloadlib/addownload/compliance/e;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Lcom/ss/android/downloadlib/addownload/compliance/e;->a(Lorg/json/JSONObject;)Lcom/ss/android/downloadlib/addownload/compliance/e$a;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {v1}, Lcom/ss/android/downloadlib/addownload/compliance/e;->b(Lorg/json/JSONObject;)Lcom/ss/android/downloadlib/addownload/compliance/e$b;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/e;->a(Lcom/ss/android/downloadlib/addownload/compliance/e$a;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Lcom/ss/android/downloadlib/addownload/compliance/e;->a(Lcom/ss/android/downloadlib/addownload/compliance/e$b;)V

    .line 23
    .line 24
    .line 25
    const-string p0, "show_auth"

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-virtual {v1, p0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    const/4 v3, 0x1

    .line 33
    if-ne p0, v3, :cond_0

    .line 34
    .line 35
    move v2, v3

    .line 36
    :cond_0
    invoke-virtual {v0, v2}, Lcom/ss/android/downloadlib/addownload/compliance/e;->a(Z)V

    .line 37
    .line 38
    .line 39
    const-string p0, "download_permit"

    .line 40
    .line 41
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/e;->a(I)V

    .line 46
    .line 47
    .line 48
    const-string p0, "appstore_permit"

    .line 49
    .line 50
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/e;->b(I)V

    .line 55
    .line 56
    .line 57
    const-string p0, "market_online_status"

    .line 58
    .line 59
    const/16 v2, 0xf

    .line 60
    .line 61
    invoke-virtual {v1, p0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/e;->c(I)V

    .line 66
    .line 67
    .line 68
    const-string p0, "hijack_permit"

    .line 69
    .line 70
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/e;->d(I)V

    .line 75
    .line 76
    .line 77
    const-string p0, "package_name"

    .line 78
    .line 79
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/e;->a(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const-string p0, "hijack_url"

    .line 87
    .line 88
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/e;->b(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    const-string p0, "code"

    .line 96
    .line 97
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/e;->e(I)V

    .line 102
    .line 103
    .line 104
    const-string p0, "message"

    .line 105
    .line 106
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/e;->c(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const-string p0, "request_duration"

    .line 114
    .line 115
    const-wide/16 v2, 0x0

    .line 116
    .line 117
    invoke-virtual {v1, p0, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 118
    .line 119
    .line 120
    move-result-wide v2

    .line 121
    invoke-virtual {v0, v2, v3}, Lcom/ss/android/downloadlib/addownload/compliance/e;->a(J)V

    .line 122
    .line 123
    .line 124
    const-string p0, "back_web_url"

    .line 125
    .line 126
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/e;->d(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    const-string p0, "hw_app_id"

    .line 134
    .line 135
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/e;->e(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    const-string p0, "deep_link"

    .line 143
    .line 144
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-virtual {v0, p0}, Lcom/ss/android/downloadlib/addownload/compliance/e;->f(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 149
    .line 150
    .line 151
    goto :goto_0

    .line 152
    :catch_0
    move-exception p0

    .line 153
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    const-string v2, "ComplianceResult fromJson"

    .line 158
    .line 159
    invoke-virtual {v1, p0, v2}, Lcom/ss/android/downloadlib/e/c;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    :goto_0
    return-object v0
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
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
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
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 5
    iget v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->i:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 3
    iput p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->c:I

    return-void
.end method

.method public a(J)V
    .locals 0

    .line 6
    iput-wide p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->k:J

    return-void
.end method

.method public a(Lcom/ss/android/downloadlib/addownload/compliance/e$a;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->b:Lcom/ss/android/downloadlib/addownload/compliance/e$a;

    return-void
.end method

.method public a(Lcom/ss/android/downloadlib/addownload/compliance/e$b;)V
    .locals 0

    .line 7
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->n:Lcom/ss/android/downloadlib/addownload/compliance/e$b;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->g:Ljava/lang/String;

    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->a:Z

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->m:Ljava/lang/String;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->d:I

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->h:Ljava/lang/String;

    return-void
.end method

.method public c(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->e:I

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->j:Ljava/lang/String;

    return-void
.end method

.method public d(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->f:I

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->o:Ljava/lang/String;

    return-void
.end method

.method public e(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->i:I

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->l:Ljava/lang/String;

    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/e;->m:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/ss/android/downloadlib/addownload/compliance/e;->a(Lcom/ss/android/downloadlib/addownload/compliance/e;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
