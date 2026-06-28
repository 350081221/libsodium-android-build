.class public final Lcom/huawei/hms/analytics/framework/c/a/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/nio/charset/Charset;


# instance fields
.field private b:Lcom/huawei/hms/analytics/framework/config/DeviceAttributeCollector;

.field private c:Lcom/huawei/hms/analytics/framework/config/EvtHeaderAttributeCollector;

.field private d:Lcom/huawei/hms/analytics/framework/config/RomAttributeCollector;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/huawei/hms/analytics/framework/c/a/c;->a:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>(Lcom/huawei/hms/analytics/framework/config/DeviceAttributeCollector;Lcom/huawei/hms/analytics/framework/config/EvtHeaderAttributeCollector;Lcom/huawei/hms/analytics/framework/config/RomAttributeCollector;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/c/a/c;->b:Lcom/huawei/hms/analytics/framework/config/DeviceAttributeCollector;

    iput-object p2, p0, Lcom/huawei/hms/analytics/framework/c/a/c;->c:Lcom/huawei/hms/analytics/framework/config/EvtHeaderAttributeCollector;

    iput-object p3, p0, Lcom/huawei/hms/analytics/framework/c/a/c;->d:Lcom/huawei/hms/analytics/framework/config/RomAttributeCollector;

    iput-object p4, p0, Lcom/huawei/hms/analytics/framework/c/a/c;->f:Ljava/lang/String;

    iput-object p5, p0, Lcom/huawei/hms/analytics/framework/c/a/c;->e:Ljava/lang/String;

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/huawei/hms/analytics/framework/b/b;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/c/a/c;->h:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    return-void
.end method

.method private a(Lorg/json/JSONArray;Lcom/huawei/hms/analytics/core/storage/Event;Z)V
    .locals 1

    invoke-virtual {p2}, Lcom/huawei/hms/analytics/core/storage/Event;->getContent()Ljava/lang/String;

    move-result-object v0

    if-nez p3, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/framework/b/b;->a()Lcom/huawei/hms/analytics/framework/b/b;

    move-result-object p3

    iget-object p3, p3, Lcom/huawei/hms/analytics/framework/b/b;->a:Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;

    invoke-static {v0, p3}, Lcom/huawei/hms/analytics/framework/c/b;->a(Ljava/lang/String;Lcom/huawei/hms/analytics/framework/config/IMandatoryParameters;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-virtual {p2, v0}, Lcom/huawei/hms/analytics/core/storage/Event;->setContent(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/huawei/hms/analytics/core/storage/Event;->toJson()Lorg/json/JSONObject;

    move-result-object p3

    if-eqz p3, :cond_1

    invoke-virtual {p1, p3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    return-void

    :cond_1
    iget-object p1, p0, Lcom/huawei/hms/analytics/framework/c/a/c;->g:Ljava/util/List;

    if-nez p1, :cond_2

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/c/a/c;->g:Ljava/util/List;

    :cond_2
    iget-object p1, p0, Lcom/huawei/hms/analytics/framework/c/a/c;->g:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string p1, "UploadEvtBean"

    const-string p2, "custom event is empty,delete this event"

    invoke-static {p1, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Z)Lorg/json/JSONObject;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;Z)",
            "Lorg/json/JSONObject;"
        }
    .end annotation

    const/4 v0, 0x0

    const-string v1, "UploadEvtBean"

    if-eqz p1, :cond_9

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/a/c;->c:Lcom/huawei/hms/analytics/framework/config/EvtHeaderAttributeCollector;

    if-eqz v2, :cond_8

    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/a/c;->b:Lcom/huawei/hms/analytics/framework/config/DeviceAttributeCollector;

    if-eqz v2, :cond_8

    iget-object v2, p0, Lcom/huawei/hms/analytics/framework/c/a/c;->d:Lcom/huawei/hms/analytics/framework/config/RomAttributeCollector;

    if-nez v2, :cond_1

    goto/16 :goto_1

    :cond_1
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    iget-object v3, p0, Lcom/huawei/hms/analytics/framework/c/a/c;->c:Lcom/huawei/hms/analytics/framework/config/EvtHeaderAttributeCollector;

    invoke-interface {v3}, Lcom/huawei/hms/analytics/framework/config/EvtHeaderAttributeCollector;->doCollector()Lorg/json/JSONObject;

    move-result-object v3

    if-nez v3, :cond_2

    const-string p1, "headerJson is null"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_2
    const-string v4, "header"

    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    iget-object v4, p0, Lcom/huawei/hms/analytics/framework/c/a/c;->b:Lcom/huawei/hms/analytics/framework/config/DeviceAttributeCollector;

    invoke-interface {v4}, Lcom/huawei/hms/analytics/framework/config/DeviceAttributeCollector;->doCollector()Lorg/json/JSONObject;

    move-result-object v4

    iget-object v5, p0, Lcom/huawei/hms/analytics/framework/c/a/c;->d:Lcom/huawei/hms/analytics/framework/config/RomAttributeCollector;

    invoke-interface {v5}, Lcom/huawei/hms/analytics/framework/config/RomAttributeCollector;->doCollector()Lorg/json/JSONObject;

    move-result-object v5

    const-string v6, "properties"

    invoke-virtual {v4, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v5, "events_common"

    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/huawei/hms/analytics/core/storage/Event;

    invoke-virtual {v5}, Lcom/huawei/hms/analytics/core/storage/Event;->getEvtId()Ljava/lang/String;

    move-result-object v6

    const-string v7, "$AppPushToken"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    iget-object v6, p0, Lcom/huawei/hms/analytics/framework/c/a/c;->h:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    invoke-interface {v6}, Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;->isDebugModel()Z

    move-result v6

    if-nez v6, :cond_3

    :cond_4
    :try_start_0
    invoke-virtual {v5}, Lcom/huawei/hms/analytics/core/storage/Event;->clone()Lcom/huawei/hms/analytics/core/storage/Event;

    move-result-object v6

    invoke-direct {p0, v4, v6, p2}, Lcom/huawei/hms/analytics/framework/c/a/c;->a(Lorg/json/JSONArray;Lcom/huawei/hms/analytics/core/storage/Event;Z)V
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v6, "CloneNotSupportedException"

    invoke-static {v1, v6}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v4, v5, p2}, Lcom/huawei/hms/analytics/framework/c/a/c;->a(Lorg/json/JSONArray;Lcom/huawei/hms/analytics/core/storage/Event;Z)V

    goto :goto_0

    :cond_5
    iget-object p1, p0, Lcom/huawei/hms/analytics/framework/c/a/c;->g:Ljava/util/List;

    if-eqz p1, :cond_6

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_6

    iget-object p1, p0, Lcom/huawei/hms/analytics/framework/c/a/c;->e:Ljava/lang/String;

    invoke-static {p1}, Lcom/huawei/hms/analytics/framework/a/a;->a(Ljava/lang/String;)Lcom/huawei/hms/analytics/core/storage/IStorageHandler;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object p2, p0, Lcom/huawei/hms/analytics/framework/c/a/c;->g:Ljava/util/List;

    invoke-interface {p1, p2}, Lcom/huawei/hms/analytics/core/storage/IStorageHandler;->deleteEvents(Ljava/util/List;)V

    :cond_6
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result p1

    if-nez p1, :cond_7

    const-string p1, "send data is empty"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_7
    const-string p1, "events"

    invoke-virtual {v3, p1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/huawei/hms/analytics/framework/c/a/c;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/huawei/hms/analytics/framework/g/a;->a([B)[B

    move-result-object p1

    iget-object p2, p0, Lcom/huawei/hms/analytics/framework/c/a/c;->f:Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/huawei/hms/analytics/core/crypto/AesCipher;->encryptCbc([BLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "event"

    invoke-virtual {v2, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v2

    :cond_8
    :goto_1
    const-string p1, "one attributeModel is null"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_9
    :goto_2
    const-string p1, "Not have actionEvent to send"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
