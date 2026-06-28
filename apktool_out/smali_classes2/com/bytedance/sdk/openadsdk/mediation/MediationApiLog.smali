.class public Lcom/bytedance/sdk/openadsdk/mediation/MediationApiLog;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Z = false

.field private static b:Ljava/lang/String; = "MEDIATION_LOG"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Ljava/lang/String;)V
    .locals 1

    .line 3
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/mediation/MediationApiLog;->a:Z

    if-eqz v0, :cond_0

    .line 4
    sget-object v0, Lcom/bytedance/sdk/openadsdk/mediation/MediationApiLog;->b:Ljava/lang/String;

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/mediation/MediationApiLog;->a:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public static i(Ljava/lang/String;)V
    .locals 1

    .line 3
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/mediation/MediationApiLog;->a:Z

    if-eqz v0, :cond_0

    .line 4
    sget-object v0, Lcom/bytedance/sdk/openadsdk/mediation/MediationApiLog;->b:Ljava/lang/String;

    invoke-static {v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/mediation/MediationApiLog;->a:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public static setDebug(Ljava/lang/Boolean;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    sput-boolean p0, Lcom/bytedance/sdk/openadsdk/mediation/MediationApiLog;->a:Z

    return-void
.end method
