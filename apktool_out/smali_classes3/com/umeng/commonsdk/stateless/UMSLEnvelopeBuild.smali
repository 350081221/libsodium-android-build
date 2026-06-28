.class public Lcom/umeng/commonsdk/stateless/UMSLEnvelopeBuild;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "UMSLEnvelopeBuild"

.field private static isEncryptEnabled:Z

.field public static mContext:Landroid/content/Context;

.field public static module:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isReadyBuildNew(Landroid/content/Context;Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;)Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public static setEncryptEnabled(Z)V
    .locals 0

    sput-boolean p0, Lcom/umeng/commonsdk/stateless/UMSLEnvelopeBuild;->isEncryptEnabled:Z

    return-void
.end method


# virtual methods
.method public buildSLBaseHeader(Landroid/content/Context;)Lorg/json/JSONObject;
    .locals 1

    .line 1
    new-instance v0, Lcom/umeng/commonsdk/stateless/UMSLEnvelopeBuild$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/umeng/commonsdk/stateless/UMSLEnvelopeBuild$1;-><init>(Lcom/umeng/commonsdk/stateless/UMSLEnvelopeBuild;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 7
    .line 8
    .line 9
    const-string p1, "UMLog"

    .line 10
    .line 11
    const-string v0, "\u57fa\u7840\u7ec4\u4ef6\u5e939.3.x\u7248\u672c\u4ec5\u652f\u63016.2.0\u53ca\u66f4\u9ad8\u7248\u672c\u63a8\u9001SDK\u30017.1.0\u53ca\u66f4\u9ad8\u7248\u672c\u5206\u4eabSDK\u3002"

    .line 12
    .line 13
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return-object p1
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

.method public buildSLEnvelope(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method
