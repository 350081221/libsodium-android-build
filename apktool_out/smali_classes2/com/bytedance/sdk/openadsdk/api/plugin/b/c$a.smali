.class final Lcom/bytedance/sdk/openadsdk/api/plugin/b/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/api/plugin/b/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Lcom/bytedance/sdk/openadsdk/api/plugin/b/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/plugin/b/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/api/plugin/b/c;-><init>(Lcom/bytedance/sdk/openadsdk/api/plugin/b/c$1;)V

    sput-object v0, Lcom/bytedance/sdk/openadsdk/api/plugin/b/c$a;->a:Lcom/bytedance/sdk/openadsdk/api/plugin/b/c;

    return-void
.end method

.method static synthetic a()Lcom/bytedance/sdk/openadsdk/api/plugin/b/c;
    .locals 1

    sget-object v0, Lcom/bytedance/sdk/openadsdk/api/plugin/b/c$a;->a:Lcom/bytedance/sdk/openadsdk/api/plugin/b/c;

    return-object v0
.end method
